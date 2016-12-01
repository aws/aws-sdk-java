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
 * GetCampaignActivitiesRequest Marshaller
 */
public class GetCampaignActivitiesRequestMarshaller implements Marshaller<Request<GetCampaignActivitiesRequest>, GetCampaignActivitiesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetCampaignActivitiesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetCampaignActivitiesRequest> marshall(GetCampaignActivitiesRequest getCampaignActivitiesRequest) {

        if (getCampaignActivitiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetCampaignActivitiesRequest> request = new DefaultRequest<GetCampaignActivitiesRequest>(getCampaignActivitiesRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/campaigns/{campaign-id}/activities";

        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (getCampaignActivitiesRequest.getApplicationId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(getCampaignActivitiesRequest.getApplicationId()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{campaign-id}",
                (getCampaignActivitiesRequest.getCampaignId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(getCampaignActivitiesRequest.getCampaignId()), false) : "");
        request.setResourcePath(uriResourcePath);

        if (getCampaignActivitiesRequest.getPageSize() != null) {
            request.addParameter("page-size", StringUtils.fromString(getCampaignActivitiesRequest.getPageSize()));
        }

        if (getCampaignActivitiesRequest.getToken() != null) {
            request.addParameter("token", StringUtils.fromString(getCampaignActivitiesRequest.getToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
