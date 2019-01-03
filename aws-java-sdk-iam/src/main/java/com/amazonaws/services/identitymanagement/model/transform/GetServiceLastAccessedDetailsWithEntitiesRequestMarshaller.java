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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetServiceLastAccessedDetailsWithEntitiesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceLastAccessedDetailsWithEntitiesRequestMarshaller implements
        Marshaller<Request<GetServiceLastAccessedDetailsWithEntitiesRequest>, GetServiceLastAccessedDetailsWithEntitiesRequest> {

    public Request<GetServiceLastAccessedDetailsWithEntitiesRequest> marshall(
            GetServiceLastAccessedDetailsWithEntitiesRequest getServiceLastAccessedDetailsWithEntitiesRequest) {

        if (getServiceLastAccessedDetailsWithEntitiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetServiceLastAccessedDetailsWithEntitiesRequest> request = new DefaultRequest<GetServiceLastAccessedDetailsWithEntitiesRequest>(
                getServiceLastAccessedDetailsWithEntitiesRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "GetServiceLastAccessedDetailsWithEntities");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (getServiceLastAccessedDetailsWithEntitiesRequest.getJobId() != null) {
            request.addParameter("JobId", StringUtils.fromString(getServiceLastAccessedDetailsWithEntitiesRequest.getJobId()));
        }

        if (getServiceLastAccessedDetailsWithEntitiesRequest.getServiceNamespace() != null) {
            request.addParameter("ServiceNamespace", StringUtils.fromString(getServiceLastAccessedDetailsWithEntitiesRequest.getServiceNamespace()));
        }

        if (getServiceLastAccessedDetailsWithEntitiesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(getServiceLastAccessedDetailsWithEntitiesRequest.getMaxItems()));
        }

        if (getServiceLastAccessedDetailsWithEntitiesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(getServiceLastAccessedDetailsWithEntitiesRequest.getMarker()));
        }

        return request;
    }

}
