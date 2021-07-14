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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.healthlake.model.*;

/**
 * Interface for accessing HealthLake.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.healthlake.AbstractAmazonHealthLake} instead.
 * </p>
 * <p>
 * <p>
 * Amazon HealthLake is a HIPAA eligibile service that allows customers to store, transform, query, and analyze their
 * FHIR-formatted data in a consistent fashion in the cloud.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonHealthLake {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "healthlake";

    /**
     * <p>
     * Creates a Data Store that can ingest and export FHIR formatted data.
     * </p>
     * 
     * @param createFHIRDatastoreRequest
     * @return Result of the CreateFHIRDatastore operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.CreateFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFHIRDatastoreResult createFHIRDatastore(CreateFHIRDatastoreRequest createFHIRDatastoreRequest);

    /**
     * <p>
     * Deletes a Data Store.
     * </p>
     * 
     * @param deleteFHIRDatastoreRequest
     * @return Result of the DeleteFHIRDatastore operation returned by the service.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ConflictException
     *         The Data Store is in a transition state and the user requested action can not be performed.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DeleteFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DeleteFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteFHIRDatastoreResult deleteFHIRDatastore(DeleteFHIRDatastoreRequest deleteFHIRDatastoreRequest);

    /**
     * <p>
     * Gets the properties associated with the FHIR Data Store, including the Data Store ID, Data Store ARN, Data Store
     * name, Data Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     * 
     * @param describeFHIRDatastoreRequest
     * @return Result of the DescribeFHIRDatastore operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DescribeFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFHIRDatastoreResult describeFHIRDatastore(DescribeFHIRDatastoreRequest describeFHIRDatastoreRequest);

    /**
     * <p>
     * Displays the properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRExportJobRequest
     * @return Result of the DescribeFHIRExportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DescribeFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFHIRExportJobResult describeFHIRExportJob(DescribeFHIRExportJobRequest describeFHIRExportJobRequest);

    /**
     * <p>
     * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param describeFHIRImportJobRequest
     * @return Result of the DescribeFHIRImportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.DescribeFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFHIRImportJobResult describeFHIRImportJob(DescribeFHIRImportJobRequest describeFHIRImportJobRequest);

    /**
     * <p>
     * Lists all FHIR Data Stores that are in the user’s account, regardless of Data Store status.
     * </p>
     * 
     * @param listFHIRDatastoresRequest
     * @return Result of the ListFHIRDatastores operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.ListFHIRDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    ListFHIRDatastoresResult listFHIRDatastores(ListFHIRDatastoresRequest listFHIRDatastoresRequest);

    /**
     * <p>
     * Lists all FHIR export jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRExportJobsRequest
     * @return Result of the ListFHIRExportJobs operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.ListFHIRExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListFHIRExportJobsResult listFHIRExportJobs(ListFHIRExportJobsRequest listFHIRExportJobsRequest);

    /**
     * <p>
     * Lists all FHIR import jobs associated with an account and their statuses.
     * </p>
     * 
     * @param listFHIRImportJobsRequest
     * @return Result of the ListFHIRImportJobs operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.ListFHIRImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListFHIRImportJobsResult listFHIRImportJobs(ListFHIRImportJobsRequest listFHIRImportJobsRequest);

    /**
     * <p>
     * Returns a list of all existing tags associated with a Data Store.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @sample AmazonHealthLake.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Begins a FHIR export job.
     * </p>
     * 
     * @param startFHIRExportJobRequest
     * @return Result of the StartFHIRExportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.StartFHIRExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartFHIRExportJobResult startFHIRExportJob(StartFHIRExportJobRequest startFHIRExportJobRequest);

    /**
     * <p>
     * Begins a FHIR Import job.
     * </p>
     * 
     * @param startFHIRImportJobRequest
     * @return Result of the StartFHIRImportJob operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ThrottlingException
     *         The user has exceeded their maximum number of allowed calls to the given API.
     * @throws AccessDeniedException
     *         Access is denied. Your account is not authorized to perform this operation.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @throws InternalServerException
     *         Unknown error occurs in the service.
     * @sample AmazonHealthLake.StartFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartFHIRImportJobResult startFHIRImportJob(StartFHIRImportJobRequest startFHIRImportJobRequest);

    /**
     * <p>
     * Adds a user specifed key and value tag to a Data Store.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @sample AmazonHealthLake.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a Data Store.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The user input parameter was invalid.
     * @throws ResourceNotFoundException
     *         The requested Data Store was not found.
     * @sample AmazonHealthLake.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
