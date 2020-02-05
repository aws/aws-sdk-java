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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2NetworkInterfaceAttachmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2NetworkInterfaceAttachmentMarshaller {

    private static final MarshallingInfo<String> ATTACHTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachTime").build();
    private static final MarshallingInfo<String> ATTACHMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentId").build();
    private static final MarshallingInfo<Boolean> DELETEONTERMINATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteOnTermination").build();
    private static final MarshallingInfo<Integer> DEVICEINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceIndex").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> INSTANCEOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceOwnerId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final AwsEc2NetworkInterfaceAttachmentMarshaller instance = new AwsEc2NetworkInterfaceAttachmentMarshaller();

    public static AwsEc2NetworkInterfaceAttachmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2NetworkInterfaceAttachment awsEc2NetworkInterfaceAttachment, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2NetworkInterfaceAttachment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2NetworkInterfaceAttachment.getAttachTime(), ATTACHTIME_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkInterfaceAttachment.getAttachmentId(), ATTACHMENTID_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkInterfaceAttachment.getDeleteOnTermination(), DELETEONTERMINATION_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkInterfaceAttachment.getDeviceIndex(), DEVICEINDEX_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkInterfaceAttachment.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkInterfaceAttachment.getInstanceOwnerId(), INSTANCEOWNERID_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkInterfaceAttachment.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
