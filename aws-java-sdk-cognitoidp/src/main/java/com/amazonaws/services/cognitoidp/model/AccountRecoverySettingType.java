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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data type for <code>AccountRecoverySetting</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AccountRecoverySettingType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountRecoverySettingType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     */
    private java.util.List<RecoveryOptionType> recoveryMechanisms;

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     * 
     * @return The list of <code>RecoveryOptionTypes</code>.
     */

    public java.util.List<RecoveryOptionType> getRecoveryMechanisms() {
        return recoveryMechanisms;
    }

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     * 
     * @param recoveryMechanisms
     *        The list of <code>RecoveryOptionTypes</code>.
     */

    public void setRecoveryMechanisms(java.util.Collection<RecoveryOptionType> recoveryMechanisms) {
        if (recoveryMechanisms == null) {
            this.recoveryMechanisms = null;
            return;
        }

        this.recoveryMechanisms = new java.util.ArrayList<RecoveryOptionType>(recoveryMechanisms);
    }

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryMechanisms(java.util.Collection)} or {@link #withRecoveryMechanisms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recoveryMechanisms
     *        The list of <code>RecoveryOptionTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecoverySettingType withRecoveryMechanisms(RecoveryOptionType... recoveryMechanisms) {
        if (this.recoveryMechanisms == null) {
            setRecoveryMechanisms(new java.util.ArrayList<RecoveryOptionType>(recoveryMechanisms.length));
        }
        for (RecoveryOptionType ele : recoveryMechanisms) {
            this.recoveryMechanisms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     * 
     * @param recoveryMechanisms
     *        The list of <code>RecoveryOptionTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecoverySettingType withRecoveryMechanisms(java.util.Collection<RecoveryOptionType> recoveryMechanisms) {
        setRecoveryMechanisms(recoveryMechanisms);
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
        if (getRecoveryMechanisms() != null)
            sb.append("RecoveryMechanisms: ").append(getRecoveryMechanisms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountRecoverySettingType == false)
            return false;
        AccountRecoverySettingType other = (AccountRecoverySettingType) obj;
        if (other.getRecoveryMechanisms() == null ^ this.getRecoveryMechanisms() == null)
            return false;
        if (other.getRecoveryMechanisms() != null && other.getRecoveryMechanisms().equals(this.getRecoveryMechanisms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryMechanisms() == null) ? 0 : getRecoveryMechanisms().hashCode());
        return hashCode;
    }

    @Override
    public AccountRecoverySettingType clone() {
        try {
            return (AccountRecoverySettingType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AccountRecoverySettingTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
