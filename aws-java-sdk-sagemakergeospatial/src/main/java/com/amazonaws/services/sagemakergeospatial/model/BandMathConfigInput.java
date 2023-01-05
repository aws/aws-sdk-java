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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/BandMathConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BandMathConfigInput implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private CustomIndicesInput customIndices;
    /** <p/> */
    private java.util.List<String> predefinedIndices;

    /**
     * <p/>
     * 
     * @param customIndices
     */

    public void setCustomIndices(CustomIndicesInput customIndices) {
        this.customIndices = customIndices;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public CustomIndicesInput getCustomIndices() {
        return this.customIndices;
    }

    /**
     * <p/>
     * 
     * @param customIndices
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandMathConfigInput withCustomIndices(CustomIndicesInput customIndices) {
        setCustomIndices(customIndices);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getPredefinedIndices() {
        return predefinedIndices;
    }

    /**
     * <p/>
     * 
     * @param predefinedIndices
     */

    public void setPredefinedIndices(java.util.Collection<String> predefinedIndices) {
        if (predefinedIndices == null) {
            this.predefinedIndices = null;
            return;
        }

        this.predefinedIndices = new java.util.ArrayList<String>(predefinedIndices);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredefinedIndices(java.util.Collection)} or {@link #withPredefinedIndices(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param predefinedIndices
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandMathConfigInput withPredefinedIndices(String... predefinedIndices) {
        if (this.predefinedIndices == null) {
            setPredefinedIndices(new java.util.ArrayList<String>(predefinedIndices.length));
        }
        for (String ele : predefinedIndices) {
            this.predefinedIndices.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param predefinedIndices
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandMathConfigInput withPredefinedIndices(java.util.Collection<String> predefinedIndices) {
        setPredefinedIndices(predefinedIndices);
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
        if (getCustomIndices() != null)
            sb.append("CustomIndices: ").append(getCustomIndices()).append(",");
        if (getPredefinedIndices() != null)
            sb.append("PredefinedIndices: ").append(getPredefinedIndices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BandMathConfigInput == false)
            return false;
        BandMathConfigInput other = (BandMathConfigInput) obj;
        if (other.getCustomIndices() == null ^ this.getCustomIndices() == null)
            return false;
        if (other.getCustomIndices() != null && other.getCustomIndices().equals(this.getCustomIndices()) == false)
            return false;
        if (other.getPredefinedIndices() == null ^ this.getPredefinedIndices() == null)
            return false;
        if (other.getPredefinedIndices() != null && other.getPredefinedIndices().equals(this.getPredefinedIndices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomIndices() == null) ? 0 : getCustomIndices().hashCode());
        hashCode = prime * hashCode + ((getPredefinedIndices() == null) ? 0 : getPredefinedIndices().hashCode());
        return hashCode;
    }

    @Override
    public BandMathConfigInput clone() {
        try {
            return (BandMathConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.BandMathConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
