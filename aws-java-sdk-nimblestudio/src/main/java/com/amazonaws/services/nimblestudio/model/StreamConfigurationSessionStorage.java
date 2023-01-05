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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a streaming session’s upload storage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamConfigurationSessionStorage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamConfigurationSessionStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * </p>
     */
    private java.util.List<String> mode;
    /**
     * <p>
     * The configuration for the upload storage root of the streaming session.
     * </p>
     */
    private StreamingSessionStorageRoot root;

    /**
     * <p>
     * Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * </p>
     * 
     * @return Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * @see StreamingSessionStorageMode
     */

    public java.util.List<String> getMode() {
        return mode;
    }

    /**
     * <p>
     * Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * </p>
     * 
     * @param mode
     *        Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * @see StreamingSessionStorageMode
     */

    public void setMode(java.util.Collection<String> mode) {
        if (mode == null) {
            this.mode = null;
            return;
        }

        this.mode = new java.util.ArrayList<String>(mode);
    }

    /**
     * <p>
     * Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMode(java.util.Collection)} or {@link #withMode(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param mode
     *        Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStorageMode
     */

    public StreamConfigurationSessionStorage withMode(String... mode) {
        if (this.mode == null) {
            setMode(new java.util.ArrayList<String>(mode.length));
        }
        for (String ele : mode) {
            this.mode.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * </p>
     * 
     * @param mode
     *        Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStorageMode
     */

    public StreamConfigurationSessionStorage withMode(java.util.Collection<String> mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * </p>
     * 
     * @param mode
     *        Allows artists to upload files to their workstations. The only valid option is <code>UPLOAD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStorageMode
     */

    public StreamConfigurationSessionStorage withMode(StreamingSessionStorageMode... mode) {
        java.util.ArrayList<String> modeCopy = new java.util.ArrayList<String>(mode.length);
        for (StreamingSessionStorageMode value : mode) {
            modeCopy.add(value.toString());
        }
        if (getMode() == null) {
            setMode(modeCopy);
        } else {
            getMode().addAll(modeCopy);
        }
        return this;
    }

    /**
     * <p>
     * The configuration for the upload storage root of the streaming session.
     * </p>
     * 
     * @param root
     *        The configuration for the upload storage root of the streaming session.
     */

    public void setRoot(StreamingSessionStorageRoot root) {
        this.root = root;
    }

    /**
     * <p>
     * The configuration for the upload storage root of the streaming session.
     * </p>
     * 
     * @return The configuration for the upload storage root of the streaming session.
     */

    public StreamingSessionStorageRoot getRoot() {
        return this.root;
    }

    /**
     * <p>
     * The configuration for the upload storage root of the streaming session.
     * </p>
     * 
     * @param root
     *        The configuration for the upload storage root of the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationSessionStorage withRoot(StreamingSessionStorageRoot root) {
        setRoot(root);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getRoot() != null)
            sb.append("Root: ").append(getRoot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamConfigurationSessionStorage == false)
            return false;
        StreamConfigurationSessionStorage other = (StreamConfigurationSessionStorage) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getRoot() == null ^ this.getRoot() == null)
            return false;
        if (other.getRoot() != null && other.getRoot().equals(this.getRoot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getRoot() == null) ? 0 : getRoot().hashCode());
        return hashCode;
    }

    @Override
    public StreamConfigurationSessionStorage clone() {
        try {
            return (StreamConfigurationSessionStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamConfigurationSessionStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
