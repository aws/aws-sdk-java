/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;

/**
 * Interface for accessing Amazon Fraud Detector asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.frauddetector.AbstractAmazonFraudDetectorAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the Amazon Fraud Detector API Reference. This guide is for developers who need detailed information about
 * Amazon Fraud Detector API actions, data types, and errors. For more information about Amazon Fraud Detector features,
 * see the <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/">Amazon Fraud Detector User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonFraudDetectorAsync extends AmazonFraudDetector {

    /**
     * <p>
     * Creates a batch of variables.
     * </p>
     * 
     * @param batchCreateVariableRequest
     * @return A Java Future containing the result of the BatchCreateVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsync.BatchCreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchCreateVariable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateVariableResult> batchCreateVariableAsync(BatchCreateVariableRequest batchCreateVariableRequest);

    /**
     * <p>
     * Creates a batch of variables.
     * </p>
     * 
     * @param batchCreateVariableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.BatchCreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchCreateVariable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateVariableResult> batchCreateVariableAsync(BatchCreateVariableRequest batchCreateVariableRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateVariableRequest, BatchCreateVariableResult> asyncHandler);

    /**
     * <p>
     * Gets a batch of variables.
     * </p>
     * 
     * @param batchGetVariableRequest
     * @return A Java Future containing the result of the BatchGetVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsync.BatchGetVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchGetVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetVariableResult> batchGetVariableAsync(BatchGetVariableRequest batchGetVariableRequest);

    /**
     * <p>
     * Gets a batch of variables.
     * </p>
     * 
     * @param batchGetVariableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.BatchGetVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchGetVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetVariableResult> batchGetVariableAsync(BatchGetVariableRequest batchGetVariableRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetVariableRequest, BatchGetVariableResult> asyncHandler);

    /**
     * <p>
     * Creates a detector version. The detector version starts in a <code>DRAFT</code> status.
     * </p>
     * 
     * @param createDetectorVersionRequest
     * @return A Java Future containing the result of the CreateDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.CreateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorVersionResult> createDetectorVersionAsync(CreateDetectorVersionRequest createDetectorVersionRequest);

    /**
     * <p>
     * Creates a detector version. The detector version starts in a <code>DRAFT</code> status.
     * </p>
     * 
     * @param createDetectorVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.CreateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorVersionResult> createDetectorVersionAsync(CreateDetectorVersionRequest createDetectorVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDetectorVersionRequest, CreateDetectorVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a version of the model using the specified model type.
     * </p>
     * 
     * @param createModelVersionRequest
     * @return A Java Future containing the result of the CreateModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.CreateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelVersionResult> createModelVersionAsync(CreateModelVersionRequest createModelVersionRequest);

    /**
     * <p>
     * Creates a version of the model using the specified model type.
     * </p>
     * 
     * @param createModelVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.CreateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelVersionResult> createModelVersionAsync(CreateModelVersionRequest createModelVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelVersionRequest, CreateModelVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a rule for use with the specified detector.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonFraudDetectorAsync.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a rule for use with the specified detector.
     * </p>
     * 
     * @param createRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a variable.
     * </p>
     * 
     * @param createVariableRequest
     * @return A Java Future containing the result of the CreateVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsync.CreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVariableResult> createVariableAsync(CreateVariableRequest createVariableRequest);

    /**
     * <p>
     * Creates a variable.
     * </p>
     * 
     * @param createVariableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.CreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVariableResult> createVariableAsync(CreateVariableRequest createVariableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVariableRequest, CreateVariableResult> asyncHandler);

    /**
     * <p>
     * Deletes the detector version.
     * </p>
     * 
     * @param deleteDetectorVersionRequest
     * @return A Java Future containing the result of the DeleteDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorVersionResult> deleteDetectorVersionAsync(DeleteDetectorVersionRequest deleteDetectorVersionRequest);

    /**
     * <p>
     * Deletes the detector version.
     * </p>
     * 
     * @param deleteDetectorVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorVersionResult> deleteDetectorVersionAsync(DeleteDetectorVersionRequest deleteDetectorVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorVersionRequest, DeleteDetectorVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * 
     * @param deleteEventRequest
     * @return A Java Future containing the result of the DeleteEvent operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEvent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventResult> deleteEventAsync(DeleteEventRequest deleteEventRequest);

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * 
     * @param deleteEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEvent operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEvent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventResult> deleteEventAsync(DeleteEventRequest deleteEventRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventRequest, DeleteEventResult> asyncHandler);

    /**
     * <p>
     * Gets all versions for a specified detector.
     * </p>
     * 
     * @param describeDetectorRequest
     * @return A Java Future containing the result of the DescribeDetector operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeDetector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest describeDetectorRequest);

    /**
     * <p>
     * Gets all versions for a specified detector.
     * </p>
     * 
     * @param describeDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDetector operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeDetector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest describeDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDetectorRequest, DescribeDetectorResult> asyncHandler);

    /**
     * <p>
     * Gets all of the model versions for the specified model type or for the specified model type and model ID. You can
     * also get details for a single, specified model version.
     * </p>
     * 
     * @param describeModelVersionsRequest
     * @return A Java Future containing the result of the DescribeModelVersions operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DescribeModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelVersionsResult> describeModelVersionsAsync(DescribeModelVersionsRequest describeModelVersionsRequest);

    /**
     * <p>
     * Gets all of the model versions for the specified model type or for the specified model type and model ID. You can
     * also get details for a single, specified model version.
     * </p>
     * 
     * @param describeModelVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModelVersions operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DescribeModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelVersionsResult> describeModelVersionsAsync(DescribeModelVersionsRequest describeModelVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelVersionsRequest, DescribeModelVersionsResult> asyncHandler);

    /**
     * <p>
     * Gets a particular detector version.
     * </p>
     * 
     * @param getDetectorVersionRequest
     * @return A Java Future containing the result of the GetDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorVersionResult> getDetectorVersionAsync(GetDetectorVersionRequest getDetectorVersionRequest);

    /**
     * <p>
     * Gets a particular detector version.
     * </p>
     * 
     * @param getDetectorVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorVersionResult> getDetectorVersionAsync(GetDetectorVersionRequest getDetectorVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDetectorVersionRequest, GetDetectorVersionResult> asyncHandler);

    /**
     * <p>
     * Gets all of detectors. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this actions
     * retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must be
     * between 5 and 10. To get the next page results, provide the pagination token from the
     * <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getDetectorsRequest
     * @return A Java Future containing the result of the GetDetectors operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorsResult> getDetectorsAsync(GetDetectorsRequest getDetectorsRequest);

    /**
     * <p>
     * Gets all of detectors. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this actions
     * retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must be
     * between 5 and 10. To get the next page results, provide the pagination token from the
     * <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getDetectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDetectors operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorsResult> getDetectorsAsync(GetDetectorsRequest getDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDetectorsRequest, GetDetectorsResult> asyncHandler);

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a
     * paginated API. If you provide a null <code>maxSizePerPage</code>, this actions retrieves a maximum of 10 records
     * per page. If you provide a <code>maxSizePerPage</code>, the value must be between 5 and 10. To get the next page
     * results, provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A
     * null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getExternalModelsRequest
     * @return A Java Future containing the result of the GetExternalModels operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetExternalModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetExternalModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExternalModelsResult> getExternalModelsAsync(GetExternalModelsRequest getExternalModelsRequest);

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a
     * paginated API. If you provide a null <code>maxSizePerPage</code>, this actions retrieves a maximum of 10 records
     * per page. If you provide a <code>maxSizePerPage</code>, the value must be between 5 and 10. To get the next page
     * results, provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A
     * null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getExternalModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExternalModels operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetExternalModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetExternalModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExternalModelsResult> getExternalModelsAsync(GetExternalModelsRequest getExternalModelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetExternalModelsRequest, GetExternalModelsResult> asyncHandler);

    /**
     * <p>
     * Gets a model version.
     * </p>
     * 
     * @param getModelVersionRequest
     * @return A Java Future containing the result of the GetModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModelVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetModelVersionResult> getModelVersionAsync(GetModelVersionRequest getModelVersionRequest);

    /**
     * <p>
     * Gets a model version.
     * </p>
     * 
     * @param getModelVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModelVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetModelVersionResult> getModelVersionAsync(GetModelVersionRequest getModelVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelVersionRequest, GetModelVersionResult> asyncHandler);

    /**
     * <p>
     * Gets all of the models for the AWS account, or the specified model type, or gets a single model for the specified
     * model type, model ID combination.
     * </p>
     * 
     * @param getModelsRequest
     * @return A Java Future containing the result of the GetModels operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Gets all of the models for the AWS account, or the specified model type, or gets a single model for the specified
     * model type, model ID combination.
     * </p>
     * 
     * @param getModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModels operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest getModelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler);

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this
     * actions retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must
     * be between 50 and 100. To get the next page results, provide the pagination token from the
     * <code>GetOutcomesResult</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getOutcomesRequest
     * @return A Java Future containing the result of the GetOutcomes operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetOutcomes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetOutcomes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOutcomesResult> getOutcomesAsync(GetOutcomesRequest getOutcomesRequest);

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this
     * actions retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must
     * be between 50 and 100. To get the next page results, provide the pagination token from the
     * <code>GetOutcomesResult</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getOutcomesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOutcomes operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetOutcomes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetOutcomes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOutcomesResult> getOutcomesAsync(GetOutcomesRequest getOutcomesRequest,
            com.amazonaws.handlers.AsyncHandler<GetOutcomesRequest, GetOutcomesResult> asyncHandler);

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getPredictionRequest
     * @return A Java Future containing the result of the GetPrediction operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetPrediction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPredictionResult> getPredictionAsync(GetPredictionRequest getPredictionRequest);

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getPredictionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPrediction operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetPrediction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPredictionResult> getPredictionAsync(GetPredictionRequest getPredictionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPredictionRequest, GetPredictionResult> asyncHandler);

    /**
     * <p>
     * Gets all rules available for the specified detector.
     * </p>
     * 
     * @param getRulesRequest
     * @return A Java Future containing the result of the GetRules operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRulesResult> getRulesAsync(GetRulesRequest getRulesRequest);

    /**
     * <p>
     * Gets all rules available for the specified detector.
     * </p>
     * 
     * @param getRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRules operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRulesResult> getRulesAsync(GetRulesRequest getRulesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRulesRequest, GetRulesResult> asyncHandler);

    /**
     * <p>
     * Gets all of the variables or the specific variable. This is a paginated API. Providing null
     * <code>maxSizePerPage</code> results in retrieving maximum of 100 records per page. If you provide
     * <code>maxSizePerPage</code> the value must be between 50 and 100. To get the next page result, a provide a
     * pagination token from <code>GetVariablesResult</code> as part of your request. Null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getVariablesRequest
     * @return A Java Future containing the result of the GetVariables operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetVariables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVariablesResult> getVariablesAsync(GetVariablesRequest getVariablesRequest);

    /**
     * <p>
     * Gets all of the variables or the specific variable. This is a paginated API. Providing null
     * <code>maxSizePerPage</code> results in retrieving maximum of 100 records per page. If you provide
     * <code>maxSizePerPage</code> the value must be between 50 and 100. To get the next page result, a provide a
     * pagination token from <code>GetVariablesResult</code> as part of your request. Null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getVariablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVariables operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetVariables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVariablesResult> getVariablesAsync(GetVariablesRequest getVariablesRequest,
            com.amazonaws.handlers.AsyncHandler<GetVariablesRequest, GetVariablesResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a detector.
     * </p>
     * 
     * @param putDetectorRequest
     * @return A Java Future containing the result of the PutDetector operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDetectorResult> putDetectorAsync(PutDetectorRequest putDetectorRequest);

    /**
     * <p>
     * Creates or updates a detector.
     * </p>
     * 
     * @param putDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDetector operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutDetectorResult> putDetectorAsync(PutDetectorRequest putDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<PutDetectorRequest, PutDetectorResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an Amazon SageMaker model endpoint. You can also use this action to update the configuration
     * of the model endpoint, including the IAM role and/or the mapped variables.
     * </p>
     * 
     * @param putExternalModelRequest
     * @return A Java Future containing the result of the PutExternalModel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutExternalModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutExternalModelResult> putExternalModelAsync(PutExternalModelRequest putExternalModelRequest);

    /**
     * <p>
     * Creates or updates an Amazon SageMaker model endpoint. You can also use this action to update the configuration
     * of the model endpoint, including the IAM role and/or the mapped variables.
     * </p>
     * 
     * @param putExternalModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutExternalModel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutExternalModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutExternalModelResult> putExternalModelAsync(PutExternalModelRequest putExternalModelRequest,
            com.amazonaws.handlers.AsyncHandler<PutExternalModelRequest, PutExternalModelResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a model.
     * </p>
     * 
     * @param putModelRequest
     * @return A Java Future containing the result of the PutModel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutModelResult> putModelAsync(PutModelRequest putModelRequest);

    /**
     * <p>
     * Creates or updates a model.
     * </p>
     * 
     * @param putModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutModel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutModelResult> putModelAsync(PutModelRequest putModelRequest,
            com.amazonaws.handlers.AsyncHandler<PutModelRequest, PutModelResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an outcome.
     * </p>
     * 
     * @param putOutcomeRequest
     * @return A Java Future containing the result of the PutOutcome operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutOutcome" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutOutcomeResult> putOutcomeAsync(PutOutcomeRequest putOutcomeRequest);

    /**
     * <p>
     * Creates or updates an outcome.
     * </p>
     * 
     * @param putOutcomeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutOutcome operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutOutcome" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutOutcomeResult> putOutcomeAsync(PutOutcomeRequest putOutcomeRequest,
            com.amazonaws.handlers.AsyncHandler<PutOutcomeRequest, PutOutcomeResult> asyncHandler);

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can update include models, external model
     * endpoints, rules, and description. You can only update a <code>DRAFT</code> detector version.
     * </p>
     * 
     * @param updateDetectorVersionRequest
     * @return A Java Future containing the result of the UpdateDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorVersionResult> updateDetectorVersionAsync(UpdateDetectorVersionRequest updateDetectorVersionRequest);

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can update include models, external model
     * endpoints, rules, and description. You can only update a <code>DRAFT</code> detector version.
     * </p>
     * 
     * @param updateDetectorVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDetectorVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorVersionResult> updateDetectorVersionAsync(UpdateDetectorVersionRequest updateDetectorVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionRequest, UpdateDetectorVersionResult> asyncHandler);

    /**
     * <p>
     * Updates the detector version's description. You can update the metadata for any detector version (
     * <code>DRAFT, ACTIVE,</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param updateDetectorVersionMetadataRequest
     * @return A Java Future containing the result of the UpdateDetectorVersionMetadata operation returned by the
     *         service.
     * @sample AmazonFraudDetectorAsync.UpdateDetectorVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorVersionMetadataResult> updateDetectorVersionMetadataAsync(
            UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest);

    /**
     * <p>
     * Updates the detector version's description. You can update the metadata for any detector version (
     * <code>DRAFT, ACTIVE,</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param updateDetectorVersionMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDetectorVersionMetadata operation returned by the
     *         service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateDetectorVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorVersionMetadataResult> updateDetectorVersionMetadataAsync(
            UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionMetadataRequest, UpdateDetectorVersionMetadataResult> asyncHandler);

    /**
     * <p>
     * Updates the detector version’s status. You can perform the following promotions or demotions using
     * <code>UpdateDetectorVersionStatus</code>: <code>DRAFT</code> to <code>ACTIVE</code>, <code>ACTIVE</code> to
     * <code>INACTIVE</code>, and <code>INACTIVE</code> to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateDetectorVersionStatusRequest
     * @return A Java Future containing the result of the UpdateDetectorVersionStatus operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateDetectorVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorVersionStatusResult> updateDetectorVersionStatusAsync(
            UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest);

    /**
     * <p>
     * Updates the detector version’s status. You can perform the following promotions or demotions using
     * <code>UpdateDetectorVersionStatus</code>: <code>DRAFT</code> to <code>ACTIVE</code>, <code>ACTIVE</code> to
     * <code>INACTIVE</code>, and <code>INACTIVE</code> to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateDetectorVersionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDetectorVersionStatus operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateDetectorVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorVersionStatusResult> updateDetectorVersionStatusAsync(
            UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorVersionStatusRequest, UpdateDetectorVersionStatusResult> asyncHandler);

    /**
     * <p>
     * Updates a model version. You can update the description and status attributes using this action. You can perform
     * the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code> back to <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionRequest
     * @return A Java Future containing the result of the UpdateModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelVersionResult> updateModelVersionAsync(UpdateModelVersionRequest updateModelVersionRequest);

    /**
     * <p>
     * Updates a model version. You can update the description and status attributes using this action. You can perform
     * the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code> back to <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelVersionResult> updateModelVersionAsync(UpdateModelVersionRequest updateModelVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelVersionRequest, UpdateModelVersionResult> asyncHandler);

    /**
     * <p>
     * Updates a rule's metadata.
     * </p>
     * 
     * @param updateRuleMetadataRequest
     * @return A Java Future containing the result of the UpdateRuleMetadata operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateRuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleMetadataResult> updateRuleMetadataAsync(UpdateRuleMetadataRequest updateRuleMetadataRequest);

    /**
     * <p>
     * Updates a rule's metadata.
     * </p>
     * 
     * @param updateRuleMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuleMetadata operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateRuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleMetadataResult> updateRuleMetadataAsync(UpdateRuleMetadataRequest updateRuleMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleMetadataRequest, UpdateRuleMetadataResult> asyncHandler);

    /**
     * <p>
     * Updates a rule version resulting in a new rule version.
     * </p>
     * 
     * @param updateRuleVersionRequest
     * @return A Java Future containing the result of the UpdateRuleVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateRuleVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleVersionResult> updateRuleVersionAsync(UpdateRuleVersionRequest updateRuleVersionRequest);

    /**
     * <p>
     * Updates a rule version resulting in a new rule version.
     * </p>
     * 
     * @param updateRuleVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuleVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateRuleVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleVersionResult> updateRuleVersionAsync(UpdateRuleVersionRequest updateRuleVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleVersionRequest, UpdateRuleVersionResult> asyncHandler);

    /**
     * <p>
     * Updates a variable.
     * </p>
     * 
     * @param updateVariableRequest
     * @return A Java Future containing the result of the UpdateVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVariableResult> updateVariableAsync(UpdateVariableRequest updateVariableRequest);

    /**
     * <p>
     * Updates a variable.
     * </p>
     * 
     * @param updateVariableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVariableResult> updateVariableAsync(UpdateVariableRequest updateVariableRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVariableRequest, UpdateVariableResult> asyncHandler);

}
