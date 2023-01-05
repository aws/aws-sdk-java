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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contextual information for an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/SNOMEDCTTrait" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNOMEDCTTrait implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name or contextual description of a detected trait.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of a detected trait.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The name or contextual description of a detected trait.
     * </p>
     * 
     * @param name
     *        The name or contextual description of a detected trait.
     * @see SNOMEDCTTraitName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name or contextual description of a detected trait.
     * </p>
     * 
     * @return The name or contextual description of a detected trait.
     * @see SNOMEDCTTraitName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name or contextual description of a detected trait.
     * </p>
     * 
     * @param name
     *        The name or contextual description of a detected trait.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNOMEDCTTraitName
     */

    public SNOMEDCTTrait withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name or contextual description of a detected trait.
     * </p>
     * 
     * @param name
     *        The name or contextual description of a detected trait.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNOMEDCTTraitName
     */

    public SNOMEDCTTrait withName(SNOMEDCTTraitName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of a detected trait.
     * </p>
     * 
     * @param score
     *        The level of confidence that Comprehend Medical has in the accuracy of a detected trait.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of a detected trait.
     * </p>
     * 
     * @return The level of confidence that Comprehend Medical has in the accuracy of a detected trait.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of a detected trait.
     * </p>
     * 
     * @param score
     *        The level of confidence that Comprehend Medical has in the accuracy of a detected trait.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTTrait withScore(Float score) {
        setScore(score);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNOMEDCTTrait == false)
            return false;
        SNOMEDCTTrait other = (SNOMEDCTTrait) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public SNOMEDCTTrait clone() {
        try {
            return (SNOMEDCTTrait) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.SNOMEDCTTraitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
