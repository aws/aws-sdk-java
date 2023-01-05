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
 * Settings that specify the dialog code hook that is called by Amazon Lex at a step of the conversation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DialogCodeHookInvocationSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DialogCodeHookInvocationSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked for the dialog.
     * </p>
     */
    private Boolean enableCodeHookInvocation;
    /**
     * <p>
     * Determines whether a dialog code hook is used when the intent is activated.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * A label that indicates the dialog step from which the dialog code hook is happening.
     * </p>
     */
    private String invocationLabel;
    /**
     * <p>
     * Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
     * </p>
     */
    private PostDialogCodeHookInvocationSpecification postCodeHookSpecification;

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

    public DialogCodeHookInvocationSetting withEnableCodeHookInvocation(Boolean enableCodeHookInvocation) {
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
     * Determines whether a dialog code hook is used when the intent is activated.
     * </p>
     * 
     * @param active
     *        Determines whether a dialog code hook is used when the intent is activated.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Determines whether a dialog code hook is used when the intent is activated.
     * </p>
     * 
     * @return Determines whether a dialog code hook is used when the intent is activated.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Determines whether a dialog code hook is used when the intent is activated.
     * </p>
     * 
     * @param active
     *        Determines whether a dialog code hook is used when the intent is activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogCodeHookInvocationSetting withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Determines whether a dialog code hook is used when the intent is activated.
     * </p>
     * 
     * @return Determines whether a dialog code hook is used when the intent is activated.
     */

    public Boolean isActive() {
        return this.active;
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

    public DialogCodeHookInvocationSetting withInvocationLabel(String invocationLabel) {
        setInvocationLabel(invocationLabel);
        return this;
    }

    /**
     * <p>
     * Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
     * </p>
     * 
     * @param postCodeHookSpecification
     *        Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
     */

    public void setPostCodeHookSpecification(PostDialogCodeHookInvocationSpecification postCodeHookSpecification) {
        this.postCodeHookSpecification = postCodeHookSpecification;
    }

    /**
     * <p>
     * Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
     * </p>
     * 
     * @return Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
     */

    public PostDialogCodeHookInvocationSpecification getPostCodeHookSpecification() {
        return this.postCodeHookSpecification;
    }

    /**
     * <p>
     * Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
     * </p>
     * 
     * @param postCodeHookSpecification
     *        Contains the responses and actions that Amazon Lex takes after the Lambda function is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogCodeHookInvocationSetting withPostCodeHookSpecification(PostDialogCodeHookInvocationSpecification postCodeHookSpecification) {
        setPostCodeHookSpecification(postCodeHookSpecification);
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
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getInvocationLabel() != null)
            sb.append("InvocationLabel: ").append(getInvocationLabel()).append(",");
        if (getPostCodeHookSpecification() != null)
            sb.append("PostCodeHookSpecification: ").append(getPostCodeHookSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DialogCodeHookInvocationSetting == false)
            return false;
        DialogCodeHookInvocationSetting other = (DialogCodeHookInvocationSetting) obj;
        if (other.getEnableCodeHookInvocation() == null ^ this.getEnableCodeHookInvocation() == null)
            return false;
        if (other.getEnableCodeHookInvocation() != null && other.getEnableCodeHookInvocation().equals(this.getEnableCodeHookInvocation()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getInvocationLabel() == null ^ this.getInvocationLabel() == null)
            return false;
        if (other.getInvocationLabel() != null && other.getInvocationLabel().equals(this.getInvocationLabel()) == false)
            return false;
        if (other.getPostCodeHookSpecification() == null ^ this.getPostCodeHookSpecification() == null)
            return false;
        if (other.getPostCodeHookSpecification() != null && other.getPostCodeHookSpecification().equals(this.getPostCodeHookSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableCodeHookInvocation() == null) ? 0 : getEnableCodeHookInvocation().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getInvocationLabel() == null) ? 0 : getInvocationLabel().hashCode());
        hashCode = prime * hashCode + ((getPostCodeHookSpecification() == null) ? 0 : getPostCodeHookSpecification().hashCode());
        return hashCode;
    }

    @Override
    public DialogCodeHookInvocationSetting clone() {
        try {
            return (DialogCodeHookInvocationSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.DialogCodeHookInvocationSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
