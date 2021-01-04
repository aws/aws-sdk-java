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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration of the topic rule destination.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRuleDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     */
    private HttpUrlDestinationConfiguration httpUrlConfiguration;
    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     */
    private VpcDestinationConfiguration vpcConfiguration;

    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     * 
     * @param httpUrlConfiguration
     *        Configuration of the HTTP URL.
     */

    public void setHttpUrlConfiguration(HttpUrlDestinationConfiguration httpUrlConfiguration) {
        this.httpUrlConfiguration = httpUrlConfiguration;
    }

    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     * 
     * @return Configuration of the HTTP URL.
     */

    public HttpUrlDestinationConfiguration getHttpUrlConfiguration() {
        return this.httpUrlConfiguration;
    }

    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     * 
     * @param httpUrlConfiguration
     *        Configuration of the HTTP URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestinationConfiguration withHttpUrlConfiguration(HttpUrlDestinationConfiguration httpUrlConfiguration) {
        setHttpUrlConfiguration(httpUrlConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration of the virtual private cloud (VPC) connection.
     */

    public void setVpcConfiguration(VpcDestinationConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     * 
     * @return Configuration of the virtual private cloud (VPC) connection.
     */

    public VpcDestinationConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration of the virtual private cloud (VPC) connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestinationConfiguration withVpcConfiguration(VpcDestinationConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getHttpUrlConfiguration() != null)
            sb.append("HttpUrlConfiguration: ").append(getHttpUrlConfiguration()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleDestinationConfiguration == false)
            return false;
        TopicRuleDestinationConfiguration other = (TopicRuleDestinationConfiguration) obj;
        if (other.getHttpUrlConfiguration() == null ^ this.getHttpUrlConfiguration() == null)
            return false;
        if (other.getHttpUrlConfiguration() != null && other.getHttpUrlConfiguration().equals(this.getHttpUrlConfiguration()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpUrlConfiguration() == null) ? 0 : getHttpUrlConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TopicRuleDestinationConfiguration clone() {
        try {
            return (TopicRuleDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TopicRuleDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
