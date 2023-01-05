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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pipes.model.*;

/**
 * Interface for accessing Amazon EventBridge Pipes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pipes.AbstractAmazonPipes} instead.
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
public interface AmazonPipes {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "pipes";

    /**
     * <p>
     * Create a pipe. Amazon EventBridge Pipes connect event sources to targets and reduces the need for specialized
     * knowledge and integration code.
     * </p>
     * 
     * @param createPipeRequest
     * @return Result of the CreatePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @throws ServiceQuotaExceededException
     *         A quota has been exceeded.
     * @sample AmazonPipes.CreatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/CreatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePipeResult createPipe(CreatePipeRequest createPipeRequest);

    /**
     * <p>
     * Delete an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param deletePipeRequest
     * @return Result of the DeletePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.DeletePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DeletePipe" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePipeResult deletePipe(DeletePipeRequest deletePipeRequest);

    /**
     * <p>
     * Get the information about an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param describePipeRequest
     * @return Result of the DescribePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.DescribePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DescribePipe" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePipeResult describePipe(DescribePipeRequest describePipeRequest);

    /**
     * <p>
     * Get the pipes associated with this account. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param listPipesRequest
     * @return Result of the ListPipes operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @sample AmazonPipes.ListPipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListPipes" target="_top">AWS API
     *      Documentation</a>
     */
    ListPipesResult listPipes(ListPipesRequest listPipesRequest);

    /**
     * <p>
     * Displays the tags associated with a pipe.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Start an existing pipe.
     * </p>
     * 
     * @param startPipeRequest
     * @return Result of the StartPipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.StartPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StartPipe" target="_top">AWS API
     *      Documentation</a>
     */
    StartPipeResult startPipe(StartPipeRequest startPipeRequest);

    /**
     * <p>
     * Stop an existing pipe.
     * </p>
     * 
     * @param stopPipeRequest
     * @return Result of the StopPipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.StopPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StopPipe" target="_top">AWS API
     *      Documentation</a>
     */
    StopPipeResult stopPipe(StopPipeRequest stopPipeRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified pipes.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdatePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.UpdatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UpdatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePipeResult updatePipe(UpdatePipeRequest updatePipeRequest);

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
