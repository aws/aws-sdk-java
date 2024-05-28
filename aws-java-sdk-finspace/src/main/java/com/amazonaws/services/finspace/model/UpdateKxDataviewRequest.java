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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxDataview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKxDataviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to update the dataview.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the dataview that you want to update.
     * </p>
     */
    private String dataviewName;
    /**
     * <p>
     * The description for a dataview.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     */
    private String changesetId;
    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     */
    private java.util.List<KxDataviewSegmentConfiguration> segmentConfigurations;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to update the dataview.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you want to update the dataview.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to update the dataview.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, where you want to update the dataview.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to update the dataview.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you want to update the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxDataviewRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @return The name of the database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxDataviewRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the dataview that you want to update.
     * </p>
     * 
     * @param dataviewName
     *        The name of the dataview that you want to update.
     */

    public void setDataviewName(String dataviewName) {
        this.dataviewName = dataviewName;
    }

    /**
     * <p>
     * The name of the dataview that you want to update.
     * </p>
     * 
     * @return The name of the dataview that you want to update.
     */

    public String getDataviewName() {
        return this.dataviewName;
    }

    /**
     * <p>
     * The name of the dataview that you want to update.
     * </p>
     * 
     * @param dataviewName
     *        The name of the dataview that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxDataviewRequest withDataviewName(String dataviewName) {
        setDataviewName(dataviewName);
        return this;
    }

    /**
     * <p>
     * The description for a dataview.
     * </p>
     * 
     * @param description
     *        The description for a dataview.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for a dataview.
     * </p>
     * 
     * @return The description for a dataview.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for a dataview.
     * </p>
     * 
     * @param description
     *        The description for a dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxDataviewRequest withDescription(String description) {
        setDescription(description);
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

    public UpdateKxDataviewRequest withChangesetId(String changesetId) {
        setChangesetId(changesetId);
        return this;
    }

    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * 
     * @return The configuration that contains the database path of the data that you want to place on each selected
     *         volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *         any database path for a volume, they are accessible from the cluster through the default S3/object store
     *         segment.
     */

    public java.util.List<KxDataviewSegmentConfiguration> getSegmentConfigurations() {
        return segmentConfigurations;
    }

    /**
     * <p>
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * 
     * @param segmentConfigurations
     *        The configuration that contains the database path of the data that you want to place on each selected
     *        volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *        any database path for a volume, they are accessible from the cluster through the default S3/object store
     *        segment.
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
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentConfigurations(java.util.Collection)} or
     * {@link #withSegmentConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param segmentConfigurations
     *        The configuration that contains the database path of the data that you want to place on each selected
     *        volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *        any database path for a volume, they are accessible from the cluster through the default S3/object store
     *        segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxDataviewRequest withSegmentConfigurations(KxDataviewSegmentConfiguration... segmentConfigurations) {
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
     * The configuration that contains the database path of the data that you want to place on each selected volume.
     * Each segment must have a unique database path for each volume. If you do not explicitly specify any database path
     * for a volume, they are accessible from the cluster through the default S3/object store segment.
     * </p>
     * 
     * @param segmentConfigurations
     *        The configuration that contains the database path of the data that you want to place on each selected
     *        volume. Each segment must have a unique database path for each volume. If you do not explicitly specify
     *        any database path for a volume, they are accessible from the cluster through the default S3/object store
     *        segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxDataviewRequest withSegmentConfigurations(java.util.Collection<KxDataviewSegmentConfiguration> segmentConfigurations) {
        setSegmentConfigurations(segmentConfigurations);
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxDataviewRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDataviewName() != null)
            sb.append("DataviewName: ").append(getDataviewName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getSegmentConfigurations() != null)
            sb.append("SegmentConfigurations: ").append(getSegmentConfigurations()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKxDataviewRequest == false)
            return false;
        UpdateKxDataviewRequest other = (UpdateKxDataviewRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDataviewName() == null ^ this.getDataviewName() == null)
            return false;
        if (other.getDataviewName() != null && other.getDataviewName().equals(this.getDataviewName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        if (other.getSegmentConfigurations() == null ^ this.getSegmentConfigurations() == null)
            return false;
        if (other.getSegmentConfigurations() != null && other.getSegmentConfigurations().equals(this.getSegmentConfigurations()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDataviewName() == null) ? 0 : getDataviewName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getSegmentConfigurations() == null) ? 0 : getSegmentConfigurations().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKxDataviewRequest clone() {
        return (UpdateKxDataviewRequest) super.clone();
    }

}
