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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseFromSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRelationalDatabaseFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The name of the database snapshot from which to create your new database.
     * </p>
     */
    private String relationalDatabaseSnapshotName;
    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     * <p>
     * When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the
     * source database.
     * </p>
     */
    private String relationalDatabaseBundleId;
    /**
     * <p>
     * The name of the source database.
     * </p>
     */
    private String sourceRelationalDatabaseName;
    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code> parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date restoreTime;
    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time. A value of <code>true</code> restores
     * from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     * </p>
     */
    private Boolean useLatestRestorableTime;
    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseName
     *        The name to use for your new database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name to use for your new database.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first and last character must be a letter or number.
     *         </p>
     *         </li>
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name to use for your new database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseName
     *        The name to use for your new database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     *        format.</p>
     *        <p>
     *        You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add
     *        the <code>include relational database Availability Zones</code> parameter to your request.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @return The Availability Zone in which to create your new database. Use the <code>us-east-2a</code>
     *         case-sensitive format.</p>
     *         <p>
     *         You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add
     *         the <code>include relational database Availability Zones</code> parameter to your request.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     *        format.</p>
     *        <p>
     *        You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add
     *        the <code>include relational database Availability Zones</code> parameter to your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *        database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *        specifies a database that is available only to your Lightsail resources in the same region as your
     *        database.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @return Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *         database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *         specifies a database that is available only to your Lightsail resources in the same region as your
     *         database.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *        database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *        specifies a database that is available only to your Lightsail resources in the same region as your
     *        database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @return Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *         database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *         specifies a database that is available only to your Lightsail resources in the same region as your
     *         database.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The name of the database snapshot from which to create your new database.
     * </p>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name of the database snapshot from which to create your new database.
     */

    public void setRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot from which to create your new database.
     * </p>
     * 
     * @return The name of the database snapshot from which to create your new database.
     */

    public String getRelationalDatabaseSnapshotName() {
        return this.relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot from which to create your new database.
     * </p>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name of the database snapshot from which to create your new database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        setRelationalDatabaseSnapshotName(relationalDatabaseSnapshotName);
        return this;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     * <p>
     * When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the
     * source database.
     * </p>
     * 
     * @param relationalDatabaseBundleId
     *        The bundle ID for your new database. A bundle describes the performance specifications for your
     *        database.</p>
     *        <p>
     *        You can get a list of database bundle IDs by using the <code>get relational database bundles</code>
     *        operation.
     *        </p>
     *        <p>
     *        When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle
     *        of the source database.
     */

    public void setRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     * <p>
     * When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the
     * source database.
     * </p>
     * 
     * @return The bundle ID for your new database. A bundle describes the performance specifications for your
     *         database.</p>
     *         <p>
     *         You can get a list of database bundle IDs by using the <code>get relational database bundles</code>
     *         operation.
     *         </p>
     *         <p>
     *         When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle
     *         of the source database.
     */

    public String getRelationalDatabaseBundleId() {
        return this.relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     * <p>
     * When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the
     * source database.
     * </p>
     * 
     * @param relationalDatabaseBundleId
     *        The bundle ID for your new database. A bundle describes the performance specifications for your
     *        database.</p>
     *        <p>
     *        You can get a list of database bundle IDs by using the <code>get relational database bundles</code>
     *        operation.
     *        </p>
     *        <p>
     *        When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle
     *        of the source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        setRelationalDatabaseBundleId(relationalDatabaseBundleId);
        return this;
    }

    /**
     * <p>
     * The name of the source database.
     * </p>
     * 
     * @param sourceRelationalDatabaseName
     *        The name of the source database.
     */

    public void setSourceRelationalDatabaseName(String sourceRelationalDatabaseName) {
        this.sourceRelationalDatabaseName = sourceRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database.
     * </p>
     * 
     * @return The name of the source database.
     */

    public String getSourceRelationalDatabaseName() {
        return this.sourceRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database.
     * </p>
     * 
     * @param sourceRelationalDatabaseName
     *        The name of the source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withSourceRelationalDatabaseName(String sourceRelationalDatabaseName) {
        setSourceRelationalDatabaseName(sourceRelationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code> parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTime
     *        The date and time to restore your database from.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be specified if the <code>use latest restorable time</code> parameter is <code>true</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the restore time.
     *        </p>
     *        </li>
     */

    public void setRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
    }

    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code> parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The date and time to restore your database from.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be before the latest restorable time for the database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be specified if the <code>use latest restorable time</code> parameter is <code>true</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input
     *         <code>1538424000</code> as the restore time.
     *         </p>
     *         </li>
     */

    public java.util.Date getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * <p>
     * The date and time to restore your database from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if the <code>use latest restorable time</code> parameter is <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input
     * <code>1538424000</code> as the restore time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTime
     *        The date and time to restore your database from.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be specified if the <code>use latest restorable time</code> parameter is <code>true</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input
     *        <code>1538424000</code> as the restore time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withRestoreTime(java.util.Date restoreTime) {
        setRestoreTime(restoreTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time. A value of <code>true</code> restores
     * from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        Specifies whether your database is restored from the latest backup time. A value of <code>true</code>
     *        restores from the latest backup time. </p>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     */

    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time. A value of <code>true</code> restores
     * from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     * </p>
     * 
     * @return Specifies whether your database is restored from the latest backup time. A value of <code>true</code>
     *         restores from the latest backup time. </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     */

    public Boolean getUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time. A value of <code>true</code> restores
     * from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        Specifies whether your database is restored from the latest backup time. A value of <code>true</code>
     *        restores from the latest backup time. </p>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        setUseLatestRestorableTime(useLatestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether your database is restored from the latest backup time. A value of <code>true</code> restores
     * from the latest backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     * </p>
     * 
     * @return Specifies whether your database is restored from the latest backup time. A value of <code>true</code>
     *         restores from the latest backup time. </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if the <code>restore time</code> parameter is provided.
     */

    public Boolean isUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getRelationalDatabaseSnapshotName() != null)
            sb.append("RelationalDatabaseSnapshotName: ").append(getRelationalDatabaseSnapshotName()).append(",");
        if (getRelationalDatabaseBundleId() != null)
            sb.append("RelationalDatabaseBundleId: ").append(getRelationalDatabaseBundleId()).append(",");
        if (getSourceRelationalDatabaseName() != null)
            sb.append("SourceRelationalDatabaseName: ").append(getSourceRelationalDatabaseName()).append(",");
        if (getRestoreTime() != null)
            sb.append("RestoreTime: ").append(getRestoreTime()).append(",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: ").append(getUseLatestRestorableTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelationalDatabaseFromSnapshotRequest == false)
            return false;
        CreateRelationalDatabaseFromSnapshotRequest other = (CreateRelationalDatabaseFromSnapshotRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getRelationalDatabaseSnapshotName() == null ^ this.getRelationalDatabaseSnapshotName() == null)
            return false;
        if (other.getRelationalDatabaseSnapshotName() != null
                && other.getRelationalDatabaseSnapshotName().equals(this.getRelationalDatabaseSnapshotName()) == false)
            return false;
        if (other.getRelationalDatabaseBundleId() == null ^ this.getRelationalDatabaseBundleId() == null)
            return false;
        if (other.getRelationalDatabaseBundleId() != null && other.getRelationalDatabaseBundleId().equals(this.getRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getSourceRelationalDatabaseName() == null ^ this.getSourceRelationalDatabaseName() == null)
            return false;
        if (other.getSourceRelationalDatabaseName() != null && other.getSourceRelationalDatabaseName().equals(this.getSourceRelationalDatabaseName()) == false)
            return false;
        if (other.getRestoreTime() == null ^ this.getRestoreTime() == null)
            return false;
        if (other.getRestoreTime() != null && other.getRestoreTime().equals(this.getRestoreTime()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseSnapshotName() == null) ? 0 : getRelationalDatabaseSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseBundleId() == null) ? 0 : getRelationalDatabaseBundleId().hashCode());
        hashCode = prime * hashCode + ((getSourceRelationalDatabaseName() == null) ? 0 : getSourceRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getRestoreTime() == null) ? 0 : getRestoreTime().hashCode());
        hashCode = prime * hashCode + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRelationalDatabaseFromSnapshotRequest clone() {
        return (CreateRelationalDatabaseFromSnapshotRequest) super.clone();
    }

}
