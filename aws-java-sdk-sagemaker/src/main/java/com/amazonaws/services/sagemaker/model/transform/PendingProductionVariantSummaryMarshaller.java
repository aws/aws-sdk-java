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
 * PendingProductionVariantSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PendingProductionVariantSummaryMarshaller {

    private static final MarshallingInfo<String> VARIANTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VariantName").build();
    private static final MarshallingInfo<List> DEPLOYEDIMAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeployedImages").build();
    private static final MarshallingInfo<Float> CURRENTWEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentWeight").build();
    private static final MarshallingInfo<Float> DESIREDWEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredWeight").build();
    private static final MarshallingInfo<Integer> CURRENTINSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentInstanceCount").build();
    private static final MarshallingInfo<Integer> DESIREDINSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredInstanceCount").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> ACCELERATORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorType").build();
    private static final MarshallingInfo<List> VARIANTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VariantStatus").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTSERVERLESSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentServerlessConfig").build();
    private static final MarshallingInfo<StructuredPojo> DESIREDSERVERLESSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredServerlessConfig").build();

    private static final PendingProductionVariantSummaryMarshaller instance = new PendingProductionVariantSummaryMarshaller();

    public static PendingProductionVariantSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PendingProductionVariantSummary pendingProductionVariantSummary, ProtocolMarshaller protocolMarshaller) {

        if (pendingProductionVariantSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pendingProductionVariantSummary.getVariantName(), VARIANTNAME_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getDeployedImages(), DEPLOYEDIMAGES_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getCurrentWeight(), CURRENTWEIGHT_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getDesiredWeight(), DESIREDWEIGHT_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getCurrentInstanceCount(), CURRENTINSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getDesiredInstanceCount(), DESIREDINSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getAcceleratorType(), ACCELERATORTYPE_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getVariantStatus(), VARIANTSTATUS_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getCurrentServerlessConfig(), CURRENTSERVERLESSCONFIG_BINDING);
            protocolMarshaller.marshall(pendingProductionVariantSummary.getDesiredServerlessConfig(), DESIREDSERVERLESSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
