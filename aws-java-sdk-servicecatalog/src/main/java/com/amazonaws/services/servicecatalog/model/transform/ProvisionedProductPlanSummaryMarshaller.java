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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionedProductPlanSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionedProductPlanSummaryMarshaller {

    private static final MarshallingInfo<String> PLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PlanName").build();
    private static final MarshallingInfo<String> PLANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PlanId").build();
    private static final MarshallingInfo<String> PROVISIONPRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionProductId").build();
    private static final MarshallingInfo<String> PROVISIONPRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionProductName").build();
    private static final MarshallingInfo<String> PLANTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PlanType").build();
    private static final MarshallingInfo<String> PROVISIONINGARTIFACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningArtifactId").build();

    private static final ProvisionedProductPlanSummaryMarshaller instance = new ProvisionedProductPlanSummaryMarshaller();

    public static ProvisionedProductPlanSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionedProductPlanSummary provisionedProductPlanSummary, ProtocolMarshaller protocolMarshaller) {

        if (provisionedProductPlanSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionedProductPlanSummary.getPlanName(), PLANNAME_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanSummary.getPlanId(), PLANID_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanSummary.getProvisionProductId(), PROVISIONPRODUCTID_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanSummary.getProvisionProductName(), PROVISIONPRODUCTNAME_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanSummary.getPlanType(), PLANTYPE_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanSummary.getProvisioningArtifactId(), PROVISIONINGARTIFACTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
