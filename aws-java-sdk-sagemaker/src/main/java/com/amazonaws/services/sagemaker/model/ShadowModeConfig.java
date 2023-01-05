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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of <code>ShadowMode</code> inference experiment type, which specifies a production variant to take
 * all the inference requests, and a shadow variant to which Amazon SageMaker replicates a percentage of the inference
 * requests. For the shadow variant it also specifies the percentage of requests that Amazon SageMaker replicates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ShadowModeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShadowModeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the production variant, which takes all the inference requests.
     * </p>
     */
    private String sourceModelVariantName;
    /**
     * <p>
     * List of shadow variant configurations.
     * </p>
     */
    private java.util.List<ShadowModelVariantConfig> shadowModelVariants;

    /**
     * <p>
     * The name of the production variant, which takes all the inference requests.
     * </p>
     * 
     * @param sourceModelVariantName
     *        The name of the production variant, which takes all the inference requests.
     */

    public void setSourceModelVariantName(String sourceModelVariantName) {
        this.sourceModelVariantName = sourceModelVariantName;
    }

    /**
     * <p>
     * The name of the production variant, which takes all the inference requests.
     * </p>
     * 
     * @return The name of the production variant, which takes all the inference requests.
     */

    public String getSourceModelVariantName() {
        return this.sourceModelVariantName;
    }

    /**
     * <p>
     * The name of the production variant, which takes all the inference requests.
     * </p>
     * 
     * @param sourceModelVariantName
     *        The name of the production variant, which takes all the inference requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShadowModeConfig withSourceModelVariantName(String sourceModelVariantName) {
        setSourceModelVariantName(sourceModelVariantName);
        return this;
    }

    /**
     * <p>
     * List of shadow variant configurations.
     * </p>
     * 
     * @return List of shadow variant configurations.
     */

    public java.util.List<ShadowModelVariantConfig> getShadowModelVariants() {
        return shadowModelVariants;
    }

    /**
     * <p>
     * List of shadow variant configurations.
     * </p>
     * 
     * @param shadowModelVariants
     *        List of shadow variant configurations.
     */

    public void setShadowModelVariants(java.util.Collection<ShadowModelVariantConfig> shadowModelVariants) {
        if (shadowModelVariants == null) {
            this.shadowModelVariants = null;
            return;
        }

        this.shadowModelVariants = new java.util.ArrayList<ShadowModelVariantConfig>(shadowModelVariants);
    }

    /**
     * <p>
     * List of shadow variant configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShadowModelVariants(java.util.Collection)} or {@link #withShadowModelVariants(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param shadowModelVariants
     *        List of shadow variant configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShadowModeConfig withShadowModelVariants(ShadowModelVariantConfig... shadowModelVariants) {
        if (this.shadowModelVariants == null) {
            setShadowModelVariants(new java.util.ArrayList<ShadowModelVariantConfig>(shadowModelVariants.length));
        }
        for (ShadowModelVariantConfig ele : shadowModelVariants) {
            this.shadowModelVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of shadow variant configurations.
     * </p>
     * 
     * @param shadowModelVariants
     *        List of shadow variant configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShadowModeConfig withShadowModelVariants(java.util.Collection<ShadowModelVariantConfig> shadowModelVariants) {
        setShadowModelVariants(shadowModelVariants);
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
        if (getSourceModelVariantName() != null)
            sb.append("SourceModelVariantName: ").append(getSourceModelVariantName()).append(",");
        if (getShadowModelVariants() != null)
            sb.append("ShadowModelVariants: ").append(getShadowModelVariants());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShadowModeConfig == false)
            return false;
        ShadowModeConfig other = (ShadowModeConfig) obj;
        if (other.getSourceModelVariantName() == null ^ this.getSourceModelVariantName() == null)
            return false;
        if (other.getSourceModelVariantName() != null && other.getSourceModelVariantName().equals(this.getSourceModelVariantName()) == false)
            return false;
        if (other.getShadowModelVariants() == null ^ this.getShadowModelVariants() == null)
            return false;
        if (other.getShadowModelVariants() != null && other.getShadowModelVariants().equals(this.getShadowModelVariants()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceModelVariantName() == null) ? 0 : getSourceModelVariantName().hashCode());
        hashCode = prime * hashCode + ((getShadowModelVariants() == null) ? 0 : getShadowModelVariants().hashCode());
        return hashCode;
    }

    @Override
    public ShadowModeConfig clone() {
        try {
            return (ShadowModeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ShadowModeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
