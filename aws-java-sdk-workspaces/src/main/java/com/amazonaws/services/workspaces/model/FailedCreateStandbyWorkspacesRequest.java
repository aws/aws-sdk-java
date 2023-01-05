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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Standby WorkSpace that could not be created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/FailedCreateStandbyWorkspacesRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedCreateStandbyWorkspacesRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     */
    private StandbyWorkspace standbyWorkspaceRequest;
    /**
     * <p>
     * The error code that is returned if the Standby WorkSpace could not be created.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The text of the error message that is returned if the Standby WorkSpace could not be created.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     * 
     * @param standbyWorkspaceRequest
     *        Information about the Standby WorkSpace that could not be created.
     */

    public void setStandbyWorkspaceRequest(StandbyWorkspace standbyWorkspaceRequest) {
        this.standbyWorkspaceRequest = standbyWorkspaceRequest;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     * 
     * @return Information about the Standby WorkSpace that could not be created.
     */

    public StandbyWorkspace getStandbyWorkspaceRequest() {
        return this.standbyWorkspaceRequest;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     * 
     * @param standbyWorkspaceRequest
     *        Information about the Standby WorkSpace that could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateStandbyWorkspacesRequest withStandbyWorkspaceRequest(StandbyWorkspace standbyWorkspaceRequest) {
        setStandbyWorkspaceRequest(standbyWorkspaceRequest);
        return this;
    }

    /**
     * <p>
     * The error code that is returned if the Standby WorkSpace could not be created.
     * </p>
     * 
     * @param errorCode
     *        The error code that is returned if the Standby WorkSpace could not be created.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code that is returned if the Standby WorkSpace could not be created.
     * </p>
     * 
     * @return The error code that is returned if the Standby WorkSpace could not be created.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code that is returned if the Standby WorkSpace could not be created.
     * </p>
     * 
     * @param errorCode
     *        The error code that is returned if the Standby WorkSpace could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateStandbyWorkspacesRequest withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The text of the error message that is returned if the Standby WorkSpace could not be created.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message that is returned if the Standby WorkSpace could not be created.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The text of the error message that is returned if the Standby WorkSpace could not be created.
     * </p>
     * 
     * @return The text of the error message that is returned if the Standby WorkSpace could not be created.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The text of the error message that is returned if the Standby WorkSpace could not be created.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message that is returned if the Standby WorkSpace could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateStandbyWorkspacesRequest withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getStandbyWorkspaceRequest() != null)
            sb.append("StandbyWorkspaceRequest: ").append(getStandbyWorkspaceRequest()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedCreateStandbyWorkspacesRequest == false)
            return false;
        FailedCreateStandbyWorkspacesRequest other = (FailedCreateStandbyWorkspacesRequest) obj;
        if (other.getStandbyWorkspaceRequest() == null ^ this.getStandbyWorkspaceRequest() == null)
            return false;
        if (other.getStandbyWorkspaceRequest() != null && other.getStandbyWorkspaceRequest().equals(this.getStandbyWorkspaceRequest()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandbyWorkspaceRequest() == null) ? 0 : getStandbyWorkspaceRequest().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedCreateStandbyWorkspacesRequest clone() {
        try {
            return (FailedCreateStandbyWorkspacesRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.FailedCreateStandbyWorkspacesRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
