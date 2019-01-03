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
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RollbackInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RollbackInfoMarshaller {

    private static final MarshallingInfo<String> ROLLBACKDEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rollbackDeploymentId").build();
    private static final MarshallingInfo<String> ROLLBACKTRIGGERINGDEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rollbackTriggeringDeploymentId").build();
    private static final MarshallingInfo<String> ROLLBACKMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rollbackMessage").build();

    private static final RollbackInfoMarshaller instance = new RollbackInfoMarshaller();

    public static RollbackInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RollbackInfo rollbackInfo, ProtocolMarshaller protocolMarshaller) {

        if (rollbackInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rollbackInfo.getRollbackDeploymentId(), ROLLBACKDEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(rollbackInfo.getRollbackTriggeringDeploymentId(), ROLLBACKTRIGGERINGDEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(rollbackInfo.getRollbackMessage(), ROLLBACKMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
