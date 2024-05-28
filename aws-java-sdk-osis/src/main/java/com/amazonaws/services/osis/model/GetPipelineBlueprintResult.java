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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/GetPipelineBlueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineBlueprintResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested blueprint in YAML format.
     * </p>
     */
    private PipelineBlueprint blueprint;
    /**
     * <p>
     * The format of the blueprint.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The requested blueprint in YAML format.
     * </p>
     * 
     * @param blueprint
     *        The requested blueprint in YAML format.
     */

    public void setBlueprint(PipelineBlueprint blueprint) {
        this.blueprint = blueprint;
    }

    /**
     * <p>
     * The requested blueprint in YAML format.
     * </p>
     * 
     * @return The requested blueprint in YAML format.
     */

    public PipelineBlueprint getBlueprint() {
        return this.blueprint;
    }

    /**
     * <p>
     * The requested blueprint in YAML format.
     * </p>
     * 
     * @param blueprint
     *        The requested blueprint in YAML format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineBlueprintResult withBlueprint(PipelineBlueprint blueprint) {
        setBlueprint(blueprint);
        return this;
    }

    /**
     * <p>
     * The format of the blueprint.
     * </p>
     * 
     * @param format
     *        The format of the blueprint.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the blueprint.
     * </p>
     * 
     * @return The format of the blueprint.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the blueprint.
     * </p>
     * 
     * @param format
     *        The format of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineBlueprintResult withFormat(String format) {
        setFormat(format);
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
        if (getBlueprint() != null)
            sb.append("Blueprint: ").append(getBlueprint()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineBlueprintResult == false)
            return false;
        GetPipelineBlueprintResult other = (GetPipelineBlueprintResult) obj;
        if (other.getBlueprint() == null ^ this.getBlueprint() == null)
            return false;
        if (other.getBlueprint() != null && other.getBlueprint().equals(this.getBlueprint()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprint() == null) ? 0 : getBlueprint().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineBlueprintResult clone() {
        try {
            return (GetPipelineBlueprintResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
