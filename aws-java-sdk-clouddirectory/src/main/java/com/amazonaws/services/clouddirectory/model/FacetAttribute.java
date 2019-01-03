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
 * An attribute that is associated with the <a>Facet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/FacetAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FacetAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the facet attribute.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A facet attribute consists of either a definition or a reference. This structure contains the attribute
     * definition. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     */
    private FacetAttributeDefinition attributeDefinition;
    /**
     * <p>
     * An attribute reference that is associated with the attribute. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     */
    private FacetAttributeReference attributeReference;
    /**
     * <p>
     * The required behavior of the <code>FacetAttribute</code>.
     * </p>
     */
    private String requiredBehavior;

    /**
     * <p>
     * The name of the facet attribute.
     * </p>
     * 
     * @param name
     *        The name of the facet attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the facet attribute.
     * </p>
     * 
     * @return The name of the facet attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the facet attribute.
     * </p>
     * 
     * @param name
     *        The name of the facet attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A facet attribute consists of either a definition or a reference. This structure contains the attribute
     * definition. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param attributeDefinition
     *        A facet attribute consists of either a definition or a reference. This structure contains the attribute
     *        definition. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     */

    public void setAttributeDefinition(FacetAttributeDefinition attributeDefinition) {
        this.attributeDefinition = attributeDefinition;
    }

    /**
     * <p>
     * A facet attribute consists of either a definition or a reference. This structure contains the attribute
     * definition. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @return A facet attribute consists of either a definition or a reference. This structure contains the attribute
     *         definition. See <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *         >Attribute References</a> for more information.
     */

    public FacetAttributeDefinition getAttributeDefinition() {
        return this.attributeDefinition;
    }

    /**
     * <p>
     * A facet attribute consists of either a definition or a reference. This structure contains the attribute
     * definition. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param attributeDefinition
     *        A facet attribute consists of either a definition or a reference. This structure contains the attribute
     *        definition. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttribute withAttributeDefinition(FacetAttributeDefinition attributeDefinition) {
        setAttributeDefinition(attributeDefinition);
        return this;
    }

    /**
     * <p>
     * An attribute reference that is associated with the attribute. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param attributeReference
     *        An attribute reference that is associated with the attribute. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     */

    public void setAttributeReference(FacetAttributeReference attributeReference) {
        this.attributeReference = attributeReference;
    }

    /**
     * <p>
     * An attribute reference that is associated with the attribute. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @return An attribute reference that is associated with the attribute. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *         >Attribute References</a> for more information.
     */

    public FacetAttributeReference getAttributeReference() {
        return this.attributeReference;
    }

    /**
     * <p>
     * An attribute reference that is associated with the attribute. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     * >Attribute References</a> for more information.
     * </p>
     * 
     * @param attributeReference
     *        An attribute reference that is associated with the attribute. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html"
     *        >Attribute References</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttribute withAttributeReference(FacetAttributeReference attributeReference) {
        setAttributeReference(attributeReference);
        return this;
    }

    /**
     * <p>
     * The required behavior of the <code>FacetAttribute</code>.
     * </p>
     * 
     * @param requiredBehavior
     *        The required behavior of the <code>FacetAttribute</code>.
     * @see RequiredAttributeBehavior
     */

    public void setRequiredBehavior(String requiredBehavior) {
        this.requiredBehavior = requiredBehavior;
    }

    /**
     * <p>
     * The required behavior of the <code>FacetAttribute</code>.
     * </p>
     * 
     * @return The required behavior of the <code>FacetAttribute</code>.
     * @see RequiredAttributeBehavior
     */

    public String getRequiredBehavior() {
        return this.requiredBehavior;
    }

    /**
     * <p>
     * The required behavior of the <code>FacetAttribute</code>.
     * </p>
     * 
     * @param requiredBehavior
     *        The required behavior of the <code>FacetAttribute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiredAttributeBehavior
     */

    public FacetAttribute withRequiredBehavior(String requiredBehavior) {
        setRequiredBehavior(requiredBehavior);
        return this;
    }

    /**
     * <p>
     * The required behavior of the <code>FacetAttribute</code>.
     * </p>
     * 
     * @param requiredBehavior
     *        The required behavior of the <code>FacetAttribute</code>.
     * @see RequiredAttributeBehavior
     */

    public void setRequiredBehavior(RequiredAttributeBehavior requiredBehavior) {
        withRequiredBehavior(requiredBehavior);
    }

    /**
     * <p>
     * The required behavior of the <code>FacetAttribute</code>.
     * </p>
     * 
     * @param requiredBehavior
     *        The required behavior of the <code>FacetAttribute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiredAttributeBehavior
     */

    public FacetAttribute withRequiredBehavior(RequiredAttributeBehavior requiredBehavior) {
        this.requiredBehavior = requiredBehavior.toString();
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
        if (getAttributeDefinition() != null)
            sb.append("AttributeDefinition: ").append(getAttributeDefinition()).append(",");
        if (getAttributeReference() != null)
            sb.append("AttributeReference: ").append(getAttributeReference()).append(",");
        if (getRequiredBehavior() != null)
            sb.append("RequiredBehavior: ").append(getRequiredBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FacetAttribute == false)
            return false;
        FacetAttribute other = (FacetAttribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributeDefinition() == null ^ this.getAttributeDefinition() == null)
            return false;
        if (other.getAttributeDefinition() != null && other.getAttributeDefinition().equals(this.getAttributeDefinition()) == false)
            return false;
        if (other.getAttributeReference() == null ^ this.getAttributeReference() == null)
            return false;
        if (other.getAttributeReference() != null && other.getAttributeReference().equals(this.getAttributeReference()) == false)
            return false;
        if (other.getRequiredBehavior() == null ^ this.getRequiredBehavior() == null)
            return false;
        if (other.getRequiredBehavior() != null && other.getRequiredBehavior().equals(this.getRequiredBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributeDefinition() == null) ? 0 : getAttributeDefinition().hashCode());
        hashCode = prime * hashCode + ((getAttributeReference() == null) ? 0 : getAttributeReference().hashCode());
        hashCode = prime * hashCode + ((getRequiredBehavior() == null) ? 0 : getRequiredBehavior().hashCode());
        return hashCode;
    }

    @Override
    public FacetAttribute clone() {
        try {
            return (FacetAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.FacetAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
