package com.ssafy.s10p31s102be.project.exception;

import com.ssafy.s10p31s102be.common.exception.CustomException;
import org.springframework.http.HttpStatus;

public class ProjectMemberNotFoundException extends CustomException {
    public ProjectMemberNotFoundException(Integer id, Object clazz) {
        super("해당 ID에 해당하는 프로젝트-멤버 매핑을 찾을 수 없습니다." + " ID : " + id, HttpStatus.NOT_FOUND, clazz);
    }
}
