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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A prompt for additional activity after an intent is fulfilled. For example, after the <code>OrderPizza</code> intent
 * is fulfilled, you might prompt the user to find out whether the user wants to order drinks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/FollowUpPrompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FollowUpPrompt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     */
    private Prompt prompt;
    /**
     * <p>
     * If the user answers "no" to the question defined in the <code>prompt</code> field, Amazon Lex responds with this
     * statement to acknowledge that the intent was canceled.
     * </p>
     */
    private Statement rejectionStatement;

    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     * 
     * @param prompt
     *        Prompts for information from the user.
     */

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     * 
     * @return Prompts for information from the user.
     */

    public Prompt getPrompt() {
        return this.prompt;
    }

    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     * 
     * @param prompt
     *        Prompts for information from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FollowUpPrompt withPrompt(Prompt prompt) {
        setPrompt(prompt);
        return this;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in the <code>prompt</code> field, Amazon Lex responds with this
     * statement to acknowledge that the intent was canceled.
     * </p>
     * 
     * @param rejectionStatement
     *        If the user answers "no" to the question defined in the <code>prompt</code> field, Amazon Lex responds
     *        with this statement to acknowledge that the intent was canceled.
     */

    public void setRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in the <code>prompt</code> field, Amazon Lex responds with this
     * statement to acknowledge that the intent was canceled.
     * </p>
     * 
     * @return If the user answers "no" to the question defined in the <code>prompt</code> field, Amazon Lex responds
     *         with this statement to acknowledge that the intent was canceled.
     */

    public Statement getRejectionStatement() {
        return this.rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in the <code>prompt</code> field, Amazon Lex responds with this
     * statement to acknowledge that the intent was canceled.
     * </p>
     * 
     * @param rejectionStatement
     *        If the user answers "no" to the question defined in the <code>prompt</code> field, Amazon Lex responds
     *        with this statement to acknowledge that the intent was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FollowUpPrompt withRejectionStatement(Statement rejectionStatement) {
        setRejectionStatement(rejectionStatement);
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
        if (getPrompt() != null)
            sb.append("Prompt: ").append(getPrompt()).append(",");
        if (getRejectionStatement() != null)
            sb.append("RejectionStatement: ").append(getRejectionStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FollowUpPrompt == false)
            return false;
        FollowUpPrompt other = (FollowUpPrompt) obj;
        if (other.getPrompt() == null ^ this.getPrompt() == null)
            return false;
        if (other.getPrompt() != null && other.getPrompt().equals(this.getPrompt()) == false)
            return false;
        if (other.getRejectionStatement() == null ^ this.getRejectionStatement() == null)
            return false;
        if (other.getRejectionStatement() != null && other.getRejectionStatement().equals(this.getRejectionStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrompt() == null) ? 0 : getPrompt().hashCode());
        hashCode = prime * hashCode + ((getRejectionStatement() == null) ? 0 : getRejectionStatement().hashCode());
        return hashCode;
    }

    @Override
    public FollowUpPrompt clone() {
        try {
            return (FollowUpPrompt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.FollowUpPromptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
