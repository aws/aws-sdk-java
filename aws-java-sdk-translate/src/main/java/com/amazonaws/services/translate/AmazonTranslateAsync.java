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
 * Provides translation between one source language and another of the same set of languages.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTranslateAsync extends AmazonTranslate {

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @return A Java Future containing the result of the DeleteTerminology operation returned by the service.
     * @sample AmazonTranslateAsync.DeleteTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DeleteTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(DeleteTerminologyRequest deleteTerminologyRequest);

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTerminology operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.DeleteTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DeleteTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTerminologyResult> deleteTerminologyAsync(DeleteTerminologyRequest deleteTerminologyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTerminologyRequest, DeleteTerminologyResult> asyncHandler);

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @return A Java Future containing the result of the GetTerminology operation returned by the service.
     * @sample AmazonTranslateAsync.GetTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetTerminology" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest getTerminologyRequest);

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTerminology operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.GetTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetTerminology" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest getTerminologyRequest,
            com.amazonaws.handlers.AsyncHandler<GetTerminologyRequest, GetTerminologyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
     * name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
     * will overwrite an existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
     * propagate and be available for use in a translation due to cache policies with the DataPlane service that
     * performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @return A Java Future containing the result of the ImportTerminology operation returned by the service.
     * @sample AmazonTranslateAsync.ImportTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(ImportTerminologyRequest importTerminologyRequest);

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
     * name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
     * will overwrite an existing terminology of the same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
     * propagate and be available for use in a translation due to cache policies with the DataPlane service that
     * performs the translations.
     * </p>
     * 
     * @param importTerminologyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportTerminology operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.ImportTerminology
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportTerminologyResult> importTerminologyAsync(ImportTerminologyRequest importTerminologyRequest,
            com.amazonaws.handlers.AsyncHandler<ImportTerminologyRequest, ImportTerminologyResult> asyncHandler);

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @return A Java Future containing the result of the ListTerminologies operation returned by the service.
     * @sample AmazonTranslateAsync.ListTerminologies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTerminologies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(ListTerminologiesRequest listTerminologiesRequest);

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTerminologies operation returned by the service.
     * @sample AmazonTranslateAsyncHandler.ListTerminologies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTerminologies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTerminologiesResult> listTerminologiesAsync(ListTerminologiesRequest listTerminologiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTerminologiesRequest, ListTerminologiesResult> asyncHandler);

    /**
     * <p>
     * Translates input text from the source language to the target language. It is not necessary to use English (en) as
     * either the source or the target language but not all language combinations are supported by Amazon Translate. For
     * more information, see <a href="http://docs.aws.amazon.com/translate/latest/dg/pairs.html">Supported Language
     * Pairs</a>.
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
     * Chinese (Traditional) (zh-TW)
     * </p>
     * </li>
     * <li>
     * <p>
     * Czech (cs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Danish (da)
     * </p>
     * </li>
     * <li>
     * <p>
     * Dutch (nl)
     * </p>
     * </li>
     * <li>
     * <p>
     * English (en)
     * </p>
     * </li>
     * <li>
     * <p>
     * Finnish (fi)
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
     * Hebrew (he)
     * </p>
     * </li>
     * <li>
     * <p>
     * Indonesian (id)
     * </p>
     * </li>
     * <li>
     * <p>
     * Italian (it)
     * </p>
     * </li>
     * <li>
     * <p>
     * Japanese (ja)
     * </p>
     * </li>
     * <li>
     * <p>
     * Korean (ko)
     * </p>
     * </li>
     * <li>
     * <p>
     * Polish (pl)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Russian (ru)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * <li>
     * <p>
     * Swedish (sv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Turkish (tr)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call Amazon
     * Comprehend to determine the source language.
     * </p>
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
     * Translates input text from the source language to the target language. It is not necessary to use English (en) as
     * either the source or the target language but not all language combinations are supported by Amazon Translate. For
     * more information, see <a href="http://docs.aws.amazon.com/translate/latest/dg/pairs.html">Supported Language
     * Pairs</a>.
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
     * Chinese (Traditional) (zh-TW)
     * </p>
     * </li>
     * <li>
     * <p>
     * Czech (cs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Danish (da)
     * </p>
     * </li>
     * <li>
     * <p>
     * Dutch (nl)
     * </p>
     * </li>
     * <li>
     * <p>
     * English (en)
     * </p>
     * </li>
     * <li>
     * <p>
     * Finnish (fi)
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
     * Hebrew (he)
     * </p>
     * </li>
     * <li>
     * <p>
     * Indonesian (id)
     * </p>
     * </li>
     * <li>
     * <p>
     * Italian (it)
     * </p>
     * </li>
     * <li>
     * <p>
     * Japanese (ja)
     * </p>
     * </li>
     * <li>
     * <p>
     * Korean (ko)
     * </p>
     * </li>
     * <li>
     * <p>
     * Polish (pl)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Russian (ru)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * <li>
     * <p>
     * Swedish (sv)
     * </p>
     * </li>
     * <li>
     * <p>
     * Turkish (tr)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call Amazon
     * Comprehend to determine the source language.
     * </p>
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
