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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetResourceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated sensitive
     * data discovery statistics and details for the bucket. If the bucket's sensitivity score is calculated
     * automatically, this includes the score.
     * </p>
     */
    private java.util.Date profileUpdatedAt;
    /**
     * <p>
     * The current sensitivity score for the bucket, ranging from -1 (no analysis due to an error) to 100 (sensitive).
     * By default, this score is calculated automatically based on the amount of data that Amazon Macie has analyzed in
     * the bucket and the amount of sensitive data that Macie has found in the bucket.
     * </p>
     */
    private Integer sensitivityScore;
    /**
     * <p>
     * Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the score was
     * manually changed to 100. If this value is false, the score was calculated automatically by Amazon Macie.
     * </p>
     */
    private Boolean sensitivityScoreOverridden;
    /**
     * <p>
     * The sensitive data discovery statistics for the bucket. The statistics capture the results of automated sensitive
     * data discovery activities that Amazon Macie has performed for the bucket.
     * </p>
     */
    private ResourceStatistics statistics;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated sensitive
     * data discovery statistics and details for the bucket. If the bucket's sensitivity score is calculated
     * automatically, this includes the score.
     * </p>
     * 
     * @param profileUpdatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated
     *        sensitive data discovery statistics and details for the bucket. If the bucket's sensitivity score is
     *        calculated automatically, this includes the score.
     */

    public void setProfileUpdatedAt(java.util.Date profileUpdatedAt) {
        this.profileUpdatedAt = profileUpdatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated sensitive
     * data discovery statistics and details for the bucket. If the bucket's sensitivity score is calculated
     * automatically, this includes the score.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated
     *         sensitive data discovery statistics and details for the bucket. If the bucket's sensitivity score is
     *         calculated automatically, this includes the score.
     */

    public java.util.Date getProfileUpdatedAt() {
        return this.profileUpdatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated sensitive
     * data discovery statistics and details for the bucket. If the bucket's sensitivity score is calculated
     * automatically, this includes the score.
     * </p>
     * 
     * @param profileUpdatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently recalculated
     *        sensitive data discovery statistics and details for the bucket. If the bucket's sensitivity score is
     *        calculated automatically, this includes the score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceProfileResult withProfileUpdatedAt(java.util.Date profileUpdatedAt) {
        setProfileUpdatedAt(profileUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The current sensitivity score for the bucket, ranging from -1 (no analysis due to an error) to 100 (sensitive).
     * By default, this score is calculated automatically based on the amount of data that Amazon Macie has analyzed in
     * the bucket and the amount of sensitive data that Macie has found in the bucket.
     * </p>
     * 
     * @param sensitivityScore
     *        The current sensitivity score for the bucket, ranging from -1 (no analysis due to an error) to 100
     *        (sensitive). By default, this score is calculated automatically based on the amount of data that Amazon
     *        Macie has analyzed in the bucket and the amount of sensitive data that Macie has found in the bucket.
     */

    public void setSensitivityScore(Integer sensitivityScore) {
        this.sensitivityScore = sensitivityScore;
    }

    /**
     * <p>
     * The current sensitivity score for the bucket, ranging from -1 (no analysis due to an error) to 100 (sensitive).
     * By default, this score is calculated automatically based on the amount of data that Amazon Macie has analyzed in
     * the bucket and the amount of sensitive data that Macie has found in the bucket.
     * </p>
     * 
     * @return The current sensitivity score for the bucket, ranging from -1 (no analysis due to an error) to 100
     *         (sensitive). By default, this score is calculated automatically based on the amount of data that Amazon
     *         Macie has analyzed in the bucket and the amount of sensitive data that Macie has found in the bucket.
     */

    public Integer getSensitivityScore() {
        return this.sensitivityScore;
    }

    /**
     * <p>
     * The current sensitivity score for the bucket, ranging from -1 (no analysis due to an error) to 100 (sensitive).
     * By default, this score is calculated automatically based on the amount of data that Amazon Macie has analyzed in
     * the bucket and the amount of sensitive data that Macie has found in the bucket.
     * </p>
     * 
     * @param sensitivityScore
     *        The current sensitivity score for the bucket, ranging from -1 (no analysis due to an error) to 100
     *        (sensitive). By default, this score is calculated automatically based on the amount of data that Amazon
     *        Macie has analyzed in the bucket and the amount of sensitive data that Macie has found in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceProfileResult withSensitivityScore(Integer sensitivityScore) {
        setSensitivityScore(sensitivityScore);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the score was
     * manually changed to 100. If this value is false, the score was calculated automatically by Amazon Macie.
     * </p>
     * 
     * @param sensitivityScoreOverridden
     *        Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the
     *        score was manually changed to 100. If this value is false, the score was calculated automatically by
     *        Amazon Macie.
     */

    public void setSensitivityScoreOverridden(Boolean sensitivityScoreOverridden) {
        this.sensitivityScoreOverridden = sensitivityScoreOverridden;
    }

    /**
     * <p>
     * Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the score was
     * manually changed to 100. If this value is false, the score was calculated automatically by Amazon Macie.
     * </p>
     * 
     * @return Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the
     *         score was manually changed to 100. If this value is false, the score was calculated automatically by
     *         Amazon Macie.
     */

    public Boolean getSensitivityScoreOverridden() {
        return this.sensitivityScoreOverridden;
    }

    /**
     * <p>
     * Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the score was
     * manually changed to 100. If this value is false, the score was calculated automatically by Amazon Macie.
     * </p>
     * 
     * @param sensitivityScoreOverridden
     *        Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the
     *        score was manually changed to 100. If this value is false, the score was calculated automatically by
     *        Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceProfileResult withSensitivityScoreOverridden(Boolean sensitivityScoreOverridden) {
        setSensitivityScoreOverridden(sensitivityScoreOverridden);
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the score was
     * manually changed to 100. If this value is false, the score was calculated automatically by Amazon Macie.
     * </p>
     * 
     * @return Specifies whether the bucket's current sensitivity score was set manually. If this value is true, the
     *         score was manually changed to 100. If this value is false, the score was calculated automatically by
     *         Amazon Macie.
     */

    public Boolean isSensitivityScoreOverridden() {
        return this.sensitivityScoreOverridden;
    }

    /**
     * <p>
     * The sensitive data discovery statistics for the bucket. The statistics capture the results of automated sensitive
     * data discovery activities that Amazon Macie has performed for the bucket.
     * </p>
     * 
     * @param statistics
     *        The sensitive data discovery statistics for the bucket. The statistics capture the results of automated
     *        sensitive data discovery activities that Amazon Macie has performed for the bucket.
     */

    public void setStatistics(ResourceStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The sensitive data discovery statistics for the bucket. The statistics capture the results of automated sensitive
     * data discovery activities that Amazon Macie has performed for the bucket.
     * </p>
     * 
     * @return The sensitive data discovery statistics for the bucket. The statistics capture the results of automated
     *         sensitive data discovery activities that Amazon Macie has performed for the bucket.
     */

    public ResourceStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The sensitive data discovery statistics for the bucket. The statistics capture the results of automated sensitive
     * data discovery activities that Amazon Macie has performed for the bucket.
     * </p>
     * 
     * @param statistics
     *        The sensitive data discovery statistics for the bucket. The statistics capture the results of automated
     *        sensitive data discovery activities that Amazon Macie has performed for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceProfileResult withStatistics(ResourceStatistics statistics) {
        setStatistics(statistics);
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
        if (getProfileUpdatedAt() != null)
            sb.append("ProfileUpdatedAt: ").append(getProfileUpdatedAt()).append(",");
        if (getSensitivityScore() != null)
            sb.append("SensitivityScore: ").append(getSensitivityScore()).append(",");
        if (getSensitivityScoreOverridden() != null)
            sb.append("SensitivityScoreOverridden: ").append(getSensitivityScoreOverridden()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceProfileResult == false)
            return false;
        GetResourceProfileResult other = (GetResourceProfileResult) obj;
        if (other.getProfileUpdatedAt() == null ^ this.getProfileUpdatedAt() == null)
            return false;
        if (other.getProfileUpdatedAt() != null && other.getProfileUpdatedAt().equals(this.getProfileUpdatedAt()) == false)
            return false;
        if (other.getSensitivityScore() == null ^ this.getSensitivityScore() == null)
            return false;
        if (other.getSensitivityScore() != null && other.getSensitivityScore().equals(this.getSensitivityScore()) == false)
            return false;
        if (other.getSensitivityScoreOverridden() == null ^ this.getSensitivityScoreOverridden() == null)
            return false;
        if (other.getSensitivityScoreOverridden() != null && other.getSensitivityScoreOverridden().equals(this.getSensitivityScoreOverridden()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileUpdatedAt() == null) ? 0 : getProfileUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getSensitivityScore() == null) ? 0 : getSensitivityScore().hashCode());
        hashCode = prime * hashCode + ((getSensitivityScoreOverridden() == null) ? 0 : getSensitivityScoreOverridden().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceProfileResult clone() {
        try {
            return (GetResourceProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
