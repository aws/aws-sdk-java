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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Spot placement score for this Region or Availability Zone. The score is calculated based on the assumption that
 * the <code>capacity-optimized</code> allocation strategy is used and that all of the Availability Zones in the Region
 * can be used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotPlacementScore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotPlacementScore implements Serializable, Cloneable {

    /**
     * <p>
     * The Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The placement score, on a scale from <code>1</code> to <code>10</code>. A score of <code>10</code> indicates that
     * your Spot request is highly likely to succeed in this Region or Availability Zone. A score of <code>1</code>
     * indicates that your Spot request is not likely to succeed.
     * </p>
     */
    private Integer score;

    /**
     * <p>
     * The Region.
     * </p>
     * 
     * @param region
     *        The Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region.
     * </p>
     * 
     * @return The Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region.
     * </p>
     * 
     * @param region
     *        The Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPlacementScore withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZoneId
     *        The Availability Zone.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @return The Availability Zone.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZoneId
     *        The Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPlacementScore withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The placement score, on a scale from <code>1</code> to <code>10</code>. A score of <code>10</code> indicates that
     * your Spot request is highly likely to succeed in this Region or Availability Zone. A score of <code>1</code>
     * indicates that your Spot request is not likely to succeed.
     * </p>
     * 
     * @param score
     *        The placement score, on a scale from <code>1</code> to <code>10</code>. A score of <code>10</code>
     *        indicates that your Spot request is highly likely to succeed in this Region or Availability Zone. A score
     *        of <code>1</code> indicates that your Spot request is not likely to succeed.
     */

    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * <p>
     * The placement score, on a scale from <code>1</code> to <code>10</code>. A score of <code>10</code> indicates that
     * your Spot request is highly likely to succeed in this Region or Availability Zone. A score of <code>1</code>
     * indicates that your Spot request is not likely to succeed.
     * </p>
     * 
     * @return The placement score, on a scale from <code>1</code> to <code>10</code>. A score of <code>10</code>
     *         indicates that your Spot request is highly likely to succeed in this Region or Availability Zone. A score
     *         of <code>1</code> indicates that your Spot request is not likely to succeed.
     */

    public Integer getScore() {
        return this.score;
    }

    /**
     * <p>
     * The placement score, on a scale from <code>1</code> to <code>10</code>. A score of <code>10</code> indicates that
     * your Spot request is highly likely to succeed in this Region or Availability Zone. A score of <code>1</code>
     * indicates that your Spot request is not likely to succeed.
     * </p>
     * 
     * @param score
     *        The placement score, on a scale from <code>1</code> to <code>10</code>. A score of <code>10</code>
     *        indicates that your Spot request is highly likely to succeed in this Region or Availability Zone. A score
     *        of <code>1</code> indicates that your Spot request is not likely to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotPlacementScore withScore(Integer score) {
        setScore(score);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotPlacementScore == false)
            return false;
        SpotPlacementScore other = (SpotPlacementScore) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public SpotPlacementScore clone() {
        try {
            return (SpotPlacementScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
