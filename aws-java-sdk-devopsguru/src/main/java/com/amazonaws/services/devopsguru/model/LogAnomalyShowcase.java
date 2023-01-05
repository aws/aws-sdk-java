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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A cluster of similar anomalous log events found within a log group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/LogAnomalyShowcase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogAnomalyShowcase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of anomalous log events that may be related.
     * </p>
     */
    private java.util.List<LogAnomalyClass> logAnomalyClasses;

    /**
     * <p>
     * A list of anomalous log events that may be related.
     * </p>
     * 
     * @return A list of anomalous log events that may be related.
     */

    public java.util.List<LogAnomalyClass> getLogAnomalyClasses() {
        return logAnomalyClasses;
    }

    /**
     * <p>
     * A list of anomalous log events that may be related.
     * </p>
     * 
     * @param logAnomalyClasses
     *        A list of anomalous log events that may be related.
     */

    public void setLogAnomalyClasses(java.util.Collection<LogAnomalyClass> logAnomalyClasses) {
        if (logAnomalyClasses == null) {
            this.logAnomalyClasses = null;
            return;
        }

        this.logAnomalyClasses = new java.util.ArrayList<LogAnomalyClass>(logAnomalyClasses);
    }

    /**
     * <p>
     * A list of anomalous log events that may be related.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogAnomalyClasses(java.util.Collection)} or {@link #withLogAnomalyClasses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logAnomalyClasses
     *        A list of anomalous log events that may be related.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyShowcase withLogAnomalyClasses(LogAnomalyClass... logAnomalyClasses) {
        if (this.logAnomalyClasses == null) {
            setLogAnomalyClasses(new java.util.ArrayList<LogAnomalyClass>(logAnomalyClasses.length));
        }
        for (LogAnomalyClass ele : logAnomalyClasses) {
            this.logAnomalyClasses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of anomalous log events that may be related.
     * </p>
     * 
     * @param logAnomalyClasses
     *        A list of anomalous log events that may be related.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogAnomalyShowcase withLogAnomalyClasses(java.util.Collection<LogAnomalyClass> logAnomalyClasses) {
        setLogAnomalyClasses(logAnomalyClasses);
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
        if (getLogAnomalyClasses() != null)
            sb.append("LogAnomalyClasses: ").append(getLogAnomalyClasses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogAnomalyShowcase == false)
            return false;
        LogAnomalyShowcase other = (LogAnomalyShowcase) obj;
        if (other.getLogAnomalyClasses() == null ^ this.getLogAnomalyClasses() == null)
            return false;
        if (other.getLogAnomalyClasses() != null && other.getLogAnomalyClasses().equals(this.getLogAnomalyClasses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogAnomalyClasses() == null) ? 0 : getLogAnomalyClasses().hashCode());
        return hashCode;
    }

    @Override
    public LogAnomalyShowcase clone() {
        try {
            return (LogAnomalyShowcase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.LogAnomalyShowcaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
