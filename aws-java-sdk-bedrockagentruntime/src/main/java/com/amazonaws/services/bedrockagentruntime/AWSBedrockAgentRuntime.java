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
package com.amazonaws.services.bedrockagentruntime;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bedrockagentruntime.model.*;

/**
 * Interface for accessing Agents for Amazon Bedrock Runtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockagentruntime.AbstractAWSBedrockAgentRuntime} instead.
 * </p>
 * <p>
 * <p>
 * Contains APIs related to model invocation and querying of knowledge bases.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBedrockAgentRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bedrock-agent-runtime";

    /**
     * <p>
     * Queries a knowledge base and retrieves information from it.
     * </p>
     * 
     * @param retrieveRequest
     * @return Result of the Retrieve operation returned by the service.
     * @throws ConflictException
     *         There was a conflict performing an operation. Resolve the conflict and retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws DependencyFailedException
     *         There was an issue with a dependency. Check the resource configurations and retry the request.
     * @throws BadGatewayException
     *         There was an issue with a dependency due to a server issue. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions. Check your permissions and retry your
     *         request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgentRuntime.Retrieve
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Retrieve" target="_top">AWS
     *      API Documentation</a>
     */
    RetrieveResult retrieve(RetrieveRequest retrieveRequest);

    /**
     * <p>
     * Queries a knowledge base and generates responses based on the retrieved results. The response only cites sources
     * that are relevant to the query.
     * </p>
     * 
     * @param retrieveAndGenerateRequest
     * @return Result of the RetrieveAndGenerate operation returned by the service.
     * @throws ConflictException
     *         There was a conflict performing an operation. Resolve the conflict and retry your request.
     * @throws ResourceNotFoundException
     *         The specified resource Amazon Resource Name (ARN) was not found. Check the Amazon Resource Name (ARN) and
     *         try your request again.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws DependencyFailedException
     *         There was an issue with a dependency. Check the resource configurations and retry the request.
     * @throws BadGatewayException
     *         There was an issue with a dependency due to a server issue. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions. Check your permissions and retry your
     *         request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @sample AWSBedrockAgentRuntime.RetrieveAndGenerate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrieveAndGenerate"
     *      target="_top">AWS API Documentation</a>
     */
    RetrieveAndGenerateResult retrieveAndGenerate(RetrieveAndGenerateRequest retrieveAndGenerateRequest);

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
