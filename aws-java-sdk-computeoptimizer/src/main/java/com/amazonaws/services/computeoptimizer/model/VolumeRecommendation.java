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
 * Describes an Amazon Elastic Block Store (Amazon EBS) volume recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/VolumeRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current volume.
     * </p>
     */
    private String volumeArn;
    /**
     * <p>
     * The AWS account ID of the volume.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An array of objects that describe the current configuration of the volume.
     * </p>
     */
    private VolumeConfiguration currentConfiguration;
    /**
     * <p>
     * The finding classification of the volume.
     * </p>
     * <p>
     * Findings for volumes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer identifies a
     * recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that the
     * volume is correctly provisioned to run your workload based on the chosen volume type. For optimized resources,
     * Compute Optimizer might recommend a new generation volume type.
     * </p>
     * </li>
     * </ul>
     */
    private String finding;
    /**
     * <p>
     * An array of objects that describe the utilization metrics of the volume.
     * </p>
     */
    private java.util.List<EBSUtilizationMetric> utilizationMetrics;
    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the volume.
     * </p>
     */
    private Double lookBackPeriodInDays;
    /**
     * <p>
     * An array of objects that describe the recommendation options for the volume.
     * </p>
     */
    private java.util.List<VolumeRecommendationOption> volumeRecommendationOptions;
    /**
     * <p>
     * The time stamp of when the volume recommendation was last refreshed.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current volume.
     * </p>
     * 
     * @param volumeArn
     *        The Amazon Resource Name (ARN) of the current volume.
     */

    public void setVolumeArn(String volumeArn) {
        this.volumeArn = volumeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current volume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the current volume.
     */

    public String getVolumeArn() {
        return this.volumeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current volume.
     * </p>
     * 
     * @param volumeArn
     *        The Amazon Resource Name (ARN) of the current volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withVolumeArn(String volumeArn) {
        setVolumeArn(volumeArn);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the volume.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the volume.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the volume.
     * </p>
     * 
     * @return The AWS account ID of the volume.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the volume.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the current configuration of the volume.
     * </p>
     * 
     * @param currentConfiguration
     *        An array of objects that describe the current configuration of the volume.
     */

    public void setCurrentConfiguration(VolumeConfiguration currentConfiguration) {
        this.currentConfiguration = currentConfiguration;
    }

    /**
     * <p>
     * An array of objects that describe the current configuration of the volume.
     * </p>
     * 
     * @return An array of objects that describe the current configuration of the volume.
     */

    public VolumeConfiguration getCurrentConfiguration() {
        return this.currentConfiguration;
    }

    /**
     * <p>
     * An array of objects that describe the current configuration of the volume.
     * </p>
     * 
     * @param currentConfiguration
     *        An array of objects that describe the current configuration of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withCurrentConfiguration(VolumeConfiguration currentConfiguration) {
        setCurrentConfiguration(currentConfiguration);
        return this;
    }

    /**
     * <p>
     * The finding classification of the volume.
     * </p>
     * <p>
     * Findings for volumes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer identifies a
     * recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that the
     * volume is correctly provisioned to run your workload based on the chosen volume type. For optimized resources,
     * Compute Optimizer might recommend a new generation volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification of the volume.</p>
     *        <p>
     *        Findings for volumes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer
     *        identifies a recommendation that can provide better performance for your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that
     *        the volume is correctly provisioned to run your workload based on the chosen volume type. For optimized
     *        resources, Compute Optimizer might recommend a new generation volume type.
     *        </p>
     *        </li>
     * @see EBSFinding
     */

    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * The finding classification of the volume.
     * </p>
     * <p>
     * Findings for volumes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer identifies a
     * recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that the
     * volume is correctly provisioned to run your workload based on the chosen volume type. For optimized resources,
     * Compute Optimizer might recommend a new generation volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The finding classification of the volume.</p>
     *         <p>
     *         Findings for volumes include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer
     *         identifies a recommendation that can provide better performance for your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that
     *         the volume is correctly provisioned to run your workload based on the chosen volume type. For optimized
     *         resources, Compute Optimizer might recommend a new generation volume type.
     *         </p>
     *         </li>
     * @see EBSFinding
     */

    public String getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * The finding classification of the volume.
     * </p>
     * <p>
     * Findings for volumes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer identifies a
     * recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that the
     * volume is correctly provisioned to run your workload based on the chosen volume type. For optimized resources,
     * Compute Optimizer might recommend a new generation volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification of the volume.</p>
     *        <p>
     *        Findings for volumes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer
     *        identifies a recommendation that can provide better performance for your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that
     *        the volume is correctly provisioned to run your workload based on the chosen volume type. For optimized
     *        resources, Compute Optimizer might recommend a new generation volume type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EBSFinding
     */

    public VolumeRecommendation withFinding(String finding) {
        setFinding(finding);
        return this;
    }

    /**
     * <p>
     * The finding classification of the volume.
     * </p>
     * <p>
     * Findings for volumes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer identifies a
     * recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that the
     * volume is correctly provisioned to run your workload based on the chosen volume type. For optimized resources,
     * Compute Optimizer might recommend a new generation volume type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification of the volume.</p>
     *        <p>
     *        Findings for volumes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b>—A volume is considered not optimized when AWS Compute Optimizer
     *        identifies a recommendation that can provide better performance for your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An volume is considered optimized when Compute Optimizer determines that
     *        the volume is correctly provisioned to run your workload based on the chosen volume type. For optimized
     *        resources, Compute Optimizer might recommend a new generation volume type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EBSFinding
     */

    public VolumeRecommendation withFinding(EBSFinding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the volume.
     * </p>
     * 
     * @return An array of objects that describe the utilization metrics of the volume.
     */

    public java.util.List<EBSUtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the volume.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the volume.
     */

    public void setUtilizationMetrics(java.util.Collection<EBSUtilizationMetric> utilizationMetrics) {
        if (utilizationMetrics == null) {
            this.utilizationMetrics = null;
            return;
        }

        this.utilizationMetrics = new java.util.ArrayList<EBSUtilizationMetric>(utilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationMetrics(java.util.Collection)} or {@link #withUtilizationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withUtilizationMetrics(EBSUtilizationMetric... utilizationMetrics) {
        if (this.utilizationMetrics == null) {
            setUtilizationMetrics(new java.util.ArrayList<EBSUtilizationMetric>(utilizationMetrics.length));
        }
        for (EBSUtilizationMetric ele : utilizationMetrics) {
            this.utilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the volume.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withUtilizationMetrics(java.util.Collection<EBSUtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the volume.
     * </p>
     * 
     * @param lookBackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the volume.
     */

    public void setLookBackPeriodInDays(Double lookBackPeriodInDays) {
        this.lookBackPeriodInDays = lookBackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the volume.
     * </p>
     * 
     * @return The number of days for which utilization metrics were analyzed for the volume.
     */

    public Double getLookBackPeriodInDays() {
        return this.lookBackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the volume.
     * </p>
     * 
     * @param lookBackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withLookBackPeriodInDays(Double lookBackPeriodInDays) {
        setLookBackPeriodInDays(lookBackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the volume.
     * </p>
     * 
     * @return An array of objects that describe the recommendation options for the volume.
     */

    public java.util.List<VolumeRecommendationOption> getVolumeRecommendationOptions() {
        return volumeRecommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the volume.
     * </p>
     * 
     * @param volumeRecommendationOptions
     *        An array of objects that describe the recommendation options for the volume.
     */

    public void setVolumeRecommendationOptions(java.util.Collection<VolumeRecommendationOption> volumeRecommendationOptions) {
        if (volumeRecommendationOptions == null) {
            this.volumeRecommendationOptions = null;
            return;
        }

        this.volumeRecommendationOptions = new java.util.ArrayList<VolumeRecommendationOption>(volumeRecommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeRecommendationOptions(java.util.Collection)} or
     * {@link #withVolumeRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param volumeRecommendationOptions
     *        An array of objects that describe the recommendation options for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withVolumeRecommendationOptions(VolumeRecommendationOption... volumeRecommendationOptions) {
        if (this.volumeRecommendationOptions == null) {
            setVolumeRecommendationOptions(new java.util.ArrayList<VolumeRecommendationOption>(volumeRecommendationOptions.length));
        }
        for (VolumeRecommendationOption ele : volumeRecommendationOptions) {
            this.volumeRecommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the volume.
     * </p>
     * 
     * @param volumeRecommendationOptions
     *        An array of objects that describe the recommendation options for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withVolumeRecommendationOptions(java.util.Collection<VolumeRecommendationOption> volumeRecommendationOptions) {
        setVolumeRecommendationOptions(volumeRecommendationOptions);
        return this;
    }

    /**
     * <p>
     * The time stamp of when the volume recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the volume recommendation was last refreshed.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the volume recommendation was last refreshed.
     * </p>
     * 
     * @return The time stamp of when the volume recommendation was last refreshed.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the volume recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the volume recommendation was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        setLastRefreshTimestamp(lastRefreshTimestamp);
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
        if (getVolumeArn() != null)
            sb.append("VolumeArn: ").append(getVolumeArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCurrentConfiguration() != null)
            sb.append("CurrentConfiguration: ").append(getCurrentConfiguration()).append(",");
        if (getFinding() != null)
            sb.append("Finding: ").append(getFinding()).append(",");
        if (getUtilizationMetrics() != null)
            sb.append("UtilizationMetrics: ").append(getUtilizationMetrics()).append(",");
        if (getLookBackPeriodInDays() != null)
            sb.append("LookBackPeriodInDays: ").append(getLookBackPeriodInDays()).append(",");
        if (getVolumeRecommendationOptions() != null)
            sb.append("VolumeRecommendationOptions: ").append(getVolumeRecommendationOptions()).append(",");
        if (getLastRefreshTimestamp() != null)
            sb.append("LastRefreshTimestamp: ").append(getLastRefreshTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeRecommendation == false)
            return false;
        VolumeRecommendation other = (VolumeRecommendation) obj;
        if (other.getVolumeArn() == null ^ this.getVolumeArn() == null)
            return false;
        if (other.getVolumeArn() != null && other.getVolumeArn().equals(this.getVolumeArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCurrentConfiguration() == null ^ this.getCurrentConfiguration() == null)
            return false;
        if (other.getCurrentConfiguration() != null && other.getCurrentConfiguration().equals(this.getCurrentConfiguration()) == false)
            return false;
        if (other.getFinding() == null ^ this.getFinding() == null)
            return false;
        if (other.getFinding() != null && other.getFinding().equals(this.getFinding()) == false)
            return false;
        if (other.getUtilizationMetrics() == null ^ this.getUtilizationMetrics() == null)
            return false;
        if (other.getUtilizationMetrics() != null && other.getUtilizationMetrics().equals(this.getUtilizationMetrics()) == false)
            return false;
        if (other.getLookBackPeriodInDays() == null ^ this.getLookBackPeriodInDays() == null)
            return false;
        if (other.getLookBackPeriodInDays() != null && other.getLookBackPeriodInDays().equals(this.getLookBackPeriodInDays()) == false)
            return false;
        if (other.getVolumeRecommendationOptions() == null ^ this.getVolumeRecommendationOptions() == null)
            return false;
        if (other.getVolumeRecommendationOptions() != null && other.getVolumeRecommendationOptions().equals(this.getVolumeRecommendationOptions()) == false)
            return false;
        if (other.getLastRefreshTimestamp() == null ^ this.getLastRefreshTimestamp() == null)
            return false;
        if (other.getLastRefreshTimestamp() != null && other.getLastRefreshTimestamp().equals(this.getLastRefreshTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeArn() == null) ? 0 : getVolumeArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCurrentConfiguration() == null) ? 0 : getCurrentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriodInDays() == null) ? 0 : getLookBackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getVolumeRecommendationOptions() == null) ? 0 : getVolumeRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VolumeRecommendation clone() {
        try {
            return (VolumeRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.VolumeRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
