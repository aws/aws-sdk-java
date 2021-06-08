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
package com.amazonaws.services.finspacedata.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChangesetInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChangesetInfoMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> CHANGESETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changesetArn").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> CHANGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changeType").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceType").build();
    private static final MarshallingInfo<Map> SOURCEPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sourceParams").build();
    private static final MarshallingInfo<String> FORMATTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("formatType").build();
    private static final MarshallingInfo<Map> FORMATPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("formatParams").build();
    private static final MarshallingInfo<java.util.Date> CREATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> ERRORINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorInfo").build();
    private static final MarshallingInfo<Map> CHANGESETLABELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("changesetLabels").build();
    private static final MarshallingInfo<String> UPDATESCHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatesChangesetId").build();
    private static final MarshallingInfo<String> UPDATEDBYCHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedByChangesetId").build();

    private static final ChangesetInfoMarshaller instance = new ChangesetInfoMarshaller();

    public static ChangesetInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChangesetInfo changesetInfo, ProtocolMarshaller protocolMarshaller) {

        if (changesetInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(changesetInfo.getId(), ID_BINDING);
            protocolMarshaller.marshall(changesetInfo.getChangesetArn(), CHANGESETARN_BINDING);
            protocolMarshaller.marshall(changesetInfo.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(changesetInfo.getChangeType(), CHANGETYPE_BINDING);
            protocolMarshaller.marshall(changesetInfo.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(changesetInfo.getSourceParams(), SOURCEPARAMS_BINDING);
            protocolMarshaller.marshall(changesetInfo.getFormatType(), FORMATTYPE_BINDING);
            protocolMarshaller.marshall(changesetInfo.getFormatParams(), FORMATPARAMS_BINDING);
            protocolMarshaller.marshall(changesetInfo.getCreateTimestamp(), CREATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(changesetInfo.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(changesetInfo.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(changesetInfo.getChangesetLabels(), CHANGESETLABELS_BINDING);
            protocolMarshaller.marshall(changesetInfo.getUpdatesChangesetId(), UPDATESCHANGESETID_BINDING);
            protocolMarshaller.marshall(changesetInfo.getUpdatedByChangesetId(), UPDATEDBYCHANGESETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
