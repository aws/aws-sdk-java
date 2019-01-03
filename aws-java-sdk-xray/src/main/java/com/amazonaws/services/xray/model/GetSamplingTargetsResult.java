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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSamplingTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Updated rules that the service should use to sample requests.
     * </p>
     */
    private java.util.List<SamplingTargetDocument> samplingTargetDocuments;
    /**
     * <p>
     * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since
     * the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.
     * </p>
     */
    private java.util.Date lastRuleModification;
    /**
     * <p>
     * Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     * </p>
     */
    private java.util.List<UnprocessedStatistics> unprocessedStatistics;

    /**
     * <p>
     * Updated rules that the service should use to sample requests.
     * </p>
     * 
     * @return Updated rules that the service should use to sample requests.
     */

    public java.util.List<SamplingTargetDocument> getSamplingTargetDocuments() {
        return samplingTargetDocuments;
    }

    /**
     * <p>
     * Updated rules that the service should use to sample requests.
     * </p>
     * 
     * @param samplingTargetDocuments
     *        Updated rules that the service should use to sample requests.
     */

    public void setSamplingTargetDocuments(java.util.Collection<SamplingTargetDocument> samplingTargetDocuments) {
        if (samplingTargetDocuments == null) {
            this.samplingTargetDocuments = null;
            return;
        }

        this.samplingTargetDocuments = new java.util.ArrayList<SamplingTargetDocument>(samplingTargetDocuments);
    }

    /**
     * <p>
     * Updated rules that the service should use to sample requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSamplingTargetDocuments(java.util.Collection)} or
     * {@link #withSamplingTargetDocuments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param samplingTargetDocuments
     *        Updated rules that the service should use to sample requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingTargetsResult withSamplingTargetDocuments(SamplingTargetDocument... samplingTargetDocuments) {
        if (this.samplingTargetDocuments == null) {
            setSamplingTargetDocuments(new java.util.ArrayList<SamplingTargetDocument>(samplingTargetDocuments.length));
        }
        for (SamplingTargetDocument ele : samplingTargetDocuments) {
            this.samplingTargetDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Updated rules that the service should use to sample requests.
     * </p>
     * 
     * @param samplingTargetDocuments
     *        Updated rules that the service should use to sample requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingTargetsResult withSamplingTargetDocuments(java.util.Collection<SamplingTargetDocument> samplingTargetDocuments) {
        setSamplingTargetDocuments(samplingTargetDocuments);
        return this;
    }

    /**
     * <p>
     * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since
     * the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.
     * </p>
     * 
     * @param lastRuleModification
     *        The last time a user changed the sampling rule configuration. If the sampling rule configuration changed
     *        since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest
     *        version.
     */

    public void setLastRuleModification(java.util.Date lastRuleModification) {
        this.lastRuleModification = lastRuleModification;
    }

    /**
     * <p>
     * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since
     * the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.
     * </p>
     * 
     * @return The last time a user changed the sampling rule configuration. If the sampling rule configuration changed
     *         since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest
     *         version.
     */

    public java.util.Date getLastRuleModification() {
        return this.lastRuleModification;
    }

    /**
     * <p>
     * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since
     * the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.
     * </p>
     * 
     * @param lastRuleModification
     *        The last time a user changed the sampling rule configuration. If the sampling rule configuration changed
     *        since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingTargetsResult withLastRuleModification(java.util.Date lastRuleModification) {
        setLastRuleModification(lastRuleModification);
        return this;
    }

    /**
     * <p>
     * Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     * </p>
     * 
     * @return Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     */

    public java.util.List<UnprocessedStatistics> getUnprocessedStatistics() {
        return unprocessedStatistics;
    }

    /**
     * <p>
     * Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     * </p>
     * 
     * @param unprocessedStatistics
     *        Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     */

    public void setUnprocessedStatistics(java.util.Collection<UnprocessedStatistics> unprocessedStatistics) {
        if (unprocessedStatistics == null) {
            this.unprocessedStatistics = null;
            return;
        }

        this.unprocessedStatistics = new java.util.ArrayList<UnprocessedStatistics>(unprocessedStatistics);
    }

    /**
     * <p>
     * Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedStatistics(java.util.Collection)} or
     * {@link #withUnprocessedStatistics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedStatistics
     *        Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingTargetsResult withUnprocessedStatistics(UnprocessedStatistics... unprocessedStatistics) {
        if (this.unprocessedStatistics == null) {
            setUnprocessedStatistics(new java.util.ArrayList<UnprocessedStatistics>(unprocessedStatistics.length));
        }
        for (UnprocessedStatistics ele : unprocessedStatistics) {
            this.unprocessedStatistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     * </p>
     * 
     * @param unprocessedStatistics
     *        Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingTargetsResult withUnprocessedStatistics(java.util.Collection<UnprocessedStatistics> unprocessedStatistics) {
        setUnprocessedStatistics(unprocessedStatistics);
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
        if (getSamplingTargetDocuments() != null)
            sb.append("SamplingTargetDocuments: ").append(getSamplingTargetDocuments()).append(",");
        if (getLastRuleModification() != null)
            sb.append("LastRuleModification: ").append(getLastRuleModification()).append(",");
        if (getUnprocessedStatistics() != null)
            sb.append("UnprocessedStatistics: ").append(getUnprocessedStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSamplingTargetsResult == false)
            return false;
        GetSamplingTargetsResult other = (GetSamplingTargetsResult) obj;
        if (other.getSamplingTargetDocuments() == null ^ this.getSamplingTargetDocuments() == null)
            return false;
        if (other.getSamplingTargetDocuments() != null && other.getSamplingTargetDocuments().equals(this.getSamplingTargetDocuments()) == false)
            return false;
        if (other.getLastRuleModification() == null ^ this.getLastRuleModification() == null)
            return false;
        if (other.getLastRuleModification() != null && other.getLastRuleModification().equals(this.getLastRuleModification()) == false)
            return false;
        if (other.getUnprocessedStatistics() == null ^ this.getUnprocessedStatistics() == null)
            return false;
        if (other.getUnprocessedStatistics() != null && other.getUnprocessedStatistics().equals(this.getUnprocessedStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamplingTargetDocuments() == null) ? 0 : getSamplingTargetDocuments().hashCode());
        hashCode = prime * hashCode + ((getLastRuleModification() == null) ? 0 : getLastRuleModification().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedStatistics() == null) ? 0 : getUnprocessedStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetSamplingTargetsResult clone() {
        try {
            return (GetSamplingTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
