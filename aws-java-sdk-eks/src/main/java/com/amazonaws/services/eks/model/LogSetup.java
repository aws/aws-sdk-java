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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the enabled or disabled Kubernetes control plane logs for your cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/LogSetup" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogSetup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The available cluster control plane log types.
     * </p>
     */
    private java.util.List<String> types;
    /**
     * <p>
     * If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log type is
     * not enabled, then that log type does not export its control plane logs. Each individual log type can be enabled
     * or disabled independently.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The available cluster control plane log types.
     * </p>
     * 
     * @return The available cluster control plane log types.
     * @see LogType
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * The available cluster control plane log types.
     * </p>
     * 
     * @param types
     *        The available cluster control plane log types.
     * @see LogType
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * The available cluster control plane log types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        The available cluster control plane log types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogSetup withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The available cluster control plane log types.
     * </p>
     * 
     * @param types
     *        The available cluster control plane log types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogSetup withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * The available cluster control plane log types.
     * </p>
     * 
     * @param types
     *        The available cluster control plane log types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogSetup withTypes(LogType... types) {
        java.util.ArrayList<String> typesCopy = new java.util.ArrayList<String>(types.length);
        for (LogType value : types) {
            typesCopy.add(value.toString());
        }
        if (getTypes() == null) {
            setTypes(typesCopy);
        } else {
            getTypes().addAll(typesCopy);
        }
        return this;
    }

    /**
     * <p>
     * If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log type is
     * not enabled, then that log type does not export its control plane logs. Each individual log type can be enabled
     * or disabled independently.
     * </p>
     * 
     * @param enabled
     *        If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log
     *        type is not enabled, then that log type does not export its control plane logs. Each individual log type
     *        can be enabled or disabled independently.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log type is
     * not enabled, then that log type does not export its control plane logs. Each individual log type can be enabled
     * or disabled independently.
     * </p>
     * 
     * @return If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log
     *         type is not enabled, then that log type does not export its control plane logs. Each individual log type
     *         can be enabled or disabled independently.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log type is
     * not enabled, then that log type does not export its control plane logs. Each individual log type can be enabled
     * or disabled independently.
     * </p>
     * 
     * @param enabled
     *        If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log
     *        type is not enabled, then that log type does not export its control plane logs. Each individual log type
     *        can be enabled or disabled independently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSetup withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log type is
     * not enabled, then that log type does not export its control plane logs. Each individual log type can be enabled
     * or disabled independently.
     * </p>
     * 
     * @return If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log
     *         type is not enabled, then that log type does not export its control plane logs. Each individual log type
     *         can be enabled or disabled independently.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogSetup == false)
            return false;
        LogSetup other = (LogSetup) obj;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public LogSetup clone() {
        try {
            return (LogSetup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.LogSetupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
