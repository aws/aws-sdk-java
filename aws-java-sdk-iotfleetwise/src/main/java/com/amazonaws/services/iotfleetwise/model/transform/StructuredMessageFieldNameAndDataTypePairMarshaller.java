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
package com.amazonaws.services.iotfleetwise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StructuredMessageFieldNameAndDataTypePairMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StructuredMessageFieldNameAndDataTypePairMarshaller {

    private static final MarshallingInfo<String> FIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fieldName").build();
    private static final MarshallingInfo<StructuredPojo> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataType").build();

    private static final StructuredMessageFieldNameAndDataTypePairMarshaller instance = new StructuredMessageFieldNameAndDataTypePairMarshaller();

    public static StructuredMessageFieldNameAndDataTypePairMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StructuredMessageFieldNameAndDataTypePair structuredMessageFieldNameAndDataTypePair, ProtocolMarshaller protocolMarshaller) {

        if (structuredMessageFieldNameAndDataTypePair == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(structuredMessageFieldNameAndDataTypePair.getFieldName(), FIELDNAME_BINDING);
            protocolMarshaller.marshall(structuredMessageFieldNameAndDataTypePair.getDataType(), DATATYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
