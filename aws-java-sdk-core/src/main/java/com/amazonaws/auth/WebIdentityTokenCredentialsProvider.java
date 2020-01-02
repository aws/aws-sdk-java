/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.auth.profile.internal.securitytoken.RoleInfo;
import com.amazonaws.auth.profile.internal.securitytoken.STSProfileCredentialsServiceLoader;

import static com.amazonaws.SDKGlobalConfiguration.AWS_ROLE_ARN_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_ROLE_SESSION_NAME_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_WEB_IDENTITY_ENV_VAR;

public class WebIdentityTokenCredentialsProvider implements AWSCredentialsProvider {

    private final AWSCredentialsProvider credentialsProvider;
    private final RuntimeException loadException;

    private WebIdentityTokenCredentialsProvider(BuilderImpl builder) {
        AWSCredentialsProvider credentialsProvider = null;
        RuntimeException loadException = null;

        try {
            String webIdentityTokenFile =
                builder.webIdentityTokenFile != null ? builder.webIdentityTokenFile
                                                     : System.getenv(AWS_WEB_IDENTITY_ENV_VAR);

            String roleArn = builder.roleArn != null ? builder.roleArn
                                                     : System.getenv(AWS_ROLE_ARN_ENV_VAR);

            String roleSessionName =
                builder.roleSessionName != null ? builder.roleSessionName
                                                : System.getenv(AWS_ROLE_SESSION_NAME_ENV_VAR);

            if (roleSessionName == null) {
                roleSessionName = "aws-sdk-java-" + System.currentTimeMillis();
            }

            RoleInfo roleInfo = new RoleInfo()
                    .withRoleArn(roleArn)
                    .withRoleSessionName(roleSessionName)
                    .withWebIdentityTokenFilePath(webIdentityTokenFile);

            credentialsProvider = STSProfileCredentialsServiceLoader.getInstance().getAssumeRoleCredentialsProvider(roleInfo);
        } catch (RuntimeException e) {
            // If we couldn't load the credentials provider for some reason, save an exception describing why. This exception
            // will only be raised on calls to getCredentials. We don't want to raise an exception here because it may be
            // expected (eg. in the default credential chain).
            loadException = e;
        }

        this.loadException = loadException;
        this.credentialsProvider = credentialsProvider;
    }

    @Override
    public AWSCredentials getCredentials() {
        if (loadException != null) {
            throw loadException;
        }

        return credentialsProvider.getCredentials();
    }

    @Override
    public void refresh() {

    }

    public static WebIdentityTokenCredentialsProvider create() {
        return builder().build();
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    /**
     * A builder for creating a custom {@link WebIdentityTokenCredentialsProvider}.
     */
    public interface Builder {

        /**
         * Define the role arn that should be used by this credentials provider.
         */
        Builder roleArn(String roleArn);

        /**
         * Define the role session name that should be used by this credentials provider.
         */
        Builder roleSessionName(String roleSessionName);

        /**
         * Define the absolute path to the web identity token file that should be used by this credentials provider.
         */
        Builder webIdentityTokenFile(String webIdentityTokenFile);

        /**
         * Create a {@link WebIdentityTokenCredentialsProvider} using the configuration applied to this builder.
         */
        WebIdentityTokenCredentialsProvider build();
    }

    static final class BuilderImpl implements Builder {
        private String roleArn;
        private String roleSessionName;
        private String webIdentityTokenFile;

        BuilderImpl() {
        }

        @Override
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public void setRoleArn(String roleArn) {
            roleArn(roleArn);
        }

        @Override
        public Builder roleSessionName(String roleSessionName) {
            this.roleSessionName = roleSessionName;
            return this;
        }

        public void setRoleSessionName(String roleSessionName) {
            roleSessionName(roleSessionName);
        }

        @Override
        public Builder webIdentityTokenFile(String webIdentityTokenFile) {
            this.webIdentityTokenFile = webIdentityTokenFile;
            return this;
        }

        public void setWebIdentityTokenFile(String webIdentityTokenFile) {
            webIdentityTokenFile(webIdentityTokenFile);
        }

        @Override
        public WebIdentityTokenCredentialsProvider build() {
            return new WebIdentityTokenCredentialsProvider(this);
        }
    }
}
