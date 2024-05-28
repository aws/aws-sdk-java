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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModifyMigrationProjectRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModifyMigrationProjectRequestMarshaller {

    private static final MarshallingInfo<String> MIGRATIONPROJECTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationProjectIdentifier").build();
    private static final MarshallingInfo<String> MIGRATIONPROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationProjectName").build();
    private static final MarshallingInfo<List> SOURCEDATAPROVIDERDESCRIPTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceDataProviderDescriptors").build();
    private static final MarshallingInfo<List> TARGETDATAPROVIDERDESCRIPTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDataProviderDescriptors").build();
    private static final MarshallingInfo<String> INSTANCEPROFILEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileIdentifier").build();
    private static final MarshallingInfo<String> TRANSFORMATIONRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformationRules").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMACONVERSIONAPPLICATIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaConversionApplicationAttributes").build();

    private static final ModifyMigrationProjectRequestMarshaller instance = new ModifyMigrationProjectRequestMarshaller();

    public static ModifyMigrationProjectRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModifyMigrationProjectRequest modifyMigrationProjectRequest, ProtocolMarshaller protocolMarshaller) {

        if (modifyMigrationProjectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modifyMigrationProjectRequest.getMigrationProjectIdentifier(), MIGRATIONPROJECTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(modifyMigrationProjectRequest.getMigrationProjectName(), MIGRATIONPROJECTNAME_BINDING);
            protocolMarshaller.marshall(modifyMigrationProjectRequest.getSourceDataProviderDescriptors(), SOURCEDATAPROVIDERDESCRIPTORS_BINDING);
            protocolMarshaller.marshall(modifyMigrationProjectRequest.getTargetDataProviderDescriptors(), TARGETDATAPROVIDERDESCRIPTORS_BINDING);
            protocolMarshaller.marshall(modifyMigrationProjectRequest.getInstanceProfileIdentifier(), INSTANCEPROFILEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(modifyMigrationProjectRequest.getTransformationRules(), TRANSFORMATIONRULES_BINDING);
            protocolMarshaller.marshall(modifyMigrationProjectRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller
                    .marshall(modifyMigrationProjectRequest.getSchemaConversionApplicationAttributes(), SCHEMACONVERSIONAPPLICATIONATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
