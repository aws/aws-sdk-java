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

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.internal.auth.SignerProvider;
import com.amazonaws.internal.auth.SignerProviderContext;

/**
 * Implementation of {@link SignerProvider} that always returns the same signer regardless of
 * context.
 */
@SdkProtectedApi
public class StaticSignerProvider extends SignerProvider {

    private final Signer signer;

    public StaticSignerProvider(Signer signer) {
        this.signer = signer;
    }

    @Override
    public Signer getSigner(SignerProviderContext context) {
        return signer;
    }
}
