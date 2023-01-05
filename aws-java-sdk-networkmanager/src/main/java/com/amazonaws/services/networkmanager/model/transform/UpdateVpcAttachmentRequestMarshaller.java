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
package com.amazonaws.services.networkmanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateVpcAttachmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateVpcAttachmentRequestMarshaller {

    private static final MarshallingInfo<String> ATTACHMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("attachmentId").build();
    private static final MarshallingInfo<List> ADDSUBNETARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AddSubnetArns").build();
    private static final MarshallingInfo<List> REMOVESUBNETARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveSubnetArns").build();
    private static final MarshallingInfo<StructuredPojo> OPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Options").build();

    private static final UpdateVpcAttachmentRequestMarshaller instance = new UpdateVpcAttachmentRequestMarshaller();

    public static UpdateVpcAttachmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateVpcAttachmentRequest updateVpcAttachmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateVpcAttachmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateVpcAttachmentRequest.getAttachmentId(), ATTACHMENTID_BINDING);
            protocolMarshaller.marshall(updateVpcAttachmentRequest.getAddSubnetArns(), ADDSUBNETARNS_BINDING);
            protocolMarshaller.marshall(updateVpcAttachmentRequest.getRemoveSubnetArns(), REMOVESUBNETARNS_BINDING);
            protocolMarshaller.marshall(updateVpcAttachmentRequest.getOptions(), OPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
