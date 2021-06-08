/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents types of timeouts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/TcpTimeout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TcpTimeout implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be
     * idle. The default value is none.
     * </p>
     */
    private Duration idle;

    /**
     * <p>
     * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be
     * idle. The default value is none.
     * </p>
     * 
     * @param idle
     *        An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may
     *        be idle. The default value is none.
     */

    public void setIdle(Duration idle) {
        this.idle = idle;
    }

    /**
     * <p>
     * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be
     * idle. The default value is none.
     * </p>
     * 
     * @return An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection
     *         may be idle. The default value is none.
     */

    public Duration getIdle() {
        return this.idle;
    }

    /**
     * <p>
     * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be
     * idle. The default value is none.
     * </p>
     * 
     * @param idle
     *        An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may
     *        be idle. The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TcpTimeout withIdle(Duration idle) {
        setIdle(idle);
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
        if (getIdle() != null)
            sb.append("Idle: ").append(getIdle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TcpTimeout == false)
            return false;
        TcpTimeout other = (TcpTimeout) obj;
        if (other.getIdle() == null ^ this.getIdle() == null)
            return false;
        if (other.getIdle() != null && other.getIdle().equals(this.getIdle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdle() == null) ? 0 : getIdle().hashCode());
        return hashCode;
    }

    @Override
    public TcpTimeout clone() {
        try {
            return (TcpTimeout) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.TcpTimeoutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
