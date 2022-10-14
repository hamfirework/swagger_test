package com.sds.ap.exam.service;

import com.sds.ap.exam.dto.TestRequest;
import com.sds.ap.exam.dto.TestResponse;

public interface MainService {
    TestResponse change(TestRequest request);
}
