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
 * AwsS3BucketServerSideEncryptionRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3BucketServerSideEncryptionRuleMarshaller {

    private static final MarshallingInfo<StructuredPojo> APPLYSERVERSIDEENCRYPTIONBYDEFAULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplyServerSideEncryptionByDefault").build();

    private static final AwsS3BucketServerSideEncryptionRuleMarshaller instance = new AwsS3BucketServerSideEncryptionRuleMarshaller();

    public static AwsS3BucketServerSideEncryptionRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3BucketServerSideEncryptionRule awsS3BucketServerSideEncryptionRule, ProtocolMarshaller protocolMarshaller) {

        if (awsS3BucketServerSideEncryptionRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller
                    .marshall(awsS3BucketServerSideEncryptionRule.getApplyServerSideEncryptionByDefault(), APPLYSERVERSIDEENCRYPTIONBYDEFAULT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
