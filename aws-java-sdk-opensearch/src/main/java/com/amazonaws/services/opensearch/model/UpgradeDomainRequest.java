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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the request parameters to the <code>UpgradeDomain</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the OpenSearch Service domain that you want to upgrade.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or
     * Elasticsearch_X.Y.
     * </p>
     */
    private String targetVersion;
    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     */
    private Boolean performCheckOnly;
    /**
     * <p>
     * Only supports the <code>override_main_response_version</code> parameter and not other advanced options. You can
     * only include this option when upgrading to an OpenSearch version. Specifies whether the domain reports its
     * version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;

    /**
     * <p>
     * Name of the OpenSearch Service domain that you want to upgrade.
     * </p>
     * 
     * @param domainName
     *        Name of the OpenSearch Service domain that you want to upgrade.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the OpenSearch Service domain that you want to upgrade.
     * </p>
     * 
     * @return Name of the OpenSearch Service domain that you want to upgrade.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the OpenSearch Service domain that you want to upgrade.
     * </p>
     * 
     * @param domainName
     *        Name of the OpenSearch Service domain that you want to upgrade.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or
     * Elasticsearch_X.Y.
     * </p>
     * 
     * @param targetVersion
     *        OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or
     *        Elasticsearch_X.Y.
     */

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or
     * Elasticsearch_X.Y.
     * </p>
     * 
     * @return OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or
     *         Elasticsearch_X.Y.
     */

    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * <p>
     * OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or
     * Elasticsearch_X.Y.
     * </p>
     * 
     * @param targetVersion
     *        OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or
     *        Elasticsearch_X.Y.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainRequest withTargetVersion(String targetVersion) {
        setTargetVersion(targetVersion);
        return this;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @param performCheckOnly
     *        When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *        the upgrade.
     */

    public void setPerformCheckOnly(Boolean performCheckOnly) {
        this.performCheckOnly = performCheckOnly;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @return When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *         the upgrade.
     */

    public Boolean getPerformCheckOnly() {
        return this.performCheckOnly;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @param performCheckOnly
     *        When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *        the upgrade.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainRequest withPerformCheckOnly(Boolean performCheckOnly) {
        setPerformCheckOnly(performCheckOnly);
        return this;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @return When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *         the upgrade.
     */

    public Boolean isPerformCheckOnly() {
        return this.performCheckOnly;
    }

    /**
     * <p>
     * Only supports the <code>override_main_response_version</code> parameter and not other advanced options. You can
     * only include this option when upgrading to an OpenSearch version. Specifies whether the domain reports its
     * version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
     * </p>
     * 
     * @return Only supports the <code>override_main_response_version</code> parameter and not other advanced options.
     *         You can only include this option when upgrading to an OpenSearch version. Specifies whether the domain
     *         reports its version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Only supports the <code>override_main_response_version</code> parameter and not other advanced options. You can
     * only include this option when upgrading to an OpenSearch version. Specifies whether the domain reports its
     * version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
     * </p>
     * 
     * @param advancedOptions
     *        Only supports the <code>override_main_response_version</code> parameter and not other advanced options.
     *        You can only include this option when upgrading to an OpenSearch version. Specifies whether the domain
     *        reports its version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Only supports the <code>override_main_response_version</code> parameter and not other advanced options. You can
     * only include this option when upgrading to an OpenSearch version. Specifies whether the domain reports its
     * version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
     * </p>
     * 
     * @param advancedOptions
     *        Only supports the <code>override_main_response_version</code> parameter and not other advanced options.
     *        You can only include this option when upgrading to an OpenSearch version. Specifies whether the domain
     *        reports its version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainRequest withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * Add a single AdvancedOptions entry
     *
     * @see UpgradeDomainRequest#withAdvancedOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainRequest addAdvancedOptionsEntry(String key, String value) {
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

    public UpgradeDomainRequest clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getTargetVersion() != null)
            sb.append("TargetVersion: ").append(getTargetVersion()).append(",");
        if (getPerformCheckOnly() != null)
            sb.append("PerformCheckOnly: ").append(getPerformCheckOnly()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeDomainRequest == false)
            return false;
        UpgradeDomainRequest other = (UpgradeDomainRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode + ((getPerformCheckOnly() == null) ? 0 : getPerformCheckOnly().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeDomainRequest clone() {
        return (UpgradeDomainRequest) super.clone();
    }

}
