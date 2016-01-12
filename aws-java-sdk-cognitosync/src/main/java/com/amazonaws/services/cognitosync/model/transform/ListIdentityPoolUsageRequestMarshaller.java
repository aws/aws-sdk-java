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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ListIdentityPoolUsageRequest Marshaller
 */
public class ListIdentityPoolUsageRequestMarshaller
        implements
        Marshaller<Request<ListIdentityPoolUsageRequest>, ListIdentityPoolUsageRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "application/x-amz-json-1.1";

    public Request<ListIdentityPoolUsageRequest> marshall(
            ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) {

        if (listIdentityPoolUsageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListIdentityPoolUsageRequest> request = new DefaultRequest<ListIdentityPoolUsageRequest>(
                listIdentityPoolUsageRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/identitypools";

        request.setResourcePath(uriResourcePath);

        String nextToken = (listIdentityPoolUsageRequest.getNextToken() == null) ? null
                : StringUtils.fromString(listIdentityPoolUsageRequest
                        .getNextToken());
        if (nextToken != null) {
            request.addParameter("nextToken", nextToken);
        }

        String maxResults = (listIdentityPoolUsageRequest.getMaxResults() == null) ? null
                : StringUtils.fromInteger(listIdentityPoolUsageRequest
                        .getMaxResults());
        if (maxResults != null) {
            request.addParameter("maxResults", maxResults);
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }

        return request;
    }

}
