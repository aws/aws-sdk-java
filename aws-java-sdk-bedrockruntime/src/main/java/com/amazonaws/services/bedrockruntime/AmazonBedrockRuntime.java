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
package com.amazonaws.services.bedrockruntime;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bedrockruntime.model.*;

/**
 * Interface for accessing Amazon Bedrock Runtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockruntime.AbstractAmazonBedrockRuntime} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for running inference using Amazon Bedrock models.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonBedrockRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bedrock-runtime";

    /**
     * <p>
     * Invokes the specified Amazon Bedrock model to run inference using the prompt and inference parameters provided in
     * the request body. You use model inference to generate text, images, and embeddings.
     * </p>
     * <p>
     * For example code, see <i>Invoke model code examples</i> in the <i>Amazon Bedrock User Guide</i>.
     * </p>
     * <p>
     * This operation requires permission for the <code>bedrock:InvokeModel</code> action.
     * </p>
     * 
     * @param invokeModelRequest
     * @return Result of the InvokeModel operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ModelTimeoutException
     *         The request took too long to process. Processing time exceeded the model timeout length.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ModelNotReadyException
     *         The model specified in the request is not ready to serve inference requests.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ModelErrorException
     *         The request failed due to an error while processing the model.
     * @sample AmazonBedrockRuntime.InvokeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS
     *      API Documentation</a>
     */
    InvokeModelResult invokeModel(InvokeModelRequest invokeModelRequest);

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
