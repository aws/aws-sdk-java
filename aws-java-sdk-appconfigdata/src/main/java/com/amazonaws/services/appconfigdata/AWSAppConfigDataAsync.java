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

import com.amazonaws.services.appconfigdata.model.*;

/**
 * Interface for accessing AWS AppConfig Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appconfigdata.AbstractAWSAppConfigDataAsync} instead.
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
public interface AWSAppConfigDataAsync extends AWSAppConfigData {

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
     * @return A Java Future containing the result of the GetLatestConfiguration operation returned by the service.
     * @sample AWSAppConfigDataAsync.GetLatestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLatestConfigurationResult> getLatestConfigurationAsync(GetLatestConfigurationRequest getLatestConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLatestConfiguration operation returned by the service.
     * @sample AWSAppConfigDataAsyncHandler.GetLatestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLatestConfigurationResult> getLatestConfigurationAsync(GetLatestConfigurationRequest getLatestConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLatestConfigurationRequest, GetLatestConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartConfigurationSession operation returned by the service.
     * @sample AWSAppConfigDataAsync.StartConfigurationSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationSessionResult> startConfigurationSessionAsync(
            StartConfigurationSessionRequest startConfigurationSessionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigurationSession operation returned by the service.
     * @sample AWSAppConfigDataAsyncHandler.StartConfigurationSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationSessionResult> startConfigurationSessionAsync(
            StartConfigurationSessionRequest startConfigurationSessionRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationSessionRequest, StartConfigurationSessionResult> asyncHandler);

}
