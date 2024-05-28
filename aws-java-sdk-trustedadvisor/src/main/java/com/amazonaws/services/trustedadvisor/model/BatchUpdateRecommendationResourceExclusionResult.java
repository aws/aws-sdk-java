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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/BatchUpdateRecommendationResourceExclusion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRecommendationResourceExclusionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of recommendation resource ARNs whose exclusion status failed to update, if any
     * </p>
     */
    private java.util.List<UpdateRecommendationResourceExclusionError> batchUpdateRecommendationResourceExclusionErrors;

    /**
     * <p>
     * A list of recommendation resource ARNs whose exclusion status failed to update, if any
     * </p>
     * 
     * @return A list of recommendation resource ARNs whose exclusion status failed to update, if any
     */

    public java.util.List<UpdateRecommendationResourceExclusionError> getBatchUpdateRecommendationResourceExclusionErrors() {
        return batchUpdateRecommendationResourceExclusionErrors;
    }

    /**
     * <p>
     * A list of recommendation resource ARNs whose exclusion status failed to update, if any
     * </p>
     * 
     * @param batchUpdateRecommendationResourceExclusionErrors
     *        A list of recommendation resource ARNs whose exclusion status failed to update, if any
     */

    public void setBatchUpdateRecommendationResourceExclusionErrors(
            java.util.Collection<UpdateRecommendationResourceExclusionError> batchUpdateRecommendationResourceExclusionErrors) {
        if (batchUpdateRecommendationResourceExclusionErrors == null) {
            this.batchUpdateRecommendationResourceExclusionErrors = null;
            return;
        }

        this.batchUpdateRecommendationResourceExclusionErrors = new java.util.ArrayList<UpdateRecommendationResourceExclusionError>(
                batchUpdateRecommendationResourceExclusionErrors);
    }

    /**
     * <p>
     * A list of recommendation resource ARNs whose exclusion status failed to update, if any
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchUpdateRecommendationResourceExclusionErrors(java.util.Collection)} or
     * {@link #withBatchUpdateRecommendationResourceExclusionErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param batchUpdateRecommendationResourceExclusionErrors
     *        A list of recommendation resource ARNs whose exclusion status failed to update, if any
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationResourceExclusionResult withBatchUpdateRecommendationResourceExclusionErrors(
            UpdateRecommendationResourceExclusionError... batchUpdateRecommendationResourceExclusionErrors) {
        if (this.batchUpdateRecommendationResourceExclusionErrors == null) {
            setBatchUpdateRecommendationResourceExclusionErrors(new java.util.ArrayList<UpdateRecommendationResourceExclusionError>(
                    batchUpdateRecommendationResourceExclusionErrors.length));
        }
        for (UpdateRecommendationResourceExclusionError ele : batchUpdateRecommendationResourceExclusionErrors) {
            this.batchUpdateRecommendationResourceExclusionErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recommendation resource ARNs whose exclusion status failed to update, if any
     * </p>
     * 
     * @param batchUpdateRecommendationResourceExclusionErrors
     *        A list of recommendation resource ARNs whose exclusion status failed to update, if any
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationResourceExclusionResult withBatchUpdateRecommendationResourceExclusionErrors(
            java.util.Collection<UpdateRecommendationResourceExclusionError> batchUpdateRecommendationResourceExclusionErrors) {
        setBatchUpdateRecommendationResourceExclusionErrors(batchUpdateRecommendationResourceExclusionErrors);
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
        if (getBatchUpdateRecommendationResourceExclusionErrors() != null)
            sb.append("BatchUpdateRecommendationResourceExclusionErrors: ").append(getBatchUpdateRecommendationResourceExclusionErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateRecommendationResourceExclusionResult == false)
            return false;
        BatchUpdateRecommendationResourceExclusionResult other = (BatchUpdateRecommendationResourceExclusionResult) obj;
        if (other.getBatchUpdateRecommendationResourceExclusionErrors() == null ^ this.getBatchUpdateRecommendationResourceExclusionErrors() == null)
            return false;
        if (other.getBatchUpdateRecommendationResourceExclusionErrors() != null
                && other.getBatchUpdateRecommendationResourceExclusionErrors().equals(this.getBatchUpdateRecommendationResourceExclusionErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBatchUpdateRecommendationResourceExclusionErrors() == null) ? 0 : getBatchUpdateRecommendationResourceExclusionErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateRecommendationResourceExclusionResult clone() {
        try {
            return (BatchUpdateRecommendationResourceExclusionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
