/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnalysisMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnalysisMarshaller {

    private static final MarshallingInfo<String> ANALYSISID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalysisId").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<List> ERRORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Errors").build();
    private static final MarshallingInfo<List> DATASETARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetArns").build();
    private static final MarshallingInfo<String> THEMEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ThemeArn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> SHEETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sheets").build();

    private static final AnalysisMarshaller instance = new AnalysisMarshaller();

    public static AnalysisMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Analysis analysis, ProtocolMarshaller protocolMarshaller) {

        if (analysis == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(analysis.getAnalysisId(), ANALYSISID_BINDING);
            protocolMarshaller.marshall(analysis.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(analysis.getName(), NAME_BINDING);
            protocolMarshaller.marshall(analysis.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(analysis.getErrors(), ERRORS_BINDING);
            protocolMarshaller.marshall(analysis.getDataSetArns(), DATASETARNS_BINDING);
            protocolMarshaller.marshall(analysis.getThemeArn(), THEMEARN_BINDING);
            protocolMarshaller.marshall(analysis.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(analysis.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(analysis.getSheets(), SHEETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
