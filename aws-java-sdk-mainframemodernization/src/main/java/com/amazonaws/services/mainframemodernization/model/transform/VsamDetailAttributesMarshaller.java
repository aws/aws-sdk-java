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
package com.amazonaws.services.mainframemodernization.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mainframemodernization.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VsamDetailAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VsamDetailAttributesMarshaller {

    private static final MarshallingInfo<List> ALTERNATEKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alternateKeys").build();
    private static final MarshallingInfo<Boolean> CACHEATSTARTUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheAtStartup").build();
    private static final MarshallingInfo<Boolean> COMPRESSED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("compressed").build();
    private static final MarshallingInfo<String> ENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("encoding").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("primaryKey").build();
    private static final MarshallingInfo<String> RECORDFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordFormat").build();

    private static final VsamDetailAttributesMarshaller instance = new VsamDetailAttributesMarshaller();

    public static VsamDetailAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VsamDetailAttributes vsamDetailAttributes, ProtocolMarshaller protocolMarshaller) {

        if (vsamDetailAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vsamDetailAttributes.getAlternateKeys(), ALTERNATEKEYS_BINDING);
            protocolMarshaller.marshall(vsamDetailAttributes.getCacheAtStartup(), CACHEATSTARTUP_BINDING);
            protocolMarshaller.marshall(vsamDetailAttributes.getCompressed(), COMPRESSED_BINDING);
            protocolMarshaller.marshall(vsamDetailAttributes.getEncoding(), ENCODING_BINDING);
            protocolMarshaller.marshall(vsamDetailAttributes.getPrimaryKey(), PRIMARYKEY_BINDING);
            protocolMarshaller.marshall(vsamDetailAttributes.getRecordFormat(), RECORDFORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
