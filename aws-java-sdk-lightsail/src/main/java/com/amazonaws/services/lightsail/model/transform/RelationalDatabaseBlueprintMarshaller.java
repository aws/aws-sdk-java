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
 * RelationalDatabaseBlueprintMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RelationalDatabaseBlueprintMarshaller {

    private static final MarshallingInfo<String> BLUEPRINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blueprintId").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineVersion").build();
    private static final MarshallingInfo<String> ENGINEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineDescription").build();
    private static final MarshallingInfo<String> ENGINEVERSIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineVersionDescription").build();
    private static final MarshallingInfo<Boolean> ISENGINEDEFAULT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isEngineDefault").build();

    private static final RelationalDatabaseBlueprintMarshaller instance = new RelationalDatabaseBlueprintMarshaller();

    public static RelationalDatabaseBlueprintMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RelationalDatabaseBlueprint relationalDatabaseBlueprint, ProtocolMarshaller protocolMarshaller) {

        if (relationalDatabaseBlueprint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(relationalDatabaseBlueprint.getBlueprintId(), BLUEPRINTID_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBlueprint.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBlueprint.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBlueprint.getEngineDescription(), ENGINEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBlueprint.getEngineVersionDescription(), ENGINEVERSIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(relationalDatabaseBlueprint.getIsEngineDefault(), ISENGINEDEFAULT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
