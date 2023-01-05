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

/**
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
package com.amazonaws.services.appconfigdata;

