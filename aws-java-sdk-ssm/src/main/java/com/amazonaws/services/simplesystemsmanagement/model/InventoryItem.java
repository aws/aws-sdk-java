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
 * Information collected from managed instances based on your inventory policy document
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names
     * will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application,
     * AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The time the inventory information was collected.
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
     * The inventory data of the inventory type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>> content;
    /**
     * <p>
     * A map of associated properties for a specified inventory type. For example, with this attribute, you can specify
     * the <code>ExecutionId</code>, <code>ExecutionType</code>, <code>ComplianceType</code> properties of the
     * <code>AWS:ComplianceItem</code> type.
     * </p>
     */
    private java.util.Map<String, String> context;

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names
     * will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application,
     * AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type
     *        names will start with Custom. Default inventory item types include the following: AWS:AWSComponent,
     *        AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names
     * will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application,
     * AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     * </p>
     * 
     * @return The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type
     *         names will start with Custom. Default inventory item types include the following: AWS:AWSComponent,
     *         AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names
     * will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application,
     * AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type
     *        names will start with Custom. Default inventory item types include the following: AWS:AWSComponent,
     *        AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItem withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version for the inventory item.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * 
     * @return The schema version for the inventory item.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version for the inventory item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItem withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The time the inventory information was collected.
     * </p>
     * 
     * @param captureTime
     *        The time the inventory information was collected.
     */

    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * The time the inventory information was collected.
     * </p>
     * 
     * @return The time the inventory information was collected.
     */

    public String getCaptureTime() {
        return this.captureTime;
    }

    /**
     * <p>
     * The time the inventory information was collected.
     * </p>
     * 
     * @param captureTime
     *        The time the inventory information was collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItem withCaptureTime(String captureTime) {
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

    public InventoryItem withContentHash(String contentHash) {
        setContentHash(contentHash);
        return this;
    }

    /**
     * <p>
     * The inventory data of the inventory type.
     * </p>
     * 
     * @return The inventory data of the inventory type.
     */

    public java.util.List<java.util.Map<String, String>> getContent() {
        if (content == null) {
            content = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>();
        }
        return content;
    }

    /**
     * <p>
     * The inventory data of the inventory type.
     * </p>
     * 
     * @param content
     *        The inventory data of the inventory type.
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
     * The inventory data of the inventory type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        The inventory data of the inventory type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItem withContent(java.util.Map<String, String>... content) {
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
     * The inventory data of the inventory type.
     * </p>
     * 
     * @param content
     *        The inventory data of the inventory type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItem withContent(java.util.Collection<java.util.Map<String, String>> content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A map of associated properties for a specified inventory type. For example, with this attribute, you can specify
     * the <code>ExecutionId</code>, <code>ExecutionType</code>, <code>ComplianceType</code> properties of the
     * <code>AWS:ComplianceItem</code> type.
     * </p>
     * 
     * @return A map of associated properties for a specified inventory type. For example, with this attribute, you can
     *         specify the <code>ExecutionId</code>, <code>ExecutionType</code>, <code>ComplianceType</code> properties
     *         of the <code>AWS:ComplianceItem</code> type.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * A map of associated properties for a specified inventory type. For example, with this attribute, you can specify
     * the <code>ExecutionId</code>, <code>ExecutionType</code>, <code>ComplianceType</code> properties of the
     * <code>AWS:ComplianceItem</code> type.
     * </p>
     * 
     * @param context
     *        A map of associated properties for a specified inventory type. For example, with this attribute, you can
     *        specify the <code>ExecutionId</code>, <code>ExecutionType</code>, <code>ComplianceType</code> properties
     *        of the <code>AWS:ComplianceItem</code> type.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * A map of associated properties for a specified inventory type. For example, with this attribute, you can specify
     * the <code>ExecutionId</code>, <code>ExecutionType</code>, <code>ComplianceType</code> properties of the
     * <code>AWS:ComplianceItem</code> type.
     * </p>
     * 
     * @param context
     *        A map of associated properties for a specified inventory type. For example, with this attribute, you can
     *        specify the <code>ExecutionId</code>, <code>ExecutionType</code>, <code>ComplianceType</code> properties
     *        of the <code>AWS:ComplianceItem</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItem withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    public InventoryItem addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryItem clearContextEntries() {
        this.context = null;
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
            sb.append("Content: ").append(getContent()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryItem == false)
            return false;
        InventoryItem other = (InventoryItem) obj;
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
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
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
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        return hashCode;
    }

    @Override
    public InventoryItem clone() {
        try {
            return (InventoryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
