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

/**
 * Strategy to name various Java constructs based on the naming in the model and potentially customizations.
 */
public interface NamingStrategy {

    /**
     * @param errorShapeName Name of error shape to derive exception class name from.
     * @return Appropriate name to use for a Java exception class name
     */
    String getExceptionName(String errorShapeName);


    /**
     * @param operationName Name of operation used to derive request class name.
     * @return Appropriate name to use for the Java class representing the request shape.
     */
    String getRequestClassName(String operationName);

    /**
     * @param operationName Name of operation used to derive response class name.
     * @return Appropriate name to use for the Java class representing the response shape.
     */
    String getResponseClassName(String operationName);

    /**
     * @param name Some contextual name to derive variable name from (i.e. member name, java class name, etc).
     * @return Appropriate name to use for a Java variable or field.
     */
    String getVariableName(String name);

    /**
     * @param enumValue Enum value as defined in the service model used to derive the java name.
     * @return Appropriate name to use for a Java enum value
     */
    String getEnumValueName(String enumValue);

    /**
     * @param shapeName Name of structure used to derive Java class name.
     * @return Appropriate name to use for a Java class for an arbitrary (not a request, response, error) structure.
     */
    String getJavaClassName(String shapeName);

    /**
     * @param shapeName Name of an authorizer shape used to derive the authorizer name
     * @return Appropriate name to use for a Java class for an Authorizer
     */
    String getAuthorizerClassName(String shapeName);

    /**
     * @param memberName Member name to name getter for.
     * @return Name of the getter method for a model class member.
     */
    String getGetterMethodName(String memberName);

    /**
     * @param memberName Member name to name setter for.
     * @return Name of the setter method for a model class member.
     */
    String getSetterMethodName(String memberName);

    /**
     * @param memberName Member name to name fluent setter for.
     * @return Appropriate name to use for fluent setter method (i.e. withFoo) for a model class member.
     */
    String getFluentSetterMethodName(String memberName);
}
