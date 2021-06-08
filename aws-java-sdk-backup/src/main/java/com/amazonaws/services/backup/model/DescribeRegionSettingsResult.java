/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
            sb.append("ResourceTypeOptInPreference: ").append(getResourceTypeOptInPreference());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTypeOptInPreference() == null) ? 0 : getResourceTypeOptInPreference().hashCode());
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
