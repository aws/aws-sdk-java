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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <a>ListObjectPolicies</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchListObjectPoliciesResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListObjectPoliciesResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     * </p>
     */
    private java.util.List<String> attachedPolicyIds;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     * </p>
     * 
     * @return A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     */

    public java.util.List<String> getAttachedPolicyIds() {
        return attachedPolicyIds;
    }

    /**
     * <p>
     * A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     * </p>
     * 
     * @param attachedPolicyIds
     *        A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     */

    public void setAttachedPolicyIds(java.util.Collection<String> attachedPolicyIds) {
        if (attachedPolicyIds == null) {
            this.attachedPolicyIds = null;
            return;
        }

        this.attachedPolicyIds = new java.util.ArrayList<String>(attachedPolicyIds);
    }

    /**
     * <p>
     * A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedPolicyIds(java.util.Collection)} or {@link #withAttachedPolicyIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param attachedPolicyIds
     *        A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectPoliciesResponse withAttachedPolicyIds(String... attachedPolicyIds) {
        if (this.attachedPolicyIds == null) {
            setAttachedPolicyIds(new java.util.ArrayList<String>(attachedPolicyIds.length));
        }
        for (String ele : attachedPolicyIds) {
            this.attachedPolicyIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     * </p>
     * 
     * @param attachedPolicyIds
     *        A list of policy <code>ObjectIdentifiers</code>, that are attached to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectPoliciesResponse withAttachedPolicyIds(java.util.Collection<String> attachedPolicyIds) {
        setAttachedPolicyIds(attachedPolicyIds);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectPoliciesResponse withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAttachedPolicyIds() != null)
            sb.append("AttachedPolicyIds: ").append(getAttachedPolicyIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchListObjectPoliciesResponse == false)
            return false;
        BatchListObjectPoliciesResponse other = (BatchListObjectPoliciesResponse) obj;
        if (other.getAttachedPolicyIds() == null ^ this.getAttachedPolicyIds() == null)
            return false;
        if (other.getAttachedPolicyIds() != null && other.getAttachedPolicyIds().equals(this.getAttachedPolicyIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachedPolicyIds() == null) ? 0 : getAttachedPolicyIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchListObjectPoliciesResponse clone() {
        try {
            return (BatchListObjectPoliciesResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListObjectPoliciesResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
