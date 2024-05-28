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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a finding and the scan that generated it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/FindingIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for a finding.
     * </p>
     */
    private String findingId;
    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     */
    private String scanName;

    /**
     * <p>
     * The identifier for a finding.
     * </p>
     * 
     * @param findingId
     *        The identifier for a finding.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * The identifier for a finding.
     * </p>
     * 
     * @return The identifier for a finding.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * The identifier for a finding.
     * </p>
     * 
     * @param findingId
     *        The identifier for a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingIdentifier withFindingId(String findingId) {
        setFindingId(findingId);
        return this;
    }

    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     * 
     * @param scanName
     *        The name of the scan that generated the finding.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     * 
     * @return The name of the scan that generated the finding.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the scan that generated the finding.
     * </p>
     * 
     * @param scanName
     *        The name of the scan that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingIdentifier withScanName(String scanName) {
        setScanName(scanName);
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
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingIdentifier == false)
            return false;
        FindingIdentifier other = (FindingIdentifier) obj;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        return hashCode;
    }

    @Override
    public FindingIdentifier clone() {
        try {
            return (FindingIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.FindingIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
