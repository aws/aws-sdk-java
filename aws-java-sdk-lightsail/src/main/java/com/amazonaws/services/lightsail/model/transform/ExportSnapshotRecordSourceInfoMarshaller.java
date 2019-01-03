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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportSnapshotRecordSourceInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportSnapshotRecordSourceInfoMarshaller {

    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> FROMRESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromResourceName").build();
    private static final MarshallingInfo<String> FROMRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromResourceArn").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCESNAPSHOTINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceSnapshotInfo").build();
    private static final MarshallingInfo<StructuredPojo> DISKSNAPSHOTINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("diskSnapshotInfo").build();

    private static final ExportSnapshotRecordSourceInfoMarshaller instance = new ExportSnapshotRecordSourceInfoMarshaller();

    public static ExportSnapshotRecordSourceInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportSnapshotRecordSourceInfo exportSnapshotRecordSourceInfo, ProtocolMarshaller protocolMarshaller) {

        if (exportSnapshotRecordSourceInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getName(), NAME_BINDING);
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getFromResourceName(), FROMRESOURCENAME_BINDING);
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getFromResourceArn(), FROMRESOURCEARN_BINDING);
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getInstanceSnapshotInfo(), INSTANCESNAPSHOTINFO_BINDING);
            protocolMarshaller.marshall(exportSnapshotRecordSourceInfo.getDiskSnapshotInfo(), DISKSNAPSHOTINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
