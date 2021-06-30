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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a transformation and associated parameters that are used to apply a change to a DataBrew dataset. For more
 * information, see <a href="https://docs.aws.amazon.com/databrew/latest/dg/recipe-actions-reference.html">Recipe
 * actions reference</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/RecipeAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipeAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a valid DataBrew transformation to be performed on the data.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * Contextual parameters for the transformation.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of a valid DataBrew transformation to be performed on the data.
     * </p>
     * 
     * @param operation
     *        The name of a valid DataBrew transformation to be performed on the data.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The name of a valid DataBrew transformation to be performed on the data.
     * </p>
     * 
     * @return The name of a valid DataBrew transformation to be performed on the data.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The name of a valid DataBrew transformation to be performed on the data.
     * </p>
     * 
     * @param operation
     *        The name of a valid DataBrew transformation to be performed on the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeAction withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * Contextual parameters for the transformation.
     * </p>
     * 
     * @return Contextual parameters for the transformation.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Contextual parameters for the transformation.
     * </p>
     * 
     * @param parameters
     *        Contextual parameters for the transformation.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Contextual parameters for the transformation.
     * </p>
     * 
     * @param parameters
     *        Contextual parameters for the transformation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeAction withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see RecipeAction#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecipeAction addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeAction clearParametersEntries() {
        this.parameters = null;
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipeAction == false)
            return false;
        RecipeAction other = (RecipeAction) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public RecipeAction clone() {
        try {
            return (RecipeAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.RecipeActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
