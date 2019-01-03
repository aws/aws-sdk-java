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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListQualificationTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQualificationTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of Qualification types on this page in the filtered results list, equivalent to the number of types
     * this operation returns.
     * </p>
     */
    private Integer numResults;

    private String nextToken;
    /**
     * <p>
     * The list of QualificationType elements returned by the query.
     * </p>
     */
    private java.util.List<QualificationType> qualificationTypes;

    /**
     * <p>
     * The number of Qualification types on this page in the filtered results list, equivalent to the number of types
     * this operation returns.
     * </p>
     * 
     * @param numResults
     *        The number of Qualification types on this page in the filtered results list, equivalent to the number of
     *        types this operation returns.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of Qualification types on this page in the filtered results list, equivalent to the number of types
     * this operation returns.
     * </p>
     * 
     * @return The number of Qualification types on this page in the filtered results list, equivalent to the number of
     *         types this operation returns.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of Qualification types on this page in the filtered results list, equivalent to the number of types
     * this operation returns.
     * </p>
     * 
     * @param numResults
     *        The number of Qualification types on this page in the filtered results list, equivalent to the number of
     *        types this operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesResult withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

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

    public ListQualificationTypesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of QualificationType elements returned by the query.
     * </p>
     * 
     * @return The list of QualificationType elements returned by the query.
     */

    public java.util.List<QualificationType> getQualificationTypes() {
        return qualificationTypes;
    }

    /**
     * <p>
     * The list of QualificationType elements returned by the query.
     * </p>
     * 
     * @param qualificationTypes
     *        The list of QualificationType elements returned by the query.
     */

    public void setQualificationTypes(java.util.Collection<QualificationType> qualificationTypes) {
        if (qualificationTypes == null) {
            this.qualificationTypes = null;
            return;
        }

        this.qualificationTypes = new java.util.ArrayList<QualificationType>(qualificationTypes);
    }

    /**
     * <p>
     * The list of QualificationType elements returned by the query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQualificationTypes(java.util.Collection)} or {@link #withQualificationTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param qualificationTypes
     *        The list of QualificationType elements returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesResult withQualificationTypes(QualificationType... qualificationTypes) {
        if (this.qualificationTypes == null) {
            setQualificationTypes(new java.util.ArrayList<QualificationType>(qualificationTypes.length));
        }
        for (QualificationType ele : qualificationTypes) {
            this.qualificationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of QualificationType elements returned by the query.
     * </p>
     * 
     * @param qualificationTypes
     *        The list of QualificationType elements returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesResult withQualificationTypes(java.util.Collection<QualificationType> qualificationTypes) {
        setQualificationTypes(qualificationTypes);
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
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getQualificationTypes() != null)
            sb.append("QualificationTypes: ").append(getQualificationTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQualificationTypesResult == false)
            return false;
        ListQualificationTypesResult other = (ListQualificationTypesResult) obj;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQualificationTypes() == null ^ this.getQualificationTypes() == null)
            return false;
        if (other.getQualificationTypes() != null && other.getQualificationTypes().equals(this.getQualificationTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQualificationTypes() == null) ? 0 : getQualificationTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListQualificationTypesResult clone() {
        try {
            return (ListQualificationTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
