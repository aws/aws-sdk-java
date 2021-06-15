/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of the user's session with Amazon Lex V2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/SessionState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The next step that Amazon Lex V2 should take in the conversation with a user.
     * </p>
     */
    private DialogAction dialogAction;
    /**
     * <p>
     * The active intent that Amazon Lex V2 is processing.
     * </p>
     */
    private Intent intent;
    /**
     * <p>
     * One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active, Amazon
     * Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     * </p>
     */
    private java.util.List<ActiveContext> activeContexts;
    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex V2 and a client application.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;
    /** <p/> */
    private String originatingRequestId;

    /**
     * <p>
     * The next step that Amazon Lex V2 should take in the conversation with a user.
     * </p>
     * 
     * @param dialogAction
     *        The next step that Amazon Lex V2 should take in the conversation with a user.
     */

    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    /**
     * <p>
     * The next step that Amazon Lex V2 should take in the conversation with a user.
     * </p>
     * 
     * @return The next step that Amazon Lex V2 should take in the conversation with a user.
     */

    public DialogAction getDialogAction() {
        return this.dialogAction;
    }

    /**
     * <p>
     * The next step that Amazon Lex V2 should take in the conversation with a user.
     * </p>
     * 
     * @param dialogAction
     *        The next step that Amazon Lex V2 should take in the conversation with a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionState withDialogAction(DialogAction dialogAction) {
        setDialogAction(dialogAction);
        return this;
    }

    /**
     * <p>
     * The active intent that Amazon Lex V2 is processing.
     * </p>
     * 
     * @param intent
     *        The active intent that Amazon Lex V2 is processing.
     */

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    /**
     * <p>
     * The active intent that Amazon Lex V2 is processing.
     * </p>
     * 
     * @return The active intent that Amazon Lex V2 is processing.
     */

    public Intent getIntent() {
        return this.intent;
    }

    /**
     * <p>
     * The active intent that Amazon Lex V2 is processing.
     * </p>
     * 
     * @param intent
     *        The active intent that Amazon Lex V2 is processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionState withIntent(Intent intent) {
        setIntent(intent);
        return this;
    }

    /**
     * <p>
     * One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active, Amazon
     * Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     * </p>
     * 
     * @return One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active,
     *         Amazon Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     */

    public java.util.List<ActiveContext> getActiveContexts() {
        return activeContexts;
    }

    /**
     * <p>
     * One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active, Amazon
     * Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     * </p>
     * 
     * @param activeContexts
     *        One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active,
     *        Amazon Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     */

    public void setActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        if (activeContexts == null) {
            this.activeContexts = null;
            return;
        }

        this.activeContexts = new java.util.ArrayList<ActiveContext>(activeContexts);
    }

    /**
     * <p>
     * One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active, Amazon
     * Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveContexts(java.util.Collection)} or {@link #withActiveContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param activeContexts
     *        One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active,
     *        Amazon Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionState withActiveContexts(ActiveContext... activeContexts) {
        if (this.activeContexts == null) {
            setActiveContexts(new java.util.ArrayList<ActiveContext>(activeContexts.length));
        }
        for (ActiveContext ele : activeContexts) {
            this.activeContexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active, Amazon
     * Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     * </p>
     * 
     * @param activeContexts
     *        One or more contexts that indicate to Amazon Lex V2 the context of a request. When a context is active,
     *        Amazon Lex V2 considers intents with the matching context as a trigger as the next intent in a session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionState withActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        setActiveContexts(activeContexts);
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex V2 and a client application.
     * </p>
     * 
     * @return Map of key/value pairs representing session-specific context information. It contains application
     *         information passed between Amazon Lex V2 and a client application.
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex V2 and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing session-specific context information. It contains application
     *        information passed between Amazon Lex V2 and a client application.
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information. It contains application information
     * passed between Amazon Lex V2 and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing session-specific context information. It contains application
     *        information passed between Amazon Lex V2 and a client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionState withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * Add a single SessionAttributes entry
     *
     * @see SessionState#withSessionAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SessionState addSessionAttributesEntry(String key, String value) {
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

    public SessionState clearSessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p/>
     * 
     * @param originatingRequestId
     */

    public void setOriginatingRequestId(String originatingRequestId) {
        this.originatingRequestId = originatingRequestId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getOriginatingRequestId() {
        return this.originatingRequestId;
    }

    /**
     * <p/>
     * 
     * @param originatingRequestId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionState withOriginatingRequestId(String originatingRequestId) {
        setOriginatingRequestId(originatingRequestId);
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
        if (getActiveContexts() != null)
            sb.append("ActiveContexts: ").append(getActiveContexts()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append(getSessionAttributes()).append(",");
        if (getOriginatingRequestId() != null)
            sb.append("OriginatingRequestId: ").append(getOriginatingRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionState == false)
            return false;
        SessionState other = (SessionState) obj;
        if (other.getDialogAction() == null ^ this.getDialogAction() == null)
            return false;
        if (other.getDialogAction() != null && other.getDialogAction().equals(this.getDialogAction()) == false)
            return false;
        if (other.getIntent() == null ^ this.getIntent() == null)
            return false;
        if (other.getIntent() != null && other.getIntent().equals(this.getIntent()) == false)
            return false;
        if (other.getActiveContexts() == null ^ this.getActiveContexts() == null)
            return false;
        if (other.getActiveContexts() != null && other.getActiveContexts().equals(this.getActiveContexts()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getOriginatingRequestId() == null ^ this.getOriginatingRequestId() == null)
            return false;
        if (other.getOriginatingRequestId() != null && other.getOriginatingRequestId().equals(this.getOriginatingRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialogAction() == null) ? 0 : getDialogAction().hashCode());
        hashCode = prime * hashCode + ((getIntent() == null) ? 0 : getIntent().hashCode());
        hashCode = prime * hashCode + ((getActiveContexts() == null) ? 0 : getActiveContexts().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getOriginatingRequestId() == null) ? 0 : getOriginatingRequestId().hashCode());
        return hashCode;
    }

    @Override
    public SessionState clone() {
        try {
            return (SessionState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.SessionStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
