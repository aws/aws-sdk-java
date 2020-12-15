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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an AWS Lambda function to import to create a component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/LambdaFunctionRecipeSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionRecipeSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function. The ARN must include the version of the function to import. You can't use version aliases like
     * <code>$LATEST</code>.
     * </p>
     */
    private String lambdaArn;
    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * Defaults to the name of the Lambda function.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * Defaults to the version of the Lambda function as a semantic version. For example, if your function version is
     * <code>3</code>, the component version becomes <code>3.0.0</code>.
     * </p>
     */
    private String componentVersion;
    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     */
    private java.util.List<ComponentPlatform> componentPlatforms;
    /**
     * <p>
     * The component versions on which this Lambda function component depends.
     * </p>
     */
    private java.util.Map<String, ComponentDependencyRequirement> componentDependencies;
    /**
     * <p>
     * The system and runtime parameters for the Lambda function as it runs on the AWS IoT Greengrass core device.
     * </p>
     */
    private LambdaExecutionParameters componentLambdaParameters;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function. The ARN must include the version of the function to import. You can't use version aliases like
     * <code>$LATEST</code>.
     * </p>
     * 
     * @param lambdaArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        Lambda function. The ARN must include the version of the function to import. You can't use version aliases
     *        like <code>$LATEST</code>.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function. The ARN must include the version of the function to import. You can't use version aliases like
     * <code>$LATEST</code>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         Lambda function. The ARN must include the version of the function to import. You can't use version
     *         aliases like <code>$LATEST</code>.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the Lambda
     * function. The ARN must include the version of the function to import. You can't use version aliases like
     * <code>$LATEST</code>.
     * </p>
     * 
     * @param lambdaArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        Lambda function. The ARN must include the version of the function to import. You can't use version aliases
     *        like <code>$LATEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource withLambdaArn(String lambdaArn) {
        setLambdaArn(lambdaArn);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * Defaults to the name of the Lambda function.
     * </p>
     * 
     * @param componentName
     *        The name of the component.</p>
     *        <p>
     *        Defaults to the name of the Lambda function.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * Defaults to the name of the Lambda function.
     * </p>
     * 
     * @return The name of the component.</p>
     *         <p>
     *         Defaults to the name of the Lambda function.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * Defaults to the name of the Lambda function.
     * </p>
     * 
     * @param componentName
     *        The name of the component.</p>
     *        <p>
     *        Defaults to the name of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * Defaults to the version of the Lambda function as a semantic version. For example, if your function version is
     * <code>3</code>, the component version becomes <code>3.0.0</code>.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.</p>
     *        <p>
     *        Defaults to the version of the Lambda function as a semantic version. For example, if your function
     *        version is <code>3</code>, the component version becomes <code>3.0.0</code>.
     */

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * Defaults to the version of the Lambda function as a semantic version. For example, if your function version is
     * <code>3</code>, the component version becomes <code>3.0.0</code>.
     * </p>
     * 
     * @return The version of the component.</p>
     *         <p>
     *         Defaults to the version of the Lambda function as a semantic version. For example, if your function
     *         version is <code>3</code>, the component version becomes <code>3.0.0</code>.
     */

    public String getComponentVersion() {
        return this.componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * Defaults to the version of the Lambda function as a semantic version. For example, if your function version is
     * <code>3</code>, the component version becomes <code>3.0.0</code>.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.</p>
     *        <p>
     *        Defaults to the version of the Lambda function as a semantic version. For example, if your function
     *        version is <code>3</code>, the component version becomes <code>3.0.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
        return this;
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * 
     * @return The platforms that the component version supports.
     */

    public java.util.List<ComponentPlatform> getComponentPlatforms() {
        return componentPlatforms;
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * 
     * @param componentPlatforms
     *        The platforms that the component version supports.
     */

    public void setComponentPlatforms(java.util.Collection<ComponentPlatform> componentPlatforms) {
        if (componentPlatforms == null) {
            this.componentPlatforms = null;
            return;
        }

        this.componentPlatforms = new java.util.ArrayList<ComponentPlatform>(componentPlatforms);
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentPlatforms(java.util.Collection)} or {@link #withComponentPlatforms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param componentPlatforms
     *        The platforms that the component version supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource withComponentPlatforms(ComponentPlatform... componentPlatforms) {
        if (this.componentPlatforms == null) {
            setComponentPlatforms(new java.util.ArrayList<ComponentPlatform>(componentPlatforms.length));
        }
        for (ComponentPlatform ele : componentPlatforms) {
            this.componentPlatforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The platforms that the component version supports.
     * </p>
     * 
     * @param componentPlatforms
     *        The platforms that the component version supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource withComponentPlatforms(java.util.Collection<ComponentPlatform> componentPlatforms) {
        setComponentPlatforms(componentPlatforms);
        return this;
    }

    /**
     * <p>
     * The component versions on which this Lambda function component depends.
     * </p>
     * 
     * @return The component versions on which this Lambda function component depends.
     */

    public java.util.Map<String, ComponentDependencyRequirement> getComponentDependencies() {
        return componentDependencies;
    }

    /**
     * <p>
     * The component versions on which this Lambda function component depends.
     * </p>
     * 
     * @param componentDependencies
     *        The component versions on which this Lambda function component depends.
     */

    public void setComponentDependencies(java.util.Map<String, ComponentDependencyRequirement> componentDependencies) {
        this.componentDependencies = componentDependencies;
    }

    /**
     * <p>
     * The component versions on which this Lambda function component depends.
     * </p>
     * 
     * @param componentDependencies
     *        The component versions on which this Lambda function component depends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource withComponentDependencies(java.util.Map<String, ComponentDependencyRequirement> componentDependencies) {
        setComponentDependencies(componentDependencies);
        return this;
    }

    /**
     * Add a single ComponentDependencies entry
     *
     * @see LambdaFunctionRecipeSource#withComponentDependencies
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource addComponentDependenciesEntry(String key, ComponentDependencyRequirement value) {
        if (null == this.componentDependencies) {
            this.componentDependencies = new java.util.HashMap<String, ComponentDependencyRequirement>();
        }
        if (this.componentDependencies.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.componentDependencies.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ComponentDependencies.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource clearComponentDependenciesEntries() {
        this.componentDependencies = null;
        return this;
    }

    /**
     * <p>
     * The system and runtime parameters for the Lambda function as it runs on the AWS IoT Greengrass core device.
     * </p>
     * 
     * @param componentLambdaParameters
     *        The system and runtime parameters for the Lambda function as it runs on the AWS IoT Greengrass core
     *        device.
     */

    public void setComponentLambdaParameters(LambdaExecutionParameters componentLambdaParameters) {
        this.componentLambdaParameters = componentLambdaParameters;
    }

    /**
     * <p>
     * The system and runtime parameters for the Lambda function as it runs on the AWS IoT Greengrass core device.
     * </p>
     * 
     * @return The system and runtime parameters for the Lambda function as it runs on the AWS IoT Greengrass core
     *         device.
     */

    public LambdaExecutionParameters getComponentLambdaParameters() {
        return this.componentLambdaParameters;
    }

    /**
     * <p>
     * The system and runtime parameters for the Lambda function as it runs on the AWS IoT Greengrass core device.
     * </p>
     * 
     * @param componentLambdaParameters
     *        The system and runtime parameters for the Lambda function as it runs on the AWS IoT Greengrass core
     *        device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionRecipeSource withComponentLambdaParameters(LambdaExecutionParameters componentLambdaParameters) {
        setComponentLambdaParameters(componentLambdaParameters);
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
        if (getLambdaArn() != null)
            sb.append("LambdaArn: ").append(getLambdaArn()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getComponentPlatforms() != null)
            sb.append("ComponentPlatforms: ").append(getComponentPlatforms()).append(",");
        if (getComponentDependencies() != null)
            sb.append("ComponentDependencies: ").append(getComponentDependencies()).append(",");
        if (getComponentLambdaParameters() != null)
            sb.append("ComponentLambdaParameters: ").append(getComponentLambdaParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionRecipeSource == false)
            return false;
        LambdaFunctionRecipeSource other = (LambdaFunctionRecipeSource) obj;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        if (other.getComponentPlatforms() == null ^ this.getComponentPlatforms() == null)
            return false;
        if (other.getComponentPlatforms() != null && other.getComponentPlatforms().equals(this.getComponentPlatforms()) == false)
            return false;
        if (other.getComponentDependencies() == null ^ this.getComponentDependencies() == null)
            return false;
        if (other.getComponentDependencies() != null && other.getComponentDependencies().equals(this.getComponentDependencies()) == false)
            return false;
        if (other.getComponentLambdaParameters() == null ^ this.getComponentLambdaParameters() == null)
            return false;
        if (other.getComponentLambdaParameters() != null && other.getComponentLambdaParameters().equals(this.getComponentLambdaParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        hashCode = prime * hashCode + ((getComponentPlatforms() == null) ? 0 : getComponentPlatforms().hashCode());
        hashCode = prime * hashCode + ((getComponentDependencies() == null) ? 0 : getComponentDependencies().hashCode());
        hashCode = prime * hashCode + ((getComponentLambdaParameters() == null) ? 0 : getComponentLambdaParameters().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionRecipeSource clone() {
        try {
            return (LambdaFunctionRecipeSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.LambdaFunctionRecipeSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
