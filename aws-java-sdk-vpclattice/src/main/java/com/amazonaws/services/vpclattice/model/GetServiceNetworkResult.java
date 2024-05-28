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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceNetworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of IAM policy.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The date and time that the service network was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the service network.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time of the last update, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the service network.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of services associated with the service network.
     * </p>
     */
    private Long numberOfAssociatedServices;
    /**
     * <p>
     * The number of VPCs associated with the service network.
     * </p>
     */
    private Long numberOfAssociatedVPCs;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service network.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service network.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @return The type of IAM policy.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public GetServiceNetworkResult withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * 
     * @param authType
     *        The type of IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public GetServiceNetworkResult withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the service network was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the service network was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the service network was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the service network was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the service network was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the service network was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @param id
     *        The ID of the service network.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @return The ID of the service network.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the service network.
     * </p>
     * 
     * @param id
     *        The ID of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time of the last update, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time of the last update, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time of the last update, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time of the last update, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time of the last update, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time of the last update, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @param name
     *        The name of the service network.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @return The name of the service network.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service network.
     * </p>
     * 
     * @param name
     *        The name of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The number of services associated with the service network.
     * </p>
     * 
     * @param numberOfAssociatedServices
     *        The number of services associated with the service network.
     */

    public void setNumberOfAssociatedServices(Long numberOfAssociatedServices) {
        this.numberOfAssociatedServices = numberOfAssociatedServices;
    }

    /**
     * <p>
     * The number of services associated with the service network.
     * </p>
     * 
     * @return The number of services associated with the service network.
     */

    public Long getNumberOfAssociatedServices() {
        return this.numberOfAssociatedServices;
    }

    /**
     * <p>
     * The number of services associated with the service network.
     * </p>
     * 
     * @param numberOfAssociatedServices
     *        The number of services associated with the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkResult withNumberOfAssociatedServices(Long numberOfAssociatedServices) {
        setNumberOfAssociatedServices(numberOfAssociatedServices);
        return this;
    }

    /**
     * <p>
     * The number of VPCs associated with the service network.
     * </p>
     * 
     * @param numberOfAssociatedVPCs
     *        The number of VPCs associated with the service network.
     */

    public void setNumberOfAssociatedVPCs(Long numberOfAssociatedVPCs) {
        this.numberOfAssociatedVPCs = numberOfAssociatedVPCs;
    }

    /**
     * <p>
     * The number of VPCs associated with the service network.
     * </p>
     * 
     * @return The number of VPCs associated with the service network.
     */

    public Long getNumberOfAssociatedVPCs() {
        return this.numberOfAssociatedVPCs;
    }

    /**
     * <p>
     * The number of VPCs associated with the service network.
     * </p>
     * 
     * @param numberOfAssociatedVPCs
     *        The number of VPCs associated with the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkResult withNumberOfAssociatedVPCs(Long numberOfAssociatedVPCs) {
        setNumberOfAssociatedVPCs(numberOfAssociatedVPCs);
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
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNumberOfAssociatedServices() != null)
            sb.append("NumberOfAssociatedServices: ").append(getNumberOfAssociatedServices()).append(",");
        if (getNumberOfAssociatedVPCs() != null)
            sb.append("NumberOfAssociatedVPCs: ").append(getNumberOfAssociatedVPCs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceNetworkResult == false)
            return false;
        GetServiceNetworkResult other = (GetServiceNetworkResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNumberOfAssociatedServices() == null ^ this.getNumberOfAssociatedServices() == null)
            return false;
        if (other.getNumberOfAssociatedServices() != null && other.getNumberOfAssociatedServices().equals(this.getNumberOfAssociatedServices()) == false)
            return false;
        if (other.getNumberOfAssociatedVPCs() == null ^ this.getNumberOfAssociatedVPCs() == null)
            return false;
        if (other.getNumberOfAssociatedVPCs() != null && other.getNumberOfAssociatedVPCs().equals(this.getNumberOfAssociatedVPCs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAssociatedServices() == null) ? 0 : getNumberOfAssociatedServices().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAssociatedVPCs() == null) ? 0 : getNumberOfAssociatedVPCs().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceNetworkResult clone() {
        try {
            return (GetServiceNetworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
