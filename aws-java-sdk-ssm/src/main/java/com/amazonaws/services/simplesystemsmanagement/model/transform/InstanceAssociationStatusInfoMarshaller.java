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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceAssociationStatusInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceAssociationStatusInfoMarshaller {

    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<String> ASSOCIATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationVersion").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> DETAILEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetailedStatus").build();
    private static final MarshallingInfo<String> EXECUTIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionSummary").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputUrl").build();
    private static final MarshallingInfo<String> ASSOCIATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationName").build();

    private static final InstanceAssociationStatusInfoMarshaller instance = new InstanceAssociationStatusInfoMarshaller();

    public static InstanceAssociationStatusInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceAssociationStatusInfo instanceAssociationStatusInfo, ProtocolMarshaller protocolMarshaller) {

        if (instanceAssociationStatusInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getName(), NAME_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getAssociationVersion(), ASSOCIATIONVERSION_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getExecutionDate(), EXECUTIONDATE_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getDetailedStatus(), DETAILEDSTATUS_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getExecutionSummary(), EXECUTIONSUMMARY_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getOutputUrl(), OUTPUTURL_BINDING);
            protocolMarshaller.marshall(instanceAssociationStatusInfo.getAssociationName(), ASSOCIATIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
