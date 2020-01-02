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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the specified access point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the bucket associated with the specified access point.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Indicates whether this access point allows access from the public Internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public Internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public Internet, subject to the access point and bucket access
     * policies.
     * </p>
     */
    private String networkOrigin;
    /**
     * <p>
     * Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;

    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;
    /**
     * <p>
     * The date and time when the specified access point was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The name of the specified access point.
     * </p>
     * 
     * @param name
     *        The name of the specified access point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified access point.
     * </p>
     * 
     * @return The name of the specified access point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified access point.
     * </p>
     * 
     * @param name
     *        The name of the specified access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the bucket associated with the specified access point.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket associated with the specified access point.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket associated with the specified access point.
     * </p>
     * 
     * @return The name of the bucket associated with the specified access point.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the bucket associated with the specified access point.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket associated with the specified access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointResult withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public Internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public Internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public Internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public Internet. If
     *        <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *        <code>VPC</code>, and the access point doesn't allow access from the public Internet. Otherwise,
     *        <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *        Internet, subject to the access point and bucket access policies.
     * @see NetworkOrigin
     */

    public void setNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public Internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public Internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public Internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @return Indicates whether this access point allows access from the public Internet. If
     *         <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *         <code>VPC</code>, and the access point doesn't allow access from the public Internet. Otherwise,
     *         <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *         Internet, subject to the access point and bucket access policies.
     * @see NetworkOrigin
     */

    public String getNetworkOrigin() {
        return this.networkOrigin;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public Internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public Internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public Internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public Internet. If
     *        <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *        <code>VPC</code>, and the access point doesn't allow access from the public Internet. Otherwise,
     *        <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *        Internet, subject to the access point and bucket access policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkOrigin
     */

    public GetAccessPointResult withNetworkOrigin(String networkOrigin) {
        setNetworkOrigin(networkOrigin);
        return this;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public Internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public Internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public Internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public Internet. If
     *        <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *        <code>VPC</code>, and the access point doesn't allow access from the public Internet. Otherwise,
     *        <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *        Internet, subject to the access point and bucket access policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkOrigin
     */

    public GetAccessPointResult withNetworkOrigin(NetworkOrigin networkOrigin) {
        this.networkOrigin = networkOrigin.toString();
        return this;
    }

    /**
     * <p>
     * Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
     * </p>
     * 
     * @param vpcConfiguration
     *        Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
     * </p>
     * 
     * @return Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
     * </p>
     * 
     * @param vpcConfiguration
     *        Contains the Virtual Private Cloud (VPC) configuration for the specified access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointResult withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * @param publicAccessBlockConfiguration
     */

    public void setPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * @return
     */

    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    /**
     * @param publicAccessBlockConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointResult withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
        return this;
    }

    /**
     * <p>
     * The date and time when the specified access point was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the specified access point was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the specified access point was created.
     * </p>
     * 
     * @return The date and time when the specified access point was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the specified access point was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the specified access point was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getNetworkOrigin() != null)
            sb.append("NetworkOrigin: ").append(getNetworkOrigin()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessPointResult == false)
            return false;
        GetAccessPointResult other = (GetAccessPointResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getNetworkOrigin() == null ^ this.getNetworkOrigin() == null)
            return false;
        if (other.getNetworkOrigin() != null && other.getNetworkOrigin().equals(this.getNetworkOrigin()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null)
            return false;
        if (other.getPublicAccessBlockConfiguration() != null
                && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getNetworkOrigin() == null) ? 0 : getNetworkOrigin().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessPointResult clone() {
        try {
            return (GetAccessPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
