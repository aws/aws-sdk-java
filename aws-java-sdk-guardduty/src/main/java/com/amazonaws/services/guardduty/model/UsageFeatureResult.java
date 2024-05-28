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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the result of the total usage based on the feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UsageFeatureResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageFeatureResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The feature that generated the usage cost.
     * </p>
     */
    private String feature;

    private Total total;

    /**
     * <p>
     * The feature that generated the usage cost.
     * </p>
     * 
     * @param feature
     *        The feature that generated the usage cost.
     * @see UsageFeature
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * The feature that generated the usage cost.
     * </p>
     * 
     * @return The feature that generated the usage cost.
     * @see UsageFeature
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * The feature that generated the usage cost.
     * </p>
     * 
     * @param feature
     *        The feature that generated the usage cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageFeature
     */

    public UsageFeatureResult withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * The feature that generated the usage cost.
     * </p>
     * 
     * @param feature
     *        The feature that generated the usage cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageFeature
     */

    public UsageFeatureResult withFeature(UsageFeature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * @param total
     */

    public void setTotal(Total total) {
        this.total = total;
    }

    /**
     * @return
     */

    public Total getTotal() {
        return this.total;
    }

    /**
     * @param total
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageFeatureResult withTotal(Total total) {
        setTotal(total);
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
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageFeatureResult == false)
            return false;
        UsageFeatureResult other = (UsageFeatureResult) obj;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public UsageFeatureResult clone() {
        try {
            return (UsageFeatureResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UsageFeatureResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
