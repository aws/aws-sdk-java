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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the Python scripts used for entry and by an Amazon Braket job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/ScriptModeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScriptModeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of compression used by the Python scripts for an Amazon Braket job.
     * </p>
     */
    private String compressionType;
    /**
     * <p>
     * The path to the Python script that serves as the entry point for an Amazon Braket job.
     * </p>
     */
    private String entryPoint;
    /**
     * <p>
     * The URI that specifies the S3 path to the Python script module that contains the training script used by an
     * Amazon Braket job.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * The type of compression used by the Python scripts for an Amazon Braket job.
     * </p>
     * 
     * @param compressionType
     *        The type of compression used by the Python scripts for an Amazon Braket job.
     * @see CompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * The type of compression used by the Python scripts for an Amazon Braket job.
     * </p>
     * 
     * @return The type of compression used by the Python scripts for an Amazon Braket job.
     * @see CompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * The type of compression used by the Python scripts for an Amazon Braket job.
     * </p>
     * 
     * @param compressionType
     *        The type of compression used by the Python scripts for an Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public ScriptModeConfig withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * The type of compression used by the Python scripts for an Amazon Braket job.
     * </p>
     * 
     * @param compressionType
     *        The type of compression used by the Python scripts for an Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public ScriptModeConfig withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The path to the Python script that serves as the entry point for an Amazon Braket job.
     * </p>
     * 
     * @param entryPoint
     *        The path to the Python script that serves as the entry point for an Amazon Braket job.
     */

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    /**
     * <p>
     * The path to the Python script that serves as the entry point for an Amazon Braket job.
     * </p>
     * 
     * @return The path to the Python script that serves as the entry point for an Amazon Braket job.
     */

    public String getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * <p>
     * The path to the Python script that serves as the entry point for an Amazon Braket job.
     * </p>
     * 
     * @param entryPoint
     *        The path to the Python script that serves as the entry point for an Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptModeConfig withEntryPoint(String entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The URI that specifies the S3 path to the Python script module that contains the training script used by an
     * Amazon Braket job.
     * </p>
     * 
     * @param s3Uri
     *        The URI that specifies the S3 path to the Python script module that contains the training script used by
     *        an Amazon Braket job.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URI that specifies the S3 path to the Python script module that contains the training script used by an
     * Amazon Braket job.
     * </p>
     * 
     * @return The URI that specifies the S3 path to the Python script module that contains the training script used by
     *         an Amazon Braket job.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The URI that specifies the S3 path to the Python script module that contains the training script used by an
     * Amazon Braket job.
     * </p>
     * 
     * @param s3Uri
     *        The URI that specifies the S3 path to the Python script module that contains the training script used by
     *        an Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptModeConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append(getEntryPoint()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScriptModeConfig == false)
            return false;
        ScriptModeConfig other = (ScriptModeConfig) obj;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public ScriptModeConfig clone() {
        try {
            return (ScriptModeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.ScriptModeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
