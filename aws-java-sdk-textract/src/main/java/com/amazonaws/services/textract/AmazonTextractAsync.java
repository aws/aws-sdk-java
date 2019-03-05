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
package com.amazonaws.services.textract;

import javax.annotation.Generated;

import com.amazonaws.services.textract.model.*;

/**
 * Interface for accessing Amazon Textract asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.textract.AbstractAmazonTextractAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API
 * reference documentation for Amazon Textract.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTextractAsync extends AmazonTextract {

    /**
     * <p>
     * Analyzes an input document for relationships in the detected text and tables.
     * </p>
     * <p>
     * Two types of information are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Words and lines that are related to nearby lines and words. The related information is returned in two
     * <a>Block</a> objects: a KEY Block object and a VALUE Block object. For example, <i>Name: Ana Silva Carolina</i>
     * contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE Block contains information about a detected table. A CELL block is returned
     * for each cell in a table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can choose which type of analysis to perform by specifying the <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>BLOCK</code> objects (Blocks). For more information, see
     * <a>how-it-works-analyzing</a>.
     * </p>
     * <p>
     * <code>AnalyzeDocument</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentAnalysis</a>.
     * </p>
     * 
     * @param analyzeDocumentRequest
     * @return A Java Future containing the result of the AnalyzeDocument operation returned by the service.
     * @sample AmazonTextractAsync.AnalyzeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AnalyzeDocumentResult> analyzeDocumentAsync(AnalyzeDocumentRequest analyzeDocumentRequest);

    /**
     * <p>
     * Analyzes an input document for relationships in the detected text and tables.
     * </p>
     * <p>
     * Two types of information are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Words and lines that are related to nearby lines and words. The related information is returned in two
     * <a>Block</a> objects: a KEY Block object and a VALUE Block object. For example, <i>Name: Ana Silva Carolina</i>
     * contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE Block contains information about a detected table. A CELL block is returned
     * for each cell in a table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can choose which type of analysis to perform by specifying the <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>BLOCK</code> objects (Blocks). For more information, see
     * <a>how-it-works-analyzing</a>.
     * </p>
     * <p>
     * <code>AnalyzeDocument</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentAnalysis</a>.
     * </p>
     * 
     * @param analyzeDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AnalyzeDocument operation returned by the service.
     * @sample AmazonTextractAsyncHandler.AnalyzeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AnalyzeDocumentResult> analyzeDocumentAsync(AnalyzeDocumentRequest analyzeDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<AnalyzeDocumentRequest, AnalyzeDocumentResult> asyncHandler);

    /**
     * <p>
     * Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of
     * text. The input document must be an image in JPG or PNG format. <code>DetectDocumentText</code> returns the
     * detected text in an array of <a>Block</a> objects. For more information, see <a>how-it-works-detecting</a>.
     * </p>
     * <p>
     * <code>DetectDocumentText</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentTextDetection</a>.
     * </p>
     * 
     * @param detectDocumentTextRequest
     * @return A Java Future containing the result of the DetectDocumentText operation returned by the service.
     * @sample AmazonTextractAsync.DetectDocumentText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/DetectDocumentText" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectDocumentTextResult> detectDocumentTextAsync(DetectDocumentTextRequest detectDocumentTextRequest);

    /**
     * <p>
     * Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of
     * text. The input document must be an image in JPG or PNG format. <code>DetectDocumentText</code> returns the
     * detected text in an array of <a>Block</a> objects. For more information, see <a>how-it-works-detecting</a>.
     * </p>
     * <p>
     * <code>DetectDocumentText</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentTextDetection</a>.
     * </p>
     * 
     * @param detectDocumentTextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectDocumentText operation returned by the service.
     * @sample AmazonTextractAsyncHandler.DetectDocumentText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/DetectDocumentText" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectDocumentTextResult> detectDocumentTextAsync(DetectDocumentTextRequest detectDocumentTextRequest,
            com.amazonaws.handlers.AsyncHandler<DetectDocumentTextRequest, DetectDocumentTextResult> asyncHandler);

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document image.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling <a>StartDocumentAnalysis</a>, which returns a job identifier (
     * <code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to
     * the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentAnalysis</code>. To get the results of the text-detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentAnalysis</code>, and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * <code>GetDocumentAnalysis</code> returns an array of <a>Block</a> objects. For more information, see
     * <a>how-it-works-analyzing</a>.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value
     * that's returned from the previous call to <code>GetDocumentAnalysis</code>.
     * </p>
     * 
     * @param getDocumentAnalysisRequest
     * @return A Java Future containing the result of the GetDocumentAnalysis operation returned by the service.
     * @sample AmazonTextractAsync.GetDocumentAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(GetDocumentAnalysisRequest getDocumentAnalysisRequest);

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document image.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling <a>StartDocumentAnalysis</a>, which returns a job identifier (
     * <code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to
     * the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentAnalysis</code>. To get the results of the text-detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentAnalysis</code>, and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * <code>GetDocumentAnalysis</code> returns an array of <a>Block</a> objects. For more information, see
     * <a>how-it-works-analyzing</a>.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value
     * that's returned from the previous call to <code>GetDocumentAnalysis</code>.
     * </p>
     * 
     * @param getDocumentAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentAnalysis operation returned by the service.
     * @sample AmazonTextractAsyncHandler.GetDocumentAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentAnalysisResult> getDocumentAnalysisAsync(GetDocumentAnalysisRequest getDocumentAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentAnalysisRequest, GetDocumentAnalysisResult> asyncHandler);

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that detects text in a document image. Amazon
     * Textract can detect lines of text and the words that make up a line of text.
     * </p>
     * <p>
     * You start asynchronous text detection by calling <a>StartDocumentTextDetection</a>, which returns a job
     * identifier (<code>JobId</code>). When the text detection operation finishes, Amazon Textract publishes a
     * completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial
     * call to <code>StartDocumentTextDetection</code>. To get the results of the text-detection operation, first check
     * that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentTextDetection</code>, and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a> objects. For more information, see
     * <a>how-it-works-detecting</a>.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentTextDetection</code>, and populate the <code>NextToken</code> request parameter with the token
     * value that's returned from the previous call to <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see Document Text Detection in the Amazon Textract Developer Guide.
     * </p>
     * 
     * @param getDocumentTextDetectionRequest
     * @return A Java Future containing the result of the GetDocumentTextDetection operation returned by the service.
     * @sample AmazonTextractAsync.GetDocumentTextDetection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentTextDetection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(GetDocumentTextDetectionRequest getDocumentTextDetectionRequest);

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that detects text in a document image. Amazon
     * Textract can detect lines of text and the words that make up a line of text.
     * </p>
     * <p>
     * You start asynchronous text detection by calling <a>StartDocumentTextDetection</a>, which returns a job
     * identifier (<code>JobId</code>). When the text detection operation finishes, Amazon Textract publishes a
     * completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial
     * call to <code>StartDocumentTextDetection</code>. To get the results of the text-detection operation, first check
     * that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentTextDetection</code>, and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a> objects. For more information, see
     * <a>how-it-works-detecting</a>.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentTextDetection</code>, and populate the <code>NextToken</code> request parameter with the token
     * value that's returned from the previous call to <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see Document Text Detection in the Amazon Textract Developer Guide.
     * </p>
     * 
     * @param getDocumentTextDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentTextDetection operation returned by the service.
     * @sample AmazonTextractAsyncHandler.GetDocumentTextDetection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentTextDetection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentTextDetectionResult> getDocumentTextDetectionAsync(GetDocumentTextDetectionRequest getDocumentTextDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentTextDetectionRequest, GetDocumentTextDetectionResult> asyncHandler);

    /**
     * <p>
     * Starts asynchronous analysis of text for relationships in the text and tables that are detected in a document.
     * Amazon Textract returns for two types of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Words and lines that are related to nearby lines and words. The related information is returned in two
     * <a>Block</a> objects: A KEY Block object and a VALUE Block object. For example, <i>Name: Ana Silva Carolina</i>
     * contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE block contains information about a detected table. A CELL block is returned
     * for each cell in a table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Textract can analyze text in document images and PDF files that are stored in an Amazon S3 bucket. Use
     * <a>DocumentLocation</a> to specify the bucket name and file name of the document image.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results
     * of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text analysis operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetDocumentAnalysis</a>, and pass the job identifier (<code>JobId</code>)
     * from the initial call to <code>StartDocumentAnalysis</code>.
     * </p>
     * 
     * @param startDocumentAnalysisRequest
     * @return A Java Future containing the result of the StartDocumentAnalysis operation returned by the service.
     * @sample AmazonTextractAsync.StartDocumentAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(StartDocumentAnalysisRequest startDocumentAnalysisRequest);

    /**
     * <p>
     * Starts asynchronous analysis of text for relationships in the text and tables that are detected in a document.
     * Amazon Textract returns for two types of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Words and lines that are related to nearby lines and words. The related information is returned in two
     * <a>Block</a> objects: A KEY Block object and a VALUE Block object. For example, <i>Name: Ana Silva Carolina</i>
     * contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE block contains information about a detected table. A CELL block is returned
     * for each cell in a table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Textract can analyze text in document images and PDF files that are stored in an Amazon S3 bucket. Use
     * <a>DocumentLocation</a> to specify the bucket name and file name of the document image.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results
     * of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text analysis operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetDocumentAnalysis</a>, and pass the job identifier (<code>JobId</code>)
     * from the initial call to <code>StartDocumentAnalysis</code>.
     * </p>
     * 
     * @param startDocumentAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDocumentAnalysis operation returned by the service.
     * @sample AmazonTextractAsyncHandler.StartDocumentAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartDocumentAnalysisResult> startDocumentAnalysisAsync(StartDocumentAnalysisRequest startDocumentAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<StartDocumentAnalysisRequest, StartDocumentAnalysisResult> asyncHandler);

    /**
     * <p>
     * Starts the asynchronous detection of text in a document. Amazon Textract can detect lines of text and the words
     * that make up a line of text.
     * </p>
     * <p>
     * Amazon Textract can detect text in document images and PDF files that are stored in an Amazon S3 bucket. Use
     * <a>DocumentLocation</a> to specify the bucket name and the file name of the document image.
     * </p>
     * <p>
     * <code>StartTextDetection</code> returns a job identifier (<code>JobId</code>) that you use to get the results of
     * the operation. When text detection is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text detection operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetDocumentTextDetection</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see Document Text Detection in the Amazon Textract Developer Guide.
     * </p>
     * 
     * @param startDocumentTextDetectionRequest
     * @return A Java Future containing the result of the StartDocumentTextDetection operation returned by the service.
     * @sample AmazonTextractAsync.StartDocumentTextDetection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentTextDetection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(
            StartDocumentTextDetectionRequest startDocumentTextDetectionRequest);

    /**
     * <p>
     * Starts the asynchronous detection of text in a document. Amazon Textract can detect lines of text and the words
     * that make up a line of text.
     * </p>
     * <p>
     * Amazon Textract can detect text in document images and PDF files that are stored in an Amazon S3 bucket. Use
     * <a>DocumentLocation</a> to specify the bucket name and the file name of the document image.
     * </p>
     * <p>
     * <code>StartTextDetection</code> returns a job identifier (<code>JobId</code>) that you use to get the results of
     * the operation. When text detection is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text detection operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetDocumentTextDetection</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see Document Text Detection in the Amazon Textract Developer Guide.
     * </p>
     * 
     * @param startDocumentTextDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDocumentTextDetection operation returned by the service.
     * @sample AmazonTextractAsyncHandler.StartDocumentTextDetection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentTextDetection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDocumentTextDetectionResult> startDocumentTextDetectionAsync(
            StartDocumentTextDetectionRequest startDocumentTextDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<StartDocumentTextDetectionRequest, StartDocumentTextDetectionResult> asyncHandler);

}
