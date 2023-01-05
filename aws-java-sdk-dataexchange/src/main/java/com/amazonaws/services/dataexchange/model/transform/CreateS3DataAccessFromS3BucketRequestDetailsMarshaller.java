/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateS3DataAccessFromS3BucketRequestDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateS3DataAccessFromS3BucketRequestDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ASSETSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssetSource").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionId").build();

    private static final CreateS3DataAccessFromS3BucketRequestDetailsMarshaller instance = new CreateS3DataAccessFromS3BucketRequestDetailsMarshaller();

    public static CreateS3DataAccessFromS3BucketRequestDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateS3DataAccessFromS3BucketRequestDetails createS3DataAccessFromS3BucketRequestDetails, ProtocolMarshaller protocolMarshaller) {

        if (createS3DataAccessFromS3BucketRequestDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createS3DataAccessFromS3BucketRequestDetails.getAssetSource(), ASSETSOURCE_BINDING);
            protocolMarshaller.marshall(createS3DataAccessFromS3BucketRequestDetails.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(createS3DataAccessFromS3BucketRequestDetails.getRevisionId(), REVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
