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
package com.amazonaws.services.billingconductor.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.billingconductor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchAssociateResourcesToCustomLineItemRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchAssociateResourcesToCustomLineItemRequestMarshaller {

    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetArn").build();
    private static final MarshallingInfo<List> RESOURCEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceArns").build();
    private static final MarshallingInfo<StructuredPojo> BILLINGPERIODRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BillingPeriodRange").build();

    private static final BatchAssociateResourcesToCustomLineItemRequestMarshaller instance = new BatchAssociateResourcesToCustomLineItemRequestMarshaller();

    public static BatchAssociateResourcesToCustomLineItemRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchAssociateResourcesToCustomLineItemRequest batchAssociateResourcesToCustomLineItemRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchAssociateResourcesToCustomLineItemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchAssociateResourcesToCustomLineItemRequest.getTargetArn(), TARGETARN_BINDING);
            protocolMarshaller.marshall(batchAssociateResourcesToCustomLineItemRequest.getResourceArns(), RESOURCEARNS_BINDING);
            protocolMarshaller.marshall(batchAssociateResourcesToCustomLineItemRequest.getBillingPeriodRange(), BILLINGPERIODRANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
