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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for tensor collections.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CollectionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to other rule configuration names.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are <code>"name"</code>,
     * <code>"include_regex"</code>, <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     */
    private java.util.Map<String, String> collectionParameters;

    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to other rule configuration names.
     * </p>
     * 
     * @param collectionName
     *        The name of the tensor collection. The name must be unique relative to other rule configuration names.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to other rule configuration names.
     * </p>
     * 
     * @return The name of the tensor collection. The name must be unique relative to other rule configuration names.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to other rule configuration names.
     * </p>
     * 
     * @param collectionName
     *        The name of the tensor collection. The name must be unique relative to other rule configuration names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionConfiguration withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are <code>"name"</code>,
     * <code>"include_regex"</code>, <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     * 
     * @return Parameter values for the tensor collection. The allowed parameters are <code>"name"</code>,
     *         <code>"include_regex"</code>, <code>"reduction_config"</code>, <code>"save_config"</code>,
     *         <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     */

    public java.util.Map<String, String> getCollectionParameters() {
        return collectionParameters;
    }

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are <code>"name"</code>,
     * <code>"include_regex"</code>, <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     * 
     * @param collectionParameters
     *        Parameter values for the tensor collection. The allowed parameters are <code>"name"</code>,
     *        <code>"include_regex"</code>, <code>"reduction_config"</code>, <code>"save_config"</code>,
     *        <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     */

    public void setCollectionParameters(java.util.Map<String, String> collectionParameters) {
        this.collectionParameters = collectionParameters;
    }

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are <code>"name"</code>,
     * <code>"include_regex"</code>, <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     * 
     * @param collectionParameters
     *        Parameter values for the tensor collection. The allowed parameters are <code>"name"</code>,
     *        <code>"include_regex"</code>, <code>"reduction_config"</code>, <code>"save_config"</code>,
     *        <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionConfiguration withCollectionParameters(java.util.Map<String, String> collectionParameters) {
        setCollectionParameters(collectionParameters);
        return this;
    }

    /**
     * Add a single CollectionParameters entry
     *
     * @see CollectionConfiguration#withCollectionParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CollectionConfiguration addCollectionParametersEntry(String key, String value) {
        if (null == this.collectionParameters) {
            this.collectionParameters = new java.util.HashMap<String, String>();
        }
        if (this.collectionParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.collectionParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CollectionParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionConfiguration clearCollectionParametersEntries() {
        this.collectionParameters = null;
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
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getCollectionParameters() != null)
            sb.append("CollectionParameters: ").append(getCollectionParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectionConfiguration == false)
            return false;
        CollectionConfiguration other = (CollectionConfiguration) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getCollectionParameters() == null ^ this.getCollectionParameters() == null)
            return false;
        if (other.getCollectionParameters() != null && other.getCollectionParameters().equals(this.getCollectionParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getCollectionParameters() == null) ? 0 : getCollectionParameters().hashCode());
        return hashCode;
    }

    @Override
    public CollectionConfiguration clone() {
        try {
            return (CollectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CollectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
