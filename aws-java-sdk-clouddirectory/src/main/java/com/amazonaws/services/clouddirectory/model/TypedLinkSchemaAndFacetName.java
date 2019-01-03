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
 * Identifies the schema Amazon Resource Name (ARN) and facet name for the typed link.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/TypedLinkSchemaAndFacetName"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedLinkSchemaAndFacetName implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see <a>arns</a>.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     */
    private String typedLinkName;

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

    public TypedLinkSchemaAndFacetName withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     * 
     * @param typedLinkName
     *        The unique name of the typed link facet.
     */

    public void setTypedLinkName(String typedLinkName) {
        this.typedLinkName = typedLinkName;
    }

    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     * 
     * @return The unique name of the typed link facet.
     */

    public String getTypedLinkName() {
        return this.typedLinkName;
    }

    /**
     * <p>
     * The unique name of the typed link facet.
     * </p>
     * 
     * @param typedLinkName
     *        The unique name of the typed link facet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkSchemaAndFacetName withTypedLinkName(String typedLinkName) {
        setTypedLinkName(typedLinkName);
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
        if (getTypedLinkName() != null)
            sb.append("TypedLinkName: ").append(getTypedLinkName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypedLinkSchemaAndFacetName == false)
            return false;
        TypedLinkSchemaAndFacetName other = (TypedLinkSchemaAndFacetName) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getTypedLinkName() == null ^ this.getTypedLinkName() == null)
            return false;
        if (other.getTypedLinkName() != null && other.getTypedLinkName().equals(this.getTypedLinkName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getTypedLinkName() == null) ? 0 : getTypedLinkName().hashCode());
        return hashCode;
    }

    @Override
    public TypedLinkSchemaAndFacetName clone() {
        try {
            return (TypedLinkSchemaAndFacetName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.TypedLinkSchemaAndFacetNameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
