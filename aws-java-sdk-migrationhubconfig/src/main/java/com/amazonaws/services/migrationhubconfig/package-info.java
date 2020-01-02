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

/**
 * <p>
 * The AWS Migration Hub home region APIs are available specifically for working with your Migration Hub home region.
 * You can use these APIs to determine a home region, as well as to create and work with controls that describe the home
 * region.
 * </p>
 * <p>
 * You can use these APIs within your home region only. If you call these APIs from outside your home region, your calls
 * are rejected, except for the ability to register your agents and connectors.
 * </p>
 * <p>
 * You must call <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service
 * and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
 * </p>
 * <p>
 * The <code>StartDataCollection</code> API call in AWS Application Discovery Service allows your agents and connectors
 * to begin collecting data that flows directly into the home region, and it will prevent you from enabling data
 * collection information to be sent outside the home region.
 * </p>
 * <p>
 * For specific API usage, see the sections that follow in this AWS Migration Hub Home Region API reference.
 * </p>
 * <note>
 * <p>
 * The Migration Hub Home Region APIs do not support AWS Organizations.
 * </p>
 * </note>
 */
package com.amazonaws.services.migrationhubconfig;

