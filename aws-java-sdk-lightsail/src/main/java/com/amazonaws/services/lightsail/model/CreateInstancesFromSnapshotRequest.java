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
     * 
     * @param instanceSnapshotName
     *        The name of the instance snapshot on which you are basing your new instances. Use the get instance
     *        snapshots operation to return information about your existing snapshots.
     */

    public void setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots
     * operation to return information about your existing snapshots.
     * </p>
     * 
     * @return The name of the instance snapshot on which you are basing your new instances. Use the get instance
     *         snapshots operation to return information about your existing snapshots.
     */

    public String getInstanceSnapshotName() {
        return this.instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots
     * operation to return information about your existing snapshots.
     * </p>
     * 
     * @param instanceSnapshotName
     *        The name of the instance snapshot on which you are basing your new instances. Use the get instance
     *        snapshots operation to return information about your existing snapshots.
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
        return hashCode;
    }

    @Override
    public CreateInstancesFromSnapshotRequest clone() {
        return (CreateInstancesFromSnapshotRequest) super.clone();
    }

}
