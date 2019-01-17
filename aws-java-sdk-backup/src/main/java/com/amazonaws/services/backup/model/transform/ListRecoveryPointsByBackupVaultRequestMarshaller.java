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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListRecoveryPointsByBackupVaultRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRecoveryPointsByBackupVaultRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("backupVaultName").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> BYRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> BYRESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> BYBACKUPPLANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("backupPlanId").build();
    private static final MarshallingInfo<java.util.Date> BYCREATEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("createdBefore").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> BYCREATEDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("createdAfter").timestampFormat("iso8601").build();

    private static final ListRecoveryPointsByBackupVaultRequestMarshaller instance = new ListRecoveryPointsByBackupVaultRequestMarshaller();

    public static ListRecoveryPointsByBackupVaultRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRecoveryPointsByBackupVaultRequest listRecoveryPointsByBackupVaultRequest, ProtocolMarshaller protocolMarshaller) {

        if (listRecoveryPointsByBackupVaultRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getByResourceArn(), BYRESOURCEARN_BINDING);
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getByResourceType(), BYRESOURCETYPE_BINDING);
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getByBackupPlanId(), BYBACKUPPLANID_BINDING);
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getByCreatedBefore(), BYCREATEDBEFORE_BINDING);
            protocolMarshaller.marshall(listRecoveryPointsByBackupVaultRequest.getByCreatedAfter(), BYCREATEDAFTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
