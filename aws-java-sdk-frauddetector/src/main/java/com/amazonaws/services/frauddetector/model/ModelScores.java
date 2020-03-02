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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The fraud prediction scores.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelScores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelScores implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model version.
     * </p>
     */
    private ModelVersion modelVersion;
    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     */
    private java.util.Map<String, Float> scores;

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     */

    public void setModelVersion(ModelVersion modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @return The model version.
     */

    public ModelVersion getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelScores withModelVersion(ModelVersion modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     * 
     * @return The model's fraud prediction scores.
     */

    public java.util.Map<String, Float> getScores() {
        return scores;
    }

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     * 
     * @param scores
     *        The model's fraud prediction scores.
     */

    public void setScores(java.util.Map<String, Float> scores) {
        this.scores = scores;
    }

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     * 
     * @param scores
     *        The model's fraud prediction scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelScores withScores(java.util.Map<String, Float> scores) {
        setScores(scores);
        return this;
    }

    /**
     * Add a single Scores entry
     *
     * @see ModelScores#withScores
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ModelScores addScoresEntry(String key, Float value) {
        if (null == this.scores) {
            this.scores = new java.util.HashMap<String, Float>();
        }
        if (this.scores.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.scores.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Scores.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelScores clearScoresEntries() {
        this.scores = null;
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
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getScores() != null)
            sb.append("Scores: ").append(getScores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelScores == false)
            return false;
        ModelScores other = (ModelScores) obj;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getScores() == null ^ this.getScores() == null)
            return false;
        if (other.getScores() != null && other.getScores().equals(this.getScores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getScores() == null) ? 0 : getScores().hashCode());
        return hashCode;
    }

    @Override
    public ModelScores clone() {
        try {
            return (ModelScores) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelScoresMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
