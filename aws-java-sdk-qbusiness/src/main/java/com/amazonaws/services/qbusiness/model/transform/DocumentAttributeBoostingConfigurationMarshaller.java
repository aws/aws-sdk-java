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
package com.amazonaws.services.qbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentAttributeBoostingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentAttributeBoostingConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> NUMBERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> STRINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stringConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DATECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> STRINGLISTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stringListConfiguration").build();

    private static final DocumentAttributeBoostingConfigurationMarshaller instance = new DocumentAttributeBoostingConfigurationMarshaller();

    public static DocumentAttributeBoostingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DocumentAttributeBoostingConfiguration documentAttributeBoostingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (documentAttributeBoostingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(documentAttributeBoostingConfiguration.getNumberConfiguration(), NUMBERCONFIGURATION_BINDING);
            protocolMarshaller.marshall(documentAttributeBoostingConfiguration.getStringConfiguration(), STRINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(documentAttributeBoostingConfiguration.getDateConfiguration(), DATECONFIGURATION_BINDING);
            protocolMarshaller.marshall(documentAttributeBoostingConfiguration.getStringListConfiguration(), STRINGLISTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
