/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an AWS account that is associated with Amazon API Gateway.
 * </p>
 */
public class UpdateAccountResult implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon resource name (ARN) of an Amazon CloudWatch role for
     * the current <a>Account</a> resource.
     * </p>
     */
    private String cloudwatchRoleArn;
    /**
     * <p>
     * Specifies the application programming interface (API) throttle settings
     * for the current <a>Account</a> resource.
     * </p>
     */
    private ThrottleSettings throttleSettings;

    /**
     * <p>
     * Specifies the Amazon resource name (ARN) of an Amazon CloudWatch role for
     * the current <a>Account</a> resource.
     * </p>
     * 
     * @param cloudwatchRoleArn
     *        Specifies the Amazon resource name (ARN) of an Amazon CloudWatch
     *        role for the current <a>Account</a> resource.
     */
    public void setCloudwatchRoleArn(String cloudwatchRoleArn) {
        this.cloudwatchRoleArn = cloudwatchRoleArn;
    }

    /**
     * <p>
     * Specifies the Amazon resource name (ARN) of an Amazon CloudWatch role for
     * the current <a>Account</a> resource.
     * </p>
     * 
     * @return Specifies the Amazon resource name (ARN) of an Amazon CloudWatch
     *         role for the current <a>Account</a> resource.
     */
    public String getCloudwatchRoleArn() {
        return this.cloudwatchRoleArn;
    }

    /**
     * <p>
     * Specifies the Amazon resource name (ARN) of an Amazon CloudWatch role for
     * the current <a>Account</a> resource.
     * </p>
     * 
     * @param cloudwatchRoleArn
     *        Specifies the Amazon resource name (ARN) of an Amazon CloudWatch
     *        role for the current <a>Account</a> resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateAccountResult withCloudwatchRoleArn(String cloudwatchRoleArn) {
        setCloudwatchRoleArn(cloudwatchRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the application programming interface (API) throttle settings
     * for the current <a>Account</a> resource.
     * </p>
     * 
     * @param throttleSettings
     *        Specifies the application programming interface (API) throttle
     *        settings for the current <a>Account</a> resource.
     */
    public void setThrottleSettings(ThrottleSettings throttleSettings) {
        this.throttleSettings = throttleSettings;
    }

    /**
     * <p>
     * Specifies the application programming interface (API) throttle settings
     * for the current <a>Account</a> resource.
     * </p>
     * 
     * @return Specifies the application programming interface (API) throttle
     *         settings for the current <a>Account</a> resource.
     */
    public ThrottleSettings getThrottleSettings() {
        return this.throttleSettings;
    }

    /**
     * <p>
     * Specifies the application programming interface (API) throttle settings
     * for the current <a>Account</a> resource.
     * </p>
     * 
     * @param throttleSettings
     *        Specifies the application programming interface (API) throttle
     *        settings for the current <a>Account</a> resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateAccountResult withThrottleSettings(
            ThrottleSettings throttleSettings) {
        setThrottleSettings(throttleSettings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCloudwatchRoleArn() != null)
            sb.append("CloudwatchRoleArn: " + getCloudwatchRoleArn() + ",");
        if (getThrottleSettings() != null)
            sb.append("ThrottleSettings: " + getThrottleSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountResult == false)
            return false;
        UpdateAccountResult other = (UpdateAccountResult) obj;
        if (other.getCloudwatchRoleArn() == null
                ^ this.getCloudwatchRoleArn() == null)
            return false;
        if (other.getCloudwatchRoleArn() != null
                && other.getCloudwatchRoleArn().equals(
                        this.getCloudwatchRoleArn()) == false)
            return false;
        if (other.getThrottleSettings() == null
                ^ this.getThrottleSettings() == null)
            return false;
        if (other.getThrottleSettings() != null
                && other.getThrottleSettings().equals(
                        this.getThrottleSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudwatchRoleArn() == null) ? 0
                        : getCloudwatchRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getThrottleSettings() == null) ? 0 : getThrottleSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountResult clone() {
        try {
            return (UpdateAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}