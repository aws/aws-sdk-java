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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the IMDS configuration of the notebook instance
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InstanceMetadataServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceMetadataServiceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports. When passed as part of
     * <code>CreateNotebookInstance</code>, if no value is selected, then it defaults to IMDSv1. This means that both
     * IMDSv1 and IMDSv2 are supported. If passed as part of <code>UpdateNotebookInstance</code>, there is no default.
     * </p>
     */
    private String minimumInstanceMetadataServiceVersion;

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports. When passed as part of
     * <code>CreateNotebookInstance</code>, if no value is selected, then it defaults to IMDSv1. This means that both
     * IMDSv1 and IMDSv2 are supported. If passed as part of <code>UpdateNotebookInstance</code>, there is no default.
     * </p>
     * 
     * @param minimumInstanceMetadataServiceVersion
     *        Indicates the minimum IMDS version that the notebook instance supports. When passed as part of
     *        <code>CreateNotebookInstance</code>, if no value is selected, then it defaults to IMDSv1. This means that
     *        both IMDSv1 and IMDSv2 are supported. If passed as part of <code>UpdateNotebookInstance</code>, there is
     *        no default.
     */

    public void setMinimumInstanceMetadataServiceVersion(String minimumInstanceMetadataServiceVersion) {
        this.minimumInstanceMetadataServiceVersion = minimumInstanceMetadataServiceVersion;
    }

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports. When passed as part of
     * <code>CreateNotebookInstance</code>, if no value is selected, then it defaults to IMDSv1. This means that both
     * IMDSv1 and IMDSv2 are supported. If passed as part of <code>UpdateNotebookInstance</code>, there is no default.
     * </p>
     * 
     * @return Indicates the minimum IMDS version that the notebook instance supports. When passed as part of
     *         <code>CreateNotebookInstance</code>, if no value is selected, then it defaults to IMDSv1. This means that
     *         both IMDSv1 and IMDSv2 are supported. If passed as part of <code>UpdateNotebookInstance</code>, there is
     *         no default.
     */

    public String getMinimumInstanceMetadataServiceVersion() {
        return this.minimumInstanceMetadataServiceVersion;
    }

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports. When passed as part of
     * <code>CreateNotebookInstance</code>, if no value is selected, then it defaults to IMDSv1. This means that both
     * IMDSv1 and IMDSv2 are supported. If passed as part of <code>UpdateNotebookInstance</code>, there is no default.
     * </p>
     * 
     * @param minimumInstanceMetadataServiceVersion
     *        Indicates the minimum IMDS version that the notebook instance supports. When passed as part of
     *        <code>CreateNotebookInstance</code>, if no value is selected, then it defaults to IMDSv1. This means that
     *        both IMDSv1 and IMDSv2 are supported. If passed as part of <code>UpdateNotebookInstance</code>, there is
     *        no default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMetadataServiceConfiguration withMinimumInstanceMetadataServiceVersion(String minimumInstanceMetadataServiceVersion) {
        setMinimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion);
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
        if (getMinimumInstanceMetadataServiceVersion() != null)
            sb.append("MinimumInstanceMetadataServiceVersion: ").append(getMinimumInstanceMetadataServiceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceMetadataServiceConfiguration == false)
            return false;
        InstanceMetadataServiceConfiguration other = (InstanceMetadataServiceConfiguration) obj;
        if (other.getMinimumInstanceMetadataServiceVersion() == null ^ this.getMinimumInstanceMetadataServiceVersion() == null)
            return false;
        if (other.getMinimumInstanceMetadataServiceVersion() != null
                && other.getMinimumInstanceMetadataServiceVersion().equals(this.getMinimumInstanceMetadataServiceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumInstanceMetadataServiceVersion() == null) ? 0 : getMinimumInstanceMetadataServiceVersion().hashCode());
        return hashCode;
    }

    @Override
    public InstanceMetadataServiceConfiguration clone() {
        try {
            return (InstanceMetadataServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InstanceMetadataServiceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
