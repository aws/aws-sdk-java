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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListHypervisors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHypervisorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<Hypervisor> hypervisors;
    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     */

    public java.util.List<Hypervisor> getHypervisors() {
        return hypervisors;
    }

    /**
     * <p>
     * A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param hypervisors
     *        A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     */

    public void setHypervisors(java.util.Collection<Hypervisor> hypervisors) {
        if (hypervisors == null) {
            this.hypervisors = null;
            return;
        }

        this.hypervisors = new java.util.ArrayList<Hypervisor>(hypervisors);
    }

    /**
     * <p>
     * A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHypervisors(java.util.Collection)} or {@link #withHypervisors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hypervisors
     *        A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHypervisorsResult withHypervisors(Hypervisor... hypervisors) {
        if (this.hypervisors == null) {
            setHypervisors(new java.util.ArrayList<Hypervisor>(hypervisors.length));
        }
        for (Hypervisor ele : hypervisors) {
            this.hypervisors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param hypervisors
     *        A list of your <code>Hypervisor</code> objects, ordered by their Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHypervisorsResult withHypervisors(java.util.Collection<Hypervisor> hypervisors) {
        setHypervisors(hypervisors);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned resources. For example, if a request is made to return
     *         <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *         your list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHypervisorsResult withNextToken(String nextToken) {
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
        if (getHypervisors() != null)
            sb.append("Hypervisors: ").append(getHypervisors()).append(",");
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

        if (obj instanceof ListHypervisorsResult == false)
            return false;
        ListHypervisorsResult other = (ListHypervisorsResult) obj;
        if (other.getHypervisors() == null ^ this.getHypervisors() == null)
            return false;
        if (other.getHypervisors() != null && other.getHypervisors().equals(this.getHypervisors()) == false)
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

        hashCode = prime * hashCode + ((getHypervisors() == null) ? 0 : getHypervisors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHypervisorsResult clone() {
        try {
            return (ListHypervisorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
