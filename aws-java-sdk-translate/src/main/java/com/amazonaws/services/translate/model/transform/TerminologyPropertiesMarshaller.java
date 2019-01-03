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
package com.amazonaws.services.translate.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.translate.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TerminologyPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TerminologyPropertiesMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> SOURCELANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLanguageCode").build();
    private static final MarshallingInfo<List> TARGETLANGUAGECODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetLanguageCodes").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKey").build();
    private static final MarshallingInfo<Integer> SIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeBytes").build();
    private static final MarshallingInfo<Integer> TERMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TermCount").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").timestampFormat("unixTimestamp").build();

    private static final TerminologyPropertiesMarshaller instance = new TerminologyPropertiesMarshaller();

    public static TerminologyPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TerminologyProperties terminologyProperties, ProtocolMarshaller protocolMarshaller) {

        if (terminologyProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(terminologyProperties.getName(), NAME_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getSourceLanguageCode(), SOURCELANGUAGECODE_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getTargetLanguageCodes(), TARGETLANGUAGECODES_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getSizeBytes(), SIZEBYTES_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getTermCount(), TERMCOUNT_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(terminologyProperties.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
