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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRdsDbClusterMemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbClusterMemberMarshaller {

    private static final MarshallingInfo<Boolean> ISCLUSTERWRITER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsClusterWriter").build();
    private static final MarshallingInfo<Integer> PROMOTIONTIER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PromotionTier").build();
    private static final MarshallingInfo<String> DBINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstanceIdentifier").build();
    private static final MarshallingInfo<String> DBCLUSTERPARAMETERGROUPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterParameterGroupStatus").build();

    private static final AwsRdsDbClusterMemberMarshaller instance = new AwsRdsDbClusterMemberMarshaller();

    public static AwsRdsDbClusterMemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbClusterMember awsRdsDbClusterMember, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbClusterMember == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbClusterMember.getIsClusterWriter(), ISCLUSTERWRITER_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterMember.getPromotionTier(), PROMOTIONTIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterMember.getDbInstanceIdentifier(), DBINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterMember.getDbClusterParameterGroupStatus(), DBCLUSTERPARAMETERGROUPSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
