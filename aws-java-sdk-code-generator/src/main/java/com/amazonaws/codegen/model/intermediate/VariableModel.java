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

import java.util.Collection;
import java.util.List;

public class VariableModel extends DocumentationModel {

    private String variableName;

    private String variableType;

    /**
     * Variable declaration type, which can be different from the
     * {@link #variableType}, for example, for auto construct list or map.
     * Otherwise, it's the same as the {@link #variableType}.
     */
    private String variableDeclarationType;

    private String timestampFormat;

    public VariableModel(String variableName, String variableType) {
        this(variableName, variableType, variableType);
    }

    public VariableModel(String variableName, String variableType, String variableDeclarationType) {
        this(variableName, variableType, variableDeclarationType, null);
    }

    @JsonCreator
    public VariableModel(
        @JsonProperty("variableName") String variableName,
        @JsonProperty("variableType") String variableType,
        @JsonProperty("variableDeclarationType") String variableDeclarationType,
        @JsonProperty("timestampFormat") String timestampFormat) {
        setVariableName(variableName);
        setVariableType(variableType);
        setVariableDeclarationType(variableDeclarationType);
        setTimestampFormat(timestampFormat);

    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public String getSimpleType() {
        if (variableType.contains(".")) {
            return variableType.substring(variableType.lastIndexOf(".") + 1);
        }
        return variableType;
    }

    public VariableModel withDocumentation(String documentation) {
        setDocumentation(documentation);
        return this;
    }

    public String getVariableDeclarationType() {
        return variableDeclarationType;
    }

    /**
     * Returns the Java type used for the input parameter of a setter method.
     */
    public String getVariableSetterType() {
        final String prefix = List.class.getName();
        if (variableType.startsWith(prefix)) {
            return Collection.class.getName() + variableType.substring(prefix.length());
        } else {
            return variableType;
        }
    }


    public void setVariableDeclarationType(String variableDeclarationType) {
        this.variableDeclarationType = variableDeclarationType;
    }

    public String getTimestampFormat() {
        return timestampFormat;
    }

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    @Override
    public String toString() {
        return variableName;
    }
}
