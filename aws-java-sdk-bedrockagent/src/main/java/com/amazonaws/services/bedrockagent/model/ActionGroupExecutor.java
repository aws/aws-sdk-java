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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the Lambda function containing the business logic that is carried out upon invoking the action
 * or the custom control method for handling the information elicited from the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ActionGroupExecutor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionGroupExecutor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     * <code>RETURN_CONTROL</code>.
     * </p>
     */
    private String customControl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action.
     * </p>
     */
    private String lambda;

    /**
     * <p>
     * To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     * <code>RETURN_CONTROL</code>.
     * </p>
     * 
     * @param customControl
     *        To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     *        <code>RETURN_CONTROL</code>.
     * @see CustomControlMethod
     */

    public void setCustomControl(String customControl) {
        this.customControl = customControl;
    }

    /**
     * <p>
     * To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     * <code>RETURN_CONTROL</code>.
     * </p>
     * 
     * @return To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     *         <code>RETURN_CONTROL</code>.
     * @see CustomControlMethod
     */

    public String getCustomControl() {
        return this.customControl;
    }

    /**
     * <p>
     * To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     * <code>RETURN_CONTROL</code>.
     * </p>
     * 
     * @param customControl
     *        To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     *        <code>RETURN_CONTROL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomControlMethod
     */

    public ActionGroupExecutor withCustomControl(String customControl) {
        setCustomControl(customControl);
        return this;
    }

    /**
     * <p>
     * To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     * <code>RETURN_CONTROL</code>.
     * </p>
     * 
     * @param customControl
     *        To return the action group invocation results directly in the <code>InvokeAgent</code> response, specify
     *        <code>RETURN_CONTROL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomControlMethod
     */

    public ActionGroupExecutor withCustomControl(CustomControlMethod customControl) {
        this.customControl = customControl.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action.
     * </p>
     * 
     * @param lambda
     *        The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out
     *        upon invoking the action.
     */

    public void setLambda(String lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out
     *         upon invoking the action.
     */

    public String getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out upon
     * invoking the action.
     * </p>
     * 
     * @param lambda
     *        The Amazon Resource Name (ARN) of the Lambda function containing the business logic that is carried out
     *        upon invoking the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionGroupExecutor withLambda(String lambda) {
        setLambda(lambda);
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
        if (getCustomControl() != null)
            sb.append("CustomControl: ").append(getCustomControl()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionGroupExecutor == false)
            return false;
        ActionGroupExecutor other = (ActionGroupExecutor) obj;
        if (other.getCustomControl() == null ^ this.getCustomControl() == null)
            return false;
        if (other.getCustomControl() != null && other.getCustomControl().equals(this.getCustomControl()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomControl() == null) ? 0 : getCustomControl().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public ActionGroupExecutor clone() {
        try {
            return (ActionGroupExecutor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ActionGroupExecutorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
