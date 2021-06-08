/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAcceleratorAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomRoutingAcceleratorAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Updated custom routing accelerator.
     * </p>
     */
    private CustomRoutingAcceleratorAttributes acceleratorAttributes;

    /**
     * <p>
     * Updated custom routing accelerator.
     * </p>
     * 
     * @param acceleratorAttributes
     *        Updated custom routing accelerator.
     */

    public void setAcceleratorAttributes(CustomRoutingAcceleratorAttributes acceleratorAttributes) {
        this.acceleratorAttributes = acceleratorAttributes;
    }

    /**
     * <p>
     * Updated custom routing accelerator.
     * </p>
     * 
     * @return Updated custom routing accelerator.
     */

    public CustomRoutingAcceleratorAttributes getAcceleratorAttributes() {
        return this.acceleratorAttributes;
    }

    /**
     * <p>
     * Updated custom routing accelerator.
     * </p>
     * 
     * @param acceleratorAttributes
     *        Updated custom routing accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomRoutingAcceleratorAttributesResult withAcceleratorAttributes(CustomRoutingAcceleratorAttributes acceleratorAttributes) {
        setAcceleratorAttributes(acceleratorAttributes);
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
        if (getAcceleratorAttributes() != null)
            sb.append("AcceleratorAttributes: ").append(getAcceleratorAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomRoutingAcceleratorAttributesResult == false)
            return false;
        UpdateCustomRoutingAcceleratorAttributesResult other = (UpdateCustomRoutingAcceleratorAttributesResult) obj;
        if (other.getAcceleratorAttributes() == null ^ this.getAcceleratorAttributes() == null)
            return false;
        if (other.getAcceleratorAttributes() != null && other.getAcceleratorAttributes().equals(this.getAcceleratorAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorAttributes() == null) ? 0 : getAcceleratorAttributes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomRoutingAcceleratorAttributesResult clone() {
        try {
            return (UpdateCustomRoutingAcceleratorAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
