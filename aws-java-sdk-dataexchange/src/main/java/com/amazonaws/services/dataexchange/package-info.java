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
 * AWS Data Exchange is a service that makes it easy for AWS customers to exchange data in the cloud. You can use the
 * AWS Data Exchange APIs to create, update, manage, and access file-based data set in the AWS Cloud.
 * </p>
 * <p>
 * As a subscriber, you can view and access the data sets that you have an entitlement to through a subscription. You
 * can use the APIS to download or copy your entitled data sets to Amazon S3 for use across a variety of AWS analytics
 * and machine learning services.
 * </p>
 * <p>
 * As a provider, you can create and manage your data sets that you would like to publish to a product. Being able to
 * package and provide your data sets into products requires a few steps to determine eligibility. For more information,
 * visit the AWS Data Exchange User Guide.
 * </p>
 * <p>
 * A data set is a collection of data that can be changed or updated over time. Data sets can be updated using
 * revisions, which represent a new version or incremental change to a data set. A revision contains one or more assets.
 * An asset in AWS Data Exchange is a piece of data that can be stored as an Amazon S3 object. The asset can be a
 * structured data file, an image file, or some other data file. Jobs are asynchronous import or export operations used
 * to create or copy assets.
 * </p>
 */
package com.amazonaws.services.dataexchange;

