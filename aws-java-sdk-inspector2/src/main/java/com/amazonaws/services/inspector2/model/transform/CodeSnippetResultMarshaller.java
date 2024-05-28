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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodeSnippetResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodeSnippetResultMarshaller {

    private static final MarshallingInfo<List> CODESNIPPET_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("codeSnippet").build();
    private static final MarshallingInfo<Integer> ENDLINE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endLine").build();
    private static final MarshallingInfo<String> FINDINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingArn").build();
    private static final MarshallingInfo<Integer> STARTLINE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startLine").build();
    private static final MarshallingInfo<List> SUGGESTEDFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suggestedFixes").build();

    private static final CodeSnippetResultMarshaller instance = new CodeSnippetResultMarshaller();

    public static CodeSnippetResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodeSnippetResult codeSnippetResult, ProtocolMarshaller protocolMarshaller) {

        if (codeSnippetResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codeSnippetResult.getCodeSnippet(), CODESNIPPET_BINDING);
            protocolMarshaller.marshall(codeSnippetResult.getEndLine(), ENDLINE_BINDING);
            protocolMarshaller.marshall(codeSnippetResult.getFindingArn(), FINDINGARN_BINDING);
            protocolMarshaller.marshall(codeSnippetResult.getStartLine(), STARTLINE_BINDING);
            protocolMarshaller.marshall(codeSnippetResult.getSuggestedFixes(), SUGGESTEDFIXES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
