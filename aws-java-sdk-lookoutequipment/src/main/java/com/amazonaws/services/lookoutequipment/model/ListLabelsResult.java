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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListLabels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A summary of the items in the label group.
     * </p>
     */
    private java.util.List<LabelSummary> labelSummaries;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of datasets.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of datasets.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of datasets.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A summary of the items in the label group.
     * </p>
     * 
     * @return A summary of the items in the label group.
     */

    public java.util.List<LabelSummary> getLabelSummaries() {
        return labelSummaries;
    }

    /**
     * <p>
     * A summary of the items in the label group.
     * </p>
     * 
     * @param labelSummaries
     *        A summary of the items in the label group.
     */

    public void setLabelSummaries(java.util.Collection<LabelSummary> labelSummaries) {
        if (labelSummaries == null) {
            this.labelSummaries = null;
            return;
        }

        this.labelSummaries = new java.util.ArrayList<LabelSummary>(labelSummaries);
    }

    /**
     * <p>
     * A summary of the items in the label group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelSummaries(java.util.Collection)} or {@link #withLabelSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param labelSummaries
     *        A summary of the items in the label group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsResult withLabelSummaries(LabelSummary... labelSummaries) {
        if (this.labelSummaries == null) {
            setLabelSummaries(new java.util.ArrayList<LabelSummary>(labelSummaries.length));
        }
        for (LabelSummary ele : labelSummaries) {
            this.labelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of the items in the label group.
     * </p>
     * 
     * @param labelSummaries
     *        A summary of the items in the label group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelsResult withLabelSummaries(java.util.Collection<LabelSummary> labelSummaries) {
        setLabelSummaries(labelSummaries);
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
        if (getLabelSummaries() != null)
            sb.append("LabelSummaries: ").append(getLabelSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLabelsResult == false)
            return false;
        ListLabelsResult other = (ListLabelsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLabelSummaries() == null ^ this.getLabelSummaries() == null)
            return false;
        if (other.getLabelSummaries() != null && other.getLabelSummaries().equals(this.getLabelSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLabelSummaries() == null) ? 0 : getLabelSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListLabelsResult clone() {
        try {
            return (ListLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
