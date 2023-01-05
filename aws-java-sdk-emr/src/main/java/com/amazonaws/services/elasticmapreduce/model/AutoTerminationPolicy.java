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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in
 * seconds after which a cluster automatically terminates. For alternative cluster termination options, see <a
 * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-termination.html">Control cluster
 * termination</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AutoTerminationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTerminationPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a
     * minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     * </p>
     */
    private Long idleTimeout;

    /**
     * <p>
     * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a
     * minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     * </p>
     * 
     * @param idleTimeout
     *        Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can
     *        specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     */

    public void setIdleTimeout(Long idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * <p>
     * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a
     * minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     * </p>
     * 
     * @return Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can
     *         specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     */

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * <p>
     * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a
     * minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     * </p>
     * 
     * @param idleTimeout
     *        Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can
     *        specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTerminationPolicy withIdleTimeout(Long idleTimeout) {
        setIdleTimeout(idleTimeout);
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
        if (getIdleTimeout() != null)
            sb.append("IdleTimeout: ").append(getIdleTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoTerminationPolicy == false)
            return false;
        AutoTerminationPolicy other = (AutoTerminationPolicy) obj;
        if (other.getIdleTimeout() == null ^ this.getIdleTimeout() == null)
            return false;
        if (other.getIdleTimeout() != null && other.getIdleTimeout().equals(this.getIdleTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdleTimeout() == null) ? 0 : getIdleTimeout().hashCode());
        return hashCode;
    }

    @Override
    public AutoTerminationPolicy clone() {
        try {
            return (AutoTerminationPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.AutoTerminationPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
