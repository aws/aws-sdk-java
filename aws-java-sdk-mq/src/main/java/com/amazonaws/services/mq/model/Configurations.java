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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Broker configuration information
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/Configurations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Configurations implements Serializable, Cloneable, StructuredPojo {

    /** The current configuration of the broker. */
    private ConfigurationId current;
    /** The history of configurations applied to the broker. */
    private java.util.List<ConfigurationId> history;
    /** The pending configuration of the broker. */
    private ConfigurationId pending;

    /**
     * The current configuration of the broker.
     * 
     * @param current
     *        The current configuration of the broker.
     */

    public void setCurrent(ConfigurationId current) {
        this.current = current;
    }

    /**
     * The current configuration of the broker.
     * 
     * @return The current configuration of the broker.
     */

    public ConfigurationId getCurrent() {
        return this.current;
    }

    /**
     * The current configuration of the broker.
     * 
     * @param current
     *        The current configuration of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configurations withCurrent(ConfigurationId current) {
        setCurrent(current);
        return this;
    }

    /**
     * The history of configurations applied to the broker.
     * 
     * @return The history of configurations applied to the broker.
     */

    public java.util.List<ConfigurationId> getHistory() {
        return history;
    }

    /**
     * The history of configurations applied to the broker.
     * 
     * @param history
     *        The history of configurations applied to the broker.
     */

    public void setHistory(java.util.Collection<ConfigurationId> history) {
        if (history == null) {
            this.history = null;
            return;
        }

        this.history = new java.util.ArrayList<ConfigurationId>(history);
    }

    /**
     * The history of configurations applied to the broker.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHistory(java.util.Collection)} or {@link #withHistory(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param history
     *        The history of configurations applied to the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configurations withHistory(ConfigurationId... history) {
        if (this.history == null) {
            setHistory(new java.util.ArrayList<ConfigurationId>(history.length));
        }
        for (ConfigurationId ele : history) {
            this.history.add(ele);
        }
        return this;
    }

    /**
     * The history of configurations applied to the broker.
     * 
     * @param history
     *        The history of configurations applied to the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configurations withHistory(java.util.Collection<ConfigurationId> history) {
        setHistory(history);
        return this;
    }

    /**
     * The pending configuration of the broker.
     * 
     * @param pending
     *        The pending configuration of the broker.
     */

    public void setPending(ConfigurationId pending) {
        this.pending = pending;
    }

    /**
     * The pending configuration of the broker.
     * 
     * @return The pending configuration of the broker.
     */

    public ConfigurationId getPending() {
        return this.pending;
    }

    /**
     * The pending configuration of the broker.
     * 
     * @param pending
     *        The pending configuration of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configurations withPending(ConfigurationId pending) {
        setPending(pending);
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
        if (getCurrent() != null)
            sb.append("Current: ").append(getCurrent()).append(",");
        if (getHistory() != null)
            sb.append("History: ").append(getHistory()).append(",");
        if (getPending() != null)
            sb.append("Pending: ").append(getPending());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configurations == false)
            return false;
        Configurations other = (Configurations) obj;
        if (other.getCurrent() == null ^ this.getCurrent() == null)
            return false;
        if (other.getCurrent() != null && other.getCurrent().equals(this.getCurrent()) == false)
            return false;
        if (other.getHistory() == null ^ this.getHistory() == null)
            return false;
        if (other.getHistory() != null && other.getHistory().equals(this.getHistory()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrent() == null) ? 0 : getCurrent().hashCode());
        hashCode = prime * hashCode + ((getHistory() == null) ? 0 : getHistory().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        return hashCode;
    }

    @Override
    public Configurations clone() {
        try {
            return (Configurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.ConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
