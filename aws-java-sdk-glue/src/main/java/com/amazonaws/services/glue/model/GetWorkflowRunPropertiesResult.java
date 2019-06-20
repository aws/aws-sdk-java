/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRunProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowRunPropertiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     */
    private java.util.Map<String, String> runProperties;

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     * 
     * @return The workflow run properties which were set during the specified run.
     */

    public java.util.Map<String, String> getRunProperties() {
        return runProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     * 
     * @param runProperties
     *        The workflow run properties which were set during the specified run.
     */

    public void setRunProperties(java.util.Map<String, String> runProperties) {
        this.runProperties = runProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     * 
     * @param runProperties
     *        The workflow run properties which were set during the specified run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunPropertiesResult withRunProperties(java.util.Map<String, String> runProperties) {
        setRunProperties(runProperties);
        return this;
    }

    public GetWorkflowRunPropertiesResult addRunPropertiesEntry(String key, String value) {
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

    public GetWorkflowRunPropertiesResult clearRunPropertiesEntries() {
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

        if (obj instanceof GetWorkflowRunPropertiesResult == false)
            return false;
        GetWorkflowRunPropertiesResult other = (GetWorkflowRunPropertiesResult) obj;
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

        hashCode = prime * hashCode + ((getRunProperties() == null) ? 0 : getRunProperties().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowRunPropertiesResult clone() {
        try {
            return (GetWorkflowRunPropertiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
