/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Deletes a <code>Record</code> from a <code>FeatureGroup</code> in the <code>OnlineStore</code>. Feature Store
     * supports both <code>SoftDelete</code> and <code>HardDelete</code>. For <code>SoftDelete</code> (default), feature
     * columns are set to <code>null</code> and the record is no longer retrievable by <code>GetRecord</code> or
     * <code>BatchGetRecord</code>. For <code>HardDelete</code>, the complete <code>Record</code> is removed from the
     * <code>OnlineStore</code>. In both cases, Feature Store appends the deleted record marker to the
     * <code>OfflineStore</code>. The deleted record marker is a record with the same <code>RecordIdentifer</code> as
     * the original, but with <code>is_deleted</code> value set to <code>True</code>, <code>EventTime</code> set to the
     * delete input <code>EventTime</code>, and other feature values set to <code>null</code>.
     * </p>
     * <p>
     * Note that the <code>EventTime</code> specified in <code>DeleteRecord</code> should be set later than the
     * <code>EventTime</code> of the existing record in the <code>OnlineStore</code> for that
     * <code>RecordIdentifer</code>. If it is not, the deletion does not occur:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SoftDelete</code>, the existing (not deleted) record remains in the <code>OnlineStore</code>, though
     * the delete record marker is still written to the <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HardDelete</code> returns <code>EventTime</code>: <code>400 ValidationException</code> to indicate that the
     * delete operation failed. No delete record marker is written to the <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a record is deleted from the <code>OnlineStore</code>, the deleted record marker is appended to the
     * <code>OfflineStore</code>. If you have the Iceberg table format enabled for your <code>OfflineStore</code>, you
     * can remove all history of a record from the <code>OfflineStore</code> using Amazon Athena or Apache Spark. For
     * information on how to hard delete a record from the <code>OfflineStore</code> with the Iceberg table format
     * enabled, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/feature-store-delete-records-offline-store.html#feature-store-delete-records-offline-store"
     * >Delete records from the offline store</a>.
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
     * Deletes a <code>Record</code> from a <code>FeatureGroup</code> in the <code>OnlineStore</code>. Feature Store
     * supports both <code>SoftDelete</code> and <code>HardDelete</code>. For <code>SoftDelete</code> (default), feature
     * columns are set to <code>null</code> and the record is no longer retrievable by <code>GetRecord</code> or
     * <code>BatchGetRecord</code>. For <code>HardDelete</code>, the complete <code>Record</code> is removed from the
     * <code>OnlineStore</code>. In both cases, Feature Store appends the deleted record marker to the
     * <code>OfflineStore</code>. The deleted record marker is a record with the same <code>RecordIdentifer</code> as
     * the original, but with <code>is_deleted</code> value set to <code>True</code>, <code>EventTime</code> set to the
     * delete input <code>EventTime</code>, and other feature values set to <code>null</code>.
     * </p>
     * <p>
     * Note that the <code>EventTime</code> specified in <code>DeleteRecord</code> should be set later than the
     * <code>EventTime</code> of the existing record in the <code>OnlineStore</code> for that
     * <code>RecordIdentifer</code>. If it is not, the deletion does not occur:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SoftDelete</code>, the existing (not deleted) record remains in the <code>OnlineStore</code>, though
     * the delete record marker is still written to the <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HardDelete</code> returns <code>EventTime</code>: <code>400 ValidationException</code> to indicate that the
     * delete operation failed. No delete record marker is written to the <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a record is deleted from the <code>OnlineStore</code>, the deleted record marker is appended to the
     * <code>OfflineStore</code>. If you have the Iceberg table format enabled for your <code>OfflineStore</code>, you
     * can remove all history of a record from the <code>OfflineStore</code> using Amazon Athena or Apache Spark. For
     * information on how to hard delete a record from the <code>OfflineStore</code> with the Iceberg table format
     * enabled, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/feature-store-delete-records-offline-store.html#feature-store-delete-records-offline-store"
     * >Delete records from the offline store</a>.
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
     * The <code>PutRecord</code> API is used to ingest a list of <code>Records</code> into your feature group.
     * </p>
     * <p>
     * If a new record’s <code>EventTime</code> is greater, the new record is written to both the
     * <code>OnlineStore</code> and <code>OfflineStore</code>. Otherwise, the record is a historic record and it is
     * written only to the <code>OfflineStore</code>.
     * </p>
     * <p>
     * You can specify the ingestion to be applied to the <code>OnlineStore</code>, <code>OfflineStore</code>, or both
     * by using the <code>TargetStores</code> request parameter.
     * </p>
     * <p>
     * You can set the ingested record to expire at a given time to live (TTL) duration after the record’s event time,
     * <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>, by specifying the
     * <code>TtlDuration</code> parameter. A record level <code>TtlDuration</code> is set when specifying the
     * <code>TtlDuration</code> parameter using the <code>PutRecord</code> API call. If the input
     * <code>TtlDuration</code> is <code>null</code> or unspecified, <code>TtlDuration</code> is set to the default
     * feature group level <code>TtlDuration</code>. A record level <code>TtlDuration</code> supersedes the group level
     * <code>TtlDuration</code>.
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
     * The <code>PutRecord</code> API is used to ingest a list of <code>Records</code> into your feature group.
     * </p>
     * <p>
     * If a new record’s <code>EventTime</code> is greater, the new record is written to both the
     * <code>OnlineStore</code> and <code>OfflineStore</code>. Otherwise, the record is a historic record and it is
     * written only to the <code>OfflineStore</code>.
     * </p>
     * <p>
     * You can specify the ingestion to be applied to the <code>OnlineStore</code>, <code>OfflineStore</code>, or both
     * by using the <code>TargetStores</code> request parameter.
     * </p>
     * <p>
     * You can set the ingested record to expire at a given time to live (TTL) duration after the record’s event time,
     * <code>ExpiresAt</code> = <code>EventTime</code> + <code>TtlDuration</code>, by specifying the
     * <code>TtlDuration</code> parameter. A record level <code>TtlDuration</code> is set when specifying the
     * <code>TtlDuration</code> parameter using the <code>PutRecord</code> API call. If the input
     * <code>TtlDuration</code> is <code>null</code> or unspecified, <code>TtlDuration</code> is set to the default
     * feature group level <code>TtlDuration</code>. A record level <code>TtlDuration</code> supersedes the group level
     * <code>TtlDuration</code>.
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
