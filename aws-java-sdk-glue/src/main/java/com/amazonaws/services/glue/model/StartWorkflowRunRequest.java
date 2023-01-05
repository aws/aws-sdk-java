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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartWorkflowRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartWorkflowRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the workflow to start.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The workflow run properties for the new workflow run.
     * </p>
     */
    private java.util.Map<String, String> runProperties;

    /**
     * <p>
     * The name of the workflow to start.
     * </p>
     * 
     * @param name
     *        The name of the workflow to start.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow to start.
     * </p>
     * 
     * @return The name of the workflow to start.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow to start.
     * </p>
     * 
     * @param name
     *        The name of the workflow to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowRunRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The workflow run properties for the new workflow run.
     * </p>
     * 
     * @return The workflow run properties for the new workflow run.
     */

    public java.util.Map<String, String> getRunProperties() {
        return runProperties;
    }

    /**
     * <p>
     * The workflow run properties for the new workflow run.
     * </p>
     * 
     * @param runProperties
     *        The workflow run properties for the new workflow run.
     */

    public void setRunProperties(java.util.Map<String, String> runProperties) {
        this.runProperties = runProperties;
    }

    /**
     * <p>
     * The workflow run properties for the new workflow run.
     * </p>
     * 
     * @param runProperties
     *        The workflow run properties for the new workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowRunRequest withRunProperties(java.util.Map<String, String> runProperties) {
        setRunProperties(runProperties);
        return this;
    }

    /**
     * Add a single RunProperties entry
     *
     * @see StartWorkflowRunRequest#withRunProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowRunRequest addRunPropertiesEntry(String key, String value) {
        if (null == this.runProperties) {
            this.runProperties = new java.util.HashMap<String, String>();
        }
        if (this.runProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.runProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RunProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowRunRequest clearRunPropertiesEntries() {
        this.runProperties = null;
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
        if (getRunProperties() != null)
            sb.append("RunProperties: ").append(getRunProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartWorkflowRunRequest == false)
            return false;
        StartWorkflowRunRequest other = (StartWorkflowRunRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRunProperties() == null ^ this.getRunProperties() == null)
            return false;
        if (other.getRunProperties() != null && other.getRunProperties().equals(this.getRunProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRunProperties() == null) ? 0 : getRunProperties().hashCode());
        return hashCode;
    }

    @Override
    public StartWorkflowRunRequest clone() {
        return (StartWorkflowRunRequest) super.clone();
    }

}
