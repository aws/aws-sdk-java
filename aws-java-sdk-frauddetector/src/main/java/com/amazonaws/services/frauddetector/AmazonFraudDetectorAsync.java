/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Cancels the specified batch prediction job.
     * </p>
     * 
     * @param cancelBatchPredictionJobRequest
     * @return A Java Future containing the result of the CancelBatchPredictionJob operation returned by the service.
     * @sample AmazonFraudDetectorAsync.CancelBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CancelBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelBatchPredictionJobResult> cancelBatchPredictionJobAsync(CancelBatchPredictionJobRequest cancelBatchPredictionJobRequest);

    /**
     * <p>
     * Cancels the specified batch prediction job.
     * </p>
     * 
     * @param cancelBatchPredictionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelBatchPredictionJob operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.CancelBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CancelBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelBatchPredictionJobResult> cancelBatchPredictionJobAsync(CancelBatchPredictionJobRequest cancelBatchPredictionJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelBatchPredictionJobRequest, CancelBatchPredictionJobResult> asyncHandler);

    /**
     * <p>
     * Creates a batch prediction job.
     * </p>
     * 
     * @param createBatchPredictionJobRequest
     * @return A Java Future containing the result of the CreateBatchPredictionJob operation returned by the service.
     * @sample AmazonFraudDetectorAsync.CreateBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchPredictionJobResult> createBatchPredictionJobAsync(CreateBatchPredictionJobRequest createBatchPredictionJobRequest);

    /**
     * <p>
     * Creates a batch prediction job.
     * </p>
     * 
     * @param createBatchPredictionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBatchPredictionJob operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.CreateBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchPredictionJobResult> createBatchPredictionJobAsync(CreateBatchPredictionJobRequest createBatchPredictionJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBatchPredictionJobRequest, CreateBatchPredictionJobResult> asyncHandler);

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
     * Creates a model using the specified model type.
     * </p>
     * 
     * @param createModelRequest
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a model using the specified model type.
     * </p>
     * 
     * @param createModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

    /**
     * <p>
     * Creates a version of the model using the specified model type and model id.
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
     * Creates a version of the model using the specified model type and model id.
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
     * Deletes a batch prediction job.
     * </p>
     * 
     * @param deleteBatchPredictionJobRequest
     * @return A Java Future containing the result of the DeleteBatchPredictionJob operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBatchPredictionJobResult> deleteBatchPredictionJobAsync(DeleteBatchPredictionJobRequest deleteBatchPredictionJobRequest);

    /**
     * <p>
     * Deletes a batch prediction job.
     * </p>
     * 
     * @param deleteBatchPredictionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBatchPredictionJob operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteBatchPredictionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteBatchPredictionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBatchPredictionJobResult> deleteBatchPredictionJobAsync(DeleteBatchPredictionJobRequest deleteBatchPredictionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBatchPredictionJobRequest, DeleteBatchPredictionJobResult> asyncHandler);

    /**
     * <p>
     * Deletes the detector. Before deleting a detector, you must first delete all detector versions and rule versions
     * associated with the detector.
     * </p>
     * <p>
     * When you delete a detector, Amazon Fraud Detector permanently deletes the detector and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return A Java Future containing the result of the DeleteDetector operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * <p>
     * Deletes the detector. Before deleting a detector, you must first delete all detector versions and rule versions
     * associated with the detector.
     * </p>
     * <p>
     * When you delete a detector, Amazon Fraud Detector permanently deletes the detector and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDetector operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest deleteDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorRequest, DeleteDetectorResult> asyncHandler);

    /**
     * <p>
     * Deletes the detector version. You cannot delete detector versions that are in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * When you delete a detector version, Amazon Fraud Detector permanently deletes the detector and the data is no
     * longer stored in Amazon Fraud Detector.
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
     * Deletes the detector version. You cannot delete detector versions that are in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * When you delete a detector version, Amazon Fraud Detector permanently deletes the detector and the data is no
     * longer stored in Amazon Fraud Detector.
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
     * Deletes an entity type.
     * </p>
     * <p>
     * You cannot delete an entity type that is included in an event type.
     * </p>
     * <p>
     * When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteEntityTypeRequest
     * @return A Java Future containing the result of the DeleteEntityType operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteEntityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEntityType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEntityTypeResult> deleteEntityTypeAsync(DeleteEntityTypeRequest deleteEntityTypeRequest);

    /**
     * <p>
     * Deletes an entity type.
     * </p>
     * <p>
     * You cannot delete an entity type that is included in an event type.
     * </p>
     * <p>
     * When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteEntityTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEntityType operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteEntityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEntityType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEntityTypeResult> deleteEntityTypeAsync(DeleteEntityTypeRequest deleteEntityTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEntityTypeRequest, DeleteEntityTypeResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * <p>
     * When you delete an event, Amazon Fraud Detector permanently deletes that event and the event data is no longer
     * stored in Amazon Fraud Detector.
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
     * <p>
     * When you delete an event, Amazon Fraud Detector permanently deletes that event and the event data is no longer
     * stored in Amazon Fraud Detector.
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
     * Deletes an event type.
     * </p>
     * <p>
     * You cannot delete an event type that is used in a detector or a model.
     * </p>
     * <p>
     * When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteEventTypeRequest
     * @return A Java Future containing the result of the DeleteEventType operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteEventType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEventType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventTypeResult> deleteEventTypeAsync(DeleteEventTypeRequest deleteEventTypeRequest);

    /**
     * <p>
     * Deletes an event type.
     * </p>
     * <p>
     * You cannot delete an event type that is used in a detector or a model.
     * </p>
     * <p>
     * When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteEventTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventType operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteEventType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEventType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventTypeResult> deleteEventTypeAsync(DeleteEventTypeRequest deleteEventTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventTypeRequest, DeleteEventTypeResult> asyncHandler);

    /**
     * <p>
     * Removes a SageMaker model from Amazon Fraud Detector.
     * </p>
     * <p>
     * You can remove an Amazon SageMaker model if it is not associated with a detector version. Removing a SageMaker
     * model disconnects it from Amazon Fraud Detector, but the model remains available in SageMaker.
     * </p>
     * 
     * @param deleteExternalModelRequest
     * @return A Java Future containing the result of the DeleteExternalModel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteExternalModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExternalModelResult> deleteExternalModelAsync(DeleteExternalModelRequest deleteExternalModelRequest);

    /**
     * <p>
     * Removes a SageMaker model from Amazon Fraud Detector.
     * </p>
     * <p>
     * You can remove an Amazon SageMaker model if it is not associated with a detector version. Removing a SageMaker
     * model disconnects it from Amazon Fraud Detector, but the model remains available in SageMaker.
     * </p>
     * 
     * @param deleteExternalModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExternalModel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteExternalModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExternalModelResult> deleteExternalModelAsync(DeleteExternalModelRequest deleteExternalModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExternalModelRequest, DeleteExternalModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a label.
     * </p>
     * <p>
     * You cannot delete labels that are included in an event type in Amazon Fraud Detector.
     * </p>
     * <p>
     * You cannot delete a label assigned to an event ID. You must first delete the relevant event ID.
     * </p>
     * <p>
     * When you delete a label, Amazon Fraud Detector permanently deletes that label and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteLabelRequest
     * @return A Java Future containing the result of the DeleteLabel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteLabel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLabelResult> deleteLabelAsync(DeleteLabelRequest deleteLabelRequest);

    /**
     * <p>
     * Deletes a label.
     * </p>
     * <p>
     * You cannot delete labels that are included in an event type in Amazon Fraud Detector.
     * </p>
     * <p>
     * You cannot delete a label assigned to an event ID. You must first delete the relevant event ID.
     * </p>
     * <p>
     * When you delete a label, Amazon Fraud Detector permanently deletes that label and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteLabelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLabel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteLabel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLabelResult> deleteLabelAsync(DeleteLabelRequest deleteLabelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLabelRequest, DeleteLabelResult> asyncHandler);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * <p>
     * You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a
     * detector version.
     * </p>
     * <p>
     * When you delete a model, Amazon Fraud Detector permanently deletes that model and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteModelRequest
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * <p>
     * You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a
     * detector version.
     * </p>
     * <p>
     * When you delete a model, Amazon Fraud Detector permanently deletes that model and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a model version.
     * </p>
     * <p>
     * You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a
     * detector version.
     * </p>
     * <p>
     * When you delete a model version, Amazon Fraud Detector permanently deletes that model version and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteModelVersionRequest
     * @return A Java Future containing the result of the DeleteModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelVersionResult> deleteModelVersionAsync(DeleteModelVersionRequest deleteModelVersionRequest);

    /**
     * <p>
     * Deletes a model version.
     * </p>
     * <p>
     * You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a
     * detector version.
     * </p>
     * <p>
     * When you delete a model version, Amazon Fraud Detector permanently deletes that model version and the data is no
     * longer stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteModelVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelVersion operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelVersionResult> deleteModelVersionAsync(DeleteModelVersionRequest deleteModelVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelVersionRequest, DeleteModelVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes an outcome.
     * </p>
     * <p>
     * You cannot delete an outcome that is used in a rule version.
     * </p>
     * <p>
     * When you delete an outcome, Amazon Fraud Detector permanently deletes that outcome and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteOutcomeRequest
     * @return A Java Future containing the result of the DeleteOutcome operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteOutcome" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOutcomeResult> deleteOutcomeAsync(DeleteOutcomeRequest deleteOutcomeRequest);

    /**
     * <p>
     * Deletes an outcome.
     * </p>
     * <p>
     * You cannot delete an outcome that is used in a rule version.
     * </p>
     * <p>
     * When you delete an outcome, Amazon Fraud Detector permanently deletes that outcome and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteOutcomeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOutcome operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteOutcome" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOutcomeResult> deleteOutcomeAsync(DeleteOutcomeRequest deleteOutcomeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOutcomeRequest, DeleteOutcomeResult> asyncHandler);

    /**
     * <p>
     * Deletes the rule. You cannot delete a rule if it is used by an <code>ACTIVE</code> or <code>INACTIVE</code>
     * detector version.
     * </p>
     * <p>
     * When you delete a rule, Amazon Fraud Detector permanently deletes that rule and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes the rule. You cannot delete a rule if it is used by an <code>ACTIVE</code> or <code>INACTIVE</code>
     * detector version.
     * </p>
     * <p>
     * When you delete a rule, Amazon Fraud Detector permanently deletes that rule and the data is no longer stored in
     * Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a variable.
     * </p>
     * <p>
     * You can't delete variables that are included in an event type in Amazon Fraud Detector.
     * </p>
     * <p>
     * Amazon Fraud Detector automatically deletes model output variables and SageMaker model output variables when you
     * delete the model. You can't delete these variables manually.
     * </p>
     * <p>
     * When you delete a variable, Amazon Fraud Detector permanently deletes that variable and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteVariableRequest
     * @return A Java Future containing the result of the DeleteVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsync.DeleteVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVariableResult> deleteVariableAsync(DeleteVariableRequest deleteVariableRequest);

    /**
     * <p>
     * Deletes a variable.
     * </p>
     * <p>
     * You can't delete variables that are included in an event type in Amazon Fraud Detector.
     * </p>
     * <p>
     * Amazon Fraud Detector automatically deletes model output variables and SageMaker model output variables when you
     * delete the model. You can't delete these variables manually.
     * </p>
     * <p>
     * When you delete a variable, Amazon Fraud Detector permanently deletes that variable and the data is no longer
     * stored in Amazon Fraud Detector.
     * </p>
     * 
     * @param deleteVariableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVariable operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.DeleteVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteVariable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVariableResult> deleteVariableAsync(DeleteVariableRequest deleteVariableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVariableRequest, DeleteVariableResult> asyncHandler);

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
     * Gets all batch prediction jobs or a specific job if you specify a job ID. This is a paginated API. If you provide
     * a null maxResults, this action retrieves a maximum of 50 records per page. If you provide a maxResults, the value
     * must be between 1 and 50. To get the next page results, provide the pagination token from the
     * GetBatchPredictionJobsResponse as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getBatchPredictionJobsRequest
     * @return A Java Future containing the result of the GetBatchPredictionJobs operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetBatchPredictionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetBatchPredictionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBatchPredictionJobsResult> getBatchPredictionJobsAsync(GetBatchPredictionJobsRequest getBatchPredictionJobsRequest);

    /**
     * <p>
     * Gets all batch prediction jobs or a specific job if you specify a job ID. This is a paginated API. If you provide
     * a null maxResults, this action retrieves a maximum of 50 records per page. If you provide a maxResults, the value
     * must be between 1 and 50. To get the next page results, provide the pagination token from the
     * GetBatchPredictionJobsResponse as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getBatchPredictionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBatchPredictionJobs operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetBatchPredictionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetBatchPredictionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBatchPredictionJobsResult> getBatchPredictionJobsAsync(GetBatchPredictionJobsRequest getBatchPredictionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBatchPredictionJobsRequest, GetBatchPredictionJobsResult> asyncHandler);

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
     * Gets all detectors or a single detector if a <code>detectorId</code> is specified. This is a paginated API. If
     * you provide a null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you
     * provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetDetectorsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
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
     * Gets all detectors or a single detector if a <code>detectorId</code> is specified. This is a paginated API. If
     * you provide a null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you
     * provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetDetectorsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
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
     * Gets all entity types or a specific entity type if a name is specified. This is a paginated API. If you provide a
     * null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEntityTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEntityTypesRequest
     * @return A Java Future containing the result of the GetEntityTypes operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetEntityTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEntityTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEntityTypesResult> getEntityTypesAsync(GetEntityTypesRequest getEntityTypesRequest);

    /**
     * <p>
     * Gets all entity types or a specific entity type if a name is specified. This is a paginated API. If you provide a
     * null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEntityTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEntityTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEntityTypes operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetEntityTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEntityTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEntityTypesResult> getEntityTypesAsync(GetEntityTypesRequest getEntityTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetEntityTypesRequest, GetEntityTypesResult> asyncHandler);

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getEventPredictionRequest
     * @return A Java Future containing the result of the GetEventPrediction operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetEventPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPrediction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEventPredictionResult> getEventPredictionAsync(GetEventPredictionRequest getEventPredictionRequest);

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getEventPredictionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventPrediction operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetEventPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPrediction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEventPredictionResult> getEventPredictionAsync(GetEventPredictionRequest getEventPredictionRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventPredictionRequest, GetEventPredictionResult> asyncHandler);

    /**
     * <p>
     * Gets all event types or a specific event type if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEventTypesRequest
     * @return A Java Future containing the result of the GetEventTypes operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventTypesResult> getEventTypesAsync(GetEventTypesRequest getEventTypesRequest);

    /**
     * <p>
     * Gets all event types or a specific event type if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEventTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventTypes operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventTypesResult> getEventTypesAsync(GetEventTypesRequest getEventTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventTypesRequest, GetEventTypesResult> asyncHandler);

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a
     * paginated API. If you provide a null <code>maxResults</code>, this actions retrieves a maximum of 10 records per
     * page. If you provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results,
     * provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A null
     * pagination token fetches the records from the beginning.
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
     * paginated API. If you provide a null <code>maxResults</code>, this actions retrieves a maximum of 10 records per
     * page. If you provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results,
     * provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A null
     * pagination token fetches the records from the beginning.
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
     * Gets the encryption key if a Key Management Service (KMS) customer master key (CMK) has been specified to be used
     * to encrypt content in Amazon Fraud Detector.
     * </p>
     * 
     * @param getKMSEncryptionKeyRequest
     * @return A Java Future containing the result of the GetKMSEncryptionKey operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetKMSEncryptionKeyResult> getKMSEncryptionKeyAsync(GetKMSEncryptionKeyRequest getKMSEncryptionKeyRequest);

    /**
     * <p>
     * Gets the encryption key if a Key Management Service (KMS) customer master key (CMK) has been specified to be used
     * to encrypt content in Amazon Fraud Detector.
     * </p>
     * 
     * @param getKMSEncryptionKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKMSEncryptionKey operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetKMSEncryptionKeyResult> getKMSEncryptionKeyAsync(GetKMSEncryptionKeyRequest getKMSEncryptionKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetKMSEncryptionKeyRequest, GetKMSEncryptionKeyResult> asyncHandler);

    /**
     * <p>
     * Gets all labels or a specific label if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 50 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 10 and 50. To get the next page results, provide the
     * pagination token from the <code>GetGetLabelsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getLabelsRequest
     * @return A Java Future containing the result of the GetLabels operation returned by the service.
     * @sample AmazonFraudDetectorAsync.GetLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetLabels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLabelsResult> getLabelsAsync(GetLabelsRequest getLabelsRequest);

    /**
     * <p>
     * Gets all labels or a specific label if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 50 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 10 and 50. To get the next page results, provide the
     * pagination token from the <code>GetGetLabelsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLabels operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.GetLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetLabels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLabelsResult> getLabelsAsync(GetLabelsRequest getLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLabelsRequest, GetLabelsResult> asyncHandler);

    /**
     * <p>
     * Gets the details of the specified model version.
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
     * Gets the details of the specified model version.
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
     * Gets one or more models. Gets all models for the AWS account if no model type and no model id provided. Gets all
     * models for the AWS account and model type, if the model type is specified but model id is not provided. Gets a
     * specific model if (model type, model id) tuple is specified.
     * </p>
     * <p>
     * This is a paginated API. If you provide a null <code>maxResults</code>, this action retrieves a maximum of 10
     * records per page. If you provide a <code>maxResults</code>, the value must be between 1 and 10. To get the next
     * page results, provide the pagination token from the response as part of your request. A null pagination token
     * fetches the records from the beginning.
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
     * Gets one or more models. Gets all models for the AWS account if no model type and no model id provided. Gets all
     * models for the AWS account and model type, if the model type is specified but model id is not provided. Gets a
     * specific model if (model type, model id) tuple is specified.
     * </p>
     * <p>
     * This is a paginated API. If you provide a null <code>maxResults</code>, this action retrieves a maximum of 10
     * records per page. If you provide a <code>maxResults</code>, the value must be between 1 and 10. To get the next
     * page results, provide the pagination token from the response as part of your request. A null pagination token
     * fetches the records from the beginning.
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
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxResults</code>, this actions
     * retrieves a maximum of 100 records per page. If you provide a <code>maxResults</code>, the value must be between
     * 50 and 100. To get the next page results, provide the pagination token from the <code>GetOutcomesResult</code> as
     * part of your request. A null pagination token fetches the records from the beginning.
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
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxResults</code>, this actions
     * retrieves a maximum of 100 records per page. If you provide a <code>maxResults</code>, the value must be between
     * 50 and 100. To get the next page results, provide the pagination token from the <code>GetOutcomesResult</code> as
     * part of your request. A null pagination token fetches the records from the beginning.
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
     * Get all rules for a detector (paginated) if <code>ruleId</code> and <code>ruleVersion</code> are not specified.
     * Gets all rules for the detector and the <code>ruleId</code> if present (paginated). Gets a specific rule if both
     * the <code>ruleId</code> and the <code>ruleVersion</code> are specified.
     * </p>
     * <p>
     * This is a paginated API. Providing null maxResults results in retrieving maximum of 100 records per page. If you
     * provide maxResults the value must be between 50 and 100. To get the next page result, a provide a pagination
     * token from GetRulesResult as part of your request. Null pagination token fetches the records from the beginning.
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
     * Get all rules for a detector (paginated) if <code>ruleId</code> and <code>ruleVersion</code> are not specified.
     * Gets all rules for the detector and the <code>ruleId</code> if present (paginated). Gets a specific rule if both
     * the <code>ruleId</code> and the <code>ruleVersion</code> are specified.
     * </p>
     * <p>
     * This is a paginated API. Providing null maxResults results in retrieving maximum of 100 records per page. If you
     * provide maxResults the value must be between 50 and 100. To get the next page result, a provide a pagination
     * token from GetRulesResult as part of your request. Null pagination token fetches the records from the beginning.
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
     * Lists all tags associated with the resource. This is a paginated API. To get the next page results, provide the
     * pagination token from the response as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonFraudDetectorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags associated with the resource. This is a paginated API. To get the next page results, provide the
     * pagination token from the response as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * Creates or updates an entity type. An entity represents who is performing the event. As part of a fraud
     * prediction, you pass the entity ID to indicate the specific entity who performed the event. An entity type
     * classifies the entity. Example classifications include customer, merchant, or account.
     * </p>
     * 
     * @param putEntityTypeRequest
     * @return A Java Future containing the result of the PutEntityType operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutEntityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEntityType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEntityTypeResult> putEntityTypeAsync(PutEntityTypeRequest putEntityTypeRequest);

    /**
     * <p>
     * Creates or updates an entity type. An entity represents who is performing the event. As part of a fraud
     * prediction, you pass the entity ID to indicate the specific entity who performed the event. An entity type
     * classifies the entity. Example classifications include customer, merchant, or account.
     * </p>
     * 
     * @param putEntityTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEntityType operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutEntityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEntityType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEntityTypeResult> putEntityTypeAsync(PutEntityTypeRequest putEntityTypeRequest,
            com.amazonaws.handlers.AsyncHandler<PutEntityTypeRequest, PutEntityTypeResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an event type. An event is a business activity that is evaluated for fraud risk. With Amazon
     * Fraud Detector, you generate fraud predictions for events. An event type defines the structure for an event sent
     * to Amazon Fraud Detector. This includes the variables sent as part of the event, the entity performing the event
     * (such as a customer), and the labels that classify the event. Example event types include online payment
     * transactions, account registrations, and authentications.
     * </p>
     * 
     * @param putEventTypeRequest
     * @return A Java Future containing the result of the PutEventType operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutEventType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEventType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventTypeResult> putEventTypeAsync(PutEventTypeRequest putEventTypeRequest);

    /**
     * <p>
     * Creates or updates an event type. An event is a business activity that is evaluated for fraud risk. With Amazon
     * Fraud Detector, you generate fraud predictions for events. An event type defines the structure for an event sent
     * to Amazon Fraud Detector. This includes the variables sent as part of the event, the entity performing the event
     * (such as a customer), and the labels that classify the event. Example event types include online payment
     * transactions, account registrations, and authentications.
     * </p>
     * 
     * @param putEventTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEventType operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutEventType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEventType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventTypeResult> putEventTypeAsync(PutEventTypeRequest putEventTypeRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventTypeRequest, PutEventTypeResult> asyncHandler);

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
     * Specifies the Key Management Service (KMS) customer master key (CMK) to be used to encrypt content in Amazon
     * Fraud Detector.
     * </p>
     * 
     * @param putKMSEncryptionKeyRequest
     * @return A Java Future containing the result of the PutKMSEncryptionKey operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutKMSEncryptionKeyResult> putKMSEncryptionKeyAsync(PutKMSEncryptionKeyRequest putKMSEncryptionKeyRequest);

    /**
     * <p>
     * Specifies the Key Management Service (KMS) customer master key (CMK) to be used to encrypt content in Amazon
     * Fraud Detector.
     * </p>
     * 
     * @param putKMSEncryptionKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutKMSEncryptionKey operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutKMSEncryptionKeyResult> putKMSEncryptionKeyAsync(PutKMSEncryptionKeyRequest putKMSEncryptionKeyRequest,
            com.amazonaws.handlers.AsyncHandler<PutKMSEncryptionKeyRequest, PutKMSEncryptionKeyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates label. A label classifies an event as fraudulent or legitimate. Labels are associated with
     * event types and used to train supervised machine learning models in Amazon Fraud Detector.
     * </p>
     * 
     * @param putLabelRequest
     * @return A Java Future containing the result of the PutLabel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.PutLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutLabel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutLabelResult> putLabelAsync(PutLabelRequest putLabelRequest);

    /**
     * <p>
     * Creates or updates label. A label classifies an event as fraudulent or legitimate. Labels are associated with
     * event types and used to train supervised machine learning models in Amazon Fraud Detector.
     * </p>
     * 
     * @param putLabelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLabel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.PutLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutLabel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutLabelResult> putLabelAsync(PutLabelRequest putLabelRequest,
            com.amazonaws.handlers.AsyncHandler<PutLabelRequest, PutLabelResult> asyncHandler);

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
     * Assigns tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonFraudDetectorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can update include models, external model
     * endpoints, rules, rule execution mode, and description. You can only update a <code>DRAFT</code> detector
     * version.
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
     * endpoints, rules, rule execution mode, and description. You can only update a <code>DRAFT</code> detector
     * version.
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
     * Updates a model. You can update the description attribute using this action.
     * </p>
     * 
     * @param updateModelRequest
     * @return A Java Future containing the result of the UpdateModel operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Updates a model. You can update the description attribute using this action.
     * </p>
     * 
     * @param updateModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModel operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest updateModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler);

    /**
     * <p>
     * Updates a model version. Updating a model version retrains an existing model version using updated training data
     * and produces a new minor version of the model. You can update the training data set location and data access role
     * attributes using this action. This action creates and trains a new minor version of the model, for example
     * version 1.01, 1.02, 1.03.
     * </p>
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
     * Updates a model version. Updating a model version retrains an existing model version using updated training data
     * and produces a new minor version of the model. You can update the training data set location and data access role
     * attributes using this action. This action creates and trains a new minor version of the model, for example
     * version 1.01, 1.02, 1.03.
     * </p>
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
     * Updates the status of a model version.
     * </p>
     * <p>
     * You can perform the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code>to <code>INACTIVE</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionStatusRequest
     * @return A Java Future containing the result of the UpdateModelVersionStatus operation returned by the service.
     * @sample AmazonFraudDetectorAsync.UpdateModelVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelVersionStatusResult> updateModelVersionStatusAsync(UpdateModelVersionStatusRequest updateModelVersionStatusRequest);

    /**
     * <p>
     * Updates the status of a model version.
     * </p>
     * <p>
     * You can perform the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code>to <code>INACTIVE</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModelVersionStatus operation returned by the service.
     * @sample AmazonFraudDetectorAsyncHandler.UpdateModelVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelVersionStatusResult> updateModelVersionStatusAsync(UpdateModelVersionStatusRequest updateModelVersionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelVersionStatusRequest, UpdateModelVersionStatusResult> asyncHandler);

    /**
     * <p>
     * Updates a rule's metadata. The description attribute can be updated.
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
     * Updates a rule's metadata. The description attribute can be updated.
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
     * Updates a rule version resulting in a new rule version. Updates a rule version resulting in a new rule version
     * (version 1, 2, 3 ...).
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
     * Updates a rule version resulting in a new rule version. Updates a rule version resulting in a new rule version
     * (version 1, 2, 3 ...).
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
