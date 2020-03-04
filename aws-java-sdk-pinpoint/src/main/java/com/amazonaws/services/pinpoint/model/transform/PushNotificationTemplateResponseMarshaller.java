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
 * PushNotificationTemplateResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PushNotificationTemplateResponseMarshaller {

    private static final MarshallingInfo<StructuredPojo> ADM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ADM").build();
    private static final MarshallingInfo<StructuredPojo> APNS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("APNS").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<StructuredPojo> BAIDU_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Baidu").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Default").build();
    private static final MarshallingInfo<String> DEFAULTSUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSubstitutions").build();
    private static final MarshallingInfo<StructuredPojo> GCM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GCM").build();
    private static final MarshallingInfo<String> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();
    private static final MarshallingInfo<String> RECOMMENDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommenderId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TEMPLATEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateDescription").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateName").build();
    private static final MarshallingInfo<String> TEMPLATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateType").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();

    private static final PushNotificationTemplateResponseMarshaller instance = new PushNotificationTemplateResponseMarshaller();

    public static PushNotificationTemplateResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PushNotificationTemplateResponse pushNotificationTemplateResponse, ProtocolMarshaller protocolMarshaller) {

        if (pushNotificationTemplateResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getADM(), ADM_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getAPNS(), APNS_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getBaidu(), BAIDU_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getDefault(), DEFAULT_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getDefaultSubstitutions(), DEFAULTSUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getGCM(), GCM_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getRecommenderId(), RECOMMENDERID_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getTemplateDescription(), TEMPLATEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getTemplateName(), TEMPLATENAME_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getTemplateType(), TEMPLATETYPE_BINDING);
            protocolMarshaller.marshall(pushNotificationTemplateResponse.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
