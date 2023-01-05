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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListLabelGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLabelGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of label groups.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A summary of the label groups.
     * </p>
     */
    private java.util.List<LabelGroupSummary> labelGroupSummaries;

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

    public ListLabelGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A summary of the label groups.
     * </p>
     * 
     * @return A summary of the label groups.
     */

    public java.util.List<LabelGroupSummary> getLabelGroupSummaries() {
        return labelGroupSummaries;
    }

    /**
     * <p>
     * A summary of the label groups.
     * </p>
     * 
     * @param labelGroupSummaries
     *        A summary of the label groups.
     */

    public void setLabelGroupSummaries(java.util.Collection<LabelGroupSummary> labelGroupSummaries) {
        if (labelGroupSummaries == null) {
            this.labelGroupSummaries = null;
            return;
        }

        this.labelGroupSummaries = new java.util.ArrayList<LabelGroupSummary>(labelGroupSummaries);
    }

    /**
     * <p>
     * A summary of the label groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelGroupSummaries(java.util.Collection)} or {@link #withLabelGroupSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param labelGroupSummaries
     *        A summary of the label groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelGroupsResult withLabelGroupSummaries(LabelGroupSummary... labelGroupSummaries) {
        if (this.labelGroupSummaries == null) {
            setLabelGroupSummaries(new java.util.ArrayList<LabelGroupSummary>(labelGroupSummaries.length));
        }
        for (LabelGroupSummary ele : labelGroupSummaries) {
            this.labelGroupSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of the label groups.
     * </p>
     * 
     * @param labelGroupSummaries
     *        A summary of the label groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelGroupsResult withLabelGroupSummaries(java.util.Collection<LabelGroupSummary> labelGroupSummaries) {
        setLabelGroupSummaries(labelGroupSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLabelGroupSummaries() != null)
            sb.append("LabelGroupSummaries: ").append(getLabelGroupSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLabelGroupsResult == false)
            return false;
        ListLabelGroupsResult other = (ListLabelGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLabelGroupSummaries() == null ^ this.getLabelGroupSummaries() == null)
            return false;
        if (other.getLabelGroupSummaries() != null && other.getLabelGroupSummaries().equals(this.getLabelGroupSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLabelGroupSummaries() == null) ? 0 : getLabelGroupSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListLabelGroupsResult clone() {
        try {
            return (ListLabelGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
