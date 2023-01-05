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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings that specify the dialog code hook that is called by Amazon Lex between eliciting slot values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ElicitationCodeHookInvocationSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElicitationCodeHookInvocationSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked for the dialog.
     * </p>
     */
    private Boolean enableCodeHookInvocation;
    /**
     * <p>
     * A label that indicates the dialog step from which the dialog code hook is happening.
     * </p>
     */
    private String invocationLabel;

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked for the dialog.
     * </p>
     * 
     * @param enableCodeHookInvocation
     *        Indicates whether a Lambda function should be invoked for the dialog.
     */

    public void setEnableCodeHookInvocation(Boolean enableCodeHookInvocation) {
        this.enableCodeHookInvocation = enableCodeHookInvocation;
    }

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked for the dialog.
     * </p>
     * 
     * @return Indicates whether a Lambda function should be invoked for the dialog.
     */

    public Boolean getEnableCodeHookInvocation() {
        return this.enableCodeHookInvocation;
    }

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked for the dialog.
     * </p>
     * 
     * @param enableCodeHookInvocation
     *        Indicates whether a Lambda function should be invoked for the dialog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElicitationCodeHookInvocationSetting withEnableCodeHookInvocation(Boolean enableCodeHookInvocation) {
        setEnableCodeHookInvocation(enableCodeHookInvocation);
        return this;
    }

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked for the dialog.
     * </p>
     * 
     * @return Indicates whether a Lambda function should be invoked for the dialog.
     */

    public Boolean isEnableCodeHookInvocation() {
        return this.enableCodeHookInvocation;
    }

    /**
     * <p>
     * A label that indicates the dialog step from which the dialog code hook is happening.
     * </p>
     * 
     * @param invocationLabel
     *        A label that indicates the dialog step from which the dialog code hook is happening.
     */

    public void setInvocationLabel(String invocationLabel) {
        this.invocationLabel = invocationLabel;
    }

    /**
     * <p>
     * A label that indicates the dialog step from which the dialog code hook is happening.
     * </p>
     * 
     * @return A label that indicates the dialog step from which the dialog code hook is happening.
     */

    public String getInvocationLabel() {
        return this.invocationLabel;
    }

    /**
     * <p>
     * A label that indicates the dialog step from which the dialog code hook is happening.
     * </p>
     * 
     * @param invocationLabel
     *        A label that indicates the dialog step from which the dialog code hook is happening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElicitationCodeHookInvocationSetting withInvocationLabel(String invocationLabel) {
        setInvocationLabel(invocationLabel);
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
        if (getEnableCodeHookInvocation() != null)
            sb.append("EnableCodeHookInvocation: ").append(getEnableCodeHookInvocation()).append(",");
        if (getInvocationLabel() != null)
            sb.append("InvocationLabel: ").append(getInvocationLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElicitationCodeHookInvocationSetting == false)
            return false;
        ElicitationCodeHookInvocationSetting other = (ElicitationCodeHookInvocationSetting) obj;
        if (other.getEnableCodeHookInvocation() == null ^ this.getEnableCodeHookInvocation() == null)
            return false;
        if (other.getEnableCodeHookInvocation() != null && other.getEnableCodeHookInvocation().equals(this.getEnableCodeHookInvocation()) == false)
            return false;
        if (other.getInvocationLabel() == null ^ this.getInvocationLabel() == null)
            return false;
        if (other.getInvocationLabel() != null && other.getInvocationLabel().equals(this.getInvocationLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableCodeHookInvocation() == null) ? 0 : getEnableCodeHookInvocation().hashCode());
        hashCode = prime * hashCode + ((getInvocationLabel() == null) ? 0 : getInvocationLabel().hashCode());
        return hashCode;
    }

    @Override
    public ElicitationCodeHookInvocationSetting clone() {
        try {
            return (ElicitationCodeHookInvocationSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ElicitationCodeHookInvocationSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
