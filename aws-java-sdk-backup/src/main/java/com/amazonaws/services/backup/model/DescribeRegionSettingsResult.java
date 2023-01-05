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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRegionSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegionSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of all services along with the opt-in preferences in the Region.
     * </p>
     */
    private java.util.Map<String, Boolean> resourceTypeOptInPreference;
    /**
     * <p>
     * Returns whether Backup fully manages the backups for a resource type.
     * </p>
     * <p>
     * For the benefits of full Backup management, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#full-management"> Full Backup
     * management</a>.
     * </p>
     * <p>
     * For a list of resource types and whether each supports full Backup management, see the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource"> Feature
     * availability by resource</a> table.
     * </p>
     * <p>
     * If <code>"DynamoDB":false</code>, you can enable full Backup management for DynamoDB backup by enabling <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * Backup's advanced DynamoDB backup features</a>.
     * </p>
     */
    private java.util.Map<String, Boolean> resourceTypeManagementPreference;

    /**
     * <p>
     * Returns a list of all services along with the opt-in preferences in the Region.
     * </p>
     * 
     * @return Returns a list of all services along with the opt-in preferences in the Region.
     */

    public java.util.Map<String, Boolean> getResourceTypeOptInPreference() {
        return resourceTypeOptInPreference;
    }

    /**
     * <p>
     * Returns a list of all services along with the opt-in preferences in the Region.
     * </p>
     * 
     * @param resourceTypeOptInPreference
     *        Returns a list of all services along with the opt-in preferences in the Region.
     */

    public void setResourceTypeOptInPreference(java.util.Map<String, Boolean> resourceTypeOptInPreference) {
        this.resourceTypeOptInPreference = resourceTypeOptInPreference;
    }

    /**
     * <p>
     * Returns a list of all services along with the opt-in preferences in the Region.
     * </p>
     * 
     * @param resourceTypeOptInPreference
     *        Returns a list of all services along with the opt-in preferences in the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionSettingsResult withResourceTypeOptInPreference(java.util.Map<String, Boolean> resourceTypeOptInPreference) {
        setResourceTypeOptInPreference(resourceTypeOptInPreference);
        return this;
    }

    /**
     * Add a single ResourceTypeOptInPreference entry
     *
     * @see DescribeRegionSettingsResult#withResourceTypeOptInPreference
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionSettingsResult addResourceTypeOptInPreferenceEntry(String key, Boolean value) {
        if (null == this.resourceTypeOptInPreference) {
            this.resourceTypeOptInPreference = new java.util.HashMap<String, Boolean>();
        }
        if (this.resourceTypeOptInPreference.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceTypeOptInPreference.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceTypeOptInPreference.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionSettingsResult clearResourceTypeOptInPreferenceEntries() {
        this.resourceTypeOptInPreference = null;
        return this;
    }

    /**
     * <p>
     * Returns whether Backup fully manages the backups for a resource type.
     * </p>
     * <p>
     * For the benefits of full Backup management, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#full-management"> Full Backup
     * management</a>.
     * </p>
     * <p>
     * For a list of resource types and whether each supports full Backup management, see the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource"> Feature
     * availability by resource</a> table.
     * </p>
     * <p>
     * If <code>"DynamoDB":false</code>, you can enable full Backup management for DynamoDB backup by enabling <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * Backup's advanced DynamoDB backup features</a>.
     * </p>
     * 
     * @return Returns whether Backup fully manages the backups for a resource type.</p>
     *         <p>
     *         For the benefits of full Backup management, see <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#full-management"> Full
     *         Backup management</a>.
     *         </p>
     *         <p>
     *         For a list of resource types and whether each supports full Backup management, see the <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource">
     *         Feature availability by resource</a> table.
     *         </p>
     *         <p>
     *         If <code>"DynamoDB":false</code>, you can enable full Backup management for DynamoDB backup by enabling
     *         <a href=
     *         "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli"
     *         > Backup's advanced DynamoDB backup features</a>.
     */

    public java.util.Map<String, Boolean> getResourceTypeManagementPreference() {
        return resourceTypeManagementPreference;
    }

    /**
     * <p>
     * Returns whether Backup fully manages the backups for a resource type.
     * </p>
     * <p>
     * For the benefits of full Backup management, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#full-management"> Full Backup
     * management</a>.
     * </p>
     * <p>
     * For a list of resource types and whether each supports full Backup management, see the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource"> Feature
     * availability by resource</a> table.
     * </p>
     * <p>
     * If <code>"DynamoDB":false</code>, you can enable full Backup management for DynamoDB backup by enabling <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * Backup's advanced DynamoDB backup features</a>.
     * </p>
     * 
     * @param resourceTypeManagementPreference
     *        Returns whether Backup fully manages the backups for a resource type.</p>
     *        <p>
     *        For the benefits of full Backup management, see <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#full-management"> Full
     *        Backup management</a>.
     *        </p>
     *        <p>
     *        For a list of resource types and whether each supports full Backup management, see the <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource">
     *        Feature availability by resource</a> table.
     *        </p>
     *        <p>
     *        If <code>"DynamoDB":false</code>, you can enable full Backup management for DynamoDB backup by enabling <a
     *        href=
     *        "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli"
     *        > Backup's advanced DynamoDB backup features</a>.
     */

    public void setResourceTypeManagementPreference(java.util.Map<String, Boolean> resourceTypeManagementPreference) {
        this.resourceTypeManagementPreference = resourceTypeManagementPreference;
    }

    /**
     * <p>
     * Returns whether Backup fully manages the backups for a resource type.
     * </p>
     * <p>
     * For the benefits of full Backup management, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#full-management"> Full Backup
     * management</a>.
     * </p>
     * <p>
     * For a list of resource types and whether each supports full Backup management, see the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource"> Feature
     * availability by resource</a> table.
     * </p>
     * <p>
     * If <code>"DynamoDB":false</code>, you can enable full Backup management for DynamoDB backup by enabling <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * Backup's advanced DynamoDB backup features</a>.
     * </p>
     * 
     * @param resourceTypeManagementPreference
     *        Returns whether Backup fully manages the backups for a resource type.</p>
     *        <p>
     *        For the benefits of full Backup management, see <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#full-management"> Full
     *        Backup management</a>.
     *        </p>
     *        <p>
     *        For a list of resource types and whether each supports full Backup management, see the <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/whatisbackup.html#features-by-resource">
     *        Feature availability by resource</a> table.
     *        </p>
     *        <p>
     *        If <code>"DynamoDB":false</code>, you can enable full Backup management for DynamoDB backup by enabling <a
     *        href=
     *        "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli"
     *        > Backup's advanced DynamoDB backup features</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionSettingsResult withResourceTypeManagementPreference(java.util.Map<String, Boolean> resourceTypeManagementPreference) {
        setResourceTypeManagementPreference(resourceTypeManagementPreference);
        return this;
    }

    /**
     * Add a single ResourceTypeManagementPreference entry
     *
     * @see DescribeRegionSettingsResult#withResourceTypeManagementPreference
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionSettingsResult addResourceTypeManagementPreferenceEntry(String key, Boolean value) {
        if (null == this.resourceTypeManagementPreference) {
            this.resourceTypeManagementPreference = new java.util.HashMap<String, Boolean>();
        }
        if (this.resourceTypeManagementPreference.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceTypeManagementPreference.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceTypeManagementPreference.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionSettingsResult clearResourceTypeManagementPreferenceEntries() {
        this.resourceTypeManagementPreference = null;
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
        if (getResourceTypeOptInPreference() != null)
            sb.append("ResourceTypeOptInPreference: ").append(getResourceTypeOptInPreference()).append(",");
        if (getResourceTypeManagementPreference() != null)
            sb.append("ResourceTypeManagementPreference: ").append(getResourceTypeManagementPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegionSettingsResult == false)
            return false;
        DescribeRegionSettingsResult other = (DescribeRegionSettingsResult) obj;
        if (other.getResourceTypeOptInPreference() == null ^ this.getResourceTypeOptInPreference() == null)
            return false;
        if (other.getResourceTypeOptInPreference() != null && other.getResourceTypeOptInPreference().equals(this.getResourceTypeOptInPreference()) == false)
            return false;
        if (other.getResourceTypeManagementPreference() == null ^ this.getResourceTypeManagementPreference() == null)
            return false;
        if (other.getResourceTypeManagementPreference() != null
                && other.getResourceTypeManagementPreference().equals(this.getResourceTypeManagementPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTypeOptInPreference() == null) ? 0 : getResourceTypeOptInPreference().hashCode());
        hashCode = prime * hashCode + ((getResourceTypeManagementPreference() == null) ? 0 : getResourceTypeManagementPreference().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegionSettingsResult clone() {
        try {
            return (DescribeRegionSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
