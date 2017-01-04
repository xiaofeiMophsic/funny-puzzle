package com.mophsic.loop;

import org.junit.Test;

import java.io.File;
import java.util.Stack;

/**
 * 使用栈的方式删除文件
 * @author xiaofei
 * @date 2017/1/4
 */
public class DeleteFile {

    private void deleteWithStack(String path) {
        if (null == path || path.isEmpty())
            throw new IllegalArgumentException();

        File dir = new File(path);
        if (!dir.exists()) {
            return ;
        }

        if (dir.isDirectory()) {
            Stack<File> fileStack = new Stack<>();
            fileStack.push(dir);
            File subFile ;
            while (!fileStack.isEmpty() && (subFile = fileStack.pop()) != null && subFile.exists()) {
                if (subFile.isDirectory()) {
                    File[] f = subFile.listFiles();

                    if (f == null || f.length == 0) {
                        System.out.println("正在删除文件夹->" + subFile.getName());
                        subFile.delete();
                        continue;
                    }
                    fileStack.push(subFile); // 把空文件夹压入栈中
                    for (File ff : f){
                        if (ff.isFile()) {
                            System.out.println("正在删除文件->" + ff.getName());
                            ff.delete();
                        } else if (ff.isDirectory()) {
                            fileStack.push(ff);
                        }
                    }

                }
            }
        } else if (dir.isFile()){
            dir.delete();
        }
    }

    @Test
    public void test(){
        String path = "D:/test";
        deleteWithStack(path);
    }
}
