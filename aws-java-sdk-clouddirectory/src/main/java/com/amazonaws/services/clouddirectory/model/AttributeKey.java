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
 * A unique identifier for an attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttributeKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the facet that the attribute exists within.
     * </p>
     */
    private String facetName;
    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeKey withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the facet that the attribute exists within.
     * </p>
     * 
     * @param facetName
     *        The name of the facet that the attribute exists within.
     */

    public void setFacetName(String facetName) {
        this.facetName = facetName;
    }

    /**
     * <p>
     * The name of the facet that the attribute exists within.
     * </p>
     * 
     * @return The name of the facet that the attribute exists within.
     */

    public String getFacetName() {
        return this.facetName;
    }

    /**
     * <p>
     * The name of the facet that the attribute exists within.
     * </p>
     * 
     * @param facetName
     *        The name of the facet that the attribute exists within.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeKey withFacetName(String facetName) {
        setFacetName(facetName);
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param name
     *        The name of the attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @return The name of the attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param name
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeKey withName(String name) {
        setName(name);
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getFacetName() != null)
            sb.append("FacetName: ").append(getFacetName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeKey == false)
            return false;
        AttributeKey other = (AttributeKey) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getFacetName() == null ^ this.getFacetName() == null)
            return false;
        if (other.getFacetName() != null && other.getFacetName().equals(this.getFacetName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getFacetName() == null) ? 0 : getFacetName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AttributeKey clone() {
        try {
            return (AttributeKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.AttributeKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
