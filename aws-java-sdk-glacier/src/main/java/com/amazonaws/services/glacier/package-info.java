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

/**
 * <p>
 * Amazon Glacier is a storage solution for "cold data."
 * </p>
 * <p>
 * Amazon Glacier is an extremely low-cost storage service that provides secure, durable, and easy-to-use storage for
 * data backup and archival. With Amazon Glacier, customers can store their data cost effectively for months, years, or
 * decades. Amazon Glacier also enables customers to offload the administrative burdens of operating and scaling storage
 * to AWS, so they don't have to worry about capacity planning, hardware provisioning, data replication, hardware
 * failure and recovery, or time-consuming hardware migrations.
 * </p>
 * <p>
 * Amazon Glacier is a great storage choice when low storage cost is paramount and your data is rarely retrieved. If
 * your application requires fast or frequent access to your data, consider using Amazon S3. For more information, see
 * <a href="http://aws.amazon.com/s3/">Amazon Simple Storage Service (Amazon S3)</a>.
 * </p>
 * <p>
 * You can store any kind of data in any format. There is no maximum limit on the total amount of data you can store in
 * Amazon Glacier.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Glacier, we recommend that you begin by reading the following sections in the
 * <i>Amazon Glacier Developer Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/introduction.html">What is Amazon Glacier</a> - This
 * section of the Developer Guide describes the underlying data model, the operations it supports, and the AWS SDKs that
 * you can use to interact with the service.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/amazon-glacier-getting-started.html">Getting Started
 * with Amazon Glacier</a> - The Getting Started section walks you through the process of creating a vault, uploading
 * archives, creating jobs to download archives, retrieving the job output, and deleting archives.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.glacier;

