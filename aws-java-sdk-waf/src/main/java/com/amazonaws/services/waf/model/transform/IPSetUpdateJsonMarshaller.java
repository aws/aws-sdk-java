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
package com.amazonaws.services.waf.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * IPSetUpdateMarshaller
 */
public class IPSetUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(IPSetUpdate iPSetUpdate, StructuredJsonGenerator jsonGenerator) {

        if (iPSetUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (iPSetUpdate.getAction() != null) {
                jsonGenerator.writeFieldName("Action").writeValue(iPSetUpdate.getAction());
            }
            if (iPSetUpdate.getIPSetDescriptor() != null) {
                jsonGenerator.writeFieldName("IPSetDescriptor");
                IPSetDescriptorJsonMarshaller.getInstance().marshall(iPSetUpdate.getIPSetDescriptor(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IPSetUpdateJsonMarshaller instance;

    public static IPSetUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IPSetUpdateJsonMarshaller();
        return instance;
    }

}
