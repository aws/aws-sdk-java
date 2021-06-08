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

/**
 * <p>
 * Describes a usage limit object for a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyUsageLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyUsageLimitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     */
    private String usageLimitId;
    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     */
    private String featureType;
    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * </p>
     */
    private String limitType;
    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB).
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
     * The action that Amazon Redshift takes when the limit is reached. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period begins.
     * </p>
     * </li>
     * </ul>
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
     * The identifier of the usage limit.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit.
     */

    public void setUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     * 
     * @return The identifier of the usage limit.
     */

    public String getUsageLimitId() {
        return this.usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUsageLimitResult withUsageLimitId(String usageLimitId) {
        setUsageLimitId(usageLimitId);
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster with a usage limit.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     * 
     * @return The identifier of the cluster with a usage limit.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster with a usage limit.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster with a usage limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUsageLimitResult withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * 
     * @param featureType
     *        The Amazon Redshift feature to which the limit applies.
     * @see UsageLimitFeatureType
     */

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * 
     * @return The Amazon Redshift feature to which the limit applies.
     * @see UsageLimitFeatureType
     */

    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * 
     * @param featureType
     *        The Amazon Redshift feature to which the limit applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitFeatureType
     */

    public ModifyUsageLimitResult withFeatureType(String featureType) {
        setFeatureType(featureType);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift feature to which the limit applies.
     * </p>
     * 
     * @param featureType
     *        The Amazon Redshift feature to which the limit applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitFeatureType
     */

    public ModifyUsageLimitResult withFeatureType(UsageLimitFeatureType featureType) {
        this.featureType = featureType.toString();
        return this;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * </p>
     * 
     * @param limitType
     *        The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * @see UsageLimitLimitType
     */

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * </p>
     * 
     * @return The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * @see UsageLimitLimitType
     */

    public String getLimitType() {
        return this.limitType;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * </p>
     * 
     * @param limitType
     *        The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitLimitType
     */

    public ModifyUsageLimitResult withLimitType(String limitType) {
        setLimitType(limitType);
        return this;
    }

    /**
     * <p>
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * </p>
     * 
     * @param limitType
     *        The type of limit. Depending on the feature type, this can be based on a time duration or data size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitLimitType
     */

    public ModifyUsageLimitResult withLimitType(UsageLimitLimitType limitType) {
        this.limitType = limitType.toString();
        return this;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB).
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes
     *        (TB).
     */

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB).
     * </p>
     * 
     * @return The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes
     *         (TB).
     */

    public Long getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB).
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes
     *        (TB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUsageLimitResult withAmount(Long amount) {
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

    public ModifyUsageLimitResult withPeriod(String period) {
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

    public ModifyUsageLimitResult withPeriod(UsageLimitPeriod period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period begins.
     * </p>
     * </li>
     * </ul>
     * 
     * @param breachAction
     *        The action that Amazon Redshift takes when the limit is reached. Possible values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>log</b> - To log an event in a system table. The default is log.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>emit-metric</b> - To emit CloudWatch metrics.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>disable</b> - To disable the feature until the next usage period begins.
     *        </p>
     *        </li>
     * @see UsageLimitBreachAction
     */

    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period begins.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The action that Amazon Redshift takes when the limit is reached. Possible values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>log</b> - To log an event in a system table. The default is log.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>emit-metric</b> - To emit CloudWatch metrics.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>disable</b> - To disable the feature until the next usage period begins.
     *         </p>
     *         </li>
     * @see UsageLimitBreachAction
     */

    public String getBreachAction() {
        return this.breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period begins.
     * </p>
     * </li>
     * </ul>
     * 
     * @param breachAction
     *        The action that Amazon Redshift takes when the limit is reached. Possible values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>log</b> - To log an event in a system table. The default is log.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>emit-metric</b> - To emit CloudWatch metrics.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>disable</b> - To disable the feature until the next usage period begins.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public ModifyUsageLimitResult withBreachAction(String breachAction) {
        setBreachAction(breachAction);
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift takes when the limit is reached. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>log</b> - To log an event in a system table. The default is log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>emit-metric</b> - To emit CloudWatch metrics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>disable</b> - To disable the feature until the next usage period begins.
     * </p>
     * </li>
     * </ul>
     * 
     * @param breachAction
     *        The action that Amazon Redshift takes when the limit is reached. Possible values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>log</b> - To log an event in a system table. The default is log.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>emit-metric</b> - To emit CloudWatch metrics.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>disable</b> - To disable the feature until the next usage period begins.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public ModifyUsageLimitResult withBreachAction(UsageLimitBreachAction breachAction) {
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

    public ModifyUsageLimitResult withTags(Tag... tags) {
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

    public ModifyUsageLimitResult withTags(java.util.Collection<Tag> tags) {
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
        if (getUsageLimitId() != null)
            sb.append("UsageLimitId: ").append(getUsageLimitId()).append(",");
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

        if (obj instanceof ModifyUsageLimitResult == false)
            return false;
        ModifyUsageLimitResult other = (ModifyUsageLimitResult) obj;
        if (other.getUsageLimitId() == null ^ this.getUsageLimitId() == null)
            return false;
        if (other.getUsageLimitId() != null && other.getUsageLimitId().equals(this.getUsageLimitId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getUsageLimitId() == null) ? 0 : getUsageLimitId().hashCode());
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
    public ModifyUsageLimitResult clone() {
        try {
            return (ModifyUsageLimitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
