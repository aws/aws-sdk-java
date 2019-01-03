/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListKeyPhrasesDetectionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeyPhrasesDetectionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<KeyPhrasesDetectionJobProperties> keyPhrasesDetectionJobPropertiesList;
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

    public java.util.List<KeyPhrasesDetectionJobProperties> getKeyPhrasesDetectionJobPropertiesList() {
        return keyPhrasesDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param keyPhrasesDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     */

    public void setKeyPhrasesDetectionJobPropertiesList(java.util.Collection<KeyPhrasesDetectionJobProperties> keyPhrasesDetectionJobPropertiesList) {
        if (keyPhrasesDetectionJobPropertiesList == null) {
            this.keyPhrasesDetectionJobPropertiesList = null;
            return;
        }

        this.keyPhrasesDetectionJobPropertiesList = new java.util.ArrayList<KeyPhrasesDetectionJobProperties>(keyPhrasesDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPhrasesDetectionJobPropertiesList(java.util.Collection)} or
     * {@link #withKeyPhrasesDetectionJobPropertiesList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param keyPhrasesDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeyPhrasesDetectionJobsResult withKeyPhrasesDetectionJobPropertiesList(KeyPhrasesDetectionJobProperties... keyPhrasesDetectionJobPropertiesList) {
        if (this.keyPhrasesDetectionJobPropertiesList == null) {
            setKeyPhrasesDetectionJobPropertiesList(new java.util.ArrayList<KeyPhrasesDetectionJobProperties>(keyPhrasesDetectionJobPropertiesList.length));
        }
        for (KeyPhrasesDetectionJobProperties ele : keyPhrasesDetectionJobPropertiesList) {
            this.keyPhrasesDetectionJobPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param keyPhrasesDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeyPhrasesDetectionJobsResult withKeyPhrasesDetectionJobPropertiesList(
            java.util.Collection<KeyPhrasesDetectionJobProperties> keyPhrasesDetectionJobPropertiesList) {
        setKeyPhrasesDetectionJobPropertiesList(keyPhrasesDetectionJobPropertiesList);
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

    public ListKeyPhrasesDetectionJobsResult withNextToken(String nextToken) {
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
        if (getKeyPhrasesDetectionJobPropertiesList() != null)
            sb.append("KeyPhrasesDetectionJobPropertiesList: ").append(getKeyPhrasesDetectionJobPropertiesList()).append(",");
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

        if (obj instanceof ListKeyPhrasesDetectionJobsResult == false)
            return false;
        ListKeyPhrasesDetectionJobsResult other = (ListKeyPhrasesDetectionJobsResult) obj;
        if (other.getKeyPhrasesDetectionJobPropertiesList() == null ^ this.getKeyPhrasesDetectionJobPropertiesList() == null)
            return false;
        if (other.getKeyPhrasesDetectionJobPropertiesList() != null
                && other.getKeyPhrasesDetectionJobPropertiesList().equals(this.getKeyPhrasesDetectionJobPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getKeyPhrasesDetectionJobPropertiesList() == null) ? 0 : getKeyPhrasesDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKeyPhrasesDetectionJobsResult clone() {
        try {
            return (ListKeyPhrasesDetectionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
