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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Account takeover actions type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AccountTakeoverActionsType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountTakeoverActionsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     */
    private AccountTakeoverActionType lowAction;
    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     */
    private AccountTakeoverActionType mediumAction;
    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     */
    private AccountTakeoverActionType highAction;

    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     * 
     * @param lowAction
     *        Action to take for a low risk.
     */

    public void setLowAction(AccountTakeoverActionType lowAction) {
        this.lowAction = lowAction;
    }

    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     * 
     * @return Action to take for a low risk.
     */

    public AccountTakeoverActionType getLowAction() {
        return this.lowAction;
    }

    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     * 
     * @param lowAction
     *        Action to take for a low risk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountTakeoverActionsType withLowAction(AccountTakeoverActionType lowAction) {
        setLowAction(lowAction);
        return this;
    }

    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     * 
     * @param mediumAction
     *        Action to take for a medium risk.
     */

    public void setMediumAction(AccountTakeoverActionType mediumAction) {
        this.mediumAction = mediumAction;
    }

    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     * 
     * @return Action to take for a medium risk.
     */

    public AccountTakeoverActionType getMediumAction() {
        return this.mediumAction;
    }

    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     * 
     * @param mediumAction
     *        Action to take for a medium risk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountTakeoverActionsType withMediumAction(AccountTakeoverActionType mediumAction) {
        setMediumAction(mediumAction);
        return this;
    }

    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     * 
     * @param highAction
     *        Action to take for a high risk.
     */

    public void setHighAction(AccountTakeoverActionType highAction) {
        this.highAction = highAction;
    }

    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     * 
     * @return Action to take for a high risk.
     */

    public AccountTakeoverActionType getHighAction() {
        return this.highAction;
    }

    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     * 
     * @param highAction
     *        Action to take for a high risk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountTakeoverActionsType withHighAction(AccountTakeoverActionType highAction) {
        setHighAction(highAction);
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
        if (getLowAction() != null)
            sb.append("LowAction: ").append(getLowAction()).append(",");
        if (getMediumAction() != null)
            sb.append("MediumAction: ").append(getMediumAction()).append(",");
        if (getHighAction() != null)
            sb.append("HighAction: ").append(getHighAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountTakeoverActionsType == false)
            return false;
        AccountTakeoverActionsType other = (AccountTakeoverActionsType) obj;
        if (other.getLowAction() == null ^ this.getLowAction() == null)
            return false;
        if (other.getLowAction() != null && other.getLowAction().equals(this.getLowAction()) == false)
            return false;
        if (other.getMediumAction() == null ^ this.getMediumAction() == null)
            return false;
        if (other.getMediumAction() != null && other.getMediumAction().equals(this.getMediumAction()) == false)
            return false;
        if (other.getHighAction() == null ^ this.getHighAction() == null)
            return false;
        if (other.getHighAction() != null && other.getHighAction().equals(this.getHighAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLowAction() == null) ? 0 : getLowAction().hashCode());
        hashCode = prime * hashCode + ((getMediumAction() == null) ? 0 : getMediumAction().hashCode());
        hashCode = prime * hashCode + ((getHighAction() == null) ? 0 : getHighAction().hashCode());
        return hashCode;
    }

    @Override
    public AccountTakeoverActionsType clone() {
        try {
            return (AccountTakeoverActionsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AccountTakeoverActionsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
