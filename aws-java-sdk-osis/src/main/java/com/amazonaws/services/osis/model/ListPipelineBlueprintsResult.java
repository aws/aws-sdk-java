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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelineBlueprints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelineBlueprintsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of available blueprints for Data Prepper.
     * </p>
     */
    private java.util.List<PipelineBlueprintSummary> blueprints;

    /**
     * <p>
     * A list of available blueprints for Data Prepper.
     * </p>
     * 
     * @return A list of available blueprints for Data Prepper.
     */

    public java.util.List<PipelineBlueprintSummary> getBlueprints() {
        return blueprints;
    }

    /**
     * <p>
     * A list of available blueprints for Data Prepper.
     * </p>
     * 
     * @param blueprints
     *        A list of available blueprints for Data Prepper.
     */

    public void setBlueprints(java.util.Collection<PipelineBlueprintSummary> blueprints) {
        if (blueprints == null) {
            this.blueprints = null;
            return;
        }

        this.blueprints = new java.util.ArrayList<PipelineBlueprintSummary>(blueprints);
    }

    /**
     * <p>
     * A list of available blueprints for Data Prepper.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlueprints(java.util.Collection)} or {@link #withBlueprints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blueprints
     *        A list of available blueprints for Data Prepper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineBlueprintsResult withBlueprints(PipelineBlueprintSummary... blueprints) {
        if (this.blueprints == null) {
            setBlueprints(new java.util.ArrayList<PipelineBlueprintSummary>(blueprints.length));
        }
        for (PipelineBlueprintSummary ele : blueprints) {
            this.blueprints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of available blueprints for Data Prepper.
     * </p>
     * 
     * @param blueprints
     *        A list of available blueprints for Data Prepper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineBlueprintsResult withBlueprints(java.util.Collection<PipelineBlueprintSummary> blueprints) {
        setBlueprints(blueprints);
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
        if (getBlueprints() != null)
            sb.append("Blueprints: ").append(getBlueprints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPipelineBlueprintsResult == false)
            return false;
        ListPipelineBlueprintsResult other = (ListPipelineBlueprintsResult) obj;
        if (other.getBlueprints() == null ^ this.getBlueprints() == null)
            return false;
        if (other.getBlueprints() != null && other.getBlueprints().equals(this.getBlueprints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprints() == null) ? 0 : getBlueprints().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelineBlueprintsResult clone() {
        try {
            return (ListPipelineBlueprintsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
