/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * FlushStageCacheRequest Marshaller
 */
public class FlushStageCacheRequestMarshaller implements Marshaller<Request<FlushStageCacheRequest>, FlushStageCacheRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public FlushStageCacheRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<FlushStageCacheRequest> marshall(FlushStageCacheRequest flushStageCacheRequest) {

        if (flushStageCacheRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<FlushStageCacheRequest> request = new DefaultRequest<FlushStageCacheRequest>(flushStageCacheRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/restapis/{restapi_id}/stages/{stage_name}/cache/data";

        uriResourcePath = uriResourcePath.replace("{restapi_id}",
                (flushStageCacheRequest.getRestApiId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(flushStageCacheRequest.getRestApiId()), false)
                        : "");
        uriResourcePath = uriResourcePath.replace("{stage_name}",
                (flushStageCacheRequest.getStageName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(flushStageCacheRequest.getStageName()), false)
                        : "");
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
