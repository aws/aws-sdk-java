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
 * The code delivery details being returned from the server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CodeDeliveryDetailsType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeDeliveryDetailsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     */
    private String deliveryMedium;
    /**
     * <p>
     * The attribute name.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     * 
     * @param destination
     *        The destination for the code delivery details.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     * 
     * @return The destination for the code delivery details.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     * 
     * @param destination
     *        The destination for the code delivery details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDeliveryDetailsType withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or phone number).
     * @see DeliveryMediumType
     */

    public void setDeliveryMedium(String deliveryMedium) {
        this.deliveryMedium = deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * 
     * @return The delivery medium (email message or phone number).
     * @see DeliveryMediumType
     */

    public String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or phone number).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public CodeDeliveryDetailsType withDeliveryMedium(String deliveryMedium) {
        setDeliveryMedium(deliveryMedium);
        return this;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or phone number).
     * @see DeliveryMediumType
     */

    public void setDeliveryMedium(DeliveryMediumType deliveryMedium) {
        withDeliveryMedium(deliveryMedium);
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * 
     * @param deliveryMedium
     *        The delivery medium (email message or phone number).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMediumType
     */

    public CodeDeliveryDetailsType withDeliveryMedium(DeliveryMediumType deliveryMedium) {
        this.deliveryMedium = deliveryMedium.toString();
        return this;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * 
     * @param attributeName
     *        The attribute name.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * 
     * @return The attribute name.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * 
     * @param attributeName
     *        The attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDeliveryDetailsType withAttributeName(String attributeName) {
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
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

        if (obj instanceof CodeDeliveryDetailsType == false)
            return false;
        CodeDeliveryDetailsType other = (CodeDeliveryDetailsType) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDeliveryMedium() == null) ? 0 : getDeliveryMedium().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public CodeDeliveryDetailsType clone() {
        try {
            return (CodeDeliveryDetailsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.CodeDeliveryDetailsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
