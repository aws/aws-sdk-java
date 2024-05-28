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
package com.amazonaws.services.dataexchange.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScopeDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScopeDetailsMarshaller {

    private static final MarshallingInfo<List> LAKEFORMATIONTAGPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LakeFormationTagPolicies").build();
    private static final MarshallingInfo<List> REDSHIFTDATASHARES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftDataShares").build();
    private static final MarshallingInfo<List> S3DATAACCESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DataAccesses").build();

    private static final ScopeDetailsMarshaller instance = new ScopeDetailsMarshaller();

    public static ScopeDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScopeDetails scopeDetails, ProtocolMarshaller protocolMarshaller) {

        if (scopeDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scopeDetails.getLakeFormationTagPolicies(), LAKEFORMATIONTAGPOLICIES_BINDING);
            protocolMarshaller.marshall(scopeDetails.getRedshiftDataShares(), REDSHIFTDATASHARES_BINDING);
            protocolMarshaller.marshall(scopeDetails.getS3DataAccesses(), S3DATAACCESSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
