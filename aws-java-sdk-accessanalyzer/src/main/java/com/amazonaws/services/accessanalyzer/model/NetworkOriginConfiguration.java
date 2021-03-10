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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed <code>InternetConfiguration</code> or <code>VpcConfiguration</code> to apply to the Amazon S3 Access
 * point. You can make the access point accessible from the internet, or you can specify that all requests made through
 * that access point must originate from a specific virtual private cloud (VPC). You can specify only one type of
 * network configuration. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/creating-access-points.html">Creating access points</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/NetworkOriginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkOriginConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the Amazon S3 access point with an <code>Internet</code> origin.
     * </p>
     */
    private InternetConfiguration internetConfiguration;

    private VpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The configuration for the Amazon S3 access point with an <code>Internet</code> origin.
     * </p>
     * 
     * @param internetConfiguration
     *        The configuration for the Amazon S3 access point with an <code>Internet</code> origin.
     */

    public void setInternetConfiguration(InternetConfiguration internetConfiguration) {
        this.internetConfiguration = internetConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon S3 access point with an <code>Internet</code> origin.
     * </p>
     * 
     * @return The configuration for the Amazon S3 access point with an <code>Internet</code> origin.
     */

    public InternetConfiguration getInternetConfiguration() {
        return this.internetConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon S3 access point with an <code>Internet</code> origin.
     * </p>
     * 
     * @param internetConfiguration
     *        The configuration for the Amazon S3 access point with an <code>Internet</code> origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkOriginConfiguration withInternetConfiguration(InternetConfiguration internetConfiguration) {
        setInternetConfiguration(internetConfiguration);
        return this;
    }

    /**
     * @param vpcConfiguration
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * @return
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * @param vpcConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkOriginConfiguration withVpcConfiguration(VpcConfiguration vpcConfiguration) {
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
        if (getInternetConfiguration() != null)
            sb.append("InternetConfiguration: ").append(getInternetConfiguration()).append(",");
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

        if (obj instanceof NetworkOriginConfiguration == false)
            return false;
        NetworkOriginConfiguration other = (NetworkOriginConfiguration) obj;
        if (other.getInternetConfiguration() == null ^ this.getInternetConfiguration() == null)
            return false;
        if (other.getInternetConfiguration() != null && other.getInternetConfiguration().equals(this.getInternetConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getInternetConfiguration() == null) ? 0 : getInternetConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public NetworkOriginConfiguration clone() {
        try {
            return (NetworkOriginConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.NetworkOriginConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
