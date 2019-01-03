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
package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetShippingLabelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String shippingLabelURL;

    private String warning;

    /**
     * @param shippingLabelURL
     */

    public void setShippingLabelURL(String shippingLabelURL) {
        this.shippingLabelURL = shippingLabelURL;
    }

    /**
     * @return
     */

    public String getShippingLabelURL() {
        return this.shippingLabelURL;
    }

    /**
     * @param shippingLabelURL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelResult withShippingLabelURL(String shippingLabelURL) {
        setShippingLabelURL(shippingLabelURL);
        return this;
    }

    /**
     * @param warning
     */

    public void setWarning(String warning) {
        this.warning = warning;
    }

    /**
     * @return
     */

    public String getWarning() {
        return this.warning;
    }

    /**
     * @param warning
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShippingLabelResult withWarning(String warning) {
        setWarning(warning);
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
        if (getShippingLabelURL() != null)
            sb.append("ShippingLabelURL: ").append(getShippingLabelURL()).append(",");
        if (getWarning() != null)
            sb.append("Warning: ").append(getWarning());
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
        if (other.getShippingLabelURL() == null ^ this.getShippingLabelURL() == null)
            return false;
        if (other.getShippingLabelURL() != null && other.getShippingLabelURL().equals(this.getShippingLabelURL()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShippingLabelURL() == null) ? 0 : getShippingLabelURL().hashCode());
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode());
        return hashCode;
    }

    @Override
    public GetShippingLabelResult clone() {
        try {
            return (GetShippingLabelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
