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
 * AWS Signer is a fully managed code signing service to help you ensure the trust and integrity of your code.
 * </p>
 * <p>
 * AWS Signer supports the following applications:
 * </p>
 * <p>
 * With <i>code signing for AWS Lambda</i>, you can sign AWS Lambda deployment packages. Integrated support is provided
 * for Amazon S3, Amazon CloudWatch, and AWS CloudTrail. In order to sign code, you create a signing profile and then
 * use Signer to sign Lambda zip files in S3.
 * </p>
 * <p>
 * With <i>code signing for IoT</i>, you can sign code for any IoT device that is supported by AWS. IoT code signing is
 * available for <a href="http://docs.aws.amazon.com/freertos/latest/userguide/">Amazon FreeRTOS</a> and <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/">AWS IoT Device Management</a>, and is integrated with <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager (ACM)</a>. In order to sign code, you
 * import a third-party code signing certificate using ACM, and use that to sign updates in Amazon FreeRTOS and AWS IoT
 * Device Management.
 * </p>
 * <p>
 * For more information about AWS Signer, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">AWS Signer Developer Guide</a>.
 * </p>
 * <p/>
 */
package com.amazonaws.services.signer;

