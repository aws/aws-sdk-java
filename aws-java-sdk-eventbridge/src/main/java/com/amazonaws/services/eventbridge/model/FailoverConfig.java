/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The failover configuration for an endpoint. This includes what triggers failover and what happens when it's
 * triggered.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/FailoverConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The main Region of the endpoint.
     * </p>
     */
    private Primary primary;
    /**
     * <p>
     * The Region that events are routed to when failover is triggered or event replication is enabled.
     * </p>
     */
    private Secondary secondary;

    /**
     * <p>
     * The main Region of the endpoint.
     * </p>
     * 
     * @param primary
     *        The main Region of the endpoint.
     */

    public void setPrimary(Primary primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * The main Region of the endpoint.
     * </p>
     * 
     * @return The main Region of the endpoint.
     */

    public Primary getPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * The main Region of the endpoint.
     * </p>
     * 
     * @param primary
     *        The main Region of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverConfig withPrimary(Primary primary) {
        setPrimary(primary);
        return this;
    }

    /**
     * <p>
     * The Region that events are routed to when failover is triggered or event replication is enabled.
     * </p>
     * 
     * @param secondary
     *        The Region that events are routed to when failover is triggered or event replication is enabled.
     */

    public void setSecondary(Secondary secondary) {
        this.secondary = secondary;
    }

    /**
     * <p>
     * The Region that events are routed to when failover is triggered or event replication is enabled.
     * </p>
     * 
     * @return The Region that events are routed to when failover is triggered or event replication is enabled.
     */

    public Secondary getSecondary() {
        return this.secondary;
    }

    /**
     * <p>
     * The Region that events are routed to when failover is triggered or event replication is enabled.
     * </p>
     * 
     * @param secondary
     *        The Region that events are routed to when failover is triggered or event replication is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverConfig withSecondary(Secondary secondary) {
        setSecondary(secondary);
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
        if (getPrimary() != null)
            sb.append("Primary: ").append(getPrimary()).append(",");
        if (getSecondary() != null)
            sb.append("Secondary: ").append(getSecondary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverConfig == false)
            return false;
        FailoverConfig other = (FailoverConfig) obj;
        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
            return false;
        if (other.getSecondary() == null ^ this.getSecondary() == null)
            return false;
        if (other.getSecondary() != null && other.getSecondary().equals(this.getSecondary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        hashCode = prime * hashCode + ((getSecondary() == null) ? 0 : getSecondary().hashCode());
        return hashCode;
    }

    @Override
    public FailoverConfig clone() {
        try {
            return (FailoverConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.FailoverConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
