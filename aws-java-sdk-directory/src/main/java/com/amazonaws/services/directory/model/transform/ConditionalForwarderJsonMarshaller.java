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
package com.amazonaws.services.directory.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ConditionalForwarderMarshaller
 */
public class ConditionalForwarderJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ConditionalForwarder conditionalForwarder, StructuredJsonGenerator jsonGenerator) {

        if (conditionalForwarder == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (conditionalForwarder.getRemoteDomainName() != null) {
                jsonGenerator.writeFieldName("RemoteDomainName").writeValue(conditionalForwarder.getRemoteDomainName());
            }

            com.amazonaws.internal.SdkInternalList<String> dnsIpAddrsList = (com.amazonaws.internal.SdkInternalList<String>) conditionalForwarder
                    .getDnsIpAddrs();
            if (!dnsIpAddrsList.isEmpty() || !dnsIpAddrsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DnsIpAddrs");
                jsonGenerator.writeStartArray();
                for (String dnsIpAddrsListValue : dnsIpAddrsList) {
                    if (dnsIpAddrsListValue != null) {
                        jsonGenerator.writeValue(dnsIpAddrsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (conditionalForwarder.getReplicationScope() != null) {
                jsonGenerator.writeFieldName("ReplicationScope").writeValue(conditionalForwarder.getReplicationScope());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConditionalForwarderJsonMarshaller instance;

    public static ConditionalForwarderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConditionalForwarderJsonMarshaller();
        return instance;
    }

}
