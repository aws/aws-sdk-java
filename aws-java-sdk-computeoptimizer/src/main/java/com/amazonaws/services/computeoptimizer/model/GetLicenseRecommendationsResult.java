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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetLicenseRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLicenseRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to advance to the next page of license recommendations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that describe license recommendations.
     * </p>
     */
    private java.util.List<LicenseRecommendation> licenseRecommendations;
    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     */
    private java.util.List<GetRecommendationError> errors;

    /**
     * <p>
     * The token to use to advance to the next page of license recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of license recommendations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of license recommendations.
     * </p>
     * 
     * @return The token to use to advance to the next page of license recommendations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of license recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of license recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseRecommendationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe license recommendations.
     * </p>
     * 
     * @return An array of objects that describe license recommendations.
     */

    public java.util.List<LicenseRecommendation> getLicenseRecommendations() {
        return licenseRecommendations;
    }

    /**
     * <p>
     * An array of objects that describe license recommendations.
     * </p>
     * 
     * @param licenseRecommendations
     *        An array of objects that describe license recommendations.
     */

    public void setLicenseRecommendations(java.util.Collection<LicenseRecommendation> licenseRecommendations) {
        if (licenseRecommendations == null) {
            this.licenseRecommendations = null;
            return;
        }

        this.licenseRecommendations = new java.util.ArrayList<LicenseRecommendation>(licenseRecommendations);
    }

    /**
     * <p>
     * An array of objects that describe license recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseRecommendations(java.util.Collection)} or
     * {@link #withLicenseRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseRecommendations
     *        An array of objects that describe license recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseRecommendationsResult withLicenseRecommendations(LicenseRecommendation... licenseRecommendations) {
        if (this.licenseRecommendations == null) {
            setLicenseRecommendations(new java.util.ArrayList<LicenseRecommendation>(licenseRecommendations.length));
        }
        for (LicenseRecommendation ele : licenseRecommendations) {
            this.licenseRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe license recommendations.
     * </p>
     * 
     * @param licenseRecommendations
     *        An array of objects that describe license recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseRecommendationsResult withLicenseRecommendations(java.util.Collection<LicenseRecommendation> licenseRecommendations) {
        setLicenseRecommendations(licenseRecommendations);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * 
     * @return An array of objects that describe errors of the request.
     */

    public java.util.List<GetRecommendationError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * 
     * @param errors
     *        An array of objects that describe errors of the request.
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        An array of objects that describe errors of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseRecommendationsResult withErrors(GetRecommendationError... errors) {
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
     * 
     * @param errors
     *        An array of objects that describe errors of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseRecommendationsResult withErrors(java.util.Collection<GetRecommendationError> errors) {
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
        if (getLicenseRecommendations() != null)
            sb.append("LicenseRecommendations: ").append(getLicenseRecommendations()).append(",");
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

        if (obj instanceof GetLicenseRecommendationsResult == false)
            return false;
        GetLicenseRecommendationsResult other = (GetLicenseRecommendationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLicenseRecommendations() == null ^ this.getLicenseRecommendations() == null)
            return false;
        if (other.getLicenseRecommendations() != null && other.getLicenseRecommendations().equals(this.getLicenseRecommendations()) == false)
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
        hashCode = prime * hashCode + ((getLicenseRecommendations() == null) ? 0 : getLicenseRecommendations().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public GetLicenseRecommendationsResult clone() {
        try {
            return (GetLicenseRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
