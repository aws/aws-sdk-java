/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.importexport.model;

import java.io.Serializable;

/**
 * 
 */
public class GetShippingLabelResult implements Serializable, Cloneable {

    private String shippingLabelURL;

    private String warning;

    /**
     * Sets the value of the ShippingLabelURL property for this object.
     * 
     * @param shippingLabelURL
     *        The new value for the ShippingLabelURL property for this object.
     */
    public void setShippingLabelURL(String shippingLabelURL) {
        this.shippingLabelURL = shippingLabelURL;
    }

    /**
     * Returns the value of the ShippingLabelURL property for this object.
     * 
     * @return The value of the ShippingLabelURL property for this object.
     */
    public String getShippingLabelURL() {
        return this.shippingLabelURL;
    }

    /**
     * Sets the value of the ShippingLabelURL property for this object.
     * 
     * @param shippingLabelURL
     *        The new value for the ShippingLabelURL property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelResult withShippingLabelURL(String shippingLabelURL) {
        setShippingLabelURL(shippingLabelURL);
        return this;
    }

    /**
     * Sets the value of the Warning property for this object.
     * 
     * @param warning
     *        The new value for the Warning property for this object.
     */
    public void setWarning(String warning) {
        this.warning = warning;
    }

    /**
     * Returns the value of the Warning property for this object.
     * 
     * @return The value of the Warning property for this object.
     */
    public String getWarning() {
        return this.warning;
    }

    /**
     * Sets the value of the Warning property for this object.
     * 
     * @param warning
     *        The new value for the Warning property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelResult withWarning(String warning) {
        setWarning(warning);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getShippingLabelURL() != null)
            sb.append("ShippingLabelURL: " + getShippingLabelURL() + ",");
        if (getWarning() != null)
            sb.append("Warning: " + getWarning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShippingLabelResult == false)
            return false;
        GetShippingLabelResult other = (GetShippingLabelResult) obj;
        if (other.getShippingLabelURL() == null
                ^ this.getShippingLabelURL() == null)
            return false;
        if (other.getShippingLabelURL() != null
                && other.getShippingLabelURL().equals(
                        this.getShippingLabelURL()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null
                && other.getWarning().equals(this.getWarning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getShippingLabelURL() == null) ? 0 : getShippingLabelURL()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getWarning() == null) ? 0 : getWarning().hashCode());
        return hashCode;
    }

    @Override
    public GetShippingLabelResult clone() {
        try {
            return (GetShippingLabelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}