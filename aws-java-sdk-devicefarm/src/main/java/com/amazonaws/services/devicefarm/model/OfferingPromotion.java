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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about an offering promotion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/OfferingPromotion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferingPromotion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the offering promotion.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A string describing the offering promotion.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the offering promotion.
     * </p>
     * 
     * @param id
     *        The ID of the offering promotion.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the offering promotion.
     * </p>
     * 
     * @return The ID of the offering promotion.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the offering promotion.
     * </p>
     * 
     * @param id
     *        The ID of the offering promotion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingPromotion withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A string describing the offering promotion.
     * </p>
     * 
     * @param description
     *        A string describing the offering promotion.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string describing the offering promotion.
     * </p>
     * 
     * @return A string describing the offering promotion.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string describing the offering promotion.
     * </p>
     * 
     * @param description
     *        A string describing the offering promotion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingPromotion withDescription(String description) {
        setDescription(description);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfferingPromotion == false)
            return false;
        OfferingPromotion other = (OfferingPromotion) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public OfferingPromotion clone() {
        try {
            return (OfferingPromotion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.OfferingPromotionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
