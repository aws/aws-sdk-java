/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing a list of tag conditions that apply to a resource's tag policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/LFTagPolicyResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LFTagPolicyResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The resource type for which the tag policy applies.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A list of tag conditions that apply to the resource's tag policy.
     * </p>
     */
    private java.util.List<LFTag> expression;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your AWS Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTagPolicyResource withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The resource type for which the tag policy applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type for which the tag policy applies.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type for which the tag policy applies.
     * </p>
     * 
     * @return The resource type for which the tag policy applies.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type for which the tag policy applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type for which the tag policy applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LFTagPolicyResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type for which the tag policy applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type for which the tag policy applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LFTagPolicyResource withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * A list of tag conditions that apply to the resource's tag policy.
     * </p>
     * 
     * @return A list of tag conditions that apply to the resource's tag policy.
     */

    public java.util.List<LFTag> getExpression() {
        return expression;
    }

    /**
     * <p>
     * A list of tag conditions that apply to the resource's tag policy.
     * </p>
     * 
     * @param expression
     *        A list of tag conditions that apply to the resource's tag policy.
     */

    public void setExpression(java.util.Collection<LFTag> expression) {
        if (expression == null) {
            this.expression = null;
            return;
        }

        this.expression = new java.util.ArrayList<LFTag>(expression);
    }

    /**
     * <p>
     * A list of tag conditions that apply to the resource's tag policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpression(java.util.Collection)} or {@link #withExpression(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param expression
     *        A list of tag conditions that apply to the resource's tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTagPolicyResource withExpression(LFTag... expression) {
        if (this.expression == null) {
            setExpression(new java.util.ArrayList<LFTag>(expression.length));
        }
        for (LFTag ele : expression) {
            this.expression.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag conditions that apply to the resource's tag policy.
     * </p>
     * 
     * @param expression
     *        A list of tag conditions that apply to the resource's tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTagPolicyResource withExpression(java.util.Collection<LFTag> expression) {
        setExpression(expression);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LFTagPolicyResource == false)
            return false;
        LFTagPolicyResource other = (LFTagPolicyResource) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public LFTagPolicyResource clone() {
        try {
            return (LFTagPolicyResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.LFTagPolicyResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
