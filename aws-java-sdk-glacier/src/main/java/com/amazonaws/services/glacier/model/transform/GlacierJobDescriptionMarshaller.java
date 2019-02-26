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
package com.amazonaws.services.glacier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GlacierJobDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GlacierJobDescriptionMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<String> JOBDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobDescription").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> ARCHIVEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ArchiveId").build();
    private static final MarshallingInfo<String> VAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VaultARN").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<Boolean> COMPLETED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Completed").build();
    private static final MarshallingInfo<String> STATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusCode").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<Long> ARCHIVESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchiveSizeInBytes").build();
    private static final MarshallingInfo<Long> INVENTORYSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InventorySizeInBytes").build();
    private static final MarshallingInfo<String> SNSTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SNSTopic").build();
    private static final MarshallingInfo<String> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").build();
    private static final MarshallingInfo<String> SHA256TREEHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SHA256TreeHash").build();
    private static final MarshallingInfo<String> ARCHIVESHA256TREEHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchiveSHA256TreeHash").build();
    private static final MarshallingInfo<String> RETRIEVALBYTERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrievalByteRange").build();
    private static final MarshallingInfo<String> TIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tier").build();
    private static final MarshallingInfo<StructuredPojo> INVENTORYRETRIEVALPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InventoryRetrievalParameters").build();
    private static final MarshallingInfo<String> JOBOUTPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobOutputPath").build();
    private static final MarshallingInfo<StructuredPojo> SELECTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectParameters").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputLocation").build();

    private static final GlacierJobDescriptionMarshaller instance = new GlacierJobDescriptionMarshaller();

    public static GlacierJobDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GlacierJobDescription glacierJobDescription, ProtocolMarshaller protocolMarshaller) {

        if (glacierJobDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(glacierJobDescription.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getJobDescription(), JOBDESCRIPTION_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getArchiveId(), ARCHIVEID_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getVaultARN(), VAULTARN_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getCompleted(), COMPLETED_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getStatusCode(), STATUSCODE_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getArchiveSizeInBytes(), ARCHIVESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getInventorySizeInBytes(), INVENTORYSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getSNSTopic(), SNSTOPIC_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getSHA256TreeHash(), SHA256TREEHASH_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getArchiveSHA256TreeHash(), ARCHIVESHA256TREEHASH_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getRetrievalByteRange(), RETRIEVALBYTERANGE_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getTier(), TIER_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getInventoryRetrievalParameters(), INVENTORYRETRIEVALPARAMETERS_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getJobOutputPath(), JOBOUTPUTPATH_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getSelectParameters(), SELECTPARAMETERS_BINDING);
            protocolMarshaller.marshall(glacierJobDescription.getOutputLocation(), OUTPUTLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
