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
package com.amazonaws.services.macie2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BucketCriteriaAdditionalPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BucketCriteriaAdditionalPropertiesMarshaller {

    private static final MarshallingInfo<List> EQ_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eq").build();
    private static final MarshallingInfo<Long> GT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gt").build();
    private static final MarshallingInfo<Long> GTE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gte").build();
    private static final MarshallingInfo<Long> LT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lt").build();
    private static final MarshallingInfo<Long> LTE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lte").build();
    private static final MarshallingInfo<List> NEQ_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("neq").build();
    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("prefix").build();

    private static final BucketCriteriaAdditionalPropertiesMarshaller instance = new BucketCriteriaAdditionalPropertiesMarshaller();

    public static BucketCriteriaAdditionalPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BucketCriteriaAdditionalProperties bucketCriteriaAdditionalProperties, ProtocolMarshaller protocolMarshaller) {

        if (bucketCriteriaAdditionalProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bucketCriteriaAdditionalProperties.getEq(), EQ_BINDING);
            protocolMarshaller.marshall(bucketCriteriaAdditionalProperties.getGt(), GT_BINDING);
            protocolMarshaller.marshall(bucketCriteriaAdditionalProperties.getGte(), GTE_BINDING);
            protocolMarshaller.marshall(bucketCriteriaAdditionalProperties.getLt(), LT_BINDING);
            protocolMarshaller.marshall(bucketCriteriaAdditionalProperties.getLte(), LTE_BINDING);
            protocolMarshaller.marshall(bucketCriteriaAdditionalProperties.getNeq(), NEQ_BINDING);
            protocolMarshaller.marshall(bucketCriteriaAdditionalProperties.getPrefix(), PREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
