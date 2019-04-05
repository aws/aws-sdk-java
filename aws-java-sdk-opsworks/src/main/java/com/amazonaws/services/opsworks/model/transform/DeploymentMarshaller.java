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
package com.amazonaws.services.opsworks.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentId").build();
    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AppId").build();
    private static final MarshallingInfo<String> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<String> COMPLETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedAt").build();
    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Duration").build();
    private static final MarshallingInfo<String> IAMUSERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamUserArn").build();
    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Comment").build();
    private static final MarshallingInfo<StructuredPojo> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Command").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> CUSTOMJSON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomJson").build();
    private static final MarshallingInfo<List> INSTANCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InstanceIds").build();

    private static final DeploymentMarshaller instance = new DeploymentMarshaller();

    public static DeploymentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Deployment deployment, ProtocolMarshaller protocolMarshaller) {

        if (deployment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deployment.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(deployment.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(deployment.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(deployment.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(deployment.getCompletedAt(), COMPLETEDAT_BINDING);
            protocolMarshaller.marshall(deployment.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(deployment.getIamUserArn(), IAMUSERARN_BINDING);
            protocolMarshaller.marshall(deployment.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(deployment.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(deployment.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(deployment.getCustomJson(), CUSTOMJSON_BINDING);
            protocolMarshaller.marshall(deployment.getInstanceIds(), INSTANCEIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
