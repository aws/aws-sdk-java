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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistributionBundle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDistributionBundleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the distribution for which to update the bundle.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     */
    private String distributionName;
    /**
     * <p>
     * The bundle ID of the new bundle to apply to your distribution.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     */
    private String bundleId;

    /**
     * <p>
     * The name of the distribution for which to update the bundle.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to update the bundle.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to update the bundle.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @return The name of the distribution for which to update the bundle.</p>
     *         <p>
     *         Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public String getDistributionName() {
        return this.distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to update the bundle.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to update the bundle.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionBundleRequest withDistributionName(String distributionName) {
        setDistributionName(distributionName);
        return this;
    }

    /**
     * <p>
     * The bundle ID of the new bundle to apply to your distribution.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     * 
     * @param bundleId
     *        The bundle ID of the new bundle to apply to your distribution.</p>
     *        <p>
     *        Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can
     *        specify.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle ID of the new bundle to apply to your distribution.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     * 
     * @return The bundle ID of the new bundle to apply to your distribution.</p>
     *         <p>
     *         Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can
     *         specify.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle ID of the new bundle to apply to your distribution.
     * </p>
     * <p>
     * Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can specify.
     * </p>
     * 
     * @param bundleId
     *        The bundle ID of the new bundle to apply to your distribution.</p>
     *        <p>
     *        Use the <code>GetDistributionBundles</code> action to get a list of distribution bundle IDs that you can
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDistributionBundleRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
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
            sb.append("DistributionName: ").append(getDistributionName()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDistributionBundleRequest == false)
            return false;
        UpdateDistributionBundleRequest other = (UpdateDistributionBundleRequest) obj;
        if (other.getDistributionName() == null ^ this.getDistributionName() == null)
            return false;
        if (other.getDistributionName() != null && other.getDistributionName().equals(this.getDistributionName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionName() == null) ? 0 : getDistributionName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDistributionBundleRequest clone() {
        return (UpdateDistributionBundleRequest) super.clone();
    }

}
