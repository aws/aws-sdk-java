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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFpgaImageAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the attribute.
     * </p>
     */
    private FpgaImageAttribute fpgaImageAttribute;

    /**
     * <p>
     * Information about the attribute.
     * </p>
     * 
     * @param fpgaImageAttribute
     *        Information about the attribute.
     */

    public void setFpgaImageAttribute(FpgaImageAttribute fpgaImageAttribute) {
        this.fpgaImageAttribute = fpgaImageAttribute;
    }

    /**
     * <p>
     * Information about the attribute.
     * </p>
     * 
     * @return Information about the attribute.
     */

    public FpgaImageAttribute getFpgaImageAttribute() {
        return this.fpgaImageAttribute;
    }

    /**
     * <p>
     * Information about the attribute.
     * </p>
     * 
     * @param fpgaImageAttribute
     *        Information about the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImageAttributeResult withFpgaImageAttribute(FpgaImageAttribute fpgaImageAttribute) {
        setFpgaImageAttribute(fpgaImageAttribute);
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
        if (getFpgaImageAttribute() != null)
            sb.append("FpgaImageAttribute: ").append(getFpgaImageAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFpgaImageAttributeResult == false)
            return false;
        DescribeFpgaImageAttributeResult other = (DescribeFpgaImageAttributeResult) obj;
        if (other.getFpgaImageAttribute() == null ^ this.getFpgaImageAttribute() == null)
            return false;
        if (other.getFpgaImageAttribute() != null && other.getFpgaImageAttribute().equals(this.getFpgaImageAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageAttribute() == null) ? 0 : getFpgaImageAttribute().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFpgaImageAttributeResult clone() {
        try {
            return (DescribeFpgaImageAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
