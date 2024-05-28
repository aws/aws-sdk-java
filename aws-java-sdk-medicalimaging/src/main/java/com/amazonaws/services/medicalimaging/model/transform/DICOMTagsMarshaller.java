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
 * DICOMTagsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DICOMTagsMarshaller {

    private static final MarshallingInfo<String> DICOMPATIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMPatientId").build();
    private static final MarshallingInfo<String> DICOMPATIENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMPatientName").build();
    private static final MarshallingInfo<String> DICOMPATIENTBIRTHDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMPatientBirthDate").build();
    private static final MarshallingInfo<String> DICOMPATIENTSEX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMPatientSex").build();
    private static final MarshallingInfo<String> DICOMSTUDYINSTANCEUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyInstanceUID").build();
    private static final MarshallingInfo<String> DICOMSTUDYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyId").build();
    private static final MarshallingInfo<String> DICOMSTUDYDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyDescription").build();
    private static final MarshallingInfo<Integer> DICOMNUMBEROFSTUDYRELATEDSERIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMNumberOfStudyRelatedSeries").build();
    private static final MarshallingInfo<Integer> DICOMNUMBEROFSTUDYRELATEDINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMNumberOfStudyRelatedInstances").build();
    private static final MarshallingInfo<String> DICOMACCESSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMAccessionNumber").build();
    private static final MarshallingInfo<String> DICOMSERIESINSTANCEUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMSeriesInstanceUID").build();
    private static final MarshallingInfo<String> DICOMSERIESMODALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMSeriesModality").build();
    private static final MarshallingInfo<String> DICOMSERIESBODYPART_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMSeriesBodyPart").build();
    private static final MarshallingInfo<Integer> DICOMSERIESNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMSeriesNumber").build();
    private static final MarshallingInfo<String> DICOMSTUDYDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyDate").build();
    private static final MarshallingInfo<String> DICOMSTUDYTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DICOMStudyTime").build();

    private static final DICOMTagsMarshaller instance = new DICOMTagsMarshaller();

    public static DICOMTagsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DICOMTags dICOMTags, ProtocolMarshaller protocolMarshaller) {

        if (dICOMTags == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dICOMTags.getDICOMPatientId(), DICOMPATIENTID_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMPatientName(), DICOMPATIENTNAME_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMPatientBirthDate(), DICOMPATIENTBIRTHDATE_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMPatientSex(), DICOMPATIENTSEX_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMStudyInstanceUID(), DICOMSTUDYINSTANCEUID_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMStudyId(), DICOMSTUDYID_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMStudyDescription(), DICOMSTUDYDESCRIPTION_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMNumberOfStudyRelatedSeries(), DICOMNUMBEROFSTUDYRELATEDSERIES_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMNumberOfStudyRelatedInstances(), DICOMNUMBEROFSTUDYRELATEDINSTANCES_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMAccessionNumber(), DICOMACCESSIONNUMBER_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMSeriesInstanceUID(), DICOMSERIESINSTANCEUID_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMSeriesModality(), DICOMSERIESMODALITY_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMSeriesBodyPart(), DICOMSERIESBODYPART_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMSeriesNumber(), DICOMSERIESNUMBER_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMStudyDate(), DICOMSTUDYDATE_BINDING);
            protocolMarshaller.marshall(dICOMTags.getDICOMStudyTime(), DICOMSTUDYTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
