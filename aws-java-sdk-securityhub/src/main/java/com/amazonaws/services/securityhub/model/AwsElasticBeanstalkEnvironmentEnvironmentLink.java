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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a link to another environment that is in the same group.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticBeanstalkEnvironmentEnvironmentLink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticBeanstalkEnvironmentEnvironmentLink implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the linked environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The name of the environment link.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * The name of the linked environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the linked environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the linked environment.
     * </p>
     * 
     * @return The name of the linked environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the linked environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the linked environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentEnvironmentLink withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The name of the environment link.
     * </p>
     * 
     * @param linkName
     *        The name of the environment link.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the environment link.
     * </p>
     * 
     * @return The name of the environment link.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of the environment link.
     * </p>
     * 
     * @param linkName
     *        The name of the environment link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentEnvironmentLink withLinkName(String linkName) {
        setLinkName(linkName);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getLinkName() != null)
            sb.append("LinkName: ").append(getLinkName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticBeanstalkEnvironmentEnvironmentLink == false)
            return false;
        AwsElasticBeanstalkEnvironmentEnvironmentLink other = (AwsElasticBeanstalkEnvironmentEnvironmentLink) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getLinkName() == null ^ this.getLinkName() == null)
            return false;
        if (other.getLinkName() != null && other.getLinkName().equals(this.getLinkName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticBeanstalkEnvironmentEnvironmentLink clone() {
        try {
            return (AwsElasticBeanstalkEnvironmentEnvironmentLink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticBeanstalkEnvironmentEnvironmentLinkMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
