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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location of artifacts for an AutoML candidate job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CandidateArtifactLocations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CandidateArtifactLocations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
     * </p>
     */
    private String explainability;

    /**
     * <p>
     * The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
     * </p>
     * 
     * @param explainability
     *        The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
     */

    public void setExplainability(String explainability) {
        this.explainability = explainability;
    }

    /**
     * <p>
     * The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
     * </p>
     * 
     * @return The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
     */

    public String getExplainability() {
        return this.explainability;
    }

    /**
     * <p>
     * The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
     * </p>
     * 
     * @param explainability
     *        The Amazon S3 prefix to the explainability artifacts generated for the AutoML candidate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateArtifactLocations withExplainability(String explainability) {
        setExplainability(explainability);
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
        if (getExplainability() != null)
            sb.append("Explainability: ").append(getExplainability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CandidateArtifactLocations == false)
            return false;
        CandidateArtifactLocations other = (CandidateArtifactLocations) obj;
        if (other.getExplainability() == null ^ this.getExplainability() == null)
            return false;
        if (other.getExplainability() != null && other.getExplainability().equals(this.getExplainability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExplainability() == null) ? 0 : getExplainability().hashCode());
        return hashCode;
    }

    @Override
    public CandidateArtifactLocations clone() {
        try {
            return (CandidateArtifactLocations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CandidateArtifactLocationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
