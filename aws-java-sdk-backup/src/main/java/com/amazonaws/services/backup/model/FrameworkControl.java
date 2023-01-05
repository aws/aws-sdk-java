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
 * Contains detailed information about all of the controls of a framework. Each framework must contain at least one
 * control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/FrameworkControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrameworkControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a control. This name is between 1 and 256 characters.
     * </p>
     */
    private String controlName;
    /**
     * <p>
     * A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     * </p>
     */
    private java.util.List<ControlInputParameter> controlInputParameters;
    /**
     * <p>
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control
     * scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. For more
     * information, see <a href="aws-backup/latest/devguide/API_ControlScope.html"> <code>ControlScope</code>.</a>
     * </p>
     */
    private ControlScope controlScope;

    /**
     * <p>
     * The name of a control. This name is between 1 and 256 characters.
     * </p>
     * 
     * @param controlName
     *        The name of a control. This name is between 1 and 256 characters.
     */

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    /**
     * <p>
     * The name of a control. This name is between 1 and 256 characters.
     * </p>
     * 
     * @return The name of a control. This name is between 1 and 256 characters.
     */

    public String getControlName() {
        return this.controlName;
    }

    /**
     * <p>
     * The name of a control. This name is between 1 and 256 characters.
     * </p>
     * 
     * @param controlName
     *        The name of a control. This name is between 1 and 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameworkControl withControlName(String controlName) {
        setControlName(controlName);
        return this;
    }

    /**
     * <p>
     * A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     * </p>
     * 
     * @return A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     */

    public java.util.List<ControlInputParameter> getControlInputParameters() {
        return controlInputParameters;
    }

    /**
     * <p>
     * A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     * </p>
     * 
     * @param controlInputParameters
     *        A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     */

    public void setControlInputParameters(java.util.Collection<ControlInputParameter> controlInputParameters) {
        if (controlInputParameters == null) {
            this.controlInputParameters = null;
            return;
        }

        this.controlInputParameters = new java.util.ArrayList<ControlInputParameter>(controlInputParameters);
    }

    /**
     * <p>
     * A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlInputParameters(java.util.Collection)} or
     * {@link #withControlInputParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param controlInputParameters
     *        A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameworkControl withControlInputParameters(ControlInputParameter... controlInputParameters) {
        if (this.controlInputParameters == null) {
            setControlInputParameters(new java.util.ArrayList<ControlInputParameter>(controlInputParameters.length));
        }
        for (ControlInputParameter ele : controlInputParameters) {
            this.controlInputParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     * </p>
     * 
     * @param controlInputParameters
     *        A list of <code>ParameterName</code> and <code>ParameterValue</code> pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameworkControl withControlInputParameters(java.util.Collection<ControlInputParameter> controlInputParameters) {
        setControlInputParameters(controlInputParameters);
        return this;
    }

    /**
     * <p>
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control
     * scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. For more
     * information, see <a href="aws-backup/latest/devguide/API_ControlScope.html"> <code>ControlScope</code>.</a>
     * </p>
     * 
     * @param controlScope
     *        The scope of a control. The control scope defines what the control will evaluate. Three examples of
     *        control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. For
     *        more information, see <a href="aws-backup/latest/devguide/API_ControlScope.html">
     *        <code>ControlScope</code>.</a>
     */

    public void setControlScope(ControlScope controlScope) {
        this.controlScope = controlScope;
    }

    /**
     * <p>
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control
     * scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. For more
     * information, see <a href="aws-backup/latest/devguide/API_ControlScope.html"> <code>ControlScope</code>.</a>
     * </p>
     * 
     * @return The scope of a control. The control scope defines what the control will evaluate. Three examples of
     *         control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     *         For more information, see <a href="aws-backup/latest/devguide/API_ControlScope.html">
     *         <code>ControlScope</code>.</a>
     */

    public ControlScope getControlScope() {
        return this.controlScope;
    }

    /**
     * <p>
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control
     * scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. For more
     * information, see <a href="aws-backup/latest/devguide/API_ControlScope.html"> <code>ControlScope</code>.</a>
     * </p>
     * 
     * @param controlScope
     *        The scope of a control. The control scope defines what the control will evaluate. Three examples of
     *        control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. For
     *        more information, see <a href="aws-backup/latest/devguide/API_ControlScope.html">
     *        <code>ControlScope</code>.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameworkControl withControlScope(ControlScope controlScope) {
        setControlScope(controlScope);
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
        if (getControlName() != null)
            sb.append("ControlName: ").append(getControlName()).append(",");
        if (getControlInputParameters() != null)
            sb.append("ControlInputParameters: ").append(getControlInputParameters()).append(",");
        if (getControlScope() != null)
            sb.append("ControlScope: ").append(getControlScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameworkControl == false)
            return false;
        FrameworkControl other = (FrameworkControl) obj;
        if (other.getControlName() == null ^ this.getControlName() == null)
            return false;
        if (other.getControlName() != null && other.getControlName().equals(this.getControlName()) == false)
            return false;
        if (other.getControlInputParameters() == null ^ this.getControlInputParameters() == null)
            return false;
        if (other.getControlInputParameters() != null && other.getControlInputParameters().equals(this.getControlInputParameters()) == false)
            return false;
        if (other.getControlScope() == null ^ this.getControlScope() == null)
            return false;
        if (other.getControlScope() != null && other.getControlScope().equals(this.getControlScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlName() == null) ? 0 : getControlName().hashCode());
        hashCode = prime * hashCode + ((getControlInputParameters() == null) ? 0 : getControlInputParameters().hashCode());
        hashCode = prime * hashCode + ((getControlScope() == null) ? 0 : getControlScope().hashCode());
        return hashCode;
    }

    @Override
    public FrameworkControl clone() {
        try {
            return (FrameworkControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.FrameworkControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
