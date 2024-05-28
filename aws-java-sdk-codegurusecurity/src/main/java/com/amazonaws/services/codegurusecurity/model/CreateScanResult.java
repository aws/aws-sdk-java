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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateScan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the resource object that contains resources that were scanned.
     * </p>
     */
    private ResourceId resourceId;
    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The name of the scan.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     */
    private String scanNameArn;
    /**
     * <p>
     * The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     */
    private String scanState;

    /**
     * <p>
     * The identifier for the resource object that contains resources that were scanned.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource object that contains resources that were scanned.
     */

    public void setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier for the resource object that contains resources that were scanned.
     * </p>
     * 
     * @return The identifier for the resource object that contains resources that were scanned.
     */

    public ResourceId getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier for the resource object that contains resources that were scanned.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource object that contains resources that were scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanResult withResourceId(ResourceId resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     * 
     * @param runId
     *        UUID that identifies the individual scan run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     * 
     * @return UUID that identifies the individual scan run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * UUID that identifies the individual scan run.
     * </p>
     * 
     * @param runId
     *        UUID that identifies the individual scan run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanResult withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The name of the scan.
     * </p>
     * 
     * @param scanName
     *        The name of the scan.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the scan.
     * </p>
     * 
     * @return The name of the scan.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the scan.
     * </p>
     * 
     * @param scanName
     *        The name of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanResult withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     * 
     * @param scanNameArn
     *        The ARN for the scan name.
     */

    public void setScanNameArn(String scanNameArn) {
        this.scanNameArn = scanNameArn;
    }

    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     * 
     * @return The ARN for the scan name.
     */

    public String getScanNameArn() {
        return this.scanNameArn;
    }

    /**
     * <p>
     * The ARN for the scan name.
     * </p>
     * 
     * @param scanNameArn
     *        The ARN for the scan name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanResult withScanNameArn(String scanNameArn) {
        setScanNameArn(scanNameArn);
        return this;
    }

    /**
     * <p>
     * The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @param scanState
     *        The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     *        <code>Failed</code>.
     * @see ScanState
     */

    public void setScanState(String scanState) {
        this.scanState = scanState;
    }

    /**
     * <p>
     * The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @return The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     *         <code>Failed</code>.
     * @see ScanState
     */

    public String getScanState() {
        return this.scanState;
    }

    /**
     * <p>
     * The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @param scanState
     *        The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     *        <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanState
     */

    public CreateScanResult withScanState(String scanState) {
        setScanState(scanState);
        return this;
    }

    /**
     * <p>
     * The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     * <code>Failed</code>.
     * </p>
     * 
     * @param scanState
     *        The current state of the scan. Returns either <code>InProgress</code>, <code>Successful</code>, or
     *        <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanState
     */

    public CreateScanResult withScanState(ScanState scanState) {
        this.scanState = scanState.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getScanNameArn() != null)
            sb.append("ScanNameArn: ").append(getScanNameArn()).append(",");
        if (getScanState() != null)
            sb.append("ScanState: ").append(getScanState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScanResult == false)
            return false;
        CreateScanResult other = (CreateScanResult) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getScanNameArn() == null ^ this.getScanNameArn() == null)
            return false;
        if (other.getScanNameArn() != null && other.getScanNameArn().equals(this.getScanNameArn()) == false)
            return false;
        if (other.getScanState() == null ^ this.getScanState() == null)
            return false;
        if (other.getScanState() != null && other.getScanState().equals(this.getScanState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getScanNameArn() == null) ? 0 : getScanNameArn().hashCode());
        hashCode = prime * hashCode + ((getScanState() == null) ? 0 : getScanState().hashCode());
        return hashCode;
    }

    @Override
    public CreateScanResult clone() {
        try {
            return (CreateScanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
