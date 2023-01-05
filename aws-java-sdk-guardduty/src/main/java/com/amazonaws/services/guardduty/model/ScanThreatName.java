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
 * Contains files infected with the given threat providing details of malware name and severity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScanThreatName" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanThreatName implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the identified threat.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Severity of threat identified as part of the malware scan.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * Total number of files infected with given threat.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * List of infected files in EBS volume with details.
     * </p>
     */
    private java.util.List<ScanFilePath> filePaths;

    /**
     * <p>
     * The name of the identified threat.
     * </p>
     * 
     * @param name
     *        The name of the identified threat.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the identified threat.
     * </p>
     * 
     * @return The name of the identified threat.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the identified threat.
     * </p>
     * 
     * @param name
     *        The name of the identified threat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanThreatName withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Severity of threat identified as part of the malware scan.
     * </p>
     * 
     * @param severity
     *        Severity of threat identified as part of the malware scan.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Severity of threat identified as part of the malware scan.
     * </p>
     * 
     * @return Severity of threat identified as part of the malware scan.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Severity of threat identified as part of the malware scan.
     * </p>
     * 
     * @param severity
     *        Severity of threat identified as part of the malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanThreatName withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Total number of files infected with given threat.
     * </p>
     * 
     * @param itemCount
     *        Total number of files infected with given threat.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * Total number of files infected with given threat.
     * </p>
     * 
     * @return Total number of files infected with given threat.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * Total number of files infected with given threat.
     * </p>
     * 
     * @param itemCount
     *        Total number of files infected with given threat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanThreatName withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * List of infected files in EBS volume with details.
     * </p>
     * 
     * @return List of infected files in EBS volume with details.
     */

    public java.util.List<ScanFilePath> getFilePaths() {
        return filePaths;
    }

    /**
     * <p>
     * List of infected files in EBS volume with details.
     * </p>
     * 
     * @param filePaths
     *        List of infected files in EBS volume with details.
     */

    public void setFilePaths(java.util.Collection<ScanFilePath> filePaths) {
        if (filePaths == null) {
            this.filePaths = null;
            return;
        }

        this.filePaths = new java.util.ArrayList<ScanFilePath>(filePaths);
    }

    /**
     * <p>
     * List of infected files in EBS volume with details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilePaths(java.util.Collection)} or {@link #withFilePaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filePaths
     *        List of infected files in EBS volume with details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanThreatName withFilePaths(ScanFilePath... filePaths) {
        if (this.filePaths == null) {
            setFilePaths(new java.util.ArrayList<ScanFilePath>(filePaths.length));
        }
        for (ScanFilePath ele : filePaths) {
            this.filePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of infected files in EBS volume with details.
     * </p>
     * 
     * @param filePaths
     *        List of infected files in EBS volume with details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanThreatName withFilePaths(java.util.Collection<ScanFilePath> filePaths) {
        setFilePaths(filePaths);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getFilePaths() != null)
            sb.append("FilePaths: ").append(getFilePaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanThreatName == false)
            return false;
        ScanThreatName other = (ScanThreatName) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getFilePaths() == null ^ this.getFilePaths() == null)
            return false;
        if (other.getFilePaths() != null && other.getFilePaths().equals(this.getFilePaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getFilePaths() == null) ? 0 : getFilePaths().hashCode());
        return hashCode;
    }

    @Override
    public ScanThreatName clone() {
        try {
            return (ScanThreatName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanThreatNameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
