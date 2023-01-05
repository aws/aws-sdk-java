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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataValueMarshaller {

    private static final MarshallingInfo<Boolean> BOOLEANVALUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("booleanValue").build();
    private static final MarshallingInfo<Double> DOUBLEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("doubleValue").build();
    private static final MarshallingInfo<Integer> INTEGERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integerValue").build();
    private static final MarshallingInfo<Long> LONGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("longValue").build();
    private static final MarshallingInfo<String> STRINGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stringValue").build();
    private static final MarshallingInfo<List> LISTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("listValue").build();
    private static final MarshallingInfo<Map> MAPVALUE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mapValue").build();
    private static final MarshallingInfo<StructuredPojo> RELATIONSHIPVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationshipValue").build();
    private static final MarshallingInfo<String> EXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expression").build();

    private static final DataValueMarshaller instance = new DataValueMarshaller();

    public static DataValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataValue dataValue, ProtocolMarshaller protocolMarshaller) {

        if (dataValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataValue.getBooleanValue(), BOOLEANVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getDoubleValue(), DOUBLEVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getIntegerValue(), INTEGERVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getLongValue(), LONGVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getStringValue(), STRINGVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getListValue(), LISTVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getMapValue(), MAPVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getRelationshipValue(), RELATIONSHIPVALUE_BINDING);
            protocolMarshaller.marshall(dataValue.getExpression(), EXPRESSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
