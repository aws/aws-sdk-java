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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RightsizingRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RightsizingRecommendationMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTINSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentInstance").build();
    private static final MarshallingInfo<String> RIGHTSIZINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RightsizingType").build();
    private static final MarshallingInfo<StructuredPojo> MODIFYRECOMMENDATIONDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModifyRecommendationDetail").build();
    private static final MarshallingInfo<StructuredPojo> TERMINATERECOMMENDATIONDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminateRecommendationDetail").build();

    private static final RightsizingRecommendationMarshaller instance = new RightsizingRecommendationMarshaller();

    public static RightsizingRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RightsizingRecommendation rightsizingRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (rightsizingRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rightsizingRecommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(rightsizingRecommendation.getCurrentInstance(), CURRENTINSTANCE_BINDING);
            protocolMarshaller.marshall(rightsizingRecommendation.getRightsizingType(), RIGHTSIZINGTYPE_BINDING);
            protocolMarshaller.marshall(rightsizingRecommendation.getModifyRecommendationDetail(), MODIFYRECOMMENDATIONDETAIL_BINDING);
            protocolMarshaller.marshall(rightsizingRecommendation.getTerminateRecommendationDetail(), TERMINATERECOMMENDATIONDETAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
