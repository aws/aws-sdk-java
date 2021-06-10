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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sagemakerfeaturestoreruntime.model.*;

/**
 * Interface for accessing Amazon SageMaker Feature Store Runtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakerfeaturestoreruntime.AbstractAmazonSageMakerFeatureStoreRuntime} instead.
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
public interface AmazonSageMakerFeatureStoreRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "featurestore-runtime.sagemaker";

    /**
     * <p>
     * Retrieves a batch of <code>Records</code> from a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param batchGetRecordRequest
     * @return Result of the BatchGetRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.BatchGetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetRecordResult batchGetRecord(BatchGetRecordRequest batchGetRecordRequest);

    /**
     * <p>
     * Deletes a <code>Record</code> from a <code>FeatureGroup</code>. A new record will show up in the
     * <code>OfflineStore</code> when the <code>DeleteRecord</code> API is called. This record will have a value of
     * <code>True</code> in the <code>is_deleted</code> column.
     * </p>
     * 
     * @param deleteRecordRequest
     * @return Result of the DeleteRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.DeleteRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/DeleteRecord"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRecordResult deleteRecord(DeleteRecordRequest deleteRecordRequest);

    /**
     * <p>
     * Use for <code>OnlineStore</code> serving from a <code>FeatureStore</code>. Only the latest records stored in the
     * <code>OnlineStore</code> can be retrieved. If no Record with <code>RecordIdentifierValue</code> is found, then an
     * empty result is returned.
     * </p>
     * 
     * @param getRecordRequest
     * @return Result of the GetRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws ResourceNotFoundException
     *         A resource that is required to perform an action was not found.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.GetRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/GetRecord"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecordResult getRecord(GetRecordRequest getRecordRequest);

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
     * @return Result of the PutRecord operation returned by the service.
     * @throws ValidationErrorException
     *         There was an error validating your request.
     * @throws InternalFailureException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws AccessForbiddenException
     *         You do not have permission to perform an action.
     * @sample AmazonSageMakerFeatureStoreRuntime.PutRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/PutRecord"
     *      target="_top">AWS API Documentation</a>
     */
    PutRecordResult putRecord(PutRecordRequest putRecordRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
