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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An <code>ActionTarget</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ActionTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for the target action.
     * </p>
     */
    private String actionTargetArn;
    /**
     * <p>
     * The name of the action target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the target action.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN for the target action.
     * </p>
     * 
     * @param actionTargetArn
     *        The ARN for the target action.
     */

    public void setActionTargetArn(String actionTargetArn) {
        this.actionTargetArn = actionTargetArn;
    }

    /**
     * <p>
     * The ARN for the target action.
     * </p>
     * 
     * @return The ARN for the target action.
     */

    public String getActionTargetArn() {
        return this.actionTargetArn;
    }

    /**
     * <p>
     * The ARN for the target action.
     * </p>
     * 
     * @param actionTargetArn
     *        The ARN for the target action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTarget withActionTargetArn(String actionTargetArn) {
        setActionTargetArn(actionTargetArn);
        return this;
    }

    /**
     * <p>
     * The name of the action target.
     * </p>
     * 
     * @param name
     *        The name of the action target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the action target.
     * </p>
     * 
     * @return The name of the action target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the action target.
     * </p>
     * 
     * @param name
     *        The name of the action target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the target action.
     * </p>
     * 
     * @param description
     *        The description of the target action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the target action.
     * </p>
     * 
     * @return The description of the target action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the target action.
     * </p>
     * 
     * @param description
     *        The description of the target action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTarget withDescription(String description) {
        setDescription(description);
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
        if (getActionTargetArn() != null)
            sb.append("ActionTargetArn: ").append(getActionTargetArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTarget == false)
            return false;
        ActionTarget other = (ActionTarget) obj;
        if (other.getActionTargetArn() == null ^ this.getActionTargetArn() == null)
            return false;
        if (other.getActionTargetArn() != null && other.getActionTargetArn().equals(this.getActionTargetArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTargetArn() == null) ? 0 : getActionTargetArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ActionTarget clone() {
        try {
            return (ActionTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ActionTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
