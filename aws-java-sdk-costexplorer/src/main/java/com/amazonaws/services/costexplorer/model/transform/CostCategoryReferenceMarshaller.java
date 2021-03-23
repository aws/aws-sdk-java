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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CostCategoryReferenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CostCategoryReferenceMarshaller {

    private static final MarshallingInfo<String> COSTCATEGORYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CostCategoryArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> EFFECTIVESTART_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EffectiveStart").build();
    private static final MarshallingInfo<String> EFFECTIVEEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EffectiveEnd").build();
    private static final MarshallingInfo<Integer> NUMBEROFRULES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfRules").build();
    private static final MarshallingInfo<List> PROCESSINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingStatus").build();
    private static final MarshallingInfo<List> VALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Values").build();
    private static final MarshallingInfo<String> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultValue").build();

    private static final CostCategoryReferenceMarshaller instance = new CostCategoryReferenceMarshaller();

    public static CostCategoryReferenceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CostCategoryReference costCategoryReference, ProtocolMarshaller protocolMarshaller) {

        if (costCategoryReference == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(costCategoryReference.getCostCategoryArn(), COSTCATEGORYARN_BINDING);
            protocolMarshaller.marshall(costCategoryReference.getName(), NAME_BINDING);
            protocolMarshaller.marshall(costCategoryReference.getEffectiveStart(), EFFECTIVESTART_BINDING);
            protocolMarshaller.marshall(costCategoryReference.getEffectiveEnd(), EFFECTIVEEND_BINDING);
            protocolMarshaller.marshall(costCategoryReference.getNumberOfRules(), NUMBEROFRULES_BINDING);
            protocolMarshaller.marshall(costCategoryReference.getProcessingStatus(), PROCESSINGSTATUS_BINDING);
            protocolMarshaller.marshall(costCategoryReference.getValues(), VALUES_BINDING);
            protocolMarshaller.marshall(costCategoryReference.getDefaultValue(), DEFAULTVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
