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
package com.amazonaws.services.finspacedata.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChangesetSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChangesetSummaryMarshaller {

    private static final MarshallingInfo<String> CHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changesetId").build();
    private static final MarshallingInfo<String> CHANGESETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changesetArn").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> CHANGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changeType").build();
    private static final MarshallingInfo<Map> SOURCEPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sourceParams").build();
    private static final MarshallingInfo<Map> FORMATPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("formatParams").build();
    private static final MarshallingInfo<Long> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createTime").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> ERRORINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorInfo").build();
    private static final MarshallingInfo<Long> ACTIVEUNTILTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeUntilTimestamp").build();
    private static final MarshallingInfo<Long> ACTIVEFROMTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeFromTimestamp").build();
    private static final MarshallingInfo<String> UPDATESCHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatesChangesetId").build();
    private static final MarshallingInfo<String> UPDATEDBYCHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedByChangesetId").build();

    private static final ChangesetSummaryMarshaller instance = new ChangesetSummaryMarshaller();

    public static ChangesetSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChangesetSummary changesetSummary, ProtocolMarshaller protocolMarshaller) {

        if (changesetSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(changesetSummary.getChangesetId(), CHANGESETID_BINDING);
            protocolMarshaller.marshall(changesetSummary.getChangesetArn(), CHANGESETARN_BINDING);
            protocolMarshaller.marshall(changesetSummary.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(changesetSummary.getChangeType(), CHANGETYPE_BINDING);
            protocolMarshaller.marshall(changesetSummary.getSourceParams(), SOURCEPARAMS_BINDING);
            protocolMarshaller.marshall(changesetSummary.getFormatParams(), FORMATPARAMS_BINDING);
            protocolMarshaller.marshall(changesetSummary.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(changesetSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(changesetSummary.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(changesetSummary.getActiveUntilTimestamp(), ACTIVEUNTILTIMESTAMP_BINDING);
            protocolMarshaller.marshall(changesetSummary.getActiveFromTimestamp(), ACTIVEFROMTIMESTAMP_BINDING);
            protocolMarshaller.marshall(changesetSummary.getUpdatesChangesetId(), UPDATESCHANGESETID_BINDING);
            protocolMarshaller.marshall(changesetSummary.getUpdatedByChangesetId(), UPDATEDBYCHANGESETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
