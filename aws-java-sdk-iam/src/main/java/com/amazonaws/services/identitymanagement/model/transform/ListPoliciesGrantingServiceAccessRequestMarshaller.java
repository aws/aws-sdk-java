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
 * ListPoliciesGrantingServiceAccessRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesGrantingServiceAccessRequestMarshaller implements
        Marshaller<Request<ListPoliciesGrantingServiceAccessRequest>, ListPoliciesGrantingServiceAccessRequest> {

    public Request<ListPoliciesGrantingServiceAccessRequest> marshall(ListPoliciesGrantingServiceAccessRequest listPoliciesGrantingServiceAccessRequest) {

        if (listPoliciesGrantingServiceAccessRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPoliciesGrantingServiceAccessRequest> request = new DefaultRequest<ListPoliciesGrantingServiceAccessRequest>(
                listPoliciesGrantingServiceAccessRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListPoliciesGrantingServiceAccess");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (listPoliciesGrantingServiceAccessRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listPoliciesGrantingServiceAccessRequest.getMarker()));
        }

        if (listPoliciesGrantingServiceAccessRequest.getArn() != null) {
            request.addParameter("Arn", StringUtils.fromString(listPoliciesGrantingServiceAccessRequest.getArn()));
        }

        if (!listPoliciesGrantingServiceAccessRequest.getServiceNamespaces().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) listPoliciesGrantingServiceAccessRequest.getServiceNamespaces()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> serviceNamespacesList = (com.amazonaws.internal.SdkInternalList<String>) listPoliciesGrantingServiceAccessRequest
                    .getServiceNamespaces();
            int serviceNamespacesListIndex = 1;

            for (String serviceNamespacesListValue : serviceNamespacesList) {
                if (serviceNamespacesListValue != null) {
                    request.addParameter("ServiceNamespaces.member." + serviceNamespacesListIndex, StringUtils.fromString(serviceNamespacesListValue));
                }
                serviceNamespacesListIndex++;
            }
        }

        return request;
    }

}
