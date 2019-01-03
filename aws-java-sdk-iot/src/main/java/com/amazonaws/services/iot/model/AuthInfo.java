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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of authorization information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The resources for which the principal is being authorized to perform the specified action.
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * 
     * @param actionType
     *        The type of action for which the principal is being authorized.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * 
     * @return The type of action for which the principal is being authorized.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * 
     * @param actionType
     *        The type of action for which the principal is being authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public AuthInfo withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * 
     * @param actionType
     *        The type of action for which the principal is being authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public AuthInfo withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the specified action.
     * </p>
     * 
     * @return The resources for which the principal is being authorized to perform the specified action.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the specified action.
     * </p>
     * 
     * @param resources
     *        The resources for which the principal is being authorized to perform the specified action.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the specified action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources for which the principal is being authorized to perform the specified action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthInfo withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the specified action.
     * </p>
     * 
     * @param resources
     *        The resources for which the principal is being authorized to perform the specified action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthInfo withResources(java.util.Collection<String> resources) {
        setResources(resources);
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthInfo == false)
            return false;
        AuthInfo other = (AuthInfo) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public AuthInfo clone() {
        try {
            return (AuthInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuthInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
