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
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobMetadataMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<String> JOBSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobState").build();
    private static final MarshallingInfo<String> JOBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobType").build();
    private static final MarshallingInfo<String> SNOWBALLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowballType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resources").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyARN").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<String> ADDRESSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AddressId").build();
    private static final MarshallingInfo<StructuredPojo> SHIPPINGDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShippingDetails").build();
    private static final MarshallingInfo<String> SNOWBALLCAPACITYPREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowballCapacityPreference").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Notification").build();
    private static final MarshallingInfo<StructuredPojo> DATATRANSFERPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataTransferProgress").build();
    private static final MarshallingInfo<StructuredPojo> JOBLOGINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobLogInfo").build();
    private static final MarshallingInfo<String> CLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClusterId").build();
    private static final MarshallingInfo<String> FORWARDINGADDRESSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForwardingAddressId").build();

    private static final JobMetadataMarshaller instance = new JobMetadataMarshaller();

    public static JobMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobMetadata jobMetadata, ProtocolMarshaller protocolMarshaller) {

        if (jobMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobMetadata.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(jobMetadata.getJobState(), JOBSTATE_BINDING);
            protocolMarshaller.marshall(jobMetadata.getJobType(), JOBTYPE_BINDING);
            protocolMarshaller.marshall(jobMetadata.getSnowballType(), SNOWBALLTYPE_BINDING);
            protocolMarshaller.marshall(jobMetadata.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(jobMetadata.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(jobMetadata.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(jobMetadata.getKmsKeyARN(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(jobMetadata.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(jobMetadata.getAddressId(), ADDRESSID_BINDING);
            protocolMarshaller.marshall(jobMetadata.getShippingDetails(), SHIPPINGDETAILS_BINDING);
            protocolMarshaller.marshall(jobMetadata.getSnowballCapacityPreference(), SNOWBALLCAPACITYPREFERENCE_BINDING);
            protocolMarshaller.marshall(jobMetadata.getNotification(), NOTIFICATION_BINDING);
            protocolMarshaller.marshall(jobMetadata.getDataTransferProgress(), DATATRANSFERPROGRESS_BINDING);
            protocolMarshaller.marshall(jobMetadata.getJobLogInfo(), JOBLOGINFO_BINDING);
            protocolMarshaller.marshall(jobMetadata.getClusterId(), CLUSTERID_BINDING);
            protocolMarshaller.marshall(jobMetadata.getForwardingAddressId(), FORWARDINGADDRESSID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
