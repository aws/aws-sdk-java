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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The inventory result item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryResultItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     */
    private String captureTime;
    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory
     * information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     */
    private String contentHash;
    /**
     * <p>
     * Contains all the inventory data of the item type. Results include attribute names and values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>> content;

    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory result item type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     * 
     * @return The name of the inventory result item type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory result item type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultItem withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     * 
     * @param schemaVersion
     *        The schema version for the inventory result item/
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     * 
     * @return The schema version for the inventory result item/
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     * 
     * @param schemaVersion
     *        The schema version for the inventory result item/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultItem withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     * 
     * @param captureTime
     *        The time inventory item data was captured.
     */

    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     * 
     * @return The time inventory item data was captured.
     */

    public String getCaptureTime() {
        return this.captureTime;
    }

    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     * 
     * @param captureTime
     *        The time inventory item data was captured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultItem withCaptureTime(String captureTime) {
        setCaptureTime(captureTime);
        return this;
    }

    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory
     * information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     * 
     * @param contentHash
     *        MD5 hash of the inventory item type contents. The content hash is used to determine whether to update
     *        inventory information. The PutInventory API does not update the inventory item type contents if the MD5
     *        hash has not changed since last update.
     */

    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }

    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory
     * information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     * 
     * @return MD5 hash of the inventory item type contents. The content hash is used to determine whether to update
     *         inventory information. The PutInventory API does not update the inventory item type contents if the MD5
     *         hash has not changed since last update.
     */

    public String getContentHash() {
        return this.contentHash;
    }

    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory
     * information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     * 
     * @param contentHash
     *        MD5 hash of the inventory item type contents. The content hash is used to determine whether to update
     *        inventory information. The PutInventory API does not update the inventory item type contents if the MD5
     *        hash has not changed since last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultItem withContentHash(String contentHash) {
        setContentHash(contentHash);
        return this;
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include attribute names and values.
     * </p>
     * 
     * @return Contains all the inventory data of the item type. Results include attribute names and values.
     */

    public java.util.List<java.util.Map<String, String>> getContent() {
        if (content == null) {
            content = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>();
        }
        return content;
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include attribute names and values.
     * </p>
     * 
     * @param content
     *        Contains all the inventory data of the item type. Results include attribute names and values.
     */

    public void setContent(java.util.Collection<java.util.Map<String, String>> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(content);
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include attribute names and values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        Contains all the inventory data of the item type. Results include attribute names and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultItem withContent(java.util.Map<String, String>... content) {
        if (this.content == null) {
            setContent(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(content.length));
        }
        for (java.util.Map<String, String> ele : content) {
            this.content.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include attribute names and values.
     * </p>
     * 
     * @param content
     *        Contains all the inventory data of the item type. Results include attribute names and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultItem withContent(java.util.Collection<java.util.Map<String, String>> content) {
        setContent(content);
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getCaptureTime() != null)
            sb.append("CaptureTime: ").append(getCaptureTime()).append(",");
        if (getContentHash() != null)
            sb.append("ContentHash: ").append(getContentHash()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryResultItem == false)
            return false;
        InventoryResultItem other = (InventoryResultItem) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getCaptureTime() == null ^ this.getCaptureTime() == null)
            return false;
        if (other.getCaptureTime() != null && other.getCaptureTime().equals(this.getCaptureTime()) == false)
            return false;
        if (other.getContentHash() == null ^ this.getContentHash() == null)
            return false;
        if (other.getContentHash() != null && other.getContentHash().equals(this.getContentHash()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getCaptureTime() == null) ? 0 : getCaptureTime().hashCode());
        hashCode = prime * hashCode + ((getContentHash() == null) ? 0 : getContentHash().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public InventoryResultItem clone() {
        try {
            return (InventoryResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
