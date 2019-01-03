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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProductionVariantSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProductionVariantSummaryMarshaller {

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

    private static final ProductionVariantSummaryMarshaller instance = new ProductionVariantSummaryMarshaller();

    public static ProductionVariantSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProductionVariantSummary productionVariantSummary, ProtocolMarshaller protocolMarshaller) {

        if (productionVariantSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(productionVariantSummary.getVariantName(), VARIANTNAME_BINDING);
            protocolMarshaller.marshall(productionVariantSummary.getDeployedImages(), DEPLOYEDIMAGES_BINDING);
            protocolMarshaller.marshall(productionVariantSummary.getCurrentWeight(), CURRENTWEIGHT_BINDING);
            protocolMarshaller.marshall(productionVariantSummary.getDesiredWeight(), DESIREDWEIGHT_BINDING);
            protocolMarshaller.marshall(productionVariantSummary.getCurrentInstanceCount(), CURRENTINSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(productionVariantSummary.getDesiredInstanceCount(), DESIREDINSTANCECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
