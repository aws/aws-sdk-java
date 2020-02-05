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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRdsDbInstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbInstanceDetailsMarshaller {

    private static final MarshallingInfo<List> ASSOCIATEDROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedRoles").build();
    private static final MarshallingInfo<String> CACERTIFICATEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CACertificateIdentifier").build();
    private static final MarshallingInfo<String> DBCLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DBClusterIdentifier").build();
    private static final MarshallingInfo<String> DBINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DBInstanceIdentifier").build();
    private static final MarshallingInfo<String> DBINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DBInstanceClass").build();
    private static final MarshallingInfo<Integer> DBINSTANCEPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstancePort").build();
    private static final MarshallingInfo<String> DBIRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbiResourceId").build();
    private static final MarshallingInfo<String> DBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DBName").build();
    private static final MarshallingInfo<Boolean> DELETIONPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionProtection").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Endpoint").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<Boolean> IAMDATABASEAUTHENTICATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IAMDatabaseAuthenticationEnabled").build();
    private static final MarshallingInfo<String> INSTANCECREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCreateTime").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PubliclyAccessible").build();
    private static final MarshallingInfo<Boolean> STORAGEENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageEncrypted").build();
    private static final MarshallingInfo<String> TDECREDENTIALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TdeCredentialArn").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSecurityGroups").build();

    private static final AwsRdsDbInstanceDetailsMarshaller instance = new AwsRdsDbInstanceDetailsMarshaller();

    public static AwsRdsDbInstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbInstanceDetails awsRdsDbInstanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbInstanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getAssociatedRoles(), ASSOCIATEDROLES_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getCACertificateIdentifier(), CACERTIFICATEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBClusterIdentifier(), DBCLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBInstanceIdentifier(), DBINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBInstanceClass(), DBINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbInstancePort(), DBINSTANCEPORT_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDbiResourceId(), DBIRESOURCEID_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDBName(), DBNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getDeletionProtection(), DELETIONPROTECTION_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getIAMDatabaseAuthenticationEnabled(), IAMDATABASEAUTHENTICATIONENABLED_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getInstanceCreateTime(), INSTANCECREATETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getStorageEncrypted(), STORAGEENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getTdeCredentialArn(), TDECREDENTIALARN_BINDING);
            protocolMarshaller.marshall(awsRdsDbInstanceDetails.getVpcSecurityGroups(), VPCSECURITYGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
