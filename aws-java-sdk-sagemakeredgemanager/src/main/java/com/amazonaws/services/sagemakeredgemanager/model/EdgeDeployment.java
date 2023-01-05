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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a deployment on an edge device that is registered with SageMaker Edge Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/EdgeDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeDeployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     */
    private String deploymentName;
    /**
     * <p>
     * The type of the deployment.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Determines whether to rollback to previous configuration if deployment fails.
     * </p>
     */
    private String failureHandlingPolicy;
    /**
     * <p>
     * Returns a list of Definition objects.
     * </p>
     */
    private java.util.List<Definition> definitions;

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     * 
     * @param deploymentName
     *        The name and unique ID of the deployment.
     */

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     * 
     * @return The name and unique ID of the deployment.
     */

    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     * 
     * @param deploymentName
     *        The name and unique ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeployment withDeploymentName(String deploymentName) {
        setDeploymentName(deploymentName);
        return this;
    }

    /**
     * <p>
     * The type of the deployment.
     * </p>
     * 
     * @param type
     *        The type of the deployment.
     * @see DeploymentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the deployment.
     * </p>
     * 
     * @return The type of the deployment.
     * @see DeploymentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the deployment.
     * </p>
     * 
     * @param type
     *        The type of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public EdgeDeployment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the deployment.
     * </p>
     * 
     * @param type
     *        The type of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public EdgeDeployment withType(DeploymentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether to rollback to previous configuration if deployment fails.
     * </p>
     * 
     * @param failureHandlingPolicy
     *        Determines whether to rollback to previous configuration if deployment fails.
     * @see FailureHandlingPolicy
     */

    public void setFailureHandlingPolicy(String failureHandlingPolicy) {
        this.failureHandlingPolicy = failureHandlingPolicy;
    }

    /**
     * <p>
     * Determines whether to rollback to previous configuration if deployment fails.
     * </p>
     * 
     * @return Determines whether to rollback to previous configuration if deployment fails.
     * @see FailureHandlingPolicy
     */

    public String getFailureHandlingPolicy() {
        return this.failureHandlingPolicy;
    }

    /**
     * <p>
     * Determines whether to rollback to previous configuration if deployment fails.
     * </p>
     * 
     * @param failureHandlingPolicy
     *        Determines whether to rollback to previous configuration if deployment fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureHandlingPolicy
     */

    public EdgeDeployment withFailureHandlingPolicy(String failureHandlingPolicy) {
        setFailureHandlingPolicy(failureHandlingPolicy);
        return this;
    }

    /**
     * <p>
     * Determines whether to rollback to previous configuration if deployment fails.
     * </p>
     * 
     * @param failureHandlingPolicy
     *        Determines whether to rollback to previous configuration if deployment fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureHandlingPolicy
     */

    public EdgeDeployment withFailureHandlingPolicy(FailureHandlingPolicy failureHandlingPolicy) {
        this.failureHandlingPolicy = failureHandlingPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Returns a list of Definition objects.
     * </p>
     * 
     * @return Returns a list of Definition objects.
     */

    public java.util.List<Definition> getDefinitions() {
        return definitions;
    }

    /**
     * <p>
     * Returns a list of Definition objects.
     * </p>
     * 
     * @param definitions
     *        Returns a list of Definition objects.
     */

    public void setDefinitions(java.util.Collection<Definition> definitions) {
        if (definitions == null) {
            this.definitions = null;
            return;
        }

        this.definitions = new java.util.ArrayList<Definition>(definitions);
    }

    /**
     * <p>
     * Returns a list of Definition objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefinitions(java.util.Collection)} or {@link #withDefinitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param definitions
     *        Returns a list of Definition objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeployment withDefinitions(Definition... definitions) {
        if (this.definitions == null) {
            setDefinitions(new java.util.ArrayList<Definition>(definitions.length));
        }
        for (Definition ele : definitions) {
            this.definitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of Definition objects.
     * </p>
     * 
     * @param definitions
     *        Returns a list of Definition objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeployment withDefinitions(java.util.Collection<Definition> definitions) {
        setDefinitions(definitions);
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
        if (getDeploymentName() != null)
            sb.append("DeploymentName: ").append(getDeploymentName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getFailureHandlingPolicy() != null)
            sb.append("FailureHandlingPolicy: ").append(getFailureHandlingPolicy()).append(",");
        if (getDefinitions() != null)
            sb.append("Definitions: ").append(getDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeDeployment == false)
            return false;
        EdgeDeployment other = (EdgeDeployment) obj;
        if (other.getDeploymentName() == null ^ this.getDeploymentName() == null)
            return false;
        if (other.getDeploymentName() != null && other.getDeploymentName().equals(this.getDeploymentName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getFailureHandlingPolicy() == null ^ this.getFailureHandlingPolicy() == null)
            return false;
        if (other.getFailureHandlingPolicy() != null && other.getFailureHandlingPolicy().equals(this.getFailureHandlingPolicy()) == false)
            return false;
        if (other.getDefinitions() == null ^ this.getDefinitions() == null)
            return false;
        if (other.getDefinitions() != null && other.getDefinitions().equals(this.getDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentName() == null) ? 0 : getDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getFailureHandlingPolicy() == null) ? 0 : getFailureHandlingPolicy().hashCode());
        hashCode = prime * hashCode + ((getDefinitions() == null) ? 0 : getDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public EdgeDeployment clone() {
        try {
            return (EdgeDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakeredgemanager.model.transform.EdgeDeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
