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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Import error data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ImportErrorData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportErrorData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Import error data source account ID.
     * </p>
     */
    private String accountID;
    /**
     * <p>
     * Import error data application ID.
     * </p>
     */
    private String applicationID;
    /**
     * <p>
     * Import error data ec2 LaunchTemplate ID.
     * </p>
     */
    private String ec2LaunchTemplateID;
    /**
     * <p>
     * Import error data raw error.
     * </p>
     */
    private String rawError;
    /**
     * <p>
     * Import error data row number.
     * </p>
     */
    private Long rowNumber;
    /**
     * <p>
     * Import error data source server ID.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Import error data wave id.
     * </p>
     */
    private String waveID;

    /**
     * <p>
     * Import error data source account ID.
     * </p>
     * 
     * @param accountID
     *        Import error data source account ID.
     */

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * <p>
     * Import error data source account ID.
     * </p>
     * 
     * @return Import error data source account ID.
     */

    public String getAccountID() {
        return this.accountID;
    }

    /**
     * <p>
     * Import error data source account ID.
     * </p>
     * 
     * @param accountID
     *        Import error data source account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportErrorData withAccountID(String accountID) {
        setAccountID(accountID);
        return this;
    }

    /**
     * <p>
     * Import error data application ID.
     * </p>
     * 
     * @param applicationID
     *        Import error data application ID.
     */

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /**
     * <p>
     * Import error data application ID.
     * </p>
     * 
     * @return Import error data application ID.
     */

    public String getApplicationID() {
        return this.applicationID;
    }

    /**
     * <p>
     * Import error data application ID.
     * </p>
     * 
     * @param applicationID
     *        Import error data application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportErrorData withApplicationID(String applicationID) {
        setApplicationID(applicationID);
        return this;
    }

    /**
     * <p>
     * Import error data ec2 LaunchTemplate ID.
     * </p>
     * 
     * @param ec2LaunchTemplateID
     *        Import error data ec2 LaunchTemplate ID.
     */

    public void setEc2LaunchTemplateID(String ec2LaunchTemplateID) {
        this.ec2LaunchTemplateID = ec2LaunchTemplateID;
    }

    /**
     * <p>
     * Import error data ec2 LaunchTemplate ID.
     * </p>
     * 
     * @return Import error data ec2 LaunchTemplate ID.
     */

    public String getEc2LaunchTemplateID() {
        return this.ec2LaunchTemplateID;
    }

    /**
     * <p>
     * Import error data ec2 LaunchTemplate ID.
     * </p>
     * 
     * @param ec2LaunchTemplateID
     *        Import error data ec2 LaunchTemplate ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportErrorData withEc2LaunchTemplateID(String ec2LaunchTemplateID) {
        setEc2LaunchTemplateID(ec2LaunchTemplateID);
        return this;
    }

    /**
     * <p>
     * Import error data raw error.
     * </p>
     * 
     * @param rawError
     *        Import error data raw error.
     */

    public void setRawError(String rawError) {
        this.rawError = rawError;
    }

    /**
     * <p>
     * Import error data raw error.
     * </p>
     * 
     * @return Import error data raw error.
     */

    public String getRawError() {
        return this.rawError;
    }

    /**
     * <p>
     * Import error data raw error.
     * </p>
     * 
     * @param rawError
     *        Import error data raw error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportErrorData withRawError(String rawError) {
        setRawError(rawError);
        return this;
    }

    /**
     * <p>
     * Import error data row number.
     * </p>
     * 
     * @param rowNumber
     *        Import error data row number.
     */

    public void setRowNumber(Long rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * <p>
     * Import error data row number.
     * </p>
     * 
     * @return Import error data row number.
     */

    public Long getRowNumber() {
        return this.rowNumber;
    }

    /**
     * <p>
     * Import error data row number.
     * </p>
     * 
     * @param rowNumber
     *        Import error data row number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportErrorData withRowNumber(Long rowNumber) {
        setRowNumber(rowNumber);
        return this;
    }

    /**
     * <p>
     * Import error data source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Import error data source server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Import error data source server ID.
     * </p>
     * 
     * @return Import error data source server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Import error data source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Import error data source server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportErrorData withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Import error data wave id.
     * </p>
     * 
     * @param waveID
     *        Import error data wave id.
     */

    public void setWaveID(String waveID) {
        this.waveID = waveID;
    }

    /**
     * <p>
     * Import error data wave id.
     * </p>
     * 
     * @return Import error data wave id.
     */

    public String getWaveID() {
        return this.waveID;
    }

    /**
     * <p>
     * Import error data wave id.
     * </p>
     * 
     * @param waveID
     *        Import error data wave id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportErrorData withWaveID(String waveID) {
        setWaveID(waveID);
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
        if (getAccountID() != null)
            sb.append("AccountID: ").append(getAccountID()).append(",");
        if (getApplicationID() != null)
            sb.append("ApplicationID: ").append(getApplicationID()).append(",");
        if (getEc2LaunchTemplateID() != null)
            sb.append("Ec2LaunchTemplateID: ").append(getEc2LaunchTemplateID()).append(",");
        if (getRawError() != null)
            sb.append("RawError: ").append(getRawError()).append(",");
        if (getRowNumber() != null)
            sb.append("RowNumber: ").append(getRowNumber()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
        if (getWaveID() != null)
            sb.append("WaveID: ").append(getWaveID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportErrorData == false)
            return false;
        ImportErrorData other = (ImportErrorData) obj;
        if (other.getAccountID() == null ^ this.getAccountID() == null)
            return false;
        if (other.getAccountID() != null && other.getAccountID().equals(this.getAccountID()) == false)
            return false;
        if (other.getApplicationID() == null ^ this.getApplicationID() == null)
            return false;
        if (other.getApplicationID() != null && other.getApplicationID().equals(this.getApplicationID()) == false)
            return false;
        if (other.getEc2LaunchTemplateID() == null ^ this.getEc2LaunchTemplateID() == null)
            return false;
        if (other.getEc2LaunchTemplateID() != null && other.getEc2LaunchTemplateID().equals(this.getEc2LaunchTemplateID()) == false)
            return false;
        if (other.getRawError() == null ^ this.getRawError() == null)
            return false;
        if (other.getRawError() != null && other.getRawError().equals(this.getRawError()) == false)
            return false;
        if (other.getRowNumber() == null ^ this.getRowNumber() == null)
            return false;
        if (other.getRowNumber() != null && other.getRowNumber().equals(this.getRowNumber()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        if (other.getWaveID() == null ^ this.getWaveID() == null)
            return false;
        if (other.getWaveID() != null && other.getWaveID().equals(this.getWaveID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountID() == null) ? 0 : getAccountID().hashCode());
        hashCode = prime * hashCode + ((getApplicationID() == null) ? 0 : getApplicationID().hashCode());
        hashCode = prime * hashCode + ((getEc2LaunchTemplateID() == null) ? 0 : getEc2LaunchTemplateID().hashCode());
        hashCode = prime * hashCode + ((getRawError() == null) ? 0 : getRawError().hashCode());
        hashCode = prime * hashCode + ((getRowNumber() == null) ? 0 : getRowNumber().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getWaveID() == null) ? 0 : getWaveID().hashCode());
        return hashCode;
    }

    @Override
    public ImportErrorData clone() {
        try {
            return (ImportErrorData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ImportErrorDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
