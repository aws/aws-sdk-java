/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListWorkersWithQualificationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkersWithQualificationTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String nextToken;
    /**
     * <p>
     * The number of Qualifications on this page in the filtered results list, equivalent to the number of
     * Qualifications being returned by this call.
     * </p>
     */
    private Integer numResults;
    /**
     * <p>
     * The list of Qualification elements returned by this call.
     * </p>
     */
    private java.util.List<Qualification> qualifications;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkersWithQualificationTypeResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of Qualifications on this page in the filtered results list, equivalent to the number of
     * Qualifications being returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of Qualifications on this page in the filtered results list, equivalent to the number of
     *        Qualifications being returned by this call.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of Qualifications on this page in the filtered results list, equivalent to the number of
     * Qualifications being returned by this call.
     * </p>
     * 
     * @return The number of Qualifications on this page in the filtered results list, equivalent to the number of
     *         Qualifications being returned by this call.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of Qualifications on this page in the filtered results list, equivalent to the number of
     * Qualifications being returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of Qualifications on this page in the filtered results list, equivalent to the number of
     *        Qualifications being returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkersWithQualificationTypeResult withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * <p>
     * The list of Qualification elements returned by this call.
     * </p>
     * 
     * @return The list of Qualification elements returned by this call.
     */

    public java.util.List<Qualification> getQualifications() {
        return qualifications;
    }

    /**
     * <p>
     * The list of Qualification elements returned by this call.
     * </p>
     * 
     * @param qualifications
     *        The list of Qualification elements returned by this call.
     */

    public void setQualifications(java.util.Collection<Qualification> qualifications) {
        if (qualifications == null) {
            this.qualifications = null;
            return;
        }

        this.qualifications = new java.util.ArrayList<Qualification>(qualifications);
    }

    /**
     * <p>
     * The list of Qualification elements returned by this call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQualifications(java.util.Collection)} or {@link #withQualifications(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param qualifications
     *        The list of Qualification elements returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkersWithQualificationTypeResult withQualifications(Qualification... qualifications) {
        if (this.qualifications == null) {
            setQualifications(new java.util.ArrayList<Qualification>(qualifications.length));
        }
        for (Qualification ele : qualifications) {
            this.qualifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Qualification elements returned by this call.
     * </p>
     * 
     * @param qualifications
     *        The list of Qualification elements returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkersWithQualificationTypeResult withQualifications(java.util.Collection<Qualification> qualifications) {
        setQualifications(qualifications);
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
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getQualifications() != null)
            sb.append("Qualifications: ").append(getQualifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkersWithQualificationTypeResult == false)
            return false;
        ListWorkersWithQualificationTypeResult other = (ListWorkersWithQualificationTypeResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getQualifications() == null ^ this.getQualifications() == null)
            return false;
        if (other.getQualifications() != null && other.getQualifications().equals(this.getQualifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getQualifications() == null) ? 0 : getQualifications().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkersWithQualificationTypeResult clone() {
        try {
            return (ListWorkersWithQualificationTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
