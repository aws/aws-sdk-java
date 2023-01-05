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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DataSourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The S3 bucket where the data files are located.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     */
    private java.util.List<String> s3Keys;
    /**
     * <p>
     * The data type for the data source that you're using for your container image or simulation job. You can use this
     * field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.
     * </p>
     * <p>
     * If you don't specify a field, the default value is <code>File</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The location where your files are mounted in the container image.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as an <code>Archive</code>, you must provide an
     * Amazon S3 object key to your archive. The object key must point to either a <code>.zip</code> or
     * <code>.tar.gz</code> file.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>Prefix</code>, you provide the Amazon S3
     * prefix that points to the files that you are using for your data source.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>File</code>, you provide the Amazon S3
     * path to the file that you're using as your data source.
     * </p>
     */
    private String destination;

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the data files are located.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the data files are located.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the data files are located.
     * </p>
     * 
     * @return The S3 bucket where the data files are located.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the data files are located.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the data files are located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfig withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     * 
     * @return The list of S3 keys identifying the data source files.
     */

    public java.util.List<String> getS3Keys() {
        return s3Keys;
    }

    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     * 
     * @param s3Keys
     *        The list of S3 keys identifying the data source files.
     */

    public void setS3Keys(java.util.Collection<String> s3Keys) {
        if (s3Keys == null) {
            this.s3Keys = null;
            return;
        }

        this.s3Keys = new java.util.ArrayList<String>(s3Keys);
    }

    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Keys(java.util.Collection)} or {@link #withS3Keys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param s3Keys
     *        The list of S3 keys identifying the data source files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfig withS3Keys(String... s3Keys) {
        if (this.s3Keys == null) {
            setS3Keys(new java.util.ArrayList<String>(s3Keys.length));
        }
        for (String ele : s3Keys) {
            this.s3Keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of S3 keys identifying the data source files.
     * </p>
     * 
     * @param s3Keys
     *        The list of S3 keys identifying the data source files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfig withS3Keys(java.util.Collection<String> s3Keys) {
        setS3Keys(s3Keys);
        return this;
    }

    /**
     * <p>
     * The data type for the data source that you're using for your container image or simulation job. You can use this
     * field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.
     * </p>
     * <p>
     * If you don't specify a field, the default value is <code>File</code>.
     * </p>
     * 
     * @param type
     *        The data type for the data source that you're using for your container image or simulation job. You can
     *        use this field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.</p>
     *        <p>
     *        If you don't specify a field, the default value is <code>File</code>.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type for the data source that you're using for your container image or simulation job. You can use this
     * field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.
     * </p>
     * <p>
     * If you don't specify a field, the default value is <code>File</code>.
     * </p>
     * 
     * @return The data type for the data source that you're using for your container image or simulation job. You can
     *         use this field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.</p>
     *         <p>
     *         If you don't specify a field, the default value is <code>File</code>.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type for the data source that you're using for your container image or simulation job. You can use this
     * field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.
     * </p>
     * <p>
     * If you don't specify a field, the default value is <code>File</code>.
     * </p>
     * 
     * @param type
     *        The data type for the data source that you're using for your container image or simulation job. You can
     *        use this field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.</p>
     *        <p>
     *        If you don't specify a field, the default value is <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data type for the data source that you're using for your container image or simulation job. You can use this
     * field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.
     * </p>
     * <p>
     * If you don't specify a field, the default value is <code>File</code>.
     * </p>
     * 
     * @param type
     *        The data type for the data source that you're using for your container image or simulation job. You can
     *        use this field to specify whether your data source is an Archive, an Amazon S3 prefix, or a file.</p>
     *        <p>
     *        If you don't specify a field, the default value is <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceConfig withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The location where your files are mounted in the container image.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as an <code>Archive</code>, you must provide an
     * Amazon S3 object key to your archive. The object key must point to either a <code>.zip</code> or
     * <code>.tar.gz</code> file.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>Prefix</code>, you provide the Amazon S3
     * prefix that points to the files that you are using for your data source.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>File</code>, you provide the Amazon S3
     * path to the file that you're using as your data source.
     * </p>
     * 
     * @param destination
     *        The location where your files are mounted in the container image.</p>
     *        <p>
     *        If you've specified the <code>type</code> of the data source as an <code>Archive</code>, you must provide
     *        an Amazon S3 object key to your archive. The object key must point to either a <code>.zip</code> or
     *        <code>.tar.gz</code> file.
     *        </p>
     *        <p>
     *        If you've specified the <code>type</code> of the data source as a <code>Prefix</code>, you provide the
     *        Amazon S3 prefix that points to the files that you are using for your data source.
     *        </p>
     *        <p>
     *        If you've specified the <code>type</code> of the data source as a <code>File</code>, you provide the
     *        Amazon S3 path to the file that you're using as your data source.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The location where your files are mounted in the container image.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as an <code>Archive</code>, you must provide an
     * Amazon S3 object key to your archive. The object key must point to either a <code>.zip</code> or
     * <code>.tar.gz</code> file.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>Prefix</code>, you provide the Amazon S3
     * prefix that points to the files that you are using for your data source.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>File</code>, you provide the Amazon S3
     * path to the file that you're using as your data source.
     * </p>
     * 
     * @return The location where your files are mounted in the container image.</p>
     *         <p>
     *         If you've specified the <code>type</code> of the data source as an <code>Archive</code>, you must provide
     *         an Amazon S3 object key to your archive. The object key must point to either a <code>.zip</code> or
     *         <code>.tar.gz</code> file.
     *         </p>
     *         <p>
     *         If you've specified the <code>type</code> of the data source as a <code>Prefix</code>, you provide the
     *         Amazon S3 prefix that points to the files that you are using for your data source.
     *         </p>
     *         <p>
     *         If you've specified the <code>type</code> of the data source as a <code>File</code>, you provide the
     *         Amazon S3 path to the file that you're using as your data source.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The location where your files are mounted in the container image.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as an <code>Archive</code>, you must provide an
     * Amazon S3 object key to your archive. The object key must point to either a <code>.zip</code> or
     * <code>.tar.gz</code> file.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>Prefix</code>, you provide the Amazon S3
     * prefix that points to the files that you are using for your data source.
     * </p>
     * <p>
     * If you've specified the <code>type</code> of the data source as a <code>File</code>, you provide the Amazon S3
     * path to the file that you're using as your data source.
     * </p>
     * 
     * @param destination
     *        The location where your files are mounted in the container image.</p>
     *        <p>
     *        If you've specified the <code>type</code> of the data source as an <code>Archive</code>, you must provide
     *        an Amazon S3 object key to your archive. The object key must point to either a <code>.zip</code> or
     *        <code>.tar.gz</code> file.
     *        </p>
     *        <p>
     *        If you've specified the <code>type</code> of the data source as a <code>Prefix</code>, you provide the
     *        Amazon S3 prefix that points to the files that you are using for your data source.
     *        </p>
     *        <p>
     *        If you've specified the <code>type</code> of the data source as a <code>File</code>, you provide the
     *        Amazon S3 path to the file that you're using as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfig withDestination(String destination) {
        setDestination(destination);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Keys() != null)
            sb.append("S3Keys: ").append(getS3Keys()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfig == false)
            return false;
        DataSourceConfig other = (DataSourceConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Keys() == null ^ this.getS3Keys() == null)
            return false;
        if (other.getS3Keys() != null && other.getS3Keys().equals(this.getS3Keys()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Keys() == null) ? 0 : getS3Keys().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfig clone() {
        try {
            return (DataSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.DataSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
