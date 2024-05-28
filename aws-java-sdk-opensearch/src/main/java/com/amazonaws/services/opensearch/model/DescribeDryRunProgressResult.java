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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDryRunProgressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the dry run, including any validation errors.
     * </p>
     */
    private DryRunProgressStatus dryRunProgressStatus;
    /**
     * <p>
     * Details about the changes you're planning to make on the domain.
     * </p>
     */
    private DomainStatus dryRunConfig;
    /**
     * <p>
     * The results of the dry run.
     * </p>
     */
    private DryRunResults dryRunResults;

    /**
     * <p>
     * The current status of the dry run, including any validation errors.
     * </p>
     * 
     * @param dryRunProgressStatus
     *        The current status of the dry run, including any validation errors.
     */

    public void setDryRunProgressStatus(DryRunProgressStatus dryRunProgressStatus) {
        this.dryRunProgressStatus = dryRunProgressStatus;
    }

    /**
     * <p>
     * The current status of the dry run, including any validation errors.
     * </p>
     * 
     * @return The current status of the dry run, including any validation errors.
     */

    public DryRunProgressStatus getDryRunProgressStatus() {
        return this.dryRunProgressStatus;
    }

    /**
     * <p>
     * The current status of the dry run, including any validation errors.
     * </p>
     * 
     * @param dryRunProgressStatus
     *        The current status of the dry run, including any validation errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDryRunProgressResult withDryRunProgressStatus(DryRunProgressStatus dryRunProgressStatus) {
        setDryRunProgressStatus(dryRunProgressStatus);
        return this;
    }

    /**
     * <p>
     * Details about the changes you're planning to make on the domain.
     * </p>
     * 
     * @param dryRunConfig
     *        Details about the changes you're planning to make on the domain.
     */

    public void setDryRunConfig(DomainStatus dryRunConfig) {
        this.dryRunConfig = dryRunConfig;
    }

    /**
     * <p>
     * Details about the changes you're planning to make on the domain.
     * </p>
     * 
     * @return Details about the changes you're planning to make on the domain.
     */

    public DomainStatus getDryRunConfig() {
        return this.dryRunConfig;
    }

    /**
     * <p>
     * Details about the changes you're planning to make on the domain.
     * </p>
     * 
     * @param dryRunConfig
     *        Details about the changes you're planning to make on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDryRunProgressResult withDryRunConfig(DomainStatus dryRunConfig) {
        setDryRunConfig(dryRunConfig);
        return this;
    }

    /**
     * <p>
     * The results of the dry run.
     * </p>
     * 
     * @param dryRunResults
     *        The results of the dry run.
     */

    public void setDryRunResults(DryRunResults dryRunResults) {
        this.dryRunResults = dryRunResults;
    }

    /**
     * <p>
     * The results of the dry run.
     * </p>
     * 
     * @return The results of the dry run.
     */

    public DryRunResults getDryRunResults() {
        return this.dryRunResults;
    }

    /**
     * <p>
     * The results of the dry run.
     * </p>
     * 
     * @param dryRunResults
     *        The results of the dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDryRunProgressResult withDryRunResults(DryRunResults dryRunResults) {
        setDryRunResults(dryRunResults);
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
        if (getDryRunProgressStatus() != null)
            sb.append("DryRunProgressStatus: ").append(getDryRunProgressStatus()).append(",");
        if (getDryRunConfig() != null)
            sb.append("DryRunConfig: ").append(getDryRunConfig()).append(",");
        if (getDryRunResults() != null)
            sb.append("DryRunResults: ").append(getDryRunResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDryRunProgressResult == false)
            return false;
        DescribeDryRunProgressResult other = (DescribeDryRunProgressResult) obj;
        if (other.getDryRunProgressStatus() == null ^ this.getDryRunProgressStatus() == null)
            return false;
        if (other.getDryRunProgressStatus() != null && other.getDryRunProgressStatus().equals(this.getDryRunProgressStatus()) == false)
            return false;
        if (other.getDryRunConfig() == null ^ this.getDryRunConfig() == null)
            return false;
        if (other.getDryRunConfig() != null && other.getDryRunConfig().equals(this.getDryRunConfig()) == false)
            return false;
        if (other.getDryRunResults() == null ^ this.getDryRunResults() == null)
            return false;
        if (other.getDryRunResults() != null && other.getDryRunResults().equals(this.getDryRunResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRunProgressStatus() == null) ? 0 : getDryRunProgressStatus().hashCode());
        hashCode = prime * hashCode + ((getDryRunConfig() == null) ? 0 : getDryRunConfig().hashCode());
        hashCode = prime * hashCode + ((getDryRunResults() == null) ? 0 : getDryRunResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDryRunProgressResult clone() {
        try {
            return (DescribeDryRunProgressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
