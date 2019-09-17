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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration properties for an importing labels task run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ImportLabelsTaskRunProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportLabelsTaskRunProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
     * </p>
     */
    private String inputS3Path;
    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
     * </p>
     * 
     * @param inputS3Path
     *        The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
     */

    public void setInputS3Path(String inputS3Path) {
        this.inputS3Path = inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
     * </p>
     * 
     * @return The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
     */

    public String getInputS3Path() {
        return this.inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
     * </p>
     * 
     * @param inputS3Path
     *        The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportLabelsTaskRunProperties withInputS3Path(String inputS3Path) {
        setInputS3Path(inputS3Path);
        return this;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @param replace
     *        Indicates whether to overwrite your existing labels.
     */

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @return Indicates whether to overwrite your existing labels.
     */

    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @param replace
     *        Indicates whether to overwrite your existing labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportLabelsTaskRunProperties withReplace(Boolean replace) {
        setReplace(replace);
        return this;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * 
     * @return Indicates whether to overwrite your existing labels.
     */

    public Boolean isReplace() {
        return this.replace;
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
        if (getInputS3Path() != null)
            sb.append("InputS3Path: ").append(getInputS3Path()).append(",");
        if (getReplace() != null)
            sb.append("Replace: ").append(getReplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportLabelsTaskRunProperties == false)
            return false;
        ImportLabelsTaskRunProperties other = (ImportLabelsTaskRunProperties) obj;
        if (other.getInputS3Path() == null ^ this.getInputS3Path() == null)
            return false;
        if (other.getInputS3Path() != null && other.getInputS3Path().equals(this.getInputS3Path()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputS3Path() == null) ? 0 : getInputS3Path().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public ImportLabelsTaskRunProperties clone() {
        try {
            return (ImportLabelsTaskRunProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ImportLabelsTaskRunPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
