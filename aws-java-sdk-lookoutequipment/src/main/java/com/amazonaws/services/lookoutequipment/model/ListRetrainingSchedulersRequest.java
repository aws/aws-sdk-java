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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListRetrainingSchedulers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRetrainingSchedulersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose machine learning models begin with the value you
     * specify.
     * </p>
     */
    private String modelNameBeginsWith;
    /**
     * <p>
     * Specify this field to only list retraining schedulers whose status matches the value you specify.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the number of results exceeds the maximum, a pagination token is returned. Use the token in the request to
     * show the next page of retraining schedulers.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of retraining schedulers to list.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose machine learning models begin with the value you
     * specify.
     * </p>
     * 
     * @param modelNameBeginsWith
     *        Specify this field to only list retraining schedulers whose machine learning models begin with the value
     *        you specify.
     */

    public void setModelNameBeginsWith(String modelNameBeginsWith) {
        this.modelNameBeginsWith = modelNameBeginsWith;
    }

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose machine learning models begin with the value you
     * specify.
     * </p>
     * 
     * @return Specify this field to only list retraining schedulers whose machine learning models begin with the value
     *         you specify.
     */

    public String getModelNameBeginsWith() {
        return this.modelNameBeginsWith;
    }

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose machine learning models begin with the value you
     * specify.
     * </p>
     * 
     * @param modelNameBeginsWith
     *        Specify this field to only list retraining schedulers whose machine learning models begin with the value
     *        you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrainingSchedulersRequest withModelNameBeginsWith(String modelNameBeginsWith) {
        setModelNameBeginsWith(modelNameBeginsWith);
        return this;
    }

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose status matches the value you specify.
     * </p>
     * 
     * @param status
     *        Specify this field to only list retraining schedulers whose status matches the value you specify.
     * @see RetrainingSchedulerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose status matches the value you specify.
     * </p>
     * 
     * @return Specify this field to only list retraining schedulers whose status matches the value you specify.
     * @see RetrainingSchedulerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose status matches the value you specify.
     * </p>
     * 
     * @param status
     *        Specify this field to only list retraining schedulers whose status matches the value you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public ListRetrainingSchedulersRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specify this field to only list retraining schedulers whose status matches the value you specify.
     * </p>
     * 
     * @param status
     *        Specify this field to only list retraining schedulers whose status matches the value you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public ListRetrainingSchedulersRequest withStatus(RetrainingSchedulerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the number of results exceeds the maximum, a pagination token is returned. Use the token in the request to
     * show the next page of retraining schedulers.
     * </p>
     * 
     * @param nextToken
     *        If the number of results exceeds the maximum, a pagination token is returned. Use the token in the request
     *        to show the next page of retraining schedulers.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of results exceeds the maximum, a pagination token is returned. Use the token in the request to
     * show the next page of retraining schedulers.
     * </p>
     * 
     * @return If the number of results exceeds the maximum, a pagination token is returned. Use the token in the
     *         request to show the next page of retraining schedulers.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of results exceeds the maximum, a pagination token is returned. Use the token in the request to
     * show the next page of retraining schedulers.
     * </p>
     * 
     * @param nextToken
     *        If the number of results exceeds the maximum, a pagination token is returned. Use the token in the request
     *        to show the next page of retraining schedulers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrainingSchedulersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of retraining schedulers to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of retraining schedulers to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of retraining schedulers to list.
     * </p>
     * 
     * @return Specifies the maximum number of retraining schedulers to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of retraining schedulers to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of retraining schedulers to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrainingSchedulersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getModelNameBeginsWith() != null)
            sb.append("ModelNameBeginsWith: ").append(getModelNameBeginsWith()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRetrainingSchedulersRequest == false)
            return false;
        ListRetrainingSchedulersRequest other = (ListRetrainingSchedulersRequest) obj;
        if (other.getModelNameBeginsWith() == null ^ this.getModelNameBeginsWith() == null)
            return false;
        if (other.getModelNameBeginsWith() != null && other.getModelNameBeginsWith().equals(this.getModelNameBeginsWith()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelNameBeginsWith() == null) ? 0 : getModelNameBeginsWith().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRetrainingSchedulersRequest clone() {
        return (ListRetrainingSchedulersRequest) super.clone();
    }

}
