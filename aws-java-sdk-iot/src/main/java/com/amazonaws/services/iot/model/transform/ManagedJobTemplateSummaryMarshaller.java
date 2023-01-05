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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ManagedJobTemplateSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ManagedJobTemplateSummaryMarshaller {

    private static final MarshallingInfo<String> TEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateArn").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> ENVIRONMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("environments").build();
    private static final MarshallingInfo<String> TEMPLATEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateVersion").build();

    private static final ManagedJobTemplateSummaryMarshaller instance = new ManagedJobTemplateSummaryMarshaller();

    public static ManagedJobTemplateSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ManagedJobTemplateSummary managedJobTemplateSummary, ProtocolMarshaller protocolMarshaller) {

        if (managedJobTemplateSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(managedJobTemplateSummary.getTemplateArn(), TEMPLATEARN_BINDING);
            protocolMarshaller.marshall(managedJobTemplateSummary.getTemplateName(), TEMPLATENAME_BINDING);
            protocolMarshaller.marshall(managedJobTemplateSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(managedJobTemplateSummary.getEnvironments(), ENVIRONMENTS_BINDING);
            protocolMarshaller.marshall(managedJobTemplateSummary.getTemplateVersion(), TEMPLATEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
