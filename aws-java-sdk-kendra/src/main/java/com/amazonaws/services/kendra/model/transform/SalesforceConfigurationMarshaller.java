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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SalesforceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SalesforceConfigurationMarshaller {

    private static final MarshallingInfo<String> SERVERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ServerUrl").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<List> STANDARDOBJECTCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardObjectConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> KNOWLEDGEARTICLECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KnowledgeArticleConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CHATTERFEEDCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChatterFeedConfiguration").build();
    private static final MarshallingInfo<Boolean> CRAWLATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlAttachments").build();
    private static final MarshallingInfo<StructuredPojo> STANDARDOBJECTATTACHMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardObjectAttachmentConfiguration").build();
    private static final MarshallingInfo<List> INCLUDEATTACHMENTFILEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeAttachmentFilePatterns").build();
    private static final MarshallingInfo<List> EXCLUDEATTACHMENTFILEPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeAttachmentFilePatterns").build();

    private static final SalesforceConfigurationMarshaller instance = new SalesforceConfigurationMarshaller();

    public static SalesforceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SalesforceConfiguration salesforceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (salesforceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(salesforceConfiguration.getServerUrl(), SERVERURL_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getStandardObjectConfigurations(), STANDARDOBJECTCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getKnowledgeArticleConfiguration(), KNOWLEDGEARTICLECONFIGURATION_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getChatterFeedConfiguration(), CHATTERFEEDCONFIGURATION_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getCrawlAttachments(), CRAWLATTACHMENTS_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getStandardObjectAttachmentConfiguration(), STANDARDOBJECTATTACHMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getIncludeAttachmentFilePatterns(), INCLUDEATTACHMENTFILEPATTERNS_BINDING);
            protocolMarshaller.marshall(salesforceConfiguration.getExcludeAttachmentFilePatterns(), EXCLUDEATTACHMENTFILEPATTERNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
