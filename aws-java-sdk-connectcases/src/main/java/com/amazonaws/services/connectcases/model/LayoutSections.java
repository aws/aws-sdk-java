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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Ordered list containing different kinds of sections that can be added. A LayoutSections object can only contain one
 * section.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/LayoutSections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayoutSections implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Section> sections;

    /**
     * @return
     */

    public java.util.List<Section> getSections() {
        return sections;
    }

    /**
     * @param sections
     */

    public void setSections(java.util.Collection<Section> sections) {
        if (sections == null) {
            this.sections = null;
            return;
        }

        this.sections = new java.util.ArrayList<Section>(sections);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSections(java.util.Collection)} or {@link #withSections(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sections
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutSections withSections(Section... sections) {
        if (this.sections == null) {
            setSections(new java.util.ArrayList<Section>(sections.length));
        }
        for (Section ele : sections) {
            this.sections.add(ele);
        }
        return this;
    }

    /**
     * @param sections
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutSections withSections(java.util.Collection<Section> sections) {
        setSections(sections);
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
        if (getSections() != null)
            sb.append("Sections: ").append(getSections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayoutSections == false)
            return false;
        LayoutSections other = (LayoutSections) obj;
        if (other.getSections() == null ^ this.getSections() == null)
            return false;
        if (other.getSections() != null && other.getSections().equals(this.getSections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSections() == null) ? 0 : getSections().hashCode());
        return hashCode;
    }

    @Override
    public LayoutSections clone() {
        try {
            return (LayoutSections) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.LayoutSectionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
