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
 * Contains information about the contexts that a user is using in a session. You can configure Amazon Lex to set a
 * context when an intent is fulfilled, or you can set a context using the , , or operations.
 * </p>
 * <p>
 * Use a context to indicate to Amazon Lex intents that should be used as follow-up intents. For example, if the active
 * context is <code>order-fulfilled</code>, only intents that have <code>order-fulfilled</code> configured as a trigger
 * are considered for follow up.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/ActiveContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the context.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates the number of turns or seconds that the context is active. Once the time to live expires, the context
     * is no longer returned in a response.
     * </p>
     */
    private ActiveContextTimeToLive timeToLive;
    /**
     * <p>
     * A lis tof contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request.
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     */
    private java.util.Map<String, String> contextAttributes;

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param name
     *        The name of the context.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @return The name of the context.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param name
     *        The name of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates the number of turns or seconds that the context is active. Once the time to live expires, the context
     * is no longer returned in a response.
     * </p>
     * 
     * @param timeToLive
     *        Indicates the number of turns or seconds that the context is active. Once the time to live expires, the
     *        context is no longer returned in a response.
     */

    public void setTimeToLive(ActiveContextTimeToLive timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * Indicates the number of turns or seconds that the context is active. Once the time to live expires, the context
     * is no longer returned in a response.
     * </p>
     * 
     * @return Indicates the number of turns or seconds that the context is active. Once the time to live expires, the
     *         context is no longer returned in a response.
     */

    public ActiveContextTimeToLive getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * <p>
     * Indicates the number of turns or seconds that the context is active. Once the time to live expires, the context
     * is no longer returned in a response.
     * </p>
     * 
     * @param timeToLive
     *        Indicates the number of turns or seconds that the context is active. Once the time to live expires, the
     *        context is no longer returned in a response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext withTimeToLive(ActiveContextTimeToLive timeToLive) {
        setTimeToLive(timeToLive);
        return this;
    }

    /**
     * <p>
     * A lis tof contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request.
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     * 
     * @return A lis tof contexts active for the request. A context can be activated when a previous intent is
     *         fulfilled, or by including the context in the request.</p>
     *         <p>
     *         If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the
     *         session. If you specify an empty list, all contexts for the session are cleared.
     */

    public java.util.Map<String, String> getContextAttributes() {
        return contextAttributes;
    }

    /**
     * <p>
     * A lis tof contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request.
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     * 
     * @param contextAttributes
     *        A lis tof contexts active for the request. A context can be activated when a previous intent is fulfilled,
     *        or by including the context in the request.</p>
     *        <p>
     *        If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session.
     *        If you specify an empty list, all contexts for the session are cleared.
     */

    public void setContextAttributes(java.util.Map<String, String> contextAttributes) {
        this.contextAttributes = contextAttributes;
    }

    /**
     * <p>
     * A lis tof contexts active for the request. A context can be activated when a previous intent is fulfilled, or by
     * including the context in the request.
     * </p>
     * <p>
     * If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you
     * specify an empty list, all contexts for the session are cleared.
     * </p>
     * 
     * @param contextAttributes
     *        A lis tof contexts active for the request. A context can be activated when a previous intent is fulfilled,
     *        or by including the context in the request.</p>
     *        <p>
     *        If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session.
     *        If you specify an empty list, all contexts for the session are cleared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext withContextAttributes(java.util.Map<String, String> contextAttributes) {
        setContextAttributes(contextAttributes);
        return this;
    }

    /**
     * Add a single ContextAttributes entry
     *
     * @see ActiveContext#withContextAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext addContextAttributesEntry(String key, String value) {
        if (null == this.contextAttributes) {
            this.contextAttributes = new java.util.HashMap<String, String>();
        }
        if (this.contextAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.contextAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ContextAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext clearContextAttributesEntries() {
        this.contextAttributes = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTimeToLive() != null)
            sb.append("TimeToLive: ").append(getTimeToLive()).append(",");
        if (getContextAttributes() != null)
            sb.append("ContextAttributes: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveContext == false)
            return false;
        ActiveContext other = (ActiveContext) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getContextAttributes() == null ^ this.getContextAttributes() == null)
            return false;
        if (other.getContextAttributes() != null && other.getContextAttributes().equals(this.getContextAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getContextAttributes() == null) ? 0 : getContextAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ActiveContext clone() {
        try {
            return (ActiveContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.ActiveContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
