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
 * Contains information about an unused access finding for a permission. IAM Access Analyzer charges for unused access
 * analysis based on the number of IAM roles and users analyzed per month. For more details on pricing, see <a
 * href="https://aws.amazon.com/iam/access-analyzer/pricing">IAM Access Analyzer pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UnusedPermissionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnusedPermissionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of unused actions for which the unused access finding was generated.
     * </p>
     */
    private java.util.List<UnusedAction> actions;
    /**
     * <p>
     * The namespace of the Amazon Web Services service that contains the unused actions.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The time at which the permission last accessed.
     * </p>
     */
    private java.util.Date lastAccessed;

    /**
     * <p>
     * A list of unused actions for which the unused access finding was generated.
     * </p>
     * 
     * @return A list of unused actions for which the unused access finding was generated.
     */

    public java.util.List<UnusedAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of unused actions for which the unused access finding was generated.
     * </p>
     * 
     * @param actions
     *        A list of unused actions for which the unused access finding was generated.
     */

    public void setActions(java.util.Collection<UnusedAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<UnusedAction>(actions);
    }

    /**
     * <p>
     * A list of unused actions for which the unused access finding was generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of unused actions for which the unused access finding was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedPermissionDetails withActions(UnusedAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<UnusedAction>(actions.length));
        }
        for (UnusedAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of unused actions for which the unused access finding was generated.
     * </p>
     * 
     * @param actions
     *        A list of unused actions for which the unused access finding was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedPermissionDetails withActions(java.util.Collection<UnusedAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The namespace of the Amazon Web Services service that contains the unused actions.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the Amazon Web Services service that contains the unused actions.
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the Amazon Web Services service that contains the unused actions.
     * </p>
     * 
     * @return The namespace of the Amazon Web Services service that contains the unused actions.
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the Amazon Web Services service that contains the unused actions.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the Amazon Web Services service that contains the unused actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedPermissionDetails withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The time at which the permission last accessed.
     * </p>
     * 
     * @param lastAccessed
     *        The time at which the permission last accessed.
     */

    public void setLastAccessed(java.util.Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    /**
     * <p>
     * The time at which the permission last accessed.
     * </p>
     * 
     * @return The time at which the permission last accessed.
     */

    public java.util.Date getLastAccessed() {
        return this.lastAccessed;
    }

    /**
     * <p>
     * The time at which the permission last accessed.
     * </p>
     * 
     * @param lastAccessed
     *        The time at which the permission last accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedPermissionDetails withLastAccessed(java.util.Date lastAccessed) {
        setLastAccessed(lastAccessed);
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
            sb.append("Actions: ").append(getActions()).append(",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getLastAccessed() != null)
            sb.append("LastAccessed: ").append(getLastAccessed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnusedPermissionDetails == false)
            return false;
        UnusedPermissionDetails other = (UnusedPermissionDetails) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getLastAccessed() == null ^ this.getLastAccessed() == null)
            return false;
        if (other.getLastAccessed() != null && other.getLastAccessed().equals(this.getLastAccessed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getLastAccessed() == null) ? 0 : getLastAccessed().hashCode());
        return hashCode;
    }

    @Override
    public UnusedPermissionDetails clone() {
        try {
            return (UnusedPermissionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.UnusedPermissionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
