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
 * EmailTemplateResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EmailTemplateResponseMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> DEFAULTSUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSubstitutions").build();
    private static final MarshallingInfo<String> HTMLPART_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HtmlPart").build();
    private static final MarshallingInfo<String> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();
    private static final MarshallingInfo<String> RECOMMENDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommenderId").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TEMPLATEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateDescription").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateName").build();
    private static final MarshallingInfo<String> TEMPLATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateType").build();
    private static final MarshallingInfo<String> TEXTPART_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TextPart").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();

    private static final EmailTemplateResponseMarshaller instance = new EmailTemplateResponseMarshaller();

    public static EmailTemplateResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EmailTemplateResponse emailTemplateResponse, ProtocolMarshaller protocolMarshaller) {

        if (emailTemplateResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(emailTemplateResponse.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getDefaultSubstitutions(), DEFAULTSUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getHtmlPart(), HTMLPART_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getRecommenderId(), RECOMMENDERID_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getTemplateDescription(), TEMPLATEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getTemplateName(), TEMPLATENAME_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getTemplateType(), TEMPLATETYPE_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getTextPart(), TEXTPART_BINDING);
            protocolMarshaller.marshall(emailTemplateResponse.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
