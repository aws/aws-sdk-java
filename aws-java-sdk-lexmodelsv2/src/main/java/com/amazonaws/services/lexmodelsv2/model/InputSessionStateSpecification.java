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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifications for the current state of the dialog between the user and the bot in the test set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/InputSessionStateSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSessionStateSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Session attributes for the session state.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;
    /**
     * <p>
     * Active contexts for the session state.
     * </p>
     */
    private java.util.List<ActiveContext> activeContexts;
    /**
     * <p>
     * Runtime hints for the session state.
     * </p>
     */
    private RuntimeHints runtimeHints;

    /**
     * <p>
     * Session attributes for the session state.
     * </p>
     * 
     * @return Session attributes for the session state.
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Session attributes for the session state.
     * </p>
     * 
     * @param sessionAttributes
     *        Session attributes for the session state.
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Session attributes for the session state.
     * </p>
     * 
     * @param sessionAttributes
     *        Session attributes for the session state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSessionStateSpecification withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * Add a single SessionAttributes entry
     *
     * @see InputSessionStateSpecification#withSessionAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InputSessionStateSpecification addSessionAttributesEntry(String key, String value) {
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

    public InputSessionStateSpecification clearSessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * Active contexts for the session state.
     * </p>
     * 
     * @return Active contexts for the session state.
     */

    public java.util.List<ActiveContext> getActiveContexts() {
        return activeContexts;
    }

    /**
     * <p>
     * Active contexts for the session state.
     * </p>
     * 
     * @param activeContexts
     *        Active contexts for the session state.
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
     * Active contexts for the session state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveContexts(java.util.Collection)} or {@link #withActiveContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param activeContexts
     *        Active contexts for the session state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSessionStateSpecification withActiveContexts(ActiveContext... activeContexts) {
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
     * Active contexts for the session state.
     * </p>
     * 
     * @param activeContexts
     *        Active contexts for the session state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSessionStateSpecification withActiveContexts(java.util.Collection<ActiveContext> activeContexts) {
        setActiveContexts(activeContexts);
        return this;
    }

    /**
     * <p>
     * Runtime hints for the session state.
     * </p>
     * 
     * @param runtimeHints
     *        Runtime hints for the session state.
     */

    public void setRuntimeHints(RuntimeHints runtimeHints) {
        this.runtimeHints = runtimeHints;
    }

    /**
     * <p>
     * Runtime hints for the session state.
     * </p>
     * 
     * @return Runtime hints for the session state.
     */

    public RuntimeHints getRuntimeHints() {
        return this.runtimeHints;
    }

    /**
     * <p>
     * Runtime hints for the session state.
     * </p>
     * 
     * @param runtimeHints
     *        Runtime hints for the session state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSessionStateSpecification withRuntimeHints(RuntimeHints runtimeHints) {
        setRuntimeHints(runtimeHints);
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
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append(getSessionAttributes()).append(",");
        if (getActiveContexts() != null)
            sb.append("ActiveContexts: ").append(getActiveContexts()).append(",");
        if (getRuntimeHints() != null)
            sb.append("RuntimeHints: ").append(getRuntimeHints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSessionStateSpecification == false)
            return false;
        InputSessionStateSpecification other = (InputSessionStateSpecification) obj;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getActiveContexts() == null ^ this.getActiveContexts() == null)
            return false;
        if (other.getActiveContexts() != null && other.getActiveContexts().equals(this.getActiveContexts()) == false)
            return false;
        if (other.getRuntimeHints() == null ^ this.getRuntimeHints() == null)
            return false;
        if (other.getRuntimeHints() != null && other.getRuntimeHints().equals(this.getRuntimeHints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getActiveContexts() == null) ? 0 : getActiveContexts().hashCode());
        hashCode = prime * hashCode + ((getRuntimeHints() == null) ? 0 : getRuntimeHints().hashCode());
        return hashCode;
    }

    @Override
    public InputSessionStateSpecification clone() {
        try {
            return (InputSessionStateSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.InputSessionStateSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
