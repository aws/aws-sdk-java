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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateTypedLinkFacet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTypedLinkFacetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * <a>Facet</a> structure that is associated with the typed link facet.
     * </p>
     */
    private TypedLinkFacet facet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTypedLinkFacetRequest withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * <a>Facet</a> structure that is associated with the typed link facet.
     * </p>
     * 
     * @param facet
     *        <a>Facet</a> structure that is associated with the typed link facet.
     */

    public void setFacet(TypedLinkFacet facet) {
        this.facet = facet;
    }

    /**
     * <p>
     * <a>Facet</a> structure that is associated with the typed link facet.
     * </p>
     * 
     * @return <a>Facet</a> structure that is associated with the typed link facet.
     */

    public TypedLinkFacet getFacet() {
        return this.facet;
    }

    /**
     * <p>
     * <a>Facet</a> structure that is associated with the typed link facet.
     * </p>
     * 
     * @param facet
     *        <a>Facet</a> structure that is associated with the typed link facet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTypedLinkFacetRequest withFacet(TypedLinkFacet facet) {
        setFacet(facet);
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
        if (getFacet() != null)
            sb.append("Facet: ").append(getFacet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTypedLinkFacetRequest == false)
            return false;
        CreateTypedLinkFacetRequest other = (CreateTypedLinkFacetRequest) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getFacet() == null ^ this.getFacet() == null)
            return false;
        if (other.getFacet() != null && other.getFacet().equals(this.getFacet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getFacet() == null) ? 0 : getFacet().hashCode());
        return hashCode;
    }

    @Override
    public CreateTypedLinkFacetRequest clone() {
        return (CreateTypedLinkFacetRequest) super.clone();
    }

}
