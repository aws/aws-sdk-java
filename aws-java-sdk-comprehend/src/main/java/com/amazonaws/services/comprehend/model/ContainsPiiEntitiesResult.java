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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ContainsPiiEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainsPiiEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels represent personally identifiable information
     * (PII) entity types.
     * </p>
     */
    private java.util.List<EntityLabel> labels;

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels represent personally identifiable information
     * (PII) entity types.
     * </p>
     * 
     * @return The labels used in the document being analyzed. Individual labels represent personally identifiable
     *         information (PII) entity types.
     */

    public java.util.List<EntityLabel> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels represent personally identifiable information
     * (PII) entity types.
     * </p>
     * 
     * @param labels
     *        The labels used in the document being analyzed. Individual labels represent personally identifiable
     *        information (PII) entity types.
     */

    public void setLabels(java.util.Collection<EntityLabel> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<EntityLabel>(labels);
    }

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels represent personally identifiable information
     * (PII) entity types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        The labels used in the document being analyzed. Individual labels represent personally identifiable
     *        information (PII) entity types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainsPiiEntitiesResult withLabels(EntityLabel... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<EntityLabel>(labels.length));
        }
        for (EntityLabel ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels used in the document being analyzed. Individual labels represent personally identifiable information
     * (PII) entity types.
     * </p>
     * 
     * @param labels
     *        The labels used in the document being analyzed. Individual labels represent personally identifiable
     *        information (PII) entity types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainsPiiEntitiesResult withLabels(java.util.Collection<EntityLabel> labels) {
        setLabels(labels);
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
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainsPiiEntitiesResult == false)
            return false;
        ContainsPiiEntitiesResult other = (ContainsPiiEntitiesResult) obj;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public ContainsPiiEntitiesResult clone() {
        try {
            return (ContainsPiiEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
