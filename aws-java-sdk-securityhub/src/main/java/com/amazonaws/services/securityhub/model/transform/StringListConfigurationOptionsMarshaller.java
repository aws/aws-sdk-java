/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StringListConfigurationOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StringListConfigurationOptionsMarshaller {

    private static final MarshallingInfo<List> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DefaultValue").build();
    private static final MarshallingInfo<String> RE2EXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Re2Expression").build();
    private static final MarshallingInfo<Integer> MAXITEMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxItems").build();
    private static final MarshallingInfo<String> EXPRESSIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpressionDescription").build();

    private static final StringListConfigurationOptionsMarshaller instance = new StringListConfigurationOptionsMarshaller();

    public static StringListConfigurationOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StringListConfigurationOptions stringListConfigurationOptions, ProtocolMarshaller protocolMarshaller) {

        if (stringListConfigurationOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stringListConfigurationOptions.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(stringListConfigurationOptions.getRe2Expression(), RE2EXPRESSION_BINDING);
            protocolMarshaller.marshall(stringListConfigurationOptions.getMaxItems(), MAXITEMS_BINDING);
            protocolMarshaller.marshall(stringListConfigurationOptions.getExpressionDescription(), EXPRESSIONDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
