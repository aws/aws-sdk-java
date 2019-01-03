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
package com.amazonaws.services.iotdata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotdata.model.*;

/**
 * Interface for accessing AWS IoT Data Plane.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotdata.AbstractAWSIotData} instead.
 * </p>
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT-Data enables secure, bi-directional communication between Internet-connected things (such as sensors,
 * actuators, embedded devices, or smart appliances) and the AWS cloud. It implements a broker for applications and
 * things to publish messages over HTTP (Publish) and retrieve, update, and delete thing shadows. A thing shadow is a
 * persistent representation of your things and their state in the AWS cloud.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIotData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "data.iot";

    /**
     * Overrides the default endpoint for this client ("https://data.iot.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "data.iot.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://data.iot.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "data.iot.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://data.iot.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSIotData#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Deletes the thing shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html">DeleteThingShadow</a> in
     * the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param deleteThingShadowRequest
     *        The input for the DeleteThingShadow operation.
     * @return Result of the DeleteThingShadow operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.DeleteThingShadow
     */
    DeleteThingShadowResult deleteThingShadow(DeleteThingShadowRequest deleteThingShadowRequest);

    /**
     * <p>
     * Gets the thing shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html">GetThingShadow</a> in the
     * <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param getThingShadowRequest
     *        The input for the GetThingShadow operation.
     * @return Result of the GetThingShadow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.GetThingShadow
     */
    GetThingShadowResult getThingShadow(GetThingShadowRequest getThingShadowRequest);

    /**
     * <p>
     * Publishes state information.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html#http">HTTP
     * Protocol</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param publishRequest
     *        The input for the Publish operation.
     * @return Result of the Publish operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @sample AWSIotData.Publish
     */
    PublishResult publish(PublishRequest publishRequest);

    /**
     * <p>
     * Updates the thing shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html">UpdateThingShadow</a> in
     * the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param updateThingShadowRequest
     *        The input for the UpdateThingShadow operation.
     * @return Result of the UpdateThingShadow operation returned by the service.
     * @throws ConflictException
     *         The specified version does not match the version of the document.
     * @throws RequestEntityTooLargeException
     *         The payload exceeds the maximum size allowed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.UpdateThingShadow
     */
    UpdateThingShadowResult updateThingShadow(UpdateThingShadowRequest updateThingShadowRequest);

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
