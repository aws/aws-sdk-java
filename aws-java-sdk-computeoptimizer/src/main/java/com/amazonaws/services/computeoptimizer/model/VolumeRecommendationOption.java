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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a recommendation option for an Amazon Elastic Block Store (Amazon EBS) instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/VolumeRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects that describe a volume configuration.
     * </p>
     */
    private VolumeConfiguration configuration;
    /**
     * <p>
     * The performance risk of the volume recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended volume type meeting the performance requirement of your
     * workload.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     */
    private Double performanceRisk;
    /**
     * <p>
     * The rank of the volume recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     */
    private Integer rank;

    /**
     * <p>
     * An array of objects that describe a volume configuration.
     * </p>
     * 
     * @param configuration
     *        An array of objects that describe a volume configuration.
     */

    public void setConfiguration(VolumeConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * An array of objects that describe a volume configuration.
     * </p>
     * 
     * @return An array of objects that describe a volume configuration.
     */

    public VolumeConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * An array of objects that describe a volume configuration.
     * </p>
     * 
     * @param configuration
     *        An array of objects that describe a volume configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendationOption withConfiguration(VolumeConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The performance risk of the volume recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended volume type meeting the performance requirement of your
     * workload.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the volume recommendation option.</p>
     *        <p>
     *        Performance risk is the likelihood of the recommended volume type meeting the performance requirement of
     *        your workload.
     *        </p>
     *        <p>
     *        The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended
     *        resource is predicted to always provide enough hardware capability. The higher the performance risk is,
     *        the more likely you should validate whether the recommendation will meet the performance requirements of
     *        your workload before migrating your resource.
     */

    public void setPerformanceRisk(Double performanceRisk) {
        this.performanceRisk = performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the volume recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended volume type meeting the performance requirement of your
     * workload.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     * 
     * @return The performance risk of the volume recommendation option.</p>
     *         <p>
     *         Performance risk is the likelihood of the recommended volume type meeting the performance requirement of
     *         your workload.
     *         </p>
     *         <p>
     *         The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended
     *         resource is predicted to always provide enough hardware capability. The higher the performance risk is,
     *         the more likely you should validate whether the recommendation will meet the performance requirements of
     *         your workload before migrating your resource.
     */

    public Double getPerformanceRisk() {
        return this.performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the volume recommendation option.
     * </p>
     * <p>
     * Performance risk is the likelihood of the recommended volume type meeting the performance requirement of your
     * workload.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the volume recommendation option.</p>
     *        <p>
     *        Performance risk is the likelihood of the recommended volume type meeting the performance requirement of
     *        your workload.
     *        </p>
     *        <p>
     *        The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended
     *        resource is predicted to always provide enough hardware capability. The higher the performance risk is,
     *        the more likely you should validate whether the recommendation will meet the performance requirements of
     *        your workload before migrating your resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendationOption withPerformanceRisk(Double performanceRisk) {
        setPerformanceRisk(performanceRisk);
        return this;
    }

    /**
     * <p>
     * The rank of the volume recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the volume recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank of the volume recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @return The rank of the volume recommendation option.</p>
     *         <p>
     *         The top recommendation option is ranked as <code>1</code>.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank of the volume recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the volume recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendationOption withRank(Integer rank) {
        setRank(rank);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getPerformanceRisk() != null)
            sb.append("PerformanceRisk: ").append(getPerformanceRisk()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeRecommendationOption == false)
            return false;
        VolumeRecommendationOption other = (VolumeRecommendationOption) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getPerformanceRisk() == null ^ this.getPerformanceRisk() == null)
            return false;
        if (other.getPerformanceRisk() != null && other.getPerformanceRisk().equals(this.getPerformanceRisk()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPerformanceRisk() == null) ? 0 : getPerformanceRisk().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public VolumeRecommendationOption clone() {
        try {
            return (VolumeRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.VolumeRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
