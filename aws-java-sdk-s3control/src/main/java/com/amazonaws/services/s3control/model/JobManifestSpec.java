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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the format of a manifest. If the manifest is in CSV format, also describes the columns contained within the
 * manifest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobManifestSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobManifestSpec implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates which of the available formats the specified manifest uses.
     * </p>
     */
    private String format;
    /**
     * <p>
     * If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element
     * describes which columns contain the required data.
     * </p>
     */
    private java.util.List<String> fields;

    /**
     * <p>
     * Indicates which of the available formats the specified manifest uses.
     * </p>
     * 
     * @param format
     *        Indicates which of the available formats the specified manifest uses.
     * @see JobManifestFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Indicates which of the available formats the specified manifest uses.
     * </p>
     * 
     * @return Indicates which of the available formats the specified manifest uses.
     * @see JobManifestFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Indicates which of the available formats the specified manifest uses.
     * </p>
     * 
     * @param format
     *        Indicates which of the available formats the specified manifest uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobManifestFormat
     */

    public JobManifestSpec withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Indicates which of the available formats the specified manifest uses.
     * </p>
     * 
     * @param format
     *        Indicates which of the available formats the specified manifest uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobManifestFormat
     */

    public JobManifestSpec withFormat(JobManifestFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element
     * describes which columns contain the required data.
     * </p>
     * 
     * @return If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this
     *         element describes which columns contain the required data.
     * @see JobManifestFieldName
     */

    public java.util.List<String> getFields() {
        return fields;
    }

    /**
     * <p>
     * If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element
     * describes which columns contain the required data.
     * </p>
     * 
     * @param fields
     *        If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this
     *        element describes which columns contain the required data.
     * @see JobManifestFieldName
     */

    public void setFields(java.util.Collection<String> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<String>(fields);
    }

    /**
     * <p>
     * If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element
     * describes which columns contain the required data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this
     *        element describes which columns contain the required data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobManifestFieldName
     */

    public JobManifestSpec withFields(String... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<String>(fields.length));
        }
        for (String ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element
     * describes which columns contain the required data.
     * </p>
     * 
     * @param fields
     *        If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this
     *        element describes which columns contain the required data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobManifestFieldName
     */

    public JobManifestSpec withFields(java.util.Collection<String> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element
     * describes which columns contain the required data.
     * </p>
     * 
     * @param fields
     *        If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this
     *        element describes which columns contain the required data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobManifestFieldName
     */

    public JobManifestSpec withFields(JobManifestFieldName... fields) {
        java.util.ArrayList<String> fieldsCopy = new java.util.ArrayList<String>(fields.length);
        for (JobManifestFieldName value : fields) {
            fieldsCopy.add(value.toString());
        }
        if (getFields() == null) {
            setFields(fieldsCopy);
        } else {
            getFields().addAll(fieldsCopy);
        }
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobManifestSpec == false)
            return false;
        JobManifestSpec other = (JobManifestSpec) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public JobManifestSpec clone() {
        try {
            return (JobManifestSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
