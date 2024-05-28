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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessGrantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     */
    private String accessGrantId;

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

    public GetAccessGrantRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     * 
     * @param accessGrantId
     *        The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     */

    public void setAccessGrantId(String accessGrantId) {
        this.accessGrantId = accessGrantId;
    }

    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     * 
     * @return The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     */

    public String getAccessGrantId() {
        return this.accessGrantId;
    }

    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     * 
     * @param accessGrantId
     *        The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantRequest withAccessGrantId(String accessGrantId) {
        setAccessGrantId(accessGrantId);
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
        if (getAccessGrantId() != null)
            sb.append("AccessGrantId: ").append(getAccessGrantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessGrantRequest == false)
            return false;
        GetAccessGrantRequest other = (GetAccessGrantRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAccessGrantId() == null ^ this.getAccessGrantId() == null)
            return false;
        if (other.getAccessGrantId() != null && other.getAccessGrantId().equals(this.getAccessGrantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantId() == null) ? 0 : getAccessGrantId().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessGrantRequest clone() {
        return (GetAccessGrantRequest) super.clone();
    }

}
