/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConformancePackStatusDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConformancePackStatusDetailMarshaller {

    private static final MarshallingInfo<String> CONFORMANCEPACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackName").build();
    private static final MarshallingInfo<String> CONFORMANCEPACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackId").build();
    private static final MarshallingInfo<String> CONFORMANCEPACKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackArn").build();
    private static final MarshallingInfo<String> CONFORMANCEPACKSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackState").build();
    private static final MarshallingInfo<String> STACKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackArn").build();
    private static final MarshallingInfo<String> CONFORMANCEPACKSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackStatusReason").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEREQUESTEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateRequestedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATECOMPLETEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateCompletedTime").timestampFormat("unixTimestamp").build();

    private static final ConformancePackStatusDetailMarshaller instance = new ConformancePackStatusDetailMarshaller();

    public static ConformancePackStatusDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConformancePackStatusDetail conformancePackStatusDetail, ProtocolMarshaller protocolMarshaller) {

        if (conformancePackStatusDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conformancePackStatusDetail.getConformancePackName(), CONFORMANCEPACKNAME_BINDING);
            protocolMarshaller.marshall(conformancePackStatusDetail.getConformancePackId(), CONFORMANCEPACKID_BINDING);
            protocolMarshaller.marshall(conformancePackStatusDetail.getConformancePackArn(), CONFORMANCEPACKARN_BINDING);
            protocolMarshaller.marshall(conformancePackStatusDetail.getConformancePackState(), CONFORMANCEPACKSTATE_BINDING);
            protocolMarshaller.marshall(conformancePackStatusDetail.getStackArn(), STACKARN_BINDING);
            protocolMarshaller.marshall(conformancePackStatusDetail.getConformancePackStatusReason(), CONFORMANCEPACKSTATUSREASON_BINDING);
            protocolMarshaller.marshall(conformancePackStatusDetail.getLastUpdateRequestedTime(), LASTUPDATEREQUESTEDTIME_BINDING);
            protocolMarshaller.marshall(conformancePackStatusDetail.getLastUpdateCompletedTime(), LASTUPDATECOMPLETEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
