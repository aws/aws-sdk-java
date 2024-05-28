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

import com.amazonaws.services.osis.model.*;

/**
 * Interface for accessing Amazon OpenSearch Ingestion asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.osis.AbstractAmazonOSISAsync} instead.
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
public interface AmazonOSISAsync extends AmazonOSIS {

    /**
     * <p>
     * Creates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param createPipelineRequest
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AmazonOSISAsync.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/CreatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Creates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param createPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AmazonOSISAsyncHandler.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/CreatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/delete-pipeline.html">Deleting Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param deletePipelineRequest
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AmazonOSISAsync.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/DeletePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Deletes an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/delete-pipeline.html">Deleting Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param deletePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AmazonOSISAsyncHandler.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/DeletePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an OpenSearch Ingestion pipeline.
     * </p>
     * 
     * @param getPipelineRequest
     * @return A Java Future containing the result of the GetPipeline operation returned by the service.
     * @sample AmazonOSISAsync.GetPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest getPipelineRequest);

    /**
     * <p>
     * Retrieves information about an OpenSearch Ingestion pipeline.
     * </p>
     * 
     * @param getPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPipeline operation returned by the service.
     * @sample AmazonOSISAsyncHandler.GetPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest getPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetPipelineRequest, GetPipelineResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specific blueprint for OpenSearch Ingestion. Blueprints are templates for the
     * configuration needed for a <code>CreatePipeline</code> request. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param getPipelineBlueprintRequest
     * @return A Java Future containing the result of the GetPipelineBlueprint operation returned by the service.
     * @sample AmazonOSISAsync.GetPipelineBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineBlueprint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineBlueprintResult> getPipelineBlueprintAsync(GetPipelineBlueprintRequest getPipelineBlueprintRequest);

    /**
     * <p>
     * Retrieves information about a specific blueprint for OpenSearch Ingestion. Blueprints are templates for the
     * configuration needed for a <code>CreatePipeline</code> request. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param getPipelineBlueprintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPipelineBlueprint operation returned by the service.
     * @sample AmazonOSISAsyncHandler.GetPipelineBlueprint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineBlueprint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineBlueprintResult> getPipelineBlueprintAsync(GetPipelineBlueprintRequest getPipelineBlueprintRequest,
            com.amazonaws.handlers.AsyncHandler<GetPipelineBlueprintRequest, GetPipelineBlueprintResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetPipelineChangeProgress operation returned by the service.
     * @sample AmazonOSISAsync.GetPipelineChangeProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineChangeProgress" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineChangeProgressResult> getPipelineChangeProgressAsync(
            GetPipelineChangeProgressRequest getPipelineChangeProgressRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPipelineChangeProgress operation returned by the service.
     * @sample AmazonOSISAsyncHandler.GetPipelineChangeProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineChangeProgress" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPipelineChangeProgressResult> getPipelineChangeProgressAsync(
            GetPipelineChangeProgressRequest getPipelineChangeProgressRequest,
            com.amazonaws.handlers.AsyncHandler<GetPipelineChangeProgressRequest, GetPipelineChangeProgressResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all available blueprints for Data Prepper. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param listPipelineBlueprintsRequest
     * @return A Java Future containing the result of the ListPipelineBlueprints operation returned by the service.
     * @sample AmazonOSISAsync.ListPipelineBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelineBlueprints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineBlueprintsResult> listPipelineBlueprintsAsync(ListPipelineBlueprintsRequest listPipelineBlueprintsRequest);

    /**
     * <p>
     * Retrieves a list of all available blueprints for Data Prepper. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html#pipeline-blueprint"
     * >Using blueprints to create a pipeline</a>.
     * </p>
     * 
     * @param listPipelineBlueprintsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelineBlueprints operation returned by the service.
     * @sample AmazonOSISAsyncHandler.ListPipelineBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelineBlueprints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPipelineBlueprintsResult> listPipelineBlueprintsAsync(ListPipelineBlueprintsRequest listPipelineBlueprintsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelineBlueprintsRequest, ListPipelineBlueprintsResult> asyncHandler);

    /**
     * <p>
     * Lists all OpenSearch Ingestion pipelines in the current Amazon Web Services account and Region. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/list-pipeline.html">Viewing Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listPipelinesRequest
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AmazonOSISAsync.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Lists all OpenSearch Ingestion pipelines in the current Amazon Web Services account and Region. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/list-pipeline.html">Viewing Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listPipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AmazonOSISAsyncHandler.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists all resource tags associated with an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonOSISAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all resource tags associated with an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonOSISAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--start"
     * >Starting an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param startPipelineRequest
     * @return A Java Future containing the result of the StartPipeline operation returned by the service.
     * @sample AmazonOSISAsync.StartPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StartPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartPipelineResult> startPipelineAsync(StartPipelineRequest startPipelineRequest);

    /**
     * <p>
     * Starts an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--start"
     * >Starting an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param startPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartPipeline operation returned by the service.
     * @sample AmazonOSISAsyncHandler.StartPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StartPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartPipelineResult> startPipelineAsync(StartPipelineRequest startPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<StartPipelineRequest, StartPipelineResult> asyncHandler);

    /**
     * <p>
     * Stops an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--stop"
     * >Stopping an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param stopPipelineRequest
     * @return A Java Future containing the result of the StopPipeline operation returned by the service.
     * @sample AmazonOSISAsync.StopPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StopPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopPipelineResult> stopPipelineAsync(StopPipelineRequest stopPipelineRequest);

    /**
     * <p>
     * Stops an OpenSearch Ingestion pipeline. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/pipeline--stop-start.html#pipeline--stop"
     * >Stopping an OpenSearch Ingestion pipeline</a>.
     * </p>
     * 
     * @param stopPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopPipeline operation returned by the service.
     * @sample AmazonOSISAsyncHandler.StopPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/StopPipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopPipelineResult> stopPipelineAsync(StopPipelineRequest stopPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<StopPipelineRequest, StopPipelineResult> asyncHandler);

    /**
     * <p>
     * Tags an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonOSISAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonOSISAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonOSISAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-pipeline.html">Tagging Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonOSISAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/update-pipeline.html">Updating Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param updatePipelineRequest
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AmazonOSISAsync.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UpdatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest);

    /**
     * <p>
     * Updates an OpenSearch Ingestion pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/update-pipeline.html">Updating Amazon
     * OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param updatePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AmazonOSISAsyncHandler.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/UpdatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler);

    /**
     * <p>
     * Checks whether an OpenSearch Ingestion pipeline configuration is valid prior to creation. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param validatePipelineRequest
     * @return A Java Future containing the result of the ValidatePipeline operation returned by the service.
     * @sample AmazonOSISAsync.ValidatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ValidatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ValidatePipelineResult> validatePipelineAsync(ValidatePipelineRequest validatePipelineRequest);

    /**
     * <p>
     * Checks whether an OpenSearch Ingestion pipeline configuration is valid prior to creation. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/creating-pipeline.html">Creating
     * Amazon OpenSearch Ingestion pipelines</a>.
     * </p>
     * 
     * @param validatePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidatePipeline operation returned by the service.
     * @sample AmazonOSISAsyncHandler.ValidatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ValidatePipeline" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ValidatePipelineResult> validatePipelineAsync(ValidatePipelineRequest validatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<ValidatePipelineRequest, ValidatePipelineResult> asyncHandler);

}
