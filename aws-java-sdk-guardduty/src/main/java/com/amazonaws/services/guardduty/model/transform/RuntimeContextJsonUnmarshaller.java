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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RuntimeContext JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeContextJsonUnmarshaller implements Unmarshaller<RuntimeContext, JsonUnmarshallerContext> {

    public RuntimeContext unmarshall(JsonUnmarshallerContext context) throws Exception {
        RuntimeContext runtimeContext = new RuntimeContext();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("modifyingProcess", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setModifyingProcess(ProcessDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("scriptPath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setScriptPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("libraryPath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setLibraryPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ldPreloadValue", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setLdPreloadValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("socketPath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setSocketPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runcBinaryPath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setRuncBinaryPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("releaseAgentPath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setReleaseAgentPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mountSource", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setMountSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mountTarget", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setMountTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileSystemType", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setFileSystemType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flags", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setFlags(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("moduleName", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setModuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("moduleFilePath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setModuleFilePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("moduleSha256", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setModuleSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shellHistoryFilePath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setShellHistoryFilePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetProcess", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setTargetProcess(ProcessDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("addressFamily", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setAddressFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ianaProtocolNumber", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setIanaProtocolNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memoryRegions", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setMemoryRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("toolName", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setToolName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("toolCategory", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setToolCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("commandLineExample", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setCommandLineExample(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("threatFilePath", targetDepth)) {
                    context.nextToken();
                    runtimeContext.setThreatFilePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return runtimeContext;
    }

    private static RuntimeContextJsonUnmarshaller instance;

    public static RuntimeContextJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuntimeContextJsonUnmarshaller();
        return instance;
    }
}
