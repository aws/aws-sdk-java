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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteAutoScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAutoScalingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     */
    private String autoScalingConfigurationArn;
    /**
     * <p>
     * Set to <code>true</code> to delete all of the revisions associated with the
     * <code>AutoScalingConfigurationArn</code> parameter value.
     * </p>
     * <p>
     * When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon Resource
     * Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     * </p>
     */
    private Boolean deleteAllRevisions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want to delete.</p>
     *        <p>
     *        The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either
     *        <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't
     *        specified, the latest active revision is deleted.
     */

    public void setAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        this.autoScalingConfigurationArn = autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want to delete.</p>
     *         <p>
     *         The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either
     *         <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't
     *         specified, the latest active revision is deleted.
     */

    public String getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want to delete.</p>
     *        <p>
     *        The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either
     *        <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't
     *        specified, the latest active revision is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAutoScalingConfigurationRequest withAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        setAutoScalingConfigurationArn(autoScalingConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete all of the revisions associated with the
     * <code>AutoScalingConfigurationArn</code> parameter value.
     * </p>
     * <p>
     * When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon Resource
     * Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     * </p>
     * 
     * @param deleteAllRevisions
     *        Set to <code>true</code> to delete all of the revisions associated with the
     *        <code>AutoScalingConfigurationArn</code> parameter value.</p>
     *        <p>
     *        When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon
     *        Resource Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     */

    public void setDeleteAllRevisions(Boolean deleteAllRevisions) {
        this.deleteAllRevisions = deleteAllRevisions;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete all of the revisions associated with the
     * <code>AutoScalingConfigurationArn</code> parameter value.
     * </p>
     * <p>
     * When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon Resource
     * Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to delete all of the revisions associated with the
     *         <code>AutoScalingConfigurationArn</code> parameter value.</p>
     *         <p>
     *         When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon
     *         Resource Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     */

    public Boolean getDeleteAllRevisions() {
        return this.deleteAllRevisions;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete all of the revisions associated with the
     * <code>AutoScalingConfigurationArn</code> parameter value.
     * </p>
     * <p>
     * When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon Resource
     * Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     * </p>
     * 
     * @param deleteAllRevisions
     *        Set to <code>true</code> to delete all of the revisions associated with the
     *        <code>AutoScalingConfigurationArn</code> parameter value.</p>
     *        <p>
     *        When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon
     *        Resource Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAutoScalingConfigurationRequest withDeleteAllRevisions(Boolean deleteAllRevisions) {
        setDeleteAllRevisions(deleteAllRevisions);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete all of the revisions associated with the
     * <code>AutoScalingConfigurationArn</code> parameter value.
     * </p>
     * <p>
     * When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon Resource
     * Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to delete all of the revisions associated with the
     *         <code>AutoScalingConfigurationArn</code> parameter value.</p>
     *         <p>
     *         When <code>DeleteAllRevisions</code> is set to <code>true</code>, the only valid value for the Amazon
     *         Resource Name (ARN) is a partial ARN ending with: <code>.../name</code>.
     */

    public Boolean isDeleteAllRevisions() {
        return this.deleteAllRevisions;
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
        if (getAutoScalingConfigurationArn() != null)
            sb.append("AutoScalingConfigurationArn: ").append(getAutoScalingConfigurationArn()).append(",");
        if (getDeleteAllRevisions() != null)
            sb.append("DeleteAllRevisions: ").append(getDeleteAllRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAutoScalingConfigurationRequest == false)
            return false;
        DeleteAutoScalingConfigurationRequest other = (DeleteAutoScalingConfigurationRequest) obj;
        if (other.getAutoScalingConfigurationArn() == null ^ this.getAutoScalingConfigurationArn() == null)
            return false;
        if (other.getAutoScalingConfigurationArn() != null && other.getAutoScalingConfigurationArn().equals(this.getAutoScalingConfigurationArn()) == false)
            return false;
        if (other.getDeleteAllRevisions() == null ^ this.getDeleteAllRevisions() == null)
            return false;
        if (other.getDeleteAllRevisions() != null && other.getDeleteAllRevisions().equals(this.getDeleteAllRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingConfigurationArn() == null) ? 0 : getAutoScalingConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getDeleteAllRevisions() == null) ? 0 : getDeleteAllRevisions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAutoScalingConfigurationRequest clone() {
        return (DeleteAutoScalingConfigurationRequest) super.clone();
    }

}
