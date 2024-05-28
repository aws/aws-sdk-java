/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LogGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LogGroupMarshaller {

    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupName").build();
    private static final MarshallingInfo<Long> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("creationTime").build();
    private static final MarshallingInfo<Integer> RETENTIONINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retentionInDays").build();
    private static final MarshallingInfo<Integer> METRICFILTERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricFilterCount").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<Long> STOREDBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("storedBytes").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> DATAPROTECTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataProtectionStatus").build();
    private static final MarshallingInfo<List> INHERITEDPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inheritedProperties").build();
    private static final MarshallingInfo<String> LOGGROUPCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupClass").build();
    private static final MarshallingInfo<String> LOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupArn").build();

    private static final LogGroupMarshaller instance = new LogGroupMarshaller();

    public static LogGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LogGroup logGroup, ProtocolMarshaller protocolMarshaller) {

        if (logGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(logGroup.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(logGroup.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(logGroup.getRetentionInDays(), RETENTIONINDAYS_BINDING);
            protocolMarshaller.marshall(logGroup.getMetricFilterCount(), METRICFILTERCOUNT_BINDING);
            protocolMarshaller.marshall(logGroup.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(logGroup.getStoredBytes(), STOREDBYTES_BINDING);
            protocolMarshaller.marshall(logGroup.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(logGroup.getDataProtectionStatus(), DATAPROTECTIONSTATUS_BINDING);
            protocolMarshaller.marshall(logGroup.getInheritedProperties(), INHERITEDPROPERTIES_BINDING);
            protocolMarshaller.marshall(logGroup.getLogGroupClass(), LOGGROUPCLASS_BINDING);
            protocolMarshaller.marshall(logGroup.getLogGroupArn(), LOGGROUPARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
