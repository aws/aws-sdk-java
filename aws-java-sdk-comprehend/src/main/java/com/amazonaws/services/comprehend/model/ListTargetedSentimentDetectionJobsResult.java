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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTargetedSentimentDetectionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTargetedSentimentDetectionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<TargetedSentimentDetectionJobProperties> targetedSentimentDetectionJobPropertiesList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @return A list containing the properties of each job that is returned.
     */

    public java.util.List<TargetedSentimentDetectionJobProperties> getTargetedSentimentDetectionJobPropertiesList() {
        return targetedSentimentDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param targetedSentimentDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     */

    public void setTargetedSentimentDetectionJobPropertiesList(
            java.util.Collection<TargetedSentimentDetectionJobProperties> targetedSentimentDetectionJobPropertiesList) {
        if (targetedSentimentDetectionJobPropertiesList == null) {
            this.targetedSentimentDetectionJobPropertiesList = null;
            return;
        }

        this.targetedSentimentDetectionJobPropertiesList = new java.util.ArrayList<TargetedSentimentDetectionJobProperties>(
                targetedSentimentDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetedSentimentDetectionJobPropertiesList(java.util.Collection)} or
     * {@link #withTargetedSentimentDetectionJobPropertiesList(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param targetedSentimentDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetedSentimentDetectionJobsResult withTargetedSentimentDetectionJobPropertiesList(
            TargetedSentimentDetectionJobProperties... targetedSentimentDetectionJobPropertiesList) {
        if (this.targetedSentimentDetectionJobPropertiesList == null) {
            setTargetedSentimentDetectionJobPropertiesList(new java.util.ArrayList<TargetedSentimentDetectionJobProperties>(
                    targetedSentimentDetectionJobPropertiesList.length));
        }
        for (TargetedSentimentDetectionJobProperties ele : targetedSentimentDetectionJobPropertiesList) {
            this.targetedSentimentDetectionJobPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param targetedSentimentDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetedSentimentDetectionJobsResult withTargetedSentimentDetectionJobPropertiesList(
            java.util.Collection<TargetedSentimentDetectionJobProperties> targetedSentimentDetectionJobPropertiesList) {
        setTargetedSentimentDetectionJobPropertiesList(targetedSentimentDetectionJobPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetedSentimentDetectionJobsResult withNextToken(String nextToken) {
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
        if (getTargetedSentimentDetectionJobPropertiesList() != null)
            sb.append("TargetedSentimentDetectionJobPropertiesList: ").append(getTargetedSentimentDetectionJobPropertiesList()).append(",");
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

        if (obj instanceof ListTargetedSentimentDetectionJobsResult == false)
            return false;
        ListTargetedSentimentDetectionJobsResult other = (ListTargetedSentimentDetectionJobsResult) obj;
        if (other.getTargetedSentimentDetectionJobPropertiesList() == null ^ this.getTargetedSentimentDetectionJobPropertiesList() == null)
            return false;
        if (other.getTargetedSentimentDetectionJobPropertiesList() != null
                && other.getTargetedSentimentDetectionJobPropertiesList().equals(this.getTargetedSentimentDetectionJobPropertiesList()) == false)
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

        hashCode = prime * hashCode
                + ((getTargetedSentimentDetectionJobPropertiesList() == null) ? 0 : getTargetedSentimentDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTargetedSentimentDetectionJobsResult clone() {
        try {
            return (ListTargetedSentimentDetectionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
