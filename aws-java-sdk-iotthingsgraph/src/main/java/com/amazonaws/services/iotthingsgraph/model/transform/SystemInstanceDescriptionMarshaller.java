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
package com.amazonaws.services.iotthingsgraph.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotthingsgraph.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SystemInstanceDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SystemInstanceDescriptionMarshaller {

    private static final MarshallingInfo<StructuredPojo> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("summary").build();
    private static final MarshallingInfo<StructuredPojo> DEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("definition").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketName").build();
    private static final MarshallingInfo<StructuredPojo> METRICSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricsConfiguration").build();
    private static final MarshallingInfo<Long> VALIDATEDNAMESPACEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validatedNamespaceVersion").build();
    private static final MarshallingInfo<List> VALIDATEDDEPENDENCYREVISIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validatedDependencyRevisions").build();
    private static final MarshallingInfo<String> FLOWACTIONSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("flowActionsRoleArn").build();

    private static final SystemInstanceDescriptionMarshaller instance = new SystemInstanceDescriptionMarshaller();

    public static SystemInstanceDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SystemInstanceDescription systemInstanceDescription, ProtocolMarshaller protocolMarshaller) {

        if (systemInstanceDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(systemInstanceDescription.getSummary(), SUMMARY_BINDING);
            protocolMarshaller.marshall(systemInstanceDescription.getDefinition(), DEFINITION_BINDING);
            protocolMarshaller.marshall(systemInstanceDescription.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(systemInstanceDescription.getMetricsConfiguration(), METRICSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(systemInstanceDescription.getValidatedNamespaceVersion(), VALIDATEDNAMESPACEVERSION_BINDING);
            protocolMarshaller.marshall(systemInstanceDescription.getValidatedDependencyRevisions(), VALIDATEDDEPENDENCYREVISIONS_BINDING);
            protocolMarshaller.marshall(systemInstanceDescription.getFlowActionsRoleArn(), FLOWACTIONSROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
