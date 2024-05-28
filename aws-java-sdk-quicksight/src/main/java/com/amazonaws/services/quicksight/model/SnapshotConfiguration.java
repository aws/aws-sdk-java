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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of the dashboard snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that is
     * generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     * </p>
     */
    private java.util.List<SnapshotFileGroup> fileGroups;
    /**
     * <p>
     * A structure that contains information on the Amazon S3 bucket that the generated snapshot is stored in.
     * </p>
     */
    private SnapshotDestinationConfiguration destinationConfiguration;

    private Parameters parameters;

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that is
     * generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     * </p>
     * 
     * @return A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot
     *         that is generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     */

    public java.util.List<SnapshotFileGroup> getFileGroups() {
        return fileGroups;
    }

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that is
     * generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     * </p>
     * 
     * @param fileGroups
     *        A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that
     *        is generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     */

    public void setFileGroups(java.util.Collection<SnapshotFileGroup> fileGroups) {
        if (fileGroups == null) {
            this.fileGroups = null;
            return;
        }

        this.fileGroups = new java.util.ArrayList<SnapshotFileGroup>(fileGroups);
    }

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that is
     * generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileGroups(java.util.Collection)} or {@link #withFileGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fileGroups
     *        A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that
     *        is generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotConfiguration withFileGroups(SnapshotFileGroup... fileGroups) {
        if (this.fileGroups == null) {
            setFileGroups(new java.util.ArrayList<SnapshotFileGroup>(fileGroups.length));
        }
        for (SnapshotFileGroup ele : fileGroups) {
            this.fileGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that is
     * generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     * </p>
     * 
     * @param fileGroups
     *        A list of <code>SnapshotJobResultFileGroup</code> objects that contain information about the snapshot that
     *        is generated. This list can hold a maximum of 6 <code>FileGroup</code> configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotConfiguration withFileGroups(java.util.Collection<SnapshotFileGroup> fileGroups) {
        setFileGroups(fileGroups);
        return this;
    }

    /**
     * <p>
     * A structure that contains information on the Amazon S3 bucket that the generated snapshot is stored in.
     * </p>
     * 
     * @param destinationConfiguration
     *        A structure that contains information on the Amazon S3 bucket that the generated snapshot is stored in.
     */

    public void setDestinationConfiguration(SnapshotDestinationConfiguration destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    /**
     * <p>
     * A structure that contains information on the Amazon S3 bucket that the generated snapshot is stored in.
     * </p>
     * 
     * @return A structure that contains information on the Amazon S3 bucket that the generated snapshot is stored in.
     */

    public SnapshotDestinationConfiguration getDestinationConfiguration() {
        return this.destinationConfiguration;
    }

    /**
     * <p>
     * A structure that contains information on the Amazon S3 bucket that the generated snapshot is stored in.
     * </p>
     * 
     * @param destinationConfiguration
     *        A structure that contains information on the Amazon S3 bucket that the generated snapshot is stored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotConfiguration withDestinationConfiguration(SnapshotDestinationConfiguration destinationConfiguration) {
        setDestinationConfiguration(destinationConfiguration);
        return this;
    }

    /**
     * @param parameters
     */

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * @return
     */

    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @param parameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotConfiguration withParameters(Parameters parameters) {
        setParameters(parameters);
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
        if (getFileGroups() != null)
            sb.append("FileGroups: ").append(getFileGroups()).append(",");
        if (getDestinationConfiguration() != null)
            sb.append("DestinationConfiguration: ").append(getDestinationConfiguration()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotConfiguration == false)
            return false;
        SnapshotConfiguration other = (SnapshotConfiguration) obj;
        if (other.getFileGroups() == null ^ this.getFileGroups() == null)
            return false;
        if (other.getFileGroups() != null && other.getFileGroups().equals(this.getFileGroups()) == false)
            return false;
        if (other.getDestinationConfiguration() == null ^ this.getDestinationConfiguration() == null)
            return false;
        if (other.getDestinationConfiguration() != null && other.getDestinationConfiguration().equals(this.getDestinationConfiguration()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileGroups() == null) ? 0 : getFileGroups().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfiguration() == null) ? 0 : getDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotConfiguration clone() {
        try {
            return (SnapshotConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
