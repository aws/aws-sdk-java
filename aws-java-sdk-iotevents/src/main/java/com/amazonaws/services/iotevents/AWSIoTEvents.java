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
package com.amazonaws.services.iotevents;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotevents.model.*;

/**
 * Interface for accessing AWS IoT Events.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotevents.AbstractAWSIoTEvents} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
 * when such events occur. AWS IoT Events API commands enable you to create, read, update and delete inputs and detector
 * models, and to list their versions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTEvents {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iotevents";

    /**
     * <p>
     * Creates a detector model.
     * </p>
     * 
     * @param createDetectorModelRequest
     * @return Result of the CreateDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.CreateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDetectorModelResult createDetectorModel(CreateDetectorModelRequest createDetectorModelRequest);

    /**
     * <p>
     * Creates an input.
     * </p>
     * 
     * @param createInputRequest
     * @return Result of the CreateInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIoTEvents.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInputResult createInput(CreateInputRequest createInputRequest);

    /**
     * <p>
     * Deletes a detector model. Any active instances of the detector model are also deleted.
     * </p>
     * 
     * @param deleteDetectorModelRequest
     * @return Result of the DeleteDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.DeleteDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDetectorModelResult deleteDetectorModel(DeleteDetectorModelRequest deleteDetectorModelRequest);

    /**
     * <p>
     * Deletes an input.
     * </p>
     * 
     * @param deleteInputRequest
     * @return Result of the DeleteInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @sample AWSIoTEvents.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInputResult deleteInput(DeleteInputRequest deleteInputRequest);

    /**
     * <p>
     * Describes a detector model. If the <code>"version"</code> parameter is not specified, information about the
     * latest version is returned.
     * </p>
     * 
     * @param describeDetectorModelRequest
     * @return Result of the DescribeDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.DescribeDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModel"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDetectorModelResult describeDetectorModel(DescribeDetectorModelRequest describeDetectorModelRequest);

    /**
     * <p>
     * Describes an input.
     * </p>
     * 
     * @param describeInputRequest
     * @return Result of the DescribeInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInputResult describeInput(DescribeInputRequest describeInputRequest);

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Events logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return Result of the DescribeLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported.
     * @sample AWSIoTEvents.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoggingOptionsResult describeLoggingOptions(DescribeLoggingOptionsRequest describeLoggingOptionsRequest);

    /**
     * <p>
     * Lists all the versions of a detector model. Only the metadata associated with each detector model version is
     * returned.
     * </p>
     * 
     * @param listDetectorModelVersionsRequest
     * @return Result of the ListDetectorModelVersions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.ListDetectorModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListDetectorModelVersionsResult listDetectorModelVersions(ListDetectorModelVersionsRequest listDetectorModelVersionsRequest);

    /**
     * <p>
     * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
     * </p>
     * 
     * @param listDetectorModelsRequest
     * @return Result of the ListDetectorModels operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.ListDetectorModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListDetectorModelsResult listDetectorModels(ListDetectorModelsRequest listDetectorModelsRequest);

    /**
     * <p>
     * Lists the inputs you have created.
     * </p>
     * 
     * @param listInputsRequest
     * @return Result of the ListInputs operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    ListInputsResult listInputs(ListInputsRequest listInputsRequest);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AWSIoTEvents.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Sets or updates the AWS IoT Events logging options.
     * </p>
     * <p>
     * If you update the value of any <code>"loggingOptions"</code> field, it takes up to one minute for the change to
     * take effect. Also, if you change the policy attached to the role you specified in the <code>"roleArn"</code>
     * field (for example, to correct an invalid policy) it takes up to five minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @sample AWSIoTEvents.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AWSIoTEvents.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AWSIoTEvents.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created
     * as new inputs arrive.
     * </p>
     * 
     * @param updateDetectorModelRequest
     * @return Result of the UpdateDetectorModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEvents.UpdateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDetectorModelResult updateDetectorModel(UpdateDetectorModelRequest updateDetectorModelRequest);

    /**
     * <p>
     * Updates an input.
     * </p>
     * 
     * @param updateInputRequest
     * @return Result of the UpdateInput operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ResourceInUseException
     *         The resource is in use.
     * @sample AWSIoTEvents.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateInputResult updateInput(UpdateInputRequest updateInputRequest);

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
