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

package com.amazonaws.auth.profile.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.ProcessCredentialsProvider;

/**
 * A profile-based wrapper around {@link ProcessCredentialsProvider}, implementing the credential_process profile setting.
 */
public class ProfileProcessCredentialsProvider implements AWSCredentialsProvider {
    private final ProcessCredentialsProvider delegate;

    public ProfileProcessCredentialsProvider(BasicProfile profile) {
        this.delegate = ProcessCredentialsProvider.builder()
                                                  .withCommand(profile.getCredentialProcess())
                                                  .build();
    }

    @Override
    public AWSCredentials getCredentials() {
        return delegate.getCredentials();
    }

    @Override
    public void refresh() {
        delegate.refresh();
    }
}
