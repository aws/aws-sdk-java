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
package com.amazonaws.services.osis;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.osis.model.*;

/**
 * Interface for accessing Amazon OpenSearch Ingestion.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.osis.AbstractAmazonOSIS} instead.
 * </p>
 * <p>
 * <p>
 * Use the Amazon OpenSearch Ingestion API to create and manage ingestion pipelines. OpenSearch Ingestion is a fully
 * managed data collector that delivers real-time log and trace data to OpenSearch Service domains. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ingestion.html">Getting data into your
 * cluster using OpenSearch Ingestion</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonOSIS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "osis";

    /**
     * <p>
     * Creates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param createPipelineRequest
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws LimitExceededException
     *         You attempted to create more than the allowed number of tags.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceAlreadyExistsException
     *         You attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/CreatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Deletes an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/delete-pipeline.html">Deleting Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param deletePipelineRequest
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @sample AmazonOSIS.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/DeletePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Retrieves information about an OpenSearch Ingestion pipeline.
     * </p>
     * 
     * @param getPipelineRequest
     * @return Result of the GetPipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.GetPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    GetPipelineResult getPipeline(GetPipelineRequest getPipelineRequest);

    /**
     * <p>
     * Retrieves information about a specific blueprint for OpenSearch Ingestion. Blueprints are templates for the
     * configuration needed for a <code>CreatePipeline</code> request. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param getPipelineBlueprintRequest
     * @return Result of the GetPipelineBlueprint operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.GetPipelineBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineBlueprint" target="_top">AWS API
     *      Documentation</a>
     */
    GetPipelineBlueprintResult getPipelineBlueprint(GetPipelineBlueprintRequest getPipelineBlueprintRequest);

    /**
     * <p>
     * Returns progress information for the current change happening on an OpenSearch Ingestion pipeline. Currently,
     * this operation only returns information when a pipeline is being created.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#get-pipeline-progress"
     * >Tracking the status of pipeline creation</a>.
     * </p>
     * 
     * @param getPipelineChangeProgressRequest
     * @return Result of the GetPipelineChangeProgress operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.GetPipelineChangeProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineChangeProgress" target="_top">AWS
     *      API Documentation</a>
     */
    GetPipelineChangeProgressResult getPipelineChangeProgress(GetPipelineChangeProgressRequest getPipelineChangeProgressRequest);

    /**
     * <p>
     * Retrieves a list of all available blueprints for Data Prepper. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param listPipelineBlueprintsRequest
     * @return Result of the ListPipelineBlueprints operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InvalidPaginationTokenException
     *         An invalid pagination token provided in the request.
     * @sample AmazonOSIS.ListPipelineBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelineBlueprints" target="_top">AWS
     *      API Documentation</a>
     */
    ListPipelineBlueprintsResult listPipelineBlueprints(ListPipelineBlueprintsRequest listPipelineBlueprintsRequest);

    /**
     * <p>
     * Lists all OpenSearch Ingestion pipelines in the current Amazon Web Services account and Region. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/list-pipeline.html">Viewing Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listPipelinesRequest
     * @return Result of the ListPipelines operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InvalidPaginationTokenException
     *         An invalid pagination token provided in the request.
     * @sample AmazonOSIS.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Lists all resource tags associated with an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @sample AmazonOSIS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--start"
     * >Starting an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param startPipelineRequest
     * @return Result of the StartPipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @sample AmazonOSIS.StartPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StartPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    StartPipelineResult startPipeline(StartPipelineRequest startPipelineRequest);

    /**
     * <p>
     * Stops an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--stop"
     * >Stopping an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param stopPipelineRequest
     * @return Result of the StopPipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @sample AmazonOSIS.StopPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StopPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    StopPipelineResult stopPipeline(StopPipelineRequest stopPipelineRequest);

    /**
     * <p>
     * Tags an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws LimitExceededException
     *         You attempted to create more than the allowed number of tags.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @sample AmazonOSIS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @sample AmazonOSIS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/update-pipeline.html">Updating Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param updatePipelineRequest
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws ResourceNotFoundException
     *         You attempted to access or delete a resource that does not exist.
     * @throws ConflictException
     *         The client attempted to remove a resource that is currently in use.
     * @sample AmazonOSIS.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UpdatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePipelineResult updatePipeline(UpdatePipelineRequest updatePipelineRequest);

    /**
     * <p>
     * Checks whether an OpenSearch Ingestion pipeline configuration is valid prior to creation. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param validatePipelineRequest
     * @return Result of the ValidatePipeline operation returned by the service.
     * @throws DisabledOperationException
     *         Exception is thrown when an operation has been disabled.
     * @throws AccessDeniedException
     *         You don't have permissions to access the resource.
     * @throws InternalException
     *         The request failed because of an unknown error, exception, or failure (the failure is internal to the
     *         service).
     * @throws ValidationException
     *         An exception for missing or invalid input fields.
     * @sample AmazonOSIS.ValidatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ValidatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    ValidatePipelineResult validatePipeline(ValidatePipelineRequest validatePipelineRequest);

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
