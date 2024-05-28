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
 * Contains specifications for the assisted slot resolution feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotResolutionImprovementSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotResolutionImprovementSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on or off.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * An object containing information about the Amazon Bedrock model used to assist slot resolution.
     * </p>
     */
    private BedrockModelSpecification bedrockModelSpecification;

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on or off.
     * </p>
     * 
     * @param enabled
     *        Specifies whether assisted slot resolution is turned on or off.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on or off.
     * </p>
     * 
     * @return Specifies whether assisted slot resolution is turned on or off.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on or off.
     * </p>
     * 
     * @param enabled
     *        Specifies whether assisted slot resolution is turned on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotResolutionImprovementSpecification withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on or off.
     * </p>
     * 
     * @return Specifies whether assisted slot resolution is turned on or off.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * An object containing information about the Amazon Bedrock model used to assist slot resolution.
     * </p>
     * 
     * @param bedrockModelSpecification
     *        An object containing information about the Amazon Bedrock model used to assist slot resolution.
     */

    public void setBedrockModelSpecification(BedrockModelSpecification bedrockModelSpecification) {
        this.bedrockModelSpecification = bedrockModelSpecification;
    }

    /**
     * <p>
     * An object containing information about the Amazon Bedrock model used to assist slot resolution.
     * </p>
     * 
     * @return An object containing information about the Amazon Bedrock model used to assist slot resolution.
     */

    public BedrockModelSpecification getBedrockModelSpecification() {
        return this.bedrockModelSpecification;
    }

    /**
     * <p>
     * An object containing information about the Amazon Bedrock model used to assist slot resolution.
     * </p>
     * 
     * @param bedrockModelSpecification
     *        An object containing information about the Amazon Bedrock model used to assist slot resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotResolutionImprovementSpecification withBedrockModelSpecification(BedrockModelSpecification bedrockModelSpecification) {
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

        if (obj instanceof SlotResolutionImprovementSpecification == false)
            return false;
        SlotResolutionImprovementSpecification other = (SlotResolutionImprovementSpecification) obj;
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
    public SlotResolutionImprovementSpecification clone() {
        try {
            return (SlotResolutionImprovementSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotResolutionImprovementSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
