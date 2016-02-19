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

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceExamples {

    private final Map<String, List<Example>> operationExamples;
    private final String version;
    
    public ServiceExamples() {
        this.operationExamples = null;
        this.version = null;
    }

    public ServiceExamples(
            @JsonProperty(value = "examples", required = true) Map<String, List<Example>> examples,
            @JsonProperty(value = "version", required = true) String version) {
        this.operationExamples = examples;
        this.version = version;
    }

    public Map<String, List<Example>> getOperationExamples() {
        return operationExamples;
    }
    
    public String getVersion() {
    	return version;
    }

}
