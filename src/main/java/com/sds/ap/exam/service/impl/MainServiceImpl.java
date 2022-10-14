package com.sds.ap.exam.service.impl;

import com.sds.ap.exam.dto.TestRequest;
import com.sds.ap.exam.dto.TestResponse;
import com.sds.ap.exam.service.MainService;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

    @Override
    public TestResponse change(TestRequest request) {

        StringBuffer sb = new StringBuffer(request.getText());

        return new TestResponse(true, sb.toString(), sb.reverse().toString());
    }
}
