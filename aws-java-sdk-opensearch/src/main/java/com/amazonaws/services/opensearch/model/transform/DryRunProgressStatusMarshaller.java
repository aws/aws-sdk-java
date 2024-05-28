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
package com.amazonaws.services.opensearch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DryRunProgressStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DryRunProgressStatusMarshaller {

    private static final MarshallingInfo<String> DRYRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRunId").build();
    private static final MarshallingInfo<String> DRYRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DryRunStatus").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> UPDATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateDate").build();
    private static final MarshallingInfo<List> VALIDATIONFAILURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationFailures").build();

    private static final DryRunProgressStatusMarshaller instance = new DryRunProgressStatusMarshaller();

    public static DryRunProgressStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DryRunProgressStatus dryRunProgressStatus, ProtocolMarshaller protocolMarshaller) {

        if (dryRunProgressStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dryRunProgressStatus.getDryRunId(), DRYRUNID_BINDING);
            protocolMarshaller.marshall(dryRunProgressStatus.getDryRunStatus(), DRYRUNSTATUS_BINDING);
            protocolMarshaller.marshall(dryRunProgressStatus.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(dryRunProgressStatus.getUpdateDate(), UPDATEDATE_BINDING);
            protocolMarshaller.marshall(dryRunProgressStatus.getValidationFailures(), VALIDATIONFAILURES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
