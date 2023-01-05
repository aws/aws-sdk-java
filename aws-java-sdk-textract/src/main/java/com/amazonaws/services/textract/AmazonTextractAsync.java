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
     * Analyzes an input document for relationships between detected items.
     * </p>
     * <p>
     * The types of information returned are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two <a>Block</a> objects, each of type
     * <code>KEY_VALUE_SET</code>: a KEY <code>Block</code> object and a VALUE <code>Block</code> object. For example,
     * <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is
     * the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains information about a detected table. A CELL
     * <code>Block</code> object is returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or more WORD <code>Block</code> objects.
     * All lines and words that are detected in the document are returned (including text that doesn't have a
     * relationship with the value of <code>FeatureTypes</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Signatures. A SIGNATURE <code>Block</code> object contains the location information of a signature in a document.
     * If used in conjunction with forms or tables, a signature can be given a Key-Value pairing or be detected in the
     * cell of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Query. A QUERY Block object contains the query text, alias and link to the associated Query results block object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Query Result. A QUERY_RESULT Block object contains the answer to the query and an ID that connects it to the
     * query asked. This Block also contains a confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons) can be detected in form data and in
     * tables. A SELECTION_ELEMENT <code>Block</code> object contains information about a selection element, including
     * the selection status.
     * </p>
     * <p>
     * You can choose which type of analysis to perform by specifying the <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>Block</code> objects.
     * </p>
     * <p>
     * <code>AnalyzeDocument</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentAnalysis</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html">Document Text Analysis</a>.
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
     * Analyzes an input document for relationships between detected items.
     * </p>
     * <p>
     * The types of information returned are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two <a>Block</a> objects, each of type
     * <code>KEY_VALUE_SET</code>: a KEY <code>Block</code> object and a VALUE <code>Block</code> object. For example,
     * <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is
     * the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains information about a detected table. A CELL
     * <code>Block</code> object is returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or more WORD <code>Block</code> objects.
     * All lines and words that are detected in the document are returned (including text that doesn't have a
     * relationship with the value of <code>FeatureTypes</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * Signatures. A SIGNATURE <code>Block</code> object contains the location information of a signature in a document.
     * If used in conjunction with forms or tables, a signature can be given a Key-Value pairing or be detected in the
     * cell of a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Query. A QUERY Block object contains the query text, alias and link to the associated Query results block object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Query Result. A QUERY_RESULT Block object contains the answer to the query and an ID that connects it to the
     * query asked. This Block also contains a confidence score.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons) can be detected in form data and in
     * tables. A SELECTION_ELEMENT <code>Block</code> object contains information about a selection element, including
     * the selection status.
     * </p>
     * <p>
     * You can choose which type of analysis to perform by specifying the <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>Block</code> objects.
     * </p>
     * <p>
     * <code>AnalyzeDocument</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentAnalysis</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html">Document Text Analysis</a>.
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
     * <code>AnalyzeExpense</code> synchronously analyzes an input document for financially related relationships
     * between text.
     * </p>
     * <p>
     * Information is returned as <code>ExpenseDocuments</code> and seperated as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LineItemGroups</code>- A data set containing <code>LineItems</code> which store information about the lines
     * of text, such as an item purchased and its price on a receipt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SummaryFields</code>- Contains all other information a receipt, such as header information or the vendors
     * name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param analyzeExpenseRequest
     * @return A Java Future containing the result of the AnalyzeExpense operation returned by the service.
     * @sample AmazonTextractAsync.AnalyzeExpense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeExpense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AnalyzeExpenseResult> analyzeExpenseAsync(AnalyzeExpenseRequest analyzeExpenseRequest);

    /**
     * <p>
     * <code>AnalyzeExpense</code> synchronously analyzes an input document for financially related relationships
     * between text.
     * </p>
     * <p>
     * Information is returned as <code>ExpenseDocuments</code> and seperated as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LineItemGroups</code>- A data set containing <code>LineItems</code> which store information about the lines
     * of text, such as an item purchased and its price on a receipt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SummaryFields</code>- Contains all other information a receipt, such as header information or the vendors
     * name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param analyzeExpenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AnalyzeExpense operation returned by the service.
     * @sample AmazonTextractAsyncHandler.AnalyzeExpense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeExpense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AnalyzeExpenseResult> analyzeExpenseAsync(AnalyzeExpenseRequest analyzeExpenseRequest,
            com.amazonaws.handlers.AsyncHandler<AnalyzeExpenseRequest, AnalyzeExpenseResult> asyncHandler);

    /**
     * <p>
     * Analyzes identity documents for relevant information. This information is extracted and returned as
     * <code>IdentityDocumentFields</code>, which records both the normalized field and value of the extracted
     * text.Unlike other Amazon Textract operations, <code>AnalyzeID</code> doesn't return any Geometry data.
     * </p>
     * 
     * @param analyzeIDRequest
     * @return A Java Future containing the result of the AnalyzeID operation returned by the service.
     * @sample AmazonTextractAsync.AnalyzeID
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeID" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AnalyzeIDResult> analyzeIDAsync(AnalyzeIDRequest analyzeIDRequest);

    /**
     * <p>
     * Analyzes identity documents for relevant information. This information is extracted and returned as
     * <code>IdentityDocumentFields</code>, which records both the normalized field and value of the extracted
     * text.Unlike other Amazon Textract operations, <code>AnalyzeID</code> doesn't return any Geometry data.
     * </p>
     * 
     * @param analyzeIDRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AnalyzeID operation returned by the service.
     * @sample AmazonTextractAsyncHandler.AnalyzeID
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeID" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AnalyzeIDResult> analyzeIDAsync(AnalyzeIDRequest analyzeIDRequest,
            com.amazonaws.handlers.AsyncHandler<AnalyzeIDRequest, AnalyzeIDResult> asyncHandler);

    /**
     * <p>
     * Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of
     * text. The input document must be in one of the following image formats: JPEG, PNG, PDF, or TIFF.
     * <code>DetectDocumentText</code> returns the detected text in an array of <a>Block</a> objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE. Each PAGE <code>Block</code> object is
     * the parent of LINE <code>Block</code> objects that represent the lines of detected text on a page. A LINE
     * <code>Block</code> object is a parent for each word that makes up the line. Words are represented by
     * <code>Block</code> objects of type WORD.
     * </p>
     * <p>
     * <code>DetectDocumentText</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentTextDetection</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html">Document Text Detection</a>.
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
     * text. The input document must be in one of the following image formats: JPEG, PNG, PDF, or TIFF.
     * <code>DetectDocumentText</code> returns the detected text in an array of <a>Block</a> objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE. Each PAGE <code>Block</code> object is
     * the parent of LINE <code>Block</code> objects that represent the lines of detected text on a page. A LINE
     * <code>Block</code> object is a parent for each word that makes up the line. Words are represented by
     * <code>Block</code> objects of type WORD.
     * </p>
     * <p>
     * <code>DetectDocumentText</code> is a synchronous operation. To analyze documents asynchronously, use
     * <a>StartDocumentTextDetection</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html">Document Text Detection</a>.
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
     * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document.
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
     * <code>GetDocumentAnalysis</code> returns an array of <a>Block</a> objects. The following types of information are
     * returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two <a>Block</a> objects, each of type
     * <code>KEY_VALUE_SET</code>: a KEY <code>Block</code> object and a VALUE <code>Block</code> object. For example,
     * <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is
     * the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains information about a detected table. A CELL
     * <code>Block</code> object is returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or more WORD <code>Block</code> objects.
     * All lines and words that are detected in the document are returned (including text that doesn't have a
     * relationship with the value of the <code>StartDocumentAnalysis</code> <code>FeatureTypes</code> input parameter).
     * </p>
     * </li>
     * <li>
     * <p>
     * Query. A QUERY Block object contains the query text, alias and link to the associated Query results block object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Query Results. A QUERY_RESULT Block object contains the answer to the query and an ID that connects it to the
     * query asked. This Block also contains a confidence score.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * While processing a document with queries, look out for <code>INVALID_REQUEST_PARAMETERS</code> output. This
     * indicates that either the per page query limit has been exceeded or that the operation is trying to query a page
     * in the document which doesn’t exist.
     * </p>
     * </note>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons) can be detected in form data and in
     * tables. A SELECTION_ELEMENT <code>Block</code> object contains information about a selection element, including
     * the selection status.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks that are returned. If there are more
     * results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response
     * contains a pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value
     * that's returned from the previous call to <code>GetDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html">Document Text Analysis</a>.
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
     * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document.
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
     * <code>GetDocumentAnalysis</code> returns an array of <a>Block</a> objects. The following types of information are
     * returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Form data (key-value pairs). The related information is returned in two <a>Block</a> objects, each of type
     * <code>KEY_VALUE_SET</code>: a KEY <code>Block</code> object and a VALUE <code>Block</code> object. For example,
     * <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is
     * the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE <code>Block</code> object contains information about a detected table. A CELL
     * <code>Block</code> object is returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE <code>Block</code> object contains one or more WORD <code>Block</code> objects.
     * All lines and words that are detected in the document are returned (including text that doesn't have a
     * relationship with the value of the <code>StartDocumentAnalysis</code> <code>FeatureTypes</code> input parameter).
     * </p>
     * </li>
     * <li>
     * <p>
     * Query. A QUERY Block object contains the query text, alias and link to the associated Query results block object.
     * </p>
     * </li>
     * <li>
     * <p>
     * Query Results. A QUERY_RESULT Block object contains the answer to the query and an ID that connects it to the
     * query asked. This Block also contains a confidence score.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * While processing a document with queries, look out for <code>INVALID_REQUEST_PARAMETERS</code> output. This
     * indicates that either the per page query limit has been exceeded or that the operation is trying to query a page
     * in the document which doesn’t exist.
     * </p>
     * </note>
     * <p>
     * Selection elements such as check boxes and option buttons (radio buttons) can be detected in form data and in
     * tables. A SELECTION_ELEMENT <code>Block</code> object contains information about a selection element, including
     * the selection status.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks that are returned. If there are more
     * results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response
     * contains a pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value
     * that's returned from the previous call to <code>GetDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html">Document Text Analysis</a>.
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
     * Gets the results for an Amazon Textract asynchronous operation that detects text in a document. Amazon Textract
     * can detect lines of text and the words that make up a line of text.
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
     * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a> objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE. Each PAGE <code>Block</code> object is
     * the parent of LINE <code>Block</code> objects that represent the lines of detected text on a page. A LINE
     * <code>Block</code> object is a parent for each word that makes up the line. Words are represented by
     * <code>Block</code> objects of type WORD.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentTextDetection</code>, and populate the <code>NextToken</code> request parameter with the token
     * value that's returned from the previous call to <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html">Document Text Detection</a>.
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
     * Gets the results for an Amazon Textract asynchronous operation that detects text in a document. Amazon Textract
     * can detect lines of text and the words that make up a line of text.
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
     * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a> objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE. Each PAGE <code>Block</code> object is
     * the parent of LINE <code>Block</code> objects that represent the lines of detected text on a page. A LINE
     * <code>Block</code> object is a parent for each word that makes up the line. Words are represented by
     * <code>Block</code> objects of type WORD.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentTextDetection</code>, and populate the <code>NextToken</code> request parameter with the token
     * value that's returned from the previous call to <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html">Document Text Detection</a>.
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
     * Gets the results for an Amazon Textract asynchronous operation that analyzes invoices and receipts. Amazon
     * Textract finds contact information, items purchased, and vendor name, from input invoices and receipts.
     * </p>
     * <p>
     * You start asynchronous invoice/receipt analysis by calling <a>StartExpenseAnalysis</a>, which returns a job
     * identifier (<code>JobId</code>). Upon completion of the invoice/receipt analysis, Amazon Textract publishes the
     * completion status to the Amazon Simple Notification Service (Amazon SNS) topic. This topic must be registered in
     * the initial call to <code>StartExpenseAnalysis</code>. To get the results of the invoice/receipt analysis
     * operation, first ensure that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <code>GetExpenseAnalysis</code>, and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetExpenseAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value
     * that's returned from the previous call to <code>GetExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/invoices-receipts.html">Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param getExpenseAnalysisRequest
     * @return A Java Future containing the result of the GetExpenseAnalysis operation returned by the service.
     * @sample AmazonTextractAsync.GetExpenseAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetExpenseAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(GetExpenseAnalysisRequest getExpenseAnalysisRequest);

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that analyzes invoices and receipts. Amazon
     * Textract finds contact information, items purchased, and vendor name, from input invoices and receipts.
     * </p>
     * <p>
     * You start asynchronous invoice/receipt analysis by calling <a>StartExpenseAnalysis</a>, which returns a job
     * identifier (<code>JobId</code>). Upon completion of the invoice/receipt analysis, Amazon Textract publishes the
     * completion status to the Amazon Simple Notification Service (Amazon SNS) topic. This topic must be registered in
     * the initial call to <code>StartExpenseAnalysis</code>. To get the results of the invoice/receipt analysis
     * operation, first ensure that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <code>GetExpenseAnalysis</code>, and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetExpenseAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value
     * that's returned from the previous call to <code>GetExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/invoices-receipts.html">Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param getExpenseAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExpenseAnalysis operation returned by the service.
     * @sample AmazonTextractAsyncHandler.GetExpenseAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetExpenseAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExpenseAnalysisResult> getExpenseAnalysisAsync(GetExpenseAnalysisRequest getExpenseAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<GetExpenseAnalysisRequest, GetExpenseAnalysisResult> asyncHandler);

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a lending document.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling <code>StartLendingAnalysis</code>, which returns a job identifier
     * (<code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to
     * the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartLendingAnalysis</code>.
     * </p>
     * <p>
     * To get the results of the text analysis operation, first check that the status value published to the Amazon SNS
     * topic is SUCCEEDED. If so, call GetLendingAnalysis, and pass the job identifier (<code>JobId</code>) from the
     * initial call to <code>StartLendingAnalysis</code>.
     * </p>
     * 
     * @param getLendingAnalysisRequest
     * @return A Java Future containing the result of the GetLendingAnalysis operation returned by the service.
     * @sample AmazonTextractAsync.GetLendingAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetLendingAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLendingAnalysisResult> getLendingAnalysisAsync(GetLendingAnalysisRequest getLendingAnalysisRequest);

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that analyzes text in a lending document.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling <code>StartLendingAnalysis</code>, which returns a job identifier
     * (<code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to
     * the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartLendingAnalysis</code>.
     * </p>
     * <p>
     * To get the results of the text analysis operation, first check that the status value published to the Amazon SNS
     * topic is SUCCEEDED. If so, call GetLendingAnalysis, and pass the job identifier (<code>JobId</code>) from the
     * initial call to <code>StartLendingAnalysis</code>.
     * </p>
     * 
     * @param getLendingAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLendingAnalysis operation returned by the service.
     * @sample AmazonTextractAsyncHandler.GetLendingAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetLendingAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLendingAnalysisResult> getLendingAnalysisAsync(GetLendingAnalysisRequest getLendingAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<GetLendingAnalysisRequest, GetLendingAnalysisResult> asyncHandler);

    /**
     * <p>
     * Gets summarized results for the <code>StartLendingAnalysis</code> operation, which analyzes text in a lending
     * document. The returned summary consists of information about documents grouped together by a common document
     * type. Information like detected signatures, page numbers, and split documents is returned with respect to the
     * type of grouped document.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling <code>StartLendingAnalysis</code>, which returns a job identifier
     * (<code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to
     * the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartLendingAnalysis</code>.
     * </p>
     * <p>
     * To get the results of the text analysis operation, first check that the status value published to the Amazon SNS
     * topic is SUCCEEDED. If so, call <code>GetLendingAnalysisSummary</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartLendingAnalysis</code>.
     * </p>
     * 
     * @param getLendingAnalysisSummaryRequest
     * @return A Java Future containing the result of the GetLendingAnalysisSummary operation returned by the service.
     * @sample AmazonTextractAsync.GetLendingAnalysisSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetLendingAnalysisSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLendingAnalysisSummaryResult> getLendingAnalysisSummaryAsync(
            GetLendingAnalysisSummaryRequest getLendingAnalysisSummaryRequest);

    /**
     * <p>
     * Gets summarized results for the <code>StartLendingAnalysis</code> operation, which analyzes text in a lending
     * document. The returned summary consists of information about documents grouped together by a common document
     * type. Information like detected signatures, page numbers, and split documents is returned with respect to the
     * type of grouped document.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling <code>StartLendingAnalysis</code>, which returns a job identifier
     * (<code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to
     * the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartLendingAnalysis</code>.
     * </p>
     * <p>
     * To get the results of the text analysis operation, first check that the status value published to the Amazon SNS
     * topic is SUCCEEDED. If so, call <code>GetLendingAnalysisSummary</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartLendingAnalysis</code>.
     * </p>
     * 
     * @param getLendingAnalysisSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLendingAnalysisSummary operation returned by the service.
     * @sample AmazonTextractAsyncHandler.GetLendingAnalysisSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetLendingAnalysisSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLendingAnalysisSummaryResult> getLendingAnalysisSummaryAsync(
            GetLendingAnalysisSummaryRequest getLendingAnalysisSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetLendingAnalysisSummaryRequest, GetLendingAnalysisSummaryResult> asyncHandler);

    /**
     * <p>
     * Starts the asynchronous analysis of an input document for relationships between detected items such as key-value
     * pairs, tables, and selection elements.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> can analyze text in documents that are in JPEG, PNG, TIFF, and PDF format. The
     * documents are stored in an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name and file name
     * of the document.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results
     * of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text analysis operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetDocumentAnalysis</a>, and pass the job identifier (<code>JobId</code>)
     * from the initial call to <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html">Document Text Analysis</a>.
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
     * Starts the asynchronous analysis of an input document for relationships between detected items such as key-value
     * pairs, tables, and selection elements.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> can analyze text in documents that are in JPEG, PNG, TIFF, and PDF format. The
     * documents are stored in an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name and file name
     * of the document.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results
     * of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text analysis operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetDocumentAnalysis</a>, and pass the job identifier (<code>JobId</code>)
     * from the initial call to <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html">Document Text Analysis</a>.
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
     * <code>StartDocumentTextDetection</code> can analyze text in documents that are in JPEG, PNG, TIFF, and PDF
     * format. The documents are stored in an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name
     * and file name of the document.
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
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html">Document Text Detection</a>.
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
     * <code>StartDocumentTextDetection</code> can analyze text in documents that are in JPEG, PNG, TIFF, and PDF
     * format. The documents are stored in an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name
     * and file name of the document.
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
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html">Document Text Detection</a>.
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

    /**
     * <p>
     * Starts the asynchronous analysis of invoices or receipts for data like contact information, items purchased, and
     * vendor names.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> can analyze text in documents that are in JPEG, PNG, and PDF format. The
     * documents must be stored in an Amazon S3 bucket. Use the <a>DocumentLocation</a> parameter to specify the name of
     * your S3 bucket and the name of the document in that bucket.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> returns a job identifier (<code>JobId</code>) that you will provide to
     * <code>GetExpenseAnalysis</code> to retrieve the results of the operation. When the analysis of the input
     * invoices/receipts is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that you provide to the <code>NotificationChannel</code>. To obtain the results of the
     * invoice and receipt analysis operation, ensure that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetExpenseAnalysis</a>, and pass the job identifier (<code>JobId</code>)
     * that was returned by your call to <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/invoice-receipts.html">Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param startExpenseAnalysisRequest
     * @return A Java Future containing the result of the StartExpenseAnalysis operation returned by the service.
     * @sample AmazonTextractAsync.StartExpenseAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartExpenseAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(StartExpenseAnalysisRequest startExpenseAnalysisRequest);

    /**
     * <p>
     * Starts the asynchronous analysis of invoices or receipts for data like contact information, items purchased, and
     * vendor names.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> can analyze text in documents that are in JPEG, PNG, and PDF format. The
     * documents must be stored in an Amazon S3 bucket. Use the <a>DocumentLocation</a> parameter to specify the name of
     * your S3 bucket and the name of the document in that bucket.
     * </p>
     * <p>
     * <code>StartExpenseAnalysis</code> returns a job identifier (<code>JobId</code>) that you will provide to
     * <code>GetExpenseAnalysis</code> to retrieve the results of the operation. When the analysis of the input
     * invoices/receipts is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that you provide to the <code>NotificationChannel</code>. To obtain the results of the
     * invoice and receipt analysis operation, ensure that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetExpenseAnalysis</a>, and pass the job identifier (<code>JobId</code>)
     * that was returned by your call to <code>StartExpenseAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/invoice-receipts.html">Analyzing Invoices and Receipts</a>.
     * </p>
     * 
     * @param startExpenseAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartExpenseAnalysis operation returned by the service.
     * @sample AmazonTextractAsyncHandler.StartExpenseAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartExpenseAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartExpenseAnalysisResult> startExpenseAnalysisAsync(StartExpenseAnalysisRequest startExpenseAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<StartExpenseAnalysisRequest, StartExpenseAnalysisResult> asyncHandler);

    /**
     * <p>
     * Starts the classification and analysis of an input document. <code>StartLendingAnalysis</code> initiates the
     * classification and analysis of a packet of lending documents. <code>StartLendingAnalysis</code> operates on a
     * document file located in an Amazon S3 bucket.
     * </p>
     * <p>
     * <code>StartLendingAnalysis</code> can analyze text in documents that are in one of the following formats: JPEG,
     * PNG, TIFF, PDF. Use <code>DocumentLocation</code> to specify the bucket name and the file name of the document.
     * </p>
     * <p>
     * <code>StartLendingAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results
     * of the operation. When the text analysis is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text analysis operation, first check that the status value published to the Amazon SNS topic is
     * SUCCEEDED. If the status is SUCCEEDED you can call either <code>GetLendingAnalysis</code> or
     * <code>GetLendingAnalysisSummary</code> and provide the <code>JobId</code> to obtain the results of the analysis.
     * </p>
     * <p>
     * If using <code>OutputConfig</code> to specify an Amazon S3 bucket, the output will be contained within the
     * specified prefix in a directory labeled with the job-id. In the directory there are 3 sub-directories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * detailedResponse (contains the GetLendingAnalysis response)
     * </p>
     * </li>
     * <li>
     * <p>
     * summaryResponse (for the GetLendingAnalysisSummary response)
     * </p>
     * </li>
     * <li>
     * <p>
     * splitDocuments (documents split across logical boundaries)
     * </p>
     * </li>
     * </ul>
     * 
     * @param startLendingAnalysisRequest
     * @return A Java Future containing the result of the StartLendingAnalysis operation returned by the service.
     * @sample AmazonTextractAsync.StartLendingAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartLendingAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartLendingAnalysisResult> startLendingAnalysisAsync(StartLendingAnalysisRequest startLendingAnalysisRequest);

    /**
     * <p>
     * Starts the classification and analysis of an input document. <code>StartLendingAnalysis</code> initiates the
     * classification and analysis of a packet of lending documents. <code>StartLendingAnalysis</code> operates on a
     * document file located in an Amazon S3 bucket.
     * </p>
     * <p>
     * <code>StartLendingAnalysis</code> can analyze text in documents that are in one of the following formats: JPEG,
     * PNG, TIFF, PDF. Use <code>DocumentLocation</code> to specify the bucket name and the file name of the document.
     * </p>
     * <p>
     * <code>StartLendingAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results
     * of the operation. When the text analysis is finished, Amazon Textract publishes a completion status to the Amazon
     * Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the
     * results of the text analysis operation, first check that the status value published to the Amazon SNS topic is
     * SUCCEEDED. If the status is SUCCEEDED you can call either <code>GetLendingAnalysis</code> or
     * <code>GetLendingAnalysisSummary</code> and provide the <code>JobId</code> to obtain the results of the analysis.
     * </p>
     * <p>
     * If using <code>OutputConfig</code> to specify an Amazon S3 bucket, the output will be contained within the
     * specified prefix in a directory labeled with the job-id. In the directory there are 3 sub-directories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * detailedResponse (contains the GetLendingAnalysis response)
     * </p>
     * </li>
     * <li>
     * <p>
     * summaryResponse (for the GetLendingAnalysisSummary response)
     * </p>
     * </li>
     * <li>
     * <p>
     * splitDocuments (documents split across logical boundaries)
     * </p>
     * </li>
     * </ul>
     * 
     * @param startLendingAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartLendingAnalysis operation returned by the service.
     * @sample AmazonTextractAsyncHandler.StartLendingAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartLendingAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartLendingAnalysisResult> startLendingAnalysisAsync(StartLendingAnalysisRequest startLendingAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<StartLendingAnalysisRequest, StartLendingAnalysisResult> asyncHandler);

}
