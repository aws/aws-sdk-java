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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details of infected file including name, file path and hash.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScanFilePath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanFilePath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file path of the infected file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * EBS volume Arn details of the infected file.
     * </p>
     */
    private String volumeArn;
    /**
     * <p>
     * The hash value of the infected file.
     * </p>
     */
    private String hash;
    /**
     * <p>
     * File name of the infected file.
     * </p>
     */
    private String fileName;

    /**
     * <p>
     * The file path of the infected file.
     * </p>
     * 
     * @param filePath
     *        The file path of the infected file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The file path of the infected file.
     * </p>
     * 
     * @return The file path of the infected file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The file path of the infected file.
     * </p>
     * 
     * @param filePath
     *        The file path of the infected file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanFilePath withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * EBS volume Arn details of the infected file.
     * </p>
     * 
     * @param volumeArn
     *        EBS volume Arn details of the infected file.
     */

    public void setVolumeArn(String volumeArn) {
        this.volumeArn = volumeArn;
    }

    /**
     * <p>
     * EBS volume Arn details of the infected file.
     * </p>
     * 
     * @return EBS volume Arn details of the infected file.
     */

    public String getVolumeArn() {
        return this.volumeArn;
    }

    /**
     * <p>
     * EBS volume Arn details of the infected file.
     * </p>
     * 
     * @param volumeArn
     *        EBS volume Arn details of the infected file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanFilePath withVolumeArn(String volumeArn) {
        setVolumeArn(volumeArn);
        return this;
    }

    /**
     * <p>
     * The hash value of the infected file.
     * </p>
     * 
     * @param hash
     *        The hash value of the infected file.
     */

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * The hash value of the infected file.
     * </p>
     * 
     * @return The hash value of the infected file.
     */

    public String getHash() {
        return this.hash;
    }

    /**
     * <p>
     * The hash value of the infected file.
     * </p>
     * 
     * @param hash
     *        The hash value of the infected file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanFilePath withHash(String hash) {
        setHash(hash);
        return this;
    }

    /**
     * <p>
     * File name of the infected file.
     * </p>
     * 
     * @param fileName
     *        File name of the infected file.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * File name of the infected file.
     * </p>
     * 
     * @return File name of the infected file.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * File name of the infected file.
     * </p>
     * 
     * @param fileName
     *        File name of the infected file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanFilePath withFileName(String fileName) {
        setFileName(fileName);
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getVolumeArn() != null)
            sb.append("VolumeArn: ").append(getVolumeArn()).append(",");
        if (getHash() != null)
            sb.append("Hash: ").append(getHash()).append(",");
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanFilePath == false)
            return false;
        ScanFilePath other = (ScanFilePath) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getVolumeArn() == null ^ this.getVolumeArn() == null)
            return false;
        if (other.getVolumeArn() != null && other.getVolumeArn().equals(this.getVolumeArn()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getVolumeArn() == null) ? 0 : getVolumeArn().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        return hashCode;
    }

    @Override
    public ScanFilePath clone() {
        try {
            return (ScanFilePath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanFilePathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
