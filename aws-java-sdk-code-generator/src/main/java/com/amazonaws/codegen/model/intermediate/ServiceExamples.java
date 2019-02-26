/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.model.intermediate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ServiceExamples {

    /**
     * Empty examples object when examples aren't present or aren't applicable.
     */
    public static final ServiceExamples NONE = new ServiceExamples(Collections.emptyMap(), null);

    @JsonProperty(value = "examples")
    private final Map<String, List<Example>> operationExamples;
    private final String version;

    @JsonCreator
    private ServiceExamples(
            @JsonProperty(value = "examples") Map<String, List<Example>> examples,
            @JsonProperty(value = "version") String version) {
        this.operationExamples = examples == null
                ? Collections.emptyMap() : examples;
        this.version = version;
    }

    public Map<String, List<Example>> getOperationExamples() {
        return operationExamples;
    }

    public String getVersion() {
        return version;
    }

}
