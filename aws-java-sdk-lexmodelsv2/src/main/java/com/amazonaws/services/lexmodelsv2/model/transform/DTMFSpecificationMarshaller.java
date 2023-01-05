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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DTMFSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DTMFSpecificationMarshaller {

    private static final MarshallingInfo<Integer> MAXLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxLength").build();
    private static final MarshallingInfo<Integer> ENDTIMEOUTMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTimeoutMs").build();
    private static final MarshallingInfo<String> DELETIONCHARACTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deletionCharacter").build();
    private static final MarshallingInfo<String> ENDCHARACTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endCharacter").build();

    private static final DTMFSpecificationMarshaller instance = new DTMFSpecificationMarshaller();

    public static DTMFSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DTMFSpecification dTMFSpecification, ProtocolMarshaller protocolMarshaller) {

        if (dTMFSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dTMFSpecification.getMaxLength(), MAXLENGTH_BINDING);
            protocolMarshaller.marshall(dTMFSpecification.getEndTimeoutMs(), ENDTIMEOUTMS_BINDING);
            protocolMarshaller.marshall(dTMFSpecification.getDeletionCharacter(), DELETIONCHARACTER_BINDING);
            protocolMarshaller.marshall(dTMFSpecification.getEndCharacter(), ENDCHARACTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
