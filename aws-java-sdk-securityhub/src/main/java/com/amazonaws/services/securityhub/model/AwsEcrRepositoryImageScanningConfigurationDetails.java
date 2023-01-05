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
 * The image scanning configuration for a repository.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcrRepositoryImageScanningConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrRepositoryImageScanningConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to scan images after they are pushed to a repository.
     * </p>
     */
    private Boolean scanOnPush;

    /**
     * <p>
     * Whether to scan images after they are pushed to a repository.
     * </p>
     * 
     * @param scanOnPush
     *        Whether to scan images after they are pushed to a repository.
     */

    public void setScanOnPush(Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    /**
     * <p>
     * Whether to scan images after they are pushed to a repository.
     * </p>
     * 
     * @return Whether to scan images after they are pushed to a repository.
     */

    public Boolean getScanOnPush() {
        return this.scanOnPush;
    }

    /**
     * <p>
     * Whether to scan images after they are pushed to a repository.
     * </p>
     * 
     * @param scanOnPush
     *        Whether to scan images after they are pushed to a repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryImageScanningConfigurationDetails withScanOnPush(Boolean scanOnPush) {
        setScanOnPush(scanOnPush);
        return this;
    }

    /**
     * <p>
     * Whether to scan images after they are pushed to a repository.
     * </p>
     * 
     * @return Whether to scan images after they are pushed to a repository.
     */

    public Boolean isScanOnPush() {
        return this.scanOnPush;
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
        if (getScanOnPush() != null)
            sb.append("ScanOnPush: ").append(getScanOnPush());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcrRepositoryImageScanningConfigurationDetails == false)
            return false;
        AwsEcrRepositoryImageScanningConfigurationDetails other = (AwsEcrRepositoryImageScanningConfigurationDetails) obj;
        if (other.getScanOnPush() == null ^ this.getScanOnPush() == null)
            return false;
        if (other.getScanOnPush() != null && other.getScanOnPush().equals(this.getScanOnPush()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanOnPush() == null) ? 0 : getScanOnPush().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcrRepositoryImageScanningConfigurationDetails clone() {
        try {
            return (AwsEcrRepositoryImageScanningConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcrRepositoryImageScanningConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
