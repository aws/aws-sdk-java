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
 * ConfluenceSpaceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfluenceSpaceConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> CRAWLPERSONALSPACES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlPersonalSpaces").build();
    private static final MarshallingInfo<Boolean> CRAWLARCHIVEDSPACES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlArchivedSpaces").build();
    private static final MarshallingInfo<List> INCLUDESPACES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IncludeSpaces").build();
    private static final MarshallingInfo<List> EXCLUDESPACES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExcludeSpaces").build();
    private static final MarshallingInfo<List> SPACEFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpaceFieldMappings").build();

    private static final ConfluenceSpaceConfigurationMarshaller instance = new ConfluenceSpaceConfigurationMarshaller();

    public static ConfluenceSpaceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfluenceSpaceConfiguration confluenceSpaceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (confluenceSpaceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(confluenceSpaceConfiguration.getCrawlPersonalSpaces(), CRAWLPERSONALSPACES_BINDING);
            protocolMarshaller.marshall(confluenceSpaceConfiguration.getCrawlArchivedSpaces(), CRAWLARCHIVEDSPACES_BINDING);
            protocolMarshaller.marshall(confluenceSpaceConfiguration.getIncludeSpaces(), INCLUDESPACES_BINDING);
            protocolMarshaller.marshall(confluenceSpaceConfiguration.getExcludeSpaces(), EXCLUDESPACES_BINDING);
            protocolMarshaller.marshall(confluenceSpaceConfiguration.getSpaceFieldMappings(), SPACEFIELDMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
