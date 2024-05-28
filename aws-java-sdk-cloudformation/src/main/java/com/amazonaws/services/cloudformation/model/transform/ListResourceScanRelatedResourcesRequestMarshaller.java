/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListResourceScanRelatedResourcesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceScanRelatedResourcesRequestMarshaller implements
        Marshaller<Request<ListResourceScanRelatedResourcesRequest>, ListResourceScanRelatedResourcesRequest> {

    public Request<ListResourceScanRelatedResourcesRequest> marshall(ListResourceScanRelatedResourcesRequest listResourceScanRelatedResourcesRequest) {

        if (listResourceScanRelatedResourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListResourceScanRelatedResourcesRequest> request = new DefaultRequest<ListResourceScanRelatedResourcesRequest>(
                listResourceScanRelatedResourcesRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListResourceScanRelatedResources");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listResourceScanRelatedResourcesRequest.getResourceScanId() != null) {
            request.addParameter("ResourceScanId", StringUtils.fromString(listResourceScanRelatedResourcesRequest.getResourceScanId()));
        }

        if (listResourceScanRelatedResourcesRequest.getResources().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier>) listResourceScanRelatedResourcesRequest.getResources())
                        .isAutoConstruct()) {
            request.addParameter("Resources", "");
        }
        if (!listResourceScanRelatedResourcesRequest.getResources().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier>) listResourceScanRelatedResourcesRequest.getResources())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier> resourcesList = (com.amazonaws.internal.SdkInternalList<ScannedResourceIdentifier>) listResourceScanRelatedResourcesRequest
                    .getResources();
            int resourcesListIndex = 1;

            for (ScannedResourceIdentifier resourcesListValue : resourcesList) {
                if (resourcesListValue != null) {

                    if (resourcesListValue.getResourceType() != null) {
                        request.addParameter("Resources.member." + resourcesListIndex + ".ResourceType",
                                StringUtils.fromString(resourcesListValue.getResourceType()));
                    }

                    java.util.Map<String, String> resourceIdentifier = resourcesListValue.getResourceIdentifier();
                    if (resourceIdentifier != null) {
                        int resourceIdentifierListIndex = 1;
                        for (Map.Entry<String, String> entry : resourceIdentifier.entrySet()) {
                            if (entry != null && entry.getKey() != null) {
                                request.addParameter("Resources.member." + resourcesListIndex + ".ResourceIdentifier.entry." + resourceIdentifierListIndex
                                        + ".key", StringUtils.fromString(entry.getKey()));
                            }
                            if (entry != null && entry.getValue() != null) {
                                request.addParameter("Resources.member." + resourcesListIndex + ".ResourceIdentifier.entry." + resourceIdentifierListIndex
                                        + ".value", StringUtils.fromString(entry.getValue()));
                            }
                            resourceIdentifierListIndex++;
                        }
                    }

                }
                resourcesListIndex++;
            }
        }

        if (listResourceScanRelatedResourcesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listResourceScanRelatedResourcesRequest.getNextToken()));
        }

        if (listResourceScanRelatedResourcesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listResourceScanRelatedResourcesRequest.getMaxResults()));
        }

        return request;
    }

}
