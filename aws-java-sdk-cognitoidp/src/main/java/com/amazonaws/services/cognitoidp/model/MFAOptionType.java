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
 * <i>This data type is no longer supported.</i> You can use it only for SMS MFA configurations. You can't use it for
 * TOTP software token MFA configurations.
 * </p>
 * <p>
 * To set either type of MFA configuration, use the <a>AdminSetUserMFAPreference</a> or <a>SetUserMFAPreference</a>
 * actions.
 * </p>
 * <p>
 * To look up information about either type of MFA configuration, use the <a>AdminGetUserResponse$UserMFASettingList</a>
 * or <a>GetUserResponse$UserMFASettingList</a> responses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/MFAOptionType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MFAOptionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code> delivery
     * medium value.
     * </p>
     */
    private String deliveryMedium;
    /**
     * <p>
     * The attribute name of the MFA option type. The only valid value is <code>phone_number</code>.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code> delivery
     * medium value.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code>
     *        delivery medium value.
     * @see DeliveryMediumType
     */

    public void setDeliveryMedium(String deliveryMedium) {
        this.deliveryMedium = deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code> delivery
     * medium value.
     * </p>
     * 
     * @return The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code>
     *         delivery medium value.
     * @see DeliveryMediumType
     */

    public String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code> delivery
     * medium value.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code>
     *        delivery medium value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public MFAOptionType withDeliveryMedium(String deliveryMedium) {
        setDeliveryMedium(deliveryMedium);
        return this;
    }

    /**
     * <p>
     * The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code> delivery
     * medium value.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code>
     *        delivery medium value.
     * @see DeliveryMediumType
     */

    public void setDeliveryMedium(DeliveryMediumType deliveryMedium) {
        withDeliveryMedium(deliveryMedium);
    }

    /**
     * <p>
     * The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code> delivery
     * medium value.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium to send the MFA code. You can use this parameter to set only the <code>SMS</code>
     *        delivery medium value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public MFAOptionType withDeliveryMedium(DeliveryMediumType deliveryMedium) {
        this.deliveryMedium = deliveryMedium.toString();
        return this;
    }

    /**
     * <p>
     * The attribute name of the MFA option type. The only valid value is <code>phone_number</code>.
     * </p>
     * 
     * @param attributeName
     *        The attribute name of the MFA option type. The only valid value is <code>phone_number</code>.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name of the MFA option type. The only valid value is <code>phone_number</code>.
     * </p>
     * 
     * @return The attribute name of the MFA option type. The only valid value is <code>phone_number</code>.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The attribute name of the MFA option type. The only valid value is <code>phone_number</code>.
     * </p>
     * 
     * @param attributeName
     *        The attribute name of the MFA option type. The only valid value is <code>phone_number</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MFAOptionType withAttributeName(String attributeName) {
        setAttributeName(attributeName);
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
        if (getDeliveryMedium() != null)
            sb.append("DeliveryMedium: ").append(getDeliveryMedium()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MFAOptionType == false)
            return false;
        MFAOptionType other = (MFAOptionType) obj;
        if (other.getDeliveryMedium() == null ^ this.getDeliveryMedium() == null)
            return false;
        if (other.getDeliveryMedium() != null && other.getDeliveryMedium().equals(this.getDeliveryMedium()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryMedium() == null) ? 0 : getDeliveryMedium().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public MFAOptionType clone() {
        try {
            return (MFAOptionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.MFAOptionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
