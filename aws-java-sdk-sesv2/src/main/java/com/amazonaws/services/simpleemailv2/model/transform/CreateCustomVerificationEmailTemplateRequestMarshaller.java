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
package com.amazonaws.services.simpleemailv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCustomVerificationEmailTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCustomVerificationEmailTemplateRequestMarshaller {

    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateName").build();
    private static final MarshallingInfo<String> FROMEMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromEmailAddress").build();
    private static final MarshallingInfo<String> TEMPLATESUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateSubject").build();
    private static final MarshallingInfo<String> TEMPLATECONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateContent").build();
    private static final MarshallingInfo<String> SUCCESSREDIRECTIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuccessRedirectionURL").build();
    private static final MarshallingInfo<String> FAILUREREDIRECTIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureRedirectionURL").build();

    private static final CreateCustomVerificationEmailTemplateRequestMarshaller instance = new CreateCustomVerificationEmailTemplateRequestMarshaller();

    public static CreateCustomVerificationEmailTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCustomVerificationEmailTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCustomVerificationEmailTemplateRequest.getTemplateName(), TEMPLATENAME_BINDING);
            protocolMarshaller.marshall(createCustomVerificationEmailTemplateRequest.getFromEmailAddress(), FROMEMAILADDRESS_BINDING);
            protocolMarshaller.marshall(createCustomVerificationEmailTemplateRequest.getTemplateSubject(), TEMPLATESUBJECT_BINDING);
            protocolMarshaller.marshall(createCustomVerificationEmailTemplateRequest.getTemplateContent(), TEMPLATECONTENT_BINDING);
            protocolMarshaller.marshall(createCustomVerificationEmailTemplateRequest.getSuccessRedirectionURL(), SUCCESSREDIRECTIONURL_BINDING);
            protocolMarshaller.marshall(createCustomVerificationEmailTemplateRequest.getFailureRedirectionURL(), FAILUREREDIRECTIONURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
