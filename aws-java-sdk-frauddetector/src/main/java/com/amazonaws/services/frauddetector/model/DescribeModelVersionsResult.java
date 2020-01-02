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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeModelVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The model version details.
     * </p>
     */
    private java.util.List<ModelVersionDetail> modelVersionDetails;
    /**
     * <p>
     * The next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The model version details.
     * </p>
     * 
     * @return The model version details.
     */

    public java.util.List<ModelVersionDetail> getModelVersionDetails() {
        return modelVersionDetails;
    }

    /**
     * <p>
     * The model version details.
     * </p>
     * 
     * @param modelVersionDetails
     *        The model version details.
     */

    public void setModelVersionDetails(java.util.Collection<ModelVersionDetail> modelVersionDetails) {
        if (modelVersionDetails == null) {
            this.modelVersionDetails = null;
            return;
        }

        this.modelVersionDetails = new java.util.ArrayList<ModelVersionDetail>(modelVersionDetails);
    }

    /**
     * <p>
     * The model version details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVersionDetails(java.util.Collection)} or {@link #withModelVersionDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param modelVersionDetails
     *        The model version details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionsResult withModelVersionDetails(ModelVersionDetail... modelVersionDetails) {
        if (this.modelVersionDetails == null) {
            setModelVersionDetails(new java.util.ArrayList<ModelVersionDetail>(modelVersionDetails.length));
        }
        for (ModelVersionDetail ele : modelVersionDetails) {
            this.modelVersionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The model version details.
     * </p>
     * 
     * @param modelVersionDetails
     *        The model version details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionsResult withModelVersionDetails(java.util.Collection<ModelVersionDetail> modelVersionDetails) {
        setModelVersionDetails(modelVersionDetails);
        return this;
    }

    /**
     * <p>
     * The next token.
     * </p>
     * 
     * @param nextToken
     *        The next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token.
     * </p>
     * 
     * @return The next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token.
     * </p>
     * 
     * @param nextToken
     *        The next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelVersionsResult withNextToken(String nextToken) {
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
        if (getModelVersionDetails() != null)
            sb.append("ModelVersionDetails: ").append(getModelVersionDetails()).append(",");
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

        if (obj instanceof DescribeModelVersionsResult == false)
            return false;
        DescribeModelVersionsResult other = (DescribeModelVersionsResult) obj;
        if (other.getModelVersionDetails() == null ^ this.getModelVersionDetails() == null)
            return false;
        if (other.getModelVersionDetails() != null && other.getModelVersionDetails().equals(this.getModelVersionDetails()) == false)
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

        hashCode = prime * hashCode + ((getModelVersionDetails() == null) ? 0 : getModelVersionDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelVersionsResult clone() {
        try {
            return (DescribeModelVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
