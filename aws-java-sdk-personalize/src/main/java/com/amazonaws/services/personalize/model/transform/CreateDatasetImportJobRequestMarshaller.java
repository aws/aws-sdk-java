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
package com.amazonaws.services.personalize.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDatasetImportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDatasetImportJobRequestMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> DATASETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datasetArn").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSource").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> IMPORTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importMode").build();
    private static final MarshallingInfo<Boolean> PUBLISHATTRIBUTIONMETRICSTOS3_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publishAttributionMetricsToS3").build();

    private static final CreateDatasetImportJobRequestMarshaller instance = new CreateDatasetImportJobRequestMarshaller();

    public static CreateDatasetImportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDatasetImportJobRequest createDatasetImportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDatasetImportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDatasetImportJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(createDatasetImportJobRequest.getDatasetArn(), DATASETARN_BINDING);
            protocolMarshaller.marshall(createDatasetImportJobRequest.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(createDatasetImportJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createDatasetImportJobRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createDatasetImportJobRequest.getImportMode(), IMPORTMODE_BINDING);
            protocolMarshaller.marshall(createDatasetImportJobRequest.getPublishAttributionMetricsToS3(), PUBLISHATTRIBUTIONMETRICSTOS3_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
