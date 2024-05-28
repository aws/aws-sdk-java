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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateCisScanConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCisScanConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     */
    private String scanConfigurationArn;

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan configuration ARN.
     */

    public void setScanConfigurationArn(String scanConfigurationArn) {
        this.scanConfigurationArn = scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     * 
     * @return The CIS scan configuration ARN.
     */

    public String getScanConfigurationArn() {
        return this.scanConfigurationArn;
    }

    /**
     * <p>
     * The CIS scan configuration ARN.
     * </p>
     * 
     * @param scanConfigurationArn
     *        The CIS scan configuration ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisScanConfigurationResult withScanConfigurationArn(String scanConfigurationArn) {
        setScanConfigurationArn(scanConfigurationArn);
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
        if (getScanConfigurationArn() != null)
            sb.append("ScanConfigurationArn: ").append(getScanConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCisScanConfigurationResult == false)
            return false;
        UpdateCisScanConfigurationResult other = (UpdateCisScanConfigurationResult) obj;
        if (other.getScanConfigurationArn() == null ^ this.getScanConfigurationArn() == null)
            return false;
        if (other.getScanConfigurationArn() != null && other.getScanConfigurationArn().equals(this.getScanConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanConfigurationArn() == null) ? 0 : getScanConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCisScanConfigurationResult clone() {
        try {
            return (UpdateCisScanConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
