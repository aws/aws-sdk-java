/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccountSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * OpenSearch Serverless-related settings for the current Amazon Web Services account.
     * </p>
     */
    private AccountSettingsDetail accountSettingsDetail;

    /**
     * <p>
     * OpenSearch Serverless-related settings for the current Amazon Web Services account.
     * </p>
     * 
     * @param accountSettingsDetail
     *        OpenSearch Serverless-related settings for the current Amazon Web Services account.
     */

    public void setAccountSettingsDetail(AccountSettingsDetail accountSettingsDetail) {
        this.accountSettingsDetail = accountSettingsDetail;
    }

    /**
     * <p>
     * OpenSearch Serverless-related settings for the current Amazon Web Services account.
     * </p>
     * 
     * @return OpenSearch Serverless-related settings for the current Amazon Web Services account.
     */

    public AccountSettingsDetail getAccountSettingsDetail() {
        return this.accountSettingsDetail;
    }

    /**
     * <p>
     * OpenSearch Serverless-related settings for the current Amazon Web Services account.
     * </p>
     * 
     * @param accountSettingsDetail
     *        OpenSearch Serverless-related settings for the current Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsResult withAccountSettingsDetail(AccountSettingsDetail accountSettingsDetail) {
        setAccountSettingsDetail(accountSettingsDetail);
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
        if (getAccountSettingsDetail() != null)
            sb.append("AccountSettingsDetail: ").append(getAccountSettingsDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSettingsResult == false)
            return false;
        UpdateAccountSettingsResult other = (UpdateAccountSettingsResult) obj;
        if (other.getAccountSettingsDetail() == null ^ this.getAccountSettingsDetail() == null)
            return false;
        if (other.getAccountSettingsDetail() != null && other.getAccountSettingsDetail().equals(this.getAccountSettingsDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountSettingsDetail() == null) ? 0 : getAccountSettingsDetail().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSettingsResult clone() {
        try {
            return (UpdateAccountSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
