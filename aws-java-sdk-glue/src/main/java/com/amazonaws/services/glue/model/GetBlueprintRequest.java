/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetBlueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlueprintRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether or not to include the blueprint in the response.
     * </p>
     */
    private Boolean includeBlueprint;
    /**
     * <p>
     * Specifies whether or not to include the parameter specification.
     * </p>
     */
    private Boolean includeParameterSpec;

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @return The name of the blueprint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include the blueprint in the response.
     * </p>
     * 
     * @param includeBlueprint
     *        Specifies whether or not to include the blueprint in the response.
     */

    public void setIncludeBlueprint(Boolean includeBlueprint) {
        this.includeBlueprint = includeBlueprint;
    }

    /**
     * <p>
     * Specifies whether or not to include the blueprint in the response.
     * </p>
     * 
     * @return Specifies whether or not to include the blueprint in the response.
     */

    public Boolean getIncludeBlueprint() {
        return this.includeBlueprint;
    }

    /**
     * <p>
     * Specifies whether or not to include the blueprint in the response.
     * </p>
     * 
     * @param includeBlueprint
     *        Specifies whether or not to include the blueprint in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRequest withIncludeBlueprint(Boolean includeBlueprint) {
        setIncludeBlueprint(includeBlueprint);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include the blueprint in the response.
     * </p>
     * 
     * @return Specifies whether or not to include the blueprint in the response.
     */

    public Boolean isIncludeBlueprint() {
        return this.includeBlueprint;
    }

    /**
     * <p>
     * Specifies whether or not to include the parameter specification.
     * </p>
     * 
     * @param includeParameterSpec
     *        Specifies whether or not to include the parameter specification.
     */

    public void setIncludeParameterSpec(Boolean includeParameterSpec) {
        this.includeParameterSpec = includeParameterSpec;
    }

    /**
     * <p>
     * Specifies whether or not to include the parameter specification.
     * </p>
     * 
     * @return Specifies whether or not to include the parameter specification.
     */

    public Boolean getIncludeParameterSpec() {
        return this.includeParameterSpec;
    }

    /**
     * <p>
     * Specifies whether or not to include the parameter specification.
     * </p>
     * 
     * @param includeParameterSpec
     *        Specifies whether or not to include the parameter specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintRequest withIncludeParameterSpec(Boolean includeParameterSpec) {
        setIncludeParameterSpec(includeParameterSpec);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include the parameter specification.
     * </p>
     * 
     * @return Specifies whether or not to include the parameter specification.
     */

    public Boolean isIncludeParameterSpec() {
        return this.includeParameterSpec;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIncludeBlueprint() != null)
            sb.append("IncludeBlueprint: ").append(getIncludeBlueprint()).append(",");
        if (getIncludeParameterSpec() != null)
            sb.append("IncludeParameterSpec: ").append(getIncludeParameterSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlueprintRequest == false)
            return false;
        GetBlueprintRequest other = (GetBlueprintRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIncludeBlueprint() == null ^ this.getIncludeBlueprint() == null)
            return false;
        if (other.getIncludeBlueprint() != null && other.getIncludeBlueprint().equals(this.getIncludeBlueprint()) == false)
            return false;
        if (other.getIncludeParameterSpec() == null ^ this.getIncludeParameterSpec() == null)
            return false;
        if (other.getIncludeParameterSpec() != null && other.getIncludeParameterSpec().equals(this.getIncludeParameterSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIncludeBlueprint() == null) ? 0 : getIncludeBlueprint().hashCode());
        hashCode = prime * hashCode + ((getIncludeParameterSpec() == null) ? 0 : getIncludeParameterSpec().hashCode());
        return hashCode;
    }

    @Override
    public GetBlueprintRequest clone() {
        return (GetBlueprintRequest) super.clone();
    }

}
