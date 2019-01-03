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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the client connection logging options for a Client VPN endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConnectionLogResponseOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionLogResponseOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN endpoint.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
     * </p>
     */
    private String cloudwatchLogGroup;
    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
     * </p>
     */
    private String cloudwatchLogStream;

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN endpoint.
     * </p>
     * 
     * @param enabled
     *        Indicates whether client connection logging is enabled for the Client VPN endpoint.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN endpoint.
     * </p>
     * 
     * @return Indicates whether client connection logging is enabled for the Client VPN endpoint.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN endpoint.
     * </p>
     * 
     * @param enabled
     *        Indicates whether client connection logging is enabled for the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionLogResponseOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN endpoint.
     * </p>
     * 
     * @return Indicates whether client connection logging is enabled for the Client VPN endpoint.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
     * </p>
     * 
     * @param cloudwatchLogGroup
     *        The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
     */

    public void setCloudwatchLogGroup(String cloudwatchLogGroup) {
        this.cloudwatchLogGroup = cloudwatchLogGroup;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
     */

    public String getCloudwatchLogGroup() {
        return this.cloudwatchLogGroup;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
     * </p>
     * 
     * @param cloudwatchLogGroup
     *        The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionLogResponseOptions withCloudwatchLogGroup(String cloudwatchLogGroup) {
        setCloudwatchLogGroup(cloudwatchLogGroup);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
     * </p>
     * 
     * @param cloudwatchLogStream
     *        The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
     */

    public void setCloudwatchLogStream(String cloudwatchLogStream) {
        this.cloudwatchLogStream = cloudwatchLogStream;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
     */

    public String getCloudwatchLogStream() {
        return this.cloudwatchLogStream;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
     * </p>
     * 
     * @param cloudwatchLogStream
     *        The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionLogResponseOptions withCloudwatchLogStream(String cloudwatchLogStream) {
        setCloudwatchLogStream(cloudwatchLogStream);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getCloudwatchLogGroup() != null)
            sb.append("CloudwatchLogGroup: ").append(getCloudwatchLogGroup()).append(",");
        if (getCloudwatchLogStream() != null)
            sb.append("CloudwatchLogStream: ").append(getCloudwatchLogStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionLogResponseOptions == false)
            return false;
        ConnectionLogResponseOptions other = (ConnectionLogResponseOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCloudwatchLogGroup() == null ^ this.getCloudwatchLogGroup() == null)
            return false;
        if (other.getCloudwatchLogGroup() != null && other.getCloudwatchLogGroup().equals(this.getCloudwatchLogGroup()) == false)
            return false;
        if (other.getCloudwatchLogStream() == null ^ this.getCloudwatchLogStream() == null)
            return false;
        if (other.getCloudwatchLogStream() != null && other.getCloudwatchLogStream().equals(this.getCloudwatchLogStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogGroup() == null) ? 0 : getCloudwatchLogGroup().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogStream() == null) ? 0 : getCloudwatchLogStream().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionLogResponseOptions clone() {
        try {
            return (ConnectionLogResponseOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
