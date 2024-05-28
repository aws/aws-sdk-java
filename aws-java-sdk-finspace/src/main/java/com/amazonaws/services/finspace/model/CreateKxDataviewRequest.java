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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxDataview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxDataviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the dataview.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the database where you want to create a dataview.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A unique identifier for the dataview.
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
     * A unique identifier of the changeset that you want to use to ingest data.
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
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview, when you ingest new changesets. The default value is false.
     * </p>
     */
    private Boolean autoUpdate;
    /**
     * <p>
     * The option to specify whether you want to make the dataview writable to perform database maintenance. The
     * following are some considerations related to writable dataviews.&#x2028;&#x2028;
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot create partial writable dataviews. When you create writeable dataviews you must provide the entire
     * database path.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as <b>False</b> if
     * <code>readWrite</code> is <b>True</b> for a dataview.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is already
     * in use by another dataview, the dataview creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     * <code>readWrite</code> parameter later.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean readWrite;
    /**
     * <p>
     * A description of the dataview.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of key-value pairs to label the dataview. You can add up to 50 tags to a dataview.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the dataview.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you want to create the dataview.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the dataview.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, where you want to create the dataview.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, where you want to create the dataview.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, where you want to create the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the database where you want to create a dataview.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where you want to create a dataview.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database where you want to create a dataview.
     * </p>
     * 
     * @return The name of the database where you want to create a dataview.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database where you want to create a dataview.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where you want to create a dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the dataview.
     * </p>
     * 
     * @param dataviewName
     *        A unique identifier for the dataview.
     */

    public void setDataviewName(String dataviewName) {
        this.dataviewName = dataviewName;
    }

    /**
     * <p>
     * A unique identifier for the dataview.
     * </p>
     * 
     * @return A unique identifier for the dataview.
     */

    public String getDataviewName() {
        return this.dataviewName;
    }

    /**
     * <p>
     * A unique identifier for the dataview.
     * </p>
     * 
     * @param dataviewName
     *        A unique identifier for the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withDataviewName(String dataviewName) {
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

    public CreateKxDataviewRequest withAzMode(String azMode) {
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

    public CreateKxDataviewRequest withAzMode(KxAzMode azMode) {
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

    public CreateKxDataviewRequest withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the changeset that you want to use to ingest data.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier of the changeset that you want to use to ingest data.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * A unique identifier of the changeset that you want to use to ingest data.
     * </p>
     * 
     * @return A unique identifier of the changeset that you want to use to ingest data.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * A unique identifier of the changeset that you want to use to ingest data.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier of the changeset that you want to use to ingest data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withChangesetId(String changesetId) {
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

    public CreateKxDataviewRequest withSegmentConfigurations(KxDataviewSegmentConfiguration... segmentConfigurations) {
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

    public CreateKxDataviewRequest withSegmentConfigurations(java.util.Collection<KxDataviewSegmentConfiguration> segmentConfigurations) {
        setSegmentConfigurations(segmentConfigurations);
        return this;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview, when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @param autoUpdate
     *        The option to specify whether you want to apply all the future additions and corrections automatically to
     *        the dataview, when you ingest new changesets. The default value is false.
     */

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview, when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @return The option to specify whether you want to apply all the future additions and corrections automatically to
     *         the dataview, when you ingest new changesets. The default value is false.
     */

    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview, when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @param autoUpdate
     *        The option to specify whether you want to apply all the future additions and corrections automatically to
     *        the dataview, when you ingest new changesets. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withAutoUpdate(Boolean autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * The option to specify whether you want to apply all the future additions and corrections automatically to the
     * dataview, when you ingest new changesets. The default value is false.
     * </p>
     * 
     * @return The option to specify whether you want to apply all the future additions and corrections automatically to
     *         the dataview, when you ingest new changesets. The default value is false.
     */

    public Boolean isAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * The option to specify whether you want to make the dataview writable to perform database maintenance. The
     * following are some considerations related to writable dataviews.&#x2028;&#x2028;
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot create partial writable dataviews. When you create writeable dataviews you must provide the entire
     * database path.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as <b>False</b> if
     * <code>readWrite</code> is <b>True</b> for a dataview.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is already
     * in use by another dataview, the dataview creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     * <code>readWrite</code> parameter later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param readWrite
     *        The option to specify whether you want to make the dataview writable to perform database maintenance. The
     *        following are some considerations related to writable dataviews.&#x2028;&#x2028;</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You cannot create partial writable dataviews. When you create writeable dataviews you must provide the
     *        entire database path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as
     *        <b>False</b> if <code>readWrite</code> is <b>True</b> for a dataview.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is
     *        already in use by another dataview, the dataview creation fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     *        <code>readWrite</code> parameter later.
     *        </p>
     *        </li>
     */

    public void setReadWrite(Boolean readWrite) {
        this.readWrite = readWrite;
    }

    /**
     * <p>
     * The option to specify whether you want to make the dataview writable to perform database maintenance. The
     * following are some considerations related to writable dataviews.&#x2028;&#x2028;
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot create partial writable dataviews. When you create writeable dataviews you must provide the entire
     * database path.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as <b>False</b> if
     * <code>readWrite</code> is <b>True</b> for a dataview.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is already
     * in use by another dataview, the dataview creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     * <code>readWrite</code> parameter later.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The option to specify whether you want to make the dataview writable to perform database maintenance. The
     *         following are some considerations related to writable dataviews.&#x2028;&#x2028;</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You cannot create partial writable dataviews. When you create writeable dataviews you must provide the
     *         entire database path.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as
     *         <b>False</b> if <code>readWrite</code> is <b>True</b> for a dataview.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is
     *         already in use by another dataview, the dataview creation fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     *         <code>readWrite</code> parameter later.
     *         </p>
     *         </li>
     */

    public Boolean getReadWrite() {
        return this.readWrite;
    }

    /**
     * <p>
     * The option to specify whether you want to make the dataview writable to perform database maintenance. The
     * following are some considerations related to writable dataviews.&#x2028;&#x2028;
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot create partial writable dataviews. When you create writeable dataviews you must provide the entire
     * database path.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as <b>False</b> if
     * <code>readWrite</code> is <b>True</b> for a dataview.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is already
     * in use by another dataview, the dataview creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     * <code>readWrite</code> parameter later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param readWrite
     *        The option to specify whether you want to make the dataview writable to perform database maintenance. The
     *        following are some considerations related to writable dataviews.&#x2028;&#x2028;</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You cannot create partial writable dataviews. When you create writeable dataviews you must provide the
     *        entire database path.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as
     *        <b>False</b> if <code>readWrite</code> is <b>True</b> for a dataview.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is
     *        already in use by another dataview, the dataview creation fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     *        <code>readWrite</code> parameter later.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withReadWrite(Boolean readWrite) {
        setReadWrite(readWrite);
        return this;
    }

    /**
     * <p>
     * The option to specify whether you want to make the dataview writable to perform database maintenance. The
     * following are some considerations related to writable dataviews.&#x2028;&#x2028;
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot create partial writable dataviews. When you create writeable dataviews you must provide the entire
     * database path.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as <b>False</b> if
     * <code>readWrite</code> is <b>True</b> for a dataview.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is already
     * in use by another dataview, the dataview creation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     * <code>readWrite</code> parameter later.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The option to specify whether you want to make the dataview writable to perform database maintenance. The
     *         following are some considerations related to writable dataviews.&#x2028;&#x2028;</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You cannot create partial writable dataviews. When you create writeable dataviews you must provide the
     *         entire database path.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You cannot perform updates on a writeable dataview. Hence, <code>autoUpdate</code> must be set as
     *         <b>False</b> if <code>readWrite</code> is <b>True</b> for a dataview.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must also use a unique volume for creating a writeable dataview. So, if you choose a volume that is
     *         already in use by another dataview, the dataview creation fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Once you create a dataview as writeable, you cannot change it to read-only. So, you cannot update the
     *         <code>readWrite</code> parameter later.
     *         </p>
     *         </li>
     */

    public Boolean isReadWrite() {
        return this.readWrite;
    }

    /**
     * <p>
     * A description of the dataview.
     * </p>
     * 
     * @param description
     *        A description of the dataview.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the dataview.
     * </p>
     * 
     * @return A description of the dataview.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the dataview.
     * </p>
     * 
     * @param description
     *        A description of the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the dataview. You can add up to 50 tags to a dataview.
     * </p>
     * 
     * @return A list of key-value pairs to label the dataview. You can add up to 50 tags to a dataview.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the dataview. You can add up to 50 tags to a dataview.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the dataview. You can add up to 50 tags to a dataview.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the dataview. You can add up to 50 tags to a dataview.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the dataview. You can add up to 50 tags to a dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateKxDataviewRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxDataviewRequest clearTagsEntries() {
        this.tags = null;
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

    public CreateKxDataviewRequest withClientToken(String clientToken) {
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
        if (getAzMode() != null)
            sb.append("AzMode: ").append(getAzMode()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getSegmentConfigurations() != null)
            sb.append("SegmentConfigurations: ").append(getSegmentConfigurations()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate()).append(",");
        if (getReadWrite() != null)
            sb.append("ReadWrite: ").append(getReadWrite()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateKxDataviewRequest == false)
            return false;
        CreateKxDataviewRequest other = (CreateKxDataviewRequest) obj;
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
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        if (other.getReadWrite() == null ^ this.getReadWrite() == null)
            return false;
        if (other.getReadWrite() != null && other.getReadWrite().equals(this.getReadWrite()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getAzMode() == null) ? 0 : getAzMode().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getSegmentConfigurations() == null) ? 0 : getSegmentConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getReadWrite() == null) ? 0 : getReadWrite().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxDataviewRequest clone() {
        return (CreateKxDataviewRequest) super.clone();
    }

}
