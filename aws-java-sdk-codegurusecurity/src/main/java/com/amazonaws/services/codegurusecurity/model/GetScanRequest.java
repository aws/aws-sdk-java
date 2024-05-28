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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetScan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * UUID that identifies the individual scan run you want to view details about. You retrieve this when you call the
     * <code>CreateScan</code> operation. Defaults to the latest scan run if missing.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The name of the scan you want to view details about.
     * </p>
     */
    private String scanName;

    /**
     * <p>
     * UUID that identifies the individual scan run you want to view details about. You retrieve this when you call the
     * <code>CreateScan</code> operation. Defaults to the latest scan run if missing.
     * </p>
     * 
     * @param runId
     *        UUID that identifies the individual scan run you want to view details about. You retrieve this when you
     *        call the <code>CreateScan</code> operation. Defaults to the latest scan run if missing.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run you want to view details about. You retrieve this when you call the
     * <code>CreateScan</code> operation. Defaults to the latest scan run if missing.
     * </p>
     * 
     * @return UUID that identifies the individual scan run you want to view details about. You retrieve this when you
     *         call the <code>CreateScan</code> operation. Defaults to the latest scan run if missing.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run you want to view details about. You retrieve this when you call the
     * <code>CreateScan</code> operation. Defaults to the latest scan run if missing.
     * </p>
     * 
     * @param runId
     *        UUID that identifies the individual scan run you want to view details about. You retrieve this when you
     *        call the <code>CreateScan</code> operation. Defaults to the latest scan run if missing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanRequest withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The name of the scan you want to view details about.
     * </p>
     * 
     * @param scanName
     *        The name of the scan you want to view details about.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the scan you want to view details about.
     * </p>
     * 
     * @return The name of the scan you want to view details about.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the scan you want to view details about.
     * </p>
     * 
     * @param scanName
     *        The name of the scan you want to view details about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScanRequest withScanName(String scanName) {
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
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
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

        if (obj instanceof GetScanRequest == false)
            return false;
        GetScanRequest other = (GetScanRequest) obj;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
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

        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        return hashCode;
    }

    @Override
    public GetScanRequest clone() {
        return (GetScanRequest) super.clone();
    }

}
