/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.stepfunctions.builder.states;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.IOException;

/**
 * Container for the InputPath, OutputPath, and ResultPath fields to handle serialization concerns.
 */
@SdkInternalApi
final class PathContainer {

    @JsonProperty(PropertyNames.INPUT_PATH)
    @JsonSerialize(using = PathSerializer.class)
    private final JsonNode inputPath;

    @JsonProperty(PropertyNames.OUTPUT_PATH)
    @JsonSerialize(using = PathSerializer.class)
    private final JsonNode outputPath;

    @JsonProperty(PropertyNames.RESULT_PATH)
    @JsonSerialize(using = PathSerializer.class)
    private final JsonNode resultPath;

    @JsonProperty(PropertyNames.PARAMETERS)
    @JsonSerialize(using = PathSerializer.class)
    private final JsonNode parameters;

    private PathContainer(Builder builder) {
        this.inputPath = builder.inputPath;
        this.outputPath = builder.outputPath;
        this.resultPath = builder.resultPath;
        this.parameters = builder.parameters;
    }

    @JsonIgnore
    public String getInputPath() {
        return nodeToString(inputPath);
    }

    @JsonIgnore
    public String getOutputPath() {
        return nodeToString(outputPath);
    }

    @JsonIgnore
    public String getResultPath() {
        return nodeToString(resultPath);
    }

    @JsonIgnore
    public JsonNode getParameters() {
        return parameters;
    }

    private String nodeToString(JsonNode jsonNode) {
        if (jsonNode == null || jsonNode instanceof NullNode) {
            return null;
        }
        return jsonNode.asText();
    }

    /**
     * @return Builder instance to construct a {@link PathContainer}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link PathContainer}.
     */
    public static final class Builder {

        private JsonNode inputPath;

        private JsonNode outputPath;

        private JsonNode resultPath;

        private JsonNode parameters;

        protected Builder() {
        }

        @JsonProperty(PropertyNames.INPUT_PATH)
        public Builder inputPath(String inputPath) {
            this.inputPath = resolvePath(inputPath);
            return this;
        }

        @JsonProperty(PropertyNames.OUTPUT_PATH)
        public Builder outputPath(String outputPath) {
            this.outputPath = resolvePath(outputPath);
            return this;
        }

        @JsonProperty(PropertyNames.RESULT_PATH)
        public Builder resultPath(String resultPath) {
            this.resultPath = resolvePath(resultPath);
            return this;
        }

        @JsonProperty(PropertyNames.PARAMETERS)
        public Builder parameters(JsonNode parameters) {
            this.parameters = parameters == null ? NullNode.getInstance() : parameters;
            return this;
        }

        /**
         * If an explicit null is set we preserve that in a {@link NullNode} so that we
         * can serialize an explicit JSON null instead of ommitting that field from the JSON object.
         *
         * @return NullNode if path is null, otherwise a TextNode containing the value.
         */
        private JsonNode resolvePath(String pathString) {
            if (pathString == null) {
                return NullNode.getInstance();
            }
            return TextNode.valueOf(pathString);
        }

        /**
         * @return An immutable {@link PathContainer} object.
         */
        public PathContainer build() {
            return new PathContainer(this);
        }
    }

    private static final class PathSerializer extends JsonSerializer<JsonNode> {

        @Override
        public void serialize(JsonNode value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value instanceof NullNode) {
                gen.writeNull();
            } else if (value != null) {
                gen.writeTree(value);
            }
        }
    }
}
