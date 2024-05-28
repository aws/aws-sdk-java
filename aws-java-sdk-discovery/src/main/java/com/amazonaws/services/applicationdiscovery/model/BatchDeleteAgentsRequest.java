/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteAgentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of agents to delete.
     * </p>
     */
    private java.util.List<DeleteAgent> deleteAgents;

    /**
     * <p>
     * The list of agents to delete.
     * </p>
     * 
     * @return The list of agents to delete.
     */

    public java.util.List<DeleteAgent> getDeleteAgents() {
        return deleteAgents;
    }

    /**
     * <p>
     * The list of agents to delete.
     * </p>
     * 
     * @param deleteAgents
     *        The list of agents to delete.
     */

    public void setDeleteAgents(java.util.Collection<DeleteAgent> deleteAgents) {
        if (deleteAgents == null) {
            this.deleteAgents = null;
            return;
        }

        this.deleteAgents = new java.util.ArrayList<DeleteAgent>(deleteAgents);
    }

    /**
     * <p>
     * The list of agents to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeleteAgents(java.util.Collection)} or {@link #withDeleteAgents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deleteAgents
     *        The list of agents to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteAgentsRequest withDeleteAgents(DeleteAgent... deleteAgents) {
        if (this.deleteAgents == null) {
            setDeleteAgents(new java.util.ArrayList<DeleteAgent>(deleteAgents.length));
        }
        for (DeleteAgent ele : deleteAgents) {
            this.deleteAgents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of agents to delete.
     * </p>
     * 
     * @param deleteAgents
     *        The list of agents to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteAgentsRequest withDeleteAgents(java.util.Collection<DeleteAgent> deleteAgents) {
        setDeleteAgents(deleteAgents);
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
        if (getDeleteAgents() != null)
            sb.append("DeleteAgents: ").append(getDeleteAgents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteAgentsRequest == false)
            return false;
        BatchDeleteAgentsRequest other = (BatchDeleteAgentsRequest) obj;
        if (other.getDeleteAgents() == null ^ this.getDeleteAgents() == null)
            return false;
        if (other.getDeleteAgents() != null && other.getDeleteAgents().equals(this.getDeleteAgents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteAgents() == null) ? 0 : getDeleteAgents().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteAgentsRequest clone() {
        return (BatchDeleteAgentsRequest) super.clone();
    }

}
