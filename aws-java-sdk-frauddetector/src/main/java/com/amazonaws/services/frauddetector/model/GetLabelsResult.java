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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetLabels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of labels.
     * </p>
     */
    private java.util.List<Label> labels;
    /**
     * <p>
     * The next page token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of labels.
     * </p>
     * 
     * @return An array of labels.
     */

    public java.util.List<Label> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of labels.
     * </p>
     * 
     * @param labels
     *        An array of labels.
     */

    public void setLabels(java.util.Collection<Label> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<Label>(labels);
    }

    /**
     * <p>
     * An array of labels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        An array of labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelsResult withLabels(Label... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<Label>(labels.length));
        }
        for (Label ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of labels.
     * </p>
     * 
     * @param labels
     *        An array of labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelsResult withLabels(java.util.Collection<Label> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @return The next page token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token.
     * </p>
     * 
     * @param nextToken
     *        The next page token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelsResult withNextToken(String nextToken) {
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
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
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

        if (obj instanceof GetLabelsResult == false)
            return false;
        GetLabelsResult other = (GetLabelsResult) obj;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
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

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetLabelsResult clone() {
        try {
            return (GetLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
