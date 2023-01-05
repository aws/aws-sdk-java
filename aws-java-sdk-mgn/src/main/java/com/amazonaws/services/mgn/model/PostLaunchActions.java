/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Post Launch Actions to executed on the Test or Cutover instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PostLaunchActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostLaunchActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS Systems Manager Command's CloudWatch log group name.
     * </p>
     */
    private String cloudWatchLogGroupName;
    /**
     * <p>
     * Deployment type in which AWS Systems Manager Documents will be executed.
     * </p>
     */
    private String deployment;
    /**
     * <p>
     * AWS Systems Manager Command's logs S3 log bucket.
     * </p>
     */
    private String s3LogBucket;
    /**
     * <p>
     * AWS Systems Manager Command's logs S3 output key prefix.
     * </p>
     */
    private String s3OutputKeyPrefix;
    /**
     * <p>
     * AWS Systems Manager Documents.
     * </p>
     */
    private java.util.List<SsmDocument> ssmDocuments;

    /**
     * <p>
     * AWS Systems Manager Command's CloudWatch log group name.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        AWS Systems Manager Command's CloudWatch log group name.
     */

    public void setCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
    }

    /**
     * <p>
     * AWS Systems Manager Command's CloudWatch log group name.
     * </p>
     * 
     * @return AWS Systems Manager Command's CloudWatch log group name.
     */

    public String getCloudWatchLogGroupName() {
        return this.cloudWatchLogGroupName;
    }

    /**
     * <p>
     * AWS Systems Manager Command's CloudWatch log group name.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        AWS Systems Manager Command's CloudWatch log group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActions withCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        setCloudWatchLogGroupName(cloudWatchLogGroupName);
        return this;
    }

    /**
     * <p>
     * Deployment type in which AWS Systems Manager Documents will be executed.
     * </p>
     * 
     * @param deployment
     *        Deployment type in which AWS Systems Manager Documents will be executed.
     * @see PostLaunchActionsDeploymentType
     */

    public void setDeployment(String deployment) {
        this.deployment = deployment;
    }

    /**
     * <p>
     * Deployment type in which AWS Systems Manager Documents will be executed.
     * </p>
     * 
     * @return Deployment type in which AWS Systems Manager Documents will be executed.
     * @see PostLaunchActionsDeploymentType
     */

    public String getDeployment() {
        return this.deployment;
    }

    /**
     * <p>
     * Deployment type in which AWS Systems Manager Documents will be executed.
     * </p>
     * 
     * @param deployment
     *        Deployment type in which AWS Systems Manager Documents will be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostLaunchActionsDeploymentType
     */

    public PostLaunchActions withDeployment(String deployment) {
        setDeployment(deployment);
        return this;
    }

    /**
     * <p>
     * Deployment type in which AWS Systems Manager Documents will be executed.
     * </p>
     * 
     * @param deployment
     *        Deployment type in which AWS Systems Manager Documents will be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostLaunchActionsDeploymentType
     */

    public PostLaunchActions withDeployment(PostLaunchActionsDeploymentType deployment) {
        this.deployment = deployment.toString();
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Command's logs S3 log bucket.
     * </p>
     * 
     * @param s3LogBucket
     *        AWS Systems Manager Command's logs S3 log bucket.
     */

    public void setS3LogBucket(String s3LogBucket) {
        this.s3LogBucket = s3LogBucket;
    }

    /**
     * <p>
     * AWS Systems Manager Command's logs S3 log bucket.
     * </p>
     * 
     * @return AWS Systems Manager Command's logs S3 log bucket.
     */

    public String getS3LogBucket() {
        return this.s3LogBucket;
    }

    /**
     * <p>
     * AWS Systems Manager Command's logs S3 log bucket.
     * </p>
     * 
     * @param s3LogBucket
     *        AWS Systems Manager Command's logs S3 log bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActions withS3LogBucket(String s3LogBucket) {
        setS3LogBucket(s3LogBucket);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Command's logs S3 output key prefix.
     * </p>
     * 
     * @param s3OutputKeyPrefix
     *        AWS Systems Manager Command's logs S3 output key prefix.
     */

    public void setS3OutputKeyPrefix(String s3OutputKeyPrefix) {
        this.s3OutputKeyPrefix = s3OutputKeyPrefix;
    }

    /**
     * <p>
     * AWS Systems Manager Command's logs S3 output key prefix.
     * </p>
     * 
     * @return AWS Systems Manager Command's logs S3 output key prefix.
     */

    public String getS3OutputKeyPrefix() {
        return this.s3OutputKeyPrefix;
    }

    /**
     * <p>
     * AWS Systems Manager Command's logs S3 output key prefix.
     * </p>
     * 
     * @param s3OutputKeyPrefix
     *        AWS Systems Manager Command's logs S3 output key prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActions withS3OutputKeyPrefix(String s3OutputKeyPrefix) {
        setS3OutputKeyPrefix(s3OutputKeyPrefix);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Documents.
     * </p>
     * 
     * @return AWS Systems Manager Documents.
     */

    public java.util.List<SsmDocument> getSsmDocuments() {
        return ssmDocuments;
    }

    /**
     * <p>
     * AWS Systems Manager Documents.
     * </p>
     * 
     * @param ssmDocuments
     *        AWS Systems Manager Documents.
     */

    public void setSsmDocuments(java.util.Collection<SsmDocument> ssmDocuments) {
        if (ssmDocuments == null) {
            this.ssmDocuments = null;
            return;
        }

        this.ssmDocuments = new java.util.ArrayList<SsmDocument>(ssmDocuments);
    }

    /**
     * <p>
     * AWS Systems Manager Documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSsmDocuments(java.util.Collection)} or {@link #withSsmDocuments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ssmDocuments
     *        AWS Systems Manager Documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActions withSsmDocuments(SsmDocument... ssmDocuments) {
        if (this.ssmDocuments == null) {
            setSsmDocuments(new java.util.ArrayList<SsmDocument>(ssmDocuments.length));
        }
        for (SsmDocument ele : ssmDocuments) {
            this.ssmDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Documents.
     * </p>
     * 
     * @param ssmDocuments
     *        AWS Systems Manager Documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActions withSsmDocuments(java.util.Collection<SsmDocument> ssmDocuments) {
        setSsmDocuments(ssmDocuments);
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
        if (getCloudWatchLogGroupName() != null)
            sb.append("CloudWatchLogGroupName: ").append(getCloudWatchLogGroupName()).append(",");
        if (getDeployment() != null)
            sb.append("Deployment: ").append(getDeployment()).append(",");
        if (getS3LogBucket() != null)
            sb.append("S3LogBucket: ").append(getS3LogBucket()).append(",");
        if (getS3OutputKeyPrefix() != null)
            sb.append("S3OutputKeyPrefix: ").append(getS3OutputKeyPrefix()).append(",");
        if (getSsmDocuments() != null)
            sb.append("SsmDocuments: ").append(getSsmDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostLaunchActions == false)
            return false;
        PostLaunchActions other = (PostLaunchActions) obj;
        if (other.getCloudWatchLogGroupName() == null ^ this.getCloudWatchLogGroupName() == null)
            return false;
        if (other.getCloudWatchLogGroupName() != null && other.getCloudWatchLogGroupName().equals(this.getCloudWatchLogGroupName()) == false)
            return false;
        if (other.getDeployment() == null ^ this.getDeployment() == null)
            return false;
        if (other.getDeployment() != null && other.getDeployment().equals(this.getDeployment()) == false)
            return false;
        if (other.getS3LogBucket() == null ^ this.getS3LogBucket() == null)
            return false;
        if (other.getS3LogBucket() != null && other.getS3LogBucket().equals(this.getS3LogBucket()) == false)
            return false;
        if (other.getS3OutputKeyPrefix() == null ^ this.getS3OutputKeyPrefix() == null)
            return false;
        if (other.getS3OutputKeyPrefix() != null && other.getS3OutputKeyPrefix().equals(this.getS3OutputKeyPrefix()) == false)
            return false;
        if (other.getSsmDocuments() == null ^ this.getSsmDocuments() == null)
            return false;
        if (other.getSsmDocuments() != null && other.getSsmDocuments().equals(this.getSsmDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogGroupName() == null) ? 0 : getCloudWatchLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeployment() == null) ? 0 : getDeployment().hashCode());
        hashCode = prime * hashCode + ((getS3LogBucket() == null) ? 0 : getS3LogBucket().hashCode());
        hashCode = prime * hashCode + ((getS3OutputKeyPrefix() == null) ? 0 : getS3OutputKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getSsmDocuments() == null) ? 0 : getSsmDocuments().hashCode());
        return hashCode;
    }

    @Override
    public PostLaunchActions clone() {
        try {
            return (PostLaunchActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.PostLaunchActionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
