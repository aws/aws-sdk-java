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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information required to run the <code>containerAction</code> to produce dataset contents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ContainerDatasetAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDatasetAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Docker container stored in your account. The Docker container contains an application and required
     * support libraries and is used to generate dataset contents.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The ARN of the role that gives permission to the system to access required resources to run the
     * <code>containerAction</code>. This includes, at minimum, permission to retrieve the dataset contents that are the
     * input to the containerized application.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * Configuration of the resource that executes the <code>containerAction</code>.
     * </p>
     */
    private ResourceConfiguration resourceConfiguration;
    /**
     * <p>
     * The values of variables used in the context of the execution of the containerized application (basically,
     * parameters passed to the application). Each variable must have a name and a value given by one of
     * <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     * </p>
     */
    private java.util.List<Variable> variables;

    /**
     * <p>
     * The ARN of the Docker container stored in your account. The Docker container contains an application and required
     * support libraries and is used to generate dataset contents.
     * </p>
     * 
     * @param image
     *        The ARN of the Docker container stored in your account. The Docker container contains an application and
     *        required support libraries and is used to generate dataset contents.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The ARN of the Docker container stored in your account. The Docker container contains an application and required
     * support libraries and is used to generate dataset contents.
     * </p>
     * 
     * @return The ARN of the Docker container stored in your account. The Docker container contains an application and
     *         required support libraries and is used to generate dataset contents.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The ARN of the Docker container stored in your account. The Docker container contains an application and required
     * support libraries and is used to generate dataset contents.
     * </p>
     * 
     * @param image
     *        The ARN of the Docker container stored in your account. The Docker container contains an application and
     *        required support libraries and is used to generate dataset contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDatasetAction withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that gives permission to the system to access required resources to run the
     * <code>containerAction</code>. This includes, at minimum, permission to retrieve the dataset contents that are the
     * input to the containerized application.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the role that gives permission to the system to access required resources to run the
     *        <code>containerAction</code>. This includes, at minimum, permission to retrieve the dataset contents that
     *        are the input to the containerized application.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that gives permission to the system to access required resources to run the
     * <code>containerAction</code>. This includes, at minimum, permission to retrieve the dataset contents that are the
     * input to the containerized application.
     * </p>
     * 
     * @return The ARN of the role that gives permission to the system to access required resources to run the
     *         <code>containerAction</code>. This includes, at minimum, permission to retrieve the dataset contents that
     *         are the input to the containerized application.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that gives permission to the system to access required resources to run the
     * <code>containerAction</code>. This includes, at minimum, permission to retrieve the dataset contents that are the
     * input to the containerized application.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the role that gives permission to the system to access required resources to run the
     *        <code>containerAction</code>. This includes, at minimum, permission to retrieve the dataset contents that
     *        are the input to the containerized application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDatasetAction withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * Configuration of the resource that executes the <code>containerAction</code>.
     * </p>
     * 
     * @param resourceConfiguration
     *        Configuration of the resource that executes the <code>containerAction</code>.
     */

    public void setResourceConfiguration(ResourceConfiguration resourceConfiguration) {
        this.resourceConfiguration = resourceConfiguration;
    }

    /**
     * <p>
     * Configuration of the resource that executes the <code>containerAction</code>.
     * </p>
     * 
     * @return Configuration of the resource that executes the <code>containerAction</code>.
     */

    public ResourceConfiguration getResourceConfiguration() {
        return this.resourceConfiguration;
    }

    /**
     * <p>
     * Configuration of the resource that executes the <code>containerAction</code>.
     * </p>
     * 
     * @param resourceConfiguration
     *        Configuration of the resource that executes the <code>containerAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDatasetAction withResourceConfiguration(ResourceConfiguration resourceConfiguration) {
        setResourceConfiguration(resourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The values of variables used in the context of the execution of the containerized application (basically,
     * parameters passed to the application). Each variable must have a name and a value given by one of
     * <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     * </p>
     * 
     * @return The values of variables used in the context of the execution of the containerized application (basically,
     *         parameters passed to the application). Each variable must have a name and a value given by one of
     *         <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     */

    public java.util.List<Variable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The values of variables used in the context of the execution of the containerized application (basically,
     * parameters passed to the application). Each variable must have a name and a value given by one of
     * <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     * </p>
     * 
     * @param variables
     *        The values of variables used in the context of the execution of the containerized application (basically,
     *        parameters passed to the application). Each variable must have a name and a value given by one of
     *        <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     */

    public void setVariables(java.util.Collection<Variable> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<Variable>(variables);
    }

    /**
     * <p>
     * The values of variables used in the context of the execution of the containerized application (basically,
     * parameters passed to the application). Each variable must have a name and a value given by one of
     * <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        The values of variables used in the context of the execution of the containerized application (basically,
     *        parameters passed to the application). Each variable must have a name and a value given by one of
     *        <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDatasetAction withVariables(Variable... variables) {
        if (this.variables == null) {
            setVariables(new java.util.ArrayList<Variable>(variables.length));
        }
        for (Variable ele : variables) {
            this.variables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of variables used in the context of the execution of the containerized application (basically,
     * parameters passed to the application). Each variable must have a name and a value given by one of
     * <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     * </p>
     * 
     * @param variables
     *        The values of variables used in the context of the execution of the containerized application (basically,
     *        parameters passed to the application). Each variable must have a name and a value given by one of
     *        <code>stringValue</code>, <code>datasetContentVersionValue</code>, or <code>outputFileUriValue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDatasetAction withVariables(java.util.Collection<Variable> variables) {
        setVariables(variables);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getResourceConfiguration() != null)
            sb.append("ResourceConfiguration: ").append(getResourceConfiguration()).append(",");
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDatasetAction == false)
            return false;
        ContainerDatasetAction other = (ContainerDatasetAction) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getResourceConfiguration() == null ^ this.getResourceConfiguration() == null)
            return false;
        if (other.getResourceConfiguration() != null && other.getResourceConfiguration().equals(this.getResourceConfiguration()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResourceConfiguration() == null) ? 0 : getResourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDatasetAction clone() {
        try {
            return (ContainerDatasetAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.ContainerDatasetActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
