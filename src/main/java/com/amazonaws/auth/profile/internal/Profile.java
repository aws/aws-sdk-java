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
package com.amazonaws.auth.profile.internal;

import com.amazonaws.auth.AWSCredentials;

/**
 * Contains the information stored in an AWS profile, such as AWS security
 * credentials.
 */
public class Profile {

    /** Holds the AWS Credentials for the profile. */
    private final AWSCredentials awsCredentials;

    public Profile(AWSCredentials awsCredentials) {
        this.awsCredentials = awsCredentials;
    }

    public AWSCredentials getCredentials() {
        return awsCredentials;
    }
}
