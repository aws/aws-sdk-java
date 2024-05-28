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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProcessDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProcessDetailsMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> EXECUTABLEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executablePath").build();
    private static final MarshallingInfo<String> EXECUTABLESHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executableSha256").build();
    private static final MarshallingInfo<Integer> NAMESPACEPID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespacePid").build();
    private static final MarshallingInfo<String> PWD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pwd").build();
    private static final MarshallingInfo<Integer> PID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pid").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uuid").build();
    private static final MarshallingInfo<String> PARENTUUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentUuid").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("user").build();
    private static final MarshallingInfo<Integer> USERID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userId").build();
    private static final MarshallingInfo<Integer> EUID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("euid").build();
    private static final MarshallingInfo<List> LINEAGE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lineage").build();

    private static final ProcessDetailsMarshaller instance = new ProcessDetailsMarshaller();

    public static ProcessDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProcessDetails processDetails, ProtocolMarshaller protocolMarshaller) {

        if (processDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(processDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(processDetails.getExecutablePath(), EXECUTABLEPATH_BINDING);
            protocolMarshaller.marshall(processDetails.getExecutableSha256(), EXECUTABLESHA256_BINDING);
            protocolMarshaller.marshall(processDetails.getNamespacePid(), NAMESPACEPID_BINDING);
            protocolMarshaller.marshall(processDetails.getPwd(), PWD_BINDING);
            protocolMarshaller.marshall(processDetails.getPid(), PID_BINDING);
            protocolMarshaller.marshall(processDetails.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(processDetails.getUuid(), UUID_BINDING);
            protocolMarshaller.marshall(processDetails.getParentUuid(), PARENTUUID_BINDING);
            protocolMarshaller.marshall(processDetails.getUser(), USER_BINDING);
            protocolMarshaller.marshall(processDetails.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(processDetails.getEuid(), EUID_BINDING);
            protocolMarshaller.marshall(processDetails.getLineage(), LINEAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
