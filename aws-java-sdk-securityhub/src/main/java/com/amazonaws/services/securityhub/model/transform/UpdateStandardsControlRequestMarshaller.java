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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateStandardsControlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateStandardsControlRequestMarshaller {

    private static final MarshallingInfo<String> STANDARDSCONTROLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.GREEDY_PATH).marshallLocationName("StandardsControlArn").build();
    private static final MarshallingInfo<String> CONTROLSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ControlStatus").build();
    private static final MarshallingInfo<String> DISABLEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisabledReason").build();

    private static final UpdateStandardsControlRequestMarshaller instance = new UpdateStandardsControlRequestMarshaller();

    public static UpdateStandardsControlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateStandardsControlRequest updateStandardsControlRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateStandardsControlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateStandardsControlRequest.getStandardsControlArn(), STANDARDSCONTROLARN_BINDING);
            protocolMarshaller.marshall(updateStandardsControlRequest.getControlStatus(), CONTROLSTATUS_BINDING);
            protocolMarshaller.marshall(updateStandardsControlRequest.getDisabledReason(), DISABLEDREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
