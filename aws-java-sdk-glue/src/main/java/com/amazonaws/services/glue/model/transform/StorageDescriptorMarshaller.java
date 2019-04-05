/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StorageDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StorageDescriptorMarshaller {

    private static final MarshallingInfo<List> COLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Columns").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Location").build();
    private static final MarshallingInfo<String> INPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputFormat").build();
    private static final MarshallingInfo<String> OUTPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputFormat").build();
    private static final MarshallingInfo<Boolean> COMPRESSED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compressed").build();
    private static final MarshallingInfo<Integer> NUMBEROFBUCKETS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfBuckets").build();
    private static final MarshallingInfo<StructuredPojo> SERDEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SerdeInfo").build();
    private static final MarshallingInfo<List> BUCKETCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BucketColumns").build();
    private static final MarshallingInfo<List> SORTCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortColumns").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<StructuredPojo> SKEWEDINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkewedInfo").build();
    private static final MarshallingInfo<Boolean> STOREDASSUBDIRECTORIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoredAsSubDirectories").build();

    private static final StorageDescriptorMarshaller instance = new StorageDescriptorMarshaller();

    public static StorageDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StorageDescriptor storageDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (storageDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(storageDescriptor.getColumns(), COLUMNS_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getInputFormat(), INPUTFORMAT_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getOutputFormat(), OUTPUTFORMAT_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getCompressed(), COMPRESSED_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getNumberOfBuckets(), NUMBEROFBUCKETS_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getSerdeInfo(), SERDEINFO_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getBucketColumns(), BUCKETCOLUMNS_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getSortColumns(), SORTCOLUMNS_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getSkewedInfo(), SKEWEDINFO_BINDING);
            protocolMarshaller.marshall(storageDescriptor.getStoredAsSubDirectories(), STOREDASSUBDIRECTORIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
