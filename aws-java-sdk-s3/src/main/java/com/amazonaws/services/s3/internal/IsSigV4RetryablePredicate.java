/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import java.util.Arrays;
import java.util.List;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.internal.SdkPredicate;

public class IsSigV4RetryablePredicate extends SdkPredicate<AmazonServiceException> {

    private static final List<String> AUTH_ERROR_CODES = Arrays.asList("InvalidRequest", "InvalidArgument");

    private static final List<String> AUTH_ERROR_MESSAGES = Arrays.asList("Please use AWS4-HMAC-SHA256.",
            "AWS KMS managed keys require AWS Signature Version 4.");

    /**
     * @return True to retry with SigV4, false to not retry
     */
    @Override
    public boolean test(AmazonServiceException ase) {
        if (ase == null || ase.getErrorMessage() == null) {
            return false;
        }
        if (AUTH_ERROR_CODES.contains(ase.getErrorCode())) {
            for (String possibleErrorMessage : AUTH_ERROR_MESSAGES) {
                if (ase.getErrorMessage().contains(possibleErrorMessage)) {
                    return true;
                }
            }
        }
        return false;
    }
}
