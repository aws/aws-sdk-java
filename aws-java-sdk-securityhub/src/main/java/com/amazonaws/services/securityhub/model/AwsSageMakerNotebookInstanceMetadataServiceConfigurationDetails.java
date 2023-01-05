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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the instance metadata service (IMDS) configuration of the notebook instance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports.
     * </p>
     */
    private String minimumInstanceMetadataServiceVersion;

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports.
     * </p>
     * 
     * @param minimumInstanceMetadataServiceVersion
     *        Indicates the minimum IMDS version that the notebook instance supports.
     */

    public void setMinimumInstanceMetadataServiceVersion(String minimumInstanceMetadataServiceVersion) {
        this.minimumInstanceMetadataServiceVersion = minimumInstanceMetadataServiceVersion;
    }

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports.
     * </p>
     * 
     * @return Indicates the minimum IMDS version that the notebook instance supports.
     */

    public String getMinimumInstanceMetadataServiceVersion() {
        return this.minimumInstanceMetadataServiceVersion;
    }

    /**
     * <p>
     * Indicates the minimum IMDS version that the notebook instance supports.
     * </p>
     * 
     * @param minimumInstanceMetadataServiceVersion
     *        Indicates the minimum IMDS version that the notebook instance supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails withMinimumInstanceMetadataServiceVersion(
            String minimumInstanceMetadataServiceVersion) {
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

        if (obj instanceof AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails == false)
            return false;
        AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails other = (AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails) obj;
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
    public AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails clone() {
        try {
            return (AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
