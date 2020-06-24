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
package com.amazonaws.services.honeycode;

import javax.annotation.Generated;

import com.amazonaws.services.honeycode.model.*;

/**
 * Interface for accessing Honeycode asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.honeycode.AbstractAmazonHoneycodeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without
 * programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals,
 * resources, and even your team.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonHoneycodeAsync extends AmazonHoneycode {

    /**
     * <p>
     * The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local
     * variables in the screen to filter, sort or otherwise affect what will be displayed on the screen.
     * </p>
     * 
     * @param getScreenDataRequest
     * @return A Java Future containing the result of the GetScreenData operation returned by the service.
     * @sample AmazonHoneycodeAsync.GetScreenData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest getScreenDataRequest);

    /**
     * <p>
     * The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local
     * variables in the screen to filter, sort or otherwise affect what will be displayed on the screen.
     * </p>
     * 
     * @param getScreenDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetScreenData operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.GetScreenData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest getScreenDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetScreenDataRequest, GetScreenDataResult> asyncHandler);

    /**
     * <p>
     * The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows
     * setting local variables, which can then be used in the automation being invoked. This allows automating the
     * Honeycode app interactions to write, update or delete data in the workbook.
     * </p>
     * 
     * @param invokeScreenAutomationRequest
     * @return A Java Future containing the result of the InvokeScreenAutomation operation returned by the service.
     * @sample AmazonHoneycodeAsync.InvokeScreenAutomation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest invokeScreenAutomationRequest);

    /**
     * <p>
     * The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows
     * setting local variables, which can then be used in the automation being invoked. This allows automating the
     * Honeycode app interactions to write, update or delete data in the workbook.
     * </p>
     * 
     * @param invokeScreenAutomationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeScreenAutomation operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.InvokeScreenAutomation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest invokeScreenAutomationRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeScreenAutomationRequest, InvokeScreenAutomationResult> asyncHandler);

}
