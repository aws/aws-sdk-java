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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2NetworkAclDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2NetworkAclDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ISDEFAULT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsDefault").build();
    private static final MarshallingInfo<String> NETWORKACLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkAclId").build();
    private static final MarshallingInfo<String> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<List> ASSOCIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Associations").build();
    private static final MarshallingInfo<List> ENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Entries").build();

    private static final AwsEc2NetworkAclDetailsMarshaller instance = new AwsEc2NetworkAclDetailsMarshaller();

    public static AwsEc2NetworkAclDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2NetworkAclDetails awsEc2NetworkAclDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2NetworkAclDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2NetworkAclDetails.getIsDefault(), ISDEFAULT_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclDetails.getNetworkAclId(), NETWORKACLID_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclDetails.getOwnerId(), OWNERID_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclDetails.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclDetails.getAssociations(), ASSOCIATIONS_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclDetails.getEntries(), ENTRIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
