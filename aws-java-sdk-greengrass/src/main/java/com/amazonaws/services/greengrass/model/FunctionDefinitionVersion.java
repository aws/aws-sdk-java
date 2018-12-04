/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information on the function definition version
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionDefinitionVersion implements Serializable, Cloneable, StructuredPojo {

    /** Lambda functions in this function definition version. */
    private java.util.List<Function> functions;

    /**
     * Lambda functions in this function definition version.
     * 
     * @return Lambda functions in this function definition version.
     */

    public java.util.List<Function> getFunctions() {
        return functions;
    }

    /**
     * Lambda functions in this function definition version.
     * 
     * @param functions
     *        Lambda functions in this function definition version.
     */

    public void setFunctions(java.util.Collection<Function> functions) {
        if (functions == null) {
            this.functions = null;
            return;
        }

        this.functions = new java.util.ArrayList<Function>(functions);
    }

    /**
     * Lambda functions in this function definition version.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctions(java.util.Collection)} or {@link #withFunctions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param functions
     *        Lambda functions in this function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionDefinitionVersion withFunctions(Function... functions) {
        if (this.functions == null) {
            setFunctions(new java.util.ArrayList<Function>(functions.length));
        }
        for (Function ele : functions) {
            this.functions.add(ele);
        }
        return this;
    }

    /**
     * Lambda functions in this function definition version.
     * 
     * @param functions
     *        Lambda functions in this function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionDefinitionVersion withFunctions(java.util.Collection<Function> functions) {
        setFunctions(functions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctions() != null)
            sb.append("Functions: ").append(getFunctions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionDefinitionVersion == false)
            return false;
        FunctionDefinitionVersion other = (FunctionDefinitionVersion) obj;
        if (other.getFunctions() == null ^ this.getFunctions() == null)
            return false;
        if (other.getFunctions() != null && other.getFunctions().equals(this.getFunctions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctions() == null) ? 0 : getFunctions().hashCode());
        return hashCode;
    }

    @Override
    public FunctionDefinitionVersion clone() {
        try {
            return (FunctionDefinitionVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.FunctionDefinitionVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
