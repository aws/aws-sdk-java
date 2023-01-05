/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ViewOffNadirInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewOffNadirInput implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private Float lowerBound;
    /** <p/> */
    private Float upperBound;

    /**
     * <p/>
     * 
     * @param lowerBound
     */

    public void setLowerBound(Float lowerBound) {
        this.lowerBound = lowerBound;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Float getLowerBound() {
        return this.lowerBound;
    }

    /**
     * <p/>
     * 
     * @param lowerBound
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewOffNadirInput withLowerBound(Float lowerBound) {
        setLowerBound(lowerBound);
        return this;
    }

    /**
     * <p/>
     * 
     * @param upperBound
     */

    public void setUpperBound(Float upperBound) {
        this.upperBound = upperBound;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Float getUpperBound() {
        return this.upperBound;
    }

    /**
     * <p/>
     * 
     * @param upperBound
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewOffNadirInput withUpperBound(Float upperBound) {
        setUpperBound(upperBound);
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
        if (getLowerBound() != null)
            sb.append("LowerBound: ").append(getLowerBound()).append(",");
        if (getUpperBound() != null)
            sb.append("UpperBound: ").append(getUpperBound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewOffNadirInput == false)
            return false;
        ViewOffNadirInput other = (ViewOffNadirInput) obj;
        if (other.getLowerBound() == null ^ this.getLowerBound() == null)
            return false;
        if (other.getLowerBound() != null && other.getLowerBound().equals(this.getLowerBound()) == false)
            return false;
        if (other.getUpperBound() == null ^ this.getUpperBound() == null)
            return false;
        if (other.getUpperBound() != null && other.getUpperBound().equals(this.getUpperBound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLowerBound() == null) ? 0 : getLowerBound().hashCode());
        hashCode = prime * hashCode + ((getUpperBound() == null) ? 0 : getUpperBound().hashCode());
        return hashCode;
    }

    @Override
    public ViewOffNadirInput clone() {
        try {
            return (ViewOffNadirInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ViewOffNadirInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
