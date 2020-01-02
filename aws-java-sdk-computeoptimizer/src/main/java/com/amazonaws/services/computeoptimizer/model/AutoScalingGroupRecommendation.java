/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an Auto Scaling group recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/AutoScalingGroupRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroupRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID of the Auto Scaling group.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupArn;
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The finding classification for the Auto Scaling group.
     * </p>
     * <p>
     * Findings for Auto Scaling groups include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer
     * identifies a recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines
     * that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized
     * resources, Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     * </p>
     * </note>
     */
    private String finding;
    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Auto Scaling group.
     * </p>
     */
    private java.util.List<UtilizationMetric> utilizationMetrics;
    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the Auto Scaling group.
     * </p>
     */
    private Double lookBackPeriodInDays;
    /**
     * <p>
     * An array of objects that describe the current configuration of the Auto Scaling group.
     * </p>
     */
    private AutoScalingGroupConfiguration currentConfiguration;
    /**
     * <p>
     * An array of objects that describe the recommendation options for the Auto Scaling group.
     * </p>
     */
    private java.util.List<AutoScalingGroupRecommendationOption> recommendationOptions;
    /**
     * <p>
     * The time stamp of when the Auto Scaling group recommendation was last refreshed.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;

    /**
     * <p>
     * The AWS account ID of the Auto Scaling group.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Auto Scaling group.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Auto Scaling group.
     * </p>
     * 
     * @return The AWS account ID of the Auto Scaling group.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the Auto Scaling group.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupArn
     *        The Amazon Resource Name (ARN) of the Auto Scaling group.
     */

    public void setAutoScalingGroupArn(String autoScalingGroupArn) {
        this.autoScalingGroupArn = autoScalingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Auto Scaling group.
     */

    public String getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupArn
     *        The Amazon Resource Name (ARN) of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withAutoScalingGroupArn(String autoScalingGroupArn) {
        setAutoScalingGroupArn(autoScalingGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The finding classification for the Auto Scaling group.
     * </p>
     * <p>
     * Findings for Auto Scaling groups include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer
     * identifies a recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines
     * that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized
     * resources, Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @param finding
     *        The finding classification for the Auto Scaling group.</p>
     *        <p>
     *        Findings for Auto Scaling groups include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute
     *        Optimizer identifies a recommendation that can provide better performance for your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer
     *        determines that the group is correctly provisioned to run your workload based on the chosen instance type.
     *        For optimized resources, Compute Optimizer might recommend a new generation instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     *        </p>
     * @see Finding
     */

    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * The finding classification for the Auto Scaling group.
     * </p>
     * <p>
     * Findings for Auto Scaling groups include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer
     * identifies a recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines
     * that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized
     * resources, Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @return The finding classification for the Auto Scaling group.</p>
     *         <p>
     *         Findings for Auto Scaling groups include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute
     *         Optimizer identifies a recommendation that can provide better performance for your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer
     *         determines that the group is correctly provisioned to run your workload based on the chosen instance
     *         type. For optimized resources, Compute Optimizer might recommend a new generation instance type.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     *         </p>
     * @see Finding
     */

    public String getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * The finding classification for the Auto Scaling group.
     * </p>
     * <p>
     * Findings for Auto Scaling groups include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer
     * identifies a recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines
     * that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized
     * resources, Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @param finding
     *        The finding classification for the Auto Scaling group.</p>
     *        <p>
     *        Findings for Auto Scaling groups include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute
     *        Optimizer identifies a recommendation that can provide better performance for your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer
     *        determines that the group is correctly provisioned to run your workload based on the chosen instance type.
     *        For optimized resources, Compute Optimizer might recommend a new generation instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Finding
     */

    public AutoScalingGroupRecommendation withFinding(String finding) {
        setFinding(finding);
        return this;
    }

    /**
     * <p>
     * The finding classification for the Auto Scaling group.
     * </p>
     * <p>
     * Findings for Auto Scaling groups include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute Optimizer
     * identifies a recommendation that can provide better performance for your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer determines
     * that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized
     * resources, Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @param finding
     *        The finding classification for the Auto Scaling group.</p>
     *        <p>
     *        Findings for Auto Scaling groups include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b>—An Auto Scaling group is considered not optimized when AWS Compute
     *        Optimizer identifies a recommendation that can provide better performance for your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An Auto Scaling group is considered optimized when Compute Optimizer
     *        determines that the group is correctly provisioned to run your workload based on the chosen instance type.
     *        For optimized resources, Compute Optimizer might recommend a new generation instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The values that are returned might be <code>NOT_OPTIMIZED</code> or <code>OPTIMIZED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Finding
     */

    public AutoScalingGroupRecommendation withFinding(Finding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Auto Scaling group.
     * </p>
     * 
     * @return An array of objects that describe the utilization metrics of the Auto Scaling group.
     */

    public java.util.List<UtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Auto Scaling group.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the Auto Scaling group.
     */

    public void setUtilizationMetrics(java.util.Collection<UtilizationMetric> utilizationMetrics) {
        if (utilizationMetrics == null) {
            this.utilizationMetrics = null;
            return;
        }

        this.utilizationMetrics = new java.util.ArrayList<UtilizationMetric>(utilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationMetrics(java.util.Collection)} or {@link #withUtilizationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withUtilizationMetrics(UtilizationMetric... utilizationMetrics) {
        if (this.utilizationMetrics == null) {
            setUtilizationMetrics(new java.util.ArrayList<UtilizationMetric>(utilizationMetrics.length));
        }
        for (UtilizationMetric ele : utilizationMetrics) {
            this.utilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Auto Scaling group.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withUtilizationMetrics(java.util.Collection<UtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the Auto Scaling group.
     * </p>
     * 
     * @param lookBackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the Auto Scaling group.
     */

    public void setLookBackPeriodInDays(Double lookBackPeriodInDays) {
        this.lookBackPeriodInDays = lookBackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the Auto Scaling group.
     * </p>
     * 
     * @return The number of days for which utilization metrics were analyzed for the Auto Scaling group.
     */

    public Double getLookBackPeriodInDays() {
        return this.lookBackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the Auto Scaling group.
     * </p>
     * 
     * @param lookBackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withLookBackPeriodInDays(Double lookBackPeriodInDays) {
        setLookBackPeriodInDays(lookBackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the current configuration of the Auto Scaling group.
     * </p>
     * 
     * @param currentConfiguration
     *        An array of objects that describe the current configuration of the Auto Scaling group.
     */

    public void setCurrentConfiguration(AutoScalingGroupConfiguration currentConfiguration) {
        this.currentConfiguration = currentConfiguration;
    }

    /**
     * <p>
     * An array of objects that describe the current configuration of the Auto Scaling group.
     * </p>
     * 
     * @return An array of objects that describe the current configuration of the Auto Scaling group.
     */

    public AutoScalingGroupConfiguration getCurrentConfiguration() {
        return this.currentConfiguration;
    }

    /**
     * <p>
     * An array of objects that describe the current configuration of the Auto Scaling group.
     * </p>
     * 
     * @param currentConfiguration
     *        An array of objects that describe the current configuration of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withCurrentConfiguration(AutoScalingGroupConfiguration currentConfiguration) {
        setCurrentConfiguration(currentConfiguration);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Auto Scaling group.
     * </p>
     * 
     * @return An array of objects that describe the recommendation options for the Auto Scaling group.
     */

    public java.util.List<AutoScalingGroupRecommendationOption> getRecommendationOptions() {
        return recommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Auto Scaling group.
     * </p>
     * 
     * @param recommendationOptions
     *        An array of objects that describe the recommendation options for the Auto Scaling group.
     */

    public void setRecommendationOptions(java.util.Collection<AutoScalingGroupRecommendationOption> recommendationOptions) {
        if (recommendationOptions == null) {
            this.recommendationOptions = null;
            return;
        }

        this.recommendationOptions = new java.util.ArrayList<AutoScalingGroupRecommendationOption>(recommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationOptions(java.util.Collection)} or
     * {@link #withRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationOptions
     *        An array of objects that describe the recommendation options for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withRecommendationOptions(AutoScalingGroupRecommendationOption... recommendationOptions) {
        if (this.recommendationOptions == null) {
            setRecommendationOptions(new java.util.ArrayList<AutoScalingGroupRecommendationOption>(recommendationOptions.length));
        }
        for (AutoScalingGroupRecommendationOption ele : recommendationOptions) {
            this.recommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Auto Scaling group.
     * </p>
     * 
     * @param recommendationOptions
     *        An array of objects that describe the recommendation options for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withRecommendationOptions(java.util.Collection<AutoScalingGroupRecommendationOption> recommendationOptions) {
        setRecommendationOptions(recommendationOptions);
        return this;
    }

    /**
     * <p>
     * The time stamp of when the Auto Scaling group recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the Auto Scaling group recommendation was last refreshed.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the Auto Scaling group recommendation was last refreshed.
     * </p>
     * 
     * @return The time stamp of when the Auto Scaling group recommendation was last refreshed.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the Auto Scaling group recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the Auto Scaling group recommendation was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAutoScalingGroupArn() != null)
            sb.append("AutoScalingGroupArn: ").append(getAutoScalingGroupArn()).append(",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getFinding() != null)
            sb.append("Finding: ").append(getFinding()).append(",");
        if (getUtilizationMetrics() != null)
            sb.append("UtilizationMetrics: ").append(getUtilizationMetrics()).append(",");
        if (getLookBackPeriodInDays() != null)
            sb.append("LookBackPeriodInDays: ").append(getLookBackPeriodInDays()).append(",");
        if (getCurrentConfiguration() != null)
            sb.append("CurrentConfiguration: ").append(getCurrentConfiguration()).append(",");
        if (getRecommendationOptions() != null)
            sb.append("RecommendationOptions: ").append(getRecommendationOptions()).append(",");
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

        if (obj instanceof AutoScalingGroupRecommendation == false)
            return false;
        AutoScalingGroupRecommendation other = (AutoScalingGroupRecommendation) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAutoScalingGroupArn() == null ^ this.getAutoScalingGroupArn() == null)
            return false;
        if (other.getAutoScalingGroupArn() != null && other.getAutoScalingGroupArn().equals(this.getAutoScalingGroupArn()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
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
        if (other.getCurrentConfiguration() == null ^ this.getCurrentConfiguration() == null)
            return false;
        if (other.getCurrentConfiguration() != null && other.getCurrentConfiguration().equals(this.getCurrentConfiguration()) == false)
            return false;
        if (other.getRecommendationOptions() == null ^ this.getRecommendationOptions() == null)
            return false;
        if (other.getRecommendationOptions() != null && other.getRecommendationOptions().equals(this.getRecommendationOptions()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupArn() == null) ? 0 : getAutoScalingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriodInDays() == null) ? 0 : getLookBackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getCurrentConfiguration() == null) ? 0 : getCurrentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRecommendationOptions() == null) ? 0 : getRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingGroupRecommendation clone() {
        try {
            return (AutoScalingGroupRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.AutoScalingGroupRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
