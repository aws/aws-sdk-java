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
package com.amazonaws.services.translate.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.translate.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobDetailsMarshaller {

    private static final MarshallingInfo<Integer> TRANSLATEDDOCUMENTSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranslatedDocumentsCount").build();
    private static final MarshallingInfo<Integer> DOCUMENTSWITHERRORSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentsWithErrorsCount").build();
    private static final MarshallingInfo<Integer> INPUTDOCUMENTSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDocumentsCount").build();

    private static final JobDetailsMarshaller instance = new JobDetailsMarshaller();

    public static JobDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobDetails jobDetails, ProtocolMarshaller protocolMarshaller) {

        if (jobDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobDetails.getTranslatedDocumentsCount(), TRANSLATEDDOCUMENTSCOUNT_BINDING);
            protocolMarshaller.marshall(jobDetails.getDocumentsWithErrorsCount(), DOCUMENTSWITHERRORSCOUNT_BINDING);
            protocolMarshaller.marshall(jobDetails.getInputDocumentsCount(), INPUTDOCUMENTSCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
