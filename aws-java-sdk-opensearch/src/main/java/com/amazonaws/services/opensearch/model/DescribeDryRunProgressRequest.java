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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDryRunProgressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     */
    private String dryRunId;
    /**
     * <p>
     * Whether to include the configuration of the dry run in the response. The configuration specifies the updates that
     * you're planning to make on the domain.
     * </p>
     */
    private Boolean loadDryRunConfig;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDryRunProgressRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     * 
     * @param dryRunId
     *        The unique identifier of the dry run.
     */

    public void setDryRunId(String dryRunId) {
        this.dryRunId = dryRunId;
    }

    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     * 
     * @return The unique identifier of the dry run.
     */

    public String getDryRunId() {
        return this.dryRunId;
    }

    /**
     * <p>
     * The unique identifier of the dry run.
     * </p>
     * 
     * @param dryRunId
     *        The unique identifier of the dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDryRunProgressRequest withDryRunId(String dryRunId) {
        setDryRunId(dryRunId);
        return this;
    }

    /**
     * <p>
     * Whether to include the configuration of the dry run in the response. The configuration specifies the updates that
     * you're planning to make on the domain.
     * </p>
     * 
     * @param loadDryRunConfig
     *        Whether to include the configuration of the dry run in the response. The configuration specifies the
     *        updates that you're planning to make on the domain.
     */

    public void setLoadDryRunConfig(Boolean loadDryRunConfig) {
        this.loadDryRunConfig = loadDryRunConfig;
    }

    /**
     * <p>
     * Whether to include the configuration of the dry run in the response. The configuration specifies the updates that
     * you're planning to make on the domain.
     * </p>
     * 
     * @return Whether to include the configuration of the dry run in the response. The configuration specifies the
     *         updates that you're planning to make on the domain.
     */

    public Boolean getLoadDryRunConfig() {
        return this.loadDryRunConfig;
    }

    /**
     * <p>
     * Whether to include the configuration of the dry run in the response. The configuration specifies the updates that
     * you're planning to make on the domain.
     * </p>
     * 
     * @param loadDryRunConfig
     *        Whether to include the configuration of the dry run in the response. The configuration specifies the
     *        updates that you're planning to make on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDryRunProgressRequest withLoadDryRunConfig(Boolean loadDryRunConfig) {
        setLoadDryRunConfig(loadDryRunConfig);
        return this;
    }

    /**
     * <p>
     * Whether to include the configuration of the dry run in the response. The configuration specifies the updates that
     * you're planning to make on the domain.
     * </p>
     * 
     * @return Whether to include the configuration of the dry run in the response. The configuration specifies the
     *         updates that you're planning to make on the domain.
     */

    public Boolean isLoadDryRunConfig() {
        return this.loadDryRunConfig;
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
        if (getDryRunId() != null)
            sb.append("DryRunId: ").append(getDryRunId()).append(",");
        if (getLoadDryRunConfig() != null)
            sb.append("LoadDryRunConfig: ").append(getLoadDryRunConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDryRunProgressRequest == false)
            return false;
        DescribeDryRunProgressRequest other = (DescribeDryRunProgressRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDryRunId() == null ^ this.getDryRunId() == null)
            return false;
        if (other.getDryRunId() != null && other.getDryRunId().equals(this.getDryRunId()) == false)
            return false;
        if (other.getLoadDryRunConfig() == null ^ this.getLoadDryRunConfig() == null)
            return false;
        if (other.getLoadDryRunConfig() != null && other.getLoadDryRunConfig().equals(this.getLoadDryRunConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDryRunId() == null) ? 0 : getDryRunId().hashCode());
        hashCode = prime * hashCode + ((getLoadDryRunConfig() == null) ? 0 : getLoadDryRunConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDryRunProgressRequest clone() {
        return (DescribeDryRunProgressRequest) super.clone();
    }

}
