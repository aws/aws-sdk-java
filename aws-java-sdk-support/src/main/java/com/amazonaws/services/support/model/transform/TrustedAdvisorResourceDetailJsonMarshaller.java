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

package com.amazonaws.services.support.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TrustedAdvisorResourceDetailMarshaller
 */
public class TrustedAdvisorResourceDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            TrustedAdvisorResourceDetail trustedAdvisorResourceDetail,
            JSONWriter jsonWriter) {
        if (trustedAdvisorResourceDetail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (trustedAdvisorResourceDetail.getStatus() != null) {
                jsonWriter.key("status").value(
                        trustedAdvisorResourceDetail.getStatus());
            }

            if (trustedAdvisorResourceDetail.getRegion() != null) {
                jsonWriter.key("region").value(
                        trustedAdvisorResourceDetail.getRegion());
            }

            if (trustedAdvisorResourceDetail.getResourceId() != null) {
                jsonWriter.key("resourceId").value(
                        trustedAdvisorResourceDetail.getResourceId());
            }

            if (trustedAdvisorResourceDetail.getIsSuppressed() != null) {
                jsonWriter.key("isSuppressed").value(
                        trustedAdvisorResourceDetail.getIsSuppressed());
            }

            com.amazonaws.internal.SdkInternalList<String> metadataList = (com.amazonaws.internal.SdkInternalList<String>) trustedAdvisorResourceDetail
                    .getMetadata();
            if (!metadataList.isEmpty() || !metadataList.isAutoConstruct()) {
                jsonWriter.key("metadata");
                jsonWriter.array();
                for (String metadataListValue : metadataList) {
                    if (metadataListValue != null) {
                        jsonWriter.value(metadataListValue);
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

    private static TrustedAdvisorResourceDetailJsonMarshaller instance;

    public static TrustedAdvisorResourceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorResourceDetailJsonMarshaller();
        return instance;
    }

}
