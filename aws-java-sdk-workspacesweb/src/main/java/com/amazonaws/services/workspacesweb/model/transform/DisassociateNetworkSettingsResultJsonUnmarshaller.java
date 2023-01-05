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
 * DisassociateNetworkSettingsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateNetworkSettingsResultJsonUnmarshaller implements Unmarshaller<DisassociateNetworkSettingsResult, JsonUnmarshallerContext> {

    public DisassociateNetworkSettingsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DisassociateNetworkSettingsResult disassociateNetworkSettingsResult = new DisassociateNetworkSettingsResult();

        return disassociateNetworkSettingsResult;
    }

    private static DisassociateNetworkSettingsResultJsonUnmarshaller instance;

    public static DisassociateNetworkSettingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateNetworkSettingsResultJsonUnmarshaller();
        return instance;
    }
}
