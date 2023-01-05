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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SensitivityAggregationsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SensitivityAggregationsMarshaller {

    private static final MarshallingInfo<Long> CLASSIFIABLESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("classifiableSizeInBytes").build();
    private static final MarshallingInfo<Long> PUBLICLYACCESSIBLECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyAccessibleCount").build();
    private static final MarshallingInfo<Long> TOTALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("totalCount").build();
    private static final MarshallingInfo<Long> TOTALSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalSizeInBytes").build();

    private static final SensitivityAggregationsMarshaller instance = new SensitivityAggregationsMarshaller();

    public static SensitivityAggregationsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SensitivityAggregations sensitivityAggregations, ProtocolMarshaller protocolMarshaller) {

        if (sensitivityAggregations == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sensitivityAggregations.getClassifiableSizeInBytes(), CLASSIFIABLESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(sensitivityAggregations.getPubliclyAccessibleCount(), PUBLICLYACCESSIBLECOUNT_BINDING);
            protocolMarshaller.marshall(sensitivityAggregations.getTotalCount(), TOTALCOUNT_BINDING);
            protocolMarshaller.marshall(sensitivityAggregations.getTotalSizeInBytes(), TOTALSIZEINBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
