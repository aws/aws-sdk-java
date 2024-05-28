/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Signer is a fully managed code-signing service to help you ensure the trust and integrity of your code.
 * </p>
 * <p>
 * Signer supports the following applications:
 * </p>
 * <p>
 * With code signing for AWS Lambda, you can sign <a href="http://docs.aws.amazon.com/lambda/latest/dg/">AWS Lambda</a>
 * deployment packages. Integrated support is provided for <a
 * href="http://docs.aws.amazon.com/AmazonS3/latest/gsg/">Amazon S3</a>, <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/">Amazon CloudWatch</a>, and <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS CloudTrail</a>. In order to sign code, you
 * create a signing profile and then use Signer to sign Lambda zip files in S3.
 * </p>
 * <p>
 * With code signing for IoT, you can sign code for any IoT device that is supported by AWS. IoT code signing is
 * available for <a href="http://docs.aws.amazon.com/freertos/latest/userguide/">Amazon FreeRTOS</a> and <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/">AWS IoT Device Management</a>, and is integrated with <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager (ACM)</a>. In order to sign code, you
 * Project</a>, you can sign container images stored in a container registry such as Amazon Elastic Container Registry
 * (ECR). The signatures are stored in the registry alongside the images, where they are available for verifying image
 * authenticity and integrity.
 * </p>
 * <p>
 * For more information about Signer, see the <a
 * href="https://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">AWS Signer Developer Guide</a>.
 * </p>
 */
package com.amazonaws.services.signer;

