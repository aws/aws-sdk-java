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
package com.amazonaws.services.gluedatabrew.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendProjectSessionActionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendProjectSessionActionRequestMarshaller {

    private static final MarshallingInfo<Boolean> PREVIEW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Preview").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> RECIPESTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecipeStep").build();
    private static final MarshallingInfo<Integer> STEPINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepIndex").build();
    private static final MarshallingInfo<String> CLIENTSESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientSessionId").build();
    private static final MarshallingInfo<StructuredPojo> VIEWFRAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewFrame").build();

    private static final SendProjectSessionActionRequestMarshaller instance = new SendProjectSessionActionRequestMarshaller();

    public static SendProjectSessionActionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendProjectSessionActionRequest sendProjectSessionActionRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendProjectSessionActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendProjectSessionActionRequest.getPreview(), PREVIEW_BINDING);
            protocolMarshaller.marshall(sendProjectSessionActionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(sendProjectSessionActionRequest.getRecipeStep(), RECIPESTEP_BINDING);
            protocolMarshaller.marshall(sendProjectSessionActionRequest.getStepIndex(), STEPINDEX_BINDING);
            protocolMarshaller.marshall(sendProjectSessionActionRequest.getClientSessionId(), CLIENTSESSIONID_BINDING);
            protocolMarshaller.marshall(sendProjectSessionActionRequest.getViewFrame(), VIEWFRAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
