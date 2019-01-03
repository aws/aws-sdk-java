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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     */
    private String policyInJson;
    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     */
    private String policyHash;
    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     * 
     * @param policyInJson
     *        Contains the requested policy document, in JSON format.
     */

    public void setPolicyInJson(String policyInJson) {
        this.policyInJson = policyInJson;
    }

    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     * 
     * @return Contains the requested policy document, in JSON format.
     */

    public String getPolicyInJson() {
        return this.policyInJson;
    }

    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     * 
     * @param policyInJson
     *        Contains the requested policy document, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePolicyResult withPolicyInJson(String policyInJson) {
        setPolicyInJson(policyInJson);
        return this;
    }

    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     * 
     * @param policyHash
     *        Contains the hash value associated with this policy.
     */

    public void setPolicyHash(String policyHash) {
        this.policyHash = policyHash;
    }

    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     * 
     * @return Contains the hash value associated with this policy.
     */

    public String getPolicyHash() {
        return this.policyHash;
    }

    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     * 
     * @param policyHash
     *        Contains the hash value associated with this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePolicyResult withPolicyHash(String policyHash) {
        setPolicyHash(policyHash);
        return this;
    }

    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     * 
     * @param createTime
     *        The date and time at which the policy was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     * 
     * @return The date and time at which the policy was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     * 
     * @param createTime
     *        The date and time at which the policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePolicyResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     * 
     * @param updateTime
     *        The date and time at which the policy was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     * 
     * @return The date and time at which the policy was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     * 
     * @param updateTime
     *        The date and time at which the policy was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePolicyResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getPolicyInJson() != null)
            sb.append("PolicyInJson: ").append(getPolicyInJson()).append(",");
        if (getPolicyHash() != null)
            sb.append("PolicyHash: ").append(getPolicyHash()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcePolicyResult == false)
            return false;
        GetResourcePolicyResult other = (GetResourcePolicyResult) obj;
        if (other.getPolicyInJson() == null ^ this.getPolicyInJson() == null)
            return false;
        if (other.getPolicyInJson() != null && other.getPolicyInJson().equals(this.getPolicyInJson()) == false)
            return false;
        if (other.getPolicyHash() == null ^ this.getPolicyHash() == null)
            return false;
        if (other.getPolicyHash() != null && other.getPolicyHash().equals(this.getPolicyHash()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyInJson() == null) ? 0 : getPolicyInJson().hashCode());
        hashCode = prime * hashCode + ((getPolicyHash() == null) ? 0 : getPolicyHash().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePolicyResult clone() {
        try {
            return (GetResourcePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
