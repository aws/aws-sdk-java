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
package com.amazonaws.services.proton.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceInstanceStateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceInstanceStateMarshaller {

    private static final MarshallingInfo<List> LASTSUCCESSFULCOMPONENTDEPLOYMENTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSuccessfulComponentDeploymentIds").build();
    private static final MarshallingInfo<String> LASTSUCCESSFULENVIRONMENTDEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSuccessfulEnvironmentDeploymentId").build();
    private static final MarshallingInfo<String> LASTSUCCESSFULSERVICEPIPELINEDEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSuccessfulServicePipelineDeploymentId").build();
    private static final MarshallingInfo<String> SPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("spec").build();
    private static final MarshallingInfo<String> TEMPLATEMAJORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateMajorVersion").build();
    private static final MarshallingInfo<String> TEMPLATEMINORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateMinorVersion").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateName").build();

    private static final ServiceInstanceStateMarshaller instance = new ServiceInstanceStateMarshaller();

    public static ServiceInstanceStateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceInstanceState serviceInstanceState, ProtocolMarshaller protocolMarshaller) {

        if (serviceInstanceState == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceInstanceState.getLastSuccessfulComponentDeploymentIds(), LASTSUCCESSFULCOMPONENTDEPLOYMENTIDS_BINDING);
            protocolMarshaller.marshall(serviceInstanceState.getLastSuccessfulEnvironmentDeploymentId(), LASTSUCCESSFULENVIRONMENTDEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(serviceInstanceState.getLastSuccessfulServicePipelineDeploymentId(), LASTSUCCESSFULSERVICEPIPELINEDEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(serviceInstanceState.getSpec(), SPEC_BINDING);
            protocolMarshaller.marshall(serviceInstanceState.getTemplateMajorVersion(), TEMPLATEMAJORVERSION_BINDING);
            protocolMarshaller.marshall(serviceInstanceState.getTemplateMinorVersion(), TEMPLATEMINORVERSION_BINDING);
            protocolMarshaller.marshall(serviceInstanceState.getTemplateName(), TEMPLATENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
