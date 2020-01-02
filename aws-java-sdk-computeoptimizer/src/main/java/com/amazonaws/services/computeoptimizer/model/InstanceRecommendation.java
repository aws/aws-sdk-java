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
 * Describes an Amazon EC2 instance recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/InstanceRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current instance.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The AWS account ID of the instance recommendation.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the current instance.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The instance type of the current instance.
     * </p>
     */
    private String currentInstanceType;
    /**
     * <p>
     * The finding classification for the instance.
     * </p>
     * <p>
     * Findings for instances include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     * specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of
     * your workload. Under-provisioned instances may lead to poor application performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification
     * of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance
     * requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to
     * unnecessary infrastructure cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance,
     * such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned.
     * An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized
     * resources, AWS Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     * <code>OPTIMIZED</code>.
     * </p>
     * </note>
     */
    private String finding;
    /**
     * <p>
     * An array of objects that describe the utilization metrics of the instance.
     * </p>
     */
    private java.util.List<UtilizationMetric> utilizationMetrics;
    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the instance.
     * </p>
     */
    private Double lookBackPeriodInDays;
    /**
     * <p>
     * An array of objects that describe the recommendation options for the instance.
     * </p>
     */
    private java.util.List<InstanceRecommendationOption> recommendationOptions;
    /**
     * <p>
     * An array of objects that describe the source resource of the recommendation.
     * </p>
     */
    private java.util.List<RecommendationSource> recommendationSources;
    /**
     * <p>
     * The time stamp of when the instance recommendation was last refreshed.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current instance.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the current instance.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the current instance.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current instance.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the instance recommendation.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the instance recommendation.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the instance recommendation.
     * </p>
     * 
     * @return The AWS account ID of the instance recommendation.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the instance recommendation.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the instance recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the current instance.
     * </p>
     * 
     * @param instanceName
     *        The name of the current instance.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the current instance.
     * </p>
     * 
     * @return The name of the current instance.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the current instance.
     * </p>
     * 
     * @param instanceName
     *        The name of the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The instance type of the current instance.
     * </p>
     * 
     * @param currentInstanceType
     *        The instance type of the current instance.
     */

    public void setCurrentInstanceType(String currentInstanceType) {
        this.currentInstanceType = currentInstanceType;
    }

    /**
     * <p>
     * The instance type of the current instance.
     * </p>
     * 
     * @return The instance type of the current instance.
     */

    public String getCurrentInstanceType() {
        return this.currentInstanceType;
    }

    /**
     * <p>
     * The instance type of the current instance.
     * </p>
     * 
     * @param currentInstanceType
     *        The instance type of the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withCurrentInstanceType(String currentInstanceType) {
        setCurrentInstanceType(currentInstanceType);
        return this;
    }

    /**
     * <p>
     * The finding classification for the instance.
     * </p>
     * <p>
     * Findings for instances include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     * specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of
     * your workload. Under-provisioned instances may lead to poor application performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification
     * of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance
     * requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to
     * unnecessary infrastructure cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance,
     * such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned.
     * An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized
     * resources, AWS Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     * <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @param finding
     *        The finding classification for the instance.</p>
     *        <p>
     *        Findings for instances include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     *        specification of your instance, such as CPU, memory, or network, does not meet the performance
     *        requirements of your workload. Under-provisioned instances may lead to poor application performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one
     *        specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the
     *        performance requirements of your workload, and no specification is under-provisioned. Over-provisioned
     *        instances may lead to unnecessary infrastructure cost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your
     *        instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not
     *        over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure
     *        cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     *        <code>OPTIMIZED</code>.
     *        </p>
     * @see Finding
     */

    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * The finding classification for the instance.
     * </p>
     * <p>
     * Findings for instances include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     * specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of
     * your workload. Under-provisioned instances may lead to poor application performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification
     * of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance
     * requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to
     * unnecessary infrastructure cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance,
     * such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned.
     * An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized
     * resources, AWS Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     * <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @return The finding classification for the instance.</p>
     *         <p>
     *         Findings for instances include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     *         specification of your instance, such as CPU, memory, or network, does not meet the performance
     *         requirements of your workload. Under-provisioned instances may lead to poor application performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one
     *         specification of your instance, such as CPU, memory, or network, can be sized down while still meeting
     *         the performance requirements of your workload, and no specification is under-provisioned.
     *         Over-provisioned instances may lead to unnecessary infrastructure cost.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your
     *         instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not
     *         over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure
     *         cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     *         <code>OPTIMIZED</code>.
     *         </p>
     * @see Finding
     */

    public String getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * The finding classification for the instance.
     * </p>
     * <p>
     * Findings for instances include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     * specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of
     * your workload. Under-provisioned instances may lead to poor application performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification
     * of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance
     * requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to
     * unnecessary infrastructure cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance,
     * such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned.
     * An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized
     * resources, AWS Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     * <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @param finding
     *        The finding classification for the instance.</p>
     *        <p>
     *        Findings for instances include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     *        specification of your instance, such as CPU, memory, or network, does not meet the performance
     *        requirements of your workload. Under-provisioned instances may lead to poor application performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one
     *        specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the
     *        performance requirements of your workload, and no specification is under-provisioned. Over-provisioned
     *        instances may lead to unnecessary infrastructure cost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your
     *        instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not
     *        over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure
     *        cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     *        <code>OPTIMIZED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Finding
     */

    public InstanceRecommendation withFinding(String finding) {
        setFinding(finding);
        return this;
    }

    /**
     * <p>
     * The finding classification for the instance.
     * </p>
     * <p>
     * Findings for instances include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     * specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of
     * your workload. Under-provisioned instances may lead to poor application performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one specification
     * of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance
     * requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to
     * unnecessary infrastructure cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your instance,
     * such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned.
     * An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized
     * resources, AWS Compute Optimizer might recommend a new generation instance type.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     * <code>OPTIMIZED</code>.
     * </p>
     * </note>
     * 
     * @param finding
     *        The finding classification for the instance.</p>
     *        <p>
     *        Findings for instances include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b>—An instance is considered under-provisioned when at least one
     *        specification of your instance, such as CPU, memory, or network, does not meet the performance
     *        requirements of your workload. Under-provisioned instances may lead to poor application performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b>—An instance is considered over-provisioned when at least one
     *        specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the
     *        performance requirements of your workload, and no specification is under-provisioned. Over-provisioned
     *        instances may lead to unnecessary infrastructure cost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b>—An instance is considered optimized when all specifications of your
     *        instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not
     *        over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure
     *        cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The values that are returned might be <code>UNDER_PROVISIONED</code>, <code>OVER_PROVISIONED</code>, or
     *        <code>OPTIMIZED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Finding
     */

    public InstanceRecommendation withFinding(Finding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the instance.
     * </p>
     * 
     * @return An array of objects that describe the utilization metrics of the instance.
     */

    public java.util.List<UtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the instance.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the instance.
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
     * An array of objects that describe the utilization metrics of the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationMetrics(java.util.Collection)} or {@link #withUtilizationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withUtilizationMetrics(UtilizationMetric... utilizationMetrics) {
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
     * An array of objects that describe the utilization metrics of the instance.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withUtilizationMetrics(java.util.Collection<UtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the instance.
     * </p>
     * 
     * @param lookBackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the instance.
     */

    public void setLookBackPeriodInDays(Double lookBackPeriodInDays) {
        this.lookBackPeriodInDays = lookBackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the instance.
     * </p>
     * 
     * @return The number of days for which utilization metrics were analyzed for the instance.
     */

    public Double getLookBackPeriodInDays() {
        return this.lookBackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the instance.
     * </p>
     * 
     * @param lookBackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withLookBackPeriodInDays(Double lookBackPeriodInDays) {
        setLookBackPeriodInDays(lookBackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the instance.
     * </p>
     * 
     * @return An array of objects that describe the recommendation options for the instance.
     */

    public java.util.List<InstanceRecommendationOption> getRecommendationOptions() {
        return recommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the instance.
     * </p>
     * 
     * @param recommendationOptions
     *        An array of objects that describe the recommendation options for the instance.
     */

    public void setRecommendationOptions(java.util.Collection<InstanceRecommendationOption> recommendationOptions) {
        if (recommendationOptions == null) {
            this.recommendationOptions = null;
            return;
        }

        this.recommendationOptions = new java.util.ArrayList<InstanceRecommendationOption>(recommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationOptions(java.util.Collection)} or
     * {@link #withRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationOptions
     *        An array of objects that describe the recommendation options for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withRecommendationOptions(InstanceRecommendationOption... recommendationOptions) {
        if (this.recommendationOptions == null) {
            setRecommendationOptions(new java.util.ArrayList<InstanceRecommendationOption>(recommendationOptions.length));
        }
        for (InstanceRecommendationOption ele : recommendationOptions) {
            this.recommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the instance.
     * </p>
     * 
     * @param recommendationOptions
     *        An array of objects that describe the recommendation options for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withRecommendationOptions(java.util.Collection<InstanceRecommendationOption> recommendationOptions) {
        setRecommendationOptions(recommendationOptions);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the source resource of the recommendation.
     * </p>
     * 
     * @return An array of objects that describe the source resource of the recommendation.
     */

    public java.util.List<RecommendationSource> getRecommendationSources() {
        return recommendationSources;
    }

    /**
     * <p>
     * An array of objects that describe the source resource of the recommendation.
     * </p>
     * 
     * @param recommendationSources
     *        An array of objects that describe the source resource of the recommendation.
     */

    public void setRecommendationSources(java.util.Collection<RecommendationSource> recommendationSources) {
        if (recommendationSources == null) {
            this.recommendationSources = null;
            return;
        }

        this.recommendationSources = new java.util.ArrayList<RecommendationSource>(recommendationSources);
    }

    /**
     * <p>
     * An array of objects that describe the source resource of the recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationSources(java.util.Collection)} or
     * {@link #withRecommendationSources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationSources
     *        An array of objects that describe the source resource of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withRecommendationSources(RecommendationSource... recommendationSources) {
        if (this.recommendationSources == null) {
            setRecommendationSources(new java.util.ArrayList<RecommendationSource>(recommendationSources.length));
        }
        for (RecommendationSource ele : recommendationSources) {
            this.recommendationSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the source resource of the recommendation.
     * </p>
     * 
     * @param recommendationSources
     *        An array of objects that describe the source resource of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withRecommendationSources(java.util.Collection<RecommendationSource> recommendationSources) {
        setRecommendationSources(recommendationSources);
        return this;
    }

    /**
     * <p>
     * The time stamp of when the instance recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the instance recommendation was last refreshed.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the instance recommendation was last refreshed.
     * </p>
     * 
     * @return The time stamp of when the instance recommendation was last refreshed.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the instance recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the instance recommendation was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getCurrentInstanceType() != null)
            sb.append("CurrentInstanceType: ").append(getCurrentInstanceType()).append(",");
        if (getFinding() != null)
            sb.append("Finding: ").append(getFinding()).append(",");
        if (getUtilizationMetrics() != null)
            sb.append("UtilizationMetrics: ").append(getUtilizationMetrics()).append(",");
        if (getLookBackPeriodInDays() != null)
            sb.append("LookBackPeriodInDays: ").append(getLookBackPeriodInDays()).append(",");
        if (getRecommendationOptions() != null)
            sb.append("RecommendationOptions: ").append(getRecommendationOptions()).append(",");
        if (getRecommendationSources() != null)
            sb.append("RecommendationSources: ").append(getRecommendationSources()).append(",");
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

        if (obj instanceof InstanceRecommendation == false)
            return false;
        InstanceRecommendation other = (InstanceRecommendation) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getCurrentInstanceType() == null ^ this.getCurrentInstanceType() == null)
            return false;
        if (other.getCurrentInstanceType() != null && other.getCurrentInstanceType().equals(this.getCurrentInstanceType()) == false)
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
        if (other.getRecommendationOptions() == null ^ this.getRecommendationOptions() == null)
            return false;
        if (other.getRecommendationOptions() != null && other.getRecommendationOptions().equals(this.getRecommendationOptions()) == false)
            return false;
        if (other.getRecommendationSources() == null ^ this.getRecommendationSources() == null)
            return false;
        if (other.getRecommendationSources() != null && other.getRecommendationSources().equals(this.getRecommendationSources()) == false)
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

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getCurrentInstanceType() == null) ? 0 : getCurrentInstanceType().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriodInDays() == null) ? 0 : getLookBackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getRecommendationOptions() == null) ? 0 : getRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSources() == null) ? 0 : getRecommendationSources().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRecommendation clone() {
        try {
            return (InstanceRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.InstanceRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
