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
 * Specifies a Delta Lake data source stored in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/S3DeltaSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DeltaSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Delta Lake source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     */
    private java.util.List<String> paths;
    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     */
    private java.util.Map<String, String> additionalDeltaOptions;
    /**
     * <p>
     * Specifies additional options for the connector.
     * </p>
     */
    private S3DirectSourceAdditionalOptions additionalOptions;
    /**
     * <p>
     * Specifies the data schema for the Delta Lake source.
     * </p>
     */
    private java.util.List<GlueSchema> outputSchemas;

    /**
     * <p>
     * The name of the Delta Lake source.
     * </p>
     * 
     * @param name
     *        The name of the Delta Lake source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Delta Lake source.
     * </p>
     * 
     * @return The name of the Delta Lake source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Delta Lake source.
     * </p>
     * 
     * @param name
     *        The name of the Delta Lake source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * 
     * @return A list of the Amazon S3 paths to read from.
     */

    public java.util.List<String> getPaths() {
        return paths;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * 
     * @param paths
     *        A list of the Amazon S3 paths to read from.
     */

    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        this.paths = new java.util.ArrayList<String>(paths);
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPaths(java.util.Collection)} or {@link #withPaths(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param paths
     *        A list of the Amazon S3 paths to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource withPaths(String... paths) {
        if (this.paths == null) {
            setPaths(new java.util.ArrayList<String>(paths.length));
        }
        for (String ele : paths) {
            this.paths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * 
     * @param paths
     *        A list of the Amazon S3 paths to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource withPaths(java.util.Collection<String> paths) {
        setPaths(paths);
        return this;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @return Specifies additional connection options.
     */

    public java.util.Map<String, String> getAdditionalDeltaOptions() {
        return additionalDeltaOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalDeltaOptions
     *        Specifies additional connection options.
     */

    public void setAdditionalDeltaOptions(java.util.Map<String, String> additionalDeltaOptions) {
        this.additionalDeltaOptions = additionalDeltaOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalDeltaOptions
     *        Specifies additional connection options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource withAdditionalDeltaOptions(java.util.Map<String, String> additionalDeltaOptions) {
        setAdditionalDeltaOptions(additionalDeltaOptions);
        return this;
    }

    /**
     * Add a single AdditionalDeltaOptions entry
     *
     * @see S3DeltaSource#withAdditionalDeltaOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource addAdditionalDeltaOptionsEntry(String key, String value) {
        if (null == this.additionalDeltaOptions) {
            this.additionalDeltaOptions = new java.util.HashMap<String, String>();
        }
        if (this.additionalDeltaOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalDeltaOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalDeltaOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource clearAdditionalDeltaOptionsEntries() {
        this.additionalDeltaOptions = null;
        return this;
    }

    /**
     * <p>
     * Specifies additional options for the connector.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional options for the connector.
     */

    public void setAdditionalOptions(S3DirectSourceAdditionalOptions additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Specifies additional options for the connector.
     * </p>
     * 
     * @return Specifies additional options for the connector.
     */

    public S3DirectSourceAdditionalOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * <p>
     * Specifies additional options for the connector.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional options for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource withAdditionalOptions(S3DirectSourceAdditionalOptions additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the Delta Lake source.
     * </p>
     * 
     * @return Specifies the data schema for the Delta Lake source.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies the data schema for the Delta Lake source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the Delta Lake source.
     */

    public void setOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        if (outputSchemas == null) {
            this.outputSchemas = null;
            return;
        }

        this.outputSchemas = new java.util.ArrayList<GlueSchema>(outputSchemas);
    }

    /**
     * <p>
     * Specifies the data schema for the Delta Lake source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the Delta Lake source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource withOutputSchemas(GlueSchema... outputSchemas) {
        if (this.outputSchemas == null) {
            setOutputSchemas(new java.util.ArrayList<GlueSchema>(outputSchemas.length));
        }
        for (GlueSchema ele : outputSchemas) {
            this.outputSchemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the Delta Lake source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the Delta Lake source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DeltaSource withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        setOutputSchemas(outputSchemas);
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
        if (getPaths() != null)
            sb.append("Paths: ").append(getPaths()).append(",");
        if (getAdditionalDeltaOptions() != null)
            sb.append("AdditionalDeltaOptions: ").append(getAdditionalDeltaOptions()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions()).append(",");
        if (getOutputSchemas() != null)
            sb.append("OutputSchemas: ").append(getOutputSchemas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DeltaSource == false)
            return false;
        S3DeltaSource other = (S3DeltaSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getAdditionalDeltaOptions() == null ^ this.getAdditionalDeltaOptions() == null)
            return false;
        if (other.getAdditionalDeltaOptions() != null && other.getAdditionalDeltaOptions().equals(this.getAdditionalDeltaOptions()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
            return false;
        if (other.getOutputSchemas() == null ^ this.getOutputSchemas() == null)
            return false;
        if (other.getOutputSchemas() != null && other.getOutputSchemas().equals(this.getOutputSchemas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode + ((getAdditionalDeltaOptions() == null) ? 0 : getAdditionalDeltaOptions().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public S3DeltaSource clone() {
        try {
            return (S3DeltaSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.S3DeltaSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
