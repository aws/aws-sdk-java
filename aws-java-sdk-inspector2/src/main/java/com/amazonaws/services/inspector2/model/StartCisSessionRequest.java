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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/StartCisSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCisSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start CIS session message.
     * </p>
     */
    private StartCisSessionMessage message;
    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     */
    private String scanJobId;

    /**
     * <p>
     * The start CIS session message.
     * </p>
     * 
     * @param message
     *        The start CIS session message.
     */

    public void setMessage(StartCisSessionMessage message) {
        this.message = message;
    }

    /**
     * <p>
     * The start CIS session message.
     * </p>
     * 
     * @return The start CIS session message.
     */

    public StartCisSessionMessage getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The start CIS session message.
     * </p>
     * 
     * @param message
     *        The start CIS session message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCisSessionRequest withMessage(StartCisSessionMessage message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     * 
     * @param scanJobId
     *        A unique identifier for the scan job.
     */

    public void setScanJobId(String scanJobId) {
        this.scanJobId = scanJobId;
    }

    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     * 
     * @return A unique identifier for the scan job.
     */

    public String getScanJobId() {
        return this.scanJobId;
    }

    /**
     * <p>
     * A unique identifier for the scan job.
     * </p>
     * 
     * @param scanJobId
     *        A unique identifier for the scan job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCisSessionRequest withScanJobId(String scanJobId) {
        setScanJobId(scanJobId);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getScanJobId() != null)
            sb.append("ScanJobId: ").append(getScanJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCisSessionRequest == false)
            return false;
        StartCisSessionRequest other = (StartCisSessionRequest) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getScanJobId() == null ^ this.getScanJobId() == null)
            return false;
        if (other.getScanJobId() != null && other.getScanJobId().equals(this.getScanJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getScanJobId() == null) ? 0 : getScanJobId().hashCode());
        return hashCode;
    }

    @Override
    public StartCisSessionRequest clone() {
        return (StartCisSessionRequest) super.clone();
    }

}
