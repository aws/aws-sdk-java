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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccessGrantsLocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ID of the registered location that you are deregistering from your S3 Access Grants instance. S3 Access
     * Grants assigned this ID when you registered the location. S3 Access Grants assigns the ID <code>default</code> to
     * the default location <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     */
    private String accessGrantsLocationId;

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

    public DeleteAccessGrantsLocationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID of the registered location that you are deregistering from your S3 Access Grants instance. S3 Access
     * Grants assigned this ID when you registered the location. S3 Access Grants assigns the ID <code>default</code> to
     * the default location <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location that you are deregistering from your S3 Access Grants instance. S3
     *        Access Grants assigned this ID when you registered the location. S3 Access Grants assigns the ID
     *        <code>default</code> to the default location <code>s3://</code> and assigns an auto-generated ID to other
     *        locations that you register.
     */

    public void setAccessGrantsLocationId(String accessGrantsLocationId) {
        this.accessGrantsLocationId = accessGrantsLocationId;
    }

    /**
     * <p>
     * The ID of the registered location that you are deregistering from your S3 Access Grants instance. S3 Access
     * Grants assigned this ID when you registered the location. S3 Access Grants assigns the ID <code>default</code> to
     * the default location <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @return The ID of the registered location that you are deregistering from your S3 Access Grants instance. S3
     *         Access Grants assigned this ID when you registered the location. S3 Access Grants assigns the ID
     *         <code>default</code> to the default location <code>s3://</code> and assigns an auto-generated ID to other
     *         locations that you register.
     */

    public String getAccessGrantsLocationId() {
        return this.accessGrantsLocationId;
    }

    /**
     * <p>
     * The ID of the registered location that you are deregistering from your S3 Access Grants instance. S3 Access
     * Grants assigned this ID when you registered the location. S3 Access Grants assigns the ID <code>default</code> to
     * the default location <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location that you are deregistering from your S3 Access Grants instance. S3
     *        Access Grants assigned this ID when you registered the location. S3 Access Grants assigns the ID
     *        <code>default</code> to the default location <code>s3://</code> and assigns an auto-generated ID to other
     *        locations that you register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccessGrantsLocationRequest withAccessGrantsLocationId(String accessGrantsLocationId) {
        setAccessGrantsLocationId(accessGrantsLocationId);
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
        if (getAccessGrantsLocationId() != null)
            sb.append("AccessGrantsLocationId: ").append(getAccessGrantsLocationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccessGrantsLocationRequest == false)
            return false;
        DeleteAccessGrantsLocationRequest other = (DeleteAccessGrantsLocationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAccessGrantsLocationId() == null ^ this.getAccessGrantsLocationId() == null)
            return false;
        if (other.getAccessGrantsLocationId() != null && other.getAccessGrantsLocationId().equals(this.getAccessGrantsLocationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationId() == null) ? 0 : getAccessGrantsLocationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccessGrantsLocationRequest clone() {
        return (DeleteAccessGrantsLocationRequest) super.clone();
    }

}
