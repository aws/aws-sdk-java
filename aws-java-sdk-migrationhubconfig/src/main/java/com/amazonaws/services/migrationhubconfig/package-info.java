/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <ul>
 * <li>
 * <p>
 * You must make API calls for write actions (create, notify, associate, disassociate, import, or put) while in your
 * home region, or a <code>HomeRegionNotSetException</code> error is returned.
 * </p>
 * </li>
 * <li>
 * <p>
 * API calls for read actions (list, describe, stop, and delete) are permitted outside of your home region.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call a write API outside the home region, an <code>InvalidInputException</code> is returned.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can call <code>GetHomeRegion</code> action to obtain the account's Migration Hub home region.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For specific API usage, see the sections that follow in this AWS Migration Hub Home Region API reference.
 * </p>
 */
package com.amazonaws.services.migrationhubconfig;

