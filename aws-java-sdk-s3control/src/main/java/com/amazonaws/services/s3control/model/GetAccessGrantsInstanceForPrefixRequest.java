/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceForPrefix"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessGrantsInstanceForPrefixRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The S3 prefix of the access grants that you would like to retrieve.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that is making this request.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceForPrefixRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The S3 prefix of the access grants that you would like to retrieve.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 prefix of the access grants that you would like to retrieve.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The S3 prefix of the access grants that you would like to retrieve.
     * </p>
     * 
     * @return The S3 prefix of the access grants that you would like to retrieve.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The S3 prefix of the access grants that you would like to retrieve.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 prefix of the access grants that you would like to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceForPrefixRequest withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessGrantsInstanceForPrefixRequest == false)
            return false;
        GetAccessGrantsInstanceForPrefixRequest other = (GetAccessGrantsInstanceForPrefixRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessGrantsInstanceForPrefixRequest clone() {
        return (GetAccessGrantsInstanceForPrefixRequest) super.clone();
    }

}
