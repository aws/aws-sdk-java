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
 * Returns configuration information about the specified Amazon S3 access point. S3 access points are named network
 * endpoints that are attached to buckets that you can use to perform S3 object operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3AccessPointDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3AccessPointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point.
     * </p>
     */
    private String accessPointArn;
    /**
     * <p>
     * The name or alias of the access point.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The name of the S3 bucket associated with the specified access point.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Amazon Web Services account ID associated with the S3 bucket associated with this access point.
     * </p>
     */
    private String bucketAccountId;
    /**
     * <p>
     * The name of the specified access point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates whether this access point allows access from the public internet.
     * </p>
     */
    private String networkOrigin;

    private AwsS3AccountPublicAccessBlockDetails publicAccessBlockConfiguration;
    /**
     * <p>
     * Contains the virtual private cloud (VPC) configuration for the specified access point.
     * </p>
     */
    private AwsS3AccessPointVpcConfigurationDetails vpcConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point.
     * </p>
     * 
     * @param accessPointArn
     *        The Amazon Resource Name (ARN) of the access point.
     */

    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the access point.
     */

    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point.
     * </p>
     * 
     * @param accessPointArn
     *        The Amazon Resource Name (ARN) of the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointDetails withAccessPointArn(String accessPointArn) {
        setAccessPointArn(accessPointArn);
        return this;
    }

    /**
     * <p>
     * The name or alias of the access point.
     * </p>
     * 
     * @param alias
     *        The name or alias of the access point.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The name or alias of the access point.
     * </p>
     * 
     * @return The name or alias of the access point.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The name or alias of the access point.
     * </p>
     * 
     * @param alias
     *        The name or alias of the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointDetails withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket associated with the specified access point.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket associated with the specified access point.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket associated with the specified access point.
     * </p>
     * 
     * @return The name of the S3 bucket associated with the specified access point.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket associated with the specified access point.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket associated with the specified access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointDetails withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the S3 bucket associated with this access point.
     * </p>
     * 
     * @param bucketAccountId
     *        The Amazon Web Services account ID associated with the S3 bucket associated with this access point.
     */

    public void setBucketAccountId(String bucketAccountId) {
        this.bucketAccountId = bucketAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the S3 bucket associated with this access point.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the S3 bucket associated with this access point.
     */

    public String getBucketAccountId() {
        return this.bucketAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the S3 bucket associated with this access point.
     * </p>
     * 
     * @param bucketAccountId
     *        The Amazon Web Services account ID associated with the S3 bucket associated with this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointDetails withBucketAccountId(String bucketAccountId) {
        setBucketAccountId(bucketAccountId);
        return this;
    }

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

    public AwsS3AccessPointDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public internet.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public internet.
     */

    public void setNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public internet.
     * </p>
     * 
     * @return Indicates whether this access point allows access from the public internet.
     */

    public String getNetworkOrigin() {
        return this.networkOrigin;
    }

    /**
     * <p>
     * Indicates whether this access point allows access from the public internet.
     * </p>
     * 
     * @param networkOrigin
     *        Indicates whether this access point allows access from the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointDetails withNetworkOrigin(String networkOrigin) {
        setNetworkOrigin(networkOrigin);
        return this;
    }

    /**
     * @param publicAccessBlockConfiguration
     */

    public void setPublicAccessBlockConfiguration(AwsS3AccountPublicAccessBlockDetails publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * @return
     */

    public AwsS3AccountPublicAccessBlockDetails getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    /**
     * @param publicAccessBlockConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointDetails withPublicAccessBlockConfiguration(AwsS3AccountPublicAccessBlockDetails publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the virtual private cloud (VPC) configuration for the specified access point.
     * </p>
     * 
     * @param vpcConfiguration
     *        Contains the virtual private cloud (VPC) configuration for the specified access point.
     */

    public void setVpcConfiguration(AwsS3AccessPointVpcConfigurationDetails vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Contains the virtual private cloud (VPC) configuration for the specified access point.
     * </p>
     * 
     * @return Contains the virtual private cloud (VPC) configuration for the specified access point.
     */

    public AwsS3AccessPointVpcConfigurationDetails getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Contains the virtual private cloud (VPC) configuration for the specified access point.
     * </p>
     * 
     * @param vpcConfiguration
     *        Contains the virtual private cloud (VPC) configuration for the specified access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccessPointDetails withVpcConfiguration(AwsS3AccessPointVpcConfigurationDetails vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getAccessPointArn() != null)
            sb.append("AccessPointArn: ").append(getAccessPointArn()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getBucketAccountId() != null)
            sb.append("BucketAccountId: ").append(getBucketAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkOrigin() != null)
            sb.append("NetworkOrigin: ").append(getNetworkOrigin()).append(",");
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3AccessPointDetails == false)
            return false;
        AwsS3AccessPointDetails other = (AwsS3AccessPointDetails) obj;
        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getBucketAccountId() == null ^ this.getBucketAccountId() == null)
            return false;
        if (other.getBucketAccountId() != null && other.getBucketAccountId().equals(this.getBucketAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkOrigin() == null ^ this.getNetworkOrigin() == null)
            return false;
        if (other.getNetworkOrigin() != null && other.getNetworkOrigin().equals(this.getNetworkOrigin()) == false)
            return false;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null)
            return false;
        if (other.getPublicAccessBlockConfiguration() != null
                && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getBucketAccountId() == null) ? 0 : getBucketAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkOrigin() == null) ? 0 : getNetworkOrigin().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3AccessPointDetails clone() {
        try {
            return (AwsS3AccessPointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3AccessPointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
