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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The layout configuration of a section.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SectionLayoutConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SectionLayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The free-form layout configuration of a section.
     * </p>
     */
    private FreeFormSectionLayoutConfiguration freeFormLayout;

    /**
     * <p>
     * The free-form layout configuration of a section.
     * </p>
     * 
     * @param freeFormLayout
     *        The free-form layout configuration of a section.
     */

    public void setFreeFormLayout(FreeFormSectionLayoutConfiguration freeFormLayout) {
        this.freeFormLayout = freeFormLayout;
    }

    /**
     * <p>
     * The free-form layout configuration of a section.
     * </p>
     * 
     * @return The free-form layout configuration of a section.
     */

    public FreeFormSectionLayoutConfiguration getFreeFormLayout() {
        return this.freeFormLayout;
    }

    /**
     * <p>
     * The free-form layout configuration of a section.
     * </p>
     * 
     * @param freeFormLayout
     *        The free-form layout configuration of a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionLayoutConfiguration withFreeFormLayout(FreeFormSectionLayoutConfiguration freeFormLayout) {
        setFreeFormLayout(freeFormLayout);
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
        if (getFreeFormLayout() != null)
            sb.append("FreeFormLayout: ").append(getFreeFormLayout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SectionLayoutConfiguration == false)
            return false;
        SectionLayoutConfiguration other = (SectionLayoutConfiguration) obj;
        if (other.getFreeFormLayout() == null ^ this.getFreeFormLayout() == null)
            return false;
        if (other.getFreeFormLayout() != null && other.getFreeFormLayout().equals(this.getFreeFormLayout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFreeFormLayout() == null) ? 0 : getFreeFormLayout().hashCode());
        return hashCode;
    }

    @Override
    public SectionLayoutConfiguration clone() {
        try {
            return (SectionLayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SectionLayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
