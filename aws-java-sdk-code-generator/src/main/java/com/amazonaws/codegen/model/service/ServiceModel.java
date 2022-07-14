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

package com.amazonaws.codegen.model.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.Map;

public class ServiceModel {

    private final ServiceMetadata metadata;

    private Map<String, Operation> operations;

    private Map<String, Shape> shapes;
    private final Map<String, Authorizer> authorizers;

    private String documentation;

    private final Map<String, AwsQueryCompatible> awsQueryCompatible;

    public ServiceModel(@JsonProperty(value = "metadata", required = true) ServiceMetadata metadata,
                        @JsonProperty(value = "operations", required = true) Map<String, Operation> operations,
                        @JsonProperty(value = "shapes", required = true) Map<String, Shape> shapes,
                        @JsonProperty(value = "authorizers") Map<String, Authorizer> authorizers,
                        @JsonProperty(value = "awsQueryCompatible") Map<String, AwsQueryCompatible> awsQueryCompatible) {
        this.metadata = metadata;
        this.operations = operations;
        this.shapes = shapes;
        this.authorizers = authorizers;
        this.awsQueryCompatible = awsQueryCompatible;
    }

    public ServiceMetadata getMetadata() {
        return metadata;
    }

    public Map<String, Operation> getOperations() {
        return operations;
    }

    public ServiceModel setOperations(Map<String, Operation> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Convenience getter to retrieve an {@link Operation} by name.
     *
     * @param operationName Name of operation to retrieve.
     * @return Operation or null if not found.
     */
    public Operation getOperation(String operationName) {
        return operations.get(operationName);
    }

    public Map<String, Shape> getShapes() {
        return shapes;
    }

    public ServiceModel setShapes(Map<String, Shape> shapes) {
        this.shapes = shapes;
        return this;
    }

    /**
     * Convenience getter to retrieve a {@link Shape} by name.
     *
     * @param shapeName Name of shape to retrieve.
     * @return Shape or null if not found.
     */
    public Shape getShape(String shapeName) {
        return shapes.get(shapeName);
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public Map<String, Authorizer> getAuthorizers() {
        return authorizers != null ? authorizers : Collections.emptyMap();
    }

    public Map<String, AwsQueryCompatible> getAwsQueryCompatible() {
        return awsQueryCompatible;
    }
}
