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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID for the owner of the bucket for which you want to create an access point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name you want to assign to this access point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the bucket that you want to associate this access point with.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * If you include this field, Amazon S3 restricts access to this access point to requests from the specified Virtual
     * Private Cloud (VPC).
     * </p>
     */
    private VpcConfiguration vpcConfiguration;

    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    /**
     * <p>
     * The AWS account ID for the owner of the bucket for which you want to create an access point.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID for the owner of the bucket for which you want to create an access point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID for the owner of the bucket for which you want to create an access point.
     * </p>
     * 
     * @return The AWS account ID for the owner of the bucket for which you want to create an access point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID for the owner of the bucket for which you want to create an access point.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID for the owner of the bucket for which you want to create an access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name you want to assign to this access point.
     * </p>
     * 
     * @param name
     *        The name you want to assign to this access point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you want to assign to this access point.
     * </p>
     * 
     * @return The name you want to assign to this access point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you want to assign to this access point.
     * </p>
     * 
     * @param name
     *        The name you want to assign to this access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the bucket that you want to associate this access point with.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket that you want to associate this access point with.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket that you want to associate this access point with.
     * </p>
     * 
     * @return The name of the bucket that you want to associate this access point with.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the bucket that you want to associate this access point with.
     * </p>
     * 
     * @param bucket
     *        The name of the bucket that you want to associate this access point with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * If you include this field, Amazon S3 restricts access to this access point to requests from the specified Virtual
     * Private Cloud (VPC).
     * </p>
     * 
     * @param vpcConfiguration
     *        If you include this field, Amazon S3 restricts access to this access point to requests from the specified
     *        Virtual Private Cloud (VPC).
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * If you include this field, Amazon S3 restricts access to this access point to requests from the specified Virtual
     * Private Cloud (VPC).
     * </p>
     * 
     * @return If you include this field, Amazon S3 restricts access to this access point to requests from the specified
     *         Virtual Private Cloud (VPC).
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * If you include this field, Amazon S3 restricts access to this access point to requests from the specified Virtual
     * Private Cloud (VPC).
     * </p>
     * 
     * @param vpcConfiguration
     *        If you include this field, Amazon S3 restricts access to this access point to requests from the specified
     *        Virtual Private Cloud (VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withVpcConfiguration(VpcConfiguration vpcConfiguration) {
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

    public CreateAccessPointRequest withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessPointRequest == false)
            return false;
        CreateAccessPointRequest other = (CreateAccessPointRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessPointRequest clone() {
        return (CreateAccessPointRequest) super.clone();
    }

}
