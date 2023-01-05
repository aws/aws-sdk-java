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
 * <fullname>Amazon Managed Workflows for Apache Airflow</fullname>
 * <p>
 * This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation. For more
 * information, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/what-is-mwaa.html">What Is Amazon
 * MWAA?</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>api.airflow.{region}.amazonaws.com</code> - This endpoint is used for environment management.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_CreateEnvironment.html">CreateEnvironment</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_DeleteEnvironment.html">DeleteEnvironment</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_GetEnvironment.html">GetEnvironment</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_ListEnvironments.html">ListEnvironments</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_ListTagsForResource.html">ListTagsForResource</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_TagResource.html">TagResource</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_UntagResource.html">UntagResource</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_UpdateEnvironment.html">UpdateEnvironment</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <code>env.airflow.{region}.amazonaws.com</code> - This endpoint is used to operate the Airflow environment.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_CreateCliToken.html ">CreateCliToken</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_CreateWebLoginToken.html">CreateWebLoginToken</a>
 * </p>
 * </li>
 * </ul>
 * <br />
 * </li>
 * <li>
 * <p>
 * <code>ops.airflow.{region}.amazonaws.com</code> - This endpoint is used to push environment metrics that track
 * environment health.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mwaa/latest/API/API_PublishMetrics.html ">PublishMetrics</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Regions</b>
 * </p>
 * <p>
 * For a list of regions that Amazon MWAA supports, see <a
 * href="https://docs.aws.amazon.com/mwaa/latest/userguide/what-is-mwaa.html#regions-mwaa">Region availability</a> in
 * the <i>Amazon MWAA User Guide</i>.
 * </p>
 * </p>
 */
package com.amazonaws.services.mwaa;

