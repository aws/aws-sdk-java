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
package com.amazonaws.services.s3outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3
 * on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private
 * cloud (VPC).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/Endpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     */
    private String outpostsId;
    /**
     * <p>
     * The VPC CIDR committed by this endpoint.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The status of the endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the endpoint was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The network interface of the endpoint.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @param outpostsId
     *        The ID of the AWS Outpost.
     */

    public void setOutpostsId(String outpostsId) {
        this.outpostsId = outpostsId;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @return The ID of the AWS Outpost.
     */

    public String getOutpostsId() {
        return this.outpostsId;
    }

    /**
     * <p>
     * The ID of the AWS Outpost.
     * </p>
     * 
     * @param outpostsId
     *        The ID of the AWS Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withOutpostsId(String outpostsId) {
        setOutpostsId(outpostsId);
        return this;
    }

    /**
     * <p>
     * The VPC CIDR committed by this endpoint.
     * </p>
     * 
     * @param cidrBlock
     *        The VPC CIDR committed by this endpoint.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The VPC CIDR committed by this endpoint.
     * </p>
     * 
     * @return The VPC CIDR committed by this endpoint.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The VPC CIDR committed by this endpoint.
     * </p>
     * 
     * @param cidrBlock
     *        The VPC CIDR committed by this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param status
     *        The status of the endpoint.
     * @see EndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @return The status of the endpoint.
     * @see EndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param status
     *        The status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public Endpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param status
     *        The status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public Endpoint withStatus(EndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        The time the endpoint was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the endpoint was created.
     * </p>
     * 
     * @return The time the endpoint was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        The time the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The network interface of the endpoint.
     * </p>
     * 
     * @return The network interface of the endpoint.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interface of the endpoint.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interface of the endpoint.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * The network interface of the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interface of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interface of the endpoint.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interface of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getOutpostsId() != null)
            sb.append("OutpostsId: ").append(getOutpostsId()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getOutpostsId() == null ^ this.getOutpostsId() == null)
            return false;
        if (other.getOutpostsId() != null && other.getOutpostsId().equals(this.getOutpostsId()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getOutpostsId() == null) ? 0 : getOutpostsId().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.s3outposts.model.transform.EndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
