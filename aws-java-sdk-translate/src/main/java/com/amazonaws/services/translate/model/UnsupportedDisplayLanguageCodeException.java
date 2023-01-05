/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import javax.annotation.Generated;

/**
 * <p>
 * Requested display language code is not supported.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedDisplayLanguageCodeException extends com.amazonaws.services.translate.model.AmazonTranslateException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Language code passed in with the request.
     * </p>
     */
    private String displayLanguageCode;

    /**
     * Constructs a new UnsupportedDisplayLanguageCodeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedDisplayLanguageCodeException(String message) {
        super(message);
    }

    /**
     * <p>
     * Language code passed in with the request.
     * </p>
     * 
     * @param displayLanguageCode
     *        Language code passed in with the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("DisplayLanguageCode")
    public void setDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
    }

    /**
     * <p>
     * Language code passed in with the request.
     * </p>
     * 
     * @return Language code passed in with the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("DisplayLanguageCode")
    public String getDisplayLanguageCode() {
        return this.displayLanguageCode;
    }

    /**
     * <p>
     * Language code passed in with the request.
     * </p>
     * 
     * @param displayLanguageCode
     *        Language code passed in with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedDisplayLanguageCodeException withDisplayLanguageCode(String displayLanguageCode) {
        setDisplayLanguageCode(displayLanguageCode);
        return this;
    }

}
