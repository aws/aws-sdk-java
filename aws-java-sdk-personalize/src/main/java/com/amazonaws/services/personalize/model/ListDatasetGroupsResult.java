/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasetGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     */
    private java.util.List<DatasetGroupSummary> datasetGroups;
    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     * 
     * @return The list of your dataset groups.
     */

    public java.util.List<DatasetGroupSummary> getDatasetGroups() {
        return datasetGroups;
    }

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     * 
     * @param datasetGroups
     *        The list of your dataset groups.
     */

    public void setDatasetGroups(java.util.Collection<DatasetGroupSummary> datasetGroups) {
        if (datasetGroups == null) {
            this.datasetGroups = null;
            return;
        }

        this.datasetGroups = new java.util.ArrayList<DatasetGroupSummary>(datasetGroups);
    }

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetGroups(java.util.Collection)} or {@link #withDatasetGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param datasetGroups
     *        The list of your dataset groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetGroupsResult withDatasetGroups(DatasetGroupSummary... datasetGroups) {
        if (this.datasetGroups == null) {
            setDatasetGroups(new java.util.ArrayList<DatasetGroupSummary>(datasetGroups.length));
        }
        for (DatasetGroupSummary ele : datasetGroups) {
            this.datasetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     * 
     * @param datasetGroups
     *        The list of your dataset groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetGroupsResult withDatasetGroups(java.util.Collection<DatasetGroupSummary> datasetGroups) {
        setDatasetGroups(datasetGroups);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of dataset groups (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of dataset groups (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of dataset groups (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasetGroupsResult withNextToken(String nextToken) {
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
        if (getDatasetGroups() != null)
            sb.append("DatasetGroups: ").append(getDatasetGroups()).append(",");
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

        if (obj instanceof ListDatasetGroupsResult == false)
            return false;
        ListDatasetGroupsResult other = (ListDatasetGroupsResult) obj;
        if (other.getDatasetGroups() == null ^ this.getDatasetGroups() == null)
            return false;
        if (other.getDatasetGroups() != null && other.getDatasetGroups().equals(this.getDatasetGroups()) == false)
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

        hashCode = prime * hashCode + ((getDatasetGroups() == null) ? 0 : getDatasetGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasetGroupsResult clone() {
        try {
            return (ListDatasetGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
