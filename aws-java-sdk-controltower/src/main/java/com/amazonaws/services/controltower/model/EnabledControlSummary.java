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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of enabled controls.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnabledControlSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnabledControlSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> guardrail.
     * </p>
     */
    private String controlIdentifier;

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> guardrail.
     * </p>
     * 
     * @param controlIdentifier
     *        The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with
     *        the exception of the <b>Region deny</b> guardrail.
     */

    public void setControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
    }

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> guardrail.
     * </p>
     * 
     * @return The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with
     *         the exception of the <b>Region deny</b> guardrail.
     */

    public String getControlIdentifier() {
        return this.controlIdentifier;
    }

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> guardrail.
     * </p>
     * 
     * @param controlIdentifier
     *        The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with
     *        the exception of the <b>Region deny</b> guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledControlSummary withControlIdentifier(String controlIdentifier) {
        setControlIdentifier(controlIdentifier);
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
        if (getControlIdentifier() != null)
            sb.append("ControlIdentifier: ").append(getControlIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledControlSummary == false)
            return false;
        EnabledControlSummary other = (EnabledControlSummary) obj;
        if (other.getControlIdentifier() == null ^ this.getControlIdentifier() == null)
            return false;
        if (other.getControlIdentifier() != null && other.getControlIdentifier().equals(this.getControlIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlIdentifier() == null) ? 0 : getControlIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EnabledControlSummary clone() {
        try {
            return (EnabledControlSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.EnabledControlSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
