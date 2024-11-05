/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.arn.Arn;
import com.amazonaws.services.securitytoken.model.AssumedRoleUser;

@SdkInternalApi
public class StsAuthUtils {
    private StsAuthUtils() {

    }

    public static String accountIdFromArn(AssumedRoleUser assumedRoleUser) throws IllegalArgumentException {
        if (assumedRoleUser == null || assumedRoleUser.getArn() == null || assumedRoleUser.getArn() == "") {
            return null;
        }

        return Arn.fromString(assumedRoleUser.getArn())
                .getAccountId();
    }
}
