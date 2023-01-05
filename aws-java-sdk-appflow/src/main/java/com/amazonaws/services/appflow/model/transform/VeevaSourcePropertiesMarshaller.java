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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VeevaSourcePropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VeevaSourcePropertiesMarshaller {

    private static final MarshallingInfo<String> OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("object").build();
    private static final MarshallingInfo<String> DOCUMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("documentType").build();
    private static final MarshallingInfo<Boolean> INCLUDESOURCEFILES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeSourceFiles").build();
    private static final MarshallingInfo<Boolean> INCLUDERENDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeRenditions").build();
    private static final MarshallingInfo<Boolean> INCLUDEALLVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeAllVersions").build();

    private static final VeevaSourcePropertiesMarshaller instance = new VeevaSourcePropertiesMarshaller();

    public static VeevaSourcePropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VeevaSourceProperties veevaSourceProperties, ProtocolMarshaller protocolMarshaller) {

        if (veevaSourceProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(veevaSourceProperties.getObject(), OBJECT_BINDING);
            protocolMarshaller.marshall(veevaSourceProperties.getDocumentType(), DOCUMENTTYPE_BINDING);
            protocolMarshaller.marshall(veevaSourceProperties.getIncludeSourceFiles(), INCLUDESOURCEFILES_BINDING);
            protocolMarshaller.marshall(veevaSourceProperties.getIncludeRenditions(), INCLUDERENDITIONS_BINDING);
            protocolMarshaller.marshall(veevaSourceProperties.getIncludeAllVersions(), INCLUDEALLVERSIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
