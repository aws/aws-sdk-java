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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters for the association execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociationExecutionTargetsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationExecutionTargetsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key value used in the request.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value specified for the key.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key value used in the request.
     * </p>
     * 
     * @param key
     *        The key value used in the request.
     * @see AssociationExecutionTargetsFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key value used in the request.
     * </p>
     * 
     * @return The key value used in the request.
     * @see AssociationExecutionTargetsFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key value used in the request.
     * </p>
     * 
     * @param key
     *        The key value used in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationExecutionTargetsFilterKey
     */

    public AssociationExecutionTargetsFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The key value used in the request.
     * </p>
     * 
     * @param key
     *        The key value used in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationExecutionTargetsFilterKey
     */

    public AssociationExecutionTargetsFilter withKey(AssociationExecutionTargetsFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The value specified for the key.
     * </p>
     * 
     * @param value
     *        The value specified for the key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value specified for the key.
     * </p>
     * 
     * @return The value specified for the key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value specified for the key.
     * </p>
     * 
     * @param value
     *        The value specified for the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationExecutionTargetsFilter withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationExecutionTargetsFilter == false)
            return false;
        AssociationExecutionTargetsFilter other = (AssociationExecutionTargetsFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AssociationExecutionTargetsFilter clone() {
        try {
            return (AssociationExecutionTargetsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationExecutionTargetsFilterMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
