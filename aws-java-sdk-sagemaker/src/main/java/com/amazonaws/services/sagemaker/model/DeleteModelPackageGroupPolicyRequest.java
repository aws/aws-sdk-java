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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackageGroupPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteModelPackageGroupPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model group for which to delete the policy.
     * </p>
     */
    private String modelPackageGroupName;

    /**
     * <p>
     * The name of the model group for which to delete the policy.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group for which to delete the policy.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group for which to delete the policy.
     * </p>
     * 
     * @return The name of the model group for which to delete the policy.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The name of the model group for which to delete the policy.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name of the model group for which to delete the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteModelPackageGroupPolicyRequest withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
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
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteModelPackageGroupPolicyRequest == false)
            return false;
        DeleteModelPackageGroupPolicyRequest other = (DeleteModelPackageGroupPolicyRequest) obj;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteModelPackageGroupPolicyRequest clone() {
        return (DeleteModelPackageGroupPolicyRequest) super.clone();
    }

}
