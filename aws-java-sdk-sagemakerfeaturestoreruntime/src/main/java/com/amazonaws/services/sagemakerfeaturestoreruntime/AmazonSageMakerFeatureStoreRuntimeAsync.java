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
package com.amazonaws.services.sagemakerfeaturestoreruntime;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakerfeaturestoreruntime.model.*;

/**
 * Interface for accessing Amazon SageMaker Feature Store Runtime asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakerfeaturestoreruntime.AbstractAmazonSageMakerFeatureStoreRuntimeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Contains all data plane API operations and data types for the Amazon SageMaker Feature Store. Use this API to put,
 * delete, and retrieve (get) features from a feature store.
 * </p>
 * <p>
 * Use the following operations to configure your <code>OnlineStore</code> and <code>OfflineStore</code> features, and
 * to create and manage feature groups:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateFeatureGroup.html">CreateFeatureGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_DeleteFeatureGroup.html">DeleteFeatureGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_DescribeFeatureGroup.html">DescribeFeatureGroup
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ListFeatureGroups.html">ListFeatureGroups</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerFeatureStoreRuntimeAsync extends AmazonSageMakerFeatureStoreRuntime {

    /**
     * <p>
     * Retrieves a batch of <code>Records</code> from a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param batchGetRecordRequest
     * @return A Java Future containing the result of the BatchGetRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsync.BatchGetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRecordResult> batchGetRecordAsync(BatchGetRecordRequest batchGetRecordRequest);

    /**
     * <p>
     * Retrieves a batch of <code>Records</code> from a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param batchGetRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsyncHandler.BatchGetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRecordResult> batchGetRecordAsync(BatchGetRecordRequest batchGetRecordRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetRecordRequest, BatchGetRecordResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>Record</code> from a <code>FeatureGroup</code>. A new record will show up in the
     * <code>OfflineStore</code> when the <code>DeleteRecord</code> API is called. This record will have a value of
     * <code>True</code> in the <code>is_deleted</code> column.
     * </p>
     * 
     * @param deleteRecordRequest
     * @return A Java Future containing the result of the DeleteRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsync.DeleteRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/DeleteRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecordResult> deleteRecordAsync(DeleteRecordRequest deleteRecordRequest);

    /**
     * <p>
     * Deletes a <code>Record</code> from a <code>FeatureGroup</code>. A new record will show up in the
     * <code>OfflineStore</code> when the <code>DeleteRecord</code> API is called. This record will have a value of
     * <code>True</code> in the <code>is_deleted</code> column.
     * </p>
     * 
     * @param deleteRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsyncHandler.DeleteRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/DeleteRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecordResult> deleteRecordAsync(DeleteRecordRequest deleteRecordRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecordRequest, DeleteRecordResult> asyncHandler);

    /**
     * <p>
     * Use for <code>OnlineStore</code> serving from a <code>FeatureStore</code>. Only the latest records stored in the
     * <code>OnlineStore</code> can be retrieved. If no Record with <code>RecordIdentifierValue</code> is found, then an
     * empty result is returned.
     * </p>
     * 
     * @param getRecordRequest
     * @return A Java Future containing the result of the GetRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsync.GetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/GetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecordResult> getRecordAsync(GetRecordRequest getRecordRequest);

    /**
     * <p>
     * Use for <code>OnlineStore</code> serving from a <code>FeatureStore</code>. Only the latest records stored in the
     * <code>OnlineStore</code> can be retrieved. If no Record with <code>RecordIdentifierValue</code> is found, then an
     * empty result is returned.
     * </p>
     * 
     * @param getRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsyncHandler.GetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/GetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecordResult> getRecordAsync(GetRecordRequest getRecordRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecordRequest, GetRecordResult> asyncHandler);

    /**
     * <p>
     * Used for data ingestion into the <code>FeatureStore</code>. The <code>PutRecord</code> API writes to both the
     * <code>OnlineStore</code> and <code>OfflineStore</code>. If the record is the latest record for the
     * <code>recordIdentifier</code>, the record is written to both the <code>OnlineStore</code> and
     * <code>OfflineStore</code>. If the record is a historic record, it is written only to the
     * <code>OfflineStore</code>.
     * </p>
     * 
     * @param putRecordRequest
     * @return A Java Future containing the result of the PutRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsync.PutRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/PutRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest putRecordRequest);

    /**
     * <p>
     * Used for data ingestion into the <code>FeatureStore</code>. The <code>PutRecord</code> API writes to both the
     * <code>OnlineStore</code> and <code>OfflineStore</code>. If the record is the latest record for the
     * <code>recordIdentifier</code>, the record is written to both the <code>OnlineStore</code> and
     * <code>OfflineStore</code>. If the record is a historic record, it is written only to the
     * <code>OfflineStore</code>.
     * </p>
     * 
     * @param putRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRecord operation returned by the service.
     * @sample AmazonSageMakerFeatureStoreRuntimeAsyncHandler.PutRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/PutRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest putRecordRequest,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler);

}
