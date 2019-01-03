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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The facet attribute reference that specifies the attribute definition that contains the attribute facet name and
 * attribute name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/FacetAttributeReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FacetAttributeReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target facet name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     */
    private String targetFacetName;
    /**
     * <p>
     * The target attribute name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     */
    private String targetAttributeName;

    /**
     * <p>
     * The target facet name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param targetFacetName
     *        The target facet name that is associated with the facet reference. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     */

    public void setTargetFacetName(String targetFacetName) {
        this.targetFacetName = targetFacetName;
    }

    /**
     * <p>
     * The target facet name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @return The target facet name that is associated with the facet reference. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *         >Attribute References</a> for more information.
     */

    public String getTargetFacetName() {
        return this.targetFacetName;
    }

    /**
     * <p>
     * The target facet name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param targetFacetName
     *        The target facet name that is associated with the facet reference. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttributeReference withTargetFacetName(String targetFacetName) {
        setTargetFacetName(targetFacetName);
        return this;
    }

    /**
     * <p>
     * The target attribute name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param targetAttributeName
     *        The target attribute name that is associated with the facet reference. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     */

    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    /**
     * <p>
     * The target attribute name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @return The target attribute name that is associated with the facet reference. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *         >Attribute References</a> for more information.
     */

    public String getTargetAttributeName() {
        return this.targetAttributeName;
    }

    /**
     * <p>
     * The target attribute name that is associated with the facet reference. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param targetAttributeName
     *        The target attribute name that is associated with the facet reference. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttributeReference withTargetAttributeName(String targetAttributeName) {
        setTargetAttributeName(targetAttributeName);
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
        if (getTargetFacetName() != null)
            sb.append("TargetFacetName: ").append(getTargetFacetName()).append(",");
        if (getTargetAttributeName() != null)
            sb.append("TargetAttributeName: ").append(getTargetAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FacetAttributeReference == false)
            return false;
        FacetAttributeReference other = (FacetAttributeReference) obj;
        if (other.getTargetFacetName() == null ^ this.getTargetFacetName() == null)
            return false;
        if (other.getTargetFacetName() != null && other.getTargetFacetName().equals(this.getTargetFacetName()) == false)
            return false;
        if (other.getTargetAttributeName() == null ^ this.getTargetAttributeName() == null)
            return false;
        if (other.getTargetAttributeName() != null && other.getTargetAttributeName().equals(this.getTargetAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetFacetName() == null) ? 0 : getTargetFacetName().hashCode());
        hashCode = prime * hashCode + ((getTargetAttributeName() == null) ? 0 : getTargetAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public FacetAttributeReference clone() {
        try {
            return (FacetAttributeReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.FacetAttributeReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
