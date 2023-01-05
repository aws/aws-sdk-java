/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FailedCreateStandbyWorkspacesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FailedCreateStandbyWorkspacesRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> STANDBYWORKSPACEREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandbyWorkspaceRequest").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();

    private static final FailedCreateStandbyWorkspacesRequestMarshaller instance = new FailedCreateStandbyWorkspacesRequestMarshaller();

    public static FailedCreateStandbyWorkspacesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FailedCreateStandbyWorkspacesRequest failedCreateStandbyWorkspacesRequest, ProtocolMarshaller protocolMarshaller) {

        if (failedCreateStandbyWorkspacesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(failedCreateStandbyWorkspacesRequest.getStandbyWorkspaceRequest(), STANDBYWORKSPACEREQUEST_BINDING);
            protocolMarshaller.marshall(failedCreateStandbyWorkspacesRequest.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(failedCreateStandbyWorkspacesRequest.getErrorMessage(), ERRORMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
