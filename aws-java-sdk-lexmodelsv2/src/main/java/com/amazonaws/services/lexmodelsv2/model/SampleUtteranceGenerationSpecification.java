/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains specifications for the sample utterance generation feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SampleUtteranceGenerationSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SampleUtteranceGenerationSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to enable sample utterance generation or not.
     * </p>
     */
    private Boolean enabled;

    private BedrockModelSpecification bedrockModelSpecification;

    /**
     * <p>
     * Specifies whether to enable sample utterance generation or not.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable sample utterance generation or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable sample utterance generation or not.
     * </p>
     * 
     * @return Specifies whether to enable sample utterance generation or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to enable sample utterance generation or not.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable sample utterance generation or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleUtteranceGenerationSpecification withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable sample utterance generation or not.
     * </p>
     * 
     * @return Specifies whether to enable sample utterance generation or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param bedrockModelSpecification
     */

    public void setBedrockModelSpecification(BedrockModelSpecification bedrockModelSpecification) {
        this.bedrockModelSpecification = bedrockModelSpecification;
    }

    /**
     * @return
     */

    public BedrockModelSpecification getBedrockModelSpecification() {
        return this.bedrockModelSpecification;
    }

    /**
     * @param bedrockModelSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleUtteranceGenerationSpecification withBedrockModelSpecification(BedrockModelSpecification bedrockModelSpecification) {
        setBedrockModelSpecification(bedrockModelSpecification);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getBedrockModelSpecification() != null)
            sb.append("BedrockModelSpecification: ").append(getBedrockModelSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SampleUtteranceGenerationSpecification == false)
            return false;
        SampleUtteranceGenerationSpecification other = (SampleUtteranceGenerationSpecification) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getBedrockModelSpecification() == null ^ this.getBedrockModelSpecification() == null)
            return false;
        if (other.getBedrockModelSpecification() != null && other.getBedrockModelSpecification().equals(this.getBedrockModelSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBedrockModelSpecification() == null) ? 0 : getBedrockModelSpecification().hashCode());
        return hashCode;
    }

    @Override
    public SampleUtteranceGenerationSpecification clone() {
        try {
            return (SampleUtteranceGenerationSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SampleUtteranceGenerationSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
