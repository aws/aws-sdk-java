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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for logging VPN tunnel activity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnTunnelLogOptionsSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnTunnelLogOptionsSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Options for sending VPN tunnel logs to CloudWatch.
     * </p>
     */
    private CloudWatchLogOptionsSpecification cloudWatchLogOptions;

    /**
     * <p>
     * Options for sending VPN tunnel logs to CloudWatch.
     * </p>
     * 
     * @param cloudWatchLogOptions
     *        Options for sending VPN tunnel logs to CloudWatch.
     */

    public void setCloudWatchLogOptions(CloudWatchLogOptionsSpecification cloudWatchLogOptions) {
        this.cloudWatchLogOptions = cloudWatchLogOptions;
    }

    /**
     * <p>
     * Options for sending VPN tunnel logs to CloudWatch.
     * </p>
     * 
     * @return Options for sending VPN tunnel logs to CloudWatch.
     */

    public CloudWatchLogOptionsSpecification getCloudWatchLogOptions() {
        return this.cloudWatchLogOptions;
    }

    /**
     * <p>
     * Options for sending VPN tunnel logs to CloudWatch.
     * </p>
     * 
     * @param cloudWatchLogOptions
     *        Options for sending VPN tunnel logs to CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnTunnelLogOptionsSpecification withCloudWatchLogOptions(CloudWatchLogOptionsSpecification cloudWatchLogOptions) {
        setCloudWatchLogOptions(cloudWatchLogOptions);
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
        if (getCloudWatchLogOptions() != null)
            sb.append("CloudWatchLogOptions: ").append(getCloudWatchLogOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnTunnelLogOptionsSpecification == false)
            return false;
        VpnTunnelLogOptionsSpecification other = (VpnTunnelLogOptionsSpecification) obj;
        if (other.getCloudWatchLogOptions() == null ^ this.getCloudWatchLogOptions() == null)
            return false;
        if (other.getCloudWatchLogOptions() != null && other.getCloudWatchLogOptions().equals(this.getCloudWatchLogOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogOptions() == null) ? 0 : getCloudWatchLogOptions().hashCode());
        return hashCode;
    }

    @Override
    public VpnTunnelLogOptionsSpecification clone() {
        try {
            return (VpnTunnelLogOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
