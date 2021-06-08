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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A context is a variable that contains information about the current state of the conversation between a user and
 * Amazon Lex. Context can be set automatically by Amazon Lex when an intent is fulfilled, or it can be set at runtime
 * using the <code>PutContent</code>, <code>PutText</code>, or <code>PutSession</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/ActiveContext" target="_top">AWS API
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
     * The length of time or number of turns that a context remains active.
     * </p>
     */
    private ActiveContextTimeToLive timeToLive;
    /**
     * <p>
     * State variables for the current context. You can use these values as default values for slots in subsequent
     * events.
     * </p>
     */
    private java.util.Map<String, String> parameters;

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
     * The length of time or number of turns that a context remains active.
     * </p>
     * 
     * @param timeToLive
     *        The length of time or number of turns that a context remains active.
     */

    public void setTimeToLive(ActiveContextTimeToLive timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The length of time or number of turns that a context remains active.
     * </p>
     * 
     * @return The length of time or number of turns that a context remains active.
     */

    public ActiveContextTimeToLive getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * <p>
     * The length of time or number of turns that a context remains active.
     * </p>
     * 
     * @param timeToLive
     *        The length of time or number of turns that a context remains active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext withTimeToLive(ActiveContextTimeToLive timeToLive) {
        setTimeToLive(timeToLive);
        return this;
    }

    /**
     * <p>
     * State variables for the current context. You can use these values as default values for slots in subsequent
     * events.
     * </p>
     * 
     * @return State variables for the current context. You can use these values as default values for slots in
     *         subsequent events.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * State variables for the current context. You can use these values as default values for slots in subsequent
     * events.
     * </p>
     * 
     * @param parameters
     *        State variables for the current context. You can use these values as default values for slots in
     *        subsequent events.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * State variables for the current context. You can use these values as default values for slots in subsequent
     * events.
     * </p>
     * 
     * @param parameters
     *        State variables for the current context. You can use these values as default values for slots in
     *        subsequent events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see ActiveContext#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveContext clearParametersEntries() {
        this.parameters = null;
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
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***");
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
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
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
        com.amazonaws.services.lexruntime.model.transform.ActiveContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
