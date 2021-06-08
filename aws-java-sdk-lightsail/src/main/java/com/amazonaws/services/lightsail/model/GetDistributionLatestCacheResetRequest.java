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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionLatestCacheReset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDistributionLatestCacheResetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the distribution for which to return the timestamp of the last cache reset.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * <p>
     * When omitted, the response includes the latest cache reset timestamp of all your distributions.
     * </p>
     */
    private String distributionName;

    /**
     * <p>
     * The name of the distribution for which to return the timestamp of the last cache reset.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * <p>
     * When omitted, the response includes the latest cache reset timestamp of all your distributions.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to return the timestamp of the last cache reset.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     *        </p>
     *        <p>
     *        When omitted, the response includes the latest cache reset timestamp of all your distributions.
     */

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to return the timestamp of the last cache reset.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * <p>
     * When omitted, the response includes the latest cache reset timestamp of all your distributions.
     * </p>
     * 
     * @return The name of the distribution for which to return the timestamp of the last cache reset.</p>
     *         <p>
     *         Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     *         </p>
     *         <p>
     *         When omitted, the response includes the latest cache reset timestamp of all your distributions.
     */

    public String getDistributionName() {
        return this.distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to return the timestamp of the last cache reset.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * <p>
     * When omitted, the response includes the latest cache reset timestamp of all your distributions.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to return the timestamp of the last cache reset.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     *        </p>
     *        <p>
     *        When omitted, the response includes the latest cache reset timestamp of all your distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionLatestCacheResetRequest withDistributionName(String distributionName) {
        setDistributionName(distributionName);
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
        if (getDistributionName() != null)
            sb.append("DistributionName: ").append(getDistributionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDistributionLatestCacheResetRequest == false)
            return false;
        GetDistributionLatestCacheResetRequest other = (GetDistributionLatestCacheResetRequest) obj;
        if (other.getDistributionName() == null ^ this.getDistributionName() == null)
            return false;
        if (other.getDistributionName() != null && other.getDistributionName().equals(this.getDistributionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionName() == null) ? 0 : getDistributionName().hashCode());
        return hashCode;
    }

    @Override
    public GetDistributionLatestCacheResetRequest clone() {
        return (GetDistributionLatestCacheResetRequest) super.clone();
    }

}
