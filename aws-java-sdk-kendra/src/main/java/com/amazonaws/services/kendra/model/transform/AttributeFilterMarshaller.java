/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AttributeFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttributeFilterMarshaller {

    private static final MarshallingInfo<List> ANDALLFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AndAllFilters").build();
    private static final MarshallingInfo<List> ORALLFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrAllFilters").build();
    private static final MarshallingInfo<StructuredPojo> NOTFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotFilter").build();
    private static final MarshallingInfo<StructuredPojo> EQUALSTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EqualsTo").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINSALL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainsAll").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINSANY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainsAny").build();
    private static final MarshallingInfo<StructuredPojo> GREATERTHAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GreaterThan").build();
    private static final MarshallingInfo<StructuredPojo> GREATERTHANOREQUALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GreaterThanOrEquals").build();
    private static final MarshallingInfo<StructuredPojo> LESSTHAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LessThan").build();
    private static final MarshallingInfo<StructuredPojo> LESSTHANOREQUALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LessThanOrEquals").build();

    private static final AttributeFilterMarshaller instance = new AttributeFilterMarshaller();

    public static AttributeFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AttributeFilter attributeFilter, ProtocolMarshaller protocolMarshaller) {

        if (attributeFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attributeFilter.getAndAllFilters(), ANDALLFILTERS_BINDING);
            protocolMarshaller.marshall(attributeFilter.getOrAllFilters(), ORALLFILTERS_BINDING);
            protocolMarshaller.marshall(attributeFilter.getNotFilter(), NOTFILTER_BINDING);
            protocolMarshaller.marshall(attributeFilter.getEqualsTo(), EQUALSTO_BINDING);
            protocolMarshaller.marshall(attributeFilter.getContainsAll(), CONTAINSALL_BINDING);
            protocolMarshaller.marshall(attributeFilter.getContainsAny(), CONTAINSANY_BINDING);
            protocolMarshaller.marshall(attributeFilter.getGreaterThan(), GREATERTHAN_BINDING);
            protocolMarshaller.marshall(attributeFilter.getGreaterThanOrEquals(), GREATERTHANOREQUALS_BINDING);
            protocolMarshaller.marshall(attributeFilter.getLessThan(), LESSTHAN_BINDING);
            protocolMarshaller.marshall(attributeFilter.getLessThanOrEquals(), LESSTHANOREQUALS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
