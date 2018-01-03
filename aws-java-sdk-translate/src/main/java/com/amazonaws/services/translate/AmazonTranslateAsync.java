/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate;

import javax.annotation.Generated;

import com.amazonaws.services.translate.model.*;

/**
 * Interface for accessing Amazon Translate asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.translate.AbstractAmazonTranslateAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provides translation between English and one of six languages, or between one of the six languages and English.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTranslateAsync extends AmazonTranslate {

    /**
     * <p>
     * Translates input text from the source language to the target language. You can translate between English (en) and
     * one of the following languages, or between one of the following languages and English.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Arabic (ar)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Simplified) (zh)
     * </p>
     * </li>
     * <li>
     * <p>
     * French (fr)
     * </p>
     * </li>
     * <li>
     * <p>
     * German (de)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * </ul>
     * 
     * @param translateTextRequest
     * @return A Java Future containing the result of the TranslateText operation returned by the service.
     * @sample AmazonTranslateAsync.TranslateText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TranslateTextResult> translateTextAsync(TranslateTextRequest translateTextRequest);

    /**
     * <p>
     * Translates input text from the source language to the target language. You can translate between English (en) and
     * one of the following languages, or between one of the following languages and English.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Arabic (ar)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Simplified) (zh)
     * </p>
     * </li>
     * <li>
     * <p>
     * French (fr)
     * </p>
     * </li>
     * <li>
     * <p>
     * German (de)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * </ul>
     * 
     * @param translateTextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TranslateText operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.TranslateText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TranslateTextResult> translateTextAsync(TranslateTextRequest translateTextRequest,
            com.amazonaws.handlers.AsyncHandler<TranslateTextRequest, TranslateTextResult> asyncHandler);

}
