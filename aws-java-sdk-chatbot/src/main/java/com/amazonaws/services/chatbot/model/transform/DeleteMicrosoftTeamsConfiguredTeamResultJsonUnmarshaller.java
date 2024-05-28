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
package com.amazonaws.services.chatbot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chatbot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteMicrosoftTeamsConfiguredTeamResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMicrosoftTeamsConfiguredTeamResultJsonUnmarshaller implements
        Unmarshaller<DeleteMicrosoftTeamsConfiguredTeamResult, JsonUnmarshallerContext> {

    public DeleteMicrosoftTeamsConfiguredTeamResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteMicrosoftTeamsConfiguredTeamResult deleteMicrosoftTeamsConfiguredTeamResult = new DeleteMicrosoftTeamsConfiguredTeamResult();

        return deleteMicrosoftTeamsConfiguredTeamResult;
    }

    private static DeleteMicrosoftTeamsConfiguredTeamResultJsonUnmarshaller instance;

    public static DeleteMicrosoftTeamsConfiguredTeamResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteMicrosoftTeamsConfiguredTeamResultJsonUnmarshaller();
        return instance;
    }
}
