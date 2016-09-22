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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration of an Elasticsearch domain.
 * </p>
 */
public class ElasticsearchDomainConfig implements Serializable, Cloneable {

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     */
    private ElasticsearchVersionStatus elasticsearchVersion;
    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the Elasticsearch domain.
     * </p>
     */
    private ElasticsearchClusterConfigStatus elasticsearchClusterConfig;
    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     */
    private EBSOptionsStatus eBSOptions;
    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     */
    private AccessPoliciesStatus accessPolicies;
    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     */
    private SnapshotOptionsStatus snapshotOptions;
    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     */
    private AdvancedOptionsStatus advancedOptions;

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     * 
     * @param elasticsearchVersion
     *        String of format X.Y to specify version for the Elasticsearch domain.
     */

    public void setElasticsearchVersion(ElasticsearchVersionStatus elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     * 
     * @return String of format X.Y to specify version for the Elasticsearch domain.
     */

    public ElasticsearchVersionStatus getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     * 
     * @param elasticsearchVersion
     *        String of format X.Y to specify version for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainConfig withElasticsearchVersion(ElasticsearchVersionStatus elasticsearchVersion) {
        setElasticsearchVersion(elasticsearchVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param elasticsearchClusterConfig
     *        Specifies the <code>ElasticsearchClusterConfig</code> for the Elasticsearch domain.
     */

    public void setElasticsearchClusterConfig(ElasticsearchClusterConfigStatus elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the <code>ElasticsearchClusterConfig</code> for the Elasticsearch domain.
     */

    public ElasticsearchClusterConfigStatus getElasticsearchClusterConfig() {
        return this.elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param elasticsearchClusterConfig
     *        Specifies the <code>ElasticsearchClusterConfig</code> for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainConfig withElasticsearchClusterConfig(ElasticsearchClusterConfigStatus elasticsearchClusterConfig) {
        setElasticsearchClusterConfig(elasticsearchClusterConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param eBSOptions
     *        Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     */

    public void setEBSOptions(EBSOptionsStatus eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     */

    public EBSOptionsStatus getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param eBSOptions
     *        Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainConfig withEBSOptions(EBSOptionsStatus eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     */

    public void setAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @return IAM access policy as a JSON-formatted string.
     */

    public AccessPoliciesStatus getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainConfig withAccessPolicies(AccessPoliciesStatus accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param snapshotOptions
     *        Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     */

    public void setSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     */

    public SnapshotOptionsStatus getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     * 
     * @param snapshotOptions
     *        Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainConfig withSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *        target="_blank">Configuring Advanced Options</a> for more information.
     */

    public void setAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     * 
     * @return Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *         target="_blank">Configuring Advanced Options</a> for more information.
     */

    public AdvancedOptionsStatus getAdvancedOptions() {
        return this.advancedOptions;
    }

    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *        target="_blank">Configuring Advanced Options</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainConfig withAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        setAdvancedOptions(advancedOptions);
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
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: " + getElasticsearchVersion() + ",");
        if (getElasticsearchClusterConfig() != null)
            sb.append("ElasticsearchClusterConfig: " + getElasticsearchClusterConfig() + ",");
        if (getEBSOptions() != null)
            sb.append("EBSOptions: " + getEBSOptions() + ",");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: " + getAccessPolicies() + ",");
        if (getSnapshotOptions() != null)
            sb.append("SnapshotOptions: " + getSnapshotOptions() + ",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: " + getAdvancedOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchDomainConfig == false)
            return false;
        ElasticsearchDomainConfig other = (ElasticsearchDomainConfig) obj;
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        if (other.getElasticsearchClusterConfig() == null ^ this.getElasticsearchClusterConfig() == null)
            return false;
        if (other.getElasticsearchClusterConfig() != null && other.getElasticsearchClusterConfig().equals(this.getElasticsearchClusterConfig()) == false)
            return false;
        if (other.getEBSOptions() == null ^ this.getEBSOptions() == null)
            return false;
        if (other.getEBSOptions() != null && other.getEBSOptions().equals(this.getEBSOptions()) == false)
            return false;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getSnapshotOptions() == null ^ this.getSnapshotOptions() == null)
            return false;
        if (other.getSnapshotOptions() != null && other.getSnapshotOptions().equals(this.getSnapshotOptions()) == false)
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

        hashCode = prime * hashCode + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchClusterConfig() == null) ? 0 : getElasticsearchClusterConfig().hashCode());
        hashCode = prime * hashCode + ((getEBSOptions() == null) ? 0 : getEBSOptions().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getSnapshotOptions() == null) ? 0 : getSnapshotOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        return hashCode;
    }

    @Override
    public ElasticsearchDomainConfig clone() {
        try {
            return (ElasticsearchDomainConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
