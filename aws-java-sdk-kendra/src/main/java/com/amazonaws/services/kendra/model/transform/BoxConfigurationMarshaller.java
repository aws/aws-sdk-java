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
 * BoxConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BoxConfigurationMarshaller {

    private static final MarshallingInfo<String> ENTERPRISEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnterpriseId").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<Boolean> USECHANGELOG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseChangeLog").build();
    private static final MarshallingInfo<Boolean> CRAWLCOMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlComments").build();
    private static final MarshallingInfo<Boolean> CRAWLTASKS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlTasks").build();
    private static final MarshallingInfo<Boolean> CRAWLWEBLINKS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlWebLinks").build();
    private static final MarshallingInfo<List> FILEFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileFieldMappings").build();
    private static final MarshallingInfo<List> TASKFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskFieldMappings").build();
    private static final MarshallingInfo<List> COMMENTFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommentFieldMappings").build();
    private static final MarshallingInfo<List> WEBLINKFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebLinkFieldMappings").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();

    private static final BoxConfigurationMarshaller instance = new BoxConfigurationMarshaller();

    public static BoxConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BoxConfiguration boxConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (boxConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(boxConfiguration.getEnterpriseId(), ENTERPRISEID_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getUseChangeLog(), USECHANGELOG_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getCrawlComments(), CRAWLCOMMENTS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getCrawlTasks(), CRAWLTASKS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getCrawlWebLinks(), CRAWLWEBLINKS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getFileFieldMappings(), FILEFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getTaskFieldMappings(), TASKFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getCommentFieldMappings(), COMMENTFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getWebLinkFieldMappings(), WEBLINKFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(boxConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
