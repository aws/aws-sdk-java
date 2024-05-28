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
package com.amazonaws.services.accessanalyzer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> EXTERNALACCESSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalAccessDetails").build();
    private static final MarshallingInfo<StructuredPojo> UNUSEDPERMISSIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unusedPermissionDetails").build();
    private static final MarshallingInfo<StructuredPojo> UNUSEDIAMUSERACCESSKEYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unusedIamUserAccessKeyDetails").build();
    private static final MarshallingInfo<StructuredPojo> UNUSEDIAMROLEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unusedIamRoleDetails").build();
    private static final MarshallingInfo<StructuredPojo> UNUSEDIAMUSERPASSWORDDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unusedIamUserPasswordDetails").build();

    private static final FindingDetailsMarshaller instance = new FindingDetailsMarshaller();

    public static FindingDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindingDetails findingDetails, ProtocolMarshaller protocolMarshaller) {

        if (findingDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findingDetails.getExternalAccessDetails(), EXTERNALACCESSDETAILS_BINDING);
            protocolMarshaller.marshall(findingDetails.getUnusedPermissionDetails(), UNUSEDPERMISSIONDETAILS_BINDING);
            protocolMarshaller.marshall(findingDetails.getUnusedIamUserAccessKeyDetails(), UNUSEDIAMUSERACCESSKEYDETAILS_BINDING);
            protocolMarshaller.marshall(findingDetails.getUnusedIamRoleDetails(), UNUSEDIAMROLEDETAILS_BINDING);
            protocolMarshaller.marshall(findingDetails.getUnusedIamUserPasswordDetails(), UNUSEDIAMUSERPASSWORDDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
