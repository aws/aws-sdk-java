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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The fields contained in log events found by a <code>GetLogGroupFields</code> operation, along with the percentage of
 * queried log events in which each field appears.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/LogGroupField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogGroupField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a log field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     */
    private Integer percent;

    /**
     * <p>
     * The name of a log field.
     * </p>
     * 
     * @param name
     *        The name of a log field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a log field.
     * </p>
     * 
     * @return The name of a log field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a log field.
     * </p>
     * 
     * @param name
     *        The name of a log field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroupField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     * 
     * @param percent
     *        The percentage of log events queried that contained the field.
     */

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     * 
     * @return The percentage of log events queried that contained the field.
     */

    public Integer getPercent() {
        return this.percent;
    }

    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     * 
     * @param percent
     *        The percentage of log events queried that contained the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroupField withPercent(Integer percent) {
        setPercent(percent);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPercent() != null)
            sb.append("Percent: ").append(getPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogGroupField == false)
            return false;
        LogGroupField other = (LogGroupField) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPercent() == null ^ this.getPercent() == null)
            return false;
        if (other.getPercent() != null && other.getPercent().equals(this.getPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPercent() == null) ? 0 : getPercent().hashCode());
        return hashCode;
    }

    @Override
    public LogGroupField clone() {
        try {
            return (LogGroupField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.LogGroupFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
