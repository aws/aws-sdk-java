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
 * The current state of the conversation with the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DialogState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DialogState implements Serializable, Cloneable, StructuredPojo {

    private DialogAction dialogAction;

    private IntentOverride intent;
    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;

    /**
     * @param dialogAction
     */

    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    /**
     * @return
     */

    public DialogAction getDialogAction() {
        return this.dialogAction;
    }

    /**
     * @param dialogAction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogState withDialogAction(DialogAction dialogAction) {
        setDialogAction(dialogAction);
        return this;
    }

    /**
     * @param intent
     */

    public void setIntent(IntentOverride intent) {
        this.intent = intent;
    }

    /**
     * @return
     */

    public IntentOverride getIntent() {
        return this.intent;
    }

    /**
     * @param intent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogState withIntent(IntentOverride intent) {
        setIntent(intent);
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @return Map of key/value pairs representing session-specific context information. It contains application
     *         information passed between Amazon Lex and a client application.
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing session-specific context information. It contains application
     *        information passed between Amazon Lex and a client application.
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing session-specific context information. It contains application
     *        information passed between Amazon Lex and a client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogState withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * Add a single SessionAttributes entry
     *
     * @see DialogState#withSessionAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DialogState addSessionAttributesEntry(String key, String value) {
        if (null == this.sessionAttributes) {
            this.sessionAttributes = new java.util.HashMap<String, String>();
        }
        if (this.sessionAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sessionAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SessionAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogState clearSessionAttributesEntries() {
        this.sessionAttributes = null;
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
        if (getDialogAction() != null)
            sb.append("DialogAction: ").append(getDialogAction()).append(",");
        if (getIntent() != null)
            sb.append("Intent: ").append(getIntent()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append(getSessionAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DialogState == false)
            return false;
        DialogState other = (DialogState) obj;
        if (other.getDialogAction() == null ^ this.getDialogAction() == null)
            return false;
        if (other.getDialogAction() != null && other.getDialogAction().equals(this.getDialogAction()) == false)
            return false;
        if (other.getIntent() == null ^ this.getIntent() == null)
            return false;
        if (other.getIntent() != null && other.getIntent().equals(this.getIntent()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialogAction() == null) ? 0 : getDialogAction().hashCode());
        hashCode = prime * hashCode + ((getIntent() == null) ? 0 : getIntent().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DialogState clone() {
        try {
            return (DialogState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.DialogStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
