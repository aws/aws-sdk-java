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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlansCoverageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     */
    private java.util.List<SavingsPlansCoverage> savingsPlansCoverages;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     * 
     * @return The amount of spend that your Savings Plans covered.
     */

    public java.util.List<SavingsPlansCoverage> getSavingsPlansCoverages() {
        return savingsPlansCoverages;
    }

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     * 
     * @param savingsPlansCoverages
     *        The amount of spend that your Savings Plans covered.
     */

    public void setSavingsPlansCoverages(java.util.Collection<SavingsPlansCoverage> savingsPlansCoverages) {
        if (savingsPlansCoverages == null) {
            this.savingsPlansCoverages = null;
            return;
        }

        this.savingsPlansCoverages = new java.util.ArrayList<SavingsPlansCoverage>(savingsPlansCoverages);
    }

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlansCoverages(java.util.Collection)} or
     * {@link #withSavingsPlansCoverages(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param savingsPlansCoverages
     *        The amount of spend that your Savings Plans covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageResult withSavingsPlansCoverages(SavingsPlansCoverage... savingsPlansCoverages) {
        if (this.savingsPlansCoverages == null) {
            setSavingsPlansCoverages(new java.util.ArrayList<SavingsPlansCoverage>(savingsPlansCoverages.length));
        }
        for (SavingsPlansCoverage ele : savingsPlansCoverages) {
            this.savingsPlansCoverages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The amount of spend that your Savings Plans covered.
     * </p>
     * 
     * @param savingsPlansCoverages
     *        The amount of spend that your Savings Plans covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageResult withSavingsPlansCoverages(java.util.Collection<SavingsPlansCoverage> savingsPlansCoverages) {
        setSavingsPlansCoverages(savingsPlansCoverages);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansCoverageResult withNextToken(String nextToken) {
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
        if (getSavingsPlansCoverages() != null)
            sb.append("SavingsPlansCoverages: ").append(getSavingsPlansCoverages()).append(",");
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

        if (obj instanceof GetSavingsPlansCoverageResult == false)
            return false;
        GetSavingsPlansCoverageResult other = (GetSavingsPlansCoverageResult) obj;
        if (other.getSavingsPlansCoverages() == null ^ this.getSavingsPlansCoverages() == null)
            return false;
        if (other.getSavingsPlansCoverages() != null && other.getSavingsPlansCoverages().equals(this.getSavingsPlansCoverages()) == false)
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

        hashCode = prime * hashCode + ((getSavingsPlansCoverages() == null) ? 0 : getSavingsPlansCoverages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlansCoverageResult clone() {
        try {
            return (GetSavingsPlansCoverageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
