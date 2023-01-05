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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource policy grants one or more Amazon Web Services services and accounts permissions to access X-Ray. Each
 * resource policy is associated with a specific Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * Returns the current policy revision id for this policy name.
     * </p>
     */
    private String policyRevisionId;
    /**
     * <p>
     * When the policy was last updated, in Unix time seconds.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     * 
     * @return The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     * 
     * @param policyDocument
     *        The resource policy document, which can be up to 5kb in size.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     * 
     * @return The resource policy document, which can be up to 5kb in size.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     * 
     * @param policyDocument
     *        The resource policy document, which can be up to 5kb in size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Returns the current policy revision id for this policy name.
     * </p>
     * 
     * @param policyRevisionId
     *        Returns the current policy revision id for this policy name.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * Returns the current policy revision id for this policy name.
     * </p>
     * 
     * @return Returns the current policy revision id for this policy name.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * Returns the current policy revision id for this policy name.
     * </p>
     * 
     * @param policyRevisionId
     *        Returns the current policy revision id for this policy name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
        return this;
    }

    /**
     * <p>
     * When the policy was last updated, in Unix time seconds.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the policy was last updated, in Unix time seconds.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * When the policy was last updated, in Unix time seconds.
     * </p>
     * 
     * @return When the policy was last updated, in Unix time seconds.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * When the policy was last updated, in Unix time seconds.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the policy was last updated, in Unix time seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePolicy == false)
            return false;
        ResourcePolicy other = (ResourcePolicy) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePolicy clone() {
        try {
            return (ResourcePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ResourcePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
