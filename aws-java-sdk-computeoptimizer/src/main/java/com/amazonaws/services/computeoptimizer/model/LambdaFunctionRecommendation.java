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
 * Describes an AWS Lambda function recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/LambdaFunctionRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current function.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The version number of the current function.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * The AWS account ID of the function.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The amount of memory, in MB, that's allocated to the current function.
     * </p>
     */
    private Integer currentMemorySize;
    /**
     * <p>
     * The number of times your function code was executed during the look-back period.
     * </p>
     */
    private Long numberOfInvocations;
    /**
     * <p>
     * An array of objects that describe the utilization metrics of the function.
     * </p>
     */
    private java.util.List<LambdaFunctionUtilizationMetric> utilizationMetrics;
    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the function.
     * </p>
     */
    private Double lookbackPeriodInDays;
    /**
     * <p>
     * The time stamp of when the function recommendation was last refreshed.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;
    /**
     * <p>
     * The finding classification for the function.
     * </p>
     * <p>
     * Findings for functions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its current
     * configuration and its utilization history. This finding classification does not include finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at a
     * lower level (under-provisioned) than required for your workload because its current configuration is not optimal.
     * Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned resources might
     * lead to poor application performance. This finding classification can include the
     * <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the function.
     * This could be because the function has not accumulated sufficient metric data, or the function does not qualify
     * for a recommendation. This finding classification can include the <code>InsufficientData</code> and
     * <code>Inconclusive</code> finding reason codes.
     * </p>
     * <note>
     * <p>
     * Functions with a finding of unavailable are not returned unless you specify the <code>filter</code> parameter
     * with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code> request.
     * </p>
     * </note></li>
     * </ul>
     */
    private String finding;
    /**
     * <p>
     * The reason for the finding classification of the function.
     * </p>
     * <note>
     * <p>
     * Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     * </p>
     * </note>
     * <p>
     * Reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory configuration can
     * be sized down while still meeting the performance requirements of your workload. An over-provisioned function
     * might lead to unnecessary infrastructure cost. This finding reason code is part of the <code>NotOptimized</code>
     * finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory configuration
     * doesn't meet the performance requirements of the workload. An under-provisioned function might lead to poor
     * application performance. This finding reason code is part of the <code>NotOptimized</code> finding
     * classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute Optimizer
     * to generate a recommendation. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     * <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an internal
     * error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> findingReasonCodes;
    /**
     * <p>
     * An array of objects that describe the memory configuration recommendation options for the function.
     * </p>
     */
    private java.util.List<LambdaFunctionMemoryRecommendationOption> memorySizeRecommendationOptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the current function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the current function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the current function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The version number of the current function.
     * </p>
     * 
     * @param functionVersion
     *        The version number of the current function.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * The version number of the current function.
     * </p>
     * 
     * @return The version number of the current function.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * The version number of the current function.
     * </p>
     * 
     * @param functionVersion
     *        The version number of the current function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the function.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the function.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the function.
     * </p>
     * 
     * @return The AWS account ID of the function.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the function.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The amount of memory, in MB, that's allocated to the current function.
     * </p>
     * 
     * @param currentMemorySize
     *        The amount of memory, in MB, that's allocated to the current function.
     */

    public void setCurrentMemorySize(Integer currentMemorySize) {
        this.currentMemorySize = currentMemorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, that's allocated to the current function.
     * </p>
     * 
     * @return The amount of memory, in MB, that's allocated to the current function.
     */

    public Integer getCurrentMemorySize() {
        return this.currentMemorySize;
    }

    /**
     * <p>
     * The amount of memory, in MB, that's allocated to the current function.
     * </p>
     * 
     * @param currentMemorySize
     *        The amount of memory, in MB, that's allocated to the current function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withCurrentMemorySize(Integer currentMemorySize) {
        setCurrentMemorySize(currentMemorySize);
        return this;
    }

    /**
     * <p>
     * The number of times your function code was executed during the look-back period.
     * </p>
     * 
     * @param numberOfInvocations
     *        The number of times your function code was executed during the look-back period.
     */

    public void setNumberOfInvocations(Long numberOfInvocations) {
        this.numberOfInvocations = numberOfInvocations;
    }

    /**
     * <p>
     * The number of times your function code was executed during the look-back period.
     * </p>
     * 
     * @return The number of times your function code was executed during the look-back period.
     */

    public Long getNumberOfInvocations() {
        return this.numberOfInvocations;
    }

    /**
     * <p>
     * The number of times your function code was executed during the look-back period.
     * </p>
     * 
     * @param numberOfInvocations
     *        The number of times your function code was executed during the look-back period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withNumberOfInvocations(Long numberOfInvocations) {
        setNumberOfInvocations(numberOfInvocations);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the function.
     * </p>
     * 
     * @return An array of objects that describe the utilization metrics of the function.
     */

    public java.util.List<LambdaFunctionUtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the function.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the function.
     */

    public void setUtilizationMetrics(java.util.Collection<LambdaFunctionUtilizationMetric> utilizationMetrics) {
        if (utilizationMetrics == null) {
            this.utilizationMetrics = null;
            return;
        }

        this.utilizationMetrics = new java.util.ArrayList<LambdaFunctionUtilizationMetric>(utilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationMetrics(java.util.Collection)} or {@link #withUtilizationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withUtilizationMetrics(LambdaFunctionUtilizationMetric... utilizationMetrics) {
        if (this.utilizationMetrics == null) {
            setUtilizationMetrics(new java.util.ArrayList<LambdaFunctionUtilizationMetric>(utilizationMetrics.length));
        }
        for (LambdaFunctionUtilizationMetric ele : utilizationMetrics) {
            this.utilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the function.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withUtilizationMetrics(java.util.Collection<LambdaFunctionUtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the function.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the function.
     */

    public void setLookbackPeriodInDays(Double lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the function.
     * </p>
     * 
     * @return The number of days for which utilization metrics were analyzed for the function.
     */

    public Double getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for the function.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withLookbackPeriodInDays(Double lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The time stamp of when the function recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the function recommendation was last refreshed.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the function recommendation was last refreshed.
     * </p>
     * 
     * @return The time stamp of when the function recommendation was last refreshed.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the function recommendation was last refreshed.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The time stamp of when the function recommendation was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        setLastRefreshTimestamp(lastRefreshTimestamp);
        return this;
    }

    /**
     * <p>
     * The finding classification for the function.
     * </p>
     * <p>
     * Findings for functions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its current
     * configuration and its utilization history. This finding classification does not include finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at a
     * lower level (under-provisioned) than required for your workload because its current configuration is not optimal.
     * Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned resources might
     * lead to poor application performance. This finding classification can include the
     * <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the function.
     * This could be because the function has not accumulated sufficient metric data, or the function does not qualify
     * for a recommendation. This finding classification can include the <code>InsufficientData</code> and
     * <code>Inconclusive</code> finding reason codes.
     * </p>
     * <note>
     * <p>
     * Functions with a finding of unavailable are not returned unless you specify the <code>filter</code> parameter
     * with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code> request.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param finding
     *        The finding classification for the function.</p>
     *        <p>
     *        Findings for functions include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its
     *        current configuration and its utilization history. This finding classification does not include finding
     *        reason codes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at
     *        a lower level (under-provisioned) than required for your workload because its current configuration is not
     *        optimal. Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned
     *        resources might lead to poor application performance. This finding classification can include the
     *        <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the
     *        function. This could be because the function has not accumulated sufficient metric data, or the function
     *        does not qualify for a recommendation. This finding classification can include the
     *        <code>InsufficientData</code> and <code>Inconclusive</code> finding reason codes.
     *        </p>
     *        <note>
     *        <p>
     *        Functions with a finding of unavailable are not returned unless you specify the <code>filter</code>
     *        parameter with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code>
     *        request.
     *        </p>
     *        </note></li>
     * @see LambdaFunctionRecommendationFinding
     */

    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * The finding classification for the function.
     * </p>
     * <p>
     * Findings for functions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its current
     * configuration and its utilization history. This finding classification does not include finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at a
     * lower level (under-provisioned) than required for your workload because its current configuration is not optimal.
     * Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned resources might
     * lead to poor application performance. This finding classification can include the
     * <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the function.
     * This could be because the function has not accumulated sufficient metric data, or the function does not qualify
     * for a recommendation. This finding classification can include the <code>InsufficientData</code> and
     * <code>Inconclusive</code> finding reason codes.
     * </p>
     * <note>
     * <p>
     * Functions with a finding of unavailable are not returned unless you specify the <code>filter</code> parameter
     * with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code> request.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The finding classification for the function.</p>
     *         <p>
     *         Findings for functions include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its
     *         current configuration and its utilization history. This finding classification does not include finding
     *         reason codes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or
     *         at a lower level (under-provisioned) than required for your workload because its current configuration is
     *         not optimal. Over-provisioned resources might lead to unnecessary infrastructure cost, and
     *         under-provisioned resources might lead to poor application performance. This finding classification can
     *         include the <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason
     *         codes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the
     *         function. This could be because the function has not accumulated sufficient metric data, or the function
     *         does not qualify for a recommendation. This finding classification can include the
     *         <code>InsufficientData</code> and <code>Inconclusive</code> finding reason codes.
     *         </p>
     *         <note>
     *         <p>
     *         Functions with a finding of unavailable are not returned unless you specify the <code>filter</code>
     *         parameter with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code>
     *         request.
     *         </p>
     *         </note></li>
     * @see LambdaFunctionRecommendationFinding
     */

    public String getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * The finding classification for the function.
     * </p>
     * <p>
     * Findings for functions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its current
     * configuration and its utilization history. This finding classification does not include finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at a
     * lower level (under-provisioned) than required for your workload because its current configuration is not optimal.
     * Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned resources might
     * lead to poor application performance. This finding classification can include the
     * <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the function.
     * This could be because the function has not accumulated sufficient metric data, or the function does not qualify
     * for a recommendation. This finding classification can include the <code>InsufficientData</code> and
     * <code>Inconclusive</code> finding reason codes.
     * </p>
     * <note>
     * <p>
     * Functions with a finding of unavailable are not returned unless you specify the <code>filter</code> parameter
     * with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code> request.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param finding
     *        The finding classification for the function.</p>
     *        <p>
     *        Findings for functions include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its
     *        current configuration and its utilization history. This finding classification does not include finding
     *        reason codes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at
     *        a lower level (under-provisioned) than required for your workload because its current configuration is not
     *        optimal. Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned
     *        resources might lead to poor application performance. This finding classification can include the
     *        <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the
     *        function. This could be because the function has not accumulated sufficient metric data, or the function
     *        does not qualify for a recommendation. This finding classification can include the
     *        <code>InsufficientData</code> and <code>Inconclusive</code> finding reason codes.
     *        </p>
     *        <note>
     *        <p>
     *        Functions with a finding of unavailable are not returned unless you specify the <code>filter</code>
     *        parameter with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code>
     *        request.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFunctionRecommendationFinding
     */

    public LambdaFunctionRecommendation withFinding(String finding) {
        setFinding(finding);
        return this;
    }

    /**
     * <p>
     * The finding classification for the function.
     * </p>
     * <p>
     * Findings for functions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its current
     * configuration and its utilization history. This finding classification does not include finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at a
     * lower level (under-provisioned) than required for your workload because its current configuration is not optimal.
     * Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned resources might
     * lead to poor application performance. This finding classification can include the
     * <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the function.
     * This could be because the function has not accumulated sufficient metric data, or the function does not qualify
     * for a recommendation. This finding classification can include the <code>InsufficientData</code> and
     * <code>Inconclusive</code> finding reason codes.
     * </p>
     * <note>
     * <p>
     * Functions with a finding of unavailable are not returned unless you specify the <code>filter</code> parameter
     * with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code> request.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param finding
     *        The finding classification for the function.</p>
     *        <p>
     *        Findings for functions include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — The function is correctly provisioned to run your workload based on its
     *        current configuration and its utilization history. This finding classification does not include finding
     *        reason codes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NotOptimized</code> </b> — The function is performing at a higher level (over-provisioned) or at
     *        a lower level (under-provisioned) than required for your workload because its current configuration is not
     *        optimal. Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned
     *        resources might lead to poor application performance. This finding classification can include the
     *        <code>MemoryUnderprovisioned</code> and <code>MemoryUnderprovisioned</code> finding reason codes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Unavailable</code> </b> — Compute Optimizer was unable to generate a recommendation for the
     *        function. This could be because the function has not accumulated sufficient metric data, or the function
     *        does not qualify for a recommendation. This finding classification can include the
     *        <code>InsufficientData</code> and <code>Inconclusive</code> finding reason codes.
     *        </p>
     *        <note>
     *        <p>
     *        Functions with a finding of unavailable are not returned unless you specify the <code>filter</code>
     *        parameter with a value of <code>Unavailable</code> in your <code>GetLambdaFunctionRecommendations</code>
     *        request.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFunctionRecommendationFinding
     */

    public LambdaFunctionRecommendation withFinding(LambdaFunctionRecommendationFinding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of the function.
     * </p>
     * <note>
     * <p>
     * Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     * </p>
     * </note>
     * <p>
     * Reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory configuration can
     * be sized down while still meeting the performance requirements of your workload. An over-provisioned function
     * might lead to unnecessary infrastructure cost. This finding reason code is part of the <code>NotOptimized</code>
     * finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory configuration
     * doesn't meet the performance requirements of the workload. An under-provisioned function might lead to poor
     * application performance. This finding reason code is part of the <code>NotOptimized</code> finding
     * classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute Optimizer
     * to generate a recommendation. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     * <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an internal
     * error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason for the finding classification of the function.</p> <note>
     *         <p>
     *         Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     *         </p>
     *         </note>
     *         <p>
     *         Reason codes include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory
     *         configuration can be sized down while still meeting the performance requirements of your workload. An
     *         over-provisioned function might lead to unnecessary infrastructure cost. This finding reason code is part
     *         of the <code>NotOptimized</code> finding classification.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory
     *         configuration doesn't meet the performance requirements of the workload. An under-provisioned function
     *         might lead to poor application performance. This finding reason code is part of the
     *         <code>NotOptimized</code> finding classification.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute
     *         Optimizer to generate a recommendation. For more information, see the <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     *         requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     *         <code>Unavailable</code> finding classification.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an
     *         internal error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     *         </p>
     *         </li>
     * @see LambdaFunctionRecommendationFindingReasonCode
     */

    public java.util.List<String> getFindingReasonCodes() {
        return findingReasonCodes;
    }

    /**
     * <p>
     * The reason for the finding classification of the function.
     * </p>
     * <note>
     * <p>
     * Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     * </p>
     * </note>
     * <p>
     * Reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory configuration can
     * be sized down while still meeting the performance requirements of your workload. An over-provisioned function
     * might lead to unnecessary infrastructure cost. This finding reason code is part of the <code>NotOptimized</code>
     * finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory configuration
     * doesn't meet the performance requirements of the workload. An under-provisioned function might lead to poor
     * application performance. This finding reason code is part of the <code>NotOptimized</code> finding
     * classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute Optimizer
     * to generate a recommendation. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     * <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an internal
     * error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification of the function.</p> <note>
     *        <p>
     *        Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     *        </p>
     *        </note>
     *        <p>
     *        Reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory
     *        configuration can be sized down while still meeting the performance requirements of your workload. An
     *        over-provisioned function might lead to unnecessary infrastructure cost. This finding reason code is part
     *        of the <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory
     *        configuration doesn't meet the performance requirements of the workload. An under-provisioned function
     *        might lead to poor application performance. This finding reason code is part of the
     *        <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute
     *        Optimizer to generate a recommendation. For more information, see the <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     *        requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     *        <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an
     *        internal error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     * @see LambdaFunctionRecommendationFindingReasonCode
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
     * The reason for the finding classification of the function.
     * </p>
     * <note>
     * <p>
     * Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     * </p>
     * </note>
     * <p>
     * Reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory configuration can
     * be sized down while still meeting the performance requirements of your workload. An over-provisioned function
     * might lead to unnecessary infrastructure cost. This finding reason code is part of the <code>NotOptimized</code>
     * finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory configuration
     * doesn't meet the performance requirements of the workload. An under-provisioned function might lead to poor
     * application performance. This finding reason code is part of the <code>NotOptimized</code> finding
     * classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute Optimizer
     * to generate a recommendation. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     * <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an internal
     * error. This finding reason code is part of the <code>Unavailable</code> finding classification.
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
     *        The reason for the finding classification of the function.</p> <note>
     *        <p>
     *        Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     *        </p>
     *        </note>
     *        <p>
     *        Reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory
     *        configuration can be sized down while still meeting the performance requirements of your workload. An
     *        over-provisioned function might lead to unnecessary infrastructure cost. This finding reason code is part
     *        of the <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory
     *        configuration doesn't meet the performance requirements of the workload. An under-provisioned function
     *        might lead to poor application performance. This finding reason code is part of the
     *        <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute
     *        Optimizer to generate a recommendation. For more information, see the <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     *        requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     *        <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an
     *        internal error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFunctionRecommendationFindingReasonCode
     */

    public LambdaFunctionRecommendation withFindingReasonCodes(String... findingReasonCodes) {
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
     * The reason for the finding classification of the function.
     * </p>
     * <note>
     * <p>
     * Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     * </p>
     * </note>
     * <p>
     * Reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory configuration can
     * be sized down while still meeting the performance requirements of your workload. An over-provisioned function
     * might lead to unnecessary infrastructure cost. This finding reason code is part of the <code>NotOptimized</code>
     * finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory configuration
     * doesn't meet the performance requirements of the workload. An under-provisioned function might lead to poor
     * application performance. This finding reason code is part of the <code>NotOptimized</code> finding
     * classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute Optimizer
     * to generate a recommendation. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     * <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an internal
     * error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification of the function.</p> <note>
     *        <p>
     *        Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     *        </p>
     *        </note>
     *        <p>
     *        Reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory
     *        configuration can be sized down while still meeting the performance requirements of your workload. An
     *        over-provisioned function might lead to unnecessary infrastructure cost. This finding reason code is part
     *        of the <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory
     *        configuration doesn't meet the performance requirements of the workload. An under-provisioned function
     *        might lead to poor application performance. This finding reason code is part of the
     *        <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute
     *        Optimizer to generate a recommendation. For more information, see the <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     *        requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     *        <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an
     *        internal error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFunctionRecommendationFindingReasonCode
     */

    public LambdaFunctionRecommendation withFindingReasonCodes(java.util.Collection<String> findingReasonCodes) {
        setFindingReasonCodes(findingReasonCodes);
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of the function.
     * </p>
     * <note>
     * <p>
     * Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     * </p>
     * </note>
     * <p>
     * Reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory configuration can
     * be sized down while still meeting the performance requirements of your workload. An over-provisioned function
     * might lead to unnecessary infrastructure cost. This finding reason code is part of the <code>NotOptimized</code>
     * finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory configuration
     * doesn't meet the performance requirements of the workload. An under-provisioned function might lead to poor
     * application performance. This finding reason code is part of the <code>NotOptimized</code> finding
     * classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute Optimizer
     * to generate a recommendation. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     * <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an internal
     * error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification of the function.</p> <note>
     *        <p>
     *        Functions that have a finding classification of <code>Optimized</code> don't have a finding reason code.
     *        </p>
     *        </note>
     *        <p>
     *        Reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The function is over-provisioned when its memory
     *        configuration can be sized down while still meeting the performance requirements of your workload. An
     *        over-provisioned function might lead to unnecessary infrastructure cost. This finding reason code is part
     *        of the <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The function is under-provisioned when its memory
     *        configuration doesn't meet the performance requirements of the workload. An under-provisioned function
     *        might lead to poor application performance. This finding reason code is part of the
     *        <code>NotOptimized</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InsufficientData</code> </b> — The function does not have sufficient metric data for Compute
     *        Optimizer to generate a recommendation. For more information, see the <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     *        requirements</a> in the <i>AWS Compute Optimizer User Guide</i>. This finding reason code is part of the
     *        <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Inconclusive</code> </b> — The function does not qualify for a recommendation, or there was an
     *        internal error. This finding reason code is part of the <code>Unavailable</code> finding classification.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFunctionRecommendationFindingReasonCode
     */

    public LambdaFunctionRecommendation withFindingReasonCodes(LambdaFunctionRecommendationFindingReasonCode... findingReasonCodes) {
        java.util.ArrayList<String> findingReasonCodesCopy = new java.util.ArrayList<String>(findingReasonCodes.length);
        for (LambdaFunctionRecommendationFindingReasonCode value : findingReasonCodes) {
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
     * An array of objects that describe the memory configuration recommendation options for the function.
     * </p>
     * 
     * @return An array of objects that describe the memory configuration recommendation options for the function.
     */

    public java.util.List<LambdaFunctionMemoryRecommendationOption> getMemorySizeRecommendationOptions() {
        return memorySizeRecommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the memory configuration recommendation options for the function.
     * </p>
     * 
     * @param memorySizeRecommendationOptions
     *        An array of objects that describe the memory configuration recommendation options for the function.
     */

    public void setMemorySizeRecommendationOptions(java.util.Collection<LambdaFunctionMemoryRecommendationOption> memorySizeRecommendationOptions) {
        if (memorySizeRecommendationOptions == null) {
            this.memorySizeRecommendationOptions = null;
            return;
        }

        this.memorySizeRecommendationOptions = new java.util.ArrayList<LambdaFunctionMemoryRecommendationOption>(memorySizeRecommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the memory configuration recommendation options for the function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemorySizeRecommendationOptions(java.util.Collection)} or
     * {@link #withMemorySizeRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param memorySizeRecommendationOptions
     *        An array of objects that describe the memory configuration recommendation options for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withMemorySizeRecommendationOptions(LambdaFunctionMemoryRecommendationOption... memorySizeRecommendationOptions) {
        if (this.memorySizeRecommendationOptions == null) {
            setMemorySizeRecommendationOptions(new java.util.ArrayList<LambdaFunctionMemoryRecommendationOption>(memorySizeRecommendationOptions.length));
        }
        for (LambdaFunctionMemoryRecommendationOption ele : memorySizeRecommendationOptions) {
            this.memorySizeRecommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the memory configuration recommendation options for the function.
     * </p>
     * 
     * @param memorySizeRecommendationOptions
     *        An array of objects that describe the memory configuration recommendation options for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecommendation withMemorySizeRecommendationOptions(
            java.util.Collection<LambdaFunctionMemoryRecommendationOption> memorySizeRecommendationOptions) {
        setMemorySizeRecommendationOptions(memorySizeRecommendationOptions);
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: ").append(getFunctionVersion()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCurrentMemorySize() != null)
            sb.append("CurrentMemorySize: ").append(getCurrentMemorySize()).append(",");
        if (getNumberOfInvocations() != null)
            sb.append("NumberOfInvocations: ").append(getNumberOfInvocations()).append(",");
        if (getUtilizationMetrics() != null)
            sb.append("UtilizationMetrics: ").append(getUtilizationMetrics()).append(",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays()).append(",");
        if (getLastRefreshTimestamp() != null)
            sb.append("LastRefreshTimestamp: ").append(getLastRefreshTimestamp()).append(",");
        if (getFinding() != null)
            sb.append("Finding: ").append(getFinding()).append(",");
        if (getFindingReasonCodes() != null)
            sb.append("FindingReasonCodes: ").append(getFindingReasonCodes()).append(",");
        if (getMemorySizeRecommendationOptions() != null)
            sb.append("MemorySizeRecommendationOptions: ").append(getMemorySizeRecommendationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionRecommendation == false)
            return false;
        LambdaFunctionRecommendation other = (LambdaFunctionRecommendation) obj;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCurrentMemorySize() == null ^ this.getCurrentMemorySize() == null)
            return false;
        if (other.getCurrentMemorySize() != null && other.getCurrentMemorySize().equals(this.getCurrentMemorySize()) == false)
            return false;
        if (other.getNumberOfInvocations() == null ^ this.getNumberOfInvocations() == null)
            return false;
        if (other.getNumberOfInvocations() != null && other.getNumberOfInvocations().equals(this.getNumberOfInvocations()) == false)
            return false;
        if (other.getUtilizationMetrics() == null ^ this.getUtilizationMetrics() == null)
            return false;
        if (other.getUtilizationMetrics() != null && other.getUtilizationMetrics().equals(this.getUtilizationMetrics()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
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
        if (other.getMemorySizeRecommendationOptions() == null ^ this.getMemorySizeRecommendationOptions() == null)
            return false;
        if (other.getMemorySizeRecommendationOptions() != null
                && other.getMemorySizeRecommendationOptions().equals(this.getMemorySizeRecommendationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCurrentMemorySize() == null) ? 0 : getCurrentMemorySize().hashCode());
        hashCode = prime * hashCode + ((getNumberOfInvocations() == null) ? 0 : getNumberOfInvocations().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getFindingReasonCodes() == null) ? 0 : getFindingReasonCodes().hashCode());
        hashCode = prime * hashCode + ((getMemorySizeRecommendationOptions() == null) ? 0 : getMemorySizeRecommendationOptions().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionRecommendation clone() {
        try {
            return (LambdaFunctionRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.LambdaFunctionRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
