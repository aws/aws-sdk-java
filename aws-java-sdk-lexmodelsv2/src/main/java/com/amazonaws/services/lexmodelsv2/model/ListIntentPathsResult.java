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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentPaths" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntentPathsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects, each of which contains information about a node in the intent path for which you requested
     * metrics.
     * </p>
     */
    private java.util.List<AnalyticsIntentNodeSummary> nodeSummaries;

    /**
     * <p>
     * A list of objects, each of which contains information about a node in the intent path for which you requested
     * metrics.
     * </p>
     * 
     * @return A list of objects, each of which contains information about a node in the intent path for which you
     *         requested metrics.
     */

    public java.util.List<AnalyticsIntentNodeSummary> getNodeSummaries() {
        return nodeSummaries;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a node in the intent path for which you requested
     * metrics.
     * </p>
     * 
     * @param nodeSummaries
     *        A list of objects, each of which contains information about a node in the intent path for which you
     *        requested metrics.
     */

    public void setNodeSummaries(java.util.Collection<AnalyticsIntentNodeSummary> nodeSummaries) {
        if (nodeSummaries == null) {
            this.nodeSummaries = null;
            return;
        }

        this.nodeSummaries = new java.util.ArrayList<AnalyticsIntentNodeSummary>(nodeSummaries);
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a node in the intent path for which you requested
     * metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeSummaries(java.util.Collection)} or {@link #withNodeSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodeSummaries
     *        A list of objects, each of which contains information about a node in the intent path for which you
     *        requested metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsResult withNodeSummaries(AnalyticsIntentNodeSummary... nodeSummaries) {
        if (this.nodeSummaries == null) {
            setNodeSummaries(new java.util.ArrayList<AnalyticsIntentNodeSummary>(nodeSummaries.length));
        }
        for (AnalyticsIntentNodeSummary ele : nodeSummaries) {
            this.nodeSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about a node in the intent path for which you requested
     * metrics.
     * </p>
     * 
     * @param nodeSummaries
     *        A list of objects, each of which contains information about a node in the intent path for which you
     *        requested metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsResult withNodeSummaries(java.util.Collection<AnalyticsIntentNodeSummary> nodeSummaries) {
        setNodeSummaries(nodeSummaries);
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
        if (getNodeSummaries() != null)
            sb.append("NodeSummaries: ").append(getNodeSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIntentPathsResult == false)
            return false;
        ListIntentPathsResult other = (ListIntentPathsResult) obj;
        if (other.getNodeSummaries() == null ^ this.getNodeSummaries() == null)
            return false;
        if (other.getNodeSummaries() != null && other.getNodeSummaries().equals(this.getNodeSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeSummaries() == null) ? 0 : getNodeSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListIntentPathsResult clone() {
        try {
            return (ListIntentPathsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
