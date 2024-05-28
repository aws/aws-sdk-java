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
package com.amazonaws.services.costoptimizationhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costoptimizationhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> COMPUTESAVINGSPLANS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeSavingsPlans").build();
    private static final MarshallingInfo<StructuredPojo> EBSVOLUME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebsVolume").build();
    private static final MarshallingInfo<StructuredPojo> EC2AUTOSCALINGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2AutoScalingGroup").build();
    private static final MarshallingInfo<StructuredPojo> EC2INSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2Instance").build();
    private static final MarshallingInfo<StructuredPojo> EC2INSTANCESAVINGSPLANS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceSavingsPlans").build();
    private static final MarshallingInfo<StructuredPojo> EC2RESERVEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2ReservedInstances").build();
    private static final MarshallingInfo<StructuredPojo> ECSSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecsService").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICACHERESERVEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elastiCacheReservedInstances").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunction").build();
    private static final MarshallingInfo<StructuredPojo> OPENSEARCHRESERVEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openSearchReservedInstances").build();
    private static final MarshallingInfo<StructuredPojo> RDSRESERVEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rdsReservedInstances").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTRESERVEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redshiftReservedInstances").build();
    private static final MarshallingInfo<StructuredPojo> SAGEMAKERSAVINGSPLANS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sageMakerSavingsPlans").build();

    private static final ResourceDetailsMarshaller instance = new ResourceDetailsMarshaller();

    public static ResourceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDetails resourceDetails, ProtocolMarshaller protocolMarshaller) {

        if (resourceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDetails.getComputeSavingsPlans(), COMPUTESAVINGSPLANS_BINDING);
            protocolMarshaller.marshall(resourceDetails.getEbsVolume(), EBSVOLUME_BINDING);
            protocolMarshaller.marshall(resourceDetails.getEc2AutoScalingGroup(), EC2AUTOSCALINGGROUP_BINDING);
            protocolMarshaller.marshall(resourceDetails.getEc2Instance(), EC2INSTANCE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getEc2InstanceSavingsPlans(), EC2INSTANCESAVINGSPLANS_BINDING);
            protocolMarshaller.marshall(resourceDetails.getEc2ReservedInstances(), EC2RESERVEDINSTANCES_BINDING);
            protocolMarshaller.marshall(resourceDetails.getEcsService(), ECSSERVICE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getElastiCacheReservedInstances(), ELASTICACHERESERVEDINSTANCES_BINDING);
            protocolMarshaller.marshall(resourceDetails.getLambdaFunction(), LAMBDAFUNCTION_BINDING);
            protocolMarshaller.marshall(resourceDetails.getOpenSearchReservedInstances(), OPENSEARCHRESERVEDINSTANCES_BINDING);
            protocolMarshaller.marshall(resourceDetails.getRdsReservedInstances(), RDSRESERVEDINSTANCES_BINDING);
            protocolMarshaller.marshall(resourceDetails.getRedshiftReservedInstances(), REDSHIFTRESERVEDINSTANCES_BINDING);
            protocolMarshaller.marshall(resourceDetails.getSageMakerSavingsPlans(), SAGEMAKERSAVINGSPLANS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
