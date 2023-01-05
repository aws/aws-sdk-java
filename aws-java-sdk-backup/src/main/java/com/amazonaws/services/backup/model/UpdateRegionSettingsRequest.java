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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRegionSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRegionSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the Region.
     * </p>
     */
    private java.util.Map<String, Boolean> resourceTypeOptInPreference;
    /**
     * <p>
     * Enables or disables full Backup management of backups for a resource type. To enable full Backup management for
     * DynamoDB along with <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html">
     * Backup's advanced DynamoDB backup features</a>, follow the procedure to <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * enable advanced DynamoDB backup programmatically</a>.
     * </p>
     */
    private java.util.Map<String, Boolean> resourceTypeManagementPreference;

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the Region.
     * </p>
     * 
     * @return Updates the list of services along with the opt-in preferences for the Region.
     */

    public java.util.Map<String, Boolean> getResourceTypeOptInPreference() {
        return resourceTypeOptInPreference;
    }

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the Region.
     * </p>
     * 
     * @param resourceTypeOptInPreference
     *        Updates the list of services along with the opt-in preferences for the Region.
     */

    public void setResourceTypeOptInPreference(java.util.Map<String, Boolean> resourceTypeOptInPreference) {
        this.resourceTypeOptInPreference = resourceTypeOptInPreference;
    }

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the Region.
     * </p>
     * 
     * @param resourceTypeOptInPreference
     *        Updates the list of services along with the opt-in preferences for the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegionSettingsRequest withResourceTypeOptInPreference(java.util.Map<String, Boolean> resourceTypeOptInPreference) {
        setResourceTypeOptInPreference(resourceTypeOptInPreference);
        return this;
    }

    /**
     * Add a single ResourceTypeOptInPreference entry
     *
     * @see UpdateRegionSettingsRequest#withResourceTypeOptInPreference
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegionSettingsRequest addResourceTypeOptInPreferenceEntry(String key, Boolean value) {
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

    public UpdateRegionSettingsRequest clearResourceTypeOptInPreferenceEntries() {
        this.resourceTypeOptInPreference = null;
        return this;
    }

    /**
     * <p>
     * Enables or disables full Backup management of backups for a resource type. To enable full Backup management for
     * DynamoDB along with <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html">
     * Backup's advanced DynamoDB backup features</a>, follow the procedure to <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * enable advanced DynamoDB backup programmatically</a>.
     * </p>
     * 
     * @return Enables or disables full Backup management of backups for a resource type. To enable full Backup
     *         management for DynamoDB along with <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html"> Backup's advanced
     *         DynamoDB backup features</a>, follow the procedure to <a href=
     *         "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli"
     *         > enable advanced DynamoDB backup programmatically</a>.
     */

    public java.util.Map<String, Boolean> getResourceTypeManagementPreference() {
        return resourceTypeManagementPreference;
    }

    /**
     * <p>
     * Enables or disables full Backup management of backups for a resource type. To enable full Backup management for
     * DynamoDB along with <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html">
     * Backup's advanced DynamoDB backup features</a>, follow the procedure to <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * enable advanced DynamoDB backup programmatically</a>.
     * </p>
     * 
     * @param resourceTypeManagementPreference
     *        Enables or disables full Backup management of backups for a resource type. To enable full Backup
     *        management for DynamoDB along with <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html"> Backup's advanced
     *        DynamoDB backup features</a>, follow the procedure to <a href=
     *        "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli"
     *        > enable advanced DynamoDB backup programmatically</a>.
     */

    public void setResourceTypeManagementPreference(java.util.Map<String, Boolean> resourceTypeManagementPreference) {
        this.resourceTypeManagementPreference = resourceTypeManagementPreference;
    }

    /**
     * <p>
     * Enables or disables full Backup management of backups for a resource type. To enable full Backup management for
     * DynamoDB along with <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html">
     * Backup's advanced DynamoDB backup features</a>, follow the procedure to <a href=
     * "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli">
     * enable advanced DynamoDB backup programmatically</a>.
     * </p>
     * 
     * @param resourceTypeManagementPreference
     *        Enables or disables full Backup management of backups for a resource type. To enable full Backup
     *        management for DynamoDB along with <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html"> Backup's advanced
     *        DynamoDB backup features</a>, follow the procedure to <a href=
     *        "https://docs.aws.amazon.com/aws-backup/latest/devguide/advanced-ddb-backup.html#advanced-ddb-backup-enable-cli"
     *        > enable advanced DynamoDB backup programmatically</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegionSettingsRequest withResourceTypeManagementPreference(java.util.Map<String, Boolean> resourceTypeManagementPreference) {
        setResourceTypeManagementPreference(resourceTypeManagementPreference);
        return this;
    }

    /**
     * Add a single ResourceTypeManagementPreference entry
     *
     * @see UpdateRegionSettingsRequest#withResourceTypeManagementPreference
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegionSettingsRequest addResourceTypeManagementPreferenceEntry(String key, Boolean value) {
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

    public UpdateRegionSettingsRequest clearResourceTypeManagementPreferenceEntries() {
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

        if (obj instanceof UpdateRegionSettingsRequest == false)
            return false;
        UpdateRegionSettingsRequest other = (UpdateRegionSettingsRequest) obj;
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
    public UpdateRegionSettingsRequest clone() {
        return (UpdateRegionSettingsRequest) super.clone();
    }

}
