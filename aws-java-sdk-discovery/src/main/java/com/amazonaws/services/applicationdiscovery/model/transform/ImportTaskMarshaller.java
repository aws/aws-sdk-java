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
package com.amazonaws.services.applicationdiscovery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportTaskMarshaller {

    private static final MarshallingInfo<String> IMPORTTASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importTaskId").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> IMPORTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("importUrl").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> IMPORTREQUESTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importRequestTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> IMPORTCOMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importCompletionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> IMPORTDELETEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importDeletedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> SERVERIMPORTSUCCESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverImportSuccess").build();
    private static final MarshallingInfo<Integer> SERVERIMPORTFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverImportFailure").build();
    private static final MarshallingInfo<Integer> APPLICATIONIMPORTSUCCESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationImportSuccess").build();
    private static final MarshallingInfo<Integer> APPLICATIONIMPORTFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationImportFailure").build();
    private static final MarshallingInfo<String> ERRORSANDFAILEDENTRIESZIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorsAndFailedEntriesZip").build();

    private static final ImportTaskMarshaller instance = new ImportTaskMarshaller();

    public static ImportTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportTask importTask, ProtocolMarshaller protocolMarshaller) {

        if (importTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importTask.getImportTaskId(), IMPORTTASKID_BINDING);
            protocolMarshaller.marshall(importTask.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(importTask.getName(), NAME_BINDING);
            protocolMarshaller.marshall(importTask.getImportUrl(), IMPORTURL_BINDING);
            protocolMarshaller.marshall(importTask.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(importTask.getImportRequestTime(), IMPORTREQUESTTIME_BINDING);
            protocolMarshaller.marshall(importTask.getImportCompletionTime(), IMPORTCOMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(importTask.getImportDeletedTime(), IMPORTDELETEDTIME_BINDING);
            protocolMarshaller.marshall(importTask.getServerImportSuccess(), SERVERIMPORTSUCCESS_BINDING);
            protocolMarshaller.marshall(importTask.getServerImportFailure(), SERVERIMPORTFAILURE_BINDING);
            protocolMarshaller.marshall(importTask.getApplicationImportSuccess(), APPLICATIONIMPORTSUCCESS_BINDING);
            protocolMarshaller.marshall(importTask.getApplicationImportFailure(), APPLICATIONIMPORTFAILURE_BINDING);
            protocolMarshaller.marshall(importTask.getErrorsAndFailedEntriesZip(), ERRORSANDFAILEDENTRIESZIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
