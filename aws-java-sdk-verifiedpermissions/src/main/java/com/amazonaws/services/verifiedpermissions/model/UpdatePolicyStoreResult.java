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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyStore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicyStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the updated policy store.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the updated policy store.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time that the policy store was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The ID of the updated policy store.
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the updated policy store.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * The ID of the updated policy store.
     * </p>
     * 
     * @return The ID of the updated policy store.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * The ID of the updated policy store.
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the updated policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyStoreResult withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the updated policy store.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the updated policy store.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the updated policy store.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of the updated policy store.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the updated policy store.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the updated policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyStoreResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the policy store was originally created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     * 
     * @return The date and time that the policy store was originally created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time that the policy store was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the policy store was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyStoreResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the policy store was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the policy store was most recently updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the policy store was most recently updated.
     * </p>
     * 
     * @return The date and time that the policy store was most recently updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the policy store was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the policy store was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyStoreResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicyStoreResult == false)
            return false;
        UpdatePolicyStoreResult other = (UpdatePolicyStoreResult) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicyStoreResult clone() {
        try {
            return (UpdatePolicyStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
