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
 * AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an
 * <i>organization</i> and centrally manage your accounts and their resources.
 * </p>
 * <p>
 * This guide provides descriptions of the Organizations operations. For more information about using this service, see
 * the <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">AWS Organizations User
 * Guide</a>.
 * </p>
 * <p>
 * <b>Support and feedback for AWS Organizations</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:feedback-awsorganizations@amazon.com">feedback-awsorganizations@amazon.com</a> or post your feedback and
 * questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=219">AWS Organizations support forum</a>.
 * For more information about the AWS support forums, see <a href="http://forums.aws.amazon.com/help.jspa">Forums
 * Help</a>.
 * </p>
 * <p>
 * <b>Endpoint to call When using the AWS CLI or the AWS SDK</b>
 * </p>
 * <p>
 * For the current release of Organizations, specify the <code>us-east-1</code> region for all AWS API and AWS CLI calls
 * made from the commercial AWS Regions outside of China. If calling from one of the AWS Regions in China, then specify
 * <code>cn-northwest-1</code>. You can do this in the AWS CLI by using these parameters and commands:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the following parameter with each command to specify both the endpoint and its region:
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.us-east-1.amazonaws.com</code> <i>(from commercial AWS Regions outside of
 * China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.cn-northwest-1.amazonaws.com.cn</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the default endpoint, but configure your default region with this command:
 * </p>
 * <p>
 * <code>aws configure set default.region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>aws configure set default.region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the following parameter with each command to specify the endpoint:
 * </p>
 * <p>
 * <code>--region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Organizations supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by AWS CloudTrail, you can determine which requests the
 * Organizations service received, who made the request and when, and so on. For more about AWS Organizations and its
 * support for AWS CloudTrail, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_incident-response.html#orgs_cloudtrail-integration"
 * >Logging AWS Organizations Events with AWS CloudTrail</a> in the <i>AWS Organizations User Guide</i>. To learn more
 * about AWS CloudTrail, including how to turn it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
package com.amazonaws.services.organizations;

