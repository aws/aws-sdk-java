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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationJobInputConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationJobInputConfigMarshaller {

    private static final MarshallingInfo<String> MODELPACKAGEVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageVersionArn").build();
    private static final MarshallingInfo<Integer> JOBDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobDurationInSeconds").build();
    private static final MarshallingInfo<StructuredPojo> TRAFFICPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrafficPattern").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceLimit").build();
    private static final MarshallingInfo<List> ENDPOINTCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointConfigurations").build();
    private static final MarshallingInfo<String> VOLUMEKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeKmsKeyId").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerConfig").build();
    private static final MarshallingInfo<List> ENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoints").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();

    private static final RecommendationJobInputConfigMarshaller instance = new RecommendationJobInputConfigMarshaller();

    public static RecommendationJobInputConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationJobInputConfig recommendationJobInputConfig, ProtocolMarshaller protocolMarshaller) {

        if (recommendationJobInputConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationJobInputConfig.getModelPackageVersionArn(), MODELPACKAGEVERSIONARN_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getJobDurationInSeconds(), JOBDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getTrafficPattern(), TRAFFICPATTERN_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getResourceLimit(), RESOURCELIMIT_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getEndpointConfigurations(), ENDPOINTCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getVolumeKmsKeyId(), VOLUMEKMSKEYID_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getContainerConfig(), CONTAINERCONFIG_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getEndpoints(), ENDPOINTS_BINDING);
            protocolMarshaller.marshall(recommendationJobInputConfig.getVpcConfig(), VPCCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
