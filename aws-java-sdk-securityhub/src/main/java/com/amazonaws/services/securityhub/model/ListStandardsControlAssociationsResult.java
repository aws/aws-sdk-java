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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListStandardsControlAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStandardsControlAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array that provides the enablement status and other details for each security control that applies to each
     * enabled standard.
     * </p>
     */
    private java.util.List<StandardsControlAssociationSummary> standardsControlAssociationSummaries;
    /**
     * <p>
     * A pagination parameter that's included in the response only if it was included in the request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that provides the enablement status and other details for each security control that applies to each
     * enabled standard.
     * </p>
     * 
     * @return An array that provides the enablement status and other details for each security control that applies to
     *         each enabled standard.
     */

    public java.util.List<StandardsControlAssociationSummary> getStandardsControlAssociationSummaries() {
        return standardsControlAssociationSummaries;
    }

    /**
     * <p>
     * An array that provides the enablement status and other details for each security control that applies to each
     * enabled standard.
     * </p>
     * 
     * @param standardsControlAssociationSummaries
     *        An array that provides the enablement status and other details for each security control that applies to
     *        each enabled standard.
     */

    public void setStandardsControlAssociationSummaries(java.util.Collection<StandardsControlAssociationSummary> standardsControlAssociationSummaries) {
        if (standardsControlAssociationSummaries == null) {
            this.standardsControlAssociationSummaries = null;
            return;
        }

        this.standardsControlAssociationSummaries = new java.util.ArrayList<StandardsControlAssociationSummary>(standardsControlAssociationSummaries);
    }

    /**
     * <p>
     * An array that provides the enablement status and other details for each security control that applies to each
     * enabled standard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsControlAssociationSummaries(java.util.Collection)} or
     * {@link #withStandardsControlAssociationSummaries(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param standardsControlAssociationSummaries
     *        An array that provides the enablement status and other details for each security control that applies to
     *        each enabled standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStandardsControlAssociationsResult withStandardsControlAssociationSummaries(
            StandardsControlAssociationSummary... standardsControlAssociationSummaries) {
        if (this.standardsControlAssociationSummaries == null) {
            setStandardsControlAssociationSummaries(new java.util.ArrayList<StandardsControlAssociationSummary>(standardsControlAssociationSummaries.length));
        }
        for (StandardsControlAssociationSummary ele : standardsControlAssociationSummaries) {
            this.standardsControlAssociationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that provides the enablement status and other details for each security control that applies to each
     * enabled standard.
     * </p>
     * 
     * @param standardsControlAssociationSummaries
     *        An array that provides the enablement status and other details for each security control that applies to
     *        each enabled standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStandardsControlAssociationsResult withStandardsControlAssociationSummaries(
            java.util.Collection<StandardsControlAssociationSummary> standardsControlAssociationSummaries) {
        setStandardsControlAssociationSummaries(standardsControlAssociationSummaries);
        return this;
    }

    /**
     * <p>
     * A pagination parameter that's included in the response only if it was included in the request.
     * </p>
     * 
     * @param nextToken
     *        A pagination parameter that's included in the response only if it was included in the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination parameter that's included in the response only if it was included in the request.
     * </p>
     * 
     * @return A pagination parameter that's included in the response only if it was included in the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination parameter that's included in the response only if it was included in the request.
     * </p>
     * 
     * @param nextToken
     *        A pagination parameter that's included in the response only if it was included in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStandardsControlAssociationsResult withNextToken(String nextToken) {
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
        if (getStandardsControlAssociationSummaries() != null)
            sb.append("StandardsControlAssociationSummaries: ").append(getStandardsControlAssociationSummaries()).append(",");
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

        if (obj instanceof ListStandardsControlAssociationsResult == false)
            return false;
        ListStandardsControlAssociationsResult other = (ListStandardsControlAssociationsResult) obj;
        if (other.getStandardsControlAssociationSummaries() == null ^ this.getStandardsControlAssociationSummaries() == null)
            return false;
        if (other.getStandardsControlAssociationSummaries() != null
                && other.getStandardsControlAssociationSummaries().equals(this.getStandardsControlAssociationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getStandardsControlAssociationSummaries() == null) ? 0 : getStandardsControlAssociationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStandardsControlAssociationsResult clone() {
        try {
            return (ListStandardsControlAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
