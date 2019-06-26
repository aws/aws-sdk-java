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
 * ModifyTrafficMirrorSessionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrafficMirrorSessionRequestMarshaller implements Marshaller<Request<ModifyTrafficMirrorSessionRequest>, ModifyTrafficMirrorSessionRequest> {

    public Request<ModifyTrafficMirrorSessionRequest> marshall(ModifyTrafficMirrorSessionRequest modifyTrafficMirrorSessionRequest) {

        if (modifyTrafficMirrorSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTrafficMirrorSessionRequest> request = new DefaultRequest<ModifyTrafficMirrorSessionRequest>(modifyTrafficMirrorSessionRequest,
                "AmazonEC2");
        request.addParameter("Action", "ModifyTrafficMirrorSession");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTrafficMirrorSessionRequest.getTrafficMirrorSessionId() != null) {
            request.addParameter("TrafficMirrorSessionId", StringUtils.fromString(modifyTrafficMirrorSessionRequest.getTrafficMirrorSessionId()));
        }

        if (modifyTrafficMirrorSessionRequest.getTrafficMirrorTargetId() != null) {
            request.addParameter("TrafficMirrorTargetId", StringUtils.fromString(modifyTrafficMirrorSessionRequest.getTrafficMirrorTargetId()));
        }

        if (modifyTrafficMirrorSessionRequest.getTrafficMirrorFilterId() != null) {
            request.addParameter("TrafficMirrorFilterId", StringUtils.fromString(modifyTrafficMirrorSessionRequest.getTrafficMirrorFilterId()));
        }

        if (modifyTrafficMirrorSessionRequest.getPacketLength() != null) {
            request.addParameter("PacketLength", StringUtils.fromInteger(modifyTrafficMirrorSessionRequest.getPacketLength()));
        }

        if (modifyTrafficMirrorSessionRequest.getSessionNumber() != null) {
            request.addParameter("SessionNumber", StringUtils.fromInteger(modifyTrafficMirrorSessionRequest.getSessionNumber()));
        }

        if (modifyTrafficMirrorSessionRequest.getVirtualNetworkId() != null) {
            request.addParameter("VirtualNetworkId", StringUtils.fromInteger(modifyTrafficMirrorSessionRequest.getVirtualNetworkId()));
        }

        if (modifyTrafficMirrorSessionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyTrafficMirrorSessionRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<String> modifyTrafficMirrorSessionRequestRemoveFieldsList = (com.amazonaws.internal.SdkInternalList<String>) modifyTrafficMirrorSessionRequest
                .getRemoveFields();
        if (!modifyTrafficMirrorSessionRequestRemoveFieldsList.isEmpty() || !modifyTrafficMirrorSessionRequestRemoveFieldsList.isAutoConstruct()) {
            int removeFieldsListIndex = 1;

            for (String modifyTrafficMirrorSessionRequestRemoveFieldsListValue : modifyTrafficMirrorSessionRequestRemoveFieldsList) {
                if (modifyTrafficMirrorSessionRequestRemoveFieldsListValue != null) {
                    request.addParameter("RemoveField." + removeFieldsListIndex, StringUtils.fromString(modifyTrafficMirrorSessionRequestRemoveFieldsListValue));
                }
                removeFieldsListIndex++;
            }
        }

        return request;
    }

}
