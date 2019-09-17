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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.serverlessapplicationrepository.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VersionMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").build();
    private static final MarshallingInfo<List> PARAMETERDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterDefinitions").build();
    private static final MarshallingInfo<List> REQUIREDCAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requiredCapabilities").build();
    private static final MarshallingInfo<Boolean> RESOURCESSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourcesSupported").build();
    private static final MarshallingInfo<String> SEMANTICVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("semanticVersion").build();
    private static final MarshallingInfo<String> SOURCECODEARCHIVEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeArchiveUrl").build();
    private static final MarshallingInfo<String> SOURCECODEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeUrl").build();
    private static final MarshallingInfo<String> TEMPLATEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateUrl").build();

    private static final VersionMarshaller instance = new VersionMarshaller();

    public static VersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Version version, ProtocolMarshaller protocolMarshaller) {

        if (version == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(version.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(version.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(version.getParameterDefinitions(), PARAMETERDEFINITIONS_BINDING);
            protocolMarshaller.marshall(version.getRequiredCapabilities(), REQUIREDCAPABILITIES_BINDING);
            protocolMarshaller.marshall(version.getResourcesSupported(), RESOURCESSUPPORTED_BINDING);
            protocolMarshaller.marshall(version.getSemanticVersion(), SEMANTICVERSION_BINDING);
            protocolMarshaller.marshall(version.getSourceCodeArchiveUrl(), SOURCECODEARCHIVEURL_BINDING);
            protocolMarshaller.marshall(version.getSourceCodeUrl(), SOURCECODEURL_BINDING);
            protocolMarshaller.marshall(version.getTemplateUrl(), TEMPLATEURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
