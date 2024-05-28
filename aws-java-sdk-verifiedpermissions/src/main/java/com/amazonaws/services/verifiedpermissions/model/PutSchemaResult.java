/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PutSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the policy store that contains the schema.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Identifies the namespaces of the entities referenced by this schema.
     * </p>
     */
    private java.util.List<String> namespaces;
    /**
     * <p>
     * The date and time that the schema was originally created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time that the schema was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The unique ID of the policy store that contains the schema.
     * </p>
     * 
     * @param policyStoreId
     *        The unique ID of the policy store that contains the schema.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * The unique ID of the policy store that contains the schema.
     * </p>
     * 
     * @return The unique ID of the policy store that contains the schema.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * The unique ID of the policy store that contains the schema.
     * </p>
     * 
     * @param policyStoreId
     *        The unique ID of the policy store that contains the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaResult withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Identifies the namespaces of the entities referenced by this schema.
     * </p>
     * 
     * @return Identifies the namespaces of the entities referenced by this schema.
     */

    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    /**
     * <p>
     * Identifies the namespaces of the entities referenced by this schema.
     * </p>
     * 
     * @param namespaces
     *        Identifies the namespaces of the entities referenced by this schema.
     */

    public void setNamespaces(java.util.Collection<String> namespaces) {
        if (namespaces == null) {
            this.namespaces = null;
            return;
        }

        this.namespaces = new java.util.ArrayList<String>(namespaces);
    }

    /**
     * <p>
     * Identifies the namespaces of the entities referenced by this schema.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamespaces(java.util.Collection)} or {@link #withNamespaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param namespaces
     *        Identifies the namespaces of the entities referenced by this schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaResult withNamespaces(String... namespaces) {
        if (this.namespaces == null) {
            setNamespaces(new java.util.ArrayList<String>(namespaces.length));
        }
        for (String ele : namespaces) {
            this.namespaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies the namespaces of the entities referenced by this schema.
     * </p>
     * 
     * @param namespaces
     *        Identifies the namespaces of the entities referenced by this schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaResult withNamespaces(java.util.Collection<String> namespaces) {
        setNamespaces(namespaces);
        return this;
    }

    /**
     * <p>
     * The date and time that the schema was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the schema was originally created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time that the schema was originally created.
     * </p>
     * 
     * @return The date and time that the schema was originally created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time that the schema was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the schema was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the schema was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the schema was last updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the schema was last updated.
     * </p>
     * 
     * @return The date and time that the schema was last updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the schema was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the schema was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getNamespaces() != null)
            sb.append("Namespaces: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSchemaResult == false)
            return false;
        PutSchemaResult other = (PutSchemaResult) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getNamespaces() == null ^ this.getNamespaces() == null)
            return false;
        if (other.getNamespaces() != null && other.getNamespaces().equals(this.getNamespaces()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getNamespaces() == null) ? 0 : getNamespaces().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public PutSchemaResult clone() {
        try {
            return (PutSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
