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
 * WorkDocsConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkDocsConfigurationMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationId").build();
    private static final MarshallingInfo<Boolean> CRAWLCOMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlComments").build();
    private static final MarshallingInfo<Boolean> USECHANGELOG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseChangeLog").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<List> FIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldMappings").build();

    private static final WorkDocsConfigurationMarshaller instance = new WorkDocsConfigurationMarshaller();

    public static WorkDocsConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkDocsConfiguration workDocsConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (workDocsConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workDocsConfiguration.getOrganizationId(), ORGANIZATIONID_BINDING);
            protocolMarshaller.marshall(workDocsConfiguration.getCrawlComments(), CRAWLCOMMENTS_BINDING);
            protocolMarshaller.marshall(workDocsConfiguration.getUseChangeLog(), USECHANGELOG_BINDING);
            protocolMarshaller.marshall(workDocsConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(workDocsConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(workDocsConfiguration.getFieldMappings(), FIELDMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
