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
package com.amazonaws.services.lambda.model.transform;

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
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListVersionsByFunctionRequest Marshaller
 */
public class ListVersionsByFunctionRequestMarshaller implements Marshaller<Request<ListVersionsByFunctionRequest>, ListVersionsByFunctionRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListVersionsByFunctionRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListVersionsByFunctionRequest> marshall(ListVersionsByFunctionRequest listVersionsByFunctionRequest) {

        if (listVersionsByFunctionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListVersionsByFunctionRequest> request = new DefaultRequest<ListVersionsByFunctionRequest>(listVersionsByFunctionRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2015-03-31/functions/{FunctionName}/versions";

        uriResourcePath = uriResourcePath.replace(
                "{FunctionName}",
                (listVersionsByFunctionRequest.getFunctionName() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(listVersionsByFunctionRequest.getFunctionName()), false) : "");
        request.setResourcePath(uriResourcePath);

        if (listVersionsByFunctionRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listVersionsByFunctionRequest.getMarker()));
        }

        if (listVersionsByFunctionRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listVersionsByFunctionRequest.getMaxItems()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
