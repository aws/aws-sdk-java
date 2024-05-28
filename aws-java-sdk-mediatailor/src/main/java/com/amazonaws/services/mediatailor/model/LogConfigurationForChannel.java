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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The log configuration for the channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/LogConfigurationForChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogConfigurationForChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log types.
     * </p>
     */
    private java.util.List<String> logTypes;

    /**
     * <p>
     * The log types.
     * </p>
     * 
     * @return The log types.
     * @see LogType
     */

    public java.util.List<String> getLogTypes() {
        return logTypes;
    }

    /**
     * <p>
     * The log types.
     * </p>
     * 
     * @param logTypes
     *        The log types.
     * @see LogType
     */

    public void setLogTypes(java.util.Collection<String> logTypes) {
        if (logTypes == null) {
            this.logTypes = null;
            return;
        }

        this.logTypes = new java.util.ArrayList<String>(logTypes);
    }

    /**
     * <p>
     * The log types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogTypes(java.util.Collection)} or {@link #withLogTypes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param logTypes
     *        The log types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogConfigurationForChannel withLogTypes(String... logTypes) {
        if (this.logTypes == null) {
            setLogTypes(new java.util.ArrayList<String>(logTypes.length));
        }
        for (String ele : logTypes) {
            this.logTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log types.
     * </p>
     * 
     * @param logTypes
     *        The log types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogConfigurationForChannel withLogTypes(java.util.Collection<String> logTypes) {
        setLogTypes(logTypes);
        return this;
    }

    /**
     * <p>
     * The log types.
     * </p>
     * 
     * @param logTypes
     *        The log types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogConfigurationForChannel withLogTypes(LogType... logTypes) {
        java.util.ArrayList<String> logTypesCopy = new java.util.ArrayList<String>(logTypes.length);
        for (LogType value : logTypes) {
            logTypesCopy.add(value.toString());
        }
        if (getLogTypes() == null) {
            setLogTypes(logTypesCopy);
        } else {
            getLogTypes().addAll(logTypesCopy);
        }
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
        if (getLogTypes() != null)
            sb.append("LogTypes: ").append(getLogTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfigurationForChannel == false)
            return false;
        LogConfigurationForChannel other = (LogConfigurationForChannel) obj;
        if (other.getLogTypes() == null ^ this.getLogTypes() == null)
            return false;
        if (other.getLogTypes() != null && other.getLogTypes().equals(this.getLogTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogTypes() == null) ? 0 : getLogTypes().hashCode());
        return hashCode;
    }

    @Override
    public LogConfigurationForChannel clone() {
        try {
            return (LogConfigurationForChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.LogConfigurationForChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
