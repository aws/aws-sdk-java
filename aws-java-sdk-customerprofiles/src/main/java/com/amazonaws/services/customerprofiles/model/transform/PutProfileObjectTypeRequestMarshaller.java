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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutProfileObjectTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutProfileObjectTypeRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> OBJECTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ObjectTypeName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> TEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateId").build();
    private static final MarshallingInfo<Integer> EXPIRATIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationDays").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKey").build();
    private static final MarshallingInfo<Boolean> ALLOWPROFILECREATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowProfileCreation").build();
    private static final MarshallingInfo<Map> FIELDS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Fields").build();
    private static final MarshallingInfo<Map> KEYS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keys").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final PutProfileObjectTypeRequestMarshaller instance = new PutProfileObjectTypeRequestMarshaller();

    public static PutProfileObjectTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutProfileObjectTypeRequest putProfileObjectTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (putProfileObjectTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getObjectTypeName(), OBJECTTYPENAME_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getTemplateId(), TEMPLATEID_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getExpirationDays(), EXPIRATIONDAYS_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getAllowProfileCreation(), ALLOWPROFILECREATION_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getFields(), FIELDS_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getKeys(), KEYS_BINDING);
            protocolMarshaller.marshall(putProfileObjectTypeRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
