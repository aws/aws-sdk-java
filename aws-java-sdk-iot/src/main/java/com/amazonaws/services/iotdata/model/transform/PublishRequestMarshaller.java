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
package com.amazonaws.services.iotdata.model.transform;

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
import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * PublishRequest Marshaller
 */
public class PublishRequestMarshaller implements Marshaller<Request<PublishRequest>, PublishRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public PublishRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PublishRequest> marshall(PublishRequest publishRequest) {

        if (publishRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PublishRequest> request = new DefaultRequest<PublishRequest>(publishRequest, "AWSIotData");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/topics/{topic}";

        uriResourcePath = uriResourcePath.replace("{topic}",
                (publishRequest.getTopic() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(publishRequest.getTopic()), false) : "");
        request.setResourcePath(uriResourcePath);

        if (publishRequest.getQos() != null) {
            request.addParameter("qos", StringUtils.fromInteger(publishRequest.getQos()));
        }

        request.setContent(BinaryUtils.toStream(publishRequest.getPayload()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
