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
package com.amazonaws.services.appflow.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FieldTypeDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FieldTypeDetailsMarshaller {

    private static final MarshallingInfo<String> FIELDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fieldType").build();
    private static final MarshallingInfo<List> FILTEROPERATORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterOperators").build();
    private static final MarshallingInfo<List> SUPPORTEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedValues").build();

    private static final FieldTypeDetailsMarshaller instance = new FieldTypeDetailsMarshaller();

    public static FieldTypeDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FieldTypeDetails fieldTypeDetails, ProtocolMarshaller protocolMarshaller) {

        if (fieldTypeDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fieldTypeDetails.getFieldType(), FIELDTYPE_BINDING);
            protocolMarshaller.marshall(fieldTypeDetails.getFilterOperators(), FILTEROPERATORS_BINDING);
            protocolMarshaller.marshall(fieldTypeDetails.getSupportedValues(), SUPPORTEDVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
