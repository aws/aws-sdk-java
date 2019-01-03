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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionExecutionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionExecutionMarshaller {

    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("summary").build();
    private static final MarshallingInfo<java.util.Date> LASTSTATUSCHANGE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStatusChange").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("token").build();
    private static final MarshallingInfo<String> LASTUPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedBy").build();
    private static final MarshallingInfo<String> EXTERNALEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionId").build();
    private static final MarshallingInfo<String> EXTERNALEXECUTIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionUrl").build();
    private static final MarshallingInfo<Integer> PERCENTCOMPLETE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("percentComplete").build();
    private static final MarshallingInfo<StructuredPojo> ERRORDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorDetails").build();

    private static final ActionExecutionMarshaller instance = new ActionExecutionMarshaller();

    public static ActionExecutionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionExecution actionExecution, ProtocolMarshaller protocolMarshaller) {

        if (actionExecution == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionExecution.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(actionExecution.getSummary(), SUMMARY_BINDING);
            protocolMarshaller.marshall(actionExecution.getLastStatusChange(), LASTSTATUSCHANGE_BINDING);
            protocolMarshaller.marshall(actionExecution.getToken(), TOKEN_BINDING);
            protocolMarshaller.marshall(actionExecution.getLastUpdatedBy(), LASTUPDATEDBY_BINDING);
            protocolMarshaller.marshall(actionExecution.getExternalExecutionId(), EXTERNALEXECUTIONID_BINDING);
            protocolMarshaller.marshall(actionExecution.getExternalExecutionUrl(), EXTERNALEXECUTIONURL_BINDING);
            protocolMarshaller.marshall(actionExecution.getPercentComplete(), PERCENTCOMPLETE_BINDING);
            protocolMarshaller.marshall(actionExecution.getErrorDetails(), ERRORDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
