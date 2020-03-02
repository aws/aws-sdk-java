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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the default message for all channels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DefaultMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default body of the message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The default message variables to use in the message. You can override these default variables with individual
     * address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * <p>
     * The default body of the message.
     * </p>
     * 
     * @param body
     *        The default body of the message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The default body of the message.
     * </p>
     * 
     * @return The default body of the message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The default body of the message.
     * </p>
     * 
     * @param body
     *        The default body of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the message. You can override these default variables with individual
     * address variables.
     * </p>
     * 
     * @return The default message variables to use in the message. You can override these default variables with
     *         individual address variables.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the message. You can override these default variables with individual
     * address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the message. You can override these default variables with
     *        individual address variables.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the message. You can override these default variables with individual
     * address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the message. You can override these default variables with
     *        individual address variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    /**
     * Add a single Substitutions entry
     *
     * @see DefaultMessage#withSubstitutions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DefaultMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultMessage clearSubstitutionsEntries() {
        this.substitutions = null;
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultMessage == false)
            return false;
        DefaultMessage other = (DefaultMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        return hashCode;
    }

    @Override
    public DefaultMessage clone() {
        try {
            return (DefaultMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.DefaultMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
