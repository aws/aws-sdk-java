/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a license recommendation for an EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/LicenseRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN that identifies the Amazon EC2 instance.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Web Services account ID of the license.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An object that describes the current configuration of an instance that runs on a license.
     * </p>
     */
    private LicenseConfiguration currentLicenseConfiguration;
    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for an instance that runs on a license.
     * </p>
     */
    private Double lookbackPeriodInDays;
    /**
     * <p>
     * The timestamp of when the license recommendation was last generated.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;
    /**
     * <p>
     * The finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Findings include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights isn't
     * enabled or is enabled with insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of the
     * SQL server license features you're paying for, a license is considered not optimized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     * performance requirements of your workload.
     * </p>
     * </li>
     * </ul>
     */
    private String finding;
    /**
     * <p>
     * The reason for the finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Finding reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Optimized</code> — All specifications of your license meet the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     * downgraded while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> findingReasonCodes;
    /**
     * <p>
     * An array of objects that describe the license recommendation options.
     * </p>
     */
    private java.util.List<LicenseRecommendationOption> licenseRecommendationOptions;
    /**
     * <p>
     * A list of tags assigned to an EC2 instance.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN that identifies the Amazon EC2 instance.
     * </p>
     * 
     * @param resourceArn
     *        The ARN that identifies the Amazon EC2 instance.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN that identifies the Amazon EC2 instance.
     * </p>
     * 
     * @return The ARN that identifies the Amazon EC2 instance.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN that identifies the Amazon EC2 instance.
     * </p>
     * 
     * @param resourceArn
     *        The ARN that identifies the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the license.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the license.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the license.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the license.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the license.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An object that describes the current configuration of an instance that runs on a license.
     * </p>
     * 
     * @param currentLicenseConfiguration
     *        An object that describes the current configuration of an instance that runs on a license.
     */

    public void setCurrentLicenseConfiguration(LicenseConfiguration currentLicenseConfiguration) {
        this.currentLicenseConfiguration = currentLicenseConfiguration;
    }

    /**
     * <p>
     * An object that describes the current configuration of an instance that runs on a license.
     * </p>
     * 
     * @return An object that describes the current configuration of an instance that runs on a license.
     */

    public LicenseConfiguration getCurrentLicenseConfiguration() {
        return this.currentLicenseConfiguration;
    }

    /**
     * <p>
     * An object that describes the current configuration of an instance that runs on a license.
     * </p>
     * 
     * @param currentLicenseConfiguration
     *        An object that describes the current configuration of an instance that runs on a license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withCurrentLicenseConfiguration(LicenseConfiguration currentLicenseConfiguration) {
        setCurrentLicenseConfiguration(currentLicenseConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for an instance that runs on a license.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for an instance that runs on a license.
     */

    public void setLookbackPeriodInDays(Double lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for an instance that runs on a license.
     * </p>
     * 
     * @return The number of days for which utilization metrics were analyzed for an instance that runs on a license.
     */

    public Double getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days for which utilization metrics were analyzed for an instance that runs on a license.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days for which utilization metrics were analyzed for an instance that runs on a license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withLookbackPeriodInDays(Double lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the license recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The timestamp of when the license recommendation was last generated.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the license recommendation was last generated.
     * </p>
     * 
     * @return The timestamp of when the license recommendation was last generated.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the license recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The timestamp of when the license recommendation was last generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        setLastRefreshTimestamp(lastRefreshTimestamp);
        return this;
    }

    /**
     * <p>
     * The finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Findings include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights isn't
     * enabled or is enabled with insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of the
     * SQL server license features you're paying for, a license is considered not optimized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     * performance requirements of your workload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification for an instance that runs on a license. </p>
     *        <p>
     *        Findings include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights
     *        isn't enabled or is enabled with insufficient permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of
     *        the SQL server license features you're paying for, a license is considered not optimized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     *        performance requirements of your workload.
     *        </p>
     *        </li>
     * @see LicenseFinding
     */

    public void setFinding(String finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * The finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Findings include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights isn't
     * enabled or is enabled with insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of the
     * SQL server license features you're paying for, a license is considered not optimized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     * performance requirements of your workload.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The finding classification for an instance that runs on a license. </p>
     *         <p>
     *         Findings include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application
     *         Insights isn't enabled or is enabled with insufficient permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any
     *         of the SQL server license features you're paying for, a license is considered not optimized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     *         performance requirements of your workload.
     *         </p>
     *         </li>
     * @see LicenseFinding
     */

    public String getFinding() {
        return this.finding;
    }

    /**
     * <p>
     * The finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Findings include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights isn't
     * enabled or is enabled with insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of the
     * SQL server license features you're paying for, a license is considered not optimized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     * performance requirements of your workload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification for an instance that runs on a license. </p>
     *        <p>
     *        Findings include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights
     *        isn't enabled or is enabled with insufficient permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of
     *        the SQL server license features you're paying for, a license is considered not optimized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     *        performance requirements of your workload.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseFinding
     */

    public LicenseRecommendation withFinding(String finding) {
        setFinding(finding);
        return this;
    }

    /**
     * <p>
     * The finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Findings include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights isn't
     * enabled or is enabled with insufficient permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of the
     * SQL server license features you're paying for, a license is considered not optimized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     * performance requirements of your workload.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finding
     *        The finding classification for an instance that runs on a license. </p>
     *        <p>
     *        Findings include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InsufficentMetrics</code> — When Compute Optimizer detects that your CloudWatch Application Insights
     *        isn't enabled or is enabled with insufficient permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotOptimized</code> — When Compute Optimizer detects that your EC2 infrastructure isn't using any of
     *        the SQL server license features you're paying for, a license is considered not optimized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Optimized</code> — When Compute Optimizer detects that all specifications of your license meet the
     *        performance requirements of your workload.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseFinding
     */

    public LicenseRecommendation withFinding(LicenseFinding finding) {
        this.finding = finding.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Finding reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Optimized</code> — All specifications of your license meet the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     * downgraded while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason for the finding classification for an instance that runs on a license. </p>
     *         <p>
     *         Finding reason codes include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Optimized</code> — All specifications of your license meet the performance requirements of your
     *         workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     *         downgraded while still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured
     *         properly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     *         </p>
     *         </li>
     * @see LicenseFindingReasonCode
     */

    public java.util.List<String> getFindingReasonCodes() {
        return findingReasonCodes;
    }

    /**
     * <p>
     * The reason for the finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Finding reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Optimized</code> — All specifications of your license meet the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     * downgraded while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification for an instance that runs on a license. </p>
     *        <p>
     *        Finding reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Optimized</code> — All specifications of your license meet the performance requirements of your
     *        workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     *        downgraded while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured
     *        properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     *        </p>
     *        </li>
     * @see LicenseFindingReasonCode
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
     * The reason for the finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Finding reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Optimized</code> — All specifications of your license meet the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     * downgraded while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
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
     *        The reason for the finding classification for an instance that runs on a license. </p>
     *        <p>
     *        Finding reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Optimized</code> — All specifications of your license meet the performance requirements of your
     *        workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     *        downgraded while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured
     *        properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseFindingReasonCode
     */

    public LicenseRecommendation withFindingReasonCodes(String... findingReasonCodes) {
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
     * The reason for the finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Finding reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Optimized</code> — All specifications of your license meet the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     * downgraded while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification for an instance that runs on a license. </p>
     *        <p>
     *        Finding reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Optimized</code> — All specifications of your license meet the performance requirements of your
     *        workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     *        downgraded while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured
     *        properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseFindingReasonCode
     */

    public LicenseRecommendation withFindingReasonCodes(java.util.Collection<String> findingReasonCodes) {
        setFindingReasonCodes(findingReasonCodes);
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification for an instance that runs on a license.
     * </p>
     * <p>
     * Finding reason codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Optimized</code> — All specifications of your license meet the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     * downgraded while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param findingReasonCodes
     *        The reason for the finding classification for an instance that runs on a license. </p>
     *        <p>
     *        Finding reason codes include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Optimized</code> — All specifications of your license meet the performance requirements of your
     *        workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LicenseOverprovisioned</code> — A license is considered over-provisioned when your license can be
     *        downgraded while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidCloudwatchApplicationInsights</code> — CloudWatch Application Insights isn't configured
     *        properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CloudwatchApplicationInsightsError</code> — There is a CloudWatch Application Insights error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseFindingReasonCode
     */

    public LicenseRecommendation withFindingReasonCodes(LicenseFindingReasonCode... findingReasonCodes) {
        java.util.ArrayList<String> findingReasonCodesCopy = new java.util.ArrayList<String>(findingReasonCodes.length);
        for (LicenseFindingReasonCode value : findingReasonCodes) {
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
     * An array of objects that describe the license recommendation options.
     * </p>
     * 
     * @return An array of objects that describe the license recommendation options.
     */

    public java.util.List<LicenseRecommendationOption> getLicenseRecommendationOptions() {
        return licenseRecommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the license recommendation options.
     * </p>
     * 
     * @param licenseRecommendationOptions
     *        An array of objects that describe the license recommendation options.
     */

    public void setLicenseRecommendationOptions(java.util.Collection<LicenseRecommendationOption> licenseRecommendationOptions) {
        if (licenseRecommendationOptions == null) {
            this.licenseRecommendationOptions = null;
            return;
        }

        this.licenseRecommendationOptions = new java.util.ArrayList<LicenseRecommendationOption>(licenseRecommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the license recommendation options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseRecommendationOptions(java.util.Collection)} or
     * {@link #withLicenseRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseRecommendationOptions
     *        An array of objects that describe the license recommendation options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withLicenseRecommendationOptions(LicenseRecommendationOption... licenseRecommendationOptions) {
        if (this.licenseRecommendationOptions == null) {
            setLicenseRecommendationOptions(new java.util.ArrayList<LicenseRecommendationOption>(licenseRecommendationOptions.length));
        }
        for (LicenseRecommendationOption ele : licenseRecommendationOptions) {
            this.licenseRecommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the license recommendation options.
     * </p>
     * 
     * @param licenseRecommendationOptions
     *        An array of objects that describe the license recommendation options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withLicenseRecommendationOptions(java.util.Collection<LicenseRecommendationOption> licenseRecommendationOptions) {
        setLicenseRecommendationOptions(licenseRecommendationOptions);
        return this;
    }

    /**
     * <p>
     * A list of tags assigned to an EC2 instance.
     * </p>
     * 
     * @return A list of tags assigned to an EC2 instance.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags assigned to an EC2 instance.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to an EC2 instance.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags assigned to an EC2 instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags assigned to an EC2 instance.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseRecommendation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCurrentLicenseConfiguration() != null)
            sb.append("CurrentLicenseConfiguration: ").append(getCurrentLicenseConfiguration()).append(",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays()).append(",");
        if (getLastRefreshTimestamp() != null)
            sb.append("LastRefreshTimestamp: ").append(getLastRefreshTimestamp()).append(",");
        if (getFinding() != null)
            sb.append("Finding: ").append(getFinding()).append(",");
        if (getFindingReasonCodes() != null)
            sb.append("FindingReasonCodes: ").append(getFindingReasonCodes()).append(",");
        if (getLicenseRecommendationOptions() != null)
            sb.append("LicenseRecommendationOptions: ").append(getLicenseRecommendationOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseRecommendation == false)
            return false;
        LicenseRecommendation other = (LicenseRecommendation) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCurrentLicenseConfiguration() == null ^ this.getCurrentLicenseConfiguration() == null)
            return false;
        if (other.getCurrentLicenseConfiguration() != null && other.getCurrentLicenseConfiguration().equals(this.getCurrentLicenseConfiguration()) == false)
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
        if (other.getLicenseRecommendationOptions() == null ^ this.getLicenseRecommendationOptions() == null)
            return false;
        if (other.getLicenseRecommendationOptions() != null && other.getLicenseRecommendationOptions().equals(this.getLicenseRecommendationOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCurrentLicenseConfiguration() == null) ? 0 : getCurrentLicenseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        hashCode = prime * hashCode + ((getFindingReasonCodes() == null) ? 0 : getFindingReasonCodes().hashCode());
        hashCode = prime * hashCode + ((getLicenseRecommendationOptions() == null) ? 0 : getLicenseRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LicenseRecommendation clone() {
        try {
            return (LicenseRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.LicenseRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
