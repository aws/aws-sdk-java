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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateCisScanConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCisScanConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     */
    private String securityLevel;
    /**
     * <p>
     * The tags for the CIS scan configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     */
    private CreateCisTargets targets;

    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     * 
     * @param scanName
     *        The scan name for the CIS scan configuration.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     * 
     * @return The scan name for the CIS scan configuration.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The scan name for the CIS scan configuration.
     * </p>
     * 
     * @param scanName
     *        The scan name for the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCisScanConfigurationRequest withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     * 
     * @param schedule
     *        The schedule for the CIS scan configuration.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     * 
     * @return The schedule for the CIS scan configuration.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for the CIS scan configuration.
     * </p>
     * 
     * @param schedule
     *        The schedule for the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCisScanConfigurationRequest withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *        assigns to a profile.
     * @see CisSecurityLevel
     */

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @return The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *         assigns to a profile.
     * @see CisSecurityLevel
     */

    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *        assigns to a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CreateCisScanConfigurationRequest withSecurityLevel(String securityLevel) {
        setSecurityLevel(securityLevel);
        return this;
    }

    /**
     * <p>
     * The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS assigns
     * to a profile.
     * </p>
     * 
     * @param securityLevel
     *        The security level for the CIS scan configuration. Security level refers to the Benchmark levels that CIS
     *        assigns to a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CreateCisScanConfigurationRequest withSecurityLevel(CisSecurityLevel securityLevel) {
        this.securityLevel = securityLevel.toString();
        return this;
    }

    /**
     * <p>
     * The tags for the CIS scan configuration.
     * </p>
     * 
     * @return The tags for the CIS scan configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the CIS scan configuration.
     * </p>
     * 
     * @param tags
     *        The tags for the CIS scan configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the CIS scan configuration.
     * </p>
     * 
     * @param tags
     *        The tags for the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCisScanConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCisScanConfigurationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCisScanConfigurationRequest addTagsEntry(String key, String value) {
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

    public CreateCisScanConfigurationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     * 
     * @param targets
     *        The targets for the CIS scan configuration.
     */

    public void setTargets(CreateCisTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     * 
     * @return The targets for the CIS scan configuration.
     */

    public CreateCisTargets getTargets() {
        return this.targets;
    }

    /**
     * <p>
     * The targets for the CIS scan configuration.
     * </p>
     * 
     * @param targets
     *        The targets for the CIS scan configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCisScanConfigurationRequest withTargets(CreateCisTargets targets) {
        setTargets(targets);
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
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSecurityLevel() != null)
            sb.append("SecurityLevel: ").append(getSecurityLevel()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCisScanConfigurationRequest == false)
            return false;
        CreateCisScanConfigurationRequest other = (CreateCisScanConfigurationRequest) obj;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSecurityLevel() == null ^ this.getSecurityLevel() == null)
            return false;
        if (other.getSecurityLevel() != null && other.getSecurityLevel().equals(this.getSecurityLevel()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSecurityLevel() == null) ? 0 : getSecurityLevel().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public CreateCisScanConfigurationRequest clone() {
        return (CreateCisScanConfigurationRequest) super.clone();
    }

}
