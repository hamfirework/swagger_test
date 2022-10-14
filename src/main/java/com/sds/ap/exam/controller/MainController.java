package com.sds.ap.exam.controller;

import com.sds.ap.exam.dto.TestRequest;
import com.sds.ap.exam.dto.TestResponse;
import com.sds.ap.exam.service.MainService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @Operation(summary = "테스트 조회 요청", description = "테스트 API를 조회 합니다.", tags={"Test Controller"})
    @GetMapping("/v1/test")
    public ResponseEntity<Object> test(){
        return ResponseEntity.ok().body("{result : \"success\"}");
    }

    @Operation(summary = "테스트 데이터 변경 요청", description = "전송된 데이터를 변경합니다", tags = {"Test Controller"})
    @PostMapping("/v1/test")
    public ResponseEntity<TestResponse> testChange(TestRequest request){
        TestResponse response = mainService.change(request);
        return ResponseEntity.ok().body(response);
    }
}


