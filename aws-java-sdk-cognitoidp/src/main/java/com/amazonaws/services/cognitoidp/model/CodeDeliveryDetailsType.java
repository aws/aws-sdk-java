/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The type of code delivery details being returned from the server.
 * </p>
 */
public class CodeDeliveryDetailsType implements Serializable, Cloneable {

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
     * The name of the attribute in the code delivery details type.
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
        this.deliveryMedium = deliveryMedium.toString();
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
        setDeliveryMedium(deliveryMedium);
        return this;
    }

    /**
     * <p>
     * The name of the attribute in the code delivery details type.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute in the code delivery details type.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute in the code delivery details type.
     * </p>
     * 
     * @return The name of the attribute in the code delivery details type.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute in the code delivery details type.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute in the code delivery details type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDeliveryDetailsType withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Destination: " + getDestination() + ",");
        if (getDeliveryMedium() != null)
            sb.append("DeliveryMedium: " + getDeliveryMedium() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName());
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
}
