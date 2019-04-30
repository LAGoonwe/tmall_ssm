package com.lagoon.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author WinkiLee
 * @Date 2019/4/23 16:00
 * @Description 用于接受上传文件的注入
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
