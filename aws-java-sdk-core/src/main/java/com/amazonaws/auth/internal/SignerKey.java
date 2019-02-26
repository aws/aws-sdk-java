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
package com.amazonaws.auth.internal;

import com.amazonaws.annotation.Immutable;

/**
 * Holds the signing key and the number of days since epoch for the date for
 * which the signing key was generated.
 */
@Immutable
public final class SignerKey {

    private final long numberOfDaysSinceEpoch;

    private final byte[] signingKey;

    public SignerKey(long numberOfDaysSinceEpoch, byte[] signingKey) {
        if (numberOfDaysSinceEpoch <= 0L) {
            throw new IllegalArgumentException(
                    "Not able to cache signing key. Signing date to be cached is invalid");
        }
        if (signingKey == null) {
            throw new IllegalArgumentException(
                    "Not able to cache signing key. Signing Key to be cached are null");
        }
        this.numberOfDaysSinceEpoch = numberOfDaysSinceEpoch;
        this.signingKey = signingKey.clone();
    }

    /**
     * Returns the number of days since epoch for the date used for generating
     * signing key.
     */
    public long getNumberOfDaysSinceEpoch() {
        return numberOfDaysSinceEpoch;
    }

    /**
     * Returns a copy of the signing key.
     */
    public byte[] getSigningKey() {
        return signingKey.clone();
    }
}
