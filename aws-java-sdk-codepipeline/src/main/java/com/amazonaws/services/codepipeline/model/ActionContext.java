/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the context of an action in the stage of a pipeline to a job worker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the action in the context of a job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The system-generated unique ID that corresponds to an action's execution.
     * </p>
     */
    private String actionExecutionId;

    /**
     * <p>
     * The name of the action in the context of a job.
     * </p>
     * 
     * @param name
     *        The name of the action in the context of a job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the action in the context of a job.
     * </p>
     * 
     * @return The name of the action in the context of a job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the action in the context of a job.
     * </p>
     * 
     * @param name
     *        The name of the action in the context of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionContext withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The system-generated unique ID that corresponds to an action's execution.
     * </p>
     * 
     * @param actionExecutionId
     *        The system-generated unique ID that corresponds to an action's execution.
     */

    public void setActionExecutionId(String actionExecutionId) {
        this.actionExecutionId = actionExecutionId;
    }

    /**
     * <p>
     * The system-generated unique ID that corresponds to an action's execution.
     * </p>
     * 
     * @return The system-generated unique ID that corresponds to an action's execution.
     */

    public String getActionExecutionId() {
        return this.actionExecutionId;
    }

    /**
     * <p>
     * The system-generated unique ID that corresponds to an action's execution.
     * </p>
     * 
     * @param actionExecutionId
     *        The system-generated unique ID that corresponds to an action's execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionContext withActionExecutionId(String actionExecutionId) {
        setActionExecutionId(actionExecutionId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getActionExecutionId() != null)
            sb.append("ActionExecutionId: ").append(getActionExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionContext == false)
            return false;
        ActionContext other = (ActionContext) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getActionExecutionId() == null ^ this.getActionExecutionId() == null)
            return false;
        if (other.getActionExecutionId() != null && other.getActionExecutionId().equals(this.getActionExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getActionExecutionId() == null) ? 0 : getActionExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public ActionContext clone() {
        try {
            return (ActionContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
