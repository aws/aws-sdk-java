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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A JSON-formatted object that contains the IDs for an Amazon Machine Image (AMI), including the Amazon EC2 AMI ID and
 * the Snowball Edge AMI ID. Each AMI has these two IDs to simplify identifying the AMI in both the AWS Cloud and on the
 * device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/Ec2AmiResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2AmiResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The ID of the AMI on the supported device.
     * </p>
     */
    private String snowballAmiId;

    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     * 
     * @param amiId
     *        The ID of the AMI in Amazon EC2.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     * 
     * @return The ID of the AMI in Amazon EC2.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     * 
     * @param amiId
     *        The ID of the AMI in Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2AmiResource withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI on the supported device.
     * </p>
     * 
     * @param snowballAmiId
     *        The ID of the AMI on the supported device.
     */

    public void setSnowballAmiId(String snowballAmiId) {
        this.snowballAmiId = snowballAmiId;
    }

    /**
     * <p>
     * The ID of the AMI on the supported device.
     * </p>
     * 
     * @return The ID of the AMI on the supported device.
     */

    public String getSnowballAmiId() {
        return this.snowballAmiId;
    }

    /**
     * <p>
     * The ID of the AMI on the supported device.
     * </p>
     * 
     * @param snowballAmiId
     *        The ID of the AMI on the supported device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2AmiResource withSnowballAmiId(String snowballAmiId) {
        setSnowballAmiId(snowballAmiId);
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
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getSnowballAmiId() != null)
            sb.append("SnowballAmiId: ").append(getSnowballAmiId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2AmiResource == false)
            return false;
        Ec2AmiResource other = (Ec2AmiResource) obj;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getSnowballAmiId() == null ^ this.getSnowballAmiId() == null)
            return false;
        if (other.getSnowballAmiId() != null && other.getSnowballAmiId().equals(this.getSnowballAmiId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getSnowballAmiId() == null) ? 0 : getSnowballAmiId().hashCode());
        return hashCode;
    }

    @Override
    public Ec2AmiResource clone() {
        try {
            return (Ec2AmiResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.Ec2AmiResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
