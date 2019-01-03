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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RelationalDatabaseParameterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RelationalDatabaseParameterMarshaller {

    private static final MarshallingInfo<String> ALLOWEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedValues").build();
    private static final MarshallingInfo<String> APPLYMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applyMethod").build();
    private static final MarshallingInfo<String> APPLYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("applyType").build();
    private static final MarshallingInfo<String> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dataType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> ISMODIFIABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isModifiable").build();
    private static final MarshallingInfo<String> PARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterName").build();
    private static final MarshallingInfo<String> PARAMETERVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterValue").build();

    private static final RelationalDatabaseParameterMarshaller instance = new RelationalDatabaseParameterMarshaller();

    public static RelationalDatabaseParameterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RelationalDatabaseParameter relationalDatabaseParameter, ProtocolMarshaller protocolMarshaller) {

        if (relationalDatabaseParameter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(relationalDatabaseParameter.getAllowedValues(), ALLOWEDVALUES_BINDING);
            protocolMarshaller.marshall(relationalDatabaseParameter.getApplyMethod(), APPLYMETHOD_BINDING);
            protocolMarshaller.marshall(relationalDatabaseParameter.getApplyType(), APPLYTYPE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseParameter.getDataType(), DATATYPE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseParameter.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(relationalDatabaseParameter.getIsModifiable(), ISMODIFIABLE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseParameter.getParameterName(), PARAMETERNAME_BINDING);
            protocolMarshaller.marshall(relationalDatabaseParameter.getParameterValue(), PARAMETERVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
