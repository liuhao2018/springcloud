package com.liuhao.springcloud.netflix.zuul.gateway.fallback;

import com.google.gson.Gson;
import com.liuhao.springcloud.netflix.zuul.gateway.model.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class FallbackProvider implements org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider {

    @Autowired
    public Gson gson;

    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "success";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                ApiResponse apiResponse = new ApiResponse(1002,"业务模块暂不可用");
                return new ByteArrayInputStream(gson.toJson(apiResponse).getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.set("Content-Type","application/json;charset=utf-8");
                return httpHeaders;
            }
        };
    }
}
