/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.polly.model;

/**
 * <p>
 * The value of the "Text" parameter is longer than the accepted limits. The limit for input text is a maximum of 3000
 * characters total, of which no more than 1500 can be billed characters. SSML tags are not counted as billed
 * characters.
 * </p>
 */
public class TextLengthExceededException extends com.amazonaws.services.polly.model.AmazonPollyException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TextLengthExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TextLengthExceededException(String message) {
        super(message);
    }

}
