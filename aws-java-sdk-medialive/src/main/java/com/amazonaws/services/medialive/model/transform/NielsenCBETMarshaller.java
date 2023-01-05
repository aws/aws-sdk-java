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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NielsenCBETMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NielsenCBETMarshaller {

    private static final MarshallingInfo<String> CBETCHECKDIGITSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cbetCheckDigitString").build();
    private static final MarshallingInfo<String> CBETSTEPASIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cbetStepaside").build();
    private static final MarshallingInfo<String> CSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("csid").build();

    private static final NielsenCBETMarshaller instance = new NielsenCBETMarshaller();

    public static NielsenCBETMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NielsenCBET nielsenCBET, ProtocolMarshaller protocolMarshaller) {

        if (nielsenCBET == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nielsenCBET.getCbetCheckDigitString(), CBETCHECKDIGITSTRING_BINDING);
            protocolMarshaller.marshall(nielsenCBET.getCbetStepaside(), CBETSTEPASIDE_BINDING);
            protocolMarshaller.marshall(nielsenCBET.getCsid(), CSID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
