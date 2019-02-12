/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WebhookMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WebhookMarshaller {

    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("url").build();
    private static final MarshallingInfo<String> PAYLOADURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("payloadUrl").build();
    private static final MarshallingInfo<String> SECRET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("secret").build();
    private static final MarshallingInfo<String> BRANCHFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("branchFilter").build();
    private static final MarshallingInfo<List> FILTERGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filterGroups").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDSECRET_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedSecret").timestampFormat("unixTimestamp").build();

    private static final WebhookMarshaller instance = new WebhookMarshaller();

    public static WebhookMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Webhook webhook, ProtocolMarshaller protocolMarshaller) {

        if (webhook == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(webhook.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(webhook.getPayloadUrl(), PAYLOADURL_BINDING);
            protocolMarshaller.marshall(webhook.getSecret(), SECRET_BINDING);
            protocolMarshaller.marshall(webhook.getBranchFilter(), BRANCHFILTER_BINDING);
            protocolMarshaller.marshall(webhook.getFilterGroups(), FILTERGROUPS_BINDING);
            protocolMarshaller.marshall(webhook.getLastModifiedSecret(), LASTMODIFIEDSECRET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
