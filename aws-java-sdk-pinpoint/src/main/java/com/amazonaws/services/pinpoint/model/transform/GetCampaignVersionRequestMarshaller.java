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
package com.amazonaws.services.pinpoint.model.transform;

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
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetCampaignVersionRequest Marshaller
 */
public class GetCampaignVersionRequestMarshaller implements Marshaller<Request<GetCampaignVersionRequest>, GetCampaignVersionRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetCampaignVersionRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetCampaignVersionRequest> marshall(GetCampaignVersionRequest getCampaignVersionRequest) {

        if (getCampaignVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetCampaignVersionRequest> request = new DefaultRequest<GetCampaignVersionRequest>(getCampaignVersionRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/campaigns/{campaign-id}/versions/{version}";

        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (getCampaignVersionRequest.getApplicationId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(getCampaignVersionRequest.getApplicationId()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{campaign-id}",
                (getCampaignVersionRequest.getCampaignId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(getCampaignVersionRequest.getCampaignId()),
                        false) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{version}",
                        (getCampaignVersionRequest.getVersion() != null) ? SdkHttpUtils.urlEncode(
                                StringUtils.fromString(getCampaignVersionRequest.getVersion()), false) : "");
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
