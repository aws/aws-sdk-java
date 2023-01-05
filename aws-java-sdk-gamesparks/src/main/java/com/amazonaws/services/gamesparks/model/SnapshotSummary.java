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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the properties of a snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/SnapshotSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The description of the snapshot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the snapshot.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Then timestamp of when the snapshot was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     * 
     * @param created
     *        The timestamp of when the snapshot was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     * 
     * @return The timestamp of when the snapshot was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     * 
     * @param created
     *        The timestamp of when the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotSummary withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @param description
     *        The description of the snapshot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @return The description of the snapshot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @param description
     *        The description of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot.
     * </p>
     * 
     * @param id
     *        The identifier of the snapshot.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the snapshot.
     * </p>
     * 
     * @return The identifier of the snapshot.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the snapshot.
     * </p>
     * 
     * @param id
     *        The identifier of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Then timestamp of when the snapshot was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Then timestamp of when the snapshot was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Then timestamp of when the snapshot was last updated.
     * </p>
     * 
     * @return Then timestamp of when the snapshot was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * Then timestamp of when the snapshot was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Then timestamp of when the snapshot was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotSummary withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotSummary == false)
            return false;
        SnapshotSummary other = (SnapshotSummary) obj;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotSummary clone() {
        try {
            return (SnapshotSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.SnapshotSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
