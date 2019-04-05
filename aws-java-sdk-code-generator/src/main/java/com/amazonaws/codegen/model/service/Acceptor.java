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

package com.amazonaws.codegen.model.service;

import com.fasterxml.jackson.databind.JsonNode;

public class Acceptor {

    private String matcher;

    private String argument;

    private String state;

    private JsonNode expected;

    public Acceptor(){}

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setMatcher(String matcher) {
        this.matcher = matcher;
    }

    public String getMatcher() {
        return matcher;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    public String getArgument() {
        return argument;
    }

    public void setExpected(JsonNode expected) {
        this.expected = expected;
    }

    public JsonNode getExpected() {
        return expected;
    }

}
