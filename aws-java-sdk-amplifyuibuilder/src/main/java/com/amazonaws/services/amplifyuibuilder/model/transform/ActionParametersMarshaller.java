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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANCHOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anchor").build();
    private static final MarshallingInfo<Map> FIELDS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fields").build();
    private static final MarshallingInfo<StructuredPojo> GLOBAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("global").build();
    private static final MarshallingInfo<StructuredPojo> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("id").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("model").build();
    private static final MarshallingInfo<StructuredPojo> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("state").build();
    private static final MarshallingInfo<StructuredPojo> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("target").build();
    private static final MarshallingInfo<StructuredPojo> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("type").build();
    private static final MarshallingInfo<StructuredPojo> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("url").build();

    private static final ActionParametersMarshaller instance = new ActionParametersMarshaller();

    public static ActionParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionParameters actionParameters, ProtocolMarshaller protocolMarshaller) {

        if (actionParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionParameters.getAnchor(), ANCHOR_BINDING);
            protocolMarshaller.marshall(actionParameters.getFields(), FIELDS_BINDING);
            protocolMarshaller.marshall(actionParameters.getGlobal(), GLOBAL_BINDING);
            protocolMarshaller.marshall(actionParameters.getId(), ID_BINDING);
            protocolMarshaller.marshall(actionParameters.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(actionParameters.getState(), STATE_BINDING);
            protocolMarshaller.marshall(actionParameters.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(actionParameters.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(actionParameters.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
