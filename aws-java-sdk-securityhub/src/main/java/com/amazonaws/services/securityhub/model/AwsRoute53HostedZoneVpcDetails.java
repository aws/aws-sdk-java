/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * For private hosted zones, this is a complex type that contains information about an Amazon VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRoute53HostedZoneVpcDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRoute53HostedZoneVpcDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of an Amazon VPC.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Web Services Region that an Amazon VPC was created in.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The identifier of an Amazon VPC.
     * </p>
     * 
     * @param id
     *        The identifier of an Amazon VPC.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of an Amazon VPC.
     * </p>
     * 
     * @return The identifier of an Amazon VPC.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of an Amazon VPC.
     * </p>
     * 
     * @param id
     *        The identifier of an Amazon VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneVpcDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region that an Amazon VPC was created in.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region that an Amazon VPC was created in.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region that an Amazon VPC was created in.
     * </p>
     * 
     * @return The Amazon Web Services Region that an Amazon VPC was created in.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region that an Amazon VPC was created in.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region that an Amazon VPC was created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneVpcDetails withRegion(String region) {
        setRegion(region);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRoute53HostedZoneVpcDetails == false)
            return false;
        AwsRoute53HostedZoneVpcDetails other = (AwsRoute53HostedZoneVpcDetails) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public AwsRoute53HostedZoneVpcDetails clone() {
        try {
            return (AwsRoute53HostedZoneVpcDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRoute53HostedZoneVpcDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
