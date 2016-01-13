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

package com.amazonaws.services.elastictranscoder.model.transform;

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
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ListJobsByStatusRequest Marshaller
 */
public class ListJobsByStatusRequestMarshaller implements
        Marshaller<Request<ListJobsByStatusRequest>, ListJobsByStatusRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<ListJobsByStatusRequest> marshall(
            ListJobsByStatusRequest listJobsByStatusRequest) {

        if (listJobsByStatusRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListJobsByStatusRequest> request = new DefaultRequest<ListJobsByStatusRequest>(
                listJobsByStatusRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2012-09-25/jobsByStatus/{Status}";

        uriResourcePath = uriResourcePath.replace(
                "{Status}",
                (listJobsByStatusRequest.getStatus() == null) ? ""
                        : StringUtils.fromString(listJobsByStatusRequest
                                .getStatus()));
        request.setResourcePath(uriResourcePath);

        String ascending = (listJobsByStatusRequest.getAscending() == null) ? null
                : StringUtils
                        .fromString(listJobsByStatusRequest.getAscending());
        if (ascending != null) {
            request.addParameter("Ascending", ascending);
        }

        String pageToken = (listJobsByStatusRequest.getPageToken() == null) ? null
                : StringUtils
                        .fromString(listJobsByStatusRequest.getPageToken());
        if (pageToken != null) {
            request.addParameter("PageToken", pageToken);
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }

        return request;
    }

}
