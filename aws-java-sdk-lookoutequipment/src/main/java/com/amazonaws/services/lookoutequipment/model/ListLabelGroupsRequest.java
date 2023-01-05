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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListLabelGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLabelGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The beginning of the name of the label groups to be listed.
     * </p>
     */
    private String labelGroupNameBeginsWith;
    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of label groups to list.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The beginning of the name of the label groups to be listed.
     * </p>
     * 
     * @param labelGroupNameBeginsWith
     *        The beginning of the name of the label groups to be listed.
     */

    public void setLabelGroupNameBeginsWith(String labelGroupNameBeginsWith) {
        this.labelGroupNameBeginsWith = labelGroupNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the label groups to be listed.
     * </p>
     * 
     * @return The beginning of the name of the label groups to be listed.
     */

    public String getLabelGroupNameBeginsWith() {
        return this.labelGroupNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the label groups to be listed.
     * </p>
     * 
     * @param labelGroupNameBeginsWith
     *        The beginning of the name of the label groups to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelGroupsRequest withLabelGroupNameBeginsWith(String labelGroupNameBeginsWith) {
        setLabelGroupNameBeginsWith(labelGroupNameBeginsWith);
        return this;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of label groups.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of label groups.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of label groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of label groups to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of label groups to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of label groups to list.
     * </p>
     * 
     * @return Specifies the maximum number of label groups to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of label groups to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of label groups to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelGroupsRequest withMaxResults(Integer maxResults) {
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
        if (getLabelGroupNameBeginsWith() != null)
            sb.append("LabelGroupNameBeginsWith: ").append(getLabelGroupNameBeginsWith()).append(",");
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

        if (obj instanceof ListLabelGroupsRequest == false)
            return false;
        ListLabelGroupsRequest other = (ListLabelGroupsRequest) obj;
        if (other.getLabelGroupNameBeginsWith() == null ^ this.getLabelGroupNameBeginsWith() == null)
            return false;
        if (other.getLabelGroupNameBeginsWith() != null && other.getLabelGroupNameBeginsWith().equals(this.getLabelGroupNameBeginsWith()) == false)
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

        hashCode = prime * hashCode + ((getLabelGroupNameBeginsWith() == null) ? 0 : getLabelGroupNameBeginsWith().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListLabelGroupsRequest clone() {
        return (ListLabelGroupsRequest) super.clone();
    }

}
