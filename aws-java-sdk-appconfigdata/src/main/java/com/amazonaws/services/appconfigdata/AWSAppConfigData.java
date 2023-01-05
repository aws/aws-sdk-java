/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfigdata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appconfigdata.model.*;

/**
 * Interface for accessing AWS AppConfig Data.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appconfigdata.AbstractAWSAppConfigData} instead.
 * </p>
 * <p>
 * <p>
 * AppConfig Data provides the data plane APIs your application uses to retrieve configuration data. Here's how it
 * works:
 * </p>
 * <p>
 * Your application retrieves configuration data by first establishing a configuration session using the AppConfig Data
 * <a>StartConfigurationSession</a> API action. Your session's client then makes periodic calls to
 * <a>GetLatestConfiguration</a> to check for and retrieve the latest data available.
 * </p>
 * <p>
 * When calling <code>StartConfigurationSession</code>, your code sends the following information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Identifiers (ID or name) of an AppConfig application, environment, and configuration profile that the session tracks.
 * </p>
 * </li>
 * <li>
 * <p>
 * (Optional) The minimum amount of time the session's client must wait between calls to
 * <code>GetLatestConfiguration</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In response, AppConfig provides an <code>InitialConfigurationToken</code> to be given to the session's client and
 * used the first time it calls <code>GetLatestConfiguration</code> for that session.
 * </p>
 * <p>
 * When calling <code>GetLatestConfiguration</code>, your client code sends the most recent
 * <code>ConfigurationToken</code> value it has and receives in response:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>NextPollConfigurationToken</code>: the <code>ConfigurationToken</code> value to use on the next call to
 * <code>GetLatestConfiguration</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NextPollIntervalInSeconds</code>: the duration the client should wait before making its next call to
 * <code>GetLatestConfiguration</code>. This duration may vary over the course of the session, so it should be used
 * instead of the value sent on the <code>StartConfigurationSession</code> call.
 * </p>
 * </li>
 * <li>
 * <p>
 * The configuration: the latest data intended for the session. This may be empty if the client already has the latest
 * version of the configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information and to view example CLI commands that show how to retrieve a configuration using the AppConfig
 * Data <code>StartConfigurationSession</code> and <code>GetLatestConfiguration</code> API actions, see <a
 * href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-retrieving-the-configuration">Receiving the
 * configuration</a> in the <i>AppConfig User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppConfigData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appconfigdata";

    /**
     * <p>
     * Retrieves the latest deployed configuration. This API may return empty configuration data if the client already
     * has the latest version. For more information about this API action and to view example CLI commands that show how
     * to use it with the <a>StartConfigurationSession</a> API action, see <a
     * href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-retrieving-the-configuration">Receiving the
     * configuration</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Note the following important information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each configuration token is only valid for one call to <code>GetLatestConfiguration</code>. The
     * <code>GetLatestConfiguration</code> response includes a <code>NextPollConfigurationToken</code> that should
     * always replace the token used for the just-completed call in preparation for the next one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetLatestConfiguration</code> is a priced call. For more information, see <a
     * href="https://aws.amazon.com/systems-manager/pricing/">Pricing</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param getLatestConfigurationRequest
     * @return Result of the GetLatestConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         There was an internal failure in the service.
     * @sample AWSAppConfigData.GetLatestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetLatestConfigurationResult getLatestConfiguration(GetLatestConfigurationRequest getLatestConfigurationRequest);

    /**
     * <p>
     * Starts a configuration session used to retrieve a deployed configuration. For more information about this API
     * action and to view example CLI commands that show how to use it with the <a>GetLatestConfiguration</a> API
     * action, see <a
     * href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-retrieving-the-configuration">Receiving the
     * configuration</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param startConfigurationSessionRequest
     * @return Result of the StartConfigurationSession operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         There was an internal failure in the service.
     * @sample AWSAppConfigData.StartConfigurationSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
     *      target="_top">AWS API Documentation</a>
     */
    StartConfigurationSessionResult startConfigurationSession(StartConfigurationSessionRequest startConfigurationSessionRequest);

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
