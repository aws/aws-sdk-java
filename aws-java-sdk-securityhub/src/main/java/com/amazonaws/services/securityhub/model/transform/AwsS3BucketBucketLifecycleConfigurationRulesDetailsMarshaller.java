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
 * AwsS3BucketBucketLifecycleConfigurationRulesDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3BucketBucketLifecycleConfigurationRulesDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ABORTINCOMPLETEMULTIPARTUPLOAD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AbortIncompleteMultipartUpload").build();
    private static final MarshallingInfo<String> EXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationDate").build();
    private static final MarshallingInfo<Integer> EXPIRATIONINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationInDays").build();
    private static final MarshallingInfo<Boolean> EXPIREDOBJECTDELETEMARKER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiredObjectDeleteMarker").build();
    private static final MarshallingInfo<StructuredPojo> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filter").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ID").build();
    private static final MarshallingInfo<Integer> NONCURRENTVERSIONEXPIRATIONINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoncurrentVersionExpirationInDays").build();
    private static final MarshallingInfo<List> NONCURRENTVERSIONTRANSITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoncurrentVersionTransitions").build();
    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Prefix").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<List> TRANSITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Transitions").build();

    private static final AwsS3BucketBucketLifecycleConfigurationRulesDetailsMarshaller instance = new AwsS3BucketBucketLifecycleConfigurationRulesDetailsMarshaller();

    public static AwsS3BucketBucketLifecycleConfigurationRulesDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3BucketBucketLifecycleConfigurationRulesDetails awsS3BucketBucketLifecycleConfigurationRulesDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsS3BucketBucketLifecycleConfigurationRulesDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getAbortIncompleteMultipartUpload(),
                    ABORTINCOMPLETEMULTIPARTUPLOAD_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getExpirationInDays(), EXPIRATIONINDAYS_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getExpiredObjectDeleteMarker(), EXPIREDOBJECTDELETEMARKER_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getID(), ID_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getNoncurrentVersionExpirationInDays(),
                    NONCURRENTVERSIONEXPIRATIONINDAYS_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getNoncurrentVersionTransitions(),
                    NONCURRENTVERSIONTRANSITIONS_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getPrefix(), PREFIX_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsS3BucketBucketLifecycleConfigurationRulesDetails.getTransitions(), TRANSITIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
