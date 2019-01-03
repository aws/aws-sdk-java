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
 * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached inside a <a>BatchRead</a>
 * operation. For more information, see <a>ListPolicyAttachments</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchListPolicyAttachments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListPolicyAttachments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reference that identifies the policy object.
     * </p>
     */
    private ObjectReference policyReference;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The reference that identifies the policy object.
     * </p>
     * 
     * @param policyReference
     *        The reference that identifies the policy object.
     */

    public void setPolicyReference(ObjectReference policyReference) {
        this.policyReference = policyReference;
    }

    /**
     * <p>
     * The reference that identifies the policy object.
     * </p>
     * 
     * @return The reference that identifies the policy object.
     */

    public ObjectReference getPolicyReference() {
        return this.policyReference;
    }

    /**
     * <p>
     * The reference that identifies the policy object.
     * </p>
     * 
     * @param policyReference
     *        The reference that identifies the policy object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListPolicyAttachments withPolicyReference(ObjectReference policyReference) {
        setPolicyReference(policyReference);
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

    public BatchListPolicyAttachments withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @return The maximum number of results to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListPolicyAttachments withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getPolicyReference() != null)
            sb.append("PolicyReference: ").append(getPolicyReference()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchListPolicyAttachments == false)
            return false;
        BatchListPolicyAttachments other = (BatchListPolicyAttachments) obj;
        if (other.getPolicyReference() == null ^ this.getPolicyReference() == null)
            return false;
        if (other.getPolicyReference() != null && other.getPolicyReference().equals(this.getPolicyReference()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyReference() == null) ? 0 : getPolicyReference().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public BatchListPolicyAttachments clone() {
        try {
            return (BatchListPolicyAttachments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListPolicyAttachmentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
