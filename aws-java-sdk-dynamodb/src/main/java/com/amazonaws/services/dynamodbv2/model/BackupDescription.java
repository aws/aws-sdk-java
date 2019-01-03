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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the description of the backup created for the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BackupDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     */
    private BackupDetails backupDetails;
    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     */
    private SourceTableDetails sourceTableDetails;
    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
     * streams, TTL.
     * </p>
     */
    private SourceTableFeatureDetails sourceTableFeatureDetails;

    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     * 
     * @param backupDetails
     *        Contains the details of the backup created for the table.
     */

    public void setBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
    }

    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     * 
     * @return Contains the details of the backup created for the table.
     */

    public BackupDetails getBackupDetails() {
        return this.backupDetails;
    }

    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     * 
     * @param backupDetails
     *        Contains the details of the backup created for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupDescription withBackupDetails(BackupDetails backupDetails) {
        setBackupDetails(backupDetails);
        return this;
    }

    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     * 
     * @param sourceTableDetails
     *        Contains the details of the table when the backup was created.
     */

    public void setSourceTableDetails(SourceTableDetails sourceTableDetails) {
        this.sourceTableDetails = sourceTableDetails;
    }

    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     * 
     * @return Contains the details of the table when the backup was created.
     */

    public SourceTableDetails getSourceTableDetails() {
        return this.sourceTableDetails;
    }

    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     * 
     * @param sourceTableDetails
     *        Contains the details of the table when the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupDescription withSourceTableDetails(SourceTableDetails sourceTableDetails) {
        setSourceTableDetails(sourceTableDetails);
        return this;
    }

    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
     * streams, TTL.
     * </p>
     * 
     * @param sourceTableFeatureDetails
     *        Contains the details of the features enabled on the table when the backup was created. For example, LSIs,
     *        GSIs, streams, TTL.
     */

    public void setSourceTableFeatureDetails(SourceTableFeatureDetails sourceTableFeatureDetails) {
        this.sourceTableFeatureDetails = sourceTableFeatureDetails;
    }

    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
     * streams, TTL.
     * </p>
     * 
     * @return Contains the details of the features enabled on the table when the backup was created. For example, LSIs,
     *         GSIs, streams, TTL.
     */

    public SourceTableFeatureDetails getSourceTableFeatureDetails() {
        return this.sourceTableFeatureDetails;
    }

    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
     * streams, TTL.
     * </p>
     * 
     * @param sourceTableFeatureDetails
     *        Contains the details of the features enabled on the table when the backup was created. For example, LSIs,
     *        GSIs, streams, TTL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupDescription withSourceTableFeatureDetails(SourceTableFeatureDetails sourceTableFeatureDetails) {
        setSourceTableFeatureDetails(sourceTableFeatureDetails);
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
        if (getBackupDetails() != null)
            sb.append("BackupDetails: ").append(getBackupDetails()).append(",");
        if (getSourceTableDetails() != null)
            sb.append("SourceTableDetails: ").append(getSourceTableDetails()).append(",");
        if (getSourceTableFeatureDetails() != null)
            sb.append("SourceTableFeatureDetails: ").append(getSourceTableFeatureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupDescription == false)
            return false;
        BackupDescription other = (BackupDescription) obj;
        if (other.getBackupDetails() == null ^ this.getBackupDetails() == null)
            return false;
        if (other.getBackupDetails() != null && other.getBackupDetails().equals(this.getBackupDetails()) == false)
            return false;
        if (other.getSourceTableDetails() == null ^ this.getSourceTableDetails() == null)
            return false;
        if (other.getSourceTableDetails() != null && other.getSourceTableDetails().equals(this.getSourceTableDetails()) == false)
            return false;
        if (other.getSourceTableFeatureDetails() == null ^ this.getSourceTableFeatureDetails() == null)
            return false;
        if (other.getSourceTableFeatureDetails() != null && other.getSourceTableFeatureDetails().equals(this.getSourceTableFeatureDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupDetails() == null) ? 0 : getBackupDetails().hashCode());
        hashCode = prime * hashCode + ((getSourceTableDetails() == null) ? 0 : getSourceTableDetails().hashCode());
        hashCode = prime * hashCode + ((getSourceTableFeatureDetails() == null) ? 0 : getSourceTableFeatureDetails().hashCode());
        return hashCode;
    }

    @Override
    public BackupDescription clone() {
        try {
            return (BackupDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.BackupDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
