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

package com.amazonaws.codegen.model.config.templates;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChildTemplate {

    private final String location;
    private final String importAsNamespace;

    @JsonCreator
    public ChildTemplate(
            @JsonProperty("location") String location,
            @JsonProperty("importAsNamespace") String importAsNamespace) {
        this.location = location;
        this.importAsNamespace = importAsNamespace;
    }

    public String getLocation() {
        return location;
    }

    public String getImportAsNamespace() {
        return importAsNamespace;
    }

}