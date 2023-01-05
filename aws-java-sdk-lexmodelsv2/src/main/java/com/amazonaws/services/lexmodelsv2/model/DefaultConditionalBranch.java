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
 * A set of actions that Amazon Lex should run if none of the other conditions are met.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DefaultConditionalBranch"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultConditionalBranch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The next step in the conversation.
     * </p>
     */
    private DialogState nextStep;

    private ResponseSpecification response;

    /**
     * <p>
     * The next step in the conversation.
     * </p>
     * 
     * @param nextStep
     *        The next step in the conversation.
     */

    public void setNextStep(DialogState nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * <p>
     * The next step in the conversation.
     * </p>
     * 
     * @return The next step in the conversation.
     */

    public DialogState getNextStep() {
        return this.nextStep;
    }

    /**
     * <p>
     * The next step in the conversation.
     * </p>
     * 
     * @param nextStep
     *        The next step in the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultConditionalBranch withNextStep(DialogState nextStep) {
        setNextStep(nextStep);
        return this;
    }

    /**
     * @param response
     */

    public void setResponse(ResponseSpecification response) {
        this.response = response;
    }

    /**
     * @return
     */

    public ResponseSpecification getResponse() {
        return this.response;
    }

    /**
     * @param response
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultConditionalBranch withResponse(ResponseSpecification response) {
        setResponse(response);
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
        if (getNextStep() != null)
            sb.append("NextStep: ").append(getNextStep()).append(",");
        if (getResponse() != null)
            sb.append("Response: ").append(getResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultConditionalBranch == false)
            return false;
        DefaultConditionalBranch other = (DefaultConditionalBranch) obj;
        if (other.getNextStep() == null ^ this.getNextStep() == null)
            return false;
        if (other.getNextStep() != null && other.getNextStep().equals(this.getNextStep()) == false)
            return false;
        if (other.getResponse() == null ^ this.getResponse() == null)
            return false;
        if (other.getResponse() != null && other.getResponse().equals(this.getResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextStep() == null) ? 0 : getNextStep().hashCode());
        hashCode = prime * hashCode + ((getResponse() == null) ? 0 : getResponse().hashCode());
        return hashCode;
    }

    @Override
    public DefaultConditionalBranch clone() {
        try {
            return (DefaultConditionalBranch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.DefaultConditionalBranchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
