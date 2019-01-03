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
package com.amazonaws.services.xray.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TraceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TraceSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<Double> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Duration").build();
    private static final MarshallingInfo<Double> RESPONSETIME_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseTime").build();
    private static final MarshallingInfo<Boolean> HASFAULT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasFault").build();
    private static final MarshallingInfo<Boolean> HASERROR_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasError").build();
    private static final MarshallingInfo<Boolean> HASTHROTTLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasThrottle").build();
    private static final MarshallingInfo<Boolean> ISPARTIAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsPartial").build();
    private static final MarshallingInfo<StructuredPojo> HTTP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Http").build();
    private static final MarshallingInfo<Map> ANNOTATIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Annotations").build();
    private static final MarshallingInfo<List> USERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Users").build();
    private static final MarshallingInfo<List> SERVICEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ServiceIds").build();
    private static final MarshallingInfo<List> RESOURCEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceARNs").build();
    private static final MarshallingInfo<List> INSTANCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InstanceIds").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();
    private static final MarshallingInfo<StructuredPojo> ENTRYPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntryPoint").build();
    private static final MarshallingInfo<List> FAULTROOTCAUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FaultRootCauses").build();
    private static final MarshallingInfo<List> ERRORROOTCAUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorRootCauses").build();
    private static final MarshallingInfo<List> RESPONSETIMEROOTCAUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseTimeRootCauses").build();
    private static final MarshallingInfo<Integer> REVISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Revision").build();

    private static final TraceSummaryMarshaller instance = new TraceSummaryMarshaller();

    public static TraceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TraceSummary traceSummary, ProtocolMarshaller protocolMarshaller) {

        if (traceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(traceSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(traceSummary.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(traceSummary.getResponseTime(), RESPONSETIME_BINDING);
            protocolMarshaller.marshall(traceSummary.getHasFault(), HASFAULT_BINDING);
            protocolMarshaller.marshall(traceSummary.getHasError(), HASERROR_BINDING);
            protocolMarshaller.marshall(traceSummary.getHasThrottle(), HASTHROTTLE_BINDING);
            protocolMarshaller.marshall(traceSummary.getIsPartial(), ISPARTIAL_BINDING);
            protocolMarshaller.marshall(traceSummary.getHttp(), HTTP_BINDING);
            protocolMarshaller.marshall(traceSummary.getAnnotations(), ANNOTATIONS_BINDING);
            protocolMarshaller.marshall(traceSummary.getUsers(), USERS_BINDING);
            protocolMarshaller.marshall(traceSummary.getServiceIds(), SERVICEIDS_BINDING);
            protocolMarshaller.marshall(traceSummary.getResourceARNs(), RESOURCEARNS_BINDING);
            protocolMarshaller.marshall(traceSummary.getInstanceIds(), INSTANCEIDS_BINDING);
            protocolMarshaller.marshall(traceSummary.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(traceSummary.getEntryPoint(), ENTRYPOINT_BINDING);
            protocolMarshaller.marshall(traceSummary.getFaultRootCauses(), FAULTROOTCAUSES_BINDING);
            protocolMarshaller.marshall(traceSummary.getErrorRootCauses(), ERRORROOTCAUSES_BINDING);
            protocolMarshaller.marshall(traceSummary.getResponseTimeRootCauses(), RESPONSETIMEROOTCAUSES_BINDING);
            protocolMarshaller.marshall(traceSummary.getRevision(), REVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
