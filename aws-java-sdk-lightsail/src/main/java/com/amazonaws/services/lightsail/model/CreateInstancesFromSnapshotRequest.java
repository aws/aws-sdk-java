/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateInstancesFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names for your new instances.
     * </p>
     */
    private java.util.List<String> instanceNames;
    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-1a</code> (case sensitive).
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
     * <code>apt-get –y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a
     * href="http://lightsail.aws.amazon.com/ls/docs/getting-started/articles/pre-installed-apps">Dev Guide</a>.
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
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-1a</code> (case sensitive).
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create your instances. Use the following formatting:
     *        <code>us-east-1a</code> (case sensitive).
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-1a</code> (case sensitive).
     * </p>
     * 
     * @return The Availability Zone where you want to create your instances. Use the following formatting:
     *         <code>us-east-1a</code> (case sensitive).
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the following formatting:
     * <code>us-east-1a</code> (case sensitive).
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create your instances. Use the following formatting:
     *        <code>us-east-1a</code> (case sensitive).
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
     * <code>apt-get –y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a
     * href="http://lightsail.aws.amazon.com/ls/docs/getting-started/articles/pre-installed-apps">Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @param userData
     *        You can create a launch script that configures a server with additional user data. For example,
     *        <code>apt-get –y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>. For a complete list, see the <a
     *        href="http://lightsail.aws.amazon.com/ls/docs/getting-started/articles/pre-installed-apps">Dev Guide</a>.
     *        </p>
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional user data. For example,
     * <code>apt-get –y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a
     * href="http://lightsail.aws.amazon.com/ls/docs/getting-started/articles/pre-installed-apps">Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @return You can create a launch script that configures a server with additional user data. For example,
     *         <code>apt-get –y update</code>.</p> <note>
     *         <p>
     *         Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *         Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *         <code>pkg</code>. For a complete list, see the <a
     *         href="http://lightsail.aws.amazon.com/ls/docs/getting-started/articles/pre-installed-apps">Dev Guide</a>.
     *         </p>
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional user data. For example,
     * <code>apt-get –y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a
     * href="http://lightsail.aws.amazon.com/ls/docs/getting-started/articles/pre-installed-apps">Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @param userData
     *        You can create a launch script that configures a server with additional user data. For example,
     *        <code>apt-get –y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>. For a complete list, see the <a
     *        href="http://lightsail.aws.amazon.com/ls/docs/getting-started/articles/pre-installed-apps">Dev Guide</a>.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("InstanceNames: " + getInstanceNames() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getInstanceSnapshotName() != null)
            sb.append("InstanceSnapshotName: " + getInstanceSnapshotName() + ",");
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getKeyPairName() != null)
            sb.append("KeyPairName: " + getKeyPairName());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstanceSnapshotName() == null) ? 0 : getInstanceSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstancesFromSnapshotRequest clone() {
        return (CreateInstancesFromSnapshotRequest) super.clone();
    }
}
