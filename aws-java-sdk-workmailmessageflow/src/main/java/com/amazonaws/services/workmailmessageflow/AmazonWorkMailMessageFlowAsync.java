/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmailmessageflow;

import javax.annotation.Generated;

import com.amazonaws.services.workmailmessageflow.model.*;

/**
 * Interface for accessing Amazon WorkMail Message Flow asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workmailmessageflow.AbstractAmazonWorkMailMessageFlowAsync} instead.
 * </p>
 * <p>
 * <p>
 * The WorkMail Message Flow API provides access to email messages as they are being sent and received by a WorkMail
 * organization.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkMailMessageFlowAsync extends AmazonWorkMailMessageFlow {

    /**
     * <p>
     * Retrieves the raw content of an in-transit email message, in MIME format.
     * </p>
     * 
     * @param getRawMessageContentRequest
     * @return A Java Future containing the result of the GetRawMessageContent operation returned by the service.
     * @sample AmazonWorkMailMessageFlowAsync.GetRawMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/GetRawMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRawMessageContentResult> getRawMessageContentAsync(GetRawMessageContentRequest getRawMessageContentRequest);

    /**
     * <p>
     * Retrieves the raw content of an in-transit email message, in MIME format.
     * </p>
     * 
     * @param getRawMessageContentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRawMessageContent operation returned by the service.
     * @sample AmazonWorkMailMessageFlowAsyncHandler.GetRawMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/GetRawMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRawMessageContentResult> getRawMessageContentAsync(GetRawMessageContentRequest getRawMessageContentRequest,
            com.amazonaws.handlers.AsyncHandler<GetRawMessageContentRequest, GetRawMessageContentResult> asyncHandler);

}
