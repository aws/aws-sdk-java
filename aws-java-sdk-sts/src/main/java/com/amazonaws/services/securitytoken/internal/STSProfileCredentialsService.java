/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken.internal;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.amazonaws.auth.profile.internal.securitytoken.ProfileCredentialsService;
import com.amazonaws.auth.profile.internal.securitytoken.RoleInfo;

/**
 * Loaded via reflection by the aws-java-sdk-core module when role assumption is configured in a
 * credentials profile.
 */
public class STSProfileCredentialsService implements ProfileCredentialsService {
    @Override
    public AWSCredentialsProvider getAssumeRoleCredentialsProvider(RoleInfo targetRoleInfo) {
        return new STSAssumeRoleSessionCredentialsProvider.Builder(targetRoleInfo.getRoleArn(), targetRoleInfo.getRoleSessionName())
                .withLongLivedCredentialsProvider(targetRoleInfo.getLongLivedCredentialsProvider())
                .withExternalId(targetRoleInfo.getExternalId())
                .build();
    }
}
