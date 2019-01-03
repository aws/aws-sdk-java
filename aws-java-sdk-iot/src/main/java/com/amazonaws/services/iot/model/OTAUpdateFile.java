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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a file to be associated with an OTA update.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OTAUpdateFile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the file.
     * </p>
     */
    private String fileName;
    /**
     * <p>
     * The file version.
     * </p>
     */
    private String fileVersion;
    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     */
    private FileLocation fileLocation;
    /**
     * <p>
     * The code signing method of the file.
     * </p>
     */
    private CodeSigning codeSigning;
    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The name of the file.
     * </p>
     * 
     * @param fileName
     *        The name of the file.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the file.
     * </p>
     * 
     * @return The name of the file.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The name of the file.
     * </p>
     * 
     * @param fileName
     *        The name of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateFile withFileName(String fileName) {
        setFileName(fileName);
        return this;
    }

    /**
     * <p>
     * The file version.
     * </p>
     * 
     * @param fileVersion
     *        The file version.
     */

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    /**
     * <p>
     * The file version.
     * </p>
     * 
     * @return The file version.
     */

    public String getFileVersion() {
        return this.fileVersion;
    }

    /**
     * <p>
     * The file version.
     * </p>
     * 
     * @param fileVersion
     *        The file version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateFile withFileVersion(String fileVersion) {
        setFileVersion(fileVersion);
        return this;
    }

    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     * 
     * @param fileLocation
     *        The location of the updated firmware.
     */

    public void setFileLocation(FileLocation fileLocation) {
        this.fileLocation = fileLocation;
    }

    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     * 
     * @return The location of the updated firmware.
     */

    public FileLocation getFileLocation() {
        return this.fileLocation;
    }

    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     * 
     * @param fileLocation
     *        The location of the updated firmware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateFile withFileLocation(FileLocation fileLocation) {
        setFileLocation(fileLocation);
        return this;
    }

    /**
     * <p>
     * The code signing method of the file.
     * </p>
     * 
     * @param codeSigning
     *        The code signing method of the file.
     */

    public void setCodeSigning(CodeSigning codeSigning) {
        this.codeSigning = codeSigning;
    }

    /**
     * <p>
     * The code signing method of the file.
     * </p>
     * 
     * @return The code signing method of the file.
     */

    public CodeSigning getCodeSigning() {
        return this.codeSigning;
    }

    /**
     * <p>
     * The code signing method of the file.
     * </p>
     * 
     * @param codeSigning
     *        The code signing method of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateFile withCodeSigning(CodeSigning codeSigning) {
        setCodeSigning(codeSigning);
        return this;
    }

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     * 
     * @return A list of name/attribute pairs.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     * 
     * @param attributes
     *        A list of name/attribute pairs.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     * 
     * @param attributes
     *        A list of name/attribute pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateFile withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public OTAUpdateFile addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateFile clearAttributesEntries() {
        this.attributes = null;
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
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
        if (getFileVersion() != null)
            sb.append("FileVersion: ").append(getFileVersion()).append(",");
        if (getFileLocation() != null)
            sb.append("FileLocation: ").append(getFileLocation()).append(",");
        if (getCodeSigning() != null)
            sb.append("CodeSigning: ").append(getCodeSigning()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OTAUpdateFile == false)
            return false;
        OTAUpdateFile other = (OTAUpdateFile) obj;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getFileVersion() == null ^ this.getFileVersion() == null)
            return false;
        if (other.getFileVersion() != null && other.getFileVersion().equals(this.getFileVersion()) == false)
            return false;
        if (other.getFileLocation() == null ^ this.getFileLocation() == null)
            return false;
        if (other.getFileLocation() != null && other.getFileLocation().equals(this.getFileLocation()) == false)
            return false;
        if (other.getCodeSigning() == null ^ this.getCodeSigning() == null)
            return false;
        if (other.getCodeSigning() != null && other.getCodeSigning().equals(this.getCodeSigning()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getFileVersion() == null) ? 0 : getFileVersion().hashCode());
        hashCode = prime * hashCode + ((getFileLocation() == null) ? 0 : getFileLocation().hashCode());
        hashCode = prime * hashCode + ((getCodeSigning() == null) ? 0 : getCodeSigning().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public OTAUpdateFile clone() {
        try {
            return (OTAUpdateFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.OTAUpdateFileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
