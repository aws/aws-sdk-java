/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.waf.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * IPSetMarshaller
 */
public class IPSetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(IPSet iPSet, JSONWriter jsonWriter) {
        if (iPSet == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (iPSet.getIPSetId() != null) {
                jsonWriter.key("IPSetId").value(iPSet.getIPSetId());
            }

            if (iPSet.getName() != null) {
                jsonWriter.key("Name").value(iPSet.getName());
            }

            java.util.List<IPSetDescriptor> iPSetDescriptorsList = iPSet
                    .getIPSetDescriptors();
            if (iPSetDescriptorsList != null) {
                jsonWriter.key("IPSetDescriptors");
                jsonWriter.array();
                for (IPSetDescriptor iPSetDescriptorsListValue : iPSetDescriptorsList) {
                    if (iPSetDescriptorsListValue != null) {

                        IPSetDescriptorJsonMarshaller.getInstance().marshall(
                                iPSetDescriptorsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IPSetJsonMarshaller instance;

    public static IPSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IPSetJsonMarshaller();
        return instance;
    }

}
