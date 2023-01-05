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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateFleetAdvisorCollector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetAdvisorCollectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the new Fleet Advisor collector, for example: <code>22fda70c-40d5-4acf-b233-a495bd8eb7f5</code>
     * </p>
     */
    private String collectorReferencedId;
    /**
     * <p>
     * The name of the new Fleet Advisor collector.
     * </p>
     */
    private String collectorName;
    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * The Amazon S3 bucket that the collector uses to store inventory metadata.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * The unique ID of the new Fleet Advisor collector, for example: <code>22fda70c-40d5-4acf-b233-a495bd8eb7f5</code>
     * </p>
     * 
     * @param collectorReferencedId
     *        The unique ID of the new Fleet Advisor collector, for example:
     *        <code>22fda70c-40d5-4acf-b233-a495bd8eb7f5</code>
     */

    public void setCollectorReferencedId(String collectorReferencedId) {
        this.collectorReferencedId = collectorReferencedId;
    }

    /**
     * <p>
     * The unique ID of the new Fleet Advisor collector, for example: <code>22fda70c-40d5-4acf-b233-a495bd8eb7f5</code>
     * </p>
     * 
     * @return The unique ID of the new Fleet Advisor collector, for example:
     *         <code>22fda70c-40d5-4acf-b233-a495bd8eb7f5</code>
     */

    public String getCollectorReferencedId() {
        return this.collectorReferencedId;
    }

    /**
     * <p>
     * The unique ID of the new Fleet Advisor collector, for example: <code>22fda70c-40d5-4acf-b233-a495bd8eb7f5</code>
     * </p>
     * 
     * @param collectorReferencedId
     *        The unique ID of the new Fleet Advisor collector, for example:
     *        <code>22fda70c-40d5-4acf-b233-a495bd8eb7f5</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetAdvisorCollectorResult withCollectorReferencedId(String collectorReferencedId) {
        setCollectorReferencedId(collectorReferencedId);
        return this;
    }

    /**
     * <p>
     * The name of the new Fleet Advisor collector.
     * </p>
     * 
     * @param collectorName
     *        The name of the new Fleet Advisor collector.
     */

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    /**
     * <p>
     * The name of the new Fleet Advisor collector.
     * </p>
     * 
     * @return The name of the new Fleet Advisor collector.
     */

    public String getCollectorName() {
        return this.collectorName;
    }

    /**
     * <p>
     * The name of the new Fleet Advisor collector.
     * </p>
     * 
     * @param collectorName
     *        The name of the new Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetAdvisorCollectorResult withCollectorName(String collectorName) {
        setCollectorName(collectorName);
        return this;
    }

    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     * 
     * @param description
     *        A summary description of the Fleet Advisor collector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     * 
     * @return A summary description of the Fleet Advisor collector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     * 
     * @param description
     *        A summary description of the Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetAdvisorCollectorResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The IAM role that grants permissions to access the specified Amazon S3 bucket.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     * 
     * @return The IAM role that grants permissions to access the specified Amazon S3 bucket.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetAdvisorCollectorResult withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the collector uses to store inventory metadata.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket that the collector uses to store inventory metadata.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the collector uses to store inventory metadata.
     * </p>
     * 
     * @return The Amazon S3 bucket that the collector uses to store inventory metadata.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the collector uses to store inventory metadata.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket that the collector uses to store inventory metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetAdvisorCollectorResult withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
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
        if (getCollectorReferencedId() != null)
            sb.append("CollectorReferencedId: ").append(getCollectorReferencedId()).append(",");
        if (getCollectorName() != null)
            sb.append("CollectorName: ").append(getCollectorName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetAdvisorCollectorResult == false)
            return false;
        CreateFleetAdvisorCollectorResult other = (CreateFleetAdvisorCollectorResult) obj;
        if (other.getCollectorReferencedId() == null ^ this.getCollectorReferencedId() == null)
            return false;
        if (other.getCollectorReferencedId() != null && other.getCollectorReferencedId().equals(this.getCollectorReferencedId()) == false)
            return false;
        if (other.getCollectorName() == null ^ this.getCollectorName() == null)
            return false;
        if (other.getCollectorName() != null && other.getCollectorName().equals(this.getCollectorName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectorReferencedId() == null) ? 0 : getCollectorReferencedId().hashCode());
        hashCode = prime * hashCode + ((getCollectorName() == null) ? 0 : getCollectorName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetAdvisorCollectorResult clone() {
        try {
            return (CreateFleetAdvisorCollectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
