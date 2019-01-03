/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPublicAccessBlockRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Public Access Block configuration that you want to apply to this Amazon Web Services account.
     * </p>
     */
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;
    /**
     * <p>
     * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to set.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The Public Access Block configuration that you want to apply to this Amazon Web Services account.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        The Public Access Block configuration that you want to apply to this Amazon Web Services account.
     */

    public void setPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * The Public Access Block configuration that you want to apply to this Amazon Web Services account.
     * </p>
     * 
     * @return The Public Access Block configuration that you want to apply to this Amazon Web Services account.
     */

    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * The Public Access Block configuration that you want to apply to this Amazon Web Services account.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        The Public Access Block configuration that you want to apply to this Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPublicAccessBlockRequest withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
        return this;
    }

    /**
     * <p>
     * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to set.
     * </p>
     * 
     * @param accountId
     *        The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to
     *        set.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to set.
     * </p>
     * 
     * @return The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to
     *         set.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to set.
     * </p>
     * 
     * @param accountId
     *        The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPublicAccessBlockRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPublicAccessBlockRequest == false)
            return false;
        PutPublicAccessBlockRequest other = (PutPublicAccessBlockRequest) obj;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null)
            return false;
        if (other.getPublicAccessBlockConfiguration() != null
                && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public PutPublicAccessBlockRequest clone() {
        return (PutPublicAccessBlockRequest) super.clone();
    }

}
