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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Staging information related to source server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StagingArea" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StagingArea implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Shows an error message that occurred when DRS tried to access the staging source server. In this case
     * StagingArea$status will have value EXTENSION_ERROR
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Account ID of the account to which source server belongs. If this source server is extended - shows Account ID of
     * staging source server.
     * </p>
     */
    private String stagingAccountID;
    /**
     * <p>
     * Arn of the staging source server if this source server is extended
     * </p>
     */
    private String stagingSourceServerArn;
    /**
     * <p>
     * Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     * replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server. In
     * this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the staging
     * account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this case,
     * errorMessage field will contain an error message that explains what happened.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Shows an error message that occurred when DRS tried to access the staging source server. In this case
     * StagingArea$status will have value EXTENSION_ERROR
     * </p>
     * 
     * @param errorMessage
     *        Shows an error message that occurred when DRS tried to access the staging source server. In this case
     *        StagingArea$status will have value EXTENSION_ERROR
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Shows an error message that occurred when DRS tried to access the staging source server. In this case
     * StagingArea$status will have value EXTENSION_ERROR
     * </p>
     * 
     * @return Shows an error message that occurred when DRS tried to access the staging source server. In this case
     *         StagingArea$status will have value EXTENSION_ERROR
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Shows an error message that occurred when DRS tried to access the staging source server. In this case
     * StagingArea$status will have value EXTENSION_ERROR
     * </p>
     * 
     * @param errorMessage
     *        Shows an error message that occurred when DRS tried to access the staging source server. In this case
     *        StagingArea$status will have value EXTENSION_ERROR
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StagingArea withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Account ID of the account to which source server belongs. If this source server is extended - shows Account ID of
     * staging source server.
     * </p>
     * 
     * @param stagingAccountID
     *        Account ID of the account to which source server belongs. If this source server is extended - shows
     *        Account ID of staging source server.
     */

    public void setStagingAccountID(String stagingAccountID) {
        this.stagingAccountID = stagingAccountID;
    }

    /**
     * <p>
     * Account ID of the account to which source server belongs. If this source server is extended - shows Account ID of
     * staging source server.
     * </p>
     * 
     * @return Account ID of the account to which source server belongs. If this source server is extended - shows
     *         Account ID of staging source server.
     */

    public String getStagingAccountID() {
        return this.stagingAccountID;
    }

    /**
     * <p>
     * Account ID of the account to which source server belongs. If this source server is extended - shows Account ID of
     * staging source server.
     * </p>
     * 
     * @param stagingAccountID
     *        Account ID of the account to which source server belongs. If this source server is extended - shows
     *        Account ID of staging source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StagingArea withStagingAccountID(String stagingAccountID) {
        setStagingAccountID(stagingAccountID);
        return this;
    }

    /**
     * <p>
     * Arn of the staging source server if this source server is extended
     * </p>
     * 
     * @param stagingSourceServerArn
     *        Arn of the staging source server if this source server is extended
     */

    public void setStagingSourceServerArn(String stagingSourceServerArn) {
        this.stagingSourceServerArn = stagingSourceServerArn;
    }

    /**
     * <p>
     * Arn of the staging source server if this source server is extended
     * </p>
     * 
     * @return Arn of the staging source server if this source server is extended
     */

    public String getStagingSourceServerArn() {
        return this.stagingSourceServerArn;
    }

    /**
     * <p>
     * Arn of the staging source server if this source server is extended
     * </p>
     * 
     * @param stagingSourceServerArn
     *        Arn of the staging source server if this source server is extended
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StagingArea withStagingSourceServerArn(String stagingSourceServerArn) {
        setStagingSourceServerArn(stagingSourceServerArn);
        return this;
    }

    /**
     * <p>
     * Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     * replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server. In
     * this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the staging
     * account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this case,
     * errorMessage field will contain an error message that explains what happened.
     * </p>
     * 
     * @param status
     *        Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     *        replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server.
     *        In this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the
     *        staging account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this
     *        case, errorMessage field will contain an error message that explains what happened.
     * @see ExtensionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     * replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server. In
     * this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the staging
     * account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this case,
     * errorMessage field will contain an error message that explains what happened.
     * </p>
     * 
     * @return Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     *         replicating in the current account. (b) EXTENDED - Source server is extended from a staging source
     *         server. In this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in
     *         the staging account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In
     *         this case, errorMessage field will contain an error message that explains what happened.
     * @see ExtensionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     * replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server. In
     * this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the staging
     * account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this case,
     * errorMessage field will contain an error message that explains what happened.
     * </p>
     * 
     * @param status
     *        Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     *        replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server.
     *        In this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the
     *        staging account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this
     *        case, errorMessage field will contain an error message that explains what happened.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtensionStatus
     */

    public StagingArea withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     * replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server. In
     * this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the staging
     * account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this case,
     * errorMessage field will contain an error message that explains what happened.
     * </p>
     * 
     * @param status
     *        Status of Source server extension. Possible values: (a) NOT_EXTENDED - This is a source server that is
     *        replicating in the current account. (b) EXTENDED - Source server is extended from a staging source server.
     *        In this case, the value of stagingSourceServerArn is pointing to the Arn of the source server in the
     *        staging account. (c) EXTENSION_ERROR - Some issue occurred when accessing staging source server. In this
     *        case, errorMessage field will contain an error message that explains what happened.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtensionStatus
     */

    public StagingArea withStatus(ExtensionStatus status) {
        this.status = status.toString();
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getStagingAccountID() != null)
            sb.append("StagingAccountID: ").append(getStagingAccountID()).append(",");
        if (getStagingSourceServerArn() != null)
            sb.append("StagingSourceServerArn: ").append(getStagingSourceServerArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StagingArea == false)
            return false;
        StagingArea other = (StagingArea) obj;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getStagingAccountID() == null ^ this.getStagingAccountID() == null)
            return false;
        if (other.getStagingAccountID() != null && other.getStagingAccountID().equals(this.getStagingAccountID()) == false)
            return false;
        if (other.getStagingSourceServerArn() == null ^ this.getStagingSourceServerArn() == null)
            return false;
        if (other.getStagingSourceServerArn() != null && other.getStagingSourceServerArn().equals(this.getStagingSourceServerArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getStagingAccountID() == null) ? 0 : getStagingAccountID().hashCode());
        hashCode = prime * hashCode + ((getStagingSourceServerArn() == null) ? 0 : getStagingSourceServerArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StagingArea clone() {
        try {
            return (StagingArea) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.StagingAreaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
