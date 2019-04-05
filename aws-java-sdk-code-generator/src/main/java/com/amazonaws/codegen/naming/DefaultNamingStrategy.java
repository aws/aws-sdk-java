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

import static com.amazonaws.codegen.internal.Constants.AUTHORIZER_NAME_PREFIX;
import static com.amazonaws.codegen.internal.Constants.EXCEPTION_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.FAULT_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.REQUEST_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.RESPONSE_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.VARIABLE_NAME_SUFFIX;
import static com.amazonaws.codegen.internal.Utils.capitialize;
import static com.amazonaws.codegen.internal.Utils.unCapitialize;

import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.Protocol;
import com.amazonaws.codegen.model.service.Output;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.util.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Default implementation of naming strategy respecting customizations supplied by {@link
 * CustomizationConfig}.
 */
public class DefaultNamingStrategy implements NamingStrategy {

    private final static Set<String> reservedKeywords;

    static {
        reservedKeywords = new HashSet<>();
        Collections.addAll(reservedKeywords,
                           "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                           "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for",
                           "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package",
                           "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch",
                           "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "true",
                           "null", "false", "const", "goto");
    }

    private final ServiceModel serviceModel;
    private final CustomizationConfig customizationConfig;

    public DefaultNamingStrategy(ServiceModel serviceModel, CustomizationConfig customizationConfig) {
        this.serviceModel = serviceModel;
        this.customizationConfig = customizationConfig;
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
        return Utils.sanitize(operationName).map(Utils::capitialize).collect(Collectors.joining()) + REQUEST_CLASS_SUFFIX;
    }

    @Override
    public String getResponseClassName(String operationName) {
        if (customizationConfig.useModeledOutputShapeNames()) {
            final Output operationOutput = serviceModel.getOperation(operationName).getOutput();
            if (operationOutput != null) {
                return operationOutput.getShape();
            }
        }
        return Utils.sanitize(operationName).map(Utils::capitialize).collect(Collectors.joining()) + RESPONSE_CLASS_SUFFIX;
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
        return Arrays.stream(shapeName.split("[._-]|\\W")).filter(StringUtils::hasValue).map(Utils::capitialize).collect(Collectors.joining());
    }

    @Override
    public String getAuthorizerClassName(String shapeName) {
        String converted = getJavaClassName(shapeName);
        if (converted.length() > 0 && !Character.isLetter(converted.charAt(0))) {
            return AUTHORIZER_NAME_PREFIX + converted;
        }
        return converted;
    }

    @Override
    public String getGetterMethodName(String memberName) {
        return String.format("get%s", Utils.capitialize(memberName));
    }

    @Override
    public String getSetterMethodName(String memberName) {
        return String.format("set%s", Utils.capitialize(memberName));
    }

    @Override
    public String getFluentSetterMethodName(String memberName) {
        if (Protocol.fromValue(serviceModel.getMetadata().getProtocol()) == Protocol.API_GATEWAY) {
            return Utils.unCapitialize(memberName);
        } else {
            return String.format("with%s", Utils.capitialize(memberName));
        }
    }

    public static boolean isJavaKeyword(String word) {
        return reservedKeywords.contains(word) ||
               reservedKeywords.contains(StringUtils.lowerCase(word));
    }
}
