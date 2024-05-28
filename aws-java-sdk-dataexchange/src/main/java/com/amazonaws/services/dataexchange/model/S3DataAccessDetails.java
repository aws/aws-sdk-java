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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Extra details specific to the affected scope in this S3 Data Access data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/S3DataAccessDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataAccessDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the key prefixes affected by this notification. This can have up to 50 entries.
     * </p>
     */
    private java.util.List<String> keyPrefixes;
    /**
     * <p>
     * A list of the keys affected by this notification. This can have up to 50 entries.
     * </p>
     */
    private java.util.List<String> keys;

    /**
     * <p>
     * A list of the key prefixes affected by this notification. This can have up to 50 entries.
     * </p>
     * 
     * @return A list of the key prefixes affected by this notification. This can have up to 50 entries.
     */

    public java.util.List<String> getKeyPrefixes() {
        return keyPrefixes;
    }

    /**
     * <p>
     * A list of the key prefixes affected by this notification. This can have up to 50 entries.
     * </p>
     * 
     * @param keyPrefixes
     *        A list of the key prefixes affected by this notification. This can have up to 50 entries.
     */

    public void setKeyPrefixes(java.util.Collection<String> keyPrefixes) {
        if (keyPrefixes == null) {
            this.keyPrefixes = null;
            return;
        }

        this.keyPrefixes = new java.util.ArrayList<String>(keyPrefixes);
    }

    /**
     * <p>
     * A list of the key prefixes affected by this notification. This can have up to 50 entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPrefixes(java.util.Collection)} or {@link #withKeyPrefixes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyPrefixes
     *        A list of the key prefixes affected by this notification. This can have up to 50 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessDetails withKeyPrefixes(String... keyPrefixes) {
        if (this.keyPrefixes == null) {
            setKeyPrefixes(new java.util.ArrayList<String>(keyPrefixes.length));
        }
        for (String ele : keyPrefixes) {
            this.keyPrefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the key prefixes affected by this notification. This can have up to 50 entries.
     * </p>
     * 
     * @param keyPrefixes
     *        A list of the key prefixes affected by this notification. This can have up to 50 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessDetails withKeyPrefixes(java.util.Collection<String> keyPrefixes) {
        setKeyPrefixes(keyPrefixes);
        return this;
    }

    /**
     * <p>
     * A list of the keys affected by this notification. This can have up to 50 entries.
     * </p>
     * 
     * @return A list of the keys affected by this notification. This can have up to 50 entries.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * A list of the keys affected by this notification. This can have up to 50 entries.
     * </p>
     * 
     * @param keys
     *        A list of the keys affected by this notification. This can have up to 50 entries.
     */

    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<String>(keys);
    }

    /**
     * <p>
     * A list of the keys affected by this notification. This can have up to 50 entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        A list of the keys affected by this notification. This can have up to 50 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessDetails withKeys(String... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<String>(keys.length));
        }
        for (String ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the keys affected by this notification. This can have up to 50 entries.
     * </p>
     * 
     * @param keys
     *        A list of the keys affected by this notification. This can have up to 50 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessDetails withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
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
        if (getKeyPrefixes() != null)
            sb.append("KeyPrefixes: ").append(getKeyPrefixes()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataAccessDetails == false)
            return false;
        S3DataAccessDetails other = (S3DataAccessDetails) obj;
        if (other.getKeyPrefixes() == null ^ this.getKeyPrefixes() == null)
            return false;
        if (other.getKeyPrefixes() != null && other.getKeyPrefixes().equals(this.getKeyPrefixes()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPrefixes() == null) ? 0 : getKeyPrefixes().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public S3DataAccessDetails clone() {
        try {
            return (S3DataAccessDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.S3DataAccessDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
