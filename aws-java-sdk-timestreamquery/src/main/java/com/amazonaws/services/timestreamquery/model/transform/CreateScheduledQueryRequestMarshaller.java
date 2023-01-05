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
package com.amazonaws.services.timestreamquery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateScheduledQueryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateScheduledQueryRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryString").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> TARGETCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetConfiguration").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> SCHEDULEDQUERYEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledQueryExecutionRoleArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<StructuredPojo> ERRORREPORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorReportConfiguration").build();

    private static final CreateScheduledQueryRequestMarshaller instance = new CreateScheduledQueryRequestMarshaller();

    public static CreateScheduledQueryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateScheduledQueryRequest createScheduledQueryRequest, ProtocolMarshaller protocolMarshaller) {

        if (createScheduledQueryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createScheduledQueryRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getScheduleConfiguration(), SCHEDULECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getNotificationConfiguration(), NOTIFICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getTargetConfiguration(), TARGETCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getScheduledQueryExecutionRoleArn(), SCHEDULEDQUERYEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createScheduledQueryRequest.getErrorReportConfiguration(), ERRORREPORTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
