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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.honeycode.model.*;

/**
 * Interface for accessing Honeycode.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.honeycode.AbstractAmazonHoneycode} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without
 * programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals,
 * resources, and even your team.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonHoneycode {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "honeycode";

    /**
     * <p>
     * The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local
     * variables in the screen to filter, sort or otherwise affect what will be displayed on the screen.
     * </p>
     * 
     * @param getScreenDataRequest
     * @return Result of the GetScreenData operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the screen/automation in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.GetScreenData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
     *      Documentation</a>
     */
    GetScreenDataResult getScreenData(GetScreenDataRequest getScreenDataRequest);

    /**
     * <p>
     * The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows
     * setting local variables, which can then be used in the automation being invoked. This allows automating the
     * Honeycode app interactions to write, update or delete data in the workbook.
     * </p>
     * 
     * @param invokeScreenAutomationRequest
     * @return Result of the InvokeScreenAutomation operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the screen/automation in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, App, Screen or Screen Automation was not found with the given ID.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws AutomationExecutionException
     *         The automation execution did not end successfully.
     * @throws AutomationExecutionTimeoutException
     *         The automation execution timed out.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonHoneycode.InvokeScreenAutomation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation"
     *      target="_top">AWS API Documentation</a>
     */
    InvokeScreenAutomationResult invokeScreenAutomation(InvokeScreenAutomationRequest invokeScreenAutomationRequest);

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
