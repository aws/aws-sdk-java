/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;

/**
 * Interface for accessing Amazon EventBridge Pipes asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pipes.AbstractAmazonPipesAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EventBridge Pipes connects event sources to targets. Pipes reduces the need for specialized knowledge and
 * integration code when developing event driven architectures. This helps ensures consistency across your company’s
 * applications. With Pipes, the target can be any available EventBridge target. To set up a pipe, you select the event
 * source, add optional event filtering, define optional enrichment, and select the target for the event data.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPipesAsync extends AmazonPipes {

    /**
     * <p>
     * Create a pipe. Amazon EventBridge Pipes connect event sources to targets and reduces the need for specialized
     * knowledge and integration code.
     * </p>
     * 
     * @param createPipeRequest
     * @return A Java Future containing the result of the CreatePipe operation returned by the service.
     * @sample AmazonPipesAsync.CreatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/CreatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePipeResult> createPipeAsync(CreatePipeRequest createPipeRequest);

    /**
     * <p>
     * Create a pipe. Amazon EventBridge Pipes connect event sources to targets and reduces the need for specialized
     * knowledge and integration code.
     * </p>
     * 
     * @param createPipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePipe operation returned by the service.
     * @sample AmazonPipesAsyncHandler.CreatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/CreatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePipeResult> createPipeAsync(CreatePipeRequest createPipeRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePipeRequest, CreatePipeResult> asyncHandler);

    /**
     * <p>
     * Delete an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param deletePipeRequest
     * @return A Java Future containing the result of the DeletePipe operation returned by the service.
     * @sample AmazonPipesAsync.DeletePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DeletePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePipeResult> deletePipeAsync(DeletePipeRequest deletePipeRequest);

    /**
     * <p>
     * Delete an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param deletePipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePipe operation returned by the service.
     * @sample AmazonPipesAsyncHandler.DeletePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DeletePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePipeResult> deletePipeAsync(DeletePipeRequest deletePipeRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePipeRequest, DeletePipeResult> asyncHandler);

    /**
     * <p>
     * Get the information about an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param describePipeRequest
     * @return A Java Future containing the result of the DescribePipe operation returned by the service.
     * @sample AmazonPipesAsync.DescribePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DescribePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePipeResult> describePipeAsync(DescribePipeRequest describePipeRequest);

    /**
     * <p>
     * Get the information about an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param describePipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePipe operation returned by the service.
     * @sample AmazonPipesAsyncHandler.DescribePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DescribePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePipeResult> describePipeAsync(DescribePipeRequest describePipeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePipeRequest, DescribePipeResult> asyncHandler);

    /**
     * <p>
     * Get the pipes associated with this account. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param listPipesRequest
     * @return A Java Future containing the result of the ListPipes operation returned by the service.
     * @sample AmazonPipesAsync.ListPipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListPipes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipesResult> listPipesAsync(ListPipesRequest listPipesRequest);

    /**
     * <p>
     * Get the pipes associated with this account. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param listPipesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipes operation returned by the service.
     * @sample AmazonPipesAsyncHandler.ListPipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListPipes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPipesResult> listPipesAsync(ListPipesRequest listPipesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipesRequest, ListPipesResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with a pipe.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPipesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with a pipe.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPipesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Start an existing pipe.
     * </p>
     * 
     * @param startPipeRequest
     * @return A Java Future containing the result of the StartPipe operation returned by the service.
     * @sample AmazonPipesAsync.StartPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StartPipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartPipeResult> startPipeAsync(StartPipeRequest startPipeRequest);

    /**
     * <p>
     * Start an existing pipe.
     * </p>
     * 
     * @param startPipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartPipe operation returned by the service.
     * @sample AmazonPipesAsyncHandler.StartPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StartPipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartPipeResult> startPipeAsync(StartPipeRequest startPipeRequest,
            com.amazonaws.handlers.AsyncHandler<StartPipeRequest, StartPipeResult> asyncHandler);

    /**
     * <p>
     * Stop an existing pipe.
     * </p>
     * 
     * @param stopPipeRequest
     * @return A Java Future containing the result of the StopPipe operation returned by the service.
     * @sample AmazonPipesAsync.StopPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StopPipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopPipeResult> stopPipeAsync(StopPipeRequest stopPipeRequest);

    /**
     * <p>
     * Stop an existing pipe.
     * </p>
     * 
     * @param stopPipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopPipe operation returned by the service.
     * @sample AmazonPipesAsyncHandler.StopPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StopPipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopPipeResult> stopPipeAsync(StopPipeRequest stopPipeRequest,
            com.amazonaws.handlers.AsyncHandler<StopPipeRequest, StopPipeResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified pipe. Tags can help you organize and categorize your
     * resources. You can also use them to scope user permissions by granting a user permission to access or change only
     * resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a pipe that already has tags. If you specify a new tag key,
     * this tag is appended to the list of tags associated with the pipe. If you specify a tag key that is already
     * associated with the pipe, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a pipe.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPipesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified pipe. Tags can help you organize and categorize your
     * resources. You can also use them to scope user permissions by granting a user permission to access or change only
     * resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a pipe that already has tags. If you specify a new tag key,
     * this tag is appended to the list of tags associated with the pipe. If you specify a tag key that is already
     * associated with the pipe, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a pipe.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPipesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified pipes.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPipesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified pipes.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPipesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update an existing pipe. When you call <code>UpdatePipe</code>, only the fields that are included in the request
     * are changed, the rest are unchanged. The exception to this is if you modify any Amazon Web Services-service
     * specific fields in the <code>SourceParameters</code>, <code>EnrichmentParameters</code>, or
     * <code>TargetParameters</code> objects. The fields in these objects are updated atomically as one and override
     * existing values. This is by design and means that if you don't specify an optional field in one of these
     * Parameters objects, that field will be set to its system-default value after the update.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For more information about pipes, see &lt;a href=&quot;https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html&quot;&gt; Amazon EventBridge Pipes&lt;/a&gt; in the Amazon EventBridge User Guide.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param updatePipeRequest
     * @return A Java Future containing the result of the UpdatePipe operation returned by the service.
     * @sample AmazonPipesAsync.UpdatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UpdatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipeResult> updatePipeAsync(UpdatePipeRequest updatePipeRequest);

    /**
     * <p>
     * Update an existing pipe. When you call <code>UpdatePipe</code>, only the fields that are included in the request
     * are changed, the rest are unchanged. The exception to this is if you modify any Amazon Web Services-service
     * specific fields in the <code>SourceParameters</code>, <code>EnrichmentParameters</code>, or
     * <code>TargetParameters</code> objects. The fields in these objects are updated atomically as one and override
     * existing values. This is by design and means that if you don't specify an optional field in one of these
     * Parameters objects, that field will be set to its system-default value after the update.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For more information about pipes, see &lt;a href=&quot;https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html&quot;&gt; Amazon EventBridge Pipes&lt;/a&gt; in the Amazon EventBridge User Guide.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param updatePipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipe operation returned by the service.
     * @sample AmazonPipesAsyncHandler.UpdatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UpdatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePipeResult> updatePipeAsync(UpdatePipeRequest updatePipeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipeRequest, UpdatePipeResult> asyncHandler);

}
