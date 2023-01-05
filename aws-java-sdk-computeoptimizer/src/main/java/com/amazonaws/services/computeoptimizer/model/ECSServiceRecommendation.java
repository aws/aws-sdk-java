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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon ECS service recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ECSServiceRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSServiceRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The Amazon Web Services account ID of the ECS service.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The configuration of the current ECS service.
     * </p>
     */
    private ServiceConfiguration currentServiceConfiguration;
    /**
     * <p>
     * An array of objects that describe the utilization metrics of the ECS service.
     * </p>
     */
    private java.util.List<ECSServiceUtilizationMetric> utilizationMetrics;
    /**
     * <p>
     * The number of days the ECS service utilization metrics were analyzed.
     * </p>
     */
    private Double lookbackPeriodInDays;
    /**
     * <p>
     * The launch type the ECS service is using.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the Fargate launch type.
     * </p>
     * </note>
     */
    private String launchType;
    /**
     * <p>
     * The timestamp of when the ECS service recommendation was last generated.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;
    /**
     * <p>
     * The finding classification of an ECS service.
     * </p>
     * <p>
     * Findings for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or CPU, an
     * ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor application
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or CPU, an
     * ECS service is considered over-provisioned. An over-provisioned ECS service might result in additional
     * infrastructure costs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     */
    private String finding;
    /**
     * <p>
     * The reason for the finding classification of an ECS service.
     * </p>
     * <p>
     * Finding reason codes for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance the
     * performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric of the
     * current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>CPUUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to enhance
     * the performance of your workload. This is identified by analyzing the <code>MemoryUtilization</code> metric of
     * the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>MemoryUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> findingReasonCodes;
    /**
     * <p>
     * An array of objects that describe the recommendation options for the ECS service.
     * </p>
     */
    private java.util.List<ECSServiceRecommendationOption> serviceRecommendationOptions;
    /**
     * <p>
     * The risk of the current ECS service not meeting the performance needs of its workloads. The higher the risk, the
     * more likely the current service can't meet the performance requirements of its workload.
     * </p>
     */
    private String currentPerformanceRisk;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the current ECS service. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the current ECS service. </p>
     *         <p>
     *         The following is the format of the ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the current ECS service. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the ECS service.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the ECS service.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the ECS service.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the ECS service.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the ECS service.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The configuration of the current ECS service.
     * </p>
     * 
     * @param currentServiceConfiguration
     *        The configuration of the current ECS service.
     */

    public void setCurrentServiceConfiguration(ServiceConfiguration currentServiceConfiguration) {
        this.currentServiceConfiguration = currentServiceConfiguration;
    }

    /**
     * <p>
     * The configuration of the current ECS service.
     * </p>
     * 
     * @return The configuration of the current ECS service.
     */

    public ServiceConfiguration getCurrentServiceConfiguration() {
        return this.currentServiceConfiguration;
    }

    /**
     * <p>
     * The configuration of the current ECS service.
     * </p>
     * 
     * @param currentServiceConfiguration
     *        The configuration of the current ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withCurrentServiceConfiguration(ServiceConfiguration currentServiceConfiguration) {
        setCurrentServiceConfiguration(currentServiceConfiguration);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the ECS service.
     * </p>
     * 
     * @return An array of objects that describe the utilization metrics of the ECS service.
     */

    public java.util.List<ECSServiceUtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the ECS service.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the ECS service.
     */

    public void setUtilizationMetrics(java.util.Collection<ECSServiceUtilizationMetric> utilizationMetrics) {
        if (utilizationMetrics == null) {
            this.utilizationMetrics = null;
            return;
        }

        this.utilizationMetrics = new java.util.ArrayList<ECSServiceUtilizationMetric>(utilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the ECS service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationMetrics(java.util.Collection)} or {@link #withUtilizationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withUtilizationMetrics(ECSServiceUtilizationMetric... utilizationMetrics) {
        if (this.utilizationMetrics == null) {
            setUtilizationMetrics(new java.util.ArrayList<ECSServiceUtilizationMetric>(utilizationMetrics.length));
        }
        for (ECSServiceUtilizationMetric ele : utilizationMetrics) {
            this.utilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the ECS service.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withUtilizationMetrics(java.util.Collection<ECSServiceUtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The number of days the ECS service utilization metrics were analyzed.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days the ECS service utilization metrics were analyzed.
     */

    public void setLookbackPeriodInDays(Double lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days the ECS service utilization metrics were analyzed.
     * </p>
     * 
     * @return The number of days the ECS service utilization metrics were analyzed.
     */

    public Double getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days the ECS service utilization metrics were analyzed.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days the ECS service utilization metrics were analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withLookbackPeriodInDays(Double lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The launch type the ECS service is using.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param launchType
     *        The launch type the ECS service is using. </p> <note>
     *        <p>
     *        Compute Optimizer only supports the Fargate launch type.
     *        </p>
     * @see ECSServiceLaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type the ECS service is using.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the Fargate launch type.
     * </p>
     * </note>
     * 
     * @return The launch type the ECS service is using. </p> <note>
     *         <p>
     *         Compute Optimizer only supports the Fargate launch type.
     *         </p>
     * @see ECSServiceLaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type the ECS service is using.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param launchType
     *        The launch type the ECS service is using. </p> <note>
     *        <p>
     *        Compute Optimizer only supports the Fargate launch type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceLaunchType
     */

    public ECSServiceRecommendation withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type the ECS service is using.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the Fargate launch type.
     * </p>
     * </note>
     * 
     * @param launchType
     *        The launch type the ECS service is using. </p> <note>
     *        <p>
     *        Compute Optimizer only supports the Fargate launch type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceLaunchType
     */

    public ECSServiceRecommendation withLaunchType(ECSServiceLaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ECS service recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The timestamp of when the ECS service recommendation was last generated.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the ECS service recommendation was last generated.
     * </p>
     * 
     * @return The timestamp of when the ECS service recommendation was last generated.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the ECS service recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The timestamp of when the ECS service recommendation was last generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        setLastRefreshTimestamp(lastRefreshTimestamp);
        return this;
    }

    /**
     * <p>
     * The finding classification of an ECS service.
     * </p>
     * <p>
     * Findings for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or CPU, an
     * ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor application
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or CPU, an
     * ECS service is considered over-provisioned. An over-provisioned ECS service might result in additional
     * infrastructure costs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification of an ECS service. </p>
     *        <p>
     *        Findings for ECS services include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or
     *        CPU, an ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor
     *        application performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or
     *        CPU, an ECS service is considered over-provisioned. An over-provisioned ECS service might result in
     *        additional infrastructure costs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     *        requirements of your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @see ECSServiceRecommendationFinding
     */

    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * The finding classification of an ECS service.
     * </p>
     * <p>
     * Findings for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or CPU, an
     * ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor application
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or CPU, an
     * ECS service is considered over-provisioned. An over-provisioned ECS service might result in additional
     * infrastructure costs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The finding classification of an ECS service. </p>
     *         <p>
     *         Findings for ECS services include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or
     *         CPU, an ECS service is considered under-provisioned. An under-provisioned ECS service might result in
     *         poor application performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or
     *         CPU, an ECS service is considered over-provisioned. An over-provisioned ECS service might result in
     *         additional infrastructure costs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     *         requirements of your workload, the service is considered optimized.
     *         </p>
     *         </li>
     * @see ECSServiceRecommendationFinding
     */

    public String getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * The finding classification of an ECS service.
     * </p>
     * <p>
     * Findings for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or CPU, an
     * ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor application
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or CPU, an
     * ECS service is considered over-provisioned. An over-provisioned ECS service might result in additional
     * infrastructure costs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification of an ECS service. </p>
     *        <p>
     *        Findings for ECS services include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or
     *        CPU, an ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor
     *        application performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or
     *        CPU, an ECS service is considered over-provisioned. An over-provisioned ECS service might result in
     *        additional infrastructure costs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     *        requirements of your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceRecommendationFinding
     */

    public ECSServiceRecommendation withFinding(String finding) {
        setFinding(finding);
        return this;
    }

    /**
     * <p>
     * The finding classification of an ECS service.
     * </p>
     * <p>
     * Findings for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or CPU, an
     * ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor application
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or CPU, an
     * ECS service is considered over-provisioned. An over-provisioned ECS service might result in additional
     * infrastructure costs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification of an ECS service. </p>
     *        <p>
     *        Findings for ECS services include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough memory or
     *        CPU, an ECS service is considered under-provisioned. An under-provisioned ECS service might result in poor
     *        application performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive memory or
     *        CPU, an ECS service is considered over-provisioned. An over-provisioned ECS service might result in
     *        additional infrastructure costs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When both the CPU and memory of your ECS service meet the performance
     *        requirements of your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceRecommendationFinding
     */

    public ECSServiceRecommendation withFinding(ECSServiceRecommendationFinding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of an ECS service.
     * </p>
     * <p>
     * Finding reason codes for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance the
     * performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric of the
     * current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>CPUUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to enhance
     * the performance of your workload. This is identified by analyzing the <code>MemoryUtilization</code> metric of
     * the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>MemoryUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason for the finding classification of an ECS service. </p>
     *         <p>
     *         Finding reason codes for ECS services include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance
     *         the performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric
     *         of the current service during the look-back period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while
     *         still meeting the performance requirements of your workload. This is identified by analyzing the
     *         <code>CPUUtilization</code> metric of the current service during the look-back period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to
     *         enhance the performance of your workload. This is identified by analyzing the
     *         <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down
     *         while still meeting the performance requirements of your workload. This is identified by analyzing the
     *         <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *         </p>
     *         </li>
     * @see ECSServiceRecommendationFindingReasonCode
     */

    public java.util.List<String> getFindingReasonCodes() {
        return findingReasonCodes;
    }

    /**
     * <p>
     * The reason for the finding classification of an ECS service.
     * </p>
     * <p>
     * Finding reason codes for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance the
     * performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric of the
     * current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>CPUUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to enhance
     * the performance of your workload. This is identified by analyzing the <code>MemoryUtilization</code> metric of
     * the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>MemoryUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification of an ECS service. </p>
     *        <p>
     *        Finding reason codes for ECS services include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance
     *        the performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric
     *        of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     *        meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>CPUUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to
     *        enhance the performance of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while
     *        still meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     * @see ECSServiceRecommendationFindingReasonCode
     */

    public void setFindingReasonCodes(java.util.Collection<String> findingReasonCodes) {
        if (findingReasonCodes == null) {
            this.findingReasonCodes = null;
            return;
        }

        this.findingReasonCodes = new java.util.ArrayList<String>(findingReasonCodes);
    }

    /**
     * <p>
     * The reason for the finding classification of an ECS service.
     * </p>
     * <p>
     * Finding reason codes for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance the
     * performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric of the
     * current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>CPUUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to enhance
     * the performance of your workload. This is identified by analyzing the <code>MemoryUtilization</code> metric of
     * the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>MemoryUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingReasonCodes(java.util.Collection)} or {@link #withFindingReasonCodes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification of an ECS service. </p>
     *        <p>
     *        Finding reason codes for ECS services include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance
     *        the performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric
     *        of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     *        meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>CPUUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to
     *        enhance the performance of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while
     *        still meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceRecommendationFindingReasonCode
     */

    public ECSServiceRecommendation withFindingReasonCodes(String... findingReasonCodes) {
        if (this.findingReasonCodes == null) {
            setFindingReasonCodes(new java.util.ArrayList<String>(findingReasonCodes.length));
        }
        for (String ele : findingReasonCodes) {
            this.findingReasonCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of an ECS service.
     * </p>
     * <p>
     * Finding reason codes for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance the
     * performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric of the
     * current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>CPUUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to enhance
     * the performance of your workload. This is identified by analyzing the <code>MemoryUtilization</code> metric of
     * the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>MemoryUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification of an ECS service. </p>
     *        <p>
     *        Finding reason codes for ECS services include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance
     *        the performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric
     *        of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     *        meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>CPUUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to
     *        enhance the performance of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while
     *        still meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceRecommendationFindingReasonCode
     */

    public ECSServiceRecommendation withFindingReasonCodes(java.util.Collection<String> findingReasonCodes) {
        setFindingReasonCodes(findingReasonCodes);
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of an ECS service.
     * </p>
     * <p>
     * Finding reason codes for ECS services include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance the
     * performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric of the
     * current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>CPUUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to enhance
     * the performance of your workload. This is identified by analyzing the <code>MemoryUtilization</code> metric of
     * the current service during the look-back period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while still
     * meeting the performance requirements of your workload. This is identified by analyzing the
     * <code>MemoryUtilization</code> metric of the current service during the look-back period.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification of an ECS service. </p>
     *        <p>
     *        Finding reason codes for ECS services include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUnderprovisioned</code> </b> — The ECS service CPU configuration can be sized up to enhance
     *        the performance of your workload. This is identified by analyzing the <code>CPUUtilization</code> metric
     *        of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CPUOverprovisioned</code> </b> — The ECS service CPU configuration can be sized down while still
     *        meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>CPUUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The ECS service memory configuration can be sized up to
     *        enhance the performance of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The ECS service memory configuration can be sized down while
     *        still meeting the performance requirements of your workload. This is identified by analyzing the
     *        <code>MemoryUtilization</code> metric of the current service during the look-back period.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceRecommendationFindingReasonCode
     */

    public ECSServiceRecommendation withFindingReasonCodes(ECSServiceRecommendationFindingReasonCode... findingReasonCodes) {
        java.util.ArrayList<String> findingReasonCodesCopy = new java.util.ArrayList<String>(findingReasonCodes.length);
        for (ECSServiceRecommendationFindingReasonCode value : findingReasonCodes) {
            findingReasonCodesCopy.add(value.toString());
        }
        if (getFindingReasonCodes() == null) {
            setFindingReasonCodes(findingReasonCodesCopy);
        } else {
            getFindingReasonCodes().addAll(findingReasonCodesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the ECS service.
     * </p>
     * 
     * @return An array of objects that describe the recommendation options for the ECS service.
     */

    public java.util.List<ECSServiceRecommendationOption> getServiceRecommendationOptions() {
        return serviceRecommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the ECS service.
     * </p>
     * 
     * @param serviceRecommendationOptions
     *        An array of objects that describe the recommendation options for the ECS service.
     */

    public void setServiceRecommendationOptions(java.util.Collection<ECSServiceRecommendationOption> serviceRecommendationOptions) {
        if (serviceRecommendationOptions == null) {
            this.serviceRecommendationOptions = null;
            return;
        }

        this.serviceRecommendationOptions = new java.util.ArrayList<ECSServiceRecommendationOption>(serviceRecommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the ECS service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceRecommendationOptions(java.util.Collection)} or
     * {@link #withServiceRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serviceRecommendationOptions
     *        An array of objects that describe the recommendation options for the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withServiceRecommendationOptions(ECSServiceRecommendationOption... serviceRecommendationOptions) {
        if (this.serviceRecommendationOptions == null) {
            setServiceRecommendationOptions(new java.util.ArrayList<ECSServiceRecommendationOption>(serviceRecommendationOptions.length));
        }
        for (ECSServiceRecommendationOption ele : serviceRecommendationOptions) {
            this.serviceRecommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the ECS service.
     * </p>
     * 
     * @param serviceRecommendationOptions
     *        An array of objects that describe the recommendation options for the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceRecommendation withServiceRecommendationOptions(java.util.Collection<ECSServiceRecommendationOption> serviceRecommendationOptions) {
        setServiceRecommendationOptions(serviceRecommendationOptions);
        return this;
    }

    /**
     * <p>
     * The risk of the current ECS service not meeting the performance needs of its workloads. The higher the risk, the
     * more likely the current service can't meet the performance requirements of its workload.
     * </p>
     * 
     * @param currentPerformanceRisk
     *        The risk of the current ECS service not meeting the performance needs of its workloads. The higher the
     *        risk, the more likely the current service can't meet the performance requirements of its workload.
     * @see CurrentPerformanceRisk
     */

    public void setCurrentPerformanceRisk(String currentPerformanceRisk) {
        this.currentPerformanceRisk = currentPerformanceRisk;
    }

    /**
     * <p>
     * The risk of the current ECS service not meeting the performance needs of its workloads. The higher the risk, the
     * more likely the current service can't meet the performance requirements of its workload.
     * </p>
     * 
     * @return The risk of the current ECS service not meeting the performance needs of its workloads. The higher the
     *         risk, the more likely the current service can't meet the performance requirements of its workload.
     * @see CurrentPerformanceRisk
     */

    public String getCurrentPerformanceRisk() {
        return this.currentPerformanceRisk;
    }

    /**
     * <p>
     * The risk of the current ECS service not meeting the performance needs of its workloads. The higher the risk, the
     * more likely the current service can't meet the performance requirements of its workload.
     * </p>
     * 
     * @param currentPerformanceRisk
     *        The risk of the current ECS service not meeting the performance needs of its workloads. The higher the
     *        risk, the more likely the current service can't meet the performance requirements of its workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrentPerformanceRisk
     */

    public ECSServiceRecommendation withCurrentPerformanceRisk(String currentPerformanceRisk) {
        setCurrentPerformanceRisk(currentPerformanceRisk);
        return this;
    }

    /**
     * <p>
     * The risk of the current ECS service not meeting the performance needs of its workloads. The higher the risk, the
     * more likely the current service can't meet the performance requirements of its workload.
     * </p>
     * 
     * @param currentPerformanceRisk
     *        The risk of the current ECS service not meeting the performance needs of its workloads. The higher the
     *        risk, the more likely the current service can't meet the performance requirements of its workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrentPerformanceRisk
     */

    public ECSServiceRecommendation withCurrentPerformanceRisk(CurrentPerformanceRisk currentPerformanceRisk) {
        this.currentPerformanceRisk = currentPerformanceRisk.toString();
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
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCurrentServiceConfiguration() != null)
            sb.append("CurrentServiceConfiguration: ").append(getCurrentServiceConfiguration()).append(",");
        if (getUtilizationMetrics() != null)
            sb.append("UtilizationMetrics: ").append(getUtilizationMetrics()).append(",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getLastRefreshTimestamp() != null)
            sb.append("LastRefreshTimestamp: ").append(getLastRefreshTimestamp()).append(",");
        if (getFinding() != null)
            sb.append("Finding: ").append(getFinding()).append(",");
        if (getFindingReasonCodes() != null)
            sb.append("FindingReasonCodes: ").append(getFindingReasonCodes()).append(",");
        if (getServiceRecommendationOptions() != null)
            sb.append("ServiceRecommendationOptions: ").append(getServiceRecommendationOptions()).append(",");
        if (getCurrentPerformanceRisk() != null)
            sb.append("CurrentPerformanceRisk: ").append(getCurrentPerformanceRisk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSServiceRecommendation == false)
            return false;
        ECSServiceRecommendation other = (ECSServiceRecommendation) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCurrentServiceConfiguration() == null ^ this.getCurrentServiceConfiguration() == null)
            return false;
        if (other.getCurrentServiceConfiguration() != null && other.getCurrentServiceConfiguration().equals(this.getCurrentServiceConfiguration()) == false)
            return false;
        if (other.getUtilizationMetrics() == null ^ this.getUtilizationMetrics() == null)
            return false;
        if (other.getUtilizationMetrics() != null && other.getUtilizationMetrics().equals(this.getUtilizationMetrics()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getLastRefreshTimestamp() == null ^ this.getLastRefreshTimestamp() == null)
            return false;
        if (other.getLastRefreshTimestamp() != null && other.getLastRefreshTimestamp().equals(this.getLastRefreshTimestamp()) == false)
            return false;
        if (other.getFinding() == null ^ this.getFinding() == null)
            return false;
        if (other.getFinding() != null && other.getFinding().equals(this.getFinding()) == false)
            return false;
        if (other.getFindingReasonCodes() == null ^ this.getFindingReasonCodes() == null)
            return false;
        if (other.getFindingReasonCodes() != null && other.getFindingReasonCodes().equals(this.getFindingReasonCodes()) == false)
            return false;
        if (other.getServiceRecommendationOptions() == null ^ this.getServiceRecommendationOptions() == null)
            return false;
        if (other.getServiceRecommendationOptions() != null && other.getServiceRecommendationOptions().equals(this.getServiceRecommendationOptions()) == false)
            return false;
        if (other.getCurrentPerformanceRisk() == null ^ this.getCurrentPerformanceRisk() == null)
            return false;
        if (other.getCurrentPerformanceRisk() != null && other.getCurrentPerformanceRisk().equals(this.getCurrentPerformanceRisk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCurrentServiceConfiguration() == null) ? 0 : getCurrentServiceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getFindingReasonCodes() == null) ? 0 : getFindingReasonCodes().hashCode());
        hashCode = prime * hashCode + ((getServiceRecommendationOptions() == null) ? 0 : getServiceRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getCurrentPerformanceRisk() == null) ? 0 : getCurrentPerformanceRisk().hashCode());
        return hashCode;
    }

    @Override
    public ECSServiceRecommendation clone() {
        try {
            return (ECSServiceRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ECSServiceRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
