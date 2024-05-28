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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details related activities associated with a potential security event. Lists all distinct categories of evidence that
 * are connected to the resource or the finding group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/RelatedFindingDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedFindingDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related finding.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of finding.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The IP address of the finding.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related finding.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the related finding.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related finding.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the related finding.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related finding.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the related finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedFindingDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * 
     * @param type
     *        The type of finding.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * 
     * @return The type of finding.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * 
     * @param type
     *        The type of finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedFindingDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The IP address of the finding.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the finding.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the finding.
     * </p>
     * 
     * @return The IP address of the finding.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the finding.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedFindingDetail withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedFindingDetail == false)
            return false;
        RelatedFindingDetail other = (RelatedFindingDetail) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public RelatedFindingDetail clone() {
        try {
            return (RelatedFindingDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.RelatedFindingDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
