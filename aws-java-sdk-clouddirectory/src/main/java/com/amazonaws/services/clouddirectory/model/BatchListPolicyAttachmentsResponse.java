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
 * Represents the output of a <a>ListPolicyAttachments</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchListPolicyAttachmentsResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListPolicyAttachmentsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     * </p>
     */
    private java.util.List<String> objectIdentifiers;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     * </p>
     * 
     * @return A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     */

    public java.util.List<String> getObjectIdentifiers() {
        return objectIdentifiers;
    }

    /**
     * <p>
     * A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     * </p>
     * 
     * @param objectIdentifiers
     *        A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     */

    public void setObjectIdentifiers(java.util.Collection<String> objectIdentifiers) {
        if (objectIdentifiers == null) {
            this.objectIdentifiers = null;
            return;
        }

        this.objectIdentifiers = new java.util.ArrayList<String>(objectIdentifiers);
    }

    /**
     * <p>
     * A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectIdentifiers(java.util.Collection)} or {@link #withObjectIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param objectIdentifiers
     *        A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListPolicyAttachmentsResponse withObjectIdentifiers(String... objectIdentifiers) {
        if (this.objectIdentifiers == null) {
            setObjectIdentifiers(new java.util.ArrayList<String>(objectIdentifiers.length));
        }
        for (String ele : objectIdentifiers) {
            this.objectIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     * </p>
     * 
     * @param objectIdentifiers
     *        A list of <code>ObjectIdentifiers</code> to which the policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListPolicyAttachmentsResponse withObjectIdentifiers(java.util.Collection<String> objectIdentifiers) {
        setObjectIdentifiers(objectIdentifiers);
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

    public BatchListPolicyAttachmentsResponse withNextToken(String nextToken) {
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
        if (getObjectIdentifiers() != null)
            sb.append("ObjectIdentifiers: ").append(getObjectIdentifiers()).append(",");
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

        if (obj instanceof BatchListPolicyAttachmentsResponse == false)
            return false;
        BatchListPolicyAttachmentsResponse other = (BatchListPolicyAttachmentsResponse) obj;
        if (other.getObjectIdentifiers() == null ^ this.getObjectIdentifiers() == null)
            return false;
        if (other.getObjectIdentifiers() != null && other.getObjectIdentifiers().equals(this.getObjectIdentifiers()) == false)
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

        hashCode = prime * hashCode + ((getObjectIdentifiers() == null) ? 0 : getObjectIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchListPolicyAttachmentsResponse clone() {
        try {
            return (BatchListPolicyAttachmentsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListPolicyAttachmentsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
