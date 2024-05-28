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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about completed key material rotations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RotationsListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotationsListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix time.
     * </p>
     */
    private java.util.Date rotationDate;
    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand">on-demand
     * rotation</a>.
     * </p>
     */
    private String rotationType;

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * 
     * @param keyId
     *        Unique identifier of the key.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * 
     * @return Unique identifier of the key.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * 
     * @param keyId
     *        Unique identifier of the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationsListEntry withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix time.
     * </p>
     * 
     * @param rotationDate
     *        Date and time that the key material rotation completed. Formatted as Unix time.
     */

    public void setRotationDate(java.util.Date rotationDate) {
        this.rotationDate = rotationDate;
    }

    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix time.
     * </p>
     * 
     * @return Date and time that the key material rotation completed. Formatted as Unix time.
     */

    public java.util.Date getRotationDate() {
        return this.rotationDate;
    }

    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix time.
     * </p>
     * 
     * @param rotationDate
     *        Date and time that the key material rotation completed. Formatted as Unix time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationsListEntry withRotationDate(java.util.Date rotationDate) {
        setRotationDate(rotationDate);
        return this;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand">on-demand
     * rotation</a>.
     * </p>
     * 
     * @param rotationType
     *        Identifies whether the key material rotation was a scheduled <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *        >automatic rotation</a> or an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *        >on-demand rotation</a>.
     * @see RotationType
     */

    public void setRotationType(String rotationType) {
        this.rotationType = rotationType;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand">on-demand
     * rotation</a>.
     * </p>
     * 
     * @return Identifies whether the key material rotation was a scheduled <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *         >automatic rotation</a> or an <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *         >on-demand rotation</a>.
     * @see RotationType
     */

    public String getRotationType() {
        return this.rotationType;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand">on-demand
     * rotation</a>.
     * </p>
     * 
     * @param rotationType
     *        Identifies whether the key material rotation was a scheduled <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *        >automatic rotation</a> or an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *        >on-demand rotation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RotationType
     */

    public RotationsListEntry withRotationType(String rotationType) {
        setRotationType(rotationType);
        return this;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand">on-demand
     * rotation</a>.
     * </p>
     * 
     * @param rotationType
     *        Identifies whether the key material rotation was a scheduled <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *        >automatic rotation</a> or an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *        >on-demand rotation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RotationType
     */

    public RotationsListEntry withRotationType(RotationType rotationType) {
        this.rotationType = rotationType.toString();
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getRotationDate() != null)
            sb.append("RotationDate: ").append(getRotationDate()).append(",");
        if (getRotationType() != null)
            sb.append("RotationType: ").append(getRotationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotationsListEntry == false)
            return false;
        RotationsListEntry other = (RotationsListEntry) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getRotationDate() == null ^ this.getRotationDate() == null)
            return false;
        if (other.getRotationDate() != null && other.getRotationDate().equals(this.getRotationDate()) == false)
            return false;
        if (other.getRotationType() == null ^ this.getRotationType() == null)
            return false;
        if (other.getRotationType() != null && other.getRotationType().equals(this.getRotationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getRotationDate() == null) ? 0 : getRotationDate().hashCode());
        hashCode = prime * hashCode + ((getRotationType() == null) ? 0 : getRotationType().hashCode());
        return hashCode;
    }

    @Override
    public RotationsListEntry clone() {
        try {
            return (RotationsListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.RotationsListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
