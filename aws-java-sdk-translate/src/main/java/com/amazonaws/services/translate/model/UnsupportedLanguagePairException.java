/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Translate does not support translation from the language of the source text into the requested target
 * language. For more information, see <a>how-to-error-msg</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedLanguagePairException extends com.amazonaws.services.translate.model.AmazonTranslateException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     */
    private String targetLanguageCode;

    /**
     * Constructs a new UnsupportedLanguagePairException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedLanguagePairException(String message) {
        super(message);
    }

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the input text.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SourceLanguageCode")
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     * 
     * @return The language code for the language of the input text.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SourceLanguageCode")
    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the input text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedLanguagePairException withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code for the language of the translated text.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("TargetLanguageCode")
    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     * 
     * @return The language code for the language of the translated text.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("TargetLanguageCode")
    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code for the language of the translated text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedLanguagePairException withTargetLanguageCode(String targetLanguageCode) {
        setTargetLanguageCode(targetLanguageCode);
        return this;
    }

}
