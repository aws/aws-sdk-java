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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ResamplingConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResamplingConfigInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the algorithm used for resampling.
     * </p>
     */
    private String algorithmName;
    /** <p/> */
    private OutputResolutionResamplingInput outputResolution;
    /** <p/> */
    private java.util.List<String> targetBands;

    /**
     * <p>
     * The name of the algorithm used for resampling.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm used for resampling.
     * @see AlgorithmNameResampling
     */

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm used for resampling.
     * </p>
     * 
     * @return The name of the algorithm used for resampling.
     * @see AlgorithmNameResampling
     */

    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm used for resampling.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm used for resampling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmNameResampling
     */

    public ResamplingConfigInput withAlgorithmName(String algorithmName) {
        setAlgorithmName(algorithmName);
        return this;
    }

    /**
     * <p>
     * The name of the algorithm used for resampling.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm used for resampling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmNameResampling
     */

    public ResamplingConfigInput withAlgorithmName(AlgorithmNameResampling algorithmName) {
        this.algorithmName = algorithmName.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param outputResolution
     */

    public void setOutputResolution(OutputResolutionResamplingInput outputResolution) {
        this.outputResolution = outputResolution;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public OutputResolutionResamplingInput getOutputResolution() {
        return this.outputResolution;
    }

    /**
     * <p/>
     * 
     * @param outputResolution
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResamplingConfigInput withOutputResolution(OutputResolutionResamplingInput outputResolution) {
        setOutputResolution(outputResolution);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getTargetBands() {
        return targetBands;
    }

    /**
     * <p/>
     * 
     * @param targetBands
     */

    public void setTargetBands(java.util.Collection<String> targetBands) {
        if (targetBands == null) {
            this.targetBands = null;
            return;
        }

        this.targetBands = new java.util.ArrayList<String>(targetBands);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetBands(java.util.Collection)} or {@link #withTargetBands(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResamplingConfigInput withTargetBands(String... targetBands) {
        if (this.targetBands == null) {
            setTargetBands(new java.util.ArrayList<String>(targetBands.length));
        }
        for (String ele : targetBands) {
            this.targetBands.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResamplingConfigInput withTargetBands(java.util.Collection<String> targetBands) {
        setTargetBands(targetBands);
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
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: ").append(getAlgorithmName()).append(",");
        if (getOutputResolution() != null)
            sb.append("OutputResolution: ").append(getOutputResolution()).append(",");
        if (getTargetBands() != null)
            sb.append("TargetBands: ").append(getTargetBands());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResamplingConfigInput == false)
            return false;
        ResamplingConfigInput other = (ResamplingConfigInput) obj;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getOutputResolution() == null ^ this.getOutputResolution() == null)
            return false;
        if (other.getOutputResolution() != null && other.getOutputResolution().equals(this.getOutputResolution()) == false)
            return false;
        if (other.getTargetBands() == null ^ this.getTargetBands() == null)
            return false;
        if (other.getTargetBands() != null && other.getTargetBands().equals(this.getTargetBands()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode + ((getOutputResolution() == null) ? 0 : getOutputResolution().hashCode());
        hashCode = prime * hashCode + ((getTargetBands() == null) ? 0 : getTargetBands().hashCode());
        return hashCode;
    }

    @Override
    public ResamplingConfigInput clone() {
        try {
            return (ResamplingConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ResamplingConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
