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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAcceleratorAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAcceleratorAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Updated attributes for the accelerator.
     * </p>
     */
    private AcceleratorAttributes acceleratorAttributes;

    /**
     * <p>
     * Updated attributes for the accelerator.
     * </p>
     * 
     * @param acceleratorAttributes
     *        Updated attributes for the accelerator.
     */

    public void setAcceleratorAttributes(AcceleratorAttributes acceleratorAttributes) {
        this.acceleratorAttributes = acceleratorAttributes;
    }

    /**
     * <p>
     * Updated attributes for the accelerator.
     * </p>
     * 
     * @return Updated attributes for the accelerator.
     */

    public AcceleratorAttributes getAcceleratorAttributes() {
        return this.acceleratorAttributes;
    }

    /**
     * <p>
     * Updated attributes for the accelerator.
     * </p>
     * 
     * @param acceleratorAttributes
     *        Updated attributes for the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAcceleratorAttributesResult withAcceleratorAttributes(AcceleratorAttributes acceleratorAttributes) {
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

        if (obj instanceof UpdateAcceleratorAttributesResult == false)
            return false;
        UpdateAcceleratorAttributesResult other = (UpdateAcceleratorAttributesResult) obj;
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
    public UpdateAcceleratorAttributesResult clone() {
        try {
            return (UpdateAcceleratorAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
