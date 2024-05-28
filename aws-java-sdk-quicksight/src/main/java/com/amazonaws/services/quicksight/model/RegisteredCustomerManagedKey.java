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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A customer managed key structure that contains the information listed below:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>KeyArn</code> - The ARN of a KMS key that is registered to a Amazon QuickSight account for encryption and
 * decryption use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DefaultKey</code> - Indicates whether the current key is set as the default key for encryption and decryption
 * use.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisteredCustomerManagedKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredCustomerManagedKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the KMS key that is registered to a Amazon QuickSight account for encryption and decryption use.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption and
     * decryption use.
     * </p>
     */
    private Boolean defaultKey;

    /**
     * <p>
     * The ARN of the KMS key that is registered to a Amazon QuickSight account for encryption and decryption use.
     * </p>
     * 
     * @param keyArn
     *        The ARN of the KMS key that is registered to a Amazon QuickSight account for encryption and decryption
     *        use.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that is registered to a Amazon QuickSight account for encryption and decryption use.
     * </p>
     * 
     * @return The ARN of the KMS key that is registered to a Amazon QuickSight account for encryption and decryption
     *         use.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that is registered to a Amazon QuickSight account for encryption and decryption use.
     * </p>
     * 
     * @param keyArn
     *        The ARN of the KMS key that is registered to a Amazon QuickSight account for encryption and decryption
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredCustomerManagedKey withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption and
     * decryption use.
     * </p>
     * 
     * @param defaultKey
     *        Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption and
     *        decryption use.
     */

    public void setDefaultKey(Boolean defaultKey) {
        this.defaultKey = defaultKey;
    }

    /**
     * <p>
     * Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption and
     * decryption use.
     * </p>
     * 
     * @return Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption
     *         and decryption use.
     */

    public Boolean getDefaultKey() {
        return this.defaultKey;
    }

    /**
     * <p>
     * Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption and
     * decryption use.
     * </p>
     * 
     * @param defaultKey
     *        Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption and
     *        decryption use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredCustomerManagedKey withDefaultKey(Boolean defaultKey) {
        setDefaultKey(defaultKey);
        return this;
    }

    /**
     * <p>
     * Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption and
     * decryption use.
     * </p>
     * 
     * @return Indicates whether a <code>RegisteredCustomerManagedKey</code> is set as the default key for encryption
     *         and decryption use.
     */

    public Boolean isDefaultKey() {
        return this.defaultKey;
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getDefaultKey() != null)
            sb.append("DefaultKey: ").append(getDefaultKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredCustomerManagedKey == false)
            return false;
        RegisteredCustomerManagedKey other = (RegisteredCustomerManagedKey) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getDefaultKey() == null ^ this.getDefaultKey() == null)
            return false;
        if (other.getDefaultKey() != null && other.getDefaultKey().equals(this.getDefaultKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultKey() == null) ? 0 : getDefaultKey().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredCustomerManagedKey clone() {
        try {
            return (RegisteredCustomerManagedKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RegisteredCustomerManagedKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
