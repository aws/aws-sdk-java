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
 * AwsElbLoadBalancerAccessLogMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElbLoadBalancerAccessLogMarshaller {

    private static final MarshallingInfo<Integer> EMITINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmitInterval").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> S3BUCKETPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketPrefix").build();

    private static final AwsElbLoadBalancerAccessLogMarshaller instance = new AwsElbLoadBalancerAccessLogMarshaller();

    public static AwsElbLoadBalancerAccessLogMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElbLoadBalancerAccessLog awsElbLoadBalancerAccessLog, ProtocolMarshaller protocolMarshaller) {

        if (awsElbLoadBalancerAccessLog == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElbLoadBalancerAccessLog.getEmitInterval(), EMITINTERVAL_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerAccessLog.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerAccessLog.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerAccessLog.getS3BucketPrefix(), S3BUCKETPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
