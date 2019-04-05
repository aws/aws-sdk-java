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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * (Private hosted zones only) A complex type that contains information about an Amazon VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/VPC" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VPC implements Serializable, Cloneable {

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     */
    private String vPCRegion;

    private String vPCId;

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * 
     * @param vPCRegion
     *        (Private hosted zones only) The region that an Amazon VPC was created in.
     * @see VPCRegion
     */

    public void setVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * 
     * @return (Private hosted zones only) The region that an Amazon VPC was created in.
     * @see VPCRegion
     */

    public String getVPCRegion() {
        return this.vPCRegion;
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * 
     * @param vPCRegion
     *        (Private hosted zones only) The region that an Amazon VPC was created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCRegion
     */

    public VPC withVPCRegion(String vPCRegion) {
        setVPCRegion(vPCRegion);
        return this;
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * 
     * @param vPCRegion
     *        (Private hosted zones only) The region that an Amazon VPC was created in.
     * @see VPCRegion
     */

    public void setVPCRegion(VPCRegion vPCRegion) {
        withVPCRegion(vPCRegion);
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * 
     * @param vPCRegion
     *        (Private hosted zones only) The region that an Amazon VPC was created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCRegion
     */

    public VPC withVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
        return this;
    }

    /**
     * @param vPCId
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * @return
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * @param vPCId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPC withVPCId(String vPCId) {
        setVPCId(vPCId);
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
        if (getVPCRegion() != null)
            sb.append("VPCRegion: ").append(getVPCRegion()).append(",");
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VPC == false)
            return false;
        VPC other = (VPC) obj;
        if (other.getVPCRegion() == null ^ this.getVPCRegion() == null)
            return false;
        if (other.getVPCRegion() != null && other.getVPCRegion().equals(this.getVPCRegion()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVPCRegion() == null) ? 0 : getVPCRegion().hashCode());
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        return hashCode;
    }

    @Override
    public VPC clone() {
        try {
            return (VPC) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
