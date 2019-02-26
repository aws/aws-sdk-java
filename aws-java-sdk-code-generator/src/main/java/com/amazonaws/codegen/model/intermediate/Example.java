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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Example {

	private final String description;
	private final String title;
	private final String id;

	private JsonNode input;
	private JsonNode output;
	private final ExampleComments comments;

    public Example(
            @JsonProperty(value = "description", required = true) String description,
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "title", required = true) String title,
            @JsonProperty(value = "input") JsonNode input,
            @JsonProperty(value = "output") JsonNode output,
            @JsonProperty(value = "comments", required = true) ExampleComments comments) {
        this.description = description;
        this.title = title;
        this.id = id;

        this.input = input;
        this.output = output;
        this.comments = comments;
    }

    public String getDescription() {
    	return description;
    }

    public String getId() {
    	return id;
    }

    public String getTitle() {
    	return title;
    }

    public JsonNode getInput() {
    	return input;
    }

    public void setInput(JsonNode input) {
        this.input = input;
    }

    public JsonNode getOutput() {
    	return output;
    }

    public void setOutput(JsonNode output) {
        this.output = output;
    }

    public ExampleComments getComments() {
    	return comments;
    }

}
