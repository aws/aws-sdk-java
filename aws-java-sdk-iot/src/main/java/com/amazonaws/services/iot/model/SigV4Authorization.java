/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use Sig V4 authorization.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigV4Authorization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The signing region.
     * </p>
     */
    private String signingRegion;
    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The signing region.
     * </p>
     * 
     * @param signingRegion
     *        The signing region.
     */

    public void setSigningRegion(String signingRegion) {
        this.signingRegion = signingRegion;
    }

    /**
     * <p>
     * The signing region.
     * </p>
     * 
     * @return The signing region.
     */

    public String getSigningRegion() {
        return this.signingRegion;
    }

    /**
     * <p>
     * The signing region.
     * </p>
     * 
     * @param signingRegion
     *        The signing region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigV4Authorization withSigningRegion(String signingRegion) {
        setSigningRegion(signingRegion);
        return this;
    }

    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     * 
     * @param serviceName
     *        The service name to use while signing with Sig V4.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     * 
     * @return The service name to use while signing with Sig V4.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The service name to use while signing with Sig V4.
     * </p>
     * 
     * @param serviceName
     *        The service name to use while signing with Sig V4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigV4Authorization withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the signing role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     * 
     * @return The ARN of the signing role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the signing role.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the signing role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigV4Authorization withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getSigningRegion() != null)
            sb.append("SigningRegion: ").append(getSigningRegion()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigV4Authorization == false)
            return false;
        SigV4Authorization other = (SigV4Authorization) obj;
        if (other.getSigningRegion() == null ^ this.getSigningRegion() == null)
            return false;
        if (other.getSigningRegion() != null && other.getSigningRegion().equals(this.getSigningRegion()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningRegion() == null) ? 0 : getSigningRegion().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public SigV4Authorization clone() {
        try {
            return (SigV4Authorization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.SigV4AuthorizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
