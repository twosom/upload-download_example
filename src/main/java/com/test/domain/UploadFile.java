package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UploadFile {

    /**
     * 원본 파일 이름
     */
    private String uploadFileName;
    /**
     * Storage에 저장할 랜덤한 파일 이름
     */
    private String storeFileName;
}
