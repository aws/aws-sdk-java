/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain ID.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The retention policy for this domain, which specifies which resources will be retained after the Domain is
     * deleted. By default, all resources are retained (not automatically deleted).
     * </p>
     */
    private RetentionPolicy retentionPolicy;

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @return The domain ID.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The retention policy for this domain, which specifies which resources will be retained after the Domain is
     * deleted. By default, all resources are retained (not automatically deleted).
     * </p>
     * 
     * @param retentionPolicy
     *        The retention policy for this domain, which specifies which resources will be retained after the Domain is
     *        deleted. By default, all resources are retained (not automatically deleted).
     */

    public void setRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    /**
     * <p>
     * The retention policy for this domain, which specifies which resources will be retained after the Domain is
     * deleted. By default, all resources are retained (not automatically deleted).
     * </p>
     * 
     * @return The retention policy for this domain, which specifies which resources will be retained after the Domain
     *         is deleted. By default, all resources are retained (not automatically deleted).
     */

    public RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * <p>
     * The retention policy for this domain, which specifies which resources will be retained after the Domain is
     * deleted. By default, all resources are retained (not automatically deleted).
     * </p>
     * 
     * @param retentionPolicy
     *        The retention policy for this domain, which specifies which resources will be retained after the Domain is
     *        deleted. By default, all resources are retained (not automatically deleted).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainRequest withRetentionPolicy(RetentionPolicy retentionPolicy) {
        setRetentionPolicy(retentionPolicy);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getRetentionPolicy() != null)
            sb.append("RetentionPolicy: ").append(getRetentionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDomainRequest == false)
            return false;
        DeleteDomainRequest other = (DeleteDomainRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getRetentionPolicy() == null ^ this.getRetentionPolicy() == null)
            return false;
        if (other.getRetentionPolicy() != null && other.getRetentionPolicy().equals(this.getRetentionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getRetentionPolicy() == null) ? 0 : getRetentionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDomainRequest clone() {
        return (DeleteDomainRequest) super.clone();
    }

}
