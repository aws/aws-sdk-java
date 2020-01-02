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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2InstanceRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEC2InstanceRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use to advance to the next page of instance recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of instance recommendations to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that describe instance recommendations.
     * </p>
     */
    private java.util.List<InstanceRecommendation> instanceRecommendations;
    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an instance of an unsupported instance
     * family.
     * </p>
     */
    private java.util.List<GetRecommendationError> errors;

    /**
     * <p>
     * The token to use to advance to the next page of instance recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of instance recommendations to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of instance recommendations.</p>
     *        <p>
     *        This value is null when there are no more pages of instance recommendations to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of instance recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of instance recommendations to return.
     * </p>
     * 
     * @return The token to use to advance to the next page of instance recommendations.</p>
     *         <p>
     *         This value is null when there are no more pages of instance recommendations to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of instance recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of instance recommendations to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of instance recommendations.</p>
     *        <p>
     *        This value is null when there are no more pages of instance recommendations to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2InstanceRecommendationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe instance recommendations.
     * </p>
     * 
     * @return An array of objects that describe instance recommendations.
     */

    public java.util.List<InstanceRecommendation> getInstanceRecommendations() {
        return instanceRecommendations;
    }

    /**
     * <p>
     * An array of objects that describe instance recommendations.
     * </p>
     * 
     * @param instanceRecommendations
     *        An array of objects that describe instance recommendations.
     */

    public void setInstanceRecommendations(java.util.Collection<InstanceRecommendation> instanceRecommendations) {
        if (instanceRecommendations == null) {
            this.instanceRecommendations = null;
            return;
        }

        this.instanceRecommendations = new java.util.ArrayList<InstanceRecommendation>(instanceRecommendations);
    }

    /**
     * <p>
     * An array of objects that describe instance recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceRecommendations(java.util.Collection)} or
     * {@link #withInstanceRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceRecommendations
     *        An array of objects that describe instance recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2InstanceRecommendationsResult withInstanceRecommendations(InstanceRecommendation... instanceRecommendations) {
        if (this.instanceRecommendations == null) {
            setInstanceRecommendations(new java.util.ArrayList<InstanceRecommendation>(instanceRecommendations.length));
        }
        for (InstanceRecommendation ele : instanceRecommendations) {
            this.instanceRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe instance recommendations.
     * </p>
     * 
     * @param instanceRecommendations
     *        An array of objects that describe instance recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2InstanceRecommendationsResult withInstanceRecommendations(java.util.Collection<InstanceRecommendation> instanceRecommendations) {
        setInstanceRecommendations(instanceRecommendations);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an instance of an unsupported instance
     * family.
     * </p>
     * 
     * @return An array of objects that describe errors of the request.</p>
     *         <p>
     *         For example, an error is returned if you request recommendations for an instance of an unsupported
     *         instance family.
     */

    public java.util.List<GetRecommendationError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an instance of an unsupported instance
     * family.
     * </p>
     * 
     * @param errors
     *        An array of objects that describe errors of the request.</p>
     *        <p>
     *        For example, an error is returned if you request recommendations for an instance of an unsupported
     *        instance family.
     */

    public void setErrors(java.util.Collection<GetRecommendationError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<GetRecommendationError>(errors);
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an instance of an unsupported instance
     * family.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        An array of objects that describe errors of the request.</p>
     *        <p>
     *        For example, an error is returned if you request recommendations for an instance of an unsupported
     *        instance family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2InstanceRecommendationsResult withErrors(GetRecommendationError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<GetRecommendationError>(errors.length));
        }
        for (GetRecommendationError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an instance of an unsupported instance
     * family.
     * </p>
     * 
     * @param errors
     *        An array of objects that describe errors of the request.</p>
     *        <p>
     *        For example, an error is returned if you request recommendations for an instance of an unsupported
     *        instance family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2InstanceRecommendationsResult withErrors(java.util.Collection<GetRecommendationError> errors) {
        setErrors(errors);
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
        if (getInstanceRecommendations() != null)
            sb.append("InstanceRecommendations: ").append(getInstanceRecommendations()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEC2InstanceRecommendationsResult == false)
            return false;
        GetEC2InstanceRecommendationsResult other = (GetEC2InstanceRecommendationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInstanceRecommendations() == null ^ this.getInstanceRecommendations() == null)
            return false;
        if (other.getInstanceRecommendations() != null && other.getInstanceRecommendations().equals(this.getInstanceRecommendations()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceRecommendations() == null) ? 0 : getInstanceRecommendations().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public GetEC2InstanceRecommendationsResult clone() {
        try {
            return (GetEC2InstanceRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
