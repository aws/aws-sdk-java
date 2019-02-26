/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.internal.SdkPredicate;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Predicate to determine when it is sufficient to do an async refresh of session credentials and
 * return existing credentials to the caller. This is done within a comfortable margin of session
 * expiration so we can optimistically fetch new credentials from STS and never have to block the
 * caller.
 */
@SdkInternalApi
@ThreadSafe
class ShouldDoAsyncSessionRefresh extends SdkPredicate<SessionCredentialsHolder> {

    /**
     * Time before expiry within which session credentials will be asynchronously refreshed.
     */
    private static final long ASYNC_REFRESH_EXPIRATION_IN_MILLIS = TimeUnit.MINUTES.toMillis(5);

    @Override
    public boolean test(SessionCredentialsHolder sessionCredentialsHolder) {
        Date expiryTime = sessionCredentialsHolder.getSessionCredentialsExpiration();
        if (expiryTime != null) {
            long timeRemaining = expiryTime.getTime() - System.currentTimeMillis();
            return timeRemaining < ASYNC_REFRESH_EXPIRATION_IN_MILLIS;
        }
        return false;
    }
}
