/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BucketMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BucketMetadataMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bucketArn").build();
    private static final MarshallingInfo<java.util.Date> BUCKETCREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketCreatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketName").build();
    private static final MarshallingInfo<Long> CLASSIFIABLEOBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("classifiableObjectCount").build();
    private static final MarshallingInfo<Long> CLASSIFIABLESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("classifiableSizeInBytes").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdated").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Long> OBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("objectCount").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTCOUNTBYENCRYPTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("objectCountByEncryptionType").build();
    private static final MarshallingInfo<StructuredPojo> PUBLICACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicAccess").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<StructuredPojo> REPLICATIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationDetails").build();
    private static final MarshallingInfo<String> SHAREDACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sharedAccess").build();
    private static final MarshallingInfo<Long> SIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sizeInBytes").build();
    private static final MarshallingInfo<Long> SIZEINBYTESCOMPRESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeInBytesCompressed").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> UNCLASSIFIABLEOBJECTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unclassifiableObjectCount").build();
    private static final MarshallingInfo<StructuredPojo> UNCLASSIFIABLEOBJECTSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unclassifiableObjectSizeInBytes").build();
    private static final MarshallingInfo<Boolean> VERSIONING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versioning").build();

    private static final BucketMetadataMarshaller instance = new BucketMetadataMarshaller();

    public static BucketMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BucketMetadata bucketMetadata, ProtocolMarshaller protocolMarshaller) {

        if (bucketMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bucketMetadata.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getBucketArn(), BUCKETARN_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getBucketCreatedAt(), BUCKETCREATEDAT_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getBucketName(), BUCKETNAME_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getClassifiableObjectCount(), CLASSIFIABLEOBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getClassifiableSizeInBytes(), CLASSIFIABLESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getObjectCount(), OBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getObjectCountByEncryptionType(), OBJECTCOUNTBYENCRYPTIONTYPE_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getPublicAccess(), PUBLICACCESS_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getReplicationDetails(), REPLICATIONDETAILS_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getSharedAccess(), SHAREDACCESS_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getSizeInBytes(), SIZEINBYTES_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getSizeInBytesCompressed(), SIZEINBYTESCOMPRESSED_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getUnclassifiableObjectCount(), UNCLASSIFIABLEOBJECTCOUNT_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getUnclassifiableObjectSizeInBytes(), UNCLASSIFIABLEOBJECTSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(bucketMetadata.getVersioning(), VERSIONING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
