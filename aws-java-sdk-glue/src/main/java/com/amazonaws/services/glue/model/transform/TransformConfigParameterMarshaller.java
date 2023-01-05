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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransformConfigParameterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransformConfigParameterMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> VALIDATIONRULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationRule").build();
    private static final MarshallingInfo<String> VALIDATIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationMessage").build();
    private static final MarshallingInfo<List> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Value").build();
    private static final MarshallingInfo<String> LISTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ListType").build();
    private static final MarshallingInfo<Boolean> ISOPTIONAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsOptional").build();

    private static final TransformConfigParameterMarshaller instance = new TransformConfigParameterMarshaller();

    public static TransformConfigParameterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransformConfigParameter transformConfigParameter, ProtocolMarshaller protocolMarshaller) {

        if (transformConfigParameter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transformConfigParameter.getName(), NAME_BINDING);
            protocolMarshaller.marshall(transformConfigParameter.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(transformConfigParameter.getValidationRule(), VALIDATIONRULE_BINDING);
            protocolMarshaller.marshall(transformConfigParameter.getValidationMessage(), VALIDATIONMESSAGE_BINDING);
            protocolMarshaller.marshall(transformConfigParameter.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(transformConfigParameter.getListType(), LISTTYPE_BINDING);
            protocolMarshaller.marshall(transformConfigParameter.getIsOptional(), ISOPTIONAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
