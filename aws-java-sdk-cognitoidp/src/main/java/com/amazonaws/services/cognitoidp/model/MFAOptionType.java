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
 * Specifies the different settings for multi-factor authentication (MFA).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/MFAOptionType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MFAOptionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     */
    private String deliveryMedium;
    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or SMS message) to send the MFA code.
     * @see DeliveryMediumType
     */

    public void setDeliveryMedium(String deliveryMedium) {
        this.deliveryMedium = deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * 
     * @return The delivery medium (email message or SMS message) to send the MFA code.
     * @see DeliveryMediumType
     */

    public String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or SMS message) to send the MFA code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public MFAOptionType withDeliveryMedium(String deliveryMedium) {
        setDeliveryMedium(deliveryMedium);
        return this;
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or SMS message) to send the MFA code.
     * @see DeliveryMediumType
     */

    public void setDeliveryMedium(DeliveryMediumType deliveryMedium) {
        withDeliveryMedium(deliveryMedium);
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or SMS message) to send the MFA code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public MFAOptionType withDeliveryMedium(DeliveryMediumType deliveryMedium) {
        this.deliveryMedium = deliveryMedium.toString();
        return this;
    }

    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     * 
     * @param attributeName
     *        The attribute name of the MFA option type.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     * 
     * @return The attribute name of the MFA option type.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     * 
     * @param attributeName
     *        The attribute name of the MFA option type.
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
