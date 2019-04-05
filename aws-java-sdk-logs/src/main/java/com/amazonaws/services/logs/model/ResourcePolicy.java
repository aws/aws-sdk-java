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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A policy enabling one or more entities to put logs to a log group in this account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The details of the policy.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     */
    private Long lastUpdatedTime;

    /**
     * <p>
     * The name of the resource policy.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the resource policy.
     * </p>
     * 
     * @return The name of the resource policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the resource policy.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The details of the policy.
     * </p>
     * 
     * @param policyDocument
     *        The details of the policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The details of the policy.
     * </p>
     * 
     * @return The details of the policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The details of the policy.
     * </p>
     * 
     * @param policyDocument
     *        The details of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1,
     *        1970 00:00:00 UTC.
     */

    public void setLastUpdatedTime(Long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     * 
     * @return Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1,
     *         1970 00:00:00 UTC.
     */

    public Long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1,
     *        1970 00:00:00 UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withLastUpdatedTime(Long lastUpdatedTime) {
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
        com.amazonaws.services.logs.model.transform.ResourcePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
