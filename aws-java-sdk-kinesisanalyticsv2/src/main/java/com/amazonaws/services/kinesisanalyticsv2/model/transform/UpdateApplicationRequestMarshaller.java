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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateApplicationRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationName").build();
    private static final MarshallingInfo<Long> CURRENTAPPLICATIONVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentApplicationVersionId").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationConfigurationUpdate").build();
    private static final MarshallingInfo<String> SERVICEEXECUTIONROLEUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceExecutionRoleUpdate").build();
    private static final MarshallingInfo<StructuredPojo> RUNCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunConfigurationUpdate").build();
    private static final MarshallingInfo<List> CLOUDWATCHLOGGINGOPTIONUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptionUpdates").build();

    private static final UpdateApplicationRequestMarshaller instance = new UpdateApplicationRequestMarshaller();

    public static UpdateApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateApplicationRequest updateApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateApplicationRequest.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getCurrentApplicationVersionId(), CURRENTAPPLICATIONVERSIONID_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getApplicationConfigurationUpdate(), APPLICATIONCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getServiceExecutionRoleUpdate(), SERVICEEXECUTIONROLEUPDATE_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getRunConfigurationUpdate(), RUNCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getCloudWatchLoggingOptionUpdates(), CLOUDWATCHLOGGINGOPTIONUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
