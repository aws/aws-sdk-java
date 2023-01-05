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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetBlueprints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetBlueprintsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of blueprint names.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * Specifies whether or not to include the blueprint in the response.
     * </p>
     */
    private Boolean includeBlueprint;
    /**
     * <p>
     * Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     * </p>
     */
    private Boolean includeParameterSpec;

    /**
     * <p>
     * A list of blueprint names.
     * </p>
     * 
     * @return A list of blueprint names.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of blueprint names.
     * </p>
     * 
     * @param names
     *        A list of blueprint names.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of blueprint names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A list of blueprint names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBlueprintsRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of blueprint names.
     * </p>
     * 
     * @param names
     *        A list of blueprint names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBlueprintsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
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

    public BatchGetBlueprintsRequest withIncludeBlueprint(Boolean includeBlueprint) {
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
     * Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     * </p>
     * 
     * @param includeParameterSpec
     *        Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     */

    public void setIncludeParameterSpec(Boolean includeParameterSpec) {
        this.includeParameterSpec = includeParameterSpec;
    }

    /**
     * <p>
     * Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     * </p>
     * 
     * @return Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     */

    public Boolean getIncludeParameterSpec() {
        return this.includeParameterSpec;
    }

    /**
     * <p>
     * Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     * </p>
     * 
     * @param includeParameterSpec
     *        Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBlueprintsRequest withIncludeParameterSpec(Boolean includeParameterSpec) {
        setIncludeParameterSpec(includeParameterSpec);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
     * </p>
     * 
     * @return Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
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

        if (obj instanceof BatchGetBlueprintsRequest == false)
            return false;
        BatchGetBlueprintsRequest other = (BatchGetBlueprintsRequest) obj;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
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

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getIncludeBlueprint() == null) ? 0 : getIncludeBlueprint().hashCode());
        hashCode = prime * hashCode + ((getIncludeParameterSpec() == null) ? 0 : getIncludeParameterSpec().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetBlueprintsRequest clone() {
        return (BatchGetBlueprintsRequest) super.clone();
    }

}
