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
package com.amazonaws.services.waf.model.waf.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.waf.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegexMatchTupleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegexMatchTupleMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDTOMATCH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldToMatch").build();
    private static final MarshallingInfo<String> TEXTTRANSFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextTransformation").build();
    private static final MarshallingInfo<String> REGEXPATTERNSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegexPatternSetId").build();

    private static final RegexMatchTupleMarshaller instance = new RegexMatchTupleMarshaller();

    public static RegexMatchTupleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegexMatchTuple regexMatchTuple, ProtocolMarshaller protocolMarshaller) {

        if (regexMatchTuple == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(regexMatchTuple.getFieldToMatch(), FIELDTOMATCH_BINDING);
            protocolMarshaller.marshall(regexMatchTuple.getTextTransformation(), TEXTTRANSFORMATION_BINDING);
            protocolMarshaller.marshall(regexMatchTuple.getRegexPatternSetId(), REGEXPATTERNSETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
