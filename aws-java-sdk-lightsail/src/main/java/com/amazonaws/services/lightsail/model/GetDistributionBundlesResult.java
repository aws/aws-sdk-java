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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionBundles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDistributionBundlesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes a distribution bundle.
     * </p>
     */
    private java.util.List<DistributionBundle> bundles;

    /**
     * <p>
     * An object that describes a distribution bundle.
     * </p>
     * 
     * @return An object that describes a distribution bundle.
     */

    public java.util.List<DistributionBundle> getBundles() {
        return bundles;
    }

    /**
     * <p>
     * An object that describes a distribution bundle.
     * </p>
     * 
     * @param bundles
     *        An object that describes a distribution bundle.
     */

    public void setBundles(java.util.Collection<DistributionBundle> bundles) {
        if (bundles == null) {
            this.bundles = null;
            return;
        }

        this.bundles = new java.util.ArrayList<DistributionBundle>(bundles);
    }

    /**
     * <p>
     * An object that describes a distribution bundle.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundles(java.util.Collection)} or {@link #withBundles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param bundles
     *        An object that describes a distribution bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionBundlesResult withBundles(DistributionBundle... bundles) {
        if (this.bundles == null) {
            setBundles(new java.util.ArrayList<DistributionBundle>(bundles.length));
        }
        for (DistributionBundle ele : bundles) {
            this.bundles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that describes a distribution bundle.
     * </p>
     * 
     * @param bundles
     *        An object that describes a distribution bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionBundlesResult withBundles(java.util.Collection<DistributionBundle> bundles) {
        setBundles(bundles);
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
        if (getBundles() != null)
            sb.append("Bundles: ").append(getBundles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDistributionBundlesResult == false)
            return false;
        GetDistributionBundlesResult other = (GetDistributionBundlesResult) obj;
        if (other.getBundles() == null ^ this.getBundles() == null)
            return false;
        if (other.getBundles() != null && other.getBundles().equals(this.getBundles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundles() == null) ? 0 : getBundles().hashCode());
        return hashCode;
    }

    @Override
    public GetDistributionBundlesResult clone() {
        try {
            return (GetDistributionBundlesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
