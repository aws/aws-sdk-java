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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that stores the configuration details of a dataview.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxDataviewConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDataviewConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the dataview.
     * </p>
     */
    private String dataviewName;
    /**
     * <p>
     * The version of the dataview corresponding to a given changeset.
     * </p>
     */
    private String dataviewVersionId;
    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     */
    private String changesetId;
    /**
     * <p>
     * The db path and volume configuration for the segmented database.
     * </p>
     */
    private java.util.List<KxDataviewSegmentConfiguration> segmentConfigurations;

    /**
     * <p>
     * The unique identifier of the dataview.
     * </p>
     * 
     * @param dataviewName
     *        The unique identifier of the dataview.
     */

    public void setDataviewName(String dataviewName) {
        this.dataviewName = dataviewName;
    }

    /**
     * <p>
     * The unique identifier of the dataview.
     * </p>
     * 
     * @return The unique identifier of the dataview.
     */

    public String getDataviewName() {
        return this.dataviewName;
    }

    /**
     * <p>
     * The unique identifier of the dataview.
     * </p>
     * 
     * @param dataviewName
     *        The unique identifier of the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewConfiguration withDataviewName(String dataviewName) {
        setDataviewName(dataviewName);
        return this;
    }

    /**
     * <p>
     * The version of the dataview corresponding to a given changeset.
     * </p>
     * 
     * @param dataviewVersionId
     *        The version of the dataview corresponding to a given changeset.
     */

    public void setDataviewVersionId(String dataviewVersionId) {
        this.dataviewVersionId = dataviewVersionId;
    }

    /**
     * <p>
     * The version of the dataview corresponding to a given changeset.
     * </p>
     * 
     * @return The version of the dataview corresponding to a given changeset.
     */

    public String getDataviewVersionId() {
        return this.dataviewVersionId;
    }

    /**
     * <p>
     * The version of the dataview corresponding to a given changeset.
     * </p>
     * 
     * @param dataviewVersionId
     *        The version of the dataview corresponding to a given changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewConfiguration withDataviewVersionId(String dataviewVersionId) {
        setDataviewVersionId(dataviewVersionId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier for the changeset.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @return A unique identifier for the changeset.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier for the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewConfiguration withChangesetId(String changesetId) {
        setChangesetId(changesetId);
        return this;
    }

    /**
     * <p>
     * The db path and volume configuration for the segmented database.
     * </p>
     * 
     * @return The db path and volume configuration for the segmented database.
     */

    public java.util.List<KxDataviewSegmentConfiguration> getSegmentConfigurations() {
        return segmentConfigurations;
    }

    /**
     * <p>
     * The db path and volume configuration for the segmented database.
     * </p>
     * 
     * @param segmentConfigurations
     *        The db path and volume configuration for the segmented database.
     */

    public void setSegmentConfigurations(java.util.Collection<KxDataviewSegmentConfiguration> segmentConfigurations) {
        if (segmentConfigurations == null) {
            this.segmentConfigurations = null;
            return;
        }

        this.segmentConfigurations = new java.util.ArrayList<KxDataviewSegmentConfiguration>(segmentConfigurations);
    }

    /**
     * <p>
     * The db path and volume configuration for the segmented database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentConfigurations(java.util.Collection)} or
     * {@link #withSegmentConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param segmentConfigurations
     *        The db path and volume configuration for the segmented database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewConfiguration withSegmentConfigurations(KxDataviewSegmentConfiguration... segmentConfigurations) {
        if (this.segmentConfigurations == null) {
            setSegmentConfigurations(new java.util.ArrayList<KxDataviewSegmentConfiguration>(segmentConfigurations.length));
        }
        for (KxDataviewSegmentConfiguration ele : segmentConfigurations) {
            this.segmentConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The db path and volume configuration for the segmented database.
     * </p>
     * 
     * @param segmentConfigurations
     *        The db path and volume configuration for the segmented database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewConfiguration withSegmentConfigurations(java.util.Collection<KxDataviewSegmentConfiguration> segmentConfigurations) {
        setSegmentConfigurations(segmentConfigurations);
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
        if (getDataviewName() != null)
            sb.append("DataviewName: ").append(getDataviewName()).append(",");
        if (getDataviewVersionId() != null)
            sb.append("DataviewVersionId: ").append(getDataviewVersionId()).append(",");
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getSegmentConfigurations() != null)
            sb.append("SegmentConfigurations: ").append(getSegmentConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxDataviewConfiguration == false)
            return false;
        KxDataviewConfiguration other = (KxDataviewConfiguration) obj;
        if (other.getDataviewName() == null ^ this.getDataviewName() == null)
            return false;
        if (other.getDataviewName() != null && other.getDataviewName().equals(this.getDataviewName()) == false)
            return false;
        if (other.getDataviewVersionId() == null ^ this.getDataviewVersionId() == null)
            return false;
        if (other.getDataviewVersionId() != null && other.getDataviewVersionId().equals(this.getDataviewVersionId()) == false)
            return false;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        if (other.getSegmentConfigurations() == null ^ this.getSegmentConfigurations() == null)
            return false;
        if (other.getSegmentConfigurations() != null && other.getSegmentConfigurations().equals(this.getSegmentConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataviewName() == null) ? 0 : getDataviewName().hashCode());
        hashCode = prime * hashCode + ((getDataviewVersionId() == null) ? 0 : getDataviewVersionId().hashCode());
        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getSegmentConfigurations() == null) ? 0 : getSegmentConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public KxDataviewConfiguration clone() {
        try {
            return (KxDataviewConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxDataviewConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
