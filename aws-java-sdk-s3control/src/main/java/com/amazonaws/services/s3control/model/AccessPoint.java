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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An access point used to access a bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AccessPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPoint implements Serializable, Cloneable {

    /**
     * <p>
     * The name of this access point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public internet, subject to the access point and bucket access
     * policies.
     * </p>
     */
    private String networkOrigin;
    /**
     * <p>
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     * </p>
     * <note>
     * <p>
     * This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other AWS
     * services.
     * </p>
     * </note>
     */
    private VpcConfiguration vpcConfiguration;
    /**
     * <p>
     * The name of the bucket associated with this access point.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The ARN for the access point.
     * </p>
     */
    private String accessPointArn;

    /**
     * <p>
     * The name of this access point.
     * </p>
     * 
     * @param name
     *        The name of this access point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this access point.
     * </p>
     * 
     * @return The name of this access point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this access point.
     * </p>
     * 
     * @param name
     *        The name of this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPoint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public internet. If
     *        <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *        <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise,
     *        <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *        internet, subject to the access point and bucket access policies.
     * @see NetworkOrigin
     */

    public void setNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @return Indicates whether this access point allows access from the public internet. If
     *         <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *         <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise,
     *         <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *         internet, subject to the access point and bucket access policies.
     * @see NetworkOrigin
     */

    public String getNetworkOrigin() {
        return this.networkOrigin;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public internet. If
     *        <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *        <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise,
     *        <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *        internet, subject to the access point and bucket access policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkOrigin
     */

    public AccessPoint withNetworkOrigin(String networkOrigin) {
        setNetworkOrigin(networkOrigin);
        return this;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is
     * specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point
     * doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>,
     * and the access point allows access from the public internet, subject to the access point and bucket access
     * policies.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public internet. If
     *        <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is
     *        <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise,
     *        <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public
     *        internet, subject to the access point and bucket access policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkOrigin
     */

    public AccessPoint withNetworkOrigin(NetworkOrigin networkOrigin) {
        this.networkOrigin = networkOrigin.toString();
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     * </p>
     * <note>
     * <p>
     * This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other AWS
     * services.
     * </p>
     * </note>
     * 
     * @param vpcConfiguration
     *        The virtual private cloud (VPC) configuration for this access point, if one exists.</p> <note>
     *        <p>
     *        This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other
     *        AWS services.
     *        </p>
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     * </p>
     * <note>
     * <p>
     * This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other AWS
     * services.
     * </p>
     * </note>
     * 
     * @return The virtual private cloud (VPC) configuration for this access point, if one exists.</p> <note>
     *         <p>
     *         This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other
     *         AWS services.
     *         </p>
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) configuration for this access point, if one exists.
     * </p>
     * <note>
     * <p>
     * This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other AWS
     * services.
     * </p>
     * </note>
     * 
     * @param vpcConfiguration
     *        The virtual private cloud (VPC) configuration for this access point, if one exists.</p> <note>
     *        <p>
     *        This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other
     *        AWS services.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPoint withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the bucket associated with this access point.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket associated with this access point.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket associated with this access point.
     * </p>
     * 
     * @return The name of the bucket associated with this access point.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the bucket associated with this access point.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket associated with this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPoint withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The ARN for the access point.
     * </p>
     * 
     * @param accessPointArn
     *        The ARN for the access point.
     */

    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The ARN for the access point.
     * </p>
     * 
     * @return The ARN for the access point.
     */

    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    /**
     * <p>
     * The ARN for the access point.
     * </p>
     * 
     * @param accessPointArn
     *        The ARN for the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPoint withAccessPointArn(String accessPointArn) {
        setAccessPointArn(accessPointArn);
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
        if (getNetworkOrigin() != null)
            sb.append("NetworkOrigin: ").append(getNetworkOrigin()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getAccessPointArn() != null)
            sb.append("AccessPointArn: ").append(getAccessPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPoint == false)
            return false;
        AccessPoint other = (AccessPoint) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkOrigin() == null ^ this.getNetworkOrigin() == null)
            return false;
        if (other.getNetworkOrigin() != null && other.getNetworkOrigin().equals(this.getNetworkOrigin()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkOrigin() == null) ? 0 : getNetworkOrigin().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        return hashCode;
    }

    @Override
    public AccessPoint clone() {
        try {
            return (AccessPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
