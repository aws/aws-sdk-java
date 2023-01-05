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
 * Amazon Web Services Resource Explorer is a resource search and discovery service. By using Resource Explorer, you can
 * explore your resources using an internet search engine-like experience. Examples of resources include Amazon
 * Relational Database Service (Amazon RDS) instances, Amazon Simple Storage Service (Amazon S3) buckets, or Amazon
 * DynamoDB tables. You can search for your resources using resource metadata like names, tags, and IDs. Resource
 * Explorer can search across all of the Amazon Web Services Regions in your account in which you turn the service on,
 * to simplify your cross-Region workloads.
 * </p>
 * <p>
 * Resource Explorer scans the resources in each of the Amazon Web Services Regions in your Amazon Web Services account
 * in which you turn on Resource Explorer. Resource Explorer <a href=
 * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/getting-started-terms-and-concepts.html#term-index"
 * >creates and maintains an index</a> in each Region, with the details of that Region's resources.
 * </p>
 * <p>
 * You can <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">search
 * across all of the indexed Regions in your account</a> by designating one of your Amazon Web Services Regions to
 * contain the aggregator index for the account. When you <a
 * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region-turn-on.html">promote a
 * local index in a Region to become the aggregator index for the account</a>, Resource Explorer automatically
 * replicates the index information from all local indexes in the other Regions to the aggregator index. Therefore, the
 * Region with the aggregator index has a copy of all resource information for all Regions in the account where you
 * turned on Resource Explorer. As a result, views in the aggregator index Region include resources from all of the
 * indexed Regions in your account.
 * </p>
 * <p>
 * For more information about Amazon Web Services Resource Explorer, including how to enable and configure the service,
 * see the <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/">Amazon Web Services Resource
 * Explorer User Guide</a>.
 * </p>
 */
package com.amazonaws.services.resourceexplorer2;

