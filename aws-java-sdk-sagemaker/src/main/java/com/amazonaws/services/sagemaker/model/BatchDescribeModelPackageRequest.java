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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/BatchDescribeModelPackage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeModelPackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Amazon Resource Name (ARN) of the model package groups.
     * </p>
     */
    private java.util.List<String> modelPackageArnList;

    /**
     * <p>
     * The list of Amazon Resource Name (ARN) of the model package groups.
     * </p>
     * 
     * @return The list of Amazon Resource Name (ARN) of the model package groups.
     */

    public java.util.List<String> getModelPackageArnList() {
        return modelPackageArnList;
    }

    /**
     * <p>
     * The list of Amazon Resource Name (ARN) of the model package groups.
     * </p>
     * 
     * @param modelPackageArnList
     *        The list of Amazon Resource Name (ARN) of the model package groups.
     */

    public void setModelPackageArnList(java.util.Collection<String> modelPackageArnList) {
        if (modelPackageArnList == null) {
            this.modelPackageArnList = null;
            return;
        }

        this.modelPackageArnList = new java.util.ArrayList<String>(modelPackageArnList);
    }

    /**
     * <p>
     * The list of Amazon Resource Name (ARN) of the model package groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelPackageArnList(java.util.Collection)} or {@link #withModelPackageArnList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param modelPackageArnList
     *        The list of Amazon Resource Name (ARN) of the model package groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageRequest withModelPackageArnList(String... modelPackageArnList) {
        if (this.modelPackageArnList == null) {
            setModelPackageArnList(new java.util.ArrayList<String>(modelPackageArnList.length));
        }
        for (String ele : modelPackageArnList) {
            this.modelPackageArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon Resource Name (ARN) of the model package groups.
     * </p>
     * 
     * @param modelPackageArnList
     *        The list of Amazon Resource Name (ARN) of the model package groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageRequest withModelPackageArnList(java.util.Collection<String> modelPackageArnList) {
        setModelPackageArnList(modelPackageArnList);
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
        if (getModelPackageArnList() != null)
            sb.append("ModelPackageArnList: ").append(getModelPackageArnList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeModelPackageRequest == false)
            return false;
        BatchDescribeModelPackageRequest other = (BatchDescribeModelPackageRequest) obj;
        if (other.getModelPackageArnList() == null ^ this.getModelPackageArnList() == null)
            return false;
        if (other.getModelPackageArnList() != null && other.getModelPackageArnList().equals(this.getModelPackageArnList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageArnList() == null) ? 0 : getModelPackageArnList().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeModelPackageRequest clone() {
        return (BatchDescribeModelPackageRequest) super.clone();
    }

}
