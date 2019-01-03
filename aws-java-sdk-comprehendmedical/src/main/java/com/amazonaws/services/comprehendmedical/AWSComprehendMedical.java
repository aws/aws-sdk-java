/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.comprehendmedical.model.*;

/**
 * Interface for accessing ComprehendMedical.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehendmedical.AbstractAWSComprehendMedical} instead.
 * </p>
 * <p>
 * <p>
 * Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain insight
 * in your documents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComprehendMedical {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "comprehendmedical";

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Comprehend Medical service is temporarily unavailable. Please wait and then retry your request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    DetectEntitiesResult detectEntities(DetectEntitiesRequest detectEntitiesRequest);

    /**
     * <p>
     * Inspects the clinical text for personal health information (PHI) entities and entity category, location, and
     * confidence score on that information.
     * </p>
     * 
     * @param detectPHIRequest
     * @return Result of the DetectPHI operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Comprehend Medical service is temporarily unavailable. Please wait and then retry your request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    DetectPHIResult detectPHI(DetectPHIRequest detectPHIRequest);

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
