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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/Alias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A friendly name that you can use to refer to a key. The value must begin with <code>alias/</code>.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important>
     */
    private String aliasName;
    /**
     * <p>
     * The <code>KeyARN</code> of the key associated with the alias.
     * </p>
     */
    private String keyArn;

    /**
     * <p>
     * A friendly name that you can use to refer to a key. The value must begin with <code>alias/</code>.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important>
     * 
     * @param aliasName
     *        A friendly name that you can use to refer to a key. The value must begin with <code>alias/</code>.</p>
     *        <important>
     *        <p>
     *        Do not include confidential or sensitive information in this field. This field may be displayed in
     *        plaintext in CloudTrail logs and other output.
     *        </p>
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * A friendly name that you can use to refer to a key. The value must begin with <code>alias/</code>.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important>
     * 
     * @return A friendly name that you can use to refer to a key. The value must begin with <code>alias/</code>.</p>
     *         <important>
     *         <p>
     *         Do not include confidential or sensitive information in this field. This field may be displayed in
     *         plaintext in CloudTrail logs and other output.
     *         </p>
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * A friendly name that you can use to refer to a key. The value must begin with <code>alias/</code>.
     * </p>
     * <important>
     * <p>
     * Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important>
     * 
     * @param aliasName
     *        A friendly name that you can use to refer to a key. The value must begin with <code>alias/</code>.</p>
     *        <important>
     *        <p>
     *        Do not include confidential or sensitive information in this field. This field may be displayed in
     *        plaintext in CloudTrail logs and other output.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key associated with the alias.
     * </p>
     * 
     * @param keyArn
     *        The <code>KeyARN</code> of the key associated with the alias.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key associated with the alias.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the key associated with the alias.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key associated with the alias.
     * </p>
     * 
     * @param keyArn
     *        The <code>KeyARN</code> of the key associated with the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withKeyArn(String keyArn) {
        setKeyArn(keyArn);
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
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName()).append(",");
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alias == false)
            return false;
        Alias other = (Alias) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public Alias clone() {
        try {
            return (Alias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.AliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
