/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEBSVolumeRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEBSVolumeRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to advance to the next page of volume recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of volume recommendations to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that describe volume recommendations.
     * </p>
     */
    private java.util.List<VolumeRecommendation> volumeRecommendations;
    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an unsupported volume.
     * </p>
     */
    private java.util.List<GetRecommendationError> errors;

    /**
     * <p>
     * The token to use to advance to the next page of volume recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of volume recommendations to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of volume recommendations.</p>
     *        <p>
     *        This value is null when there are no more pages of volume recommendations to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of volume recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of volume recommendations to return.
     * </p>
     * 
     * @return The token to use to advance to the next page of volume recommendations.</p>
     *         <p>
     *         This value is null when there are no more pages of volume recommendations to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of volume recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of volume recommendations to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of volume recommendations.</p>
     *        <p>
     *        This value is null when there are no more pages of volume recommendations to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe volume recommendations.
     * </p>
     * 
     * @return An array of objects that describe volume recommendations.
     */

    public java.util.List<VolumeRecommendation> getVolumeRecommendations() {
        return volumeRecommendations;
    }

    /**
     * <p>
     * An array of objects that describe volume recommendations.
     * </p>
     * 
     * @param volumeRecommendations
     *        An array of objects that describe volume recommendations.
     */

    public void setVolumeRecommendations(java.util.Collection<VolumeRecommendation> volumeRecommendations) {
        if (volumeRecommendations == null) {
            this.volumeRecommendations = null;
            return;
        }

        this.volumeRecommendations = new java.util.ArrayList<VolumeRecommendation>(volumeRecommendations);
    }

    /**
     * <p>
     * An array of objects that describe volume recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeRecommendations(java.util.Collection)} or
     * {@link #withVolumeRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param volumeRecommendations
     *        An array of objects that describe volume recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsResult withVolumeRecommendations(VolumeRecommendation... volumeRecommendations) {
        if (this.volumeRecommendations == null) {
            setVolumeRecommendations(new java.util.ArrayList<VolumeRecommendation>(volumeRecommendations.length));
        }
        for (VolumeRecommendation ele : volumeRecommendations) {
            this.volumeRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe volume recommendations.
     * </p>
     * 
     * @param volumeRecommendations
     *        An array of objects that describe volume recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsResult withVolumeRecommendations(java.util.Collection<VolumeRecommendation> volumeRecommendations) {
        setVolumeRecommendations(volumeRecommendations);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an unsupported volume.
     * </p>
     * 
     * @return An array of objects that describe errors of the request.</p>
     *         <p>
     *         For example, an error is returned if you request recommendations for an unsupported volume.
     */

    public java.util.List<GetRecommendationError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of objects that describe errors of the request.
     * </p>
     * <p>
     * For example, an error is returned if you request recommendations for an unsupported volume.
     * </p>
     * 
     * @param errors
     *        An array of objects that describe errors of the request.</p>
     *        <p>
     *        For example, an error is returned if you request recommendations for an unsupported volume.
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
     * For example, an error is returned if you request recommendations for an unsupported volume.
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
     *        For example, an error is returned if you request recommendations for an unsupported volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsResult withErrors(GetRecommendationError... errors) {
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
     * For example, an error is returned if you request recommendations for an unsupported volume.
     * </p>
     * 
     * @param errors
     *        An array of objects that describe errors of the request.</p>
     *        <p>
     *        For example, an error is returned if you request recommendations for an unsupported volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsResult withErrors(java.util.Collection<GetRecommendationError> errors) {
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
        if (getVolumeRecommendations() != null)
            sb.append("VolumeRecommendations: ").append(getVolumeRecommendations()).append(",");
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

        if (obj instanceof GetEBSVolumeRecommendationsResult == false)
            return false;
        GetEBSVolumeRecommendationsResult other = (GetEBSVolumeRecommendationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVolumeRecommendations() == null ^ this.getVolumeRecommendations() == null)
            return false;
        if (other.getVolumeRecommendations() != null && other.getVolumeRecommendations().equals(this.getVolumeRecommendations()) == false)
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
        hashCode = prime * hashCode + ((getVolumeRecommendations() == null) ? 0 : getVolumeRecommendations().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public GetEBSVolumeRecommendationsResult clone() {
        try {
            return (GetEBSVolumeRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
