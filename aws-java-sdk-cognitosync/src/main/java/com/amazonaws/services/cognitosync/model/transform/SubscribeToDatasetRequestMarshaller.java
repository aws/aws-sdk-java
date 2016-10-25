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
package com.amazonaws.services.cognitosync.model.transform;

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
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * SubscribeToDatasetRequest Marshaller
 */
public class SubscribeToDatasetRequestMarshaller implements Marshaller<Request<SubscribeToDatasetRequest>, SubscribeToDatasetRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SubscribeToDatasetRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SubscribeToDatasetRequest> marshall(SubscribeToDatasetRequest subscribeToDatasetRequest) {

        if (subscribeToDatasetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SubscribeToDatasetRequest> request = new DefaultRequest<SubscribeToDatasetRequest>(subscribeToDatasetRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/subscriptions/{DeviceId}";

        uriResourcePath = uriResourcePath.replace(
                "{IdentityPoolId}",
                (subscribeToDatasetRequest.getIdentityPoolId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(subscribeToDatasetRequest.getIdentityPoolId()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{IdentityId}",
                (subscribeToDatasetRequest.getIdentityId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(subscribeToDatasetRequest.getIdentityId()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{DatasetName}",
                (subscribeToDatasetRequest.getDatasetName() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(subscribeToDatasetRequest.getDatasetName()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{DeviceId}",
                (subscribeToDatasetRequest.getDeviceId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(subscribeToDatasetRequest.getDeviceId()),
                        false) : "");
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
