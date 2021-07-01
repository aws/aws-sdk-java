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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackageGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelPackageGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of summaries of the model groups in your Amazon Web Services account.
     * </p>
     */
    private java.util.List<ModelPackageGroupSummary> modelPackageGroupSummaryList;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use it in
     * the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of summaries of the model groups in your Amazon Web Services account.
     * </p>
     * 
     * @return A list of summaries of the model groups in your Amazon Web Services account.
     */

    public java.util.List<ModelPackageGroupSummary> getModelPackageGroupSummaryList() {
        return modelPackageGroupSummaryList;
    }

    /**
     * <p>
     * A list of summaries of the model groups in your Amazon Web Services account.
     * </p>
     * 
     * @param modelPackageGroupSummaryList
     *        A list of summaries of the model groups in your Amazon Web Services account.
     */

    public void setModelPackageGroupSummaryList(java.util.Collection<ModelPackageGroupSummary> modelPackageGroupSummaryList) {
        if (modelPackageGroupSummaryList == null) {
            this.modelPackageGroupSummaryList = null;
            return;
        }

        this.modelPackageGroupSummaryList = new java.util.ArrayList<ModelPackageGroupSummary>(modelPackageGroupSummaryList);
    }

    /**
     * <p>
     * A list of summaries of the model groups in your Amazon Web Services account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelPackageGroupSummaryList(java.util.Collection)} or
     * {@link #withModelPackageGroupSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param modelPackageGroupSummaryList
     *        A list of summaries of the model groups in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackageGroupsResult withModelPackageGroupSummaryList(ModelPackageGroupSummary... modelPackageGroupSummaryList) {
        if (this.modelPackageGroupSummaryList == null) {
            setModelPackageGroupSummaryList(new java.util.ArrayList<ModelPackageGroupSummary>(modelPackageGroupSummaryList.length));
        }
        for (ModelPackageGroupSummary ele : modelPackageGroupSummaryList) {
            this.modelPackageGroupSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of summaries of the model groups in your Amazon Web Services account.
     * </p>
     * 
     * @param modelPackageGroupSummaryList
     *        A list of summaries of the model groups in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackageGroupsResult withModelPackageGroupSummaryList(java.util.Collection<ModelPackageGroupSummary> modelPackageGroupSummaryList) {
        setModelPackageGroupSummaryList(modelPackageGroupSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use
     *        it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use it in
     * the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use
     *         it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of model groups, use
     *        it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelPackageGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getModelPackageGroupSummaryList() != null)
            sb.append("ModelPackageGroupSummaryList: ").append(getModelPackageGroupSummaryList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelPackageGroupsResult == false)
            return false;
        ListModelPackageGroupsResult other = (ListModelPackageGroupsResult) obj;
        if (other.getModelPackageGroupSummaryList() == null ^ this.getModelPackageGroupSummaryList() == null)
            return false;
        if (other.getModelPackageGroupSummaryList() != null && other.getModelPackageGroupSummaryList().equals(this.getModelPackageGroupSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageGroupSummaryList() == null) ? 0 : getModelPackageGroupSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListModelPackageGroupsResult clone() {
        try {
            return (ListModelPackageGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
