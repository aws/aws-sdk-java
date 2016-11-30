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
package com.amazonaws.services.snowball.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobListEntryMarshaller
 */
public class JobListEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobListEntry jobListEntry, StructuredJsonGenerator jsonGenerator) {

        if (jobListEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobListEntry.getJobId() != null) {
                jsonGenerator.writeFieldName("JobId").writeValue(jobListEntry.getJobId());
            }
            if (jobListEntry.getJobState() != null) {
                jsonGenerator.writeFieldName("JobState").writeValue(jobListEntry.getJobState());
            }
            if (jobListEntry.getIsMaster() != null) {
                jsonGenerator.writeFieldName("IsMaster").writeValue(jobListEntry.getIsMaster());
            }
            if (jobListEntry.getJobType() != null) {
                jsonGenerator.writeFieldName("JobType").writeValue(jobListEntry.getJobType());
            }
            if (jobListEntry.getSnowballType() != null) {
                jsonGenerator.writeFieldName("SnowballType").writeValue(jobListEntry.getSnowballType());
            }
            if (jobListEntry.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(jobListEntry.getCreationDate());
            }
            if (jobListEntry.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(jobListEntry.getDescription());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobListEntryJsonMarshaller instance;

    public static JobListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobListEntryJsonMarshaller();
        return instance;
    }

}
