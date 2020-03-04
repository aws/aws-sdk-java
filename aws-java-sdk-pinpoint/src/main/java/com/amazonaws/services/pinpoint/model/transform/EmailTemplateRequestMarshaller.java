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
 * EmailTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EmailTemplateRequestMarshaller {

    private static final MarshallingInfo<String> DEFAULTSUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSubstitutions").build();
    private static final MarshallingInfo<String> HTMLPART_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HtmlPart").build();
    private static final MarshallingInfo<String> RECOMMENDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommenderId").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TEMPLATEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateDescription").build();
    private static final MarshallingInfo<String> TEXTPART_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextPart").build();

    private static final EmailTemplateRequestMarshaller instance = new EmailTemplateRequestMarshaller();

    public static EmailTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EmailTemplateRequest emailTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (emailTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(emailTemplateRequest.getDefaultSubstitutions(), DEFAULTSUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(emailTemplateRequest.getHtmlPart(), HTMLPART_BINDING);
            protocolMarshaller.marshall(emailTemplateRequest.getRecommenderId(), RECOMMENDERID_BINDING);
            protocolMarshaller.marshall(emailTemplateRequest.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(emailTemplateRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(emailTemplateRequest.getTemplateDescription(), TEMPLATEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(emailTemplateRequest.getTextPart(), TEXTPART_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
