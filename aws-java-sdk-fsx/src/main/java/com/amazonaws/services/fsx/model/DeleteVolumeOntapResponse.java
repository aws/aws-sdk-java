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
 * The response object for the Amazon FSx for NetApp ONTAP volume being deleted in the <code>DeleteVolume</code>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolumeOntapResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVolumeOntapResponse implements Serializable, Cloneable, StructuredPojo {

    private String finalBackupId;

    private java.util.List<Tag> finalBackupTags;

    /**
     * @param finalBackupId
     */

    public void setFinalBackupId(String finalBackupId) {
        this.finalBackupId = finalBackupId;
    }

    /**
     * @return
     */

    public String getFinalBackupId() {
        return this.finalBackupId;
    }

    /**
     * @param finalBackupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeOntapResponse withFinalBackupId(String finalBackupId) {
        setFinalBackupId(finalBackupId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getFinalBackupTags() {
        return finalBackupTags;
    }

    /**
     * @param finalBackupTags
     */

    public void setFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        if (finalBackupTags == null) {
            this.finalBackupTags = null;
            return;
        }

        this.finalBackupTags = new java.util.ArrayList<Tag>(finalBackupTags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFinalBackupTags(java.util.Collection)} or {@link #withFinalBackupTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param finalBackupTags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeOntapResponse withFinalBackupTags(Tag... finalBackupTags) {
        if (this.finalBackupTags == null) {
            setFinalBackupTags(new java.util.ArrayList<Tag>(finalBackupTags.length));
        }
        for (Tag ele : finalBackupTags) {
            this.finalBackupTags.add(ele);
        }
        return this;
    }

    /**
     * @param finalBackupTags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeOntapResponse withFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        setFinalBackupTags(finalBackupTags);
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
        if (getFinalBackupId() != null)
            sb.append("FinalBackupId: ").append(getFinalBackupId()).append(",");
        if (getFinalBackupTags() != null)
            sb.append("FinalBackupTags: ").append(getFinalBackupTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVolumeOntapResponse == false)
            return false;
        DeleteVolumeOntapResponse other = (DeleteVolumeOntapResponse) obj;
        if (other.getFinalBackupId() == null ^ this.getFinalBackupId() == null)
            return false;
        if (other.getFinalBackupId() != null && other.getFinalBackupId().equals(this.getFinalBackupId()) == false)
            return false;
        if (other.getFinalBackupTags() == null ^ this.getFinalBackupTags() == null)
            return false;
        if (other.getFinalBackupTags() != null && other.getFinalBackupTags().equals(this.getFinalBackupTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinalBackupId() == null) ? 0 : getFinalBackupId().hashCode());
        hashCode = prime * hashCode + ((getFinalBackupTags() == null) ? 0 : getFinalBackupTags().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVolumeOntapResponse clone() {
        try {
            return (DeleteVolumeOntapResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DeleteVolumeOntapResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
