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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a logger definition version.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/LoggerDefinitionVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggerDefinitionVersion implements Serializable, Cloneable, StructuredPojo {

    /** A list of loggers. */
    private java.util.List<Logger> loggers;

    /**
     * A list of loggers.
     * 
     * @return A list of loggers.
     */

    public java.util.List<Logger> getLoggers() {
        return loggers;
    }

    /**
     * A list of loggers.
     * 
     * @param loggers
     *        A list of loggers.
     */

    public void setLoggers(java.util.Collection<Logger> loggers) {
        if (loggers == null) {
            this.loggers = null;
            return;
        }

        this.loggers = new java.util.ArrayList<Logger>(loggers);
    }

    /**
     * A list of loggers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoggers(java.util.Collection)} or {@link #withLoggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param loggers
     *        A list of loggers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggerDefinitionVersion withLoggers(Logger... loggers) {
        if (this.loggers == null) {
            setLoggers(new java.util.ArrayList<Logger>(loggers.length));
        }
        for (Logger ele : loggers) {
            this.loggers.add(ele);
        }
        return this;
    }

    /**
     * A list of loggers.
     * 
     * @param loggers
     *        A list of loggers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggerDefinitionVersion withLoggers(java.util.Collection<Logger> loggers) {
        setLoggers(loggers);
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
        if (getLoggers() != null)
            sb.append("Loggers: ").append(getLoggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggerDefinitionVersion == false)
            return false;
        LoggerDefinitionVersion other = (LoggerDefinitionVersion) obj;
        if (other.getLoggers() == null ^ this.getLoggers() == null)
            return false;
        if (other.getLoggers() != null && other.getLoggers().equals(this.getLoggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggers() == null) ? 0 : getLoggers().hashCode());
        return hashCode;
    }

    @Override
    public LoggerDefinitionVersion clone() {
        try {
            return (LoggerDefinitionVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.LoggerDefinitionVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
