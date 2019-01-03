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
 * Represents the output of a <a>GetObjectInformation</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchGetObjectInformationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetObjectInformationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The facets attached to the specified object.
     * </p>
     */
    private java.util.List<SchemaFacet> schemaFacets;
    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the specified object.
     * </p>
     */
    private String objectIdentifier;

    /**
     * <p>
     * The facets attached to the specified object.
     * </p>
     * 
     * @return The facets attached to the specified object.
     */

    public java.util.List<SchemaFacet> getSchemaFacets() {
        return schemaFacets;
    }

    /**
     * <p>
     * The facets attached to the specified object.
     * </p>
     * 
     * @param schemaFacets
     *        The facets attached to the specified object.
     */

    public void setSchemaFacets(java.util.Collection<SchemaFacet> schemaFacets) {
        if (schemaFacets == null) {
            this.schemaFacets = null;
            return;
        }

        this.schemaFacets = new java.util.ArrayList<SchemaFacet>(schemaFacets);
    }

    /**
     * <p>
     * The facets attached to the specified object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaFacets(java.util.Collection)} or {@link #withSchemaFacets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schemaFacets
     *        The facets attached to the specified object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetObjectInformationResponse withSchemaFacets(SchemaFacet... schemaFacets) {
        if (this.schemaFacets == null) {
            setSchemaFacets(new java.util.ArrayList<SchemaFacet>(schemaFacets.length));
        }
        for (SchemaFacet ele : schemaFacets) {
            this.schemaFacets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The facets attached to the specified object.
     * </p>
     * 
     * @param schemaFacets
     *        The facets attached to the specified object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetObjectInformationResponse withSchemaFacets(java.util.Collection<SchemaFacet> schemaFacets) {
        setSchemaFacets(schemaFacets);
        return this;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the specified object.
     * </p>
     * 
     * @param objectIdentifier
     *        The <code>ObjectIdentifier</code> of the specified object.
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the specified object.
     * </p>
     * 
     * @return The <code>ObjectIdentifier</code> of the specified object.
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the specified object.
     * </p>
     * 
     * @param objectIdentifier
     *        The <code>ObjectIdentifier</code> of the specified object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetObjectInformationResponse withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
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
        if (getSchemaFacets() != null)
            sb.append("SchemaFacets: ").append(getSchemaFacets()).append(",");
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetObjectInformationResponse == false)
            return false;
        BatchGetObjectInformationResponse other = (BatchGetObjectInformationResponse) obj;
        if (other.getSchemaFacets() == null ^ this.getSchemaFacets() == null)
            return false;
        if (other.getSchemaFacets() != null && other.getSchemaFacets().equals(this.getSchemaFacets()) == false)
            return false;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaFacets() == null) ? 0 : getSchemaFacets().hashCode());
        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetObjectInformationResponse clone() {
        try {
            return (BatchGetObjectInformationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchGetObjectInformationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
