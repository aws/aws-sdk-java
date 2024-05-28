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

import com.amazonaws.services.bedrockagentruntime.model.*;

/**
 * Interface for accessing Agents for Amazon Bedrock Runtime asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockagentruntime.AbstractAWSBedrockAgentRuntimeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Contains APIs related to model invocation and querying of knowledge bases.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBedrockAgentRuntimeAsync extends AWSBedrockAgentRuntime {

    /**
     * <p>
     * Queries a knowledge base and retrieves information from it.
     * </p>
     * 
     * @param retrieveRequest
     * @return A Java Future containing the result of the Retrieve operation returned by the service.
     * @sample AWSBedrockAgentRuntimeAsync.Retrieve
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Retrieve" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveResult> retrieveAsync(RetrieveRequest retrieveRequest);

    /**
     * <p>
     * Queries a knowledge base and retrieves information from it.
     * </p>
     * 
     * @param retrieveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Retrieve operation returned by the service.
     * @sample AWSBedrockAgentRuntimeAsyncHandler.Retrieve
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Retrieve" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveResult> retrieveAsync(RetrieveRequest retrieveRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveRequest, RetrieveResult> asyncHandler);

    /**
     * <p>
     * Queries a knowledge base and generates responses based on the retrieved results. The response only cites sources
     * that are relevant to the query.
     * </p>
     * 
     * @param retrieveAndGenerateRequest
     * @return A Java Future containing the result of the RetrieveAndGenerate operation returned by the service.
     * @sample AWSBedrockAgentRuntimeAsync.RetrieveAndGenerate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrieveAndGenerate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveAndGenerateResult> retrieveAndGenerateAsync(RetrieveAndGenerateRequest retrieveAndGenerateRequest);

    /**
     * <p>
     * Queries a knowledge base and generates responses based on the retrieved results. The response only cites sources
     * that are relevant to the query.
     * </p>
     * 
     * @param retrieveAndGenerateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetrieveAndGenerate operation returned by the service.
     * @sample AWSBedrockAgentRuntimeAsyncHandler.RetrieveAndGenerate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrieveAndGenerate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RetrieveAndGenerateResult> retrieveAndGenerateAsync(RetrieveAndGenerateRequest retrieveAndGenerateRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveAndGenerateRequest, RetrieveAndGenerateResult> asyncHandler);

}
