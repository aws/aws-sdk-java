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

import com.amazonaws.services.comprehendmedical.model.*;

/**
 * Interface for accessing ComprehendMedical asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehendmedical.AbstractAWSComprehendMedicalAsync} instead.
 * </p>
 * <p>
 * <p>
 * Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain insight
 * in your documents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComprehendMedicalAsync extends AWSComprehendMedical {

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AWSComprehendMedicalAsync.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest);

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectEntities operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler);

    /**
     * <p>
     * Inspects the clinical text for personal health information (PHI) entities and entity category, location, and
     * confidence score on that information.
     * </p>
     * 
     * @param detectPHIRequest
     * @return A Java Future containing the result of the DetectPHI operation returned by the service.
     * @sample AWSComprehendMedicalAsync.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest detectPHIRequest);

    /**
     * <p>
     * Inspects the clinical text for personal health information (PHI) entities and entity category, location, and
     * confidence score on that information.
     * </p>
     * 
     * @param detectPHIRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectPHI operation returned by the service.
     * @sample AWSComprehendMedicalAsyncHandler.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest detectPHIRequest,
            com.amazonaws.handlers.AsyncHandler<DetectPHIRequest, DetectPHIResult> asyncHandler);

}
