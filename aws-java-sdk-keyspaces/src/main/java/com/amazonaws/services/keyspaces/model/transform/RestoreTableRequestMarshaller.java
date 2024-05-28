/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.keyspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.keyspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RestoreTableRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTableRequestMarshaller {

    private static final MarshallingInfo<String> SOURCEKEYSPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceKeyspaceName").build();
    private static final MarshallingInfo<String> SOURCETABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceTableName").build();
    private static final MarshallingInfo<String> TARGETKEYSPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetKeyspaceName").build();
    private static final MarshallingInfo<String> TARGETTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetTableName").build();
    private static final MarshallingInfo<java.util.Date> RESTORETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("restoreTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> CAPACITYSPECIFICATIONOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacitySpecificationOverride").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONSPECIFICATIONOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionSpecificationOverride").build();
    private static final MarshallingInfo<StructuredPojo> POINTINTIMERECOVERYOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pointInTimeRecoveryOverride").build();
    private static final MarshallingInfo<List> TAGSOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagsOverride").build();
    private static final MarshallingInfo<StructuredPojo> AUTOSCALINGSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingSpecification").build();
    private static final MarshallingInfo<List> REPLICASPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicaSpecifications").build();

    private static final RestoreTableRequestMarshaller instance = new RestoreTableRequestMarshaller();

    public static RestoreTableRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTableRequest restoreTableRequest, ProtocolMarshaller protocolMarshaller) {

        if (restoreTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTableRequest.getSourceKeyspaceName(), SOURCEKEYSPACENAME_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getSourceTableName(), SOURCETABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getTargetKeyspaceName(), TARGETKEYSPACENAME_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getTargetTableName(), TARGETTABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getRestoreTimestamp(), RESTORETIMESTAMP_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getCapacitySpecificationOverride(), CAPACITYSPECIFICATIONOVERRIDE_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getEncryptionSpecificationOverride(), ENCRYPTIONSPECIFICATIONOVERRIDE_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getPointInTimeRecoveryOverride(), POINTINTIMERECOVERYOVERRIDE_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getTagsOverride(), TAGSOVERRIDE_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getAutoScalingSpecification(), AUTOSCALINGSPECIFICATION_BINDING);
            protocolMarshaller.marshall(restoreTableRequest.getReplicaSpecifications(), REPLICASPECIFICATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
