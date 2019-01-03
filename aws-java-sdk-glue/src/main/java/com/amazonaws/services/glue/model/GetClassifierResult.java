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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetClassifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClassifierResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested classifier.
     * </p>
     */
    private Classifier classifier;

    /**
     * <p>
     * The requested classifier.
     * </p>
     * 
     * @param classifier
     *        The requested classifier.
     */

    public void setClassifier(Classifier classifier) {
        this.classifier = classifier;
    }

    /**
     * <p>
     * The requested classifier.
     * </p>
     * 
     * @return The requested classifier.
     */

    public Classifier getClassifier() {
        return this.classifier;
    }

    /**
     * <p>
     * The requested classifier.
     * </p>
     * 
     * @param classifier
     *        The requested classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClassifierResult withClassifier(Classifier classifier) {
        setClassifier(classifier);
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
        if (getClassifier() != null)
            sb.append("Classifier: ").append(getClassifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClassifierResult == false)
            return false;
        GetClassifierResult other = (GetClassifierResult) obj;
        if (other.getClassifier() == null ^ this.getClassifier() == null)
            return false;
        if (other.getClassifier() != null && other.getClassifier().equals(this.getClassifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassifier() == null) ? 0 : getClassifier().hashCode());
        return hashCode;
    }

    @Override
    public GetClassifierResult clone() {
        try {
            return (GetClassifierResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
