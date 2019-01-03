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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodeContentDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodeContentDescriptionMarshaller {

    private static final MarshallingInfo<String> TEXTCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextContent").build();
    private static final MarshallingInfo<String> CODEMD5_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodeMD5").build();
    private static final MarshallingInfo<Long> CODESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodeSize").build();
    private static final MarshallingInfo<StructuredPojo> S3APPLICATIONCODELOCATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ApplicationCodeLocationDescription").build();

    private static final CodeContentDescriptionMarshaller instance = new CodeContentDescriptionMarshaller();

    public static CodeContentDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodeContentDescription codeContentDescription, ProtocolMarshaller protocolMarshaller) {

        if (codeContentDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codeContentDescription.getTextContent(), TEXTCONTENT_BINDING);
            protocolMarshaller.marshall(codeContentDescription.getCodeMD5(), CODEMD5_BINDING);
            protocolMarshaller.marshall(codeContentDescription.getCodeSize(), CODESIZE_BINDING);
            protocolMarshaller.marshall(codeContentDescription.getS3ApplicationCodeLocationDescription(), S3APPLICATIONCODELOCATIONDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
