/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeprecateWorkflowTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain in which the workflow type is registered.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The workflow type to deprecate.
     * </p>
     */
    private WorkflowType workflowType;

    /**
     * <p>
     * The name of the domain in which the workflow type is registered.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which the workflow type is registered.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain in which the workflow type is registered.
     * </p>
     * 
     * @return The name of the domain in which the workflow type is registered.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain in which the workflow type is registered.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which the workflow type is registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecateWorkflowTypeRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The workflow type to deprecate.
     * </p>
     * 
     * @param workflowType
     *        The workflow type to deprecate.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The workflow type to deprecate.
     * </p>
     * 
     * @return The workflow type to deprecate.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The workflow type to deprecate.
     * </p>
     * 
     * @param workflowType
     *        The workflow type to deprecate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecateWorkflowTypeRequest withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: " + getWorkflowType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprecateWorkflowTypeRequest == false)
            return false;
        DeprecateWorkflowTypeRequest other = (DeprecateWorkflowTypeRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        return hashCode;
    }

    @Override
    public DeprecateWorkflowTypeRequest clone() {
        return (DeprecateWorkflowTypeRequest) super.clone();
    }
}
