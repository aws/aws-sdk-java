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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ThingTypeDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThingTypeDefinitionMarshaller {

    private static final MarshallingInfo<String> THINGTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingTypeName").build();
    private static final MarshallingInfo<String> THINGTYPEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingTypeArn").build();
    private static final MarshallingInfo<StructuredPojo> THINGTYPEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingTypeProperties").build();
    private static final MarshallingInfo<StructuredPojo> THINGTYPEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingTypeMetadata").build();

    private static final ThingTypeDefinitionMarshaller instance = new ThingTypeDefinitionMarshaller();

    public static ThingTypeDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ThingTypeDefinition thingTypeDefinition, ProtocolMarshaller protocolMarshaller) {

        if (thingTypeDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(thingTypeDefinition.getThingTypeName(), THINGTYPENAME_BINDING);
            protocolMarshaller.marshall(thingTypeDefinition.getThingTypeArn(), THINGTYPEARN_BINDING);
            protocolMarshaller.marshall(thingTypeDefinition.getThingTypeProperties(), THINGTYPEPROPERTIES_BINDING);
            protocolMarshaller.marshall(thingTypeDefinition.getThingTypeMetadata(), THINGTYPEMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
