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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HubInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HubInfoMarshaller {

    private static final MarshallingInfo<String> HUBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HubName").build();
    private static final MarshallingInfo<String> HUBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HubArn").build();
    private static final MarshallingInfo<String> HUBDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubDisplayName").build();
    private static final MarshallingInfo<String> HUBDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubDescription").build();
    private static final MarshallingInfo<List> HUBSEARCHKEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubSearchKeywords").build();
    private static final MarshallingInfo<String> HUBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HubStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final HubInfoMarshaller instance = new HubInfoMarshaller();

    public static HubInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HubInfo hubInfo, ProtocolMarshaller protocolMarshaller) {

        if (hubInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hubInfo.getHubName(), HUBNAME_BINDING);
            protocolMarshaller.marshall(hubInfo.getHubArn(), HUBARN_BINDING);
            protocolMarshaller.marshall(hubInfo.getHubDisplayName(), HUBDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(hubInfo.getHubDescription(), HUBDESCRIPTION_BINDING);
            protocolMarshaller.marshall(hubInfo.getHubSearchKeywords(), HUBSEARCHKEYWORDS_BINDING);
            protocolMarshaller.marshall(hubInfo.getHubStatus(), HUBSTATUS_BINDING);
            protocolMarshaller.marshall(hubInfo.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(hubInfo.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
