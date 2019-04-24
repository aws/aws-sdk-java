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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the gateway to update.
     * </p>
     */
    private String gatewayArn;
    /**
     * <p>
     * The updated name of the gateway.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated description of the gateway.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     */
    private String softwareVersion;

    /**
     * <p>
     * The ARN of the gateway to update.
     * </p>
     * 
     * @param gatewayArn
     *        The ARN of the gateway to update.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway to update.
     * </p>
     * 
     * @return The ARN of the gateway to update.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway to update.
     * </p>
     * 
     * @param gatewayArn
     *        The ARN of the gateway to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayRequest withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * <p>
     * The updated name of the gateway.
     * </p>
     * 
     * @param name
     *        The updated name of the gateway.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name of the gateway.
     * </p>
     * 
     * @return The updated name of the gateway.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated name of the gateway.
     * </p>
     * 
     * @param name
     *        The updated name of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated description of the gateway.
     * </p>
     * 
     * @param description
     *        The updated description of the gateway.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the gateway.
     * </p>
     * 
     * @return The updated description of the gateway.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the gateway.
     * </p>
     * 
     * @param description
     *        The updated description of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     * 
     * @param softwareVersion
     *        The updated software version of the gateway. The gateway automatically updates its software version during
     *        normal operation.
     */

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    /**
     * <p>
     * The updated software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     * 
     * @return The updated software version of the gateway. The gateway automatically updates its software version
     *         during normal operation.
     */

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * <p>
     * The updated software version of the gateway. The gateway automatically updates its software version during normal
     * operation.
     * </p>
     * 
     * @param softwareVersion
     *        The updated software version of the gateway. The gateway automatically updates its software version during
     *        normal operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayRequest withSoftwareVersion(String softwareVersion) {
        setSoftwareVersion(softwareVersion);
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
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSoftwareVersion() != null)
            sb.append("SoftwareVersion: ").append(getSoftwareVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayRequest == false)
            return false;
        UpdateGatewayRequest other = (UpdateGatewayRequest) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSoftwareVersion() == null ^ this.getSoftwareVersion() == null)
            return false;
        if (other.getSoftwareVersion() != null && other.getSoftwareVersion().equals(this.getSoftwareVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSoftwareVersion() == null) ? 0 : getSoftwareVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayRequest clone() {
        return (UpdateGatewayRequest) super.clone();
    }

}
