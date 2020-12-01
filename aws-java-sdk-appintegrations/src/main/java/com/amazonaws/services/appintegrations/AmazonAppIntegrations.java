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
package com.amazonaws.services.appintegrations;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appintegrations.model.*;

/**
 * Interface for accessing Amazon AppIntegrations Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appintegrations.AbstractAmazonAppIntegrations} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon AppIntegrations APIs are in preview release and are subject to change.
 * </p>
 * <p>
 * The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.
 * </p>
 * <p>
 * For information about how you can use external applications with Amazon Connect, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/crm.html">Set up pre-built integrations</a> in the
 * <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppIntegrations {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "app-integrations";

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Creates an EventIntegration, given a specified name, description, and a reference to an Amazon Eventbridge bus in
     * your account and a partner event source that will push events to that bus. No objects are created in the your
     * account, only metadata that is persisted on the EventIntegration control plane.
     * </p>
     * 
     * @param createEventIntegrationRequest
     * @return Result of the CreateEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceQuotaExceededException
     *         The allowed quota for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.CreateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEventIntegrationResult createEventIntegration(CreateEventIntegrationRequest createEventIntegrationRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Deletes the specified existing event integration. If the event integration is associated with clients, the
     * request is rejected.
     * </p>
     * 
     * @param deleteEventIntegrationRequest
     * @return Result of the DeleteEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.DeleteEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DeleteEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventIntegrationResult deleteEventIntegration(DeleteEventIntegrationRequest deleteEventIntegrationRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Return information about the event integration.
     * </p>
     * 
     * @param getEventIntegrationRequest
     * @return Result of the GetEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.GetEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/GetEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    GetEventIntegrationResult getEventIntegration(GetEventIntegrationRequest getEventIntegrationRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Returns a paginated list of event integration associations in the account.
     * </p>
     * 
     * @param listEventIntegrationAssociationsRequest
     * @return Result of the ListEventIntegrationAssociations operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.ListEventIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListEventIntegrationAssociationsResult listEventIntegrationAssociations(ListEventIntegrationAssociationsRequest listEventIntegrationAssociationsRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Returns a paginated list of event integrations in the account.
     * </p>
     * 
     * @param listEventIntegrationsRequest
     * @return Result of the ListEventIntegrations operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.ListEventIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    ListEventIntegrationsResult listEventIntegrations(ListEventIntegrationsRequest listEventIntegrationsRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonAppIntegrations.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonAppIntegrations.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonAppIntegrations.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * The Amazon AppIntegrations APIs are in preview release and are subject to change.
     * </p>
     * <p>
     * Updates the description of an event integration.
     * </p>
     * 
     * @param updateEventIntegrationRequest
     * @return Result of the UpdateEventIntegration operation returned by the service.
     * @throws InternalServiceErrorException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonAppIntegrations.UpdateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventIntegrationResult updateEventIntegration(UpdateEventIntegrationRequest updateEventIntegrationRequest);

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
