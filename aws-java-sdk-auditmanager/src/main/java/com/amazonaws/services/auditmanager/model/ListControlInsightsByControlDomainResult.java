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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlInsightsByControlDomain"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListControlInsightsByControlDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     * </p>
     */
    private java.util.List<ControlInsightsMetadataItem> controlInsightsMetadata;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     * </p>
     * 
     * @return The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     */

    public java.util.List<ControlInsightsMetadataItem> getControlInsightsMetadata() {
        return controlInsightsMetadata;
    }

    /**
     * <p>
     * The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     * </p>
     * 
     * @param controlInsightsMetadata
     *        The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     */

    public void setControlInsightsMetadata(java.util.Collection<ControlInsightsMetadataItem> controlInsightsMetadata) {
        if (controlInsightsMetadata == null) {
            this.controlInsightsMetadata = null;
            return;
        }

        this.controlInsightsMetadata = new java.util.ArrayList<ControlInsightsMetadataItem>(controlInsightsMetadata);
    }

    /**
     * <p>
     * The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlInsightsMetadata(java.util.Collection)} or
     * {@link #withControlInsightsMetadata(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param controlInsightsMetadata
     *        The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlInsightsByControlDomainResult withControlInsightsMetadata(ControlInsightsMetadataItem... controlInsightsMetadata) {
        if (this.controlInsightsMetadata == null) {
            setControlInsightsMetadata(new java.util.ArrayList<ControlInsightsMetadataItem>(controlInsightsMetadata.length));
        }
        for (ControlInsightsMetadataItem ele : controlInsightsMetadata) {
            this.controlInsightsMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     * </p>
     * 
     * @param controlInsightsMetadata
     *        The control analytics data that the <code>ListControlInsightsByControlDomain</code> API returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlInsightsByControlDomainResult withControlInsightsMetadata(java.util.Collection<ControlInsightsMetadataItem> controlInsightsMetadata) {
        setControlInsightsMetadata(controlInsightsMetadata);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token that's used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlInsightsByControlDomainResult withNextToken(String nextToken) {
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
        if (getControlInsightsMetadata() != null)
            sb.append("ControlInsightsMetadata: ").append(getControlInsightsMetadata()).append(",");
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

        if (obj instanceof ListControlInsightsByControlDomainResult == false)
            return false;
        ListControlInsightsByControlDomainResult other = (ListControlInsightsByControlDomainResult) obj;
        if (other.getControlInsightsMetadata() == null ^ this.getControlInsightsMetadata() == null)
            return false;
        if (other.getControlInsightsMetadata() != null && other.getControlInsightsMetadata().equals(this.getControlInsightsMetadata()) == false)
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

        hashCode = prime * hashCode + ((getControlInsightsMetadata() == null) ? 0 : getControlInsightsMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListControlInsightsByControlDomainResult clone() {
        try {
            return (ListControlInsightsByControlDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
