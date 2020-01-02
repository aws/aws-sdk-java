/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyTrafficMirrorFilterNetworkServicesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrafficMirrorFilterNetworkServicesRequestMarshaller implements
        Marshaller<Request<ModifyTrafficMirrorFilterNetworkServicesRequest>, ModifyTrafficMirrorFilterNetworkServicesRequest> {

    public Request<ModifyTrafficMirrorFilterNetworkServicesRequest> marshall(
            ModifyTrafficMirrorFilterNetworkServicesRequest modifyTrafficMirrorFilterNetworkServicesRequest) {

        if (modifyTrafficMirrorFilterNetworkServicesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTrafficMirrorFilterNetworkServicesRequest> request = new DefaultRequest<ModifyTrafficMirrorFilterNetworkServicesRequest>(
                modifyTrafficMirrorFilterNetworkServicesRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyTrafficMirrorFilterNetworkServices");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTrafficMirrorFilterNetworkServicesRequest.getTrafficMirrorFilterId() != null) {
            request.addParameter("TrafficMirrorFilterId", StringUtils.fromString(modifyTrafficMirrorFilterNetworkServicesRequest.getTrafficMirrorFilterId()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyTrafficMirrorFilterNetworkServicesRequestAddNetworkServicesList = (com.amazonaws.internal.SdkInternalList<String>) modifyTrafficMirrorFilterNetworkServicesRequest
                .getAddNetworkServices();
        if (!modifyTrafficMirrorFilterNetworkServicesRequestAddNetworkServicesList.isEmpty()
                || !modifyTrafficMirrorFilterNetworkServicesRequestAddNetworkServicesList.isAutoConstruct()) {
            int addNetworkServicesListIndex = 1;

            for (String modifyTrafficMirrorFilterNetworkServicesRequestAddNetworkServicesListValue : modifyTrafficMirrorFilterNetworkServicesRequestAddNetworkServicesList) {
                if (modifyTrafficMirrorFilterNetworkServicesRequestAddNetworkServicesListValue != null) {
                    request.addParameter("AddNetworkService." + addNetworkServicesListIndex,
                            StringUtils.fromString(modifyTrafficMirrorFilterNetworkServicesRequestAddNetworkServicesListValue));
                }
                addNetworkServicesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> modifyTrafficMirrorFilterNetworkServicesRequestRemoveNetworkServicesList = (com.amazonaws.internal.SdkInternalList<String>) modifyTrafficMirrorFilterNetworkServicesRequest
                .getRemoveNetworkServices();
        if (!modifyTrafficMirrorFilterNetworkServicesRequestRemoveNetworkServicesList.isEmpty()
                || !modifyTrafficMirrorFilterNetworkServicesRequestRemoveNetworkServicesList.isAutoConstruct()) {
            int removeNetworkServicesListIndex = 1;

            for (String modifyTrafficMirrorFilterNetworkServicesRequestRemoveNetworkServicesListValue : modifyTrafficMirrorFilterNetworkServicesRequestRemoveNetworkServicesList) {
                if (modifyTrafficMirrorFilterNetworkServicesRequestRemoveNetworkServicesListValue != null) {
                    request.addParameter("RemoveNetworkService." + removeNetworkServicesListIndex,
                            StringUtils.fromString(modifyTrafficMirrorFilterNetworkServicesRequestRemoveNetworkServicesListValue));
                }
                removeNetworkServicesListIndex++;
            }
        }

        return request;
    }

}
