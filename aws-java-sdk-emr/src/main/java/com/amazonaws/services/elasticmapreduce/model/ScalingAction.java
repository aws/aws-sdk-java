/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
 * </p>
 */
public class ScalingAction implements Serializable, Cloneable {

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type specified for the group.
     * </p>
     */
    private String market;
    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the
     * adjustment.
     * </p>
     */
    private SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration;

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type specified for the group.
     * </p>
     * 
     * @param market
     *        Not available for instance groups. Instance groups use the market type specified for the group.
     * @see MarketType
     */

    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type specified for the group.
     * </p>
     * 
     * @return Not available for instance groups. Instance groups use the market type specified for the group.
     * @see MarketType
     */

    public String getMarket() {
        return this.market;
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type specified for the group.
     * </p>
     * 
     * @param market
     *        Not available for instance groups. Instance groups use the market type specified for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public ScalingAction withMarket(String market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type specified for the group.
     * </p>
     * 
     * @param market
     *        Not available for instance groups. Instance groups use the market type specified for the group.
     * @see MarketType
     */

    public void setMarket(MarketType market) {
        this.market = market.toString();
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type specified for the group.
     * </p>
     * 
     * @param market
     *        Not available for instance groups. Instance groups use the market type specified for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public ScalingAction withMarket(MarketType market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the
     * adjustment.
     * </p>
     * 
     * @param simpleScalingPolicyConfiguration
     *        The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the
     *        adjustment.
     */

    public void setSimpleScalingPolicyConfiguration(SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration) {
        this.simpleScalingPolicyConfiguration = simpleScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the
     * adjustment.
     * </p>
     * 
     * @return The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the
     *         adjustment.
     */

    public SimpleScalingPolicyConfiguration getSimpleScalingPolicyConfiguration() {
        return this.simpleScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the
     * adjustment.
     * </p>
     * 
     * @param simpleScalingPolicyConfiguration
     *        The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the
     *        adjustment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingAction withSimpleScalingPolicyConfiguration(SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration) {
        setSimpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMarket() != null)
            sb.append("Market: " + getMarket() + ",");
        if (getSimpleScalingPolicyConfiguration() != null)
            sb.append("SimpleScalingPolicyConfiguration: " + getSimpleScalingPolicyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingAction == false)
            return false;
        ScalingAction other = (ScalingAction) obj;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getSimpleScalingPolicyConfiguration() == null ^ this.getSimpleScalingPolicyConfiguration() == null)
            return false;
        if (other.getSimpleScalingPolicyConfiguration() != null
                && other.getSimpleScalingPolicyConfiguration().equals(this.getSimpleScalingPolicyConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode + ((getSimpleScalingPolicyConfiguration() == null) ? 0 : getSimpleScalingPolicyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ScalingAction clone() {
        try {
            return (ScalingAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
