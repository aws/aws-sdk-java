/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PushNotificationTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PushNotificationTemplateRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ADM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ADM").build();
    private static final MarshallingInfo<StructuredPojo> APNS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("APNS").build();
    private static final MarshallingInfo<StructuredPojo> BAIDU_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Baidu").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Default").build();
    private static final MarshallingInfo<String> DEFAULTSUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSubstitutions").build();
    private static final MarshallingInfo<StructuredPojo> GCM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GCM").build();
    private static final MarshallingInfo<String> RECOMMENDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommenderId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TEMPLATEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateDescription").build();

    private static final PushNotificationTemplateRequestMarshaller instance = new PushNotificationTemplateRequestMarshaller();

    public static PushNotificationTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PushNotificationTemplateRequest pushNotificationTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (pushNotificationTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getADM(), ADM_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getAPNS(), APNS_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getBaidu(), BAIDU_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getDefault(), DEFAULT_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getDefaultSubstitutions(), DEFAULTSUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getGCM(), GCM_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getRecommenderId(), RECOMMENDERID_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateRequest.getTemplateDescription(), TEMPLATEDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
