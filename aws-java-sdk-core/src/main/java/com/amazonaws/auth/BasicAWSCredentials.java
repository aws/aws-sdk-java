/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Basic implementation of the AWSCredentials interface that allows callers to
 * pass in the AWS access key and secret access in the constructor.
 */
public class BasicAWSCredentials implements AWSCredentials,
        AccountIdAware, ProviderNameAware {

    private final String accessKey;
    private final String secretKey;
    private final String accountId;
    private final String providerName;

    /**
     * Constructs a new BasicAWSCredentials object, with the specified AWS
     * access key and AWS secret key.
     *
     * @param accessKey
     *            The AWS access key.
     * @param secretKey
     *            The AWS secret access key.
     */
    public BasicAWSCredentials(String accessKey, String secretKey) {
        this(accessKey, secretKey, null, null);
    }

    /**
     * Constructs a new BasicAWSCredentials object, with the specified AWS
     * access key and AWS secret key.
     *
     * @param accessKey
     *            The AWS access key.
     * @param secretKey
     *            The AWS secret access key.
     * @param accountId
     *            The AWS account id associated with the credentials.
     */
    public BasicAWSCredentials(String accessKey, String secretKey, String accountId) {
        this(accessKey, secretKey, accountId, null);
    }

    /**
     * Constructs a new BasicAWSCredentials object, with the specified AWS
     * access key and AWS secret key.
     *
     * @param accessKey
     *            The AWS access key.
     * @param secretKey
     *            The AWS secret access key.
     * @param accountId
     *            The AWS account id associated with the credentials.
     * @param providerName
     *            The name of the source that resolved these credentials.
     */
    public BasicAWSCredentials(String accessKey, String secretKey, String accountId, String providerName) {
        if (accessKey == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (secretKey == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }

        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.accountId = accountId;
        this.providerName = providerName;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.auth.AWSCredentials#getAWSAccessKeyId()
     */
    public String getAWSAccessKeyId() {
        return accessKey;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.auth.AWSCredentials#getAWSSecretKey()
     */
    public String getAWSSecretKey() {
        return secretKey;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.auth.AccountIdAware#getAccountId()
     */
    public String getAccountId() {
        return accountId;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.auth.ProviderNameAware#getProviderName()
     */
    public String getProviderName() {
        return providerName;
    }
}
