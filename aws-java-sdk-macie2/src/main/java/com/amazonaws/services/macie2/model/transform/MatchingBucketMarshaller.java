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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MatchingBucketMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MatchingBucketMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketName").build();
    private static final MarshallingInfo<Long> CLASSIFIABLEOBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("classifiableObjectCount").build();
    private static final MarshallingInfo<Long> CLASSIFIABLESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("classifiableSizeInBytes").build();
    private static final MarshallingInfo<StructuredPojo> JOBDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobDetails").build();
    private static final MarshallingInfo<Long> OBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("objectCount").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTCOUNTBYENCRYPTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("objectCountByEncryptionType").build();
    private static final MarshallingInfo<Long> SIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sizeInBytes").build();
    private static final MarshallingInfo<Long> SIZEINBYTESCOMPRESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeInBytesCompressed").build();
    private static final MarshallingInfo<StructuredPojo> UNCLASSIFIABLEOBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unclassifiableObjectCount").build();
    private static final MarshallingInfo<StructuredPojo> UNCLASSIFIABLEOBJECTSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unclassifiableObjectSizeInBytes").build();

    private static final MatchingBucketMarshaller instance = new MatchingBucketMarshaller();

    public static MatchingBucketMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MatchingBucket matchingBucket, ProtocolMarshaller protocolMarshaller) {

        if (matchingBucket == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(matchingBucket.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(matchingBucket.getBucketName(), BUCKETNAME_BINDING);
            protocolMarshaller.marshall(matchingBucket.getClassifiableObjectCount(), CLASSIFIABLEOBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(matchingBucket.getClassifiableSizeInBytes(), CLASSIFIABLESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(matchingBucket.getJobDetails(), JOBDETAILS_BINDING);
            protocolMarshaller.marshall(matchingBucket.getObjectCount(), OBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(matchingBucket.getObjectCountByEncryptionType(), OBJECTCOUNTBYENCRYPTIONTYPE_BINDING);
            protocolMarshaller.marshall(matchingBucket.getSizeInBytes(), SIZEINBYTES_BINDING);
            protocolMarshaller.marshall(matchingBucket.getSizeInBytesCompressed(), SIZEINBYTESCOMPRESSED_BINDING);
            protocolMarshaller.marshall(matchingBucket.getUnclassifiableObjectCount(), UNCLASSIFIABLEOBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(matchingBucket.getUnclassifiableObjectSizeInBytes(), UNCLASSIFIABLEOBJECTSIZEINBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
