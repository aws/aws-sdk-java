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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration used to run the application image container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ContainerConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The arguments for the container when you're running the application.
     * </p>
     */
    private java.util.List<String> containerArguments;
    /**
     * <p>
     * The entrypoint used to run the application in the container.
     * </p>
     */
    private java.util.List<String> containerEntrypoint;
    /**
     * <p>
     * The environment variables to set in the container
     * </p>
     */
    private java.util.Map<String, String> containerEnvironmentVariables;

    /**
     * <p>
     * The arguments for the container when you're running the application.
     * </p>
     * 
     * @return The arguments for the container when you're running the application.
     */

    public java.util.List<String> getContainerArguments() {
        return containerArguments;
    }

    /**
     * <p>
     * The arguments for the container when you're running the application.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for the container when you're running the application.
     */

    public void setContainerArguments(java.util.Collection<String> containerArguments) {
        if (containerArguments == null) {
            this.containerArguments = null;
            return;
        }

        this.containerArguments = new java.util.ArrayList<String>(containerArguments);
    }

    /**
     * <p>
     * The arguments for the container when you're running the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerArguments(java.util.Collection)} or {@link #withContainerArguments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for the container when you're running the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerConfig withContainerArguments(String... containerArguments) {
        if (this.containerArguments == null) {
            setContainerArguments(new java.util.ArrayList<String>(containerArguments.length));
        }
        for (String ele : containerArguments) {
            this.containerArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The arguments for the container when you're running the application.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for the container when you're running the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerConfig withContainerArguments(java.util.Collection<String> containerArguments) {
        setContainerArguments(containerArguments);
        return this;
    }

    /**
     * <p>
     * The entrypoint used to run the application in the container.
     * </p>
     * 
     * @return The entrypoint used to run the application in the container.
     */

    public java.util.List<String> getContainerEntrypoint() {
        return containerEntrypoint;
    }

    /**
     * <p>
     * The entrypoint used to run the application in the container.
     * </p>
     * 
     * @param containerEntrypoint
     *        The entrypoint used to run the application in the container.
     */

    public void setContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        if (containerEntrypoint == null) {
            this.containerEntrypoint = null;
            return;
        }

        this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint);
    }

    /**
     * <p>
     * The entrypoint used to run the application in the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerEntrypoint(java.util.Collection)} or {@link #withContainerEntrypoint(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerEntrypoint
     *        The entrypoint used to run the application in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerConfig withContainerEntrypoint(String... containerEntrypoint) {
        if (this.containerEntrypoint == null) {
            setContainerEntrypoint(new java.util.ArrayList<String>(containerEntrypoint.length));
        }
        for (String ele : containerEntrypoint) {
            this.containerEntrypoint.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entrypoint used to run the application in the container.
     * </p>
     * 
     * @param containerEntrypoint
     *        The entrypoint used to run the application in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerConfig withContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        setContainerEntrypoint(containerEntrypoint);
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the container
     * </p>
     * 
     * @return The environment variables to set in the container
     */

    public java.util.Map<String, String> getContainerEnvironmentVariables() {
        return containerEnvironmentVariables;
    }

    /**
     * <p>
     * The environment variables to set in the container
     * </p>
     * 
     * @param containerEnvironmentVariables
     *        The environment variables to set in the container
     */

    public void setContainerEnvironmentVariables(java.util.Map<String, String> containerEnvironmentVariables) {
        this.containerEnvironmentVariables = containerEnvironmentVariables;
    }

    /**
     * <p>
     * The environment variables to set in the container
     * </p>
     * 
     * @param containerEnvironmentVariables
     *        The environment variables to set in the container
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerConfig withContainerEnvironmentVariables(java.util.Map<String, String> containerEnvironmentVariables) {
        setContainerEnvironmentVariables(containerEnvironmentVariables);
        return this;
    }

    /**
     * Add a single ContainerEnvironmentVariables entry
     *
     * @see ContainerConfig#withContainerEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContainerConfig addContainerEnvironmentVariablesEntry(String key, String value) {
        if (null == this.containerEnvironmentVariables) {
            this.containerEnvironmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.containerEnvironmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.containerEnvironmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ContainerEnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerConfig clearContainerEnvironmentVariablesEntries() {
        this.containerEnvironmentVariables = null;
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
        if (getContainerArguments() != null)
            sb.append("ContainerArguments: ").append(getContainerArguments()).append(",");
        if (getContainerEntrypoint() != null)
            sb.append("ContainerEntrypoint: ").append(getContainerEntrypoint()).append(",");
        if (getContainerEnvironmentVariables() != null)
            sb.append("ContainerEnvironmentVariables: ").append(getContainerEnvironmentVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerConfig == false)
            return false;
        ContainerConfig other = (ContainerConfig) obj;
        if (other.getContainerArguments() == null ^ this.getContainerArguments() == null)
            return false;
        if (other.getContainerArguments() != null && other.getContainerArguments().equals(this.getContainerArguments()) == false)
            return false;
        if (other.getContainerEntrypoint() == null ^ this.getContainerEntrypoint() == null)
            return false;
        if (other.getContainerEntrypoint() != null && other.getContainerEntrypoint().equals(this.getContainerEntrypoint()) == false)
            return false;
        if (other.getContainerEnvironmentVariables() == null ^ this.getContainerEnvironmentVariables() == null)
            return false;
        if (other.getContainerEnvironmentVariables() != null
                && other.getContainerEnvironmentVariables().equals(this.getContainerEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerArguments() == null) ? 0 : getContainerArguments().hashCode());
        hashCode = prime * hashCode + ((getContainerEntrypoint() == null) ? 0 : getContainerEntrypoint().hashCode());
        hashCode = prime * hashCode + ((getContainerEnvironmentVariables() == null) ? 0 : getContainerEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public ContainerConfig clone() {
        try {
            return (ContainerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ContainerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
