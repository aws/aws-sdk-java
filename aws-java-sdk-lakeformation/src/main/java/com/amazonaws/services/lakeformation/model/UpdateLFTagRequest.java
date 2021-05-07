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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLFTagRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The key-name for the tag for which to add or delete values.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * A list of tag values to delete from the tag.
     * </p>
     */
    private java.util.List<String> tagValuesToDelete;
    /**
     * <p>
     * A list of tag values to add from the tag.
     * </p>
     */
    private java.util.List<String> tagValuesToAdd;

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

    public UpdateLFTagRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The key-name for the tag for which to add or delete values.
     * </p>
     * 
     * @param tagKey
     *        The key-name for the tag for which to add or delete values.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The key-name for the tag for which to add or delete values.
     * </p>
     * 
     * @return The key-name for the tag for which to add or delete values.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The key-name for the tag for which to add or delete values.
     * </p>
     * 
     * @param tagKey
     *        The key-name for the tag for which to add or delete values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLFTagRequest withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * A list of tag values to delete from the tag.
     * </p>
     * 
     * @return A list of tag values to delete from the tag.
     */

    public java.util.List<String> getTagValuesToDelete() {
        return tagValuesToDelete;
    }

    /**
     * <p>
     * A list of tag values to delete from the tag.
     * </p>
     * 
     * @param tagValuesToDelete
     *        A list of tag values to delete from the tag.
     */

    public void setTagValuesToDelete(java.util.Collection<String> tagValuesToDelete) {
        if (tagValuesToDelete == null) {
            this.tagValuesToDelete = null;
            return;
        }

        this.tagValuesToDelete = new java.util.ArrayList<String>(tagValuesToDelete);
    }

    /**
     * <p>
     * A list of tag values to delete from the tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValuesToDelete(java.util.Collection)} or {@link #withTagValuesToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagValuesToDelete
     *        A list of tag values to delete from the tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLFTagRequest withTagValuesToDelete(String... tagValuesToDelete) {
        if (this.tagValuesToDelete == null) {
            setTagValuesToDelete(new java.util.ArrayList<String>(tagValuesToDelete.length));
        }
        for (String ele : tagValuesToDelete) {
            this.tagValuesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag values to delete from the tag.
     * </p>
     * 
     * @param tagValuesToDelete
     *        A list of tag values to delete from the tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLFTagRequest withTagValuesToDelete(java.util.Collection<String> tagValuesToDelete) {
        setTagValuesToDelete(tagValuesToDelete);
        return this;
    }

    /**
     * <p>
     * A list of tag values to add from the tag.
     * </p>
     * 
     * @return A list of tag values to add from the tag.
     */

    public java.util.List<String> getTagValuesToAdd() {
        return tagValuesToAdd;
    }

    /**
     * <p>
     * A list of tag values to add from the tag.
     * </p>
     * 
     * @param tagValuesToAdd
     *        A list of tag values to add from the tag.
     */

    public void setTagValuesToAdd(java.util.Collection<String> tagValuesToAdd) {
        if (tagValuesToAdd == null) {
            this.tagValuesToAdd = null;
            return;
        }

        this.tagValuesToAdd = new java.util.ArrayList<String>(tagValuesToAdd);
    }

    /**
     * <p>
     * A list of tag values to add from the tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValuesToAdd(java.util.Collection)} or {@link #withTagValuesToAdd(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tagValuesToAdd
     *        A list of tag values to add from the tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLFTagRequest withTagValuesToAdd(String... tagValuesToAdd) {
        if (this.tagValuesToAdd == null) {
            setTagValuesToAdd(new java.util.ArrayList<String>(tagValuesToAdd.length));
        }
        for (String ele : tagValuesToAdd) {
            this.tagValuesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag values to add from the tag.
     * </p>
     * 
     * @param tagValuesToAdd
     *        A list of tag values to add from the tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLFTagRequest withTagValuesToAdd(java.util.Collection<String> tagValuesToAdd) {
        setTagValuesToAdd(tagValuesToAdd);
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getTagValuesToDelete() != null)
            sb.append("TagValuesToDelete: ").append(getTagValuesToDelete()).append(",");
        if (getTagValuesToAdd() != null)
            sb.append("TagValuesToAdd: ").append(getTagValuesToAdd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLFTagRequest == false)
            return false;
        UpdateLFTagRequest other = (UpdateLFTagRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValuesToDelete() == null ^ this.getTagValuesToDelete() == null)
            return false;
        if (other.getTagValuesToDelete() != null && other.getTagValuesToDelete().equals(this.getTagValuesToDelete()) == false)
            return false;
        if (other.getTagValuesToAdd() == null ^ this.getTagValuesToAdd() == null)
            return false;
        if (other.getTagValuesToAdd() != null && other.getTagValuesToAdd().equals(this.getTagValuesToAdd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValuesToDelete() == null) ? 0 : getTagValuesToDelete().hashCode());
        hashCode = prime * hashCode + ((getTagValuesToAdd() == null) ? 0 : getTagValuesToAdd().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLFTagRequest clone() {
        return (UpdateLFTagRequest) super.clone();
    }

}
