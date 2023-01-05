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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrationAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataIntegrationAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     * </p>
     */
    private java.util.List<DataIntegrationAssociationSummary> dataIntegrationAssociations;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     */

    public java.util.List<DataIntegrationAssociationSummary> getDataIntegrationAssociations() {
        return dataIntegrationAssociations;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     * </p>
     * 
     * @param dataIntegrationAssociations
     *        The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     */

    public void setDataIntegrationAssociations(java.util.Collection<DataIntegrationAssociationSummary> dataIntegrationAssociations) {
        if (dataIntegrationAssociations == null) {
            this.dataIntegrationAssociations = null;
            return;
        }

        this.dataIntegrationAssociations = new java.util.ArrayList<DataIntegrationAssociationSummary>(dataIntegrationAssociations);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataIntegrationAssociations(java.util.Collection)} or
     * {@link #withDataIntegrationAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataIntegrationAssociations
     *        The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIntegrationAssociationsResult withDataIntegrationAssociations(DataIntegrationAssociationSummary... dataIntegrationAssociations) {
        if (this.dataIntegrationAssociations == null) {
            setDataIntegrationAssociations(new java.util.ArrayList<DataIntegrationAssociationSummary>(dataIntegrationAssociations.length));
        }
        for (DataIntegrationAssociationSummary ele : dataIntegrationAssociations) {
            this.dataIntegrationAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     * </p>
     * 
     * @param dataIntegrationAssociations
     *        The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIntegrationAssociationsResult withDataIntegrationAssociations(
            java.util.Collection<DataIntegrationAssociationSummary> dataIntegrationAssociations) {
        setDataIntegrationAssociations(dataIntegrationAssociations);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataIntegrationAssociationsResult withNextToken(String nextToken) {
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
        if (getDataIntegrationAssociations() != null)
            sb.append("DataIntegrationAssociations: ").append(getDataIntegrationAssociations()).append(",");
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

        if (obj instanceof ListDataIntegrationAssociationsResult == false)
            return false;
        ListDataIntegrationAssociationsResult other = (ListDataIntegrationAssociationsResult) obj;
        if (other.getDataIntegrationAssociations() == null ^ this.getDataIntegrationAssociations() == null)
            return false;
        if (other.getDataIntegrationAssociations() != null && other.getDataIntegrationAssociations().equals(this.getDataIntegrationAssociations()) == false)
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

        hashCode = prime * hashCode + ((getDataIntegrationAssociations() == null) ? 0 : getDataIntegrationAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataIntegrationAssociationsResult clone() {
        try {
            return (ListDataIntegrationAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
