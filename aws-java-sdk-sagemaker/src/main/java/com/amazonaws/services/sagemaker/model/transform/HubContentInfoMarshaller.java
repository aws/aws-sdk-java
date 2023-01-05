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
 * HubContentInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HubContentInfoMarshaller {

    private static final MarshallingInfo<String> HUBCONTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentName").build();
    private static final MarshallingInfo<String> HUBCONTENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentArn").build();
    private static final MarshallingInfo<String> HUBCONTENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentVersion").build();
    private static final MarshallingInfo<String> HUBCONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentType").build();
    private static final MarshallingInfo<String> DOCUMENTSCHEMAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentSchemaVersion").build();
    private static final MarshallingInfo<String> HUBCONTENTDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentDisplayName").build();
    private static final MarshallingInfo<String> HUBCONTENTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentDescription").build();
    private static final MarshallingInfo<List> HUBCONTENTSEARCHKEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentSearchKeywords").build();
    private static final MarshallingInfo<String> HUBCONTENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HubContentStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();

    private static final HubContentInfoMarshaller instance = new HubContentInfoMarshaller();

    public static HubContentInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HubContentInfo hubContentInfo, ProtocolMarshaller protocolMarshaller) {

        if (hubContentInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hubContentInfo.getHubContentName(), HUBCONTENTNAME_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getHubContentArn(), HUBCONTENTARN_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getHubContentVersion(), HUBCONTENTVERSION_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getHubContentType(), HUBCONTENTTYPE_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getDocumentSchemaVersion(), DOCUMENTSCHEMAVERSION_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getHubContentDisplayName(), HUBCONTENTDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getHubContentDescription(), HUBCONTENTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getHubContentSearchKeywords(), HUBCONTENTSEARCHKEYWORDS_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getHubContentStatus(), HUBCONTENTSTATUS_BINDING);
            protocolMarshaller.marshall(hubContentInfo.getCreationTime(), CREATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
