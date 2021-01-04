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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateUsageLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUsageLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster that you want to limit usage.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The Amazon Redshift feature that you want to limit.
     * </p>
     */
    private String featureType;
    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     * <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be <code>data-scanned</code>.
     * If <code>FeatureType</code> is <code>concurrency-scaling</code>, then <code>LimitType</code> must be
     * <code>time</code>.
     * </p>
     */
    private String limitType;
    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The
     * value must be a positive number.
     * </p>
     */
    private Long amount;
    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     * <code>monthly</code>.
     * </p>
     */
    private String period;
    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. The default is log. For more information about
     * this parameter, see <a>UsageLimit</a>.
     * </p>
     */
    private String breachAction;
    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier of the cluster that you want to limit usage.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster that you want to limit usage.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that you want to limit usage.
     * </p>
     * 
     * @return The identifier of the cluster that you want to limit usage.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that you want to limit usage.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster that you want to limit usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageLimitRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift feature that you want to limit.
     * </p>
     * 
     * @param featureType
     *        The Amazon Redshift feature that you want to limit.
     * @see UsageLimitFeatureType
     */

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * The Amazon Redshift feature that you want to limit.
     * </p>
     * 
     * @return The Amazon Redshift feature that you want to limit.
     * @see UsageLimitFeatureType
     */

    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * <p>
     * The Amazon Redshift feature that you want to limit.
     * </p>
     * 
     * @param featureType
     *        The Amazon Redshift feature that you want to limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitFeatureType
     */

    public CreateUsageLimitRequest withFeatureType(String featureType) {
        setFeatureType(featureType);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift feature that you want to limit.
     * </p>
     * 
     * @param featureType
     *        The Amazon Redshift feature that you want to limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitFeatureType
     */

    public CreateUsageLimitRequest withFeatureType(UsageLimitFeatureType featureType) {
        this.featureType = featureType.toString();
        return this;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     * <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be <code>data-scanned</code>.
     * If <code>FeatureType</code> is <code>concurrency-scaling</code>, then <code>LimitType</code> must be
     * <code>time</code>.
     * </p>
     * 
     * @param limitType
     *        The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     *        <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be
     *        <code>data-scanned</code>. If <code>FeatureType</code> is <code>concurrency-scaling</code>, then
     *        <code>LimitType</code> must be <code>time</code>.
     * @see UsageLimitLimitType
     */

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     * <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be <code>data-scanned</code>.
     * If <code>FeatureType</code> is <code>concurrency-scaling</code>, then <code>LimitType</code> must be
     * <code>time</code>.
     * </p>
     * 
     * @return The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     *         <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be
     *         <code>data-scanned</code>. If <code>FeatureType</code> is <code>concurrency-scaling</code>, then
     *         <code>LimitType</code> must be <code>time</code>.
     * @see UsageLimitLimitType
     */

    public String getLimitType() {
        return this.limitType;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     * <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be <code>data-scanned</code>.
     * If <code>FeatureType</code> is <code>concurrency-scaling</code>, then <code>LimitType</code> must be
     * <code>time</code>.
     * </p>
     * 
     * @param limitType
     *        The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     *        <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be
     *        <code>data-scanned</code>. If <code>FeatureType</code> is <code>concurrency-scaling</code>, then
     *        <code>LimitType</code> must be <code>time</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitLimitType
     */

    public CreateUsageLimitRequest withLimitType(String limitType) {
        setLimitType(limitType);
        return this;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     * <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be <code>data-scanned</code>.
     * If <code>FeatureType</code> is <code>concurrency-scaling</code>, then <code>LimitType</code> must be
     * <code>time</code>.
     * </p>
     * 
     * @param limitType
     *        The type of limit. Depending on the feature type, this can be based on a time duration or data size. If
     *        <code>FeatureType</code> is <code>spectrum</code>, then <code>LimitType</code> must be
     *        <code>data-scanned</code>. If <code>FeatureType</code> is <code>concurrency-scaling</code>, then
     *        <code>LimitType</code> must be <code>time</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitLimitType
     */

    public CreateUsageLimitRequest withLimitType(UsageLimitLimitType limitType) {
        this.limitType = limitType.toString();
        return this;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The
     * value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes
     *        (TB). The value must be a positive number.
     */

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The
     * value must be a positive number.
     * </p>
     * 
     * @return The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes
     *         (TB). The value must be a positive number.
     */

    public Long getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The
     * value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes
     *        (TB). The value must be a positive number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageLimitRequest withAmount(Long amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     * <code>monthly</code>.
     * </p>
     * 
     * @param period
     *        The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     *        <code>monthly</code>.
     * @see UsageLimitPeriod
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     * <code>monthly</code>.
     * </p>
     * 
     * @return The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     *         <code>monthly</code>.
     * @see UsageLimitPeriod
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     * <code>monthly</code>.
     * </p>
     * 
     * @param period
     *        The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     *        <code>monthly</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitPeriod
     */

    public CreateUsageLimitRequest withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     * <code>monthly</code>.
     * </p>
     * 
     * @param period
     *        The time period that the amount applies to. A <code>weekly</code> period begins on Sunday. The default is
     *        <code>monthly</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitPeriod
     */

    public CreateUsageLimitRequest withPeriod(UsageLimitPeriod period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. The default is log. For more information about
     * this parameter, see <a>UsageLimit</a>.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift takes when the limit is reached. The default is log. For more information
     *        about this parameter, see <a>UsageLimit</a>.
     * @see UsageLimitBreachAction
     */

    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. The default is log. For more information about
     * this parameter, see <a>UsageLimit</a>.
     * </p>
     * 
     * @return The action that Amazon Redshift takes when the limit is reached. The default is log. For more information
     *         about this parameter, see <a>UsageLimit</a>.
     * @see UsageLimitBreachAction
     */

    public String getBreachAction() {
        return this.breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. The default is log. For more information about
     * this parameter, see <a>UsageLimit</a>.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift takes when the limit is reached. The default is log. For more information
     *        about this parameter, see <a>UsageLimit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public CreateUsageLimitRequest withBreachAction(String breachAction) {
        setBreachAction(breachAction);
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. The default is log. For more information about
     * this parameter, see <a>UsageLimit</a>.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift takes when the limit is reached. The default is log. For more information
     *        about this parameter, see <a>UsageLimit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public CreateUsageLimitRequest withBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageLimitRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageLimitRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getFeatureType() != null)
            sb.append("FeatureType: ").append(getFeatureType()).append(",");
        if (getLimitType() != null)
            sb.append("LimitType: ").append(getLimitType()).append(",");
        if (getAmount() != null)
            sb.append("Amount: ").append(getAmount()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getBreachAction() != null)
            sb.append("BreachAction: ").append(getBreachAction()).append(",");
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

        if (obj instanceof CreateUsageLimitRequest == false)
            return false;
        CreateUsageLimitRequest other = (CreateUsageLimitRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getFeatureType() == null ^ this.getFeatureType() == null)
            return false;
        if (other.getFeatureType() != null && other.getFeatureType().equals(this.getFeatureType()) == false)
            return false;
        if (other.getLimitType() == null ^ this.getLimitType() == null)
            return false;
        if (other.getLimitType() != null && other.getLimitType().equals(this.getLimitType()) == false)
            return false;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getBreachAction() == null ^ this.getBreachAction() == null)
            return false;
        if (other.getBreachAction() != null && other.getBreachAction().equals(this.getBreachAction()) == false)
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

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFeatureType() == null) ? 0 : getFeatureType().hashCode());
        hashCode = prime * hashCode + ((getLimitType() == null) ? 0 : getLimitType().hashCode());
        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getBreachAction() == null) ? 0 : getBreachAction().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateUsageLimitRequest clone() {
        return (CreateUsageLimitRequest) super.clone();
    }

}
