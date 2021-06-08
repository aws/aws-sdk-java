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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BuildGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BuildGroupMarshaller {

    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identifier").build();
    private static final MarshallingInfo<List> DEPENDSON_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dependsOn").build();
    private static final MarshallingInfo<Boolean> IGNOREFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ignoreFailure").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTBUILDSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentBuildSummary").build();
    private static final MarshallingInfo<List> PRIORBUILDSUMMARYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("priorBuildSummaryList").build();

    private static final BuildGroupMarshaller instance = new BuildGroupMarshaller();

    public static BuildGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BuildGroup buildGroup, ProtocolMarshaller protocolMarshaller) {

        if (buildGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(buildGroup.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(buildGroup.getDependsOn(), DEPENDSON_BINDING);
            protocolMarshaller.marshall(buildGroup.getIgnoreFailure(), IGNOREFAILURE_BINDING);
            protocolMarshaller.marshall(buildGroup.getCurrentBuildSummary(), CURRENTBUILDSUMMARY_BINDING);
            protocolMarshaller.marshall(buildGroup.getPriorBuildSummaryList(), PRIORBUILDSUMMARYLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
