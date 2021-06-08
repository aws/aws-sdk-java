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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateIntentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateIntentRequestMarshaller {

    private static final MarshallingInfo<String> INTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> PARENTINTENTSIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentIntentSignature").build();
    private static final MarshallingInfo<List> SAMPLEUTTERANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleUtterances").build();
    private static final MarshallingInfo<StructuredPojo> DIALOGCODEHOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialogCodeHook").build();
    private static final MarshallingInfo<StructuredPojo> FULFILLMENTCODEHOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fulfillmentCodeHook").build();
    private static final MarshallingInfo<StructuredPojo> INTENTCONFIRMATIONSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentConfirmationSetting").build();
    private static final MarshallingInfo<StructuredPojo> INTENTCLOSINGSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentClosingSetting").build();
    private static final MarshallingInfo<List> INPUTCONTEXTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputContexts").build();
    private static final MarshallingInfo<List> OUTPUTCONTEXTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputContexts").build();
    private static final MarshallingInfo<StructuredPojo> KENDRACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kendraConfiguration").build();
    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("localeId").build();

    private static final CreateIntentRequestMarshaller instance = new CreateIntentRequestMarshaller();

    public static CreateIntentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateIntentRequest createIntentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createIntentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createIntentRequest.getIntentName(), INTENTNAME_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getParentIntentSignature(), PARENTINTENTSIGNATURE_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getSampleUtterances(), SAMPLEUTTERANCES_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getDialogCodeHook(), DIALOGCODEHOOK_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getFulfillmentCodeHook(), FULFILLMENTCODEHOOK_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getIntentConfirmationSetting(), INTENTCONFIRMATIONSETTING_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getIntentClosingSetting(), INTENTCLOSINGSETTING_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getInputContexts(), INPUTCONTEXTS_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getOutputContexts(), OUTPUTCONTEXTS_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getKendraConfiguration(), KENDRACONFIGURATION_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(createIntentRequest.getLocaleId(), LOCALEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
