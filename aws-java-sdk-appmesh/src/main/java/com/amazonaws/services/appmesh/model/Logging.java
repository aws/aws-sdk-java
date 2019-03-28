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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the logging information for a virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/Logging" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Logging implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     */
    private AccessLog accessLog;

    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     * 
     * @param accessLog
     *        The access log configuration for a virtual node.
     */

    public void setAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
    }

    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     * 
     * @return The access log configuration for a virtual node.
     */

    public AccessLog getAccessLog() {
        return this.accessLog;
    }

    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     * 
     * @param accessLog
     *        The access log configuration for a virtual node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logging withAccessLog(AccessLog accessLog) {
        setAccessLog(accessLog);
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
        if (getAccessLog() != null)
            sb.append("AccessLog: ").append(getAccessLog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Logging == false)
            return false;
        Logging other = (Logging) obj;
        if (other.getAccessLog() == null ^ this.getAccessLog() == null)
            return false;
        if (other.getAccessLog() != null && other.getAccessLog().equals(this.getAccessLog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessLog() == null) ? 0 : getAccessLog().hashCode());
        return hashCode;
    }

    @Override
    public Logging clone() {
        try {
            return (Logging) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.LoggingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
