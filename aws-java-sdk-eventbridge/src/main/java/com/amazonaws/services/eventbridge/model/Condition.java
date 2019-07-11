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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A JSON string that you can use to limit the event bus permissions that you're granting to only accounts that fulfill
 * the condition. Currently, the only supported condition is membership in a certain AWS organization. The string must
 * contain <code>Type</code>, <code>Key</code>, and <code>Value</code> fields. The <code>Value</code> field specifies
 * the ID of the AWS organization. The following is an example value for <code>Condition</code>:
 * </p>
 * <p>
 * <code>'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of condition. Currently, the only supported value is <code>StringEquals</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The key for the condition. Currently, the only supported key is <code>aws:PrincipalOrgID</code>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value for the key. Currently, this must be the ID of the organization.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of condition. Currently, the only supported value is <code>StringEquals</code>.
     * </p>
     * 
     * @param type
     *        The type of condition. Currently, the only supported value is <code>StringEquals</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of condition. Currently, the only supported value is <code>StringEquals</code>.
     * </p>
     * 
     * @return The type of condition. Currently, the only supported value is <code>StringEquals</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of condition. Currently, the only supported value is <code>StringEquals</code>.
     * </p>
     * 
     * @param type
     *        The type of condition. Currently, the only supported value is <code>StringEquals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The key for the condition. Currently, the only supported key is <code>aws:PrincipalOrgID</code>.
     * </p>
     * 
     * @param key
     *        The key for the condition. Currently, the only supported key is <code>aws:PrincipalOrgID</code>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the condition. Currently, the only supported key is <code>aws:PrincipalOrgID</code>.
     * </p>
     * 
     * @return The key for the condition. Currently, the only supported key is <code>aws:PrincipalOrgID</code>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for the condition. Currently, the only supported key is <code>aws:PrincipalOrgID</code>.
     * </p>
     * 
     * @param key
     *        The key for the condition. Currently, the only supported key is <code>aws:PrincipalOrgID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value for the key. Currently, this must be the ID of the organization.
     * </p>
     * 
     * @param value
     *        The value for the key. Currently, this must be the ID of the organization.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the key. Currently, this must be the ID of the organization.
     * </p>
     * 
     * @return The value for the key. Currently, this must be the ID of the organization.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the key. Currently, this must be the ID of the organization.
     * </p>
     * 
     * @param value
     *        The value for the key. Currently, this must be the ID of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withValue(String value) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
