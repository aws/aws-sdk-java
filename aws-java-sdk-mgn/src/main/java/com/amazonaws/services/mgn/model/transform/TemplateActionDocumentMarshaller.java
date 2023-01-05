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
package com.amazonaws.services.mgn.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TemplateActionDocumentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TemplateActionDocumentMarshaller {

    private static final MarshallingInfo<String> ACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actionID").build();
    private static final MarshallingInfo<String> ACTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionName").build();
    private static final MarshallingInfo<Boolean> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("active").build();
    private static final MarshallingInfo<String> DOCUMENTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("documentIdentifier").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("documentVersion").build();
    private static final MarshallingInfo<Boolean> MUSTSUCCEEDFORCUTOVER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mustSucceedForCutover").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operatingSystem").build();
    private static final MarshallingInfo<Integer> ORDER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("order").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("parameters").build();
    private static final MarshallingInfo<Integer> TIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutSeconds").build();

    private static final TemplateActionDocumentMarshaller instance = new TemplateActionDocumentMarshaller();

    public static TemplateActionDocumentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TemplateActionDocument templateActionDocument, ProtocolMarshaller protocolMarshaller) {

        if (templateActionDocument == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(templateActionDocument.getActionID(), ACTIONID_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getActionName(), ACTIONNAME_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getActive(), ACTIVE_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getDocumentIdentifier(), DOCUMENTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getMustSucceedForCutover(), MUSTSUCCEEDFORCUTOVER_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getOrder(), ORDER_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(templateActionDocument.getTimeoutSeconds(), TIMEOUTSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
