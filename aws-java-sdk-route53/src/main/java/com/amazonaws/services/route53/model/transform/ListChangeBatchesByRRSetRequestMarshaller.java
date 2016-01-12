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
 * ListChangeBatchesByRRSetRequest Marshaller
 */

public class ListChangeBatchesByRRSetRequestMarshaller
        implements
        Marshaller<Request<ListChangeBatchesByRRSetRequest>, ListChangeBatchesByRRSetRequest> {

    public Request<ListChangeBatchesByRRSetRequest> marshall(
            ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest) {

        if (listChangeBatchesByRRSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListChangeBatchesByRRSetRequest> request = new DefaultRequest<ListChangeBatchesByRRSetRequest>(
                listChangeBatchesByRRSetRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/hostedzone/{Id}/rrsChanges";

        uriResourcePath = uriResourcePath
                .replace(
                        "{Id}",
                        (listChangeBatchesByRRSetRequest.getHostedZoneId() == null) ? ""
                                : StringUtils
                                        .fromString(listChangeBatchesByRRSetRequest
                                                .getHostedZoneId()));
        request.setResourcePath(uriResourcePath);

        String name = (listChangeBatchesByRRSetRequest.getName() == null) ? null
                : StringUtils.fromString(listChangeBatchesByRRSetRequest
                        .getName());
        if (name != null) {
            request.addParameter("rrSet_name", name);
        }

        String type = (listChangeBatchesByRRSetRequest.getType() == null) ? null
                : StringUtils.fromString(listChangeBatchesByRRSetRequest
                        .getType());
        if (type != null) {
            request.addParameter("type", type);
        }

        String setIdentifier = (listChangeBatchesByRRSetRequest
                .getSetIdentifier() == null) ? null : StringUtils
                .fromString(listChangeBatchesByRRSetRequest.getSetIdentifier());
        if (setIdentifier != null) {
            request.addParameter("identifier", setIdentifier);
        }

        String startDate = (listChangeBatchesByRRSetRequest.getStartDate() == null) ? null
                : StringUtils.fromString(listChangeBatchesByRRSetRequest
                        .getStartDate());
        if (startDate != null) {
            request.addParameter("startDate", startDate);
        }

        String endDate = (listChangeBatchesByRRSetRequest.getEndDate() == null) ? null
                : StringUtils.fromString(listChangeBatchesByRRSetRequest
                        .getEndDate());
        if (endDate != null) {
            request.addParameter("endDate", endDate);
        }

        String maxItems = (listChangeBatchesByRRSetRequest.getMaxItems() == null) ? null
                : StringUtils.fromString(listChangeBatchesByRRSetRequest
                        .getMaxItems());
        if (maxItems != null) {
            request.addParameter("maxItems", maxItems);
        }

        String marker = (listChangeBatchesByRRSetRequest.getMarker() == null) ? null
                : StringUtils.fromString(listChangeBatchesByRRSetRequest
                        .getMarker());
        if (marker != null) {
            request.addParameter("marker", marker);
        }

        return request;
    }

}
