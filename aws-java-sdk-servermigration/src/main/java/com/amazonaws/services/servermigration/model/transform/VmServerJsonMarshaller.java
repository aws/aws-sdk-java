/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * VmServerMarshaller
 */
public class VmServerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(VmServer vmServer, StructuredJsonGenerator jsonGenerator) {

        if (vmServer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (vmServer.getVmServerAddress() != null) {
                jsonGenerator.writeFieldName("vmServerAddress");
                VmServerAddressJsonMarshaller.getInstance().marshall(vmServer.getVmServerAddress(), jsonGenerator);
            }
            if (vmServer.getVmName() != null) {
                jsonGenerator.writeFieldName("vmName").writeValue(vmServer.getVmName());
            }
            if (vmServer.getVmManagerName() != null) {
                jsonGenerator.writeFieldName("vmManagerName").writeValue(vmServer.getVmManagerName());
            }
            if (vmServer.getVmManagerType() != null) {
                jsonGenerator.writeFieldName("vmManagerType").writeValue(vmServer.getVmManagerType());
            }
            if (vmServer.getVmPath() != null) {
                jsonGenerator.writeFieldName("vmPath").writeValue(vmServer.getVmPath());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VmServerJsonMarshaller instance;

    public static VmServerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VmServerJsonMarshaller();
        return instance;
    }

}
