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
package com.amazonaws.services.secretsmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.secretsmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetRandomPasswordRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetRandomPasswordRequestMarshaller {

    private static final MarshallingInfo<Long> PASSWORDLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PasswordLength").build();
    private static final MarshallingInfo<String> EXCLUDECHARACTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeCharacters").build();
    private static final MarshallingInfo<Boolean> EXCLUDENUMBERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeNumbers").build();
    private static final MarshallingInfo<Boolean> EXCLUDEPUNCTUATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludePunctuation").build();
    private static final MarshallingInfo<Boolean> EXCLUDEUPPERCASE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeUppercase").build();
    private static final MarshallingInfo<Boolean> EXCLUDELOWERCASE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeLowercase").build();
    private static final MarshallingInfo<Boolean> INCLUDESPACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeSpace").build();
    private static final MarshallingInfo<Boolean> REQUIREEACHINCLUDEDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireEachIncludedType").build();

    private static final GetRandomPasswordRequestMarshaller instance = new GetRandomPasswordRequestMarshaller();

    public static GetRandomPasswordRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetRandomPasswordRequest getRandomPasswordRequest, ProtocolMarshaller protocolMarshaller) {

        if (getRandomPasswordRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getRandomPasswordRequest.getPasswordLength(), PASSWORDLENGTH_BINDING);
            protocolMarshaller.marshall(getRandomPasswordRequest.getExcludeCharacters(), EXCLUDECHARACTERS_BINDING);
            protocolMarshaller.marshall(getRandomPasswordRequest.getExcludeNumbers(), EXCLUDENUMBERS_BINDING);
            protocolMarshaller.marshall(getRandomPasswordRequest.getExcludePunctuation(), EXCLUDEPUNCTUATION_BINDING);
            protocolMarshaller.marshall(getRandomPasswordRequest.getExcludeUppercase(), EXCLUDEUPPERCASE_BINDING);
            protocolMarshaller.marshall(getRandomPasswordRequest.getExcludeLowercase(), EXCLUDELOWERCASE_BINDING);
            protocolMarshaller.marshall(getRandomPasswordRequest.getIncludeSpace(), INCLUDESPACE_BINDING);
            protocolMarshaller.marshall(getRandomPasswordRequest.getRequireEachIncludedType(), REQUIREEACHINCLUDEDTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
