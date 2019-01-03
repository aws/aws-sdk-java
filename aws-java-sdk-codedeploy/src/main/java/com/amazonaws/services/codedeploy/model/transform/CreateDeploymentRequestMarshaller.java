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
 * CreateDeploymentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDeploymentRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationName").build();
    private static final MarshallingInfo<String> DEPLOYMENTGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentGroupName").build();
    private static final MarshallingInfo<StructuredPojo> REVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revision").build();
    private static final MarshallingInfo<String> DEPLOYMENTCONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentConfigName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> IGNOREAPPLICATIONSTOPFAILURES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ignoreApplicationStopFailures").build();
    private static final MarshallingInfo<StructuredPojo> TARGETINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetInstances").build();
    private static final MarshallingInfo<StructuredPojo> AUTOROLLBACKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoRollbackConfiguration").build();
    private static final MarshallingInfo<Boolean> UPDATEOUTDATEDINSTANCESONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateOutdatedInstancesOnly").build();
    private static final MarshallingInfo<String> FILEEXISTSBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileExistsBehavior").build();

    private static final CreateDeploymentRequestMarshaller instance = new CreateDeploymentRequestMarshaller();

    public static CreateDeploymentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDeploymentRequest createDeploymentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDeploymentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDeploymentRequest.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getDeploymentGroupName(), DEPLOYMENTGROUPNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getRevision(), REVISION_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getDeploymentConfigName(), DEPLOYMENTCONFIGNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getIgnoreApplicationStopFailures(), IGNOREAPPLICATIONSTOPFAILURES_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getTargetInstances(), TARGETINSTANCES_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getAutoRollbackConfiguration(), AUTOROLLBACKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getUpdateOutdatedInstancesOnly(), UPDATEOUTDATEDINSTANCESONLY_BINDING);
            protocolMarshaller.marshall(createDeploymentRequest.getFileExistsBehavior(), FILEEXISTSBEHAVIOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
