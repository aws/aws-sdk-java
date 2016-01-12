/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * GetDeploymentsRequest Marshaller
 */
public class GetDeploymentsRequestMarshaller implements
        Marshaller<Request<GetDeploymentsRequest>, GetDeploymentsRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<GetDeploymentsRequest> marshall(
            GetDeploymentsRequest getDeploymentsRequest) {

        if (getDeploymentsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GetDeploymentsRequest> request = new DefaultRequest<GetDeploymentsRequest>(
                getDeploymentsRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restapis/{restapi_id}/deployments";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (getDeploymentsRequest.getRestApiId() == null) ? ""
                        : StringUtils.fromString(getDeploymentsRequest
                                .getRestApiId()));
        request.setResourcePath(uriResourcePath);

        String position = (getDeploymentsRequest.getPosition() == null) ? null
                : StringUtils.fromString(getDeploymentsRequest.getPosition());
        if (position != null) {
            request.addParameter("position", position);
        }

        String limit = (getDeploymentsRequest.getLimit() == null) ? null
                : StringUtils.fromInteger(getDeploymentsRequest.getLimit());
        if (limit != null) {
            request.addParameter("limit", limit);
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }

        return request;
    }

}
