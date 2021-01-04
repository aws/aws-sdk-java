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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A potential improvement that was found from analyzing the profiling data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/Recommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How many different places in the profile graph triggered a match.
     * </p>
     */
    private Integer allMatchesCount;
    /**
     * <p>
     * How much of the total sample count is potentially affected.
     * </p>
     */
    private Double allMatchesSum;
    /**
     * <p>
     * End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The pattern that analysis recognized in the profile to make this recommendation.
     * </p>
     */
    private Pattern pattern;
    /**
     * <p>
     * The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * List of the matches with most impact.
     * </p>
     */
    private java.util.List<Match> topMatches;

    /**
     * <p>
     * How many different places in the profile graph triggered a match.
     * </p>
     * 
     * @param allMatchesCount
     *        How many different places in the profile graph triggered a match.
     */

    public void setAllMatchesCount(Integer allMatchesCount) {
        this.allMatchesCount = allMatchesCount;
    }

    /**
     * <p>
     * How many different places in the profile graph triggered a match.
     * </p>
     * 
     * @return How many different places in the profile graph triggered a match.
     */

    public Integer getAllMatchesCount() {
        return this.allMatchesCount;
    }

    /**
     * <p>
     * How many different places in the profile graph triggered a match.
     * </p>
     * 
     * @param allMatchesCount
     *        How many different places in the profile graph triggered a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withAllMatchesCount(Integer allMatchesCount) {
        setAllMatchesCount(allMatchesCount);
        return this;
    }

    /**
     * <p>
     * How much of the total sample count is potentially affected.
     * </p>
     * 
     * @param allMatchesSum
     *        How much of the total sample count is potentially affected.
     */

    public void setAllMatchesSum(Double allMatchesSum) {
        this.allMatchesSum = allMatchesSum;
    }

    /**
     * <p>
     * How much of the total sample count is potentially affected.
     * </p>
     * 
     * @return How much of the total sample count is potentially affected.
     */

    public Double getAllMatchesSum() {
        return this.allMatchesSum;
    }

    /**
     * <p>
     * How much of the total sample count is potentially affected.
     * </p>
     * 
     * @param allMatchesSum
     *        How much of the total sample count is potentially affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withAllMatchesSum(Double allMatchesSum) {
        setAllMatchesSum(allMatchesSum);
        return this;
    }

    /**
     * <p>
     * End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For
     *         example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        End time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The pattern that analysis recognized in the profile to make this recommendation.
     * </p>
     * 
     * @param pattern
     *        The pattern that analysis recognized in the profile to make this recommendation.
     */

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The pattern that analysis recognized in the profile to make this recommendation.
     * </p>
     * 
     * @return The pattern that analysis recognized in the profile to make this recommendation.
     */

    public Pattern getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The pattern that analysis recognized in the profile to make this recommendation.
     * </p>
     * 
     * @param pattern
     *        The pattern that analysis recognized in the profile to make this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withPattern(Pattern pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format.
     *        For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The start time of the profile that was used by this analysis. This is specified using the ISO 8601
     *         format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the profile that was used by this analysis. This is specified using the ISO 8601 format.
     *        For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * List of the matches with most impact.
     * </p>
     * 
     * @return List of the matches with most impact.
     */

    public java.util.List<Match> getTopMatches() {
        return topMatches;
    }

    /**
     * <p>
     * List of the matches with most impact.
     * </p>
     * 
     * @param topMatches
     *        List of the matches with most impact.
     */

    public void setTopMatches(java.util.Collection<Match> topMatches) {
        if (topMatches == null) {
            this.topMatches = null;
            return;
        }

        this.topMatches = new java.util.ArrayList<Match>(topMatches);
    }

    /**
     * <p>
     * List of the matches with most impact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopMatches(java.util.Collection)} or {@link #withTopMatches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param topMatches
     *        List of the matches with most impact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withTopMatches(Match... topMatches) {
        if (this.topMatches == null) {
            setTopMatches(new java.util.ArrayList<Match>(topMatches.length));
        }
        for (Match ele : topMatches) {
            this.topMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matches with most impact.
     * </p>
     * 
     * @param topMatches
     *        List of the matches with most impact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withTopMatches(java.util.Collection<Match> topMatches) {
        setTopMatches(topMatches);
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
        if (getAllMatchesCount() != null)
            sb.append("AllMatchesCount: ").append(getAllMatchesCount()).append(",");
        if (getAllMatchesSum() != null)
            sb.append("AllMatchesSum: ").append(getAllMatchesSum()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTopMatches() != null)
            sb.append("TopMatches: ").append(getTopMatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getAllMatchesCount() == null ^ this.getAllMatchesCount() == null)
            return false;
        if (other.getAllMatchesCount() != null && other.getAllMatchesCount().equals(this.getAllMatchesCount()) == false)
            return false;
        if (other.getAllMatchesSum() == null ^ this.getAllMatchesSum() == null)
            return false;
        if (other.getAllMatchesSum() != null && other.getAllMatchesSum().equals(this.getAllMatchesSum()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTopMatches() == null ^ this.getTopMatches() == null)
            return false;
        if (other.getTopMatches() != null && other.getTopMatches().equals(this.getTopMatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllMatchesCount() == null) ? 0 : getAllMatchesCount().hashCode());
        hashCode = prime * hashCode + ((getAllMatchesSum() == null) ? 0 : getAllMatchesSum().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTopMatches() == null) ? 0 : getTopMatches().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
