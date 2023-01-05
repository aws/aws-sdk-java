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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhuborchestrator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StepInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StepInputMarshaller {

    private static final MarshallingInfo<Integer> INTEGERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integerValue").build();
    private static final MarshallingInfo<String> STRINGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stringValue").build();
    private static final MarshallingInfo<List> LISTOFSTRINGSVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listOfStringsValue").build();
    private static final MarshallingInfo<Map> MAPOFSTRINGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mapOfStringValue").build();

    private static final StepInputMarshaller instance = new StepInputMarshaller();

    public static StepInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StepInput stepInput, ProtocolMarshaller protocolMarshaller) {

        if (stepInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stepInput.getIntegerValue(), INTEGERVALUE_BINDING);
            protocolMarshaller.marshall(stepInput.getStringValue(), STRINGVALUE_BINDING);
            protocolMarshaller.marshall(stepInput.getListOfStringsValue(), LISTOFSTRINGSVALUE_BINDING);
            protocolMarshaller.marshall(stepInput.getMapOfStringValue(), MAPOFSTRINGVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
