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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the market (purchasing) option for an Amazon EC2 instance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The market type.
     * </p>
     */
    private String marketType;
    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails spotOptions;

    /**
     * <p>
     * The market type.
     * </p>
     * 
     * @param marketType
     *        The market type.
     */

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * 
     * @return The market type.
     */

    public String getMarketType() {
        return this.marketType;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * 
     * @param marketType
     *        The market type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails withMarketType(String marketType) {
        setMarketType(marketType);
        return this;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     * 
     * @param spotOptions
     *        The options for Spot Instances.
     */

    public void setSpotOptions(AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails spotOptions) {
        this.spotOptions = spotOptions;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     * 
     * @return The options for Spot Instances.
     */

    public AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails getSpotOptions() {
        return this.spotOptions;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     * 
     * @param spotOptions
     *        The options for Spot Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails withSpotOptions(AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails spotOptions) {
        setSpotOptions(spotOptions);
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
        if (getMarketType() != null)
            sb.append("MarketType: ").append(getMarketType()).append(",");
        if (getSpotOptions() != null)
            sb.append("SpotOptions: ").append(getSpotOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails == false)
            return false;
        AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails other = (AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails) obj;
        if (other.getMarketType() == null ^ this.getMarketType() == null)
            return false;
        if (other.getMarketType() != null && other.getMarketType().equals(this.getMarketType()) == false)
            return false;
        if (other.getSpotOptions() == null ^ this.getSpotOptions() == null)
            return false;
        if (other.getSpotOptions() != null && other.getSpotOptions().equals(this.getSpotOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarketType() == null) ? 0 : getMarketType().hashCode());
        hashCode = prime * hashCode + ((getSpotOptions() == null) ? 0 : getSpotOptions().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataInstanceMarketOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
