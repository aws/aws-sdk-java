/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/GetSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of information about the intents used in the session. The array can contain a maximum of three
     * summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the intents
     * with the specified label.
     * </p>
     */
    private java.util.List<IntentSummary> recentIntentSummaryView;
    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;
    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     */
    private DialogAction dialogAction;

    /**
     * <p>
     * An array of information about the intents used in the session. The array can contain a maximum of three
     * summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the intents
     * with the specified label.
     * </p>
     * 
     * @return An array of information about the intents used in the session. The array can contain a maximum of three
     *         summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code>
     *         operation contains information about the last three intents used.</p>
     *         <p>
     *         If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the
     *         intents with the specified label.
     */

    public java.util.List<IntentSummary> getRecentIntentSummaryView() {
        return recentIntentSummaryView;
    }

    /**
     * <p>
     * An array of information about the intents used in the session. The array can contain a maximum of three
     * summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the intents
     * with the specified label.
     * </p>
     * 
     * @param recentIntentSummaryView
     *        An array of information about the intents used in the session. The array can contain a maximum of three
     *        summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code>
     *        operation contains information about the last three intents used.</p>
     *        <p>
     *        If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the
     *        intents with the specified label.
     */

    public void setRecentIntentSummaryView(java.util.Collection<IntentSummary> recentIntentSummaryView) {
        if (recentIntentSummaryView == null) {
            this.recentIntentSummaryView = null;
            return;
        }

        this.recentIntentSummaryView = new java.util.ArrayList<IntentSummary>(recentIntentSummaryView);
    }

    /**
     * <p>
     * An array of information about the intents used in the session. The array can contain a maximum of three
     * summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the intents
     * with the specified label.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecentIntentSummaryView(java.util.Collection)} or
     * {@link #withRecentIntentSummaryView(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recentIntentSummaryView
     *        An array of information about the intents used in the session. The array can contain a maximum of three
     *        summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code>
     *        operation contains information about the last three intents used.</p>
     *        <p>
     *        If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the
     *        intents with the specified label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withRecentIntentSummaryView(IntentSummary... recentIntentSummaryView) {
        if (this.recentIntentSummaryView == null) {
            setRecentIntentSummaryView(new java.util.ArrayList<IntentSummary>(recentIntentSummaryView.length));
        }
        for (IntentSummary ele : recentIntentSummaryView) {
            this.recentIntentSummaryView.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of information about the intents used in the session. The array can contain a maximum of three
     * summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code> operation
     * contains information about the last three intents used.
     * </p>
     * <p>
     * If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the intents
     * with the specified label.
     * </p>
     * 
     * @param recentIntentSummaryView
     *        An array of information about the intents used in the session. The array can contain a maximum of three
     *        summaries. If more than three intents are used in the session, the <code>recentIntentSummaryView</code>
     *        operation contains information about the last three intents used.</p>
     *        <p>
     *        If you set the <code>checkpointLabelFilter</code> parameter in the request, the array contains only the
     *        intents with the specified label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withRecentIntentSummaryView(java.util.Collection<IntentSummary> recentIntentSummaryView) {
        setRecentIntentSummaryView(recentIntentSummaryView);
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @return Map of key/value pairs representing the session-specific context information. It contains application
     *         information passed between Amazon Lex and a client application.
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing the session-specific context information. It contains application
     *        information passed between Amazon Lex and a client application.
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context information. It contains application information
     * passed between Amazon Lex and a client application.
     * </p>
     * 
     * @param sessionAttributes
     *        Map of key/value pairs representing the session-specific context information. It contains application
     *        information passed between Amazon Lex and a client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * Add a single SessionAttributes entry
     *
     * @see GetSessionResult#withSessionAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult addSessionAttributesEntry(String key, String value) {
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

    public GetSessionResult clearSessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        A unique identifier for the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * 
     * @return A unique identifier for the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        A unique identifier for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     * 
     * @param dialogAction
     *        Describes the current state of the bot.
     */

    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     * 
     * @return Describes the current state of the bot.
     */

    public DialogAction getDialogAction() {
        return this.dialogAction;
    }

    /**
     * <p>
     * Describes the current state of the bot.
     * </p>
     * 
     * @param dialogAction
     *        Describes the current state of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withDialogAction(DialogAction dialogAction) {
        setDialogAction(dialogAction);
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
        if (getRecentIntentSummaryView() != null)
            sb.append("RecentIntentSummaryView: ").append(getRecentIntentSummaryView()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getDialogAction() != null)
            sb.append("DialogAction: ").append(getDialogAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionResult == false)
            return false;
        GetSessionResult other = (GetSessionResult) obj;
        if (other.getRecentIntentSummaryView() == null ^ this.getRecentIntentSummaryView() == null)
            return false;
        if (other.getRecentIntentSummaryView() != null && other.getRecentIntentSummaryView().equals(this.getRecentIntentSummaryView()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getDialogAction() == null ^ this.getDialogAction() == null)
            return false;
        if (other.getDialogAction() != null && other.getDialogAction().equals(this.getDialogAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecentIntentSummaryView() == null) ? 0 : getRecentIntentSummaryView().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getDialogAction() == null) ? 0 : getDialogAction().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionResult clone() {
        try {
            return (GetSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
