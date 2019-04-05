/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * ListResourceRecordSetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceRecordSetsRequestMarshaller implements Marshaller<Request<ListResourceRecordSetsRequest>, ListResourceRecordSetsRequest> {

    public Request<ListResourceRecordSetsRequest> marshall(ListResourceRecordSetsRequest listResourceRecordSetsRequest) {

        if (listResourceRecordSetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListResourceRecordSetsRequest> request = new DefaultRequest<ListResourceRecordSetsRequest>(listResourceRecordSetsRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/hostedzone/{Id}/rrset";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", listResourceRecordSetsRequest.getHostedZoneId());
        request.setResourcePath(uriResourcePath);

        if (listResourceRecordSetsRequest.getStartRecordName() != null) {
            request.addParameter("name", StringUtils.fromString(listResourceRecordSetsRequest.getStartRecordName()));
        }

        if (listResourceRecordSetsRequest.getStartRecordType() != null) {
            request.addParameter("type", StringUtils.fromString(listResourceRecordSetsRequest.getStartRecordType()));
        }

        if (listResourceRecordSetsRequest.getStartRecordIdentifier() != null) {
            request.addParameter("identifier", StringUtils.fromString(listResourceRecordSetsRequest.getStartRecordIdentifier()));
        }

        if (listResourceRecordSetsRequest.getMaxItems() != null) {
            request.addParameter("maxitems", StringUtils.fromString(listResourceRecordSetsRequest.getMaxItems()));
        }

        return request;
    }

}
