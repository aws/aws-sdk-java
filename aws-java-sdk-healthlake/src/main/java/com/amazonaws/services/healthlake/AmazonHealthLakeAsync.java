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
package com.amazonaws.services.healthlake;

import javax.annotation.Generated;

import com.amazonaws.services.healthlake.model.*;

/**
 * Interface for accessing HealthLake asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.healthlake.AbstractAmazonHealthLakeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon HealthLake is a HIPAA eligibile service that allows customers to store, transform, query, and analyze their
 * FHIR-formatted data in a consistent fashion in the cloud.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonHealthLakeAsync extends AmazonHealthLake {

    /**
     * <p>
     * Creates a Data Store that can ingest and export FHIR formatted data.
     * </p>
     * 
     * @param createFHIRDatastoreRequest
     * @return A Java Future containing the result of the CreateFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsync.CreateFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(CreateFHIRDatastoreRequest createFHIRDatastoreRequest);

    /**
     * <p>
     * Creates a Data Store that can ingest and export FHIR formatted data.
     * </p>
     * 
     * @param createFHIRDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.CreateFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(CreateFHIRDatastoreRequest createFHIRDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFHIRDatastoreRequest, CreateFHIRDatastoreResult> asyncHandler);

    /**
     * <p>
     * Deletes a Data Store.
     * </p>
     * 
     * @param deleteFHIRDatastoreRequest
     * @return A Java Future containing the result of the DeleteFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsync.DeleteFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DeleteFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(DeleteFHIRDatastoreRequest deleteFHIRDatastoreRequest);

    /**
     * <p>
     * Deletes a Data Store.
     * </p>
     * 
     * @param deleteFHIRDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.DeleteFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DeleteFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(DeleteFHIRDatastoreRequest deleteFHIRDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFHIRDatastoreRequest, DeleteFHIRDatastoreResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with the FHIR Data Store, including the Data Store ID, Data Store ARN, Data Store
     * name, Data Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     * 
     * @param describeFHIRDatastoreRequest
     * @return A Java Future containing the result of the DescribeFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsync.DescribeFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(DescribeFHIRDatastoreRequest describeFHIRDatastoreRequest);

    /**
     * <p>
     * Gets the properties associated with the FHIR Data Store, including the Data Store ID, Data Store ARN, Data Store
     * name, Data Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     * 
     * @param describeFHIRDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.DescribeFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(DescribeFHIRDatastoreRequest describeFHIRDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRDatastoreRequest, DescribeFHIRDatastoreResult> asyncHandler);

    /**
     * <p>
     * Displays the properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRExportJobRequest
     * @return A Java Future containing the result of the DescribeFHIRExportJob operation returned by the service.
     * @sample AmazonHealthLakeAsync.DescribeFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRExportJobResult> describeFHIRExportJobAsync(DescribeFHIRExportJobRequest describeFHIRExportJobRequest);

    /**
     * <p>
     * Displays the properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFHIRExportJob operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.DescribeFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRExportJobResult> describeFHIRExportJobAsync(DescribeFHIRExportJobRequest describeFHIRExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRExportJobRequest, DescribeFHIRExportJobResult> asyncHandler);

    /**
     * <p>
     * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRImportJobRequest
     * @return A Java Future containing the result of the DescribeFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsync.DescribeFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(DescribeFHIRImportJobRequest describeFHIRImportJobRequest);

    /**
     * <p>
     * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.DescribeFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(DescribeFHIRImportJobRequest describeFHIRImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRImportJobRequest, DescribeFHIRImportJobResult> asyncHandler);

    /**
     * <p>
     * Lists all FHIR Data Stores that are in the user’s account, regardless of Data Store status.
     * </p>
     * 
     * @param listFHIRDatastoresRequest
     * @return A Java Future containing the result of the ListFHIRDatastores operation returned by the service.
     * @sample AmazonHealthLakeAsync.ListFHIRDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(ListFHIRDatastoresRequest listFHIRDatastoresRequest);

    /**
     * <p>
     * Lists all FHIR Data Stores that are in the user’s account, regardless of Data Store status.
     * </p>
     * 
     * @param listFHIRDatastoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFHIRDatastores operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.ListFHIRDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(ListFHIRDatastoresRequest listFHIRDatastoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListFHIRDatastoresRequest, ListFHIRDatastoresResult> asyncHandler);

    /**
     * <p>
     * Lists all FHIR export jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRExportJobsRequest
     * @return A Java Future containing the result of the ListFHIRExportJobs operation returned by the service.
     * @sample AmazonHealthLakeAsync.ListFHIRExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRExportJobsResult> listFHIRExportJobsAsync(ListFHIRExportJobsRequest listFHIRExportJobsRequest);

    /**
     * <p>
     * Lists all FHIR export jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFHIRExportJobs operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.ListFHIRExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRExportJobsResult> listFHIRExportJobsAsync(ListFHIRExportJobsRequest listFHIRExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFHIRExportJobsRequest, ListFHIRExportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all FHIR import jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRImportJobsRequest
     * @return A Java Future containing the result of the ListFHIRImportJobs operation returned by the service.
     * @sample AmazonHealthLakeAsync.ListFHIRImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRImportJobsResult> listFHIRImportJobsAsync(ListFHIRImportJobsRequest listFHIRImportJobsRequest);

    /**
     * <p>
     * Lists all FHIR import jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFHIRImportJobs operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.ListFHIRImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRImportJobsResult> listFHIRImportJobsAsync(ListFHIRImportJobsRequest listFHIRImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFHIRImportJobsRequest, ListFHIRImportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all existing tags associated with a Data Store.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonHealthLakeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of all existing tags associated with a Data Store.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Begins a FHIR export job.
     * </p>
     * 
     * @param startFHIRExportJobRequest
     * @return A Java Future containing the result of the StartFHIRExportJob operation returned by the service.
     * @sample AmazonHealthLakeAsync.StartFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartFHIRExportJobResult> startFHIRExportJobAsync(StartFHIRExportJobRequest startFHIRExportJobRequest);

    /**
     * <p>
     * Begins a FHIR export job.
     * </p>
     * 
     * @param startFHIRExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFHIRExportJob operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.StartFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartFHIRExportJobResult> startFHIRExportJobAsync(StartFHIRExportJobRequest startFHIRExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartFHIRExportJobRequest, StartFHIRExportJobResult> asyncHandler);

    /**
     * <p>
     * Begins a FHIR Import job.
     * </p>
     * 
     * @param startFHIRImportJobRequest
     * @return A Java Future containing the result of the StartFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsync.StartFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(StartFHIRImportJobRequest startFHIRImportJobRequest);

    /**
     * <p>
     * Begins a FHIR Import job.
     * </p>
     * 
     * @param startFHIRImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.StartFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(StartFHIRImportJobRequest startFHIRImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartFHIRImportJobRequest, StartFHIRImportJobResult> asyncHandler);

    /**
     * <p>
     * Adds a user specifed key and value tag to a Data Store.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonHealthLakeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a user specifed key and value tag to a Data Store.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a Data Store.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonHealthLakeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a Data Store.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
