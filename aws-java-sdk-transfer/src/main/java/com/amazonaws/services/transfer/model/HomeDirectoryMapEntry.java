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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an object that contains entries and a targets for <code>HomeDirectoryMappings</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/HomeDirectoryMapEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HomeDirectoryMapEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     */
    private String entry;
    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectorymapEntry</code>.
     * </p>
     */
    private String target;

    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     * 
     * @param entry
     *        Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     */

    public void setEntry(String entry) {
        this.entry = entry;
    }

    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     * 
     * @return Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     */

    public String getEntry() {
        return this.entry;
    }

    /**
     * <p>
     * Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * </p>
     * 
     * @param entry
     *        Represents an entry and a target for <code>HomeDirectoryMappings</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeDirectoryMapEntry withEntry(String entry) {
        setEntry(entry);
        return this;
    }

    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectorymapEntry</code>.
     * </p>
     * 
     * @param target
     *        Represents the map target that is used in a <code>HomeDirectorymapEntry</code>.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectorymapEntry</code>.
     * </p>
     * 
     * @return Represents the map target that is used in a <code>HomeDirectorymapEntry</code>.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectorymapEntry</code>.
     * </p>
     * 
     * @param target
     *        Represents the map target that is used in a <code>HomeDirectorymapEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeDirectoryMapEntry withTarget(String target) {
        setTarget(target);
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
        if (getEntry() != null)
            sb.append("Entry: ").append(getEntry()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HomeDirectoryMapEntry == false)
            return false;
        HomeDirectoryMapEntry other = (HomeDirectoryMapEntry) obj;
        if (other.getEntry() == null ^ this.getEntry() == null)
            return false;
        if (other.getEntry() != null && other.getEntry().equals(this.getEntry()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntry() == null) ? 0 : getEntry().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public HomeDirectoryMapEntry clone() {
        try {
            return (HomeDirectoryMapEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.HomeDirectoryMapEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
