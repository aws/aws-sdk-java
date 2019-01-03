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
 * A facet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/SchemaFacet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaFacet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the schema that contains the facet with no minor component. See <a>arns</a> and <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_inplaceschemaupgrade.html"
     * >In-Place Schema Upgrade</a> for a description of when to provide minor versions.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the facet.
     * </p>
     */
    private String facetName;

    /**
     * <p>
     * The ARN of the schema that contains the facet with no minor component. See <a>arns</a> and <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_inplaceschemaupgrade.html"
     * >In-Place Schema Upgrade</a> for a description of when to provide minor versions.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema that contains the facet with no minor component. See <a>arns</a> and <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_inplaceschemaupgrade.html"
     *        >In-Place Schema Upgrade</a> for a description of when to provide minor versions.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema that contains the facet with no minor component. See <a>arns</a> and <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_inplaceschemaupgrade.html"
     * >In-Place Schema Upgrade</a> for a description of when to provide minor versions.
     * </p>
     * 
     * @return The ARN of the schema that contains the facet with no minor component. See <a>arns</a> and <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_inplaceschemaupgrade.html"
     *         >In-Place Schema Upgrade</a> for a description of when to provide minor versions.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema that contains the facet with no minor component. See <a>arns</a> and <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_inplaceschemaupgrade.html"
     * >In-Place Schema Upgrade</a> for a description of when to provide minor versions.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema that contains the facet with no minor component. See <a>arns</a> and <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_inplaceschemaupgrade.html"
     *        >In-Place Schema Upgrade</a> for a description of when to provide minor versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaFacet withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the facet.
     * </p>
     * 
     * @param facetName
     *        The name of the facet.
     */

    public void setFacetName(String facetName) {
        this.facetName = facetName;
    }

    /**
     * <p>
     * The name of the facet.
     * </p>
     * 
     * @return The name of the facet.
     */

    public String getFacetName() {
        return this.facetName;
    }

    /**
     * <p>
     * The name of the facet.
     * </p>
     * 
     * @param facetName
     *        The name of the facet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaFacet withFacetName(String facetName) {
        setFacetName(facetName);
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
            sb.append("FacetName: ").append(getFacetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaFacet == false)
            return false;
        SchemaFacet other = (SchemaFacet) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getFacetName() == null ^ this.getFacetName() == null)
            return false;
        if (other.getFacetName() != null && other.getFacetName().equals(this.getFacetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getFacetName() == null) ? 0 : getFacetName().hashCode());
        return hashCode;
    }

    @Override
    public SchemaFacet clone() {
        try {
            return (SchemaFacet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.SchemaFacetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
