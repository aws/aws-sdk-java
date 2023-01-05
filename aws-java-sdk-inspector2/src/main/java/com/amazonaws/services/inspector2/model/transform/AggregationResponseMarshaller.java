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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AggregationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AggregationResponseMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCOUNTAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountAggregation").build();
    private static final MarshallingInfo<StructuredPojo> AMIAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amiAggregation").build();
    private static final MarshallingInfo<StructuredPojo> AWSECRCONTAINERAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsEcrContainerAggregation").build();
    private static final MarshallingInfo<StructuredPojo> EC2INSTANCEAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceAggregation").build();
    private static final MarshallingInfo<StructuredPojo> FINDINGTYPEAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingTypeAggregation").build();
    private static final MarshallingInfo<StructuredPojo> IMAGELAYERAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageLayerAggregation").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionAggregation").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDALAYERAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaLayerAggregation").build();
    private static final MarshallingInfo<StructuredPojo> PACKAGEAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageAggregation").build();
    private static final MarshallingInfo<StructuredPojo> REPOSITORYAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryAggregation").build();
    private static final MarshallingInfo<StructuredPojo> TITLEAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("titleAggregation").build();

    private static final AggregationResponseMarshaller instance = new AggregationResponseMarshaller();

    public static AggregationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AggregationResponse aggregationResponse, ProtocolMarshaller protocolMarshaller) {

        if (aggregationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aggregationResponse.getAccountAggregation(), ACCOUNTAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getAmiAggregation(), AMIAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getAwsEcrContainerAggregation(), AWSECRCONTAINERAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getEc2InstanceAggregation(), EC2INSTANCEAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getFindingTypeAggregation(), FINDINGTYPEAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getImageLayerAggregation(), IMAGELAYERAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getLambdaFunctionAggregation(), LAMBDAFUNCTIONAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getLambdaLayerAggregation(), LAMBDALAYERAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getPackageAggregation(), PACKAGEAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getRepositoryAggregation(), REPOSITORYAGGREGATION_BINDING);
            protocolMarshaller.marshall(aggregationResponse.getTitleAggregation(), TITLEAGGREGATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
