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
package com.amazonaws.services.dataexchange.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportAssetFromSignedUrlResponseDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportAssetFromSignedUrlResponseDetailsMarshaller {

    private static final MarshallingInfo<String> ASSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AssetName").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<String> MD5HASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Md5Hash").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionId").build();
    private static final MarshallingInfo<String> SIGNEDURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SignedUrl").build();
    private static final MarshallingInfo<java.util.Date> SIGNEDURLEXPIRESAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SignedUrlExpiresAt").timestampFormat("iso8601").build();

    private static final ImportAssetFromSignedUrlResponseDetailsMarshaller instance = new ImportAssetFromSignedUrlResponseDetailsMarshaller();

    public static ImportAssetFromSignedUrlResponseDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportAssetFromSignedUrlResponseDetails importAssetFromSignedUrlResponseDetails, ProtocolMarshaller protocolMarshaller) {

        if (importAssetFromSignedUrlResponseDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importAssetFromSignedUrlResponseDetails.getAssetName(), ASSETNAME_BINDING);
            protocolMarshaller.marshall(importAssetFromSignedUrlResponseDetails.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(importAssetFromSignedUrlResponseDetails.getMd5Hash(), MD5HASH_BINDING);
            protocolMarshaller.marshall(importAssetFromSignedUrlResponseDetails.getRevisionId(), REVISIONID_BINDING);
            protocolMarshaller.marshall(importAssetFromSignedUrlResponseDetails.getSignedUrl(), SIGNEDURL_BINDING);
            protocolMarshaller.marshall(importAssetFromSignedUrlResponseDetails.getSignedUrlExpiresAt(), SIGNEDURLEXPIRESAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
