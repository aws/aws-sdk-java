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

package com.amazonaws.services.route53domains.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * NameserverMarshaller
 */
public class NameserverJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Nameserver nameserver, JSONWriter jsonWriter) {
        if (nameserver == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (nameserver.getName() != null) {
                jsonWriter.key("Name").value(nameserver.getName());
            }

            com.amazonaws.internal.SdkInternalList<String> glueIpsList = (com.amazonaws.internal.SdkInternalList<String>) nameserver
                    .getGlueIps();
            if (!glueIpsList.isEmpty() || !glueIpsList.isAutoConstruct()) {
                jsonWriter.key("GlueIps");
                jsonWriter.array();
                for (String glueIpsListValue : glueIpsList) {
                    if (glueIpsListValue != null) {
                        jsonWriter.value(glueIpsListValue);
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

    private static NameserverJsonMarshaller instance;

    public static NameserverJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NameserverJsonMarshaller();
        return instance;
    }

}
