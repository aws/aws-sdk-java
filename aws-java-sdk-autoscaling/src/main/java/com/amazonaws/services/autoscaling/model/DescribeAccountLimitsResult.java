/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAccountLimits" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
     * </p>
     */
    private Integer maxNumberOfAutoScalingGroups;
    /**
     * <p>
     * The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per region.
     * </p>
     */
    private Integer maxNumberOfLaunchConfigurations;
    /**
     * <p>
     * The current number of groups for your AWS account.
     * </p>
     */
    private Integer numberOfAutoScalingGroups;
    /**
     * <p>
     * The current number of launch configurations for your AWS account.
     * </p>
     */
    private Integer numberOfLaunchConfigurations;

    /**
     * <p>
     * The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
     * </p>
     * 
     * @param maxNumberOfAutoScalingGroups
     *        The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
     */

    public void setMaxNumberOfAutoScalingGroups(Integer maxNumberOfAutoScalingGroups) {
        this.maxNumberOfAutoScalingGroups = maxNumberOfAutoScalingGroups;
    }

    /**
     * <p>
     * The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
     * </p>
     * 
     * @return The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
     */

    public Integer getMaxNumberOfAutoScalingGroups() {
        return this.maxNumberOfAutoScalingGroups;
    }

    /**
     * <p>
     * The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
     * </p>
     * 
     * @param maxNumberOfAutoScalingGroups
     *        The maximum number of groups allowed for your AWS account. The default limit is 200 per region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withMaxNumberOfAutoScalingGroups(Integer maxNumberOfAutoScalingGroups) {
        setMaxNumberOfAutoScalingGroups(maxNumberOfAutoScalingGroups);
        return this;
    }

    /**
     * <p>
     * The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per region.
     * </p>
     * 
     * @param maxNumberOfLaunchConfigurations
     *        The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per
     *        region.
     */

    public void setMaxNumberOfLaunchConfigurations(Integer maxNumberOfLaunchConfigurations) {
        this.maxNumberOfLaunchConfigurations = maxNumberOfLaunchConfigurations;
    }

    /**
     * <p>
     * The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per region.
     * </p>
     * 
     * @return The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per
     *         region.
     */

    public Integer getMaxNumberOfLaunchConfigurations() {
        return this.maxNumberOfLaunchConfigurations;
    }

    /**
     * <p>
     * The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per region.
     * </p>
     * 
     * @param maxNumberOfLaunchConfigurations
     *        The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per
     *        region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withMaxNumberOfLaunchConfigurations(Integer maxNumberOfLaunchConfigurations) {
        setMaxNumberOfLaunchConfigurations(maxNumberOfLaunchConfigurations);
        return this;
    }

    /**
     * <p>
     * The current number of groups for your AWS account.
     * </p>
     * 
     * @param numberOfAutoScalingGroups
     *        The current number of groups for your AWS account.
     */

    public void setNumberOfAutoScalingGroups(Integer numberOfAutoScalingGroups) {
        this.numberOfAutoScalingGroups = numberOfAutoScalingGroups;
    }

    /**
     * <p>
     * The current number of groups for your AWS account.
     * </p>
     * 
     * @return The current number of groups for your AWS account.
     */

    public Integer getNumberOfAutoScalingGroups() {
        return this.numberOfAutoScalingGroups;
    }

    /**
     * <p>
     * The current number of groups for your AWS account.
     * </p>
     * 
     * @param numberOfAutoScalingGroups
     *        The current number of groups for your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withNumberOfAutoScalingGroups(Integer numberOfAutoScalingGroups) {
        setNumberOfAutoScalingGroups(numberOfAutoScalingGroups);
        return this;
    }

    /**
     * <p>
     * The current number of launch configurations for your AWS account.
     * </p>
     * 
     * @param numberOfLaunchConfigurations
     *        The current number of launch configurations for your AWS account.
     */

    public void setNumberOfLaunchConfigurations(Integer numberOfLaunchConfigurations) {
        this.numberOfLaunchConfigurations = numberOfLaunchConfigurations;
    }

    /**
     * <p>
     * The current number of launch configurations for your AWS account.
     * </p>
     * 
     * @return The current number of launch configurations for your AWS account.
     */

    public Integer getNumberOfLaunchConfigurations() {
        return this.numberOfLaunchConfigurations;
    }

    /**
     * <p>
     * The current number of launch configurations for your AWS account.
     * </p>
     * 
     * @param numberOfLaunchConfigurations
     *        The current number of launch configurations for your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountLimitsResult withNumberOfLaunchConfigurations(Integer numberOfLaunchConfigurations) {
        setNumberOfLaunchConfigurations(numberOfLaunchConfigurations);
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
        if (getMaxNumberOfAutoScalingGroups() != null)
            sb.append("MaxNumberOfAutoScalingGroups: ").append(getMaxNumberOfAutoScalingGroups()).append(",");
        if (getMaxNumberOfLaunchConfigurations() != null)
            sb.append("MaxNumberOfLaunchConfigurations: ").append(getMaxNumberOfLaunchConfigurations()).append(",");
        if (getNumberOfAutoScalingGroups() != null)
            sb.append("NumberOfAutoScalingGroups: ").append(getNumberOfAutoScalingGroups()).append(",");
        if (getNumberOfLaunchConfigurations() != null)
            sb.append("NumberOfLaunchConfigurations: ").append(getNumberOfLaunchConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountLimitsResult == false)
            return false;
        DescribeAccountLimitsResult other = (DescribeAccountLimitsResult) obj;
        if (other.getMaxNumberOfAutoScalingGroups() == null ^ this.getMaxNumberOfAutoScalingGroups() == null)
            return false;
        if (other.getMaxNumberOfAutoScalingGroups() != null && other.getMaxNumberOfAutoScalingGroups().equals(this.getMaxNumberOfAutoScalingGroups()) == false)
            return false;
        if (other.getMaxNumberOfLaunchConfigurations() == null ^ this.getMaxNumberOfLaunchConfigurations() == null)
            return false;
        if (other.getMaxNumberOfLaunchConfigurations() != null
                && other.getMaxNumberOfLaunchConfigurations().equals(this.getMaxNumberOfLaunchConfigurations()) == false)
            return false;
        if (other.getNumberOfAutoScalingGroups() == null ^ this.getNumberOfAutoScalingGroups() == null)
            return false;
        if (other.getNumberOfAutoScalingGroups() != null && other.getNumberOfAutoScalingGroups().equals(this.getNumberOfAutoScalingGroups()) == false)
            return false;
        if (other.getNumberOfLaunchConfigurations() == null ^ this.getNumberOfLaunchConfigurations() == null)
            return false;
        if (other.getNumberOfLaunchConfigurations() != null && other.getNumberOfLaunchConfigurations().equals(this.getNumberOfLaunchConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxNumberOfAutoScalingGroups() == null) ? 0 : getMaxNumberOfAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getMaxNumberOfLaunchConfigurations() == null) ? 0 : getMaxNumberOfLaunchConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAutoScalingGroups() == null) ? 0 : getNumberOfAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getNumberOfLaunchConfigurations() == null) ? 0 : getNumberOfLaunchConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountLimitsResult clone() {
        try {
            return (DescribeAccountLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
