/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesweb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DisassociateBrowserSettingsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateBrowserSettingsResultJsonUnmarshaller implements Unmarshaller<DisassociateBrowserSettingsResult, JsonUnmarshallerContext> {

    public DisassociateBrowserSettingsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DisassociateBrowserSettingsResult disassociateBrowserSettingsResult = new DisassociateBrowserSettingsResult();

        return disassociateBrowserSettingsResult;
    }

    private static DisassociateBrowserSettingsResultJsonUnmarshaller instance;

    public static DisassociateBrowserSettingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateBrowserSettingsResultJsonUnmarshaller();
        return instance;
    }
}
