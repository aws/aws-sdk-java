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
package com.amazonaws.services.medicalimaging.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medicalimaging.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchByAttributeValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchByAttributeValueMarshaller {

    private static final MarshallingInfo<String> DICOMPATIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMPatientId").build();
    private static final MarshallingInfo<String> DICOMACCESSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMAccessionNumber").build();
    private static final MarshallingInfo<String> DICOMSTUDYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyId").build();
    private static final MarshallingInfo<String> DICOMSTUDYINSTANCEUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyInstanceUID").build();
    private static final MarshallingInfo<String> DICOMSERIESINSTANCEUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMSeriesInstanceUID").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DICOMSTUDYDATEANDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyDateAndTime").build();

    private static final SearchByAttributeValueMarshaller instance = new SearchByAttributeValueMarshaller();

    public static SearchByAttributeValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchByAttributeValue searchByAttributeValue, ProtocolMarshaller protocolMarshaller) {

        if (searchByAttributeValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchByAttributeValue.getDICOMPatientId(), DICOMPATIENTID_BINDING);
            protocolMarshaller.marshall(searchByAttributeValue.getDICOMAccessionNumber(), DICOMACCESSIONNUMBER_BINDING);
            protocolMarshaller.marshall(searchByAttributeValue.getDICOMStudyId(), DICOMSTUDYID_BINDING);
            protocolMarshaller.marshall(searchByAttributeValue.getDICOMStudyInstanceUID(), DICOMSTUDYINSTANCEUID_BINDING);
            protocolMarshaller.marshall(searchByAttributeValue.getDICOMSeriesInstanceUID(), DICOMSERIESINSTANCEUID_BINDING);
            protocolMarshaller.marshall(searchByAttributeValue.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(searchByAttributeValue.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(searchByAttributeValue.getDICOMStudyDateAndTime(), DICOMSTUDYDATEANDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
