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

/**
 * <p>
 * Contains details about a workflow type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowTypeDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowTypeDetail extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * General information about the workflow type.
     * </p>
     * <p>
     * The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateWorkflowType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new workflow executions of this type.
     * </p>
     * </li>
     * </ul>
     */
    private WorkflowTypeInfo typeInfo;
    /**
     * <p>
     * Configuration settings of the workflow type registered through <a>RegisterWorkflowType</a>
     * </p>
     */
    private WorkflowTypeConfiguration configuration;

    /**
     * <p>
     * General information about the workflow type.
     * </p>
     * <p>
     * The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateWorkflowType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new workflow executions of this type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeInfo
     *        General information about the workflow type.</p>
     *        <p>
     *        The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be
     *        running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateWorkflowType</a>, but is still in use.
     *        You should keep workers supporting this type running. You cannot create new workflow executions of this
     *        type.
     *        </p>
     *        </li>
     */

    public void setTypeInfo(WorkflowTypeInfo typeInfo) {
        this.typeInfo = typeInfo;
    }

    /**
     * <p>
     * General information about the workflow type.
     * </p>
     * <p>
     * The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateWorkflowType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new workflow executions of this type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return General information about the workflow type.</p>
     *         <p>
     *         The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be
     *         running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateWorkflowType</a>, but is still in
     *         use. You should keep workers supporting this type running. You cannot create new workflow executions of
     *         this type.
     *         </p>
     *         </li>
     */

    public WorkflowTypeInfo getTypeInfo() {
        return this.typeInfo;
    }

    /**
     * <p>
     * General information about the workflow type.
     * </p>
     * <p>
     * The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateWorkflowType</a>, but is still in use. You
     * should keep workers supporting this type running. You cannot create new workflow executions of this type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeInfo
     *        General information about the workflow type.</p>
     *        <p>
     *        The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code> – The type is registered and available. Workers supporting this type should be
     *        running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code> – The type was deprecated using <a>DeprecateWorkflowType</a>, but is still in use.
     *        You should keep workers supporting this type running. You cannot create new workflow executions of this
     *        type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeDetail withTypeInfo(WorkflowTypeInfo typeInfo) {
        setTypeInfo(typeInfo);
        return this;
    }

    /**
     * <p>
     * Configuration settings of the workflow type registered through <a>RegisterWorkflowType</a>
     * </p>
     * 
     * @param configuration
     *        Configuration settings of the workflow type registered through <a>RegisterWorkflowType</a>
     */

    public void setConfiguration(WorkflowTypeConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration settings of the workflow type registered through <a>RegisterWorkflowType</a>
     * </p>
     * 
     * @return Configuration settings of the workflow type registered through <a>RegisterWorkflowType</a>
     */

    public WorkflowTypeConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Configuration settings of the workflow type registered through <a>RegisterWorkflowType</a>
     * </p>
     * 
     * @param configuration
     *        Configuration settings of the workflow type registered through <a>RegisterWorkflowType</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeDetail withConfiguration(WorkflowTypeConfiguration configuration) {
        setConfiguration(configuration);
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
        if (getTypeInfo() != null)
            sb.append("TypeInfo: ").append(getTypeInfo()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowTypeDetail == false)
            return false;
        WorkflowTypeDetail other = (WorkflowTypeDetail) obj;
        if (other.getTypeInfo() == null ^ this.getTypeInfo() == null)
            return false;
        if (other.getTypeInfo() != null && other.getTypeInfo().equals(this.getTypeInfo()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeInfo() == null) ? 0 : getTypeInfo().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowTypeDetail clone() {
        try {
            return (WorkflowTypeDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
