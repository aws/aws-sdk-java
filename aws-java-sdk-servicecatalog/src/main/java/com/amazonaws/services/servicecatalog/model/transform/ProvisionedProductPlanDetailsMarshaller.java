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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionedProductPlanDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionedProductPlanDetailsMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PATHID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PathId").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
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
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> NOTIFICATIONARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationArns").build();
    private static final MarshallingInfo<List> PROVISIONINGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningParameters").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();

    private static final ProvisionedProductPlanDetailsMarshaller instance = new ProvisionedProductPlanDetailsMarshaller();

    public static ProvisionedProductPlanDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionedProductPlanDetails provisionedProductPlanDetails, ProtocolMarshaller protocolMarshaller) {

        if (provisionedProductPlanDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionedProductPlanDetails.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getPathId(), PATHID_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getPlanName(), PLANNAME_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getPlanId(), PLANID_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getProvisionProductId(), PROVISIONPRODUCTID_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getProvisionProductName(), PROVISIONPRODUCTNAME_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getPlanType(), PLANTYPE_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getProvisioningArtifactId(), PROVISIONINGARTIFACTID_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getUpdatedTime(), UPDATEDTIME_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getNotificationArns(), NOTIFICATIONARNS_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getProvisioningParameters(), PROVISIONINGPARAMETERS_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(provisionedProductPlanDetails.getStatusMessage(), STATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
