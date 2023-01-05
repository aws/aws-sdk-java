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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the model metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelMetadataSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelMetadataSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The machine learning domain of the model.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The machine learning framework of the model.
     * </p>
     */
    private String framework;
    /**
     * <p>
     * The machine learning task of the model.
     * </p>
     */
    private String task;
    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The framework version of the model.
     * </p>
     */
    private String frameworkVersion;

    /**
     * <p>
     * The machine learning domain of the model.
     * </p>
     * 
     * @param domain
     *        The machine learning domain of the model.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The machine learning domain of the model.
     * </p>
     * 
     * @return The machine learning domain of the model.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The machine learning domain of the model.
     * </p>
     * 
     * @param domain
     *        The machine learning domain of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadataSummary withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The machine learning framework of the model.
     * </p>
     * 
     * @param framework
     *        The machine learning framework of the model.
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The machine learning framework of the model.
     * </p>
     * 
     * @return The machine learning framework of the model.
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * The machine learning framework of the model.
     * </p>
     * 
     * @param framework
     *        The machine learning framework of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadataSummary withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * The machine learning task of the model.
     * </p>
     * 
     * @param task
     *        The machine learning task of the model.
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The machine learning task of the model.
     * </p>
     * 
     * @return The machine learning task of the model.
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The machine learning task of the model.
     * </p>
     * 
     * @param task
     *        The machine learning task of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadataSummary withTask(String task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param model
     *        The name of the model.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param model
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadataSummary withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The framework version of the model.
     * </p>
     * 
     * @param frameworkVersion
     *        The framework version of the model.
     */

    public void setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
    }

    /**
     * <p>
     * The framework version of the model.
     * </p>
     * 
     * @return The framework version of the model.
     */

    public String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    /**
     * <p>
     * The framework version of the model.
     * </p>
     * 
     * @param frameworkVersion
     *        The framework version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadataSummary withFrameworkVersion(String frameworkVersion) {
        setFrameworkVersion(frameworkVersion);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getFrameworkVersion() != null)
            sb.append("FrameworkVersion: ").append(getFrameworkVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelMetadataSummary == false)
            return false;
        ModelMetadataSummary other = (ModelMetadataSummary) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getFrameworkVersion() == null ^ this.getFrameworkVersion() == null)
            return false;
        if (other.getFrameworkVersion() != null && other.getFrameworkVersion().equals(this.getFrameworkVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getFrameworkVersion() == null) ? 0 : getFrameworkVersion().hashCode());
        return hashCode;
    }

    @Override
    public ModelMetadataSummary clone() {
        try {
            return (ModelMetadataSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelMetadataSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
