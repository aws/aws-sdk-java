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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UnprocessedStandardsControlAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UnprocessedStandardsControlAssociationMarshaller {

    private static final MarshallingInfo<StructuredPojo> STANDARDSCONTROLASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardsControlAssociationId").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<String> ERRORREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorReason").build();

    private static final UnprocessedStandardsControlAssociationMarshaller instance = new UnprocessedStandardsControlAssociationMarshaller();

    public static UnprocessedStandardsControlAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UnprocessedStandardsControlAssociation unprocessedStandardsControlAssociation, ProtocolMarshaller protocolMarshaller) {

        if (unprocessedStandardsControlAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(unprocessedStandardsControlAssociation.getStandardsControlAssociationId(), STANDARDSCONTROLASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(unprocessedStandardsControlAssociation.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(unprocessedStandardsControlAssociation.getErrorReason(), ERRORREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
