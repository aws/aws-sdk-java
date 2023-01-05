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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListVirtualMachines" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualMachinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<VirtualMachine> virtualMachines;

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

    public ListVirtualMachinesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     */

    public java.util.List<VirtualMachine> getVirtualMachines() {
        return virtualMachines;
    }

    /**
     * <p>
     * A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param virtualMachines
     *        A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     */

    public void setVirtualMachines(java.util.Collection<VirtualMachine> virtualMachines) {
        if (virtualMachines == null) {
            this.virtualMachines = null;
            return;
        }

        this.virtualMachines = new java.util.ArrayList<VirtualMachine>(virtualMachines);
    }

    /**
     * <p>
     * A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualMachines(java.util.Collection)} or {@link #withVirtualMachines(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param virtualMachines
     *        A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualMachinesResult withVirtualMachines(VirtualMachine... virtualMachines) {
        if (this.virtualMachines == null) {
            setVirtualMachines(new java.util.ArrayList<VirtualMachine>(virtualMachines.length));
        }
        for (VirtualMachine ele : virtualMachines) {
            this.virtualMachines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param virtualMachines
     *        A list of your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualMachinesResult withVirtualMachines(java.util.Collection<VirtualMachine> virtualMachines) {
        setVirtualMachines(virtualMachines);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVirtualMachines() != null)
            sb.append("VirtualMachines: ").append(getVirtualMachines());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualMachinesResult == false)
            return false;
        ListVirtualMachinesResult other = (ListVirtualMachinesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVirtualMachines() == null ^ this.getVirtualMachines() == null)
            return false;
        if (other.getVirtualMachines() != null && other.getVirtualMachines().equals(this.getVirtualMachines()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVirtualMachines() == null) ? 0 : getVirtualMachines().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualMachinesResult clone() {
        try {
            return (ListVirtualMachinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
