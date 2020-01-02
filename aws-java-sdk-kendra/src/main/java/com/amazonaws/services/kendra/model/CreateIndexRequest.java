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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the new index.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also
     * the role used when you use the <code>BatchPutDocument</code> operation to index documents from an Amazon S3
     * bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * A description for the index.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name for the new index.
     * </p>
     * 
     * @param name
     *        The name for the new index.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new index.
     * </p>
     * 
     * @return The name for the new index.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new index.
     * </p>
     * 
     * @param name
     *        The name for the new index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also
     * the role used when you use the <code>BatchPutDocument</code> operation to index documents from an Amazon S3
     * bucket.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This
     *        is also the role used when you use the <code>BatchPutDocument</code> operation to index documents from an
     *        Amazon S3 bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also
     * the role used when you use the <code>BatchPutDocument</code> operation to index documents from an Amazon S3
     * bucket.
     * </p>
     * 
     * @return An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This
     *         is also the role used when you use the <code>BatchPutDocument</code> operation to index documents from an
     *         Amazon S3 bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also
     * the role used when you use the <code>BatchPutDocument</code> operation to index documents from an Amazon S3
     * bucket.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This
     *        is also the role used when you use the <code>BatchPutDocument</code> operation to index documents from an
     *        Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra.
     *        Amazon Kendra doesn't support asymmetric CMKs.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     * 
     * @return The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra.
     *         Amazon Kendra doesn't support asymmetric CMKs.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra. Amazon
     * Kendra doesn't support asymmetric CMKs.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by Amazon Kendra.
     *        Amazon Kendra doesn't support asymmetric CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * 
     * @param description
     *        A description for the index.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * 
     * @return A description for the index.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the index.
     * </p>
     * 
     * @param description
     *        A description for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withDescription(String description) {
        setDescription(description);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIndexRequest == false)
            return false;
        CreateIndexRequest other = (CreateIndexRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateIndexRequest clone() {
        return (CreateIndexRequest) super.clone();
    }

}
