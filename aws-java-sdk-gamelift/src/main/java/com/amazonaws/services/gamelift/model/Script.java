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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties describing a Realtime script.
 * </p>
 * <p>
 * <b>Related operations</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListScripts</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteScript</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Script" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Script implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a Realtime script
     * </p>
     */
    private String scriptId;
    /**
     * <p>
     * Descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     */
    private String version;
    /**
     * <p>
     * File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this
     * value remains at "0".
     * </p>
     */
    private Long sizeOnDisk;
    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date creationTime;

    private S3Location storageLocation;

    /**
     * <p>
     * Unique identifier for a Realtime script
     * </p>
     * 
     * @param scriptId
     *        Unique identifier for a Realtime script
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * Unique identifier for a Realtime script
     * </p>
     * 
     * @return Unique identifier for a Realtime script
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * Unique identifier for a Realtime script
     * </p>
     * 
     * @param scriptId
     *        Unique identifier for a Realtime script
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withScriptId(String scriptId) {
        setScriptId(scriptId);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a script. Script names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label that is associated with a script. Script names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a script. Script names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a script. Script names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @param version
     *        Version that is associated with a build or script. Version strings do not need to be unique.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @return Version that is associated with a build or script. Version strings do not need to be unique.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version that is associated with a build or script. Version strings do not need to be unique.
     * </p>
     * 
     * @param version
     *        Version that is associated with a build or script. Version strings do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this
     * value remains at "0".
     * </p>
     * 
     * @param sizeOnDisk
     *        File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3
     *        location, this value remains at "0".
     */

    public void setSizeOnDisk(Long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    /**
     * <p>
     * File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this
     * value remains at "0".
     * </p>
     * 
     * @return File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3
     *         location, this value remains at "0".
     */

    public Long getSizeOnDisk() {
        return this.sizeOnDisk;
    }

    /**
     * <p>
     * File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this
     * value remains at "0".
     * </p>
     * 
     * @param sizeOnDisk
     *        File size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3
     *        location, this value remains at "0".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withSizeOnDisk(Long sizeOnDisk) {
        setSizeOnDisk(sizeOnDisk);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param storageLocation
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * @return
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @param storageLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Script withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
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
        if (getScriptId() != null)
            sb.append("ScriptId: ").append(getScriptId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getSizeOnDisk() != null)
            sb.append("SizeOnDisk: ").append(getSizeOnDisk()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Script == false)
            return false;
        Script other = (Script) obj;
        if (other.getScriptId() == null ^ this.getScriptId() == null)
            return false;
        if (other.getScriptId() != null && other.getScriptId().equals(this.getScriptId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getSizeOnDisk() == null ^ this.getSizeOnDisk() == null)
            return false;
        if (other.getSizeOnDisk() != null && other.getSizeOnDisk().equals(this.getSizeOnDisk()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSizeOnDisk() == null) ? 0 : getSizeOnDisk().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        return hashCode;
    }

    @Override
    public Script clone() {
        try {
            return (Script) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ScriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
