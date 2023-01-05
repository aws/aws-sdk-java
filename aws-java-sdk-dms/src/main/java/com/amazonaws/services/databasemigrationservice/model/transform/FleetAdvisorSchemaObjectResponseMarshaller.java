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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FleetAdvisorSchemaObjectResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FleetAdvisorSchemaObjectResponseMarshaller {

    private static final MarshallingInfo<String> SCHEMAID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SchemaId").build();
    private static final MarshallingInfo<String> OBJECTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectType").build();
    private static final MarshallingInfo<Long> NUMBEROFOBJECTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfObjects").build();
    private static final MarshallingInfo<Long> CODELINECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodeLineCount").build();
    private static final MarshallingInfo<Long> CODESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodeSize").build();

    private static final FleetAdvisorSchemaObjectResponseMarshaller instance = new FleetAdvisorSchemaObjectResponseMarshaller();

    public static FleetAdvisorSchemaObjectResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FleetAdvisorSchemaObjectResponse fleetAdvisorSchemaObjectResponse, ProtocolMarshaller protocolMarshaller) {

        if (fleetAdvisorSchemaObjectResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fleetAdvisorSchemaObjectResponse.getSchemaId(), SCHEMAID_BINDING);
            protocolMarshaller.marshall(fleetAdvisorSchemaObjectResponse.getObjectType(), OBJECTTYPE_BINDING);
            protocolMarshaller.marshall(fleetAdvisorSchemaObjectResponse.getNumberOfObjects(), NUMBEROFOBJECTS_BINDING);
            protocolMarshaller.marshall(fleetAdvisorSchemaObjectResponse.getCodeLineCount(), CODELINECOUNT_BINDING);
            protocolMarshaller.marshall(fleetAdvisorSchemaObjectResponse.getCodeSize(), CODESIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
