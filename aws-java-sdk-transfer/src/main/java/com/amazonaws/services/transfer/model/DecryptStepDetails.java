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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DecryptStepDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecryptStepDetails implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private String type;

    private String sourceFileLocation;

    private String overwriteExisting;

    private InputFileLocation destinationFileLocation;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptStepDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param type
     * @see EncryptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see EncryptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public DecryptStepDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public DecryptStepDetails withType(EncryptionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * @param sourceFileLocation
     */

    public void setSourceFileLocation(String sourceFileLocation) {
        this.sourceFileLocation = sourceFileLocation;
    }

    /**
     * @return
     */

    public String getSourceFileLocation() {
        return this.sourceFileLocation;
    }

    /**
     * @param sourceFileLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptStepDetails withSourceFileLocation(String sourceFileLocation) {
        setSourceFileLocation(sourceFileLocation);
        return this;
    }

    /**
     * @param overwriteExisting
     * @see OverwriteExisting
     */

    public void setOverwriteExisting(String overwriteExisting) {
        this.overwriteExisting = overwriteExisting;
    }

    /**
     * @return
     * @see OverwriteExisting
     */

    public String getOverwriteExisting() {
        return this.overwriteExisting;
    }

    /**
     * @param overwriteExisting
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteExisting
     */

    public DecryptStepDetails withOverwriteExisting(String overwriteExisting) {
        setOverwriteExisting(overwriteExisting);
        return this;
    }

    /**
     * @param overwriteExisting
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteExisting
     */

    public DecryptStepDetails withOverwriteExisting(OverwriteExisting overwriteExisting) {
        this.overwriteExisting = overwriteExisting.toString();
        return this;
    }

    /**
     * @param destinationFileLocation
     */

    public void setDestinationFileLocation(InputFileLocation destinationFileLocation) {
        this.destinationFileLocation = destinationFileLocation;
    }

    /**
     * @return
     */

    public InputFileLocation getDestinationFileLocation() {
        return this.destinationFileLocation;
    }

    /**
     * @param destinationFileLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptStepDetails withDestinationFileLocation(InputFileLocation destinationFileLocation) {
        setDestinationFileLocation(destinationFileLocation);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSourceFileLocation() != null)
            sb.append("SourceFileLocation: ").append(getSourceFileLocation()).append(",");
        if (getOverwriteExisting() != null)
            sb.append("OverwriteExisting: ").append(getOverwriteExisting()).append(",");
        if (getDestinationFileLocation() != null)
            sb.append("DestinationFileLocation: ").append(getDestinationFileLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecryptStepDetails == false)
            return false;
        DecryptStepDetails other = (DecryptStepDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSourceFileLocation() == null ^ this.getSourceFileLocation() == null)
            return false;
        if (other.getSourceFileLocation() != null && other.getSourceFileLocation().equals(this.getSourceFileLocation()) == false)
            return false;
        if (other.getOverwriteExisting() == null ^ this.getOverwriteExisting() == null)
            return false;
        if (other.getOverwriteExisting() != null && other.getOverwriteExisting().equals(this.getOverwriteExisting()) == false)
            return false;
        if (other.getDestinationFileLocation() == null ^ this.getDestinationFileLocation() == null)
            return false;
        if (other.getDestinationFileLocation() != null && other.getDestinationFileLocation().equals(this.getDestinationFileLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSourceFileLocation() == null) ? 0 : getSourceFileLocation().hashCode());
        hashCode = prime * hashCode + ((getOverwriteExisting() == null) ? 0 : getOverwriteExisting().hashCode());
        hashCode = prime * hashCode + ((getDestinationFileLocation() == null) ? 0 : getDestinationFileLocation().hashCode());
        return hashCode;
    }

    @Override
    public DecryptStepDetails clone() {
        try {
            return (DecryptStepDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DecryptStepDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
