/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;


/**
 * @see DataConverter
 * 
 * @author fateev
 */
@SuppressWarnings("serial")
public class DataConverterException extends RuntimeException {

    private String key;

    public DataConverterException() {
    }

    public DataConverterException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataConverterException(String message) {
        super(message);
    }

    public DataConverterException(Throwable cause) {
        super(cause);
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " when mapping key \"" + key + "\"";
    }
}
