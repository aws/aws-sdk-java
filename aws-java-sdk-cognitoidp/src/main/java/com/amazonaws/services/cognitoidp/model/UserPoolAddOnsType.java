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
 * The user pool add-ons type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserPoolAddOnsType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolAddOnsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The advanced security mode.
     * </p>
     */
    private String advancedSecurityMode;

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * 
     * @param advancedSecurityMode
     *        The advanced security mode.
     * @see AdvancedSecurityModeType
     */

    public void setAdvancedSecurityMode(String advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode;
    }

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * 
     * @return The advanced security mode.
     * @see AdvancedSecurityModeType
     */

    public String getAdvancedSecurityMode() {
        return this.advancedSecurityMode;
    }

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * 
     * @param advancedSecurityMode
     *        The advanced security mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdvancedSecurityModeType
     */

    public UserPoolAddOnsType withAdvancedSecurityMode(String advancedSecurityMode) {
        setAdvancedSecurityMode(advancedSecurityMode);
        return this;
    }

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * 
     * @param advancedSecurityMode
     *        The advanced security mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdvancedSecurityModeType
     */

    public UserPoolAddOnsType withAdvancedSecurityMode(AdvancedSecurityModeType advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode.toString();
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
        if (getAdvancedSecurityMode() != null)
            sb.append("AdvancedSecurityMode: ").append(getAdvancedSecurityMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolAddOnsType == false)
            return false;
        UserPoolAddOnsType other = (UserPoolAddOnsType) obj;
        if (other.getAdvancedSecurityMode() == null ^ this.getAdvancedSecurityMode() == null)
            return false;
        if (other.getAdvancedSecurityMode() != null && other.getAdvancedSecurityMode().equals(this.getAdvancedSecurityMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdvancedSecurityMode() == null) ? 0 : getAdvancedSecurityMode().hashCode());
        return hashCode;
    }

    @Override
    public UserPoolAddOnsType clone() {
        try {
            return (UserPoolAddOnsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UserPoolAddOnsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
