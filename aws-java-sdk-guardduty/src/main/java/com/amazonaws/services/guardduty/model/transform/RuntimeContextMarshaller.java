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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuntimeContextMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuntimeContextMarshaller {

    private static final MarshallingInfo<StructuredPojo> MODIFYINGPROCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modifyingProcess").build();
    private static final MarshallingInfo<java.util.Date> MODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SCRIPTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scriptPath").build();
    private static final MarshallingInfo<String> LIBRARYPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("libraryPath").build();
    private static final MarshallingInfo<String> LDPRELOADVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ldPreloadValue").build();
    private static final MarshallingInfo<String> SOCKETPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("socketPath").build();
    private static final MarshallingInfo<String> RUNCBINARYPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runcBinaryPath").build();
    private static final MarshallingInfo<String> RELEASEAGENTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseAgentPath").build();
    private static final MarshallingInfo<String> MOUNTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mountSource").build();
    private static final MarshallingInfo<String> MOUNTTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mountTarget").build();
    private static final MarshallingInfo<String> FILESYSTEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSystemType").build();
    private static final MarshallingInfo<List> FLAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("flags").build();
    private static final MarshallingInfo<String> MODULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("moduleName").build();
    private static final MarshallingInfo<String> MODULEFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("moduleFilePath").build();
    private static final MarshallingInfo<String> MODULESHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("moduleSha256").build();
    private static final MarshallingInfo<String> SHELLHISTORYFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shellHistoryFilePath").build();
    private static final MarshallingInfo<StructuredPojo> TARGETPROCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetProcess").build();
    private static final MarshallingInfo<String> ADDRESSFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addressFamily").build();
    private static final MarshallingInfo<Integer> IANAPROTOCOLNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ianaProtocolNumber").build();
    private static final MarshallingInfo<List> MEMORYREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memoryRegions").build();
    private static final MarshallingInfo<String> TOOLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("toolName").build();
    private static final MarshallingInfo<String> TOOLCATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toolCategory").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceName").build();
    private static final MarshallingInfo<String> COMMANDLINEEXAMPLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commandLineExample").build();
    private static final MarshallingInfo<String> THREATFILEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("threatFilePath").build();

    private static final RuntimeContextMarshaller instance = new RuntimeContextMarshaller();

    public static RuntimeContextMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuntimeContext runtimeContext, ProtocolMarshaller protocolMarshaller) {

        if (runtimeContext == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(runtimeContext.getModifyingProcess(), MODIFYINGPROCESS_BINDING);
            protocolMarshaller.marshall(runtimeContext.getModifiedAt(), MODIFIEDAT_BINDING);
            protocolMarshaller.marshall(runtimeContext.getScriptPath(), SCRIPTPATH_BINDING);
            protocolMarshaller.marshall(runtimeContext.getLibraryPath(), LIBRARYPATH_BINDING);
            protocolMarshaller.marshall(runtimeContext.getLdPreloadValue(), LDPRELOADVALUE_BINDING);
            protocolMarshaller.marshall(runtimeContext.getSocketPath(), SOCKETPATH_BINDING);
            protocolMarshaller.marshall(runtimeContext.getRuncBinaryPath(), RUNCBINARYPATH_BINDING);
            protocolMarshaller.marshall(runtimeContext.getReleaseAgentPath(), RELEASEAGENTPATH_BINDING);
            protocolMarshaller.marshall(runtimeContext.getMountSource(), MOUNTSOURCE_BINDING);
            protocolMarshaller.marshall(runtimeContext.getMountTarget(), MOUNTTARGET_BINDING);
            protocolMarshaller.marshall(runtimeContext.getFileSystemType(), FILESYSTEMTYPE_BINDING);
            protocolMarshaller.marshall(runtimeContext.getFlags(), FLAGS_BINDING);
            protocolMarshaller.marshall(runtimeContext.getModuleName(), MODULENAME_BINDING);
            protocolMarshaller.marshall(runtimeContext.getModuleFilePath(), MODULEFILEPATH_BINDING);
            protocolMarshaller.marshall(runtimeContext.getModuleSha256(), MODULESHA256_BINDING);
            protocolMarshaller.marshall(runtimeContext.getShellHistoryFilePath(), SHELLHISTORYFILEPATH_BINDING);
            protocolMarshaller.marshall(runtimeContext.getTargetProcess(), TARGETPROCESS_BINDING);
            protocolMarshaller.marshall(runtimeContext.getAddressFamily(), ADDRESSFAMILY_BINDING);
            protocolMarshaller.marshall(runtimeContext.getIanaProtocolNumber(), IANAPROTOCOLNUMBER_BINDING);
            protocolMarshaller.marshall(runtimeContext.getMemoryRegions(), MEMORYREGIONS_BINDING);
            protocolMarshaller.marshall(runtimeContext.getToolName(), TOOLNAME_BINDING);
            protocolMarshaller.marshall(runtimeContext.getToolCategory(), TOOLCATEGORY_BINDING);
            protocolMarshaller.marshall(runtimeContext.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(runtimeContext.getCommandLineExample(), COMMANDLINEEXAMPLE_BINDING);
            protocolMarshaller.marshall(runtimeContext.getThreatFilePath(), THREATFILEPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
