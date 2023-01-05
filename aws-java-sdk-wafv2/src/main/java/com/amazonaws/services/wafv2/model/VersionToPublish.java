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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A version of the named managed rule group, that the rule group's vendor publishes for use by customers.
 * </p>
 * <note>
 * <p>
 * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
 * Services Marketplace sellers.
 * </p>
 * <p>
 * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
 * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
 * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/VersionToPublish" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionToPublish implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group
     * version.
     * </p>
     */
    private String associatedRuleGroupArn;
    /**
     * <p>
     * The amount of time the vendor expects this version of the managed rule group to last, in days.
     * </p>
     */
    private Integer forecastedLifetime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group
     * version.
     * </p>
     * 
     * @param associatedRuleGroupArn
     *        The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group
     *        version.
     */

    public void setAssociatedRuleGroupArn(String associatedRuleGroupArn) {
        this.associatedRuleGroupArn = associatedRuleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group
     * version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group
     *         version.
     */

    public String getAssociatedRuleGroupArn() {
        return this.associatedRuleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group
     * version.
     * </p>
     * 
     * @param associatedRuleGroupArn
     *        The Amazon Resource Name (ARN) of the vendor's rule group that's used in the published managed rule group
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionToPublish withAssociatedRuleGroupArn(String associatedRuleGroupArn) {
        setAssociatedRuleGroupArn(associatedRuleGroupArn);
        return this;
    }

    /**
     * <p>
     * The amount of time the vendor expects this version of the managed rule group to last, in days.
     * </p>
     * 
     * @param forecastedLifetime
     *        The amount of time the vendor expects this version of the managed rule group to last, in days.
     */

    public void setForecastedLifetime(Integer forecastedLifetime) {
        this.forecastedLifetime = forecastedLifetime;
    }

    /**
     * <p>
     * The amount of time the vendor expects this version of the managed rule group to last, in days.
     * </p>
     * 
     * @return The amount of time the vendor expects this version of the managed rule group to last, in days.
     */

    public Integer getForecastedLifetime() {
        return this.forecastedLifetime;
    }

    /**
     * <p>
     * The amount of time the vendor expects this version of the managed rule group to last, in days.
     * </p>
     * 
     * @param forecastedLifetime
     *        The amount of time the vendor expects this version of the managed rule group to last, in days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionToPublish withForecastedLifetime(Integer forecastedLifetime) {
        setForecastedLifetime(forecastedLifetime);
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
        if (getAssociatedRuleGroupArn() != null)
            sb.append("AssociatedRuleGroupArn: ").append(getAssociatedRuleGroupArn()).append(",");
        if (getForecastedLifetime() != null)
            sb.append("ForecastedLifetime: ").append(getForecastedLifetime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionToPublish == false)
            return false;
        VersionToPublish other = (VersionToPublish) obj;
        if (other.getAssociatedRuleGroupArn() == null ^ this.getAssociatedRuleGroupArn() == null)
            return false;
        if (other.getAssociatedRuleGroupArn() != null && other.getAssociatedRuleGroupArn().equals(this.getAssociatedRuleGroupArn()) == false)
            return false;
        if (other.getForecastedLifetime() == null ^ this.getForecastedLifetime() == null)
            return false;
        if (other.getForecastedLifetime() != null && other.getForecastedLifetime().equals(this.getForecastedLifetime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedRuleGroupArn() == null) ? 0 : getAssociatedRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getForecastedLifetime() == null) ? 0 : getForecastedLifetime().hashCode());
        return hashCode;
    }

    @Override
    public VersionToPublish clone() {
        try {
            return (VersionToPublish) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.VersionToPublishMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
