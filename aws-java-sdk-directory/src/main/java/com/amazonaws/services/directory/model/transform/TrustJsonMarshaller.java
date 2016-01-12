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

package com.amazonaws.services.directory.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TrustMarshaller
 */
public class TrustJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Trust trust, JSONWriter jsonWriter) {
        if (trust == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (trust.getDirectoryId() != null) {
                jsonWriter.key("DirectoryId").value(trust.getDirectoryId());
            }

            if (trust.getTrustId() != null) {
                jsonWriter.key("TrustId").value(trust.getTrustId());
            }

            if (trust.getRemoteDomainName() != null) {
                jsonWriter.key("RemoteDomainName").value(
                        trust.getRemoteDomainName());
            }

            if (trust.getTrustType() != null) {
                jsonWriter.key("TrustType").value(trust.getTrustType());
            }

            if (trust.getTrustDirection() != null) {
                jsonWriter.key("TrustDirection").value(
                        trust.getTrustDirection());
            }

            if (trust.getTrustState() != null) {
                jsonWriter.key("TrustState").value(trust.getTrustState());
            }

            if (trust.getCreatedDateTime() != null) {
                jsonWriter.key("CreatedDateTime").value(
                        trust.getCreatedDateTime());
            }

            if (trust.getLastUpdatedDateTime() != null) {
                jsonWriter.key("LastUpdatedDateTime").value(
                        trust.getLastUpdatedDateTime());
            }

            if (trust.getStateLastUpdatedDateTime() != null) {
                jsonWriter.key("StateLastUpdatedDateTime").value(
                        trust.getStateLastUpdatedDateTime());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrustJsonMarshaller instance;

    public static TrustJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustJsonMarshaller();
        return instance;
    }

}
