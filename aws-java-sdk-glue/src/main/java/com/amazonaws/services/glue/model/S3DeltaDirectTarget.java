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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a target that writes to a Delta Lake data source in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/S3DeltaDirectTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DeltaDirectTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     */
    private java.util.List<java.util.List<String>> partitionKeys;
    /**
     * <p>
     * The Amazon S3 path of your Delta Lake data source to write to.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     */
    private String compression;
    /**
     * <p>
     * Specifies the data output format for the target.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Specifies additional connection options for the connector.
     * </p>
     */
    private java.util.Map<String, String> additionalOptions;
    /**
     * <p>
     * A policy that specifies update behavior for the crawler.
     * </p>
     */
    private DirectSchemaChangePolicy schemaChangePolicy;

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @param name
     *        The name of the data target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @return The name of the data target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data target.
     * </p>
     * 
     * @param name
     *        The name of the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @return The nodes that are inputs to the data target.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
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
     * The nodes that are inputs to the data target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withInputs(String... inputs) {
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
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * 
     * @return Specifies native partitioning using a sequence of keys.
     */

    public java.util.List<java.util.List<String>> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * 
     * @param partitionKeys
     *        Specifies native partitioning using a sequence of keys.
     */

    public void setPartitionKeys(java.util.Collection<java.util.List<String>> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<java.util.List<String>>(partitionKeys);
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        Specifies native partitioning using a sequence of keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withPartitionKeys(java.util.List<String>... partitionKeys) {
        if (this.partitionKeys == null) {
            setPartitionKeys(new java.util.ArrayList<java.util.List<String>>(partitionKeys.length));
        }
        for (java.util.List<String> ele : partitionKeys) {
            this.partitionKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies native partitioning using a sequence of keys.
     * </p>
     * 
     * @param partitionKeys
     *        Specifies native partitioning using a sequence of keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withPartitionKeys(java.util.Collection<java.util.List<String>> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path of your Delta Lake data source to write to.
     * </p>
     * 
     * @param path
     *        The Amazon S3 path of your Delta Lake data source to write to.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The Amazon S3 path of your Delta Lake data source to write to.
     * </p>
     * 
     * @return The Amazon S3 path of your Delta Lake data source to write to.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The Amazon S3 path of your Delta Lake data source to write to.
     * </p>
     * 
     * @param path
     *        The Amazon S3 path of your Delta Lake data source to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @param compression
     *        Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *        extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @see DeltaTargetCompressionType
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @return Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *         extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @see DeltaTargetCompressionType
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @param compression
     *        Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *        extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeltaTargetCompressionType
     */

    public S3DeltaDirectTarget withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @param compression
     *        Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *        extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeltaTargetCompressionType
     */

    public S3DeltaDirectTarget withCompression(DeltaTargetCompressionType compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the data output format for the target.
     * </p>
     * 
     * @param format
     *        Specifies the data output format for the target.
     * @see TargetFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Specifies the data output format for the target.
     * </p>
     * 
     * @return Specifies the data output format for the target.
     * @see TargetFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Specifies the data output format for the target.
     * </p>
     * 
     * @param format
     *        Specifies the data output format for the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetFormat
     */

    public S3DeltaDirectTarget withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Specifies the data output format for the target.
     * </p>
     * 
     * @param format
     *        Specifies the data output format for the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetFormat
     */

    public S3DeltaDirectTarget withFormat(TargetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Specifies additional connection options for the connector.
     * </p>
     * 
     * @return Specifies additional connection options for the connector.
     */

    public java.util.Map<String, String> getAdditionalOptions() {
        return additionalOptions;
    }

    /**
     * <p>
     * Specifies additional connection options for the connector.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional connection options for the connector.
     */

    public void setAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Specifies additional connection options for the connector.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional connection options for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * Add a single AdditionalOptions entry
     *
     * @see S3DeltaDirectTarget#withAdditionalOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget addAdditionalOptionsEntry(String key, String value) {
        if (null == this.additionalOptions) {
            this.additionalOptions = new java.util.HashMap<String, String>();
        }
        if (this.additionalOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget clearAdditionalOptionsEntries() {
        this.additionalOptions = null;
        return this;
    }

    /**
     * <p>
     * A policy that specifies update behavior for the crawler.
     * </p>
     * 
     * @param schemaChangePolicy
     *        A policy that specifies update behavior for the crawler.
     */

    public void setSchemaChangePolicy(DirectSchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    /**
     * <p>
     * A policy that specifies update behavior for the crawler.
     * </p>
     * 
     * @return A policy that specifies update behavior for the crawler.
     */

    public DirectSchemaChangePolicy getSchemaChangePolicy() {
        return this.schemaChangePolicy;
    }

    /**
     * <p>
     * A policy that specifies update behavior for the crawler.
     * </p>
     * 
     * @param schemaChangePolicy
     *        A policy that specifies update behavior for the crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaDirectTarget withSchemaChangePolicy(DirectSchemaChangePolicy schemaChangePolicy) {
        setSchemaChangePolicy(schemaChangePolicy);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getCompression() != null)
            sb.append("Compression: ").append(getCompression()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions()).append(",");
        if (getSchemaChangePolicy() != null)
            sb.append("SchemaChangePolicy: ").append(getSchemaChangePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DeltaDirectTarget == false)
            return false;
        S3DeltaDirectTarget other = (S3DeltaDirectTarget) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getCompression() == null ^ this.getCompression() == null)
            return false;
        if (other.getCompression() != null && other.getCompression().equals(this.getCompression()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
            return false;
        if (other.getSchemaChangePolicy() == null ^ this.getSchemaChangePolicy() == null)
            return false;
        if (other.getSchemaChangePolicy() != null && other.getSchemaChangePolicy().equals(this.getSchemaChangePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getCompression() == null) ? 0 : getCompression().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        hashCode = prime * hashCode + ((getSchemaChangePolicy() == null) ? 0 : getSchemaChangePolicy().hashCode());
        return hashCode;
    }

    @Override
    public S3DeltaDirectTarget clone() {
        try {
            return (S3DeltaDirectTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.S3DeltaDirectTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
