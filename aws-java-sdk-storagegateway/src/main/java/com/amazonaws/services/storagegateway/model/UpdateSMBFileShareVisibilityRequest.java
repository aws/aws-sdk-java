/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBFileShareVisibility"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSMBFileShareVisibilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The shares on this gateway appear when listing shares.
     * </p>
     */
    private Boolean fileSharesVisible;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareVisibilityRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The shares on this gateway appear when listing shares.
     * </p>
     * 
     * @param fileSharesVisible
     *        The shares on this gateway appear when listing shares.
     */

    public void setFileSharesVisible(Boolean fileSharesVisible) {
        this.fileSharesVisible = fileSharesVisible;
    }

    /**
     * <p>
     * The shares on this gateway appear when listing shares.
     * </p>
     * 
     * @return The shares on this gateway appear when listing shares.
     */

    public Boolean getFileSharesVisible() {
        return this.fileSharesVisible;
    }

    /**
     * <p>
     * The shares on this gateway appear when listing shares.
     * </p>
     * 
     * @param fileSharesVisible
     *        The shares on this gateway appear when listing shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBFileShareVisibilityRequest withFileSharesVisible(Boolean fileSharesVisible) {
        setFileSharesVisible(fileSharesVisible);
        return this;
    }

    /**
     * <p>
     * The shares on this gateway appear when listing shares.
     * </p>
     * 
     * @return The shares on this gateway appear when listing shares.
     */

    public Boolean isFileSharesVisible() {
        return this.fileSharesVisible;
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getFileSharesVisible() != null)
            sb.append("FileSharesVisible: ").append(getFileSharesVisible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSMBFileShareVisibilityRequest == false)
            return false;
        UpdateSMBFileShareVisibilityRequest other = (UpdateSMBFileShareVisibilityRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getFileSharesVisible() == null ^ this.getFileSharesVisible() == null)
            return false;
        if (other.getFileSharesVisible() != null && other.getFileSharesVisible().equals(this.getFileSharesVisible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getFileSharesVisible() == null) ? 0 : getFileSharesVisible().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSMBFileShareVisibilityRequest clone() {
        return (UpdateSMBFileShareVisibilityRequest) super.clone();
    }

}
