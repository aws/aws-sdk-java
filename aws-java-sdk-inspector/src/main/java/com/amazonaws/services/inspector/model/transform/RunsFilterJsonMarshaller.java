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

package com.amazonaws.services.inspector.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RunsFilterMarshaller
 */
public class RunsFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RunsFilter runsFilter, JSONWriter jsonWriter) {
        if (runsFilter == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            java.util.List<String> runNamePatternsList = runsFilter
                    .getRunNamePatterns();
            if (runNamePatternsList != null) {
                jsonWriter.key("runNamePatterns");
                jsonWriter.array();
                for (String runNamePatternsListValue : runNamePatternsList) {
                    if (runNamePatternsListValue != null) {
                        jsonWriter.value(runNamePatternsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<String> runStatesList = runsFilter.getRunStates();
            if (runStatesList != null) {
                jsonWriter.key("runStates");
                jsonWriter.array();
                for (String runStatesListValue : runStatesList) {
                    if (runStatesListValue != null) {
                        jsonWriter.value(runStatesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<String> rulesPackagesList = runsFilter
                    .getRulesPackages();
            if (rulesPackagesList != null) {
                jsonWriter.key("rulesPackages");
                jsonWriter.array();
                for (String rulesPackagesListValue : rulesPackagesList) {
                    if (rulesPackagesListValue != null) {
                        jsonWriter.value(rulesPackagesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (runsFilter.getCreationTime() != null) {
                jsonWriter.key("creationTime");
                TimestampRangeJsonMarshaller.getInstance().marshall(
                        runsFilter.getCreationTime(), jsonWriter);
            }

            if (runsFilter.getCompletionTime() != null) {
                jsonWriter.key("completionTime");
                TimestampRangeJsonMarshaller.getInstance().marshall(
                        runsFilter.getCompletionTime(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RunsFilterJsonMarshaller instance;

    public static RunsFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RunsFilterJsonMarshaller();
        return instance;
    }

}
