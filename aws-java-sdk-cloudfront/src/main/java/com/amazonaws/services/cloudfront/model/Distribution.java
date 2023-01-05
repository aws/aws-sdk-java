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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A distribution tells CloudFront where you want content to be delivered from, and the details about how to track and
 * manage content delivery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/Distribution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Distribution implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The distribution's Amazon Resource Name (ARN).
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The distribution's status. When the status is <code>Deployed</code>, the distribution's information is fully
     * propagated to all CloudFront edge locations.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time when the distribution was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     */
    private Integer inProgressInvalidationBatches;
    /**
     * <p>
     * The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private String domainName;
    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each account
     * that CloudFront can use to verify the signatures of signed URLs or signed cookies.
     * </p>
     */
    private ActiveTrustedSigners activeTrustedSigners;
    /**
     * <p>
     * This field contains a list of key groups and the public keys in each key group that CloudFront can use to verify
     * the signatures of signed URLs or signed cookies.
     * </p>
     */
    private ActiveTrustedKeyGroups activeTrustedKeyGroups;
    /**
     * <p>
     * The distribution's configuration.
     * </p>
     */
    private DistributionConfig distributionConfig;
    /**
     * <p>
     * Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal if they
     * want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a
     * href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup, Accounts, and
     * Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AliasICPRecordal> aliasICPRecordals;

    /**
     * Default constructor for Distribution object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Distribution() {
    }

    /**
     * Constructs a new Distribution object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     *        The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     * @param status
     *        The distribution's status. When the status is <code>Deployed</code>, the distribution's information is
     *        fully propagated to all CloudFront edge locations.
     * @param domainName
     *        The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     */
    public Distribution(String id, String status, String domainName) {
        setId(id);
        setStatus(status);
        setDomainName(domainName);
    }

    /**
     * <p>
     * The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     * </p>
     * 
     * @param id
     *        The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     * </p>
     * 
     * @return The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     * </p>
     * 
     * @param id
     *        The distribution's identifier. For example: <code>E1U5RQF7T870K0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The distribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param aRN
     *        The distribution's Amazon Resource Name (ARN).
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The distribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The distribution's Amazon Resource Name (ARN).
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The distribution's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param aRN
     *        The distribution's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The distribution's status. When the status is <code>Deployed</code>, the distribution's information is fully
     * propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        The distribution's status. When the status is <code>Deployed</code>, the distribution's information is
     *        fully propagated to all CloudFront edge locations.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The distribution's status. When the status is <code>Deployed</code>, the distribution's information is fully
     * propagated to all CloudFront edge locations.
     * </p>
     * 
     * @return The distribution's status. When the status is <code>Deployed</code>, the distribution's information is
     *         fully propagated to all CloudFront edge locations.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The distribution's status. When the status is <code>Deployed</code>, the distribution's information is fully
     * propagated to all CloudFront edge locations.
     * </p>
     * 
     * @param status
     *        The distribution's status. When the status is <code>Deployed</code>, the distribution's information is
     *        fully propagated to all CloudFront edge locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time when the distribution was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the distribution was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the distribution was last modified.
     * </p>
     * 
     * @return The date and time when the distribution was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the distribution was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the distribution was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     * 
     * @param inProgressInvalidationBatches
     *        The number of invalidation batches currently in progress.
     */

    public void setInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        this.inProgressInvalidationBatches = inProgressInvalidationBatches;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     * 
     * @return The number of invalidation batches currently in progress.
     */

    public Integer getInProgressInvalidationBatches() {
        return this.inProgressInvalidationBatches;
    }

    /**
     * <p>
     * The number of invalidation batches currently in progress.
     * </p>
     * 
     * @param inProgressInvalidationBatches
     *        The number of invalidation batches currently in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        setInProgressInvalidationBatches(inProgressInvalidationBatches);
        return this;
    }

    /**
     * <p>
     * The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @return The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param domainName
     *        The distribution's CloudFront domain name. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each account
     * that CloudFront can use to verify the signatures of signed URLs or signed cookies.
     * </p>
     * 
     * @param activeTrustedSigners
     *        <p>
     *        We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     *        </p>
     *        </important>
     *        <p>
     *        This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each
     *        account that CloudFront can use to verify the signatures of signed URLs or signed cookies.
     */

    public void setActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
    }

    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each account
     * that CloudFront can use to verify the signatures of signed URLs or signed cookies.
     * </p>
     * 
     * @return <p>
     *         We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     *         </p>
     *         </important>
     *         <p>
     *         This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each
     *         account that CloudFront can use to verify the signatures of signed URLs or signed cookies.
     */

    public ActiveTrustedSigners getActiveTrustedSigners() {
        return this.activeTrustedSigners;
    }

    /**
     * <important>
     * <p>
     * We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     * </p>
     * </important>
     * <p>
     * This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each account
     * that CloudFront can use to verify the signatures of signed URLs or signed cookies.
     * </p>
     * 
     * @param activeTrustedSigners
     *        <p>
     *        We recommend using <code>TrustedKeyGroups</code> instead of <code>TrustedSigners</code>.
     *        </p>
     *        </important>
     *        <p>
     *        This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each
     *        account that CloudFront can use to verify the signatures of signed URLs or signed cookies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        setActiveTrustedSigners(activeTrustedSigners);
        return this;
    }

    /**
     * <p>
     * This field contains a list of key groups and the public keys in each key group that CloudFront can use to verify
     * the signatures of signed URLs or signed cookies.
     * </p>
     * 
     * @param activeTrustedKeyGroups
     *        This field contains a list of key groups and the public keys in each key group that CloudFront can use to
     *        verify the signatures of signed URLs or signed cookies.
     */

    public void setActiveTrustedKeyGroups(ActiveTrustedKeyGroups activeTrustedKeyGroups) {
        this.activeTrustedKeyGroups = activeTrustedKeyGroups;
    }

    /**
     * <p>
     * This field contains a list of key groups and the public keys in each key group that CloudFront can use to verify
     * the signatures of signed URLs or signed cookies.
     * </p>
     * 
     * @return This field contains a list of key groups and the public keys in each key group that CloudFront can use to
     *         verify the signatures of signed URLs or signed cookies.
     */

    public ActiveTrustedKeyGroups getActiveTrustedKeyGroups() {
        return this.activeTrustedKeyGroups;
    }

    /**
     * <p>
     * This field contains a list of key groups and the public keys in each key group that CloudFront can use to verify
     * the signatures of signed URLs or signed cookies.
     * </p>
     * 
     * @param activeTrustedKeyGroups
     *        This field contains a list of key groups and the public keys in each key group that CloudFront can use to
     *        verify the signatures of signed URLs or signed cookies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withActiveTrustedKeyGroups(ActiveTrustedKeyGroups activeTrustedKeyGroups) {
        setActiveTrustedKeyGroups(activeTrustedKeyGroups);
        return this;
    }

    /**
     * <p>
     * The distribution's configuration.
     * </p>
     * 
     * @param distributionConfig
     *        The distribution's configuration.
     */

    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration.
     * </p>
     * 
     * @return The distribution's configuration.
     */

    public DistributionConfig getDistributionConfig() {
        return this.distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration.
     * </p>
     * 
     * @param distributionConfig
     *        The distribution's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withDistributionConfig(DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal if they
     * want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a
     * href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup, Accounts, and
     * Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     * </p>
     * 
     * @return Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal
     *         if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've
     *         added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with
     *         distributions.</p>
     *         <p>
     *         For more information about ICP recordals, see <a
     *         href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup,
     *         Accounts, and Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     */

    public java.util.List<AliasICPRecordal> getAliasICPRecordals() {
        if (aliasICPRecordals == null) {
            aliasICPRecordals = new com.amazonaws.internal.SdkInternalList<AliasICPRecordal>();
        }
        return aliasICPRecordals;
    }

    /**
     * <p>
     * Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal if they
     * want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a
     * href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup, Accounts, and
     * Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     * </p>
     * 
     * @param aliasICPRecordals
     *        Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal
     *        if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've
     *        added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with
     *        distributions.</p>
     *        <p>
     *        For more information about ICP recordals, see <a
     *        href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup,
     *        Accounts, and Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     */

    public void setAliasICPRecordals(java.util.Collection<AliasICPRecordal> aliasICPRecordals) {
        if (aliasICPRecordals == null) {
            this.aliasICPRecordals = null;
            return;
        }

        this.aliasICPRecordals = new com.amazonaws.internal.SdkInternalList<AliasICPRecordal>(aliasICPRecordals);
    }

    /**
     * <p>
     * Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal if they
     * want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a
     * href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup, Accounts, and
     * Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliasICPRecordals(java.util.Collection)} or {@link #withAliasICPRecordals(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param aliasICPRecordals
     *        Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal
     *        if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've
     *        added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with
     *        distributions.</p>
     *        <p>
     *        For more information about ICP recordals, see <a
     *        href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup,
     *        Accounts, and Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withAliasICPRecordals(AliasICPRecordal... aliasICPRecordals) {
        if (this.aliasICPRecordals == null) {
            setAliasICPRecordals(new com.amazonaws.internal.SdkInternalList<AliasICPRecordal>(aliasICPRecordals.length));
        }
        for (AliasICPRecordal ele : aliasICPRecordals) {
            this.aliasICPRecordals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal if they
     * want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to
     * CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions.
     * </p>
     * <p>
     * For more information about ICP recordals, see <a
     * href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup, Accounts, and
     * Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     * </p>
     * 
     * @param aliasICPRecordals
     *        Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal
     *        if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've
     *        added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with
     *        distributions.</p>
     *        <p>
     *        For more information about ICP recordals, see <a
     *        href="https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html"> Signup,
     *        Accounts, and Credentials</a> in <i>Getting Started with Amazon Web Services services in China</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Distribution withAliasICPRecordals(java.util.Collection<AliasICPRecordal> aliasICPRecordals) {
        setAliasICPRecordals(aliasICPRecordals);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getInProgressInvalidationBatches() != null)
            sb.append("InProgressInvalidationBatches: ").append(getInProgressInvalidationBatches()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getActiveTrustedSigners() != null)
            sb.append("ActiveTrustedSigners: ").append(getActiveTrustedSigners()).append(",");
        if (getActiveTrustedKeyGroups() != null)
            sb.append("ActiveTrustedKeyGroups: ").append(getActiveTrustedKeyGroups()).append(",");
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: ").append(getDistributionConfig()).append(",");
        if (getAliasICPRecordals() != null)
            sb.append("AliasICPRecordals: ").append(getAliasICPRecordals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Distribution == false)
            return false;
        Distribution other = (Distribution) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getInProgressInvalidationBatches() == null ^ this.getInProgressInvalidationBatches() == null)
            return false;
        if (other.getInProgressInvalidationBatches() != null
                && other.getInProgressInvalidationBatches().equals(this.getInProgressInvalidationBatches()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveTrustedSigners() == null ^ this.getActiveTrustedSigners() == null)
            return false;
        if (other.getActiveTrustedSigners() != null && other.getActiveTrustedSigners().equals(this.getActiveTrustedSigners()) == false)
            return false;
        if (other.getActiveTrustedKeyGroups() == null ^ this.getActiveTrustedKeyGroups() == null)
            return false;
        if (other.getActiveTrustedKeyGroups() != null && other.getActiveTrustedKeyGroups().equals(this.getActiveTrustedKeyGroups()) == false)
            return false;
        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null && other.getDistributionConfig().equals(this.getDistributionConfig()) == false)
            return false;
        if (other.getAliasICPRecordals() == null ^ this.getAliasICPRecordals() == null)
            return false;
        if (other.getAliasICPRecordals() != null && other.getAliasICPRecordals().equals(this.getAliasICPRecordals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getInProgressInvalidationBatches() == null) ? 0 : getInProgressInvalidationBatches().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getActiveTrustedSigners() == null) ? 0 : getActiveTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getActiveTrustedKeyGroups() == null) ? 0 : getActiveTrustedKeyGroups().hashCode());
        hashCode = prime * hashCode + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode());
        hashCode = prime * hashCode + ((getAliasICPRecordals() == null) ? 0 : getAliasICPRecordals().hashCode());
        return hashCode;
    }

    @Override
    public Distribution clone() {
        try {
            return (Distribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
