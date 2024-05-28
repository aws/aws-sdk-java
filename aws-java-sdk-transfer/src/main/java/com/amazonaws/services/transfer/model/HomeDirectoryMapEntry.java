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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an object that contains entries and targets for <code>HomeDirectoryMappings</code>.
 * </p>
 * <p>
 * The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
 * </p>
 * <p>
 * <code>[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/HomeDirectoryMapEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HomeDirectoryMapEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents an entry for <code>HomeDirectoryMappings</code>.
     * </p>
     */
    private String entry;
    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectoryMapEntry</code>.
     * </p>
     */
    private String target;
    /**
     * <p>
     * Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a file, or
     * <code>DIRECTORY</code> for the directory to point to a directory.
     * </p>
     * <note>
     * <p>
     * By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a Transfer
     * Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you want a mapping to
     * have a file target.
     * </p>
     * </note>
     */
    private String type;

    /**
     * <p>
     * Represents an entry for <code>HomeDirectoryMappings</code>.
     * </p>
     * 
     * @param entry
     *        Represents an entry for <code>HomeDirectoryMappings</code>.
     */

    public void setEntry(String entry) {
        this.entry = entry;
    }

    /**
     * <p>
     * Represents an entry for <code>HomeDirectoryMappings</code>.
     * </p>
     * 
     * @return Represents an entry for <code>HomeDirectoryMappings</code>.
     */

    public String getEntry() {
        return this.entry;
    }

    /**
     * <p>
     * Represents an entry for <code>HomeDirectoryMappings</code>.
     * </p>
     * 
     * @param entry
     *        Represents an entry for <code>HomeDirectoryMappings</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeDirectoryMapEntry withEntry(String entry) {
        setEntry(entry);
        return this;
    }

    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectoryMapEntry</code>.
     * </p>
     * 
     * @param target
     *        Represents the map target that is used in a <code>HomeDirectoryMapEntry</code>.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectoryMapEntry</code>.
     * </p>
     * 
     * @return Represents the map target that is used in a <code>HomeDirectoryMapEntry</code>.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Represents the map target that is used in a <code>HomeDirectoryMapEntry</code>.
     * </p>
     * 
     * @param target
     *        Represents the map target that is used in a <code>HomeDirectoryMapEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeDirectoryMapEntry withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a file, or
     * <code>DIRECTORY</code> for the directory to point to a directory.
     * </p>
     * <note>
     * <p>
     * By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a Transfer
     * Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you want a mapping to
     * have a file target.
     * </p>
     * </note>
     * 
     * @param type
     *        Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a
     *        file, or <code>DIRECTORY</code> for the directory to point to a directory.</p> <note>
     *        <p>
     *        By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a
     *        Transfer Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you
     *        want a mapping to have a file target.
     *        </p>
     * @see MapType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a file, or
     * <code>DIRECTORY</code> for the directory to point to a directory.
     * </p>
     * <note>
     * <p>
     * By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a Transfer
     * Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you want a mapping to
     * have a file target.
     * </p>
     * </note>
     * 
     * @return Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a
     *         file, or <code>DIRECTORY</code> for the directory to point to a directory.</p> <note>
     *         <p>
     *         By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a
     *         Transfer Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you
     *         want a mapping to have a file target.
     *         </p>
     * @see MapType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a file, or
     * <code>DIRECTORY</code> for the directory to point to a directory.
     * </p>
     * <note>
     * <p>
     * By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a Transfer
     * Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you want a mapping to
     * have a file target.
     * </p>
     * </note>
     * 
     * @param type
     *        Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a
     *        file, or <code>DIRECTORY</code> for the directory to point to a directory.</p> <note>
     *        <p>
     *        By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a
     *        Transfer Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you
     *        want a mapping to have a file target.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapType
     */

    public HomeDirectoryMapEntry withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a file, or
     * <code>DIRECTORY</code> for the directory to point to a directory.
     * </p>
     * <note>
     * <p>
     * By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a Transfer
     * Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you want a mapping to
     * have a file target.
     * </p>
     * </note>
     * 
     * @param type
     *        Specifies the type of mapping. Set the type to <code>FILE</code> if you want the mapping to point to a
     *        file, or <code>DIRECTORY</code> for the directory to point to a directory.</p> <note>
     *        <p>
     *        By default, home directory mappings have a <code>Type</code> of <code>DIRECTORY</code> when you create a
     *        Transfer Family server. You would need to explicitly set <code>Type</code> to <code>FILE</code> if you
     *        want a mapping to have a file target.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapType
     */

    public HomeDirectoryMapEntry withType(MapType type) {
        this.type = type.toString();
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
            sb.append("Target: ").append(getTarget()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntry() == null) ? 0 : getEntry().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
