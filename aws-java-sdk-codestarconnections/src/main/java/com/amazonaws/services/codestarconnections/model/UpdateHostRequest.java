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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/UpdateHost" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHostRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be updated.
     * </p>
     */
    private String hostArn;
    /**
     * <p>
     * The URL or endpoint of the host to be updated.
     * </p>
     */
    private String providerEndpoint;
    /**
     * <p>
     * The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be updated.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host to be updated.
     */

    public void setHostArn(String hostArn) {
        this.hostArn = hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the host to be updated.
     */

    public String getHostArn() {
        return this.hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be updated.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostRequest withHostArn(String hostArn) {
        setHostArn(hostArn);
        return this;
    }

    /**
     * <p>
     * The URL or endpoint of the host to be updated.
     * </p>
     * 
     * @param providerEndpoint
     *        The URL or endpoint of the host to be updated.
     */

    public void setProviderEndpoint(String providerEndpoint) {
        this.providerEndpoint = providerEndpoint;
    }

    /**
     * <p>
     * The URL or endpoint of the host to be updated.
     * </p>
     * 
     * @return The URL or endpoint of the host to be updated.
     */

    public String getProviderEndpoint() {
        return this.providerEndpoint;
    }

    /**
     * <p>
     * The URL or endpoint of the host to be updated.
     * </p>
     * 
     * @param providerEndpoint
     *        The URL or endpoint of the host to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostRequest withProviderEndpoint(String providerEndpoint) {
        setProviderEndpoint(providerEndpoint);
        return this;
    }

    /**
     * <p>
     * The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be
     *        represented by the host must already be connected to the VPC.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     * 
     * @return The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be
     *         represented by the host must already be connected to the VPC.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be
     * represented by the host must already be connected to the VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be
     *        represented by the host must already be connected to the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostRequest withVpcConfiguration(VpcConfiguration vpcConfiguration) {
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
        if (getHostArn() != null)
            sb.append("HostArn: ").append(getHostArn()).append(",");
        if (getProviderEndpoint() != null)
            sb.append("ProviderEndpoint: ").append(getProviderEndpoint()).append(",");
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

        if (obj instanceof UpdateHostRequest == false)
            return false;
        UpdateHostRequest other = (UpdateHostRequest) obj;
        if (other.getHostArn() == null ^ this.getHostArn() == null)
            return false;
        if (other.getHostArn() != null && other.getHostArn().equals(this.getHostArn()) == false)
            return false;
        if (other.getProviderEndpoint() == null ^ this.getProviderEndpoint() == null)
            return false;
        if (other.getProviderEndpoint() != null && other.getProviderEndpoint().equals(this.getProviderEndpoint()) == false)
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

        hashCode = prime * hashCode + ((getHostArn() == null) ? 0 : getHostArn().hashCode());
        hashCode = prime * hashCode + ((getProviderEndpoint() == null) ? 0 : getProviderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHostRequest clone() {
        return (UpdateHostRequest) super.clone();
    }

}
