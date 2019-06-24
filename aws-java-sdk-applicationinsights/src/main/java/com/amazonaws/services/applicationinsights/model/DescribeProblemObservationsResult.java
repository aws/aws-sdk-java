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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblemObservations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProblemObservationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Observations related to the problem.
     * </p>
     */
    private RelatedObservations relatedObservations;

    /**
     * <p>
     * Observations related to the problem.
     * </p>
     * 
     * @param relatedObservations
     *        Observations related to the problem.
     */

    public void setRelatedObservations(RelatedObservations relatedObservations) {
        this.relatedObservations = relatedObservations;
    }

    /**
     * <p>
     * Observations related to the problem.
     * </p>
     * 
     * @return Observations related to the problem.
     */

    public RelatedObservations getRelatedObservations() {
        return this.relatedObservations;
    }

    /**
     * <p>
     * Observations related to the problem.
     * </p>
     * 
     * @param relatedObservations
     *        Observations related to the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProblemObservationsResult withRelatedObservations(RelatedObservations relatedObservations) {
        setRelatedObservations(relatedObservations);
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
        if (getRelatedObservations() != null)
            sb.append("RelatedObservations: ").append(getRelatedObservations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProblemObservationsResult == false)
            return false;
        DescribeProblemObservationsResult other = (DescribeProblemObservationsResult) obj;
        if (other.getRelatedObservations() == null ^ this.getRelatedObservations() == null)
            return false;
        if (other.getRelatedObservations() != null && other.getRelatedObservations().equals(this.getRelatedObservations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelatedObservations() == null) ? 0 : getRelatedObservations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProblemObservationsResult clone() {
        try {
            return (DescribeProblemObservationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
