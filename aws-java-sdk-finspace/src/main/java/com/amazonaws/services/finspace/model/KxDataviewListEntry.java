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
 * A collection of kdb dataview entries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxDataviewListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDataviewListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A unique identifier of the database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A unique identifier of the dataview.
     * </p>
     */
    private String dataviewName;
    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     */
    private String azMode;
    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     */
    private String availabilityZoneId;
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
     * The active changeset versions for the given dataview entry.
     * </p>
     */
    private java.util.List<KxDataviewActiveVersion> activeVersions;
    /**
     * <p>
     * The status of a given dataview entry.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description for the dataview list entry.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview when you ingest new changesets. The default value is false.
     * </p>
     */
    private Boolean autoUpdate;
    /**
     * <p>
     * Returns True if the dataview is created as writeable and False otherwise.
     * </p>
     */
    private Boolean readWrite;
    /**
     * <p>
     * The timestamp at which the dataview list entry was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The last time that the dataview list was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @return A unique identifier for the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the database.
     * </p>
     * 
     * @param databaseName
     *        A unique identifier of the database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * A unique identifier of the database.
     * </p>
     * 
     * @return A unique identifier of the database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * A unique identifier of the database.
     * </p>
     * 
     * @param databaseName
     *        A unique identifier of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the dataview.
     * </p>
     * 
     * @param dataviewName
     *        A unique identifier of the dataview.
     */

    public void setDataviewName(String dataviewName) {
        this.dataviewName = dataviewName;
    }

    /**
     * <p>
     * A unique identifier of the dataview.
     * </p>
     * 
     * @return A unique identifier of the dataview.
     */

    public String getDataviewName() {
        return this.dataviewName;
    }

    /**
     * <p>
     * A unique identifier of the dataview.
     * </p>
     * 
     * @param dataviewName
     *        A unique identifier of the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withDataviewName(String dataviewName) {
        setDataviewName(dataviewName);
        return this;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @see KxAzMode
     */

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @return The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *         <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @see KxAzMode
     */

    public String getAzMode() {
        return this.azMode;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public KxDataviewListEntry withAzMode(String azMode) {
        setAzMode(azMode);
        return this;
    }

    /**
     * <p>
     * The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     * <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * </p>
     * 
     * @param azMode
     *        The number of availability zones you want to assign per volume. Currently, FinSpace only supports
     *        <code>SINGLE</code> for volumes. This places dataview in a single AZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxAzMode
     */

    public KxDataviewListEntry withAzMode(KxAzMode azMode) {
        this.azMode = azMode.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @return The identifier of the availability zones.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
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

    public KxDataviewListEntry withChangesetId(String changesetId) {
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

    public KxDataviewListEntry withSegmentConfigurations(KxDataviewSegmentConfiguration... segmentConfigurations) {
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

    public KxDataviewListEntry withSegmentConfigurations(java.util.Collection<KxDataviewSegmentConfiguration> segmentConfigurations) {
        setSegmentConfigurations(segmentConfigurations);
        return this;
    }

    /**
     * <p>
     * The active changeset versions for the given dataview entry.
     * </p>
     * 
     * @return The active changeset versions for the given dataview entry.
     */

    public java.util.List<KxDataviewActiveVersion> getActiveVersions() {
        return activeVersions;
    }

    /**
     * <p>
     * The active changeset versions for the given dataview entry.
     * </p>
     * 
     * @param activeVersions
     *        The active changeset versions for the given dataview entry.
     */

    public void setActiveVersions(java.util.Collection<KxDataviewActiveVersion> activeVersions) {
        if (activeVersions == null) {
            this.activeVersions = null;
            return;
        }

        this.activeVersions = new java.util.ArrayList<KxDataviewActiveVersion>(activeVersions);
    }

    /**
     * <p>
     * The active changeset versions for the given dataview entry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveVersions(java.util.Collection)} or {@link #withActiveVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param activeVersions
     *        The active changeset versions for the given dataview entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withActiveVersions(KxDataviewActiveVersion... activeVersions) {
        if (this.activeVersions == null) {
            setActiveVersions(new java.util.ArrayList<KxDataviewActiveVersion>(activeVersions.length));
        }
        for (KxDataviewActiveVersion ele : activeVersions) {
            this.activeVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The active changeset versions for the given dataview entry.
     * </p>
     * 
     * @param activeVersions
     *        The active changeset versions for the given dataview entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withActiveVersions(java.util.Collection<KxDataviewActiveVersion> activeVersions) {
        setActiveVersions(activeVersions);
        return this;
    }

    /**
     * <p>
     * The status of a given dataview entry.
     * </p>
     * 
     * @param status
     *        The status of a given dataview entry.
     * @see KxDataviewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a given dataview entry.
     * </p>
     * 
     * @return The status of a given dataview entry.
     * @see KxDataviewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a given dataview entry.
     * </p>
     * 
     * @param status
     *        The status of a given dataview entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxDataviewStatus
     */

    public KxDataviewListEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a given dataview entry.
     * </p>
     * 
     * @param status
     *        The status of a given dataview entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxDataviewStatus
     */

    public KxDataviewListEntry withStatus(KxDataviewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description for the dataview list entry.
     * </p>
     * 
     * @param description
     *        A description for the dataview list entry.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the dataview list entry.
     * </p>
     * 
     * @return A description for the dataview list entry.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the dataview list entry.
     * </p>
     * 
     * @param description
     *        A description for the dataview list entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @param autoUpdate
     *        The option to specify whether you want to apply all the future additions and corrections automatically to
     *        the dataview when you ingest new changesets. The default value is false.
     */

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @return The option to specify whether you want to apply all the future additions and corrections automatically to
     *         the dataview when you ingest new changesets. The default value is false.
     */

    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @param autoUpdate
     *        The option to specify whether you want to apply all the future additions and corrections automatically to
     *        the dataview when you ingest new changesets. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withAutoUpdate(Boolean autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @return The option to specify whether you want to apply all the future additions and corrections automatically to
     *         the dataview when you ingest new changesets. The default value is false.
     */

    public Boolean isAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Returns True if the dataview is created as writeable and False otherwise.
     * </p>
     * 
     * @param readWrite
     *        Returns True if the dataview is created as writeable and False otherwise.
     */

    public void setReadWrite(Boolean readWrite) {
        this.readWrite = readWrite;
    }

    /**
     * <p>
     * Returns True if the dataview is created as writeable and False otherwise.
     * </p>
     * 
     * @return Returns True if the dataview is created as writeable and False otherwise.
     */

    public Boolean getReadWrite() {
        return this.readWrite;
    }

    /**
     * <p>
     * Returns True if the dataview is created as writeable and False otherwise.
     * </p>
     * 
     * @param readWrite
     *        Returns True if the dataview is created as writeable and False otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withReadWrite(Boolean readWrite) {
        setReadWrite(readWrite);
        return this;
    }

    /**
     * <p>
     * Returns True if the dataview is created as writeable and False otherwise.
     * </p>
     * 
     * @return Returns True if the dataview is created as writeable and False otherwise.
     */

    public Boolean isReadWrite() {
        return this.readWrite;
    }

    /**
     * <p>
     * The timestamp at which the dataview list entry was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the dataview list entry was created in FinSpace. The value is determined as epoch
     *        time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the dataview list entry was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the dataview list entry was created in FinSpace. The value is determined as epoch
     *         time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the dataview list entry was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the dataview list entry was created in FinSpace. The value is determined as epoch
     *        time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The last time that the dataview list was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the dataview list was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the dataview list was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The last time that the dataview list was updated in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the dataview list was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the dataview list was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @return The error message when a failed state occurs.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewListEntry withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getAzMode() != null)
            sb.append("AzMode: ").append(getAzMode()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getSegmentConfigurations() != null)
            sb.append("SegmentConfigurations: ").append(getSegmentConfigurations()).append(",");
        if (getActiveVersions() != null)
            sb.append("ActiveVersions: ").append(getActiveVersions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate()).append(",");
        if (getReadWrite() != null)
            sb.append("ReadWrite: ").append(getReadWrite()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxDataviewListEntry == false)
            return false;
        KxDataviewListEntry other = (KxDataviewListEntry) obj;
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
        if (other.getAzMode() == null ^ this.getAzMode() == null)
            return false;
        if (other.getAzMode() != null && other.getAzMode().equals(this.getAzMode()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        if (other.getSegmentConfigurations() == null ^ this.getSegmentConfigurations() == null)
            return false;
        if (other.getSegmentConfigurations() != null && other.getSegmentConfigurations().equals(this.getSegmentConfigurations()) == false)
            return false;
        if (other.getActiveVersions() == null ^ this.getActiveVersions() == null)
            return false;
        if (other.getActiveVersions() != null && other.getActiveVersions().equals(this.getActiveVersions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        if (other.getReadWrite() == null ^ this.getReadWrite() == null)
            return false;
        if (other.getReadWrite() != null && other.getReadWrite().equals(this.getReadWrite()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
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
        hashCode = prime * hashCode + ((getAzMode() == null) ? 0 : getAzMode().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getSegmentConfigurations() == null) ? 0 : getSegmentConfigurations().hashCode());
        hashCode = prime * hashCode + ((getActiveVersions() == null) ? 0 : getActiveVersions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getReadWrite() == null) ? 0 : getReadWrite().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public KxDataviewListEntry clone() {
        try {
            return (KxDataviewListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxDataviewListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
