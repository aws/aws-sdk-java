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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains additional details about the context of the request. Verified Permissions evaluates this information in an
 * authorization request as part of the <code>when</code> and <code>unless</code> clauses in a policy.
 * </p>
 * <p>
 * This data type is used as a request parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorized.html">IsAuthorized</a>, <a
 * href
 * ="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_BatchIsAuthorized.html">BatchIsAuthorized
 * </a>, and <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
 * >IsAuthorizedWithToken</a> operations.
 * </p>
 * <p>
 * Example: <code>"context":{"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}}</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ContextDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContextDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An list of attributes that are needed to successfully evaluate an authorization request. Each attribute in this
     * array must include a map of a data type and its value.
     * </p>
     * <p>
     * Example: <code>"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}</code>
     * </p>
     */
    private java.util.Map<String, AttributeValue> contextMap;

    /**
     * <p>
     * An list of attributes that are needed to successfully evaluate an authorization request. Each attribute in this
     * array must include a map of a data type and its value.
     * </p>
     * <p>
     * Example: <code>"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}</code>
     * </p>
     * 
     * @return An list of attributes that are needed to successfully evaluate an authorization request. Each attribute
     *         in this array must include a map of a data type and its value.</p>
     *         <p>
     *         Example: <code>"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}</code>
     */

    public java.util.Map<String, AttributeValue> getContextMap() {
        return contextMap;
    }

    /**
     * <p>
     * An list of attributes that are needed to successfully evaluate an authorization request. Each attribute in this
     * array must include a map of a data type and its value.
     * </p>
     * <p>
     * Example: <code>"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}</code>
     * </p>
     * 
     * @param contextMap
     *        An list of attributes that are needed to successfully evaluate an authorization request. Each attribute in
     *        this array must include a map of a data type and its value.</p>
     *        <p>
     *        Example: <code>"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}</code>
     */

    public void setContextMap(java.util.Map<String, AttributeValue> contextMap) {
        this.contextMap = contextMap;
    }

    /**
     * <p>
     * An list of attributes that are needed to successfully evaluate an authorization request. Each attribute in this
     * array must include a map of a data type and its value.
     * </p>
     * <p>
     * Example: <code>"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}</code>
     * </p>
     * 
     * @param contextMap
     *        An list of attributes that are needed to successfully evaluate an authorization request. Each attribute in
     *        this array must include a map of a data type and its value.</p>
     *        <p>
     *        Example: <code>"contextMap":{"&lt;KeyName1&gt;":{"boolean":true},"&lt;KeyName2&gt;":{"long":1234}}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDefinition withContextMap(java.util.Map<String, AttributeValue> contextMap) {
        setContextMap(contextMap);
        return this;
    }

    /**
     * Add a single ContextMap entry
     *
     * @see ContextDefinition#withContextMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContextDefinition addContextMapEntry(String key, AttributeValue value) {
        if (null == this.contextMap) {
            this.contextMap = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.contextMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.contextMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ContextMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextDefinition clearContextMapEntries() {
        this.contextMap = null;
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
        if (getContextMap() != null)
            sb.append("ContextMap: ").append(getContextMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContextDefinition == false)
            return false;
        ContextDefinition other = (ContextDefinition) obj;
        if (other.getContextMap() == null ^ this.getContextMap() == null)
            return false;
        if (other.getContextMap() != null && other.getContextMap().equals(this.getContextMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContextMap() == null) ? 0 : getContextMap().hashCode());
        return hashCode;
    }

    @Override
    public ContextDefinition clone() {
        try {
            return (ContextDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.ContextDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
