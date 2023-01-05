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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the response returned by <code>UpgradeDomain</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the domain upgrade.
     * </p>
     */
    private String upgradeId;
    /**
     * <p>
     * The name of the domain that was upgraded.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * OpenSearch or Elasticsearch version that the domain was upgraded to.
     * </p>
     */
    private String targetVersion;
    /**
     * <p>
     * When true, indicates that an upgrade eligibility check was performed.
     * </p>
     */
    private Boolean performCheckOnly;
    /**
     * <p>
     * The advanced options configuration for the domain.
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;
    /**
     * <p>
     * Container for information about a configuration change happening on a domain.
     * </p>
     */
    private ChangeProgressDetails changeProgressDetails;

    /**
     * <p>
     * The unique identifier of the domain upgrade.
     * </p>
     * 
     * @param upgradeId
     *        The unique identifier of the domain upgrade.
     */

    public void setUpgradeId(String upgradeId) {
        this.upgradeId = upgradeId;
    }

    /**
     * <p>
     * The unique identifier of the domain upgrade.
     * </p>
     * 
     * @return The unique identifier of the domain upgrade.
     */

    public String getUpgradeId() {
        return this.upgradeId;
    }

    /**
     * <p>
     * The unique identifier of the domain upgrade.
     * </p>
     * 
     * @param upgradeId
     *        The unique identifier of the domain upgrade.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withUpgradeId(String upgradeId) {
        setUpgradeId(upgradeId);
        return this;
    }

    /**
     * <p>
     * The name of the domain that was upgraded.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that was upgraded.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that was upgraded.
     * </p>
     * 
     * @return The name of the domain that was upgraded.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that was upgraded.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that was upgraded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * OpenSearch or Elasticsearch version that the domain was upgraded to.
     * </p>
     * 
     * @param targetVersion
     *        OpenSearch or Elasticsearch version that the domain was upgraded to.
     */

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * OpenSearch or Elasticsearch version that the domain was upgraded to.
     * </p>
     * 
     * @return OpenSearch or Elasticsearch version that the domain was upgraded to.
     */

    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * <p>
     * OpenSearch or Elasticsearch version that the domain was upgraded to.
     * </p>
     * 
     * @param targetVersion
     *        OpenSearch or Elasticsearch version that the domain was upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withTargetVersion(String targetVersion) {
        setTargetVersion(targetVersion);
        return this;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check was performed.
     * </p>
     * 
     * @param performCheckOnly
     *        When true, indicates that an upgrade eligibility check was performed.
     */

    public void setPerformCheckOnly(Boolean performCheckOnly) {
        this.performCheckOnly = performCheckOnly;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check was performed.
     * </p>
     * 
     * @return When true, indicates that an upgrade eligibility check was performed.
     */

    public Boolean getPerformCheckOnly() {
        return this.performCheckOnly;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check was performed.
     * </p>
     * 
     * @param performCheckOnly
     *        When true, indicates that an upgrade eligibility check was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withPerformCheckOnly(Boolean performCheckOnly) {
        setPerformCheckOnly(performCheckOnly);
        return this;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check was performed.
     * </p>
     * 
     * @return When true, indicates that an upgrade eligibility check was performed.
     */

    public Boolean isPerformCheckOnly() {
        return this.performCheckOnly;
    }

    /**
     * <p>
     * The advanced options configuration for the domain.
     * </p>
     * 
     * @return The advanced options configuration for the domain.
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * The advanced options configuration for the domain.
     * </p>
     * 
     * @param advancedOptions
     *        The advanced options configuration for the domain.
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * The advanced options configuration for the domain.
     * </p>
     * 
     * @param advancedOptions
     *        The advanced options configuration for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * Add a single AdvancedOptions entry
     *
     * @see UpgradeDomainResult#withAdvancedOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult addAdvancedOptionsEntry(String key, String value) {
        if (null == this.advancedOptions) {
            this.advancedOptions = new java.util.HashMap<String, String>();
        }
        if (this.advancedOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.advancedOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdvancedOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Container for information about a configuration change happening on a domain.
     * </p>
     * 
     * @param changeProgressDetails
     *        Container for information about a configuration change happening on a domain.
     */

    public void setChangeProgressDetails(ChangeProgressDetails changeProgressDetails) {
        this.changeProgressDetails = changeProgressDetails;
    }

    /**
     * <p>
     * Container for information about a configuration change happening on a domain.
     * </p>
     * 
     * @return Container for information about a configuration change happening on a domain.
     */

    public ChangeProgressDetails getChangeProgressDetails() {
        return this.changeProgressDetails;
    }

    /**
     * <p>
     * Container for information about a configuration change happening on a domain.
     * </p>
     * 
     * @param changeProgressDetails
     *        Container for information about a configuration change happening on a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withChangeProgressDetails(ChangeProgressDetails changeProgressDetails) {
        setChangeProgressDetails(changeProgressDetails);
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
        if (getUpgradeId() != null)
            sb.append("UpgradeId: ").append(getUpgradeId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getTargetVersion() != null)
            sb.append("TargetVersion: ").append(getTargetVersion()).append(",");
        if (getPerformCheckOnly() != null)
            sb.append("PerformCheckOnly: ").append(getPerformCheckOnly()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions()).append(",");
        if (getChangeProgressDetails() != null)
            sb.append("ChangeProgressDetails: ").append(getChangeProgressDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeDomainResult == false)
            return false;
        UpgradeDomainResult other = (UpgradeDomainResult) obj;
        if (other.getUpgradeId() == null ^ this.getUpgradeId() == null)
            return false;
        if (other.getUpgradeId() != null && other.getUpgradeId().equals(this.getUpgradeId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTargetVersion() == null ^ this.getTargetVersion() == null)
            return false;
        if (other.getTargetVersion() != null && other.getTargetVersion().equals(this.getTargetVersion()) == false)
            return false;
        if (other.getPerformCheckOnly() == null ^ this.getPerformCheckOnly() == null)
            return false;
        if (other.getPerformCheckOnly() != null && other.getPerformCheckOnly().equals(this.getPerformCheckOnly()) == false)
            return false;
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
            return false;
        if (other.getChangeProgressDetails() == null ^ this.getChangeProgressDetails() == null)
            return false;
        if (other.getChangeProgressDetails() != null && other.getChangeProgressDetails().equals(this.getChangeProgressDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpgradeId() == null) ? 0 : getUpgradeId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode + ((getPerformCheckOnly() == null) ? 0 : getPerformCheckOnly().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        hashCode = prime * hashCode + ((getChangeProgressDetails() == null) ? 0 : getChangeProgressDetails().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeDomainResult clone() {
        try {
            return (UpgradeDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
