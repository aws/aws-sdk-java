/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstancesFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names for your new instances.
     * </p>
     */
    private java.util.List<String> instanceNames;
    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     */
    private java.util.Map<String, java.util.List<DiskMap>> attachedDiskMapping;
    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-2a</code> (case sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots
     * operation to return information about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     */
    private String instanceSnapshotName;
    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * You can create a launch script that configures a server with additional user data. For example,
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     */
    private String userData;
    /**
     * <p>
     * The name for your key pair.
     * </p>
     */
    private String keyPairName;
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
     * An array of objects representing the add-ons to enable for the new instance.
     * </p>
     */
    private java.util.List<AddOnRequest> addOns;
    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceInstanceName;
    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the <code>get auto snapshots</code> operation
     * to identify the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String restoreDate;
    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean useLatestRestorableAutoSnapshot;

    /**
     * <p>
     * The names for your new instances.
     * </p>
     * 
     * @return The names for your new instances.
     */

    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * The names for your new instances.
     * </p>
     * 
     * @param instanceNames
     *        The names for your new instances.
     */

    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new java.util.ArrayList<String>(instanceNames);
    }

    /**
     * <p>
     * The names for your new instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceNames(java.util.Collection)} or {@link #withInstanceNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceNames
     *        The names for your new instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withInstanceNames(String... instanceNames) {
        if (this.instanceNames == null) {
            setInstanceNames(new java.util.ArrayList<String>(instanceNames.length));
        }
        for (String ele : instanceNames) {
            this.instanceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names for your new instances.
     * </p>
     * 
     * @param instanceNames
     *        The names for your new instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withInstanceNames(java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
        return this;
    }

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     * 
     * @return An object containing information about one or more disk mappings.
     */

    public java.util.Map<String, java.util.List<DiskMap>> getAttachedDiskMapping() {
        return attachedDiskMapping;
    }

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     * 
     * @param attachedDiskMapping
     *        An object containing information about one or more disk mappings.
     */

    public void setAttachedDiskMapping(java.util.Map<String, java.util.List<DiskMap>> attachedDiskMapping) {
        this.attachedDiskMapping = attachedDiskMapping;
    }

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     * 
     * @param attachedDiskMapping
     *        An object containing information about one or more disk mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withAttachedDiskMapping(java.util.Map<String, java.util.List<DiskMap>> attachedDiskMapping) {
        setAttachedDiskMapping(attachedDiskMapping);
        return this;
    }

    /**
     * Add a single AttachedDiskMapping entry
     *
     * @see CreateInstancesFromSnapshotRequest#withAttachedDiskMapping
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest addAttachedDiskMappingEntry(String key, java.util.List<DiskMap> value) {
        if (null == this.attachedDiskMapping) {
            this.attachedDiskMapping = new java.util.HashMap<String, java.util.List<DiskMap>>();
        }
        if (this.attachedDiskMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attachedDiskMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttachedDiskMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest clearAttachedDiskMappingEntries() {
        this.attachedDiskMapping = null;
        return this;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-2a</code> (case sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create your instances. Use the following formatting:
     *        <code>us-east-2a</code> (case sensitive). You can get a list of Availability Zones by using the <a
     *        href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     *        operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-2a</code> (case sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @return The Availability Zone where you want to create your instances. Use the following formatting:
     *         <code>us-east-2a</code> (case sensitive). You can get a list of Availability Zones by using the <a
     *         href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     *         operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-2a</code> (case sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create your instances. Use the following formatting:
     *        <code>us-east-2a</code> (case sensitive). You can get a list of Availability Zones by using the <a
     *        href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     *        operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots
     * operation to return information about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceSnapshotName
     *        The name of the instance snapshot on which you are basing your new instances. Use the get instance
     *        snapshots operation to return information about your existing snapshots.</p>
     *        <p>
     *        Constraint:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>source instance name</code> parameter. The
     *        <code>instance snapshot name</code> and <code>source instance name</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     */

    public void setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots
     * operation to return information about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the instance snapshot on which you are basing your new instances. Use the get instance
     *         snapshots operation to return information about your existing snapshots.</p>
     *         <p>
     *         Constraint:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>source instance name</code> parameter. The
     *         <code>instance snapshot name</code> and <code>source instance name</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     */

    public String getInstanceSnapshotName() {
        return this.instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots
     * operation to return information about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceSnapshotName
     *        The name of the instance snapshot on which you are basing your new instances. Use the get instance
     *        snapshots operation to return information about your existing snapshots.</p>
     *        <p>
     *        Constraint:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>source instance name</code> parameter. The
     *        <code>instance snapshot name</code> and <code>source instance name</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withInstanceSnapshotName(String instanceSnapshotName) {
        setInstanceSnapshotName(instanceSnapshotName);
        return this;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle of specification information for your virtual private server (or <i>instance</i>), including
     *        the pricing plan (e.g., <code>micro_1_0</code>).
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @return The bundle of specification information for your virtual private server (or <i>instance</i>), including
     *         the pricing plan (e.g., <code>micro_1_0</code>).
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle of specification information for your virtual private server (or <i>instance</i>), including
     *        the pricing plan (e.g., <code>micro_1_0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional user data. For example,
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @param userData
     *        You can create a launch script that configures a server with additional user data. For example,
     *        <code>apt-get -y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>. For a complete list, see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *        >Dev Guide</a>.
     *        </p>
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional user data. For example,
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @return You can create a launch script that configures a server with additional user data. For example,
     *         <code>apt-get -y update</code>.</p> <note>
     *         <p>
     *         Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *         Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *         <code>pkg</code>. For a complete list, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *         >Dev Guide</a>.
     *         </p>
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional user data. For example,
     * <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @param userData
     *        You can create a launch script that configures a server with additional user data. For example,
     *        <code>apt-get -y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>. For a complete list, see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *        >Dev Guide</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The name for your key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name for your key pair.
     */

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name for your key pair.
     * </p>
     * 
     * @return The name for your key pair.
     */

    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * <p>
     * The name for your key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name for your key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withKeyPairName(String keyPairName) {
        setKeyPairName(keyPairName);
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

    public CreateInstancesFromSnapshotRequest withTags(Tag... tags) {
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

    public CreateInstancesFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new instance.
     * </p>
     * 
     * @return An array of objects representing the add-ons to enable for the new instance.
     */

    public java.util.List<AddOnRequest> getAddOns() {
        return addOns;
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new instance.
     * </p>
     * 
     * @param addOns
     *        An array of objects representing the add-ons to enable for the new instance.
     */

    public void setAddOns(java.util.Collection<AddOnRequest> addOns) {
        if (addOns == null) {
            this.addOns = null;
            return;
        }

        this.addOns = new java.util.ArrayList<AddOnRequest>(addOns);
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddOns(java.util.Collection)} or {@link #withAddOns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param addOns
     *        An array of objects representing the add-ons to enable for the new instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withAddOns(AddOnRequest... addOns) {
        if (this.addOns == null) {
            setAddOns(new java.util.ArrayList<AddOnRequest>(addOns.length));
        }
        for (AddOnRequest ele : addOns) {
            this.addOns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new instance.
     * </p>
     * 
     * @param addOns
     *        An array of objects representing the add-ons to enable for the new instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withAddOns(java.util.Collection<AddOnRequest> addOns) {
        setAddOns(addOns);
        return this;
    }

    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceInstanceName
     *        The name of the source instance from which the source automatic snapshot was created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>instance snapshot name</code> parameter. The
     *        <code>source instance name</code> and <code>instance snapshot name</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     */

    public void setSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
    }

    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the source instance from which the source automatic snapshot was created.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>instance snapshot name</code> parameter. The
     *         <code>source instance name</code> and <code>instance snapshot name</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public String getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceInstanceName
     *        The name of the source instance from which the source automatic snapshot was created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>instance snapshot name</code> parameter. The
     *        <code>source instance name</code> and <code>instance snapshot name</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withSourceInstanceName(String sourceInstanceName) {
        setSourceInstanceName(sourceInstanceName);
        return this;
    }

    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the <code>get auto snapshots</code> operation
     * to identify the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreDate
     *        The date of the automatic snapshot to use for the new instance. Use the <code>get auto snapshots</code>
     *        operation to identify the dates of the available automatic snapshots.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be specified in <code>YYYY-MM-DD</code> format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code>
     *        parameter. The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters
     *        are mutually exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     */

    public void setRestoreDate(String restoreDate) {
        this.restoreDate = restoreDate;
    }

    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the <code>get auto snapshots</code> operation
     * to identify the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The date of the automatic snapshot to use for the new instance. Use the <code>get auto snapshots</code>
     *         operation to identify the dates of the available automatic snapshots.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be specified in <code>YYYY-MM-DD</code> format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code>
     *         parameter. The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters
     *         are mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public String getRestoreDate() {
        return this.restoreDate;
    }

    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the <code>get auto snapshots</code> operation
     * to identify the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreDate
     *        The date of the automatic snapshot to use for the new instance. Use the <code>get auto snapshots</code>
     *        operation to identify the dates of the available automatic snapshots.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be specified in <code>YYYY-MM-DD</code> format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code>
     *        parameter. The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters
     *        are mutually exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withRestoreDate(String restoreDate) {
        setRestoreDate(restoreDate);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param useLatestRestorableAutoSnapshot
     *        A Boolean value to indicate whether to use the latest available automatic snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *        <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     */

    public void setUseLatestRestorableAutoSnapshot(Boolean useLatestRestorableAutoSnapshot) {
        this.useLatestRestorableAutoSnapshot = useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A Boolean value to indicate whether to use the latest available automatic snapshot.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public Boolean getUseLatestRestorableAutoSnapshot() {
        return this.useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param useLatestRestorableAutoSnapshot
     *        A Boolean value to indicate whether to use the latest available automatic snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *        <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesFromSnapshotRequest withUseLatestRestorableAutoSnapshot(Boolean useLatestRestorableAutoSnapshot) {
        setUseLatestRestorableAutoSnapshot(useLatestRestorableAutoSnapshot);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic snapshot. For more information, see the
     * <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A Boolean value to indicate whether to use the latest available automatic snapshot.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an automatic snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public Boolean isUseLatestRestorableAutoSnapshot() {
        return this.useLatestRestorableAutoSnapshot;
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
        if (getInstanceNames() != null)
            sb.append("InstanceNames: ").append(getInstanceNames()).append(",");
        if (getAttachedDiskMapping() != null)
            sb.append("AttachedDiskMapping: ").append(getAttachedDiskMapping()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getInstanceSnapshotName() != null)
            sb.append("InstanceSnapshotName: ").append(getInstanceSnapshotName()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getKeyPairName() != null)
            sb.append("KeyPairName: ").append(getKeyPairName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAddOns() != null)
            sb.append("AddOns: ").append(getAddOns()).append(",");
        if (getSourceInstanceName() != null)
            sb.append("SourceInstanceName: ").append(getSourceInstanceName()).append(",");
        if (getRestoreDate() != null)
            sb.append("RestoreDate: ").append(getRestoreDate()).append(",");
        if (getUseLatestRestorableAutoSnapshot() != null)
            sb.append("UseLatestRestorableAutoSnapshot: ").append(getUseLatestRestorableAutoSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstancesFromSnapshotRequest == false)
            return false;
        CreateInstancesFromSnapshotRequest other = (CreateInstancesFromSnapshotRequest) obj;
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        if (other.getAttachedDiskMapping() == null ^ this.getAttachedDiskMapping() == null)
            return false;
        if (other.getAttachedDiskMapping() != null && other.getAttachedDiskMapping().equals(this.getAttachedDiskMapping()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceSnapshotName() == null ^ this.getInstanceSnapshotName() == null)
            return false;
        if (other.getInstanceSnapshotName() != null && other.getInstanceSnapshotName().equals(this.getInstanceSnapshotName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAddOns() == null ^ this.getAddOns() == null)
            return false;
        if (other.getAddOns() != null && other.getAddOns().equals(this.getAddOns()) == false)
            return false;
        if (other.getSourceInstanceName() == null ^ this.getSourceInstanceName() == null)
            return false;
        if (other.getSourceInstanceName() != null && other.getSourceInstanceName().equals(this.getSourceInstanceName()) == false)
            return false;
        if (other.getRestoreDate() == null ^ this.getRestoreDate() == null)
            return false;
        if (other.getRestoreDate() != null && other.getRestoreDate().equals(this.getRestoreDate()) == false)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() == null ^ this.getUseLatestRestorableAutoSnapshot() == null)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() != null
                && other.getUseLatestRestorableAutoSnapshot().equals(this.getUseLatestRestorableAutoSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        hashCode = prime * hashCode + ((getAttachedDiskMapping() == null) ? 0 : getAttachedDiskMapping().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstanceSnapshotName() == null) ? 0 : getInstanceSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAddOns() == null) ? 0 : getAddOns().hashCode());
        hashCode = prime * hashCode + ((getSourceInstanceName() == null) ? 0 : getSourceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getRestoreDate() == null) ? 0 : getRestoreDate().hashCode());
        hashCode = prime * hashCode + ((getUseLatestRestorableAutoSnapshot() == null) ? 0 : getUseLatestRestorableAutoSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstancesFromSnapshotRequest clone() {
        return (CreateInstancesFromSnapshotRequest) super.clone();
    }

}
