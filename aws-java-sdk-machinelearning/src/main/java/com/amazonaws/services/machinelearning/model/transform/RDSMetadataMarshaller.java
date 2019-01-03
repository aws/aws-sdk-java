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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RDSMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RDSMetadataMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Database").build();
    private static final MarshallingInfo<String> DATABASEUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseUserName").build();
    private static final MarshallingInfo<String> SELECTSQLQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectSqlQuery").build();
    private static final MarshallingInfo<String> RESOURCEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceRole").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<String> DATAPIPELINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataPipelineId").build();

    private static final RDSMetadataMarshaller instance = new RDSMetadataMarshaller();

    public static RDSMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RDSMetadata rDSMetadata, ProtocolMarshaller protocolMarshaller) {

        if (rDSMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rDSMetadata.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(rDSMetadata.getDatabaseUserName(), DATABASEUSERNAME_BINDING);
            protocolMarshaller.marshall(rDSMetadata.getSelectSqlQuery(), SELECTSQLQUERY_BINDING);
            protocolMarshaller.marshall(rDSMetadata.getResourceRole(), RESOURCEROLE_BINDING);
            protocolMarshaller.marshall(rDSMetadata.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(rDSMetadata.getDataPipelineId(), DATAPIPELINEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
