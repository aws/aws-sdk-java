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

public enum ShapeType {

    Request("Request"),
    Response("Response"),
    Exception("Exception"),
    Enum("Enum"),
    Model("Model");

    private String value;

    private ShapeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ShapeType fromValue(String value) {
        if (value.equals(Request.getValue())) {
            return Request;
        } else if (value.equals(Response.getValue())) {
            return Response;
        } else if (value.equals(Enum.getValue())) {
            return Enum;
        } else if (value.equals(Exception.getValue())) {
            return Exception;
        } else {
            return Model;
        }
    }
}
