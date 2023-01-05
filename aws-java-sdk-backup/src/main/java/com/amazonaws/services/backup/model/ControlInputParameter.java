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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of parameters for a control. A control can have zero, one, or more than one parameter. An example of a control
 * with two parameters is: "backup plan frequency is at least <code>daily</code> and the retention period is at least
 * <code>1 year</code>". The first parameter is <code>daily</code>. The second parameter is <code>1 year</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ControlInputParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlInputParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a parameter, for example, <code>BackupPlanFrequency</code>.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * The value of parameter, for example, <code>hourly</code>.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * The name of a parameter, for example, <code>BackupPlanFrequency</code>.
     * </p>
     * 
     * @param parameterName
     *        The name of a parameter, for example, <code>BackupPlanFrequency</code>.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of a parameter, for example, <code>BackupPlanFrequency</code>.
     * </p>
     * 
     * @return The name of a parameter, for example, <code>BackupPlanFrequency</code>.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The name of a parameter, for example, <code>BackupPlanFrequency</code>.
     * </p>
     * 
     * @param parameterName
     *        The name of a parameter, for example, <code>BackupPlanFrequency</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlInputParameter withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * The value of parameter, for example, <code>hourly</code>.
     * </p>
     * 
     * @param parameterValue
     *        The value of parameter, for example, <code>hourly</code>.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The value of parameter, for example, <code>hourly</code>.
     * </p>
     * 
     * @return The value of parameter, for example, <code>hourly</code>.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * The value of parameter, for example, <code>hourly</code>.
     * </p>
     * 
     * @param parameterValue
     *        The value of parameter, for example, <code>hourly</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlInputParameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlInputParameter == false)
            return false;
        ControlInputParameter other = (ControlInputParameter) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return hashCode;
    }

    @Override
    public ControlInputParameter clone() {
        try {
            return (ControlInputParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ControlInputParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
