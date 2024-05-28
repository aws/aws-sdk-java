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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about actions that define permissions to check against a policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Access" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Access implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy can be
     * used in the list of actions to check.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy can be
     * used in the list of actions to check.
     * </p>
     * 
     * @return A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy
     *         can be used in the list of actions to check.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy can be
     * used in the list of actions to check.
     * </p>
     * 
     * @param actions
     *        A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy
     *        can be used in the list of actions to check.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy can be
     * used in the list of actions to check.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy
     *        can be used in the list of actions to check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Access withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy can be
     * used in the list of actions to check.
     * </p>
     * 
     * @param actions
     *        A list of actions for the access permissions. Any strings that can be used as an action in an IAM policy
     *        can be used in the list of actions to check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Access withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Access == false)
            return false;
        Access other = (Access) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public Access clone() {
        try {
            return (Access) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.AccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
