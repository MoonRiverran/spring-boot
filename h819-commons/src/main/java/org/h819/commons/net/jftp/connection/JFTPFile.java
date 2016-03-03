package org.h819.commons.net.jftp.connection;

import org.joda.time.DateTime;

/**
 * 奇葩的是，org.apache.commons.net.ftp.FTPFile 没有绝对路径属性，而 ftp 操作都是根据绝对路径属性进行的，造成很大不便
 * 这里重新定义一个 JFTPFile 类，增加绝对路径属性，便于操作。
 */
public class JFTPFile {

    private String name;
    private long size;
    private String absolutePath;
    private DateTime lastModified;
    private boolean directory;

    public JFTPFile(String name, long size, String absolutePath, long mTime, boolean isDirectory) {

        this.name = name;
        this.size = size;
        this.absolutePath = absolutePath;
        this.lastModified = new DateTime(mTime);
        this.directory = isDirectory;
        //
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public DateTime getLastModified() {
        return lastModified;
    }

    public boolean isDirectory() {
        return directory;
    }
}
