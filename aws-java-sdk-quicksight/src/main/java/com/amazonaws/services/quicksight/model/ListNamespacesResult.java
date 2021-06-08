/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListNamespaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNamespacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The information about the namespaces in this AWS account. The response includes the namespace ARN, name, AWS
     * Region, notification email address, creation status, and identity store.
     * </p>
     */
    private java.util.List<NamespaceInfoV2> namespaces;
    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The information about the namespaces in this AWS account. The response includes the namespace ARN, name, AWS
     * Region, notification email address, creation status, and identity store.
     * </p>
     * 
     * @return The information about the namespaces in this AWS account. The response includes the namespace ARN, name,
     *         AWS Region, notification email address, creation status, and identity store.
     */

    public java.util.List<NamespaceInfoV2> getNamespaces() {
        return namespaces;
    }

    /**
     * <p>
     * The information about the namespaces in this AWS account. The response includes the namespace ARN, name, AWS
     * Region, notification email address, creation status, and identity store.
     * </p>
     * 
     * @param namespaces
     *        The information about the namespaces in this AWS account. The response includes the namespace ARN, name,
     *        AWS Region, notification email address, creation status, and identity store.
     */

    public void setNamespaces(java.util.Collection<NamespaceInfoV2> namespaces) {
        if (namespaces == null) {
            this.namespaces = null;
            return;
        }

        this.namespaces = new java.util.ArrayList<NamespaceInfoV2>(namespaces);
    }

    /**
     * <p>
     * The information about the namespaces in this AWS account. The response includes the namespace ARN, name, AWS
     * Region, notification email address, creation status, and identity store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamespaces(java.util.Collection)} or {@link #withNamespaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param namespaces
     *        The information about the namespaces in this AWS account. The response includes the namespace ARN, name,
     *        AWS Region, notification email address, creation status, and identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withNamespaces(NamespaceInfoV2... namespaces) {
        if (this.namespaces == null) {
            setNamespaces(new java.util.ArrayList<NamespaceInfoV2>(namespaces.length));
        }
        for (NamespaceInfoV2 ele : namespaces) {
            this.namespaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information about the namespaces in this AWS account. The response includes the namespace ARN, name, AWS
     * Region, notification email address, creation status, and identity store.
     * </p>
     * 
     * @param namespaces
     *        The information about the namespaces in this AWS account. The response includes the namespace ARN, name,
     *        AWS Region, notification email address, creation status, and identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withNamespaces(java.util.Collection<NamespaceInfoV2> namespaces) {
        setNamespaces(namespaces);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamespacesResult withStatus(Integer status) {
        setStatus(status);
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
        if (getNamespaces() != null)
            sb.append("Namespaces: ").append(getNamespaces()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNamespacesResult == false)
            return false;
        ListNamespacesResult other = (ListNamespacesResult) obj;
        if (other.getNamespaces() == null ^ this.getNamespaces() == null)
            return false;
        if (other.getNamespaces() != null && other.getNamespaces().equals(this.getNamespaces()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaces() == null) ? 0 : getNamespaces().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListNamespacesResult clone() {
        try {
            return (ListNamespacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
