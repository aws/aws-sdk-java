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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchListObjectParentsResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListObjectParentsResponse implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<ObjectIdentifierAndLinkNameTuple> parentLinks;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<ObjectIdentifierAndLinkNameTuple> getParentLinks() {
        return parentLinks;
    }

    /**
     * @param parentLinks
     */

    public void setParentLinks(java.util.Collection<ObjectIdentifierAndLinkNameTuple> parentLinks) {
        if (parentLinks == null) {
            this.parentLinks = null;
            return;
        }

        this.parentLinks = new java.util.ArrayList<ObjectIdentifierAndLinkNameTuple>(parentLinks);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParentLinks(java.util.Collection)} or {@link #withParentLinks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parentLinks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectParentsResponse withParentLinks(ObjectIdentifierAndLinkNameTuple... parentLinks) {
        if (this.parentLinks == null) {
            setParentLinks(new java.util.ArrayList<ObjectIdentifierAndLinkNameTuple>(parentLinks.length));
        }
        for (ObjectIdentifierAndLinkNameTuple ele : parentLinks) {
            this.parentLinks.add(ele);
        }
        return this;
    }

    /**
     * @param parentLinks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectParentsResponse withParentLinks(java.util.Collection<ObjectIdentifierAndLinkNameTuple> parentLinks) {
        setParentLinks(parentLinks);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectParentsResponse withNextToken(String nextToken) {
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
        if (getParentLinks() != null)
            sb.append("ParentLinks: ").append(getParentLinks()).append(",");
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

        if (obj instanceof BatchListObjectParentsResponse == false)
            return false;
        BatchListObjectParentsResponse other = (BatchListObjectParentsResponse) obj;
        if (other.getParentLinks() == null ^ this.getParentLinks() == null)
            return false;
        if (other.getParentLinks() != null && other.getParentLinks().equals(this.getParentLinks()) == false)
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

        hashCode = prime * hashCode + ((getParentLinks() == null) ? 0 : getParentLinks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchListObjectParentsResponse clone() {
        try {
            return (BatchListObjectParentsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListObjectParentsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
