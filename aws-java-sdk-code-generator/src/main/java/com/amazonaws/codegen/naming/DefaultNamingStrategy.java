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
package com.amazonaws.codegen.naming;

import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.service.Output;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

import static com.amazonaws.codegen.internal.Constants.EXCEPTION_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.FAULT_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.REQUEST_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.RESPONSE_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.VARIABLE_NAME_SUFFIX;
import static com.amazonaws.codegen.internal.Utils.capitialize;
import static com.amazonaws.codegen.internal.Utils.unCapitialize;

/**
 * Default implementation of naming strategy respecting customizations supplied by {@link
 * CustomizationConfig}.
 */
public class DefaultNamingStrategy implements NamingStrategy {

    private final static Set<String> reservedKeywords = new HashSet<String>() {{
        add("return");
        add("public");
        add("private");
        add("class");
        add("static");
        add("protected");
        add("string");
        add("boolean");
        add("integer");
        add("int");
        add("char");
        add("null");
        add("double");
        add("object");
        add("short");
        add("long");
        add("float");
        add("byte");
        add("bigDecimal");
        add("bigInteger");
        add("protected");
        add("inputStream");
        add("bytebuffer");
        add("date");
        add("list");
        add("map");
    }};

    private final ServiceModel serviceModel;
    private final BasicCodeGenConfig codeGenConfig;
    private final CustomizationConfig customizationConfig;

    public DefaultNamingStrategy(ServiceModel serviceModel, BasicCodeGenConfig codeGenConfig,
                                 CustomizationConfig customizationConfig) {
        this.serviceModel = serviceModel;
        this.customizationConfig = customizationConfig;
        this.codeGenConfig = codeGenConfig;
    }

    @Override
    public String getExceptionName(String errorShapeName) {

        if (errorShapeName.endsWith(FAULT_CLASS_SUFFIX)) {
            return capitialize(errorShapeName.substring(0, errorShapeName.length() -
                                                           FAULT_CLASS_SUFFIX.length()) +
                               EXCEPTION_CLASS_SUFFIX);
        } else if (errorShapeName.endsWith(EXCEPTION_CLASS_SUFFIX)) {
            return capitialize(errorShapeName);
        }
        return capitialize(errorShapeName + EXCEPTION_CLASS_SUFFIX);
    }

    @Override
    public String getRequestClassName(String operationName) {
        return capitialize(operationName + REQUEST_CLASS_SUFFIX);
    }

    @Override
    public String getResponseClassName(String operationName) {
        if (customizationConfig.useModeledOutputShapeNames()) {
            final Output operationOutput = serviceModel.getOperation(operationName).getOutput();
            if (operationOutput != null) {
                return operationOutput.getShape();
            }
        }
        return capitialize(operationName + RESPONSE_CLASS_SUFFIX);
    }

    @Override
    public String getVariableName(String name) {
        if (isJavaKeyword(name)) {
            return unCapitialize(name + VARIABLE_NAME_SUFFIX);
        } else {
            return unCapitialize(name);
        }
    }

    @Override
    public String getEnumValueName(String enumValue) {
        StringBuilder builder = new StringBuilder();

        String sanitizedEnumValue = enumValue.replace("::", ":").replace("/", "").replace("(", "")
                .replace(")", "");

        for (String part : sanitizedEnumValue.split("[ -.:]")) {
            if (part.length() > 1) {
                builder.append(StringUtils.upperCase(part.substring(0, 1)))
                        .append(part.substring(1));
            } else {
                builder.append(StringUtils.upperCase(part));
            }
        }

        return builder.toString();
    }

    @Override
    public String getJavaClassName(String shapeName) {
        return capitialize(shapeName);
    }

    private static boolean isJavaKeyword(String word) {
        return reservedKeywords.contains(word) ||
               reservedKeywords.contains(StringUtils.lowerCase(word));
    }
}
