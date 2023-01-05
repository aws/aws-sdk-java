/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an import that was returned by a lookup request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ImportsListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportsListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the import.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The status of the import.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinations;
    /**
     * <p>
     * The timestamp of the import's creation.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The timestamp of the import's last update.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @param importId
     *        The ID of the import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @return The ID of the import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @param importId
     *        The ID of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportsListItem withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @return The status of the import.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportsListItem withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportsListItem withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @return The ARN of the destination event data store.
     */

    public java.util.List<String> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinations;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store.
     */

    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<String>(destinations);
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportsListItem withDestinations(String... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<String>(destinations.length));
        }
        for (String ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportsListItem withDestinations(java.util.Collection<String> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The timestamp of the import's creation.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of the import's creation.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of the import's creation.
     * </p>
     * 
     * @return The timestamp of the import's creation.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of the import's creation.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of the import's creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportsListItem withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of the import's last update.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp of the import's last update.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the import's last update.
     * </p>
     * 
     * @return The timestamp of the import's last update.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the import's last update.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp of the import's last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportsListItem withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportsListItem == false)
            return false;
        ImportsListItem other = (ImportsListItem) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ImportsListItem clone() {
        try {
            return (ImportsListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.ImportsListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
