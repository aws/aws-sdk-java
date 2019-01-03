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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListInventoryEntries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInventoryEntriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     */
    private String captureTime;
    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>> entries;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     * 
     * @param typeName
     *        The type of inventory item returned by the request.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     * 
     * @return The type of inventory item returned by the request.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The type of inventory item returned by the request.
     * </p>
     * 
     * @param typeName
     *        The type of inventory item returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInventoryEntriesResult withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     * 
     * @param instanceId
     *        The instance ID targeted by the request to query inventory information.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     * 
     * @return The instance ID targeted by the request to query inventory information.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID targeted by the request to query inventory information.
     * </p>
     * 
     * @param instanceId
     *        The instance ID targeted by the request to query inventory information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInventoryEntriesResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     * 
     * @param schemaVersion
     *        The inventory schema version used by the instance(s).
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     * 
     * @return The inventory schema version used by the instance(s).
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The inventory schema version used by the instance(s).
     * </p>
     * 
     * @param schemaVersion
     *        The inventory schema version used by the instance(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInventoryEntriesResult withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     * 
     * @param captureTime
     *        The time that inventory information was collected for the instance(s).
     */

    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     * 
     * @return The time that inventory information was collected for the instance(s).
     */

    public String getCaptureTime() {
        return this.captureTime;
    }

    /**
     * <p>
     * The time that inventory information was collected for the instance(s).
     * </p>
     * 
     * @param captureTime
     *        The time that inventory information was collected for the instance(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInventoryEntriesResult withCaptureTime(String captureTime) {
        setCaptureTime(captureTime);
        return this;
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     * 
     * @return A list of inventory items on the instance(s).
     */

    public java.util.List<java.util.Map<String, String>> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>();
        }
        return entries;
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     * 
     * @param entries
     *        A list of inventory items on the instance(s).
     */

    public void setEntries(java.util.Collection<java.util.Map<String, String>> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(entries);
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        A list of inventory items on the instance(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInventoryEntriesResult withEntries(java.util.Map<String, String>... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(entries.length));
        }
        for (java.util.Map<String, String> ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of inventory items on the instance(s).
     * </p>
     * 
     * @param entries
     *        A list of inventory items on the instance(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInventoryEntriesResult withEntries(java.util.Collection<java.util.Map<String, String>> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInventoryEntriesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getCaptureTime() != null)
            sb.append("CaptureTime: ").append(getCaptureTime()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInventoryEntriesResult == false)
            return false;
        ListInventoryEntriesResult other = (ListInventoryEntriesResult) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getCaptureTime() == null ^ this.getCaptureTime() == null)
            return false;
        if (other.getCaptureTime() != null && other.getCaptureTime().equals(this.getCaptureTime()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getCaptureTime() == null) ? 0 : getCaptureTime().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInventoryEntriesResult clone() {
        try {
            return (ListInventoryEntriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
