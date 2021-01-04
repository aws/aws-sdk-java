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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListPiiEntitiesDetectionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPiiEntitiesDetectionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     */
    private java.util.List<PiiEntitiesDetectionJobProperties> piiEntitiesDetectionJobPropertiesList;
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

    public java.util.List<PiiEntitiesDetectionJobProperties> getPiiEntitiesDetectionJobPropertiesList() {
        return piiEntitiesDetectionJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param piiEntitiesDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     */

    public void setPiiEntitiesDetectionJobPropertiesList(java.util.Collection<PiiEntitiesDetectionJobProperties> piiEntitiesDetectionJobPropertiesList) {
        if (piiEntitiesDetectionJobPropertiesList == null) {
            this.piiEntitiesDetectionJobPropertiesList = null;
            return;
        }

        this.piiEntitiesDetectionJobPropertiesList = new java.util.ArrayList<PiiEntitiesDetectionJobProperties>(piiEntitiesDetectionJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPiiEntitiesDetectionJobPropertiesList(java.util.Collection)} or
     * {@link #withPiiEntitiesDetectionJobPropertiesList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param piiEntitiesDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPiiEntitiesDetectionJobsResult withPiiEntitiesDetectionJobPropertiesList(
            PiiEntitiesDetectionJobProperties... piiEntitiesDetectionJobPropertiesList) {
        if (this.piiEntitiesDetectionJobPropertiesList == null) {
            setPiiEntitiesDetectionJobPropertiesList(new java.util.ArrayList<PiiEntitiesDetectionJobProperties>(piiEntitiesDetectionJobPropertiesList.length));
        }
        for (PiiEntitiesDetectionJobProperties ele : piiEntitiesDetectionJobPropertiesList) {
            this.piiEntitiesDetectionJobPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the properties of each job that is returned.
     * </p>
     * 
     * @param piiEntitiesDetectionJobPropertiesList
     *        A list containing the properties of each job that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPiiEntitiesDetectionJobsResult withPiiEntitiesDetectionJobPropertiesList(
            java.util.Collection<PiiEntitiesDetectionJobProperties> piiEntitiesDetectionJobPropertiesList) {
        setPiiEntitiesDetectionJobPropertiesList(piiEntitiesDetectionJobPropertiesList);
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

    public ListPiiEntitiesDetectionJobsResult withNextToken(String nextToken) {
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
        if (getPiiEntitiesDetectionJobPropertiesList() != null)
            sb.append("PiiEntitiesDetectionJobPropertiesList: ").append(getPiiEntitiesDetectionJobPropertiesList()).append(",");
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

        if (obj instanceof ListPiiEntitiesDetectionJobsResult == false)
            return false;
        ListPiiEntitiesDetectionJobsResult other = (ListPiiEntitiesDetectionJobsResult) obj;
        if (other.getPiiEntitiesDetectionJobPropertiesList() == null ^ this.getPiiEntitiesDetectionJobPropertiesList() == null)
            return false;
        if (other.getPiiEntitiesDetectionJobPropertiesList() != null
                && other.getPiiEntitiesDetectionJobPropertiesList().equals(this.getPiiEntitiesDetectionJobPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getPiiEntitiesDetectionJobPropertiesList() == null) ? 0 : getPiiEntitiesDetectionJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPiiEntitiesDetectionJobsResult clone() {
        try {
            return (ListPiiEntitiesDetectionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
