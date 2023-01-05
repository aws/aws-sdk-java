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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A value that specifies whether to delete all child volumes and snapshots.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolumeOpenZFSConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVolumeOpenZFSConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * To delete the volume's child volumes, snapshots, and clones, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * </p>
     */
    private java.util.List<String> options;

    /**
     * <p>
     * To delete the volume's child volumes, snapshots, and clones, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * </p>
     * 
     * @return To delete the volume's child volumes, snapshots, and clones, use the string
     *         <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * @see DeleteOpenZFSVolumeOption
     */

    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * <p>
     * To delete the volume's child volumes, snapshots, and clones, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * </p>
     * 
     * @param options
     *        To delete the volume's child volumes, snapshots, and clones, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * @see DeleteOpenZFSVolumeOption
     */

    public void setOptions(java.util.Collection<String> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<String>(options);
    }

    /**
     * <p>
     * To delete the volume's child volumes, snapshots, and clones, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        To delete the volume's child volumes, snapshots, and clones, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteOpenZFSVolumeOption
     */

    public DeleteVolumeOpenZFSConfiguration withOptions(String... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<String>(options.length));
        }
        for (String ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * To delete the volume's child volumes, snapshots, and clones, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * </p>
     * 
     * @param options
     *        To delete the volume's child volumes, snapshots, and clones, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteOpenZFSVolumeOption
     */

    public DeleteVolumeOpenZFSConfiguration withOptions(java.util.Collection<String> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * To delete the volume's child volumes, snapshots, and clones, use the string
     * <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * </p>
     * 
     * @param options
     *        To delete the volume's child volumes, snapshots, and clones, use the string
     *        <code>DELETE_CHILD_VOLUMES_AND_SNAPSHOTS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteOpenZFSVolumeOption
     */

    public DeleteVolumeOpenZFSConfiguration withOptions(DeleteOpenZFSVolumeOption... options) {
        java.util.ArrayList<String> optionsCopy = new java.util.ArrayList<String>(options.length);
        for (DeleteOpenZFSVolumeOption value : options) {
            optionsCopy.add(value.toString());
        }
        if (getOptions() == null) {
            setOptions(optionsCopy);
        } else {
            getOptions().addAll(optionsCopy);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVolumeOpenZFSConfiguration == false)
            return false;
        DeleteVolumeOpenZFSConfiguration other = (DeleteVolumeOpenZFSConfiguration) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVolumeOpenZFSConfiguration clone() {
        try {
            return (DeleteVolumeOpenZFSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DeleteVolumeOpenZFSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
