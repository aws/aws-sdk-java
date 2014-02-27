/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

/**
 * AWS configuration profiles allow you to share multiple sets of AWS
 * security credentials between different tools such as the AWS SDK for Java
 * and the AWS CLI.
 * <p>
 * In addition to the required <code>default</code> profile, you can specify as
 * many additional named profiles as you need:
 * <pre>
 * [default]
 * aws_access_key_id=AKIAXXXXXXXXXX
 * aws_secret_access_key=abc01234567890
 *
 * [profile test]
 * aws_access_key_id=AKIAZZZZZZZZZZ
 * aws_secret_access_key=xyz01234567890
 * </pre>
 *
 * <p>
 * You can use {@link com.amazonaws.auth.profile.ProfileCredentialsProvider} to
 * access your AWS configuration profiles and supply your credentials to code
 * using the AWS SDK for Java.
 *
 * <p>
 * The same profiles are used by the AWS CLI.
 *
 * <p>
 * For more information on setting up AWS configuration profiles, see:
 * http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html
 */
package com.amazonaws.auth.profile;
