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
 * <fullname>AWS Security Token Service</fullname>
 * <p>
 * The AWS Security Token Service (STS) is a web service that enables you to request temporary, limited-privilege
 * credentials for AWS Identity and Access Management (IAM) users or for users that you authenticate (federated users).
 * This guide provides descriptions of the STS API. For more detailed information about using this service, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>.
 * </p>
 * <p>
 * For information about setting up signatures and authorization through the API, go to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a> in
 * the <i>AWS General Reference</i>. For general information about the Query API, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in <i>Using
 * IAM</i>. For information about using security tokens with other AWS products, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS Services
 * That Work with IAM</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/">http://aws.amazon.com/documentation/</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * By default, AWS Security Token Service (STS) is available as a global service, and all AWS STS requests go to a
 * single endpoint at <code>https://sts.amazonaws.com</code>. Global requests map to the US East (N. Virginia) region.
 * AWS recommends using Regional AWS STS endpoints instead of the global endpoint to reduce latency, build in
 * redundancy, and increase session token validity. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Managing AWS STS in
 * an AWS Region</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * Most AWS Regions are enabled for operations in all AWS services by default. Those Regions are automatically activated
 * for use with AWS STS. Some Regions, such as Asia Pacific (Hong Kong), must be manually enabled. To learn more about
 * enabling and disabling AWS Regions, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>AWS General
 * Reference</i>. When you enable these AWS Regions, they are automatically activated for use with AWS STS. You cannot
 * activate the STS endpoint for a Region that is disabled. Tokens that are valid in all AWS Regions are longer than
 * tokens that are valid in Regions that are enabled by default. Changing this setting might affect existing systems
 * where you temporarily store tokens. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html#sts-regions-manage-tokens"
 * >Managing Global Endpoint Session Tokens</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * After you activate a Region for use with AWS STS, you can direct AWS STS API calls to that Region. AWS STS recommends
 * that you provide both the Region and endpoint when you make calls to a Regional endpoint. You can provide the Region
 * alone for manually enabled Regions, such as Asia Pacific (Hong Kong). In this case, the calls are directed to the STS
 * Regional endpoint. However, if you provide the Region alone for Regions enabled by default, the calls are directed to
 * the global endpoint of <code>https://sts.amazonaws.com</code>.
 * </p>
 * <p>
 * To view the list of AWS STS endpoints and whether they are active by default, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html#id_credentials_temp_enable-regions_writing_code"
 * >Writing Code to Use AWS STS Regions</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls for your AWS account and delivers log files to
 * an Amazon S3 bucket. By using information collected by CloudTrail, you can determine what requests were successfully
 * made to STS, who made the request, when it was made, and so on.
 * </p>
 * <p>
 * If you activate AWS STS endpoints in Regions other than the default global endpoint, then you must also turn on
 * CloudTrail logging in those Regions. This is necessary to record any AWS STS API calls that are made in those
 * Regions. For more information, see <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/aggregating_logs_regions_turn_on_ct.html">Turning On
 * CloudTrail in Additional Regions</a> in the <i>AWS CloudTrail User Guide</i>.
 * </p>
 * <p>
 * AWS Security Token Service (STS) is a global service with a single endpoint at <code>https://sts.amazonaws.com</code>
 * . Calls to this endpoint are logged as calls to a global service. However, because this endpoint is physically
 * located in the US East (N. Virginia) Region, your logs list <code>us-east-1</code> as the event Region. CloudTrail
 * does not write these logs to the US East (Ohio) Region unless you choose to include global service logs in that
 * Region. CloudTrail writes calls to all Regional endpoints to their respective Regions. For example, calls to
 * sts.us-east-2.amazonaws.com are published to the US East (Ohio) Region and calls to sts.eu-central-1.amazonaws.com
 * are published to the EU (Frankfurt) Region.
 * </p>
 * <p>
 * To learn more about CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
package com.amazonaws.services.securitytoken;

