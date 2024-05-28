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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelMLModelTransformJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelMLModelTransformJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the model transform job to be canceled.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of an IAM role that provides Neptune access to SageMaker and Amazon S3 resources. This must be listed in
     * your DB cluster parameter group or an error will occur.
     * </p>
     */
    private String neptuneIamRoleArn;
    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is stopped.
     * The default is <code>FALSE</code>.
     * </p>
     */
    private Boolean clean;

    /**
     * <p>
     * The unique ID of the model transform job to be canceled.
     * </p>
     * 
     * @param id
     *        The unique ID of the model transform job to be canceled.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the model transform job to be canceled.
     * </p>
     * 
     * @return The unique ID of the model transform job to be canceled.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the model transform job to be canceled.
     * </p>
     * 
     * @param id
     *        The unique ID of the model transform job to be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelMLModelTransformJobRequest withId(String id) {
        setId(id);
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

    public CancelMLModelTransformJobRequest withNeptuneIamRoleArn(String neptuneIamRoleArn) {
        setNeptuneIamRoleArn(neptuneIamRoleArn);
        return this;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is stopped.
     * The default is <code>FALSE</code>.
     * </p>
     * 
     * @param clean
     *        If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is
     *        stopped. The default is <code>FALSE</code>.
     */

    public void setClean(Boolean clean) {
        this.clean = clean;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is stopped.
     * The default is <code>FALSE</code>.
     * </p>
     * 
     * @return If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is
     *         stopped. The default is <code>FALSE</code>.
     */

    public Boolean getClean() {
        return this.clean;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is stopped.
     * The default is <code>FALSE</code>.
     * </p>
     * 
     * @param clean
     *        If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is
     *        stopped. The default is <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelMLModelTransformJobRequest withClean(Boolean clean) {
        setClean(clean);
        return this;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is stopped.
     * The default is <code>FALSE</code>.
     * </p>
     * 
     * @return If this flag is set to <code>TRUE</code>, all Neptune ML S3 artifacts should be deleted when the job is
     *         stopped. The default is <code>FALSE</code>.
     */

    public Boolean isClean() {
        return this.clean;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getNeptuneIamRoleArn() != null)
            sb.append("NeptuneIamRoleArn: ").append(getNeptuneIamRoleArn()).append(",");
        if (getClean() != null)
            sb.append("Clean: ").append(getClean());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelMLModelTransformJobRequest == false)
            return false;
        CancelMLModelTransformJobRequest other = (CancelMLModelTransformJobRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getNeptuneIamRoleArn() == null ^ this.getNeptuneIamRoleArn() == null)
            return false;
        if (other.getNeptuneIamRoleArn() != null && other.getNeptuneIamRoleArn().equals(this.getNeptuneIamRoleArn()) == false)
            return false;
        if (other.getClean() == null ^ this.getClean() == null)
            return false;
        if (other.getClean() != null && other.getClean().equals(this.getClean()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getNeptuneIamRoleArn() == null) ? 0 : getNeptuneIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClean() == null) ? 0 : getClean().hashCode());
        return hashCode;
    }

    @Override
    public CancelMLModelTransformJobRequest clone() {
        return (CancelMLModelTransformJobRequest) super.clone();
    }

}
