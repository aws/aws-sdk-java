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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SalesforceSourcePropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SalesforceSourcePropertiesMarshaller {

    private static final MarshallingInfo<String> OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Object").build();
    private static final MarshallingInfo<Boolean> ENABLEDYNAMICFIELDUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableDynamicFieldUpdate").build();
    private static final MarshallingInfo<Boolean> INCLUDEDELETEDRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeDeletedRecords").build();

    private static final SalesforceSourcePropertiesMarshaller instance = new SalesforceSourcePropertiesMarshaller();

    public static SalesforceSourcePropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SalesforceSourceProperties salesforceSourceProperties, ProtocolMarshaller protocolMarshaller) {

        if (salesforceSourceProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(salesforceSourceProperties.getObject(), OBJECT_BINDING);
            protocolMarshaller.marshall(salesforceSourceProperties.getEnableDynamicFieldUpdate(), ENABLEDYNAMICFIELDUPDATE_BINDING);
            protocolMarshaller.marshall(salesforceSourceProperties.getIncludeDeletedRecords(), INCLUDEDELETEDRECORDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
