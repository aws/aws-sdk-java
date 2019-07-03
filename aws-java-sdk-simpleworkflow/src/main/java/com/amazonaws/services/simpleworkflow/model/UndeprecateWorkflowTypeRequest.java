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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/UndeprecateWorkflowType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UndeprecateWorkflowTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     */
    private WorkflowType workflowType;

    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     * 
     * @param domain
     *        The name of the domain of the deprecated workflow type.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     * 
     * @return The name of the domain of the deprecated workflow type.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     * 
     * @param domain
     *        The name of the domain of the deprecated workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UndeprecateWorkflowTypeRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     * 
     * @param workflowType
     *        The name of the domain of the deprecated workflow type.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     * 
     * @return The name of the domain of the deprecated workflow type.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The name of the domain of the deprecated workflow type.
     * </p>
     * 
     * @param workflowType
     *        The name of the domain of the deprecated workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UndeprecateWorkflowTypeRequest withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UndeprecateWorkflowTypeRequest == false)
            return false;
        UndeprecateWorkflowTypeRequest other = (UndeprecateWorkflowTypeRequest) obj;
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
    public UndeprecateWorkflowTypeRequest clone() {
        return (UndeprecateWorkflowTypeRequest) super.clone();
    }

}
