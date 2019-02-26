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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentDescriptionMarshaller {

    private static final MarshallingInfo<String> SHA1_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sha1").build();
    private static final MarshallingInfo<String> HASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hash").build();
    private static final MarshallingInfo<String> HASHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HashType").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> VERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VersionName").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Owner").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusInformation").build();
    private static final MarshallingInfo<String> DOCUMENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentVersion").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Parameters").build();
    private static final MarshallingInfo<List> PLATFORMTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PlatformTypes").build();
    private static final MarshallingInfo<String> DOCUMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentType").build();
    private static final MarshallingInfo<String> SCHEMAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaVersion").build();
    private static final MarshallingInfo<String> LATESTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersion").build();
    private static final MarshallingInfo<String> DEFAULTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultVersion").build();
    private static final MarshallingInfo<String> DOCUMENTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentFormat").build();
    private static final MarshallingInfo<String> TARGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<List> ATTACHMENTSINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentsInformation").build();

    private static final DocumentDescriptionMarshaller instance = new DocumentDescriptionMarshaller();

    public static DocumentDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DocumentDescription documentDescription, ProtocolMarshaller protocolMarshaller) {

        if (documentDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(documentDescription.getSha1(), SHA1_BINDING);
            protocolMarshaller.marshall(documentDescription.getHash(), HASH_BINDING);
            protocolMarshaller.marshall(documentDescription.getHashType(), HASHTYPE_BINDING);
            protocolMarshaller.marshall(documentDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(documentDescription.getVersionName(), VERSIONNAME_BINDING);
            protocolMarshaller.marshall(documentDescription.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(documentDescription.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(documentDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(documentDescription.getStatusInformation(), STATUSINFORMATION_BINDING);
            protocolMarshaller.marshall(documentDescription.getDocumentVersion(), DOCUMENTVERSION_BINDING);
            protocolMarshaller.marshall(documentDescription.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(documentDescription.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(documentDescription.getPlatformTypes(), PLATFORMTYPES_BINDING);
            protocolMarshaller.marshall(documentDescription.getDocumentType(), DOCUMENTTYPE_BINDING);
            protocolMarshaller.marshall(documentDescription.getSchemaVersion(), SCHEMAVERSION_BINDING);
            protocolMarshaller.marshall(documentDescription.getLatestVersion(), LATESTVERSION_BINDING);
            protocolMarshaller.marshall(documentDescription.getDefaultVersion(), DEFAULTVERSION_BINDING);
            protocolMarshaller.marshall(documentDescription.getDocumentFormat(), DOCUMENTFORMAT_BINDING);
            protocolMarshaller.marshall(documentDescription.getTargetType(), TARGETTYPE_BINDING);
            protocolMarshaller.marshall(documentDescription.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(documentDescription.getAttachmentsInformation(), ATTACHMENTSINFORMATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
