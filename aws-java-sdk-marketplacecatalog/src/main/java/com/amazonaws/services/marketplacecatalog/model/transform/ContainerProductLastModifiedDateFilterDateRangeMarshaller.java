/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerProductLastModifiedDateFilterDateRangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerProductLastModifiedDateFilterDateRangeMarshaller {

    private static final MarshallingInfo<String> AFTERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AfterValue").build();
    private static final MarshallingInfo<String> BEFOREVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BeforeValue").build();

    private static final ContainerProductLastModifiedDateFilterDateRangeMarshaller instance = new ContainerProductLastModifiedDateFilterDateRangeMarshaller();

    public static ContainerProductLastModifiedDateFilterDateRangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerProductLastModifiedDateFilterDateRange containerProductLastModifiedDateFilterDateRange, ProtocolMarshaller protocolMarshaller) {

        if (containerProductLastModifiedDateFilterDateRange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerProductLastModifiedDateFilterDateRange.getAfterValue(), AFTERVALUE_BINDING);
            protocolMarshaller.marshall(containerProductLastModifiedDateFilterDateRange.getBeforeValue(), BEFOREVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
