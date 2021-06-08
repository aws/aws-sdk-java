/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apprunner.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateServiceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateServiceRequestMarshaller {

    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceName").build();
    private static final MarshallingInfo<StructuredPojo> SOURCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceConfiguration").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHCHECKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckConfiguration").build();
    private static final MarshallingInfo<String> AUTOSCALINGCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingConfigurationArn").build();

    private static final CreateServiceRequestMarshaller instance = new CreateServiceRequestMarshaller();

    public static CreateServiceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateServiceRequest createServiceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createServiceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createServiceRequest.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getSourceConfiguration(), SOURCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getInstanceConfiguration(), INSTANCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getHealthCheckConfiguration(), HEALTHCHECKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createServiceRequest.getAutoScalingConfigurationArn(), AUTOSCALINGCONFIGURATIONARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
