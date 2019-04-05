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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OTAUpdateFileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OTAUpdateFileMarshaller {

    private static final MarshallingInfo<String> FILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fileName").build();
    private static final MarshallingInfo<String> FILEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileVersion").build();
    private static final MarshallingInfo<StructuredPojo> FILELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileLocation").build();
    private static final MarshallingInfo<StructuredPojo> CODESIGNING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codeSigning").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();

    private static final OTAUpdateFileMarshaller instance = new OTAUpdateFileMarshaller();

    public static OTAUpdateFileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OTAUpdateFile oTAUpdateFile, ProtocolMarshaller protocolMarshaller) {

        if (oTAUpdateFile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oTAUpdateFile.getFileName(), FILENAME_BINDING);
            protocolMarshaller.marshall(oTAUpdateFile.getFileVersion(), FILEVERSION_BINDING);
            protocolMarshaller.marshall(oTAUpdateFile.getFileLocation(), FILELOCATION_BINDING);
            protocolMarshaller.marshall(oTAUpdateFile.getCodeSigning(), CODESIGNING_BINDING);
            protocolMarshaller.marshall(oTAUpdateFile.getAttributes(), ATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
