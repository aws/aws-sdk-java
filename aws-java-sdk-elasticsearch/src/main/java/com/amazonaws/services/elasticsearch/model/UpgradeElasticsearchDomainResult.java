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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response returned by <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeElasticsearchDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String domainName;
    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     */
    private String targetVersion;
    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not
     * actually perform the Upgrade.
     * </p>
     */
    private Boolean performCheckOnly;

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeElasticsearchDomainResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     * 
     * @param targetVersion
     *        The version of Elasticsearch that you intend to upgrade the domain to.
     */

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     * 
     * @return The version of Elasticsearch that you intend to upgrade the domain to.
     */

    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * <p>
     * The version of Elasticsearch that you intend to upgrade the domain to.
     * </p>
     * 
     * @param targetVersion
     *        The version of Elasticsearch that you intend to upgrade the domain to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeElasticsearchDomainResult withTargetVersion(String targetVersion) {
        setTargetVersion(targetVersion);
        return this;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not
     * actually perform the Upgrade.
     * </p>
     * 
     * @param performCheckOnly
     *        This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will
     *        not actually perform the Upgrade.
     */

    public void setPerformCheckOnly(Boolean performCheckOnly) {
        this.performCheckOnly = performCheckOnly;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not
     * actually perform the Upgrade.
     * </p>
     * 
     * @return This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will
     *         not actually perform the Upgrade.
     */

    public Boolean getPerformCheckOnly() {
        return this.performCheckOnly;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not
     * actually perform the Upgrade.
     * </p>
     * 
     * @param performCheckOnly
     *        This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will
     *        not actually perform the Upgrade.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeElasticsearchDomainResult withPerformCheckOnly(Boolean performCheckOnly) {
        setPerformCheckOnly(performCheckOnly);
        return this;
    }

    /**
     * <p>
     * This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not
     * actually perform the Upgrade.
     * </p>
     * 
     * @return This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will
     *         not actually perform the Upgrade.
     */

    public Boolean isPerformCheckOnly() {
        return this.performCheckOnly;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getTargetVersion() != null)
            sb.append("TargetVersion: ").append(getTargetVersion()).append(",");
        if (getPerformCheckOnly() != null)
            sb.append("PerformCheckOnly: ").append(getPerformCheckOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeElasticsearchDomainResult == false)
            return false;
        UpgradeElasticsearchDomainResult other = (UpgradeElasticsearchDomainResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode + ((getPerformCheckOnly() == null) ? 0 : getPerformCheckOnly().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeElasticsearchDomainResult clone() {
        try {
            return (UpgradeElasticsearchDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
