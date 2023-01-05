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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QuipConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QuipConfigurationMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<Boolean> CRAWLFILECOMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlFileComments").build();
    private static final MarshallingInfo<Boolean> CRAWLCHATROOMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlChatRooms").build();
    private static final MarshallingInfo<Boolean> CRAWLATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlAttachments").build();
    private static final MarshallingInfo<List> FOLDERIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FolderIds").build();
    private static final MarshallingInfo<List> THREADFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThreadFieldMappings").build();
    private static final MarshallingInfo<List> MESSAGEFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageFieldMappings").build();
    private static final MarshallingInfo<List> ATTACHMENTFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentFieldMappings").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();

    private static final QuipConfigurationMarshaller instance = new QuipConfigurationMarshaller();

    public static QuipConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QuipConfiguration quipConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (quipConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(quipConfiguration.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getCrawlFileComments(), CRAWLFILECOMMENTS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getCrawlChatRooms(), CRAWLCHATROOMS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getCrawlAttachments(), CRAWLATTACHMENTS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getFolderIds(), FOLDERIDS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getThreadFieldMappings(), THREADFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getMessageFieldMappings(), MESSAGEFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getAttachmentFieldMappings(), ATTACHMENTFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(quipConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
