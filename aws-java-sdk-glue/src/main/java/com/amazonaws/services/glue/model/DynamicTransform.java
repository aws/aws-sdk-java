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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the set of parameters needed to perform the dynamic transform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DynamicTransform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamicTransform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the name of the dynamic transform.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
     * </p>
     */
    private String transformName;
    /**
     * <p>
     * Specifies the inputs for the dynamic transform that are required.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * Specifies the parameters of the dynamic transform.
     * </p>
     */
    private java.util.List<TransformConfigParameter> parameters;
    /**
     * <p>
     * Specifies the name of the function of the dynamic transform.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Specifies the path of the dynamic transform source and config files.
     * </p>
     */
    private String path;
    /**
     * <p>
     * This field is not used and will be deprecated in future release.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Specifies the name of the dynamic transform.
     * </p>
     * 
     * @param name
     *        Specifies the name of the dynamic transform.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the dynamic transform.
     * </p>
     * 
     * @return Specifies the name of the dynamic transform.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the dynamic transform.
     * </p>
     * 
     * @param name
     *        Specifies the name of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
     * </p>
     * 
     * @param transformName
     *        Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
     */

    public void setTransformName(String transformName) {
        this.transformName = transformName;
    }

    /**
     * <p>
     * Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
     * </p>
     * 
     * @return Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
     */

    public String getTransformName() {
        return this.transformName;
    }

    /**
     * <p>
     * Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
     * </p>
     * 
     * @param transformName
     *        Specifies the name of the dynamic transform as it appears in the Glue Studio visual editor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withTransformName(String transformName) {
        setTransformName(transformName);
        return this;
    }

    /**
     * <p>
     * Specifies the inputs for the dynamic transform that are required.
     * </p>
     * 
     * @return Specifies the inputs for the dynamic transform that are required.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * Specifies the inputs for the dynamic transform that are required.
     * </p>
     * 
     * @param inputs
     *        Specifies the inputs for the dynamic transform that are required.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * Specifies the inputs for the dynamic transform that are required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        Specifies the inputs for the dynamic transform that are required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the inputs for the dynamic transform that are required.
     * </p>
     * 
     * @param inputs
     *        Specifies the inputs for the dynamic transform that are required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * Specifies the parameters of the dynamic transform.
     * </p>
     * 
     * @return Specifies the parameters of the dynamic transform.
     */

    public java.util.List<TransformConfigParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Specifies the parameters of the dynamic transform.
     * </p>
     * 
     * @param parameters
     *        Specifies the parameters of the dynamic transform.
     */

    public void setParameters(java.util.Collection<TransformConfigParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<TransformConfigParameter>(parameters);
    }

    /**
     * <p>
     * Specifies the parameters of the dynamic transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        Specifies the parameters of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withParameters(TransformConfigParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<TransformConfigParameter>(parameters.length));
        }
        for (TransformConfigParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parameters of the dynamic transform.
     * </p>
     * 
     * @param parameters
     *        Specifies the parameters of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withParameters(java.util.Collection<TransformConfigParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the function of the dynamic transform.
     * </p>
     * 
     * @param functionName
     *        Specifies the name of the function of the dynamic transform.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * Specifies the name of the function of the dynamic transform.
     * </p>
     * 
     * @return Specifies the name of the function of the dynamic transform.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * Specifies the name of the function of the dynamic transform.
     * </p>
     * 
     * @param functionName
     *        Specifies the name of the function of the dynamic transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Specifies the path of the dynamic transform source and config files.
     * </p>
     * 
     * @param path
     *        Specifies the path of the dynamic transform source and config files.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Specifies the path of the dynamic transform source and config files.
     * </p>
     * 
     * @return Specifies the path of the dynamic transform source and config files.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Specifies the path of the dynamic transform source and config files.
     * </p>
     * 
     * @param path
     *        Specifies the path of the dynamic transform source and config files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * This field is not used and will be deprecated in future release.
     * </p>
     * 
     * @param version
     *        This field is not used and will be deprecated in future release.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * This field is not used and will be deprecated in future release.
     * </p>
     * 
     * @return This field is not used and will be deprecated in future release.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * This field is not used and will be deprecated in future release.
     * </p>
     * 
     * @param version
     *        This field is not used and will be deprecated in future release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicTransform withVersion(String version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTransformName() != null)
            sb.append("TransformName: ").append(getTransformName()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamicTransform == false)
            return false;
        DynamicTransform other = (DynamicTransform) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTransformName() == null ^ this.getTransformName() == null)
            return false;
        if (other.getTransformName() != null && other.getTransformName().equals(this.getTransformName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTransformName() == null) ? 0 : getTransformName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public DynamicTransform clone() {
        try {
            return (DynamicTransform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DynamicTransformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
