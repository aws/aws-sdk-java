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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DeleteAnalysisScheme</code> request. Contains the status of the deleted analysis scheme.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnalysisSchemeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the analysis scheme being deleted.
     * </p>
     */
    private AnalysisSchemeStatus analysisScheme;

    /**
     * <p>
     * The status of the analysis scheme being deleted.
     * </p>
     * 
     * @param analysisScheme
     *        The status of the analysis scheme being deleted.
     */

    public void setAnalysisScheme(AnalysisSchemeStatus analysisScheme) {
        this.analysisScheme = analysisScheme;
    }

    /**
     * <p>
     * The status of the analysis scheme being deleted.
     * </p>
     * 
     * @return The status of the analysis scheme being deleted.
     */

    public AnalysisSchemeStatus getAnalysisScheme() {
        return this.analysisScheme;
    }

    /**
     * <p>
     * The status of the analysis scheme being deleted.
     * </p>
     * 
     * @param analysisScheme
     *        The status of the analysis scheme being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnalysisSchemeResult withAnalysisScheme(AnalysisSchemeStatus analysisScheme) {
        setAnalysisScheme(analysisScheme);
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
        if (getAnalysisScheme() != null)
            sb.append("AnalysisScheme: ").append(getAnalysisScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAnalysisSchemeResult == false)
            return false;
        DeleteAnalysisSchemeResult other = (DeleteAnalysisSchemeResult) obj;
        if (other.getAnalysisScheme() == null ^ this.getAnalysisScheme() == null)
            return false;
        if (other.getAnalysisScheme() != null && other.getAnalysisScheme().equals(this.getAnalysisScheme()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisScheme() == null) ? 0 : getAnalysisScheme().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAnalysisSchemeResult clone() {
        try {
            return (DeleteAnalysisSchemeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
