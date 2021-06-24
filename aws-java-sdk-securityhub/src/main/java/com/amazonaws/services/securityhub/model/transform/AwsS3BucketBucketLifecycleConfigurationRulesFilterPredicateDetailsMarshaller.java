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
 * AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetailsMarshaller {

    private static final MarshallingInfo<List> OPERANDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Operands").build();
    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Prefix").build();
    private static final MarshallingInfo<StructuredPojo> TAG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tag").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetailsMarshaller instance = new AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetailsMarshaller();

    public static AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails awsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails.getOperands(), OPERANDS_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails.getPrefix(), PREFIX_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails.getTag(), TAG_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
