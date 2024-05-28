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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListMLModelTrainingJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMLModelTrainingJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of items to return (from 1 to 1024; the default is 10).
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be listed in
     * your DB cluster parameter group or an error will occur.
     * </p>
     */
    private String neptuneIamRoleArn;

    /**
     * <p>
     * The maximum number of items to return (from 1 to 1024; the default is 10).
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items to return (from 1 to 1024; the default is 10).
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of items to return (from 1 to 1024; the default is 10).
     * </p>
     * 
     * @return The maximum number of items to return (from 1 to 1024; the default is 10).
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of items to return (from 1 to 1024; the default is 10).
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items to return (from 1 to 1024; the default is 10).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLModelTrainingJobsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be listed in
     * your DB cluster parameter group or an error will occur.
     * </p>
     * 
     * @param neptuneIamRoleArn
     *        The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be
     *        listed in your DB cluster parameter group or an error will occur.
     */

    public void setNeptuneIamRoleArn(String neptuneIamRoleArn) {
        this.neptuneIamRoleArn = neptuneIamRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be listed in
     * your DB cluster parameter group or an error will occur.
     * </p>
     * 
     * @return The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be
     *         listed in your DB cluster parameter group or an error will occur.
     */

    public String getNeptuneIamRoleArn() {
        return this.neptuneIamRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be listed in
     * your DB cluster parameter group or an error will occur.
     * </p>
     * 
     * @param neptuneIamRoleArn
     *        The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be
     *        listed in your DB cluster parameter group or an error will occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMLModelTrainingJobsRequest withNeptuneIamRoleArn(String neptuneIamRoleArn) {
        setNeptuneIamRoleArn(neptuneIamRoleArn);
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
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getNeptuneIamRoleArn() != null)
            sb.append("NeptuneIamRoleArn: ").append(getNeptuneIamRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMLModelTrainingJobsRequest == false)
            return false;
        ListMLModelTrainingJobsRequest other = (ListMLModelTrainingJobsRequest) obj;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getNeptuneIamRoleArn() == null ^ this.getNeptuneIamRoleArn() == null)
            return false;
        if (other.getNeptuneIamRoleArn() != null && other.getNeptuneIamRoleArn().equals(this.getNeptuneIamRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getNeptuneIamRoleArn() == null) ? 0 : getNeptuneIamRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ListMLModelTrainingJobsRequest clone() {
        return (ListMLModelTrainingJobsRequest) super.clone();
    }

}
