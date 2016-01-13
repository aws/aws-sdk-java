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

package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * ListChangeBatchesByHostedZoneRequest Marshaller
 */

public class ListChangeBatchesByHostedZoneRequestMarshaller
        implements
        Marshaller<Request<ListChangeBatchesByHostedZoneRequest>, ListChangeBatchesByHostedZoneRequest> {

    public Request<ListChangeBatchesByHostedZoneRequest> marshall(
            ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest) {

        if (listChangeBatchesByHostedZoneRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListChangeBatchesByHostedZoneRequest> request = new DefaultRequest<ListChangeBatchesByHostedZoneRequest>(
                listChangeBatchesByHostedZoneRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/hostedzone/{Id}/changes";

        uriResourcePath = uriResourcePath
                .replace(
                        "{Id}",
                        (listChangeBatchesByHostedZoneRequest.getHostedZoneId() == null) ? ""
                                : StringUtils
                                        .fromString(listChangeBatchesByHostedZoneRequest
                                                .getHostedZoneId()));
        request.setResourcePath(uriResourcePath);

        String startDate = (listChangeBatchesByHostedZoneRequest.getStartDate() == null) ? null
                : StringUtils.fromString(listChangeBatchesByHostedZoneRequest
                        .getStartDate());
        if (startDate != null) {
            request.addParameter("startDate", startDate);
        }

        String endDate = (listChangeBatchesByHostedZoneRequest.getEndDate() == null) ? null
                : StringUtils.fromString(listChangeBatchesByHostedZoneRequest
                        .getEndDate());
        if (endDate != null) {
            request.addParameter("endDate", endDate);
        }

        String maxItems = (listChangeBatchesByHostedZoneRequest.getMaxItems() == null) ? null
                : StringUtils.fromString(listChangeBatchesByHostedZoneRequest
                        .getMaxItems());
        if (maxItems != null) {
            request.addParameter("maxItems", maxItems);
        }

        String marker = (listChangeBatchesByHostedZoneRequest.getMarker() == null) ? null
                : StringUtils.fromString(listChangeBatchesByHostedZoneRequest
                        .getMarker());
        if (marker != null) {
            request.addParameter("marker", marker);
        }

        return request;
    }

}
