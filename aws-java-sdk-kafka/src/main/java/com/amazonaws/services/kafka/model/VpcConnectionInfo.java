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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Description of the VPC connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/VpcConnectionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConnectionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     */
    private String vpcConnectionArn;
    /**
     * <p>
     * The owner of the VPC Connection.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * Description of the requester that calls the API operation.
     * </p>
     */
    private UserIdentity userIdentity;
    /**
     * <p>
     * The time when Amazon MSK creates the VPC Connnection.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the VPC connection.
     *        </p>
     */

    public void setVpcConnectionArn(String vpcConnectionArn) {
        this.vpcConnectionArn = vpcConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the VPC connection.
     *         </p>
     */

    public String getVpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @param vpcConnectionArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the VPC connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectionInfo withVpcConnectionArn(String vpcConnectionArn) {
        setVpcConnectionArn(vpcConnectionArn);
        return this;
    }

    /**
     * <p>
     * The owner of the VPC Connection.
     * </p>
     * 
     * @param owner
     *        <p>
     *        The owner of the VPC Connection.
     *        </p>
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the VPC Connection.
     * </p>
     * 
     * @return <p>
     *         The owner of the VPC Connection.
     *         </p>
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the VPC Connection.
     * </p>
     * 
     * @param owner
     *        <p>
     *        The owner of the VPC Connection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectionInfo withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Description of the requester that calls the API operation.
     * </p>
     * 
     * @param userIdentity
     *        <p>
     *        Description of the requester that calls the API operation.
     *        </p>
     */

    public void setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    /**
     * <p>
     * Description of the requester that calls the API operation.
     * </p>
     * 
     * @return <p>
     *         Description of the requester that calls the API operation.
     *         </p>
     */

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /**
     * <p>
     * Description of the requester that calls the API operation.
     * </p>
     * 
     * @param userIdentity
     *        <p>
     *        Description of the requester that calls the API operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectionInfo withUserIdentity(UserIdentity userIdentity) {
        setUserIdentity(userIdentity);
        return this;
    }

    /**
     * <p>
     * The time when Amazon MSK creates the VPC Connnection.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when Amazon MSK creates the VPC Connnection.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when Amazon MSK creates the VPC Connnection.
     * </p>
     * 
     * @return <p>
     *         The time when Amazon MSK creates the VPC Connnection.
     *         </p>
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when Amazon MSK creates the VPC Connnection.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when Amazon MSK creates the VPC Connnection.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectionInfo withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getVpcConnectionArn() != null)
            sb.append("VpcConnectionArn: ").append(getVpcConnectionArn()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getUserIdentity() != null)
            sb.append("UserIdentity: ").append(getUserIdentity()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConnectionInfo == false)
            return false;
        VpcConnectionInfo other = (VpcConnectionInfo) obj;
        if (other.getVpcConnectionArn() == null ^ this.getVpcConnectionArn() == null)
            return false;
        if (other.getVpcConnectionArn() != null && other.getVpcConnectionArn().equals(this.getVpcConnectionArn()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getUserIdentity() == null ^ this.getUserIdentity() == null)
            return false;
        if (other.getUserIdentity() != null && other.getUserIdentity().equals(this.getUserIdentity()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConnectionArn() == null) ? 0 : getVpcConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getUserIdentity() == null) ? 0 : getUserIdentity().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public VpcConnectionInfo clone() {
        try {
            return (VpcConnectionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.VpcConnectionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
