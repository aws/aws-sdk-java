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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.textract.AmazonTextractClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.services.textract.model.transform.*;

/**
 * Client for accessing Amazon Textract. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Textract detects and analyzes text in documents and converts it into machine-readable text. This is the API
 * reference documentation for Amazon Textract.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTextractClient extends AmazonWebServiceClient implements AmazonTextract {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonTextract.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "textract";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.textract.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadDocumentException").withModeledClass(
                                    com.amazonaws.services.textract.model.BadDocumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.textract.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DocumentTooLargeException").withModeledClass(
                                    com.amazonaws.services.textract.model.DocumentTooLargeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProvisionedThroughputExceededException").withModeledClass(
                                    com.amazonaws.services.textract.model.ProvisionedThroughputExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedDocumentException").withModeledClass(
                                    com.amazonaws.services.textract.model.UnsupportedDocumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidJobIdException").withModeledClass(
                                    com.amazonaws.services.textract.model.InvalidJobIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3ObjectException").withModeledClass(
                                    com.amazonaws.services.textract.model.InvalidS3ObjectException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.textract.model.InternalServerErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.textract.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.textract.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withModeledClass(
                                    com.amazonaws.services.textract.model.IdempotentParameterMismatchException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.textract.model.AmazonTextractException.class));

    public static AmazonTextractClientBuilder builder() {
        return AmazonTextractClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Textract using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTextractClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Textract using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTextractClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("textract.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/textract/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/textract/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
     * Words and lines that are related to nearby lines and words. The related information is returned in two
     * <a>Block</a> objects each of type <code>KEY_VALUE_SET</code>: a KEY Block object and a VALUE Block object. For
     * example, <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva
     * Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE Block object contains information about a detected table. A CELL Block object
     * is returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Selectable elements such as checkboxes and radio buttons. A SELECTION_ELEMENT Block object contains information
     * about a selectable element.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE Block object contains one or more WORD Block objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can choose which type of analysis to perform by specifying the <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>BLOCK</code> objects.
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
     * @return Result of the AnalyzeDocument operation returned by the service.
     * @throws InvalidParameterException
     *         An input parameter violated a constraint. For example, in synchronous operations, an
     *         <code>InvalidParameterException</code> exception occurs when neither of the <code>S3Object</code> or
     *         <code>Bytes</code> values are supplied in the <code>Document</code> request parameter. Validate your
     *         parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Textract is unable to access the S3 object that's specified in the request.
     * @throws UnsupportedDocumentException
     *         The format of the input document isn't supported. Amazon Textract supports documents that are .png or
     *         .jpg format.
     * @throws DocumentTooLargeException
     *         The document can't be processed because it's too large. The maximum document size for synchronous
     *         operations 5 MB. The maximum document size for asynchronous operations is 500 MB for PDF format files.
     * @throws BadDocumentException
     *         Amazon Textract isn't able to read the document.
     * @throws AccessDeniedException
     *         You aren't authorized to perform the action.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Textract.
     * @throws InternalServerErrorException
     *         Amazon Textract experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Textract is temporarily unable to process the request. Try your call again.
     * @sample AmazonTextract.AnalyzeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AnalyzeDocumentResult analyzeDocument(AnalyzeDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeAnalyzeDocument(request);
    }

    @SdkInternalApi
    final AnalyzeDocumentResult executeAnalyzeDocument(AnalyzeDocumentRequest analyzeDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(analyzeDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AnalyzeDocumentRequest> request = null;
        Response<AnalyzeDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AnalyzeDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(analyzeDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Textract");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AnalyzeDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AnalyzeDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AnalyzeDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of
     * text. The input document must be an image in JPG or PNG format. <code>DetectDocumentText</code> returns the
     * detected text in an array of <a>Block</a> objects.
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
     * @return Result of the DetectDocumentText operation returned by the service.
     * @throws InvalidParameterException
     *         An input parameter violated a constraint. For example, in synchronous operations, an
     *         <code>InvalidParameterException</code> exception occurs when neither of the <code>S3Object</code> or
     *         <code>Bytes</code> values are supplied in the <code>Document</code> request parameter. Validate your
     *         parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Textract is unable to access the S3 object that's specified in the request.
     * @throws UnsupportedDocumentException
     *         The format of the input document isn't supported. Amazon Textract supports documents that are .png or
     *         .jpg format.
     * @throws DocumentTooLargeException
     *         The document can't be processed because it's too large. The maximum document size for synchronous
     *         operations 5 MB. The maximum document size for asynchronous operations is 500 MB for PDF format files.
     * @throws BadDocumentException
     *         Amazon Textract isn't able to read the document.
     * @throws AccessDeniedException
     *         You aren't authorized to perform the action.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Textract.
     * @throws InternalServerErrorException
     *         Amazon Textract experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Textract is temporarily unable to process the request. Try your call again.
     * @sample AmazonTextract.DetectDocumentText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/DetectDocumentText" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetectDocumentTextResult detectDocumentText(DetectDocumentTextRequest request) {
        request = beforeClientExecution(request);
        return executeDetectDocumentText(request);
    }

    @SdkInternalApi
    final DetectDocumentTextResult executeDetectDocumentText(DetectDocumentTextRequest detectDocumentTextRequest) {

        ExecutionContext executionContext = createExecutionContext(detectDocumentTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectDocumentTextRequest> request = null;
        Response<DetectDocumentTextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectDocumentTextRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectDocumentTextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Textract");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectDocumentText");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectDocumentTextResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectDocumentTextResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * Words and lines that are related to nearby lines and words. The related information is returned in two
     * <a>Block</a> objects each of type <code>KEY_VALUE_SET</code>: a KEY Block object and a VALUE Block object. For
     * example, <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva
     * Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE Block object contains information about a detected table. A CELL Block object
     * is returned for each cell in a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Selectable elements such as checkboxes and radio buttons. A SELECTION_ELEMENT Block object contains information
     * about a selectable element.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE Block object contains one or more WORD Block objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value
     * that's returned from the previous call to <code>GetDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html">Document Text Analysis</a>.
     * </p>
     * 
     * @param getDocumentAnalysisRequest
     * @return Result of the GetDocumentAnalysis operation returned by the service.
     * @throws InvalidParameterException
     *         An input parameter violated a constraint. For example, in synchronous operations, an
     *         <code>InvalidParameterException</code> exception occurs when neither of the <code>S3Object</code> or
     *         <code>Bytes</code> values are supplied in the <code>Document</code> request parameter. Validate your
     *         parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You aren't authorized to perform the action.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Textract.
     * @throws InvalidJobIdException
     *         An invalid job identifier was passed to <a>GetDocumentAnalysis</a> or to <a>GetDocumentAnalysis</a>.
     * @throws InternalServerErrorException
     *         Amazon Textract experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Textract is temporarily unable to process the request. Try your call again.
     * @sample AmazonTextract.GetDocumentAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDocumentAnalysisResult getDocumentAnalysis(GetDocumentAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentAnalysis(request);
    }

    @SdkInternalApi
    final GetDocumentAnalysisResult executeGetDocumentAnalysis(GetDocumentAnalysisRequest getDocumentAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentAnalysisRequest> request = null;
        Response<GetDocumentAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDocumentAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Textract");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDocumentAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the GetDocumentTextDetection operation returned by the service.
     * @throws InvalidParameterException
     *         An input parameter violated a constraint. For example, in synchronous operations, an
     *         <code>InvalidParameterException</code> exception occurs when neither of the <code>S3Object</code> or
     *         <code>Bytes</code> values are supplied in the <code>Document</code> request parameter. Validate your
     *         parameter before calling the API operation again.
     * @throws AccessDeniedException
     *         You aren't authorized to perform the action.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Textract.
     * @throws InvalidJobIdException
     *         An invalid job identifier was passed to <a>GetDocumentAnalysis</a> or to <a>GetDocumentAnalysis</a>.
     * @throws InternalServerErrorException
     *         Amazon Textract experienced a service issue. Try your call again.
     * @throws ThrottlingException
     *         Amazon Textract is temporarily unable to process the request. Try your call again.
     * @sample AmazonTextract.GetDocumentTextDetection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetDocumentTextDetection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDocumentTextDetectionResult getDocumentTextDetection(GetDocumentTextDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocumentTextDetection(request);
    }

    @SdkInternalApi
    final GetDocumentTextDetectionResult executeGetDocumentTextDetection(GetDocumentTextDetectionRequest getDocumentTextDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentTextDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentTextDetectionRequest> request = null;
        Response<GetDocumentTextDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentTextDetectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDocumentTextDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Textract");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocumentTextDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentTextDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDocumentTextDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts asynchronous analysis of an input document for relationships between detected items such as key and value
     * pairs, tables, and selection elements.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> can analyze text in documents that are in JPG, PNG, and PDF format. The
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
     * @return Result of the StartDocumentAnalysis operation returned by the service.
     * @throws InvalidParameterException
     *         An input parameter violated a constraint. For example, in synchronous operations, an
     *         <code>InvalidParameterException</code> exception occurs when neither of the <code>S3Object</code> or
     *         <code>Bytes</code> values are supplied in the <code>Document</code> request parameter. Validate your
     *         parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Textract is unable to access the S3 object that's specified in the request.
     * @throws UnsupportedDocumentException
     *         The format of the input document isn't supported. Amazon Textract supports documents that are .png or
     *         .jpg format.
     * @throws DocumentTooLargeException
     *         The document can't be processed because it's too large. The maximum document size for synchronous
     *         operations 5 MB. The maximum document size for asynchronous operations is 500 MB for PDF format files.
     * @throws BadDocumentException
     *         Amazon Textract isn't able to read the document.
     * @throws AccessDeniedException
     *         You aren't authorized to perform the action.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Textract.
     * @throws InternalServerErrorException
     *         Amazon Textract experienced a service issue. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws ThrottlingException
     *         Amazon Textract is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         An Amazon Textract service limit was exceeded. For example, if you start too many asynchronous jobs
     *         concurrently, calls to start operations (<code>StartDocumentTextDetection</code>, for example) raise a
     *         LimitExceededException exception (HTTP status code: 400) until the number of concurrently running jobs is
     *         below the Amazon Textract service limit.
     * @sample AmazonTextract.StartDocumentAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartDocumentAnalysisResult startDocumentAnalysis(StartDocumentAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeStartDocumentAnalysis(request);
    }

    @SdkInternalApi
    final StartDocumentAnalysisResult executeStartDocumentAnalysis(StartDocumentAnalysisRequest startDocumentAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(startDocumentAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDocumentAnalysisRequest> request = null;
        Response<StartDocumentAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDocumentAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDocumentAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Textract");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDocumentAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDocumentAnalysisResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartDocumentAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the asynchronous detection of text in a document. Amazon Textract can detect lines of text and the words
     * that make up a line of text.
     * </p>
     * <p>
     * <code>StartDocumentTextDetection</code> can analyze text in documents that are in JPG, PNG, and PDF format. The
     * documents are stored in an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name and file name
     * of the document.
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
     * @return Result of the StartDocumentTextDetection operation returned by the service.
     * @throws InvalidParameterException
     *         An input parameter violated a constraint. For example, in synchronous operations, an
     *         <code>InvalidParameterException</code> exception occurs when neither of the <code>S3Object</code> or
     *         <code>Bytes</code> values are supplied in the <code>Document</code> request parameter. Validate your
     *         parameter before calling the API operation again.
     * @throws InvalidS3ObjectException
     *         Amazon Textract is unable to access the S3 object that's specified in the request.
     * @throws UnsupportedDocumentException
     *         The format of the input document isn't supported. Amazon Textract supports documents that are .png or
     *         .jpg format.
     * @throws DocumentTooLargeException
     *         The document can't be processed because it's too large. The maximum document size for synchronous
     *         operations 5 MB. The maximum document size for asynchronous operations is 500 MB for PDF format files.
     * @throws BadDocumentException
     *         Amazon Textract isn't able to read the document.
     * @throws AccessDeniedException
     *         You aren't authorized to perform the action.
     * @throws ProvisionedThroughputExceededException
     *         The number of requests exceeded your throughput limit. If you want to increase this limit, contact Amazon
     *         Textract.
     * @throws InternalServerErrorException
     *         Amazon Textract experienced a service issue. Try your call again.
     * @throws IdempotentParameterMismatchException
     *         A <code>ClientRequestToken</code> input parameter was reused with an operation, but at least one of the
     *         other input parameters is different from the previous call to the operation.
     * @throws ThrottlingException
     *         Amazon Textract is temporarily unable to process the request. Try your call again.
     * @throws LimitExceededException
     *         An Amazon Textract service limit was exceeded. For example, if you start too many asynchronous jobs
     *         concurrently, calls to start operations (<code>StartDocumentTextDetection</code>, for example) raise a
     *         LimitExceededException exception (HTTP status code: 400) until the number of concurrently running jobs is
     *         below the Amazon Textract service limit.
     * @sample AmazonTextract.StartDocumentTextDetection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentTextDetection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDocumentTextDetectionResult startDocumentTextDetection(StartDocumentTextDetectionRequest request) {
        request = beforeClientExecution(request);
        return executeStartDocumentTextDetection(request);
    }

    @SdkInternalApi
    final StartDocumentTextDetectionResult executeStartDocumentTextDetection(StartDocumentTextDetectionRequest startDocumentTextDetectionRequest) {

        ExecutionContext executionContext = createExecutionContext(startDocumentTextDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDocumentTextDetectionRequest> request = null;
        Response<StartDocumentTextDetectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDocumentTextDetectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startDocumentTextDetectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Textract");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDocumentTextDetection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDocumentTextDetectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDocumentTextDetectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
