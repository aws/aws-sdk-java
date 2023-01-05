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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the result of the scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScanResultDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanResultDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An enum value representing possible scan results.
     * </p>
     */
    private String scanResult;

    /**
     * <p>
     * An enum value representing possible scan results.
     * </p>
     * 
     * @param scanResult
     *        An enum value representing possible scan results.
     * @see ScanResult
     */

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }

    /**
     * <p>
     * An enum value representing possible scan results.
     * </p>
     * 
     * @return An enum value representing possible scan results.
     * @see ScanResult
     */

    public String getScanResult() {
        return this.scanResult;
    }

    /**
     * <p>
     * An enum value representing possible scan results.
     * </p>
     * 
     * @param scanResult
     *        An enum value representing possible scan results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanResult
     */

    public ScanResultDetails withScanResult(String scanResult) {
        setScanResult(scanResult);
        return this;
    }

    /**
     * <p>
     * An enum value representing possible scan results.
     * </p>
     * 
     * @param scanResult
     *        An enum value representing possible scan results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanResult
     */

    public ScanResultDetails withScanResult(ScanResult scanResult) {
        this.scanResult = scanResult.toString();
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
        if (getScanResult() != null)
            sb.append("ScanResult: ").append(getScanResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanResultDetails == false)
            return false;
        ScanResultDetails other = (ScanResultDetails) obj;
        if (other.getScanResult() == null ^ this.getScanResult() == null)
            return false;
        if (other.getScanResult() != null && other.getScanResult().equals(this.getScanResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanResult() == null) ? 0 : getScanResult().hashCode());
        return hashCode;
    }

    @Override
    public ScanResultDetails clone() {
        try {
            return (ScanResultDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanResultDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
