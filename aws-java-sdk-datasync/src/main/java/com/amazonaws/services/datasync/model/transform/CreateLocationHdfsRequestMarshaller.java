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
package com.amazonaws.services.datasync.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLocationHdfsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLocationHdfsRequestMarshaller {

    private static final MarshallingInfo<String> SUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subdirectory").build();
    private static final MarshallingInfo<List> NAMENODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NameNodes").build();
    private static final MarshallingInfo<Integer> BLOCKSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockSize").build();
    private static final MarshallingInfo<Integer> REPLICATIONFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationFactor").build();
    private static final MarshallingInfo<String> KMSKEYPROVIDERURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KmsKeyProviderUri").build();
    private static final MarshallingInfo<StructuredPojo> QOPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QopConfiguration").build();
    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationType").build();
    private static final MarshallingInfo<String> SIMPLEUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SimpleUser").build();
    private static final MarshallingInfo<String> KERBEROSPRINCIPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KerberosPrincipal").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> KERBEROSKEYTAB_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KerberosKeytab").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> KERBEROSKRB5CONF_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KerberosKrb5Conf").build();
    private static final MarshallingInfo<List> AGENTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AgentArns").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateLocationHdfsRequestMarshaller instance = new CreateLocationHdfsRequestMarshaller();

    public static CreateLocationHdfsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLocationHdfsRequest createLocationHdfsRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLocationHdfsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLocationHdfsRequest.getSubdirectory(), SUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getNameNodes(), NAMENODES_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getBlockSize(), BLOCKSIZE_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getReplicationFactor(), REPLICATIONFACTOR_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getKmsKeyProviderUri(), KMSKEYPROVIDERURI_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getQopConfiguration(), QOPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getSimpleUser(), SIMPLEUSER_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getKerberosPrincipal(), KERBEROSPRINCIPAL_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getKerberosKeytab(), KERBEROSKEYTAB_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getKerberosKrb5Conf(), KERBEROSKRB5CONF_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getAgentArns(), AGENTARNS_BINDING);
            protocolMarshaller.marshall(createLocationHdfsRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
