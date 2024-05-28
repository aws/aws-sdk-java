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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListMetadataGenerationRuns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetadataGenerationRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The results of the ListMetadataGenerationRuns action.
     * </p>
     */
    private java.util.List<MetadataGenerationRunItem> items;
    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The results of the ListMetadataGenerationRuns action.
     * </p>
     * 
     * @return The results of the ListMetadataGenerationRuns action.
     */

    public java.util.List<MetadataGenerationRunItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The results of the ListMetadataGenerationRuns action.
     * </p>
     * 
     * @param items
     *        The results of the ListMetadataGenerationRuns action.
     */

    public void setItems(java.util.Collection<MetadataGenerationRunItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<MetadataGenerationRunItem>(items);
    }

    /**
     * <p>
     * The results of the ListMetadataGenerationRuns action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The results of the ListMetadataGenerationRuns action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataGenerationRunsResult withItems(MetadataGenerationRunItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<MetadataGenerationRunItem>(items.length));
        }
        for (MetadataGenerationRunItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the ListMetadataGenerationRuns action.
     * </p>
     * 
     * @param items
     *        The results of the ListMetadataGenerationRuns action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataGenerationRunsResult withItems(java.util.Collection<MetadataGenerationRunItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     * 
     * @param nextToken
     *        When the number of metadata generation runs is greater than the default value for the MaxResults
     *        parameter, or if you explicitly specify a value for MaxResults that is less than the number of metadata
     *        generation runs, the response includes a pagination token named NextToken. You can specify this NextToken
     *        value in a subsequent call to ListMetadataGenerationRuns to list the next set of revisions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     * 
     * @return When the number of metadata generation runs is greater than the default value for the MaxResults
     *         parameter, or if you explicitly specify a value for MaxResults that is less than the number of metadata
     *         generation runs, the response includes a pagination token named NextToken. You can specify this NextToken
     *         value in a subsequent call to ListMetadataGenerationRuns to list the next set of revisions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     * 
     * @param nextToken
     *        When the number of metadata generation runs is greater than the default value for the MaxResults
     *        parameter, or if you explicitly specify a value for MaxResults that is less than the number of metadata
     *        generation runs, the response includes a pagination token named NextToken. You can specify this NextToken
     *        value in a subsequent call to ListMetadataGenerationRuns to list the next set of revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataGenerationRunsResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListMetadataGenerationRunsResult == false)
            return false;
        ListMetadataGenerationRunsResult other = (ListMetadataGenerationRunsResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMetadataGenerationRunsResult clone() {
        try {
            return (ListMetadataGenerationRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
