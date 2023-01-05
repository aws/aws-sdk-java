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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the deletion state of an Amazon Route 53 hosted zone for a domain that is being automatically delegated to
 * an Amazon Lightsail DNS zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/R53HostedZoneDeletionState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class R53HostedZoneDeletionState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code for the deletion state.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The hosted zone deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The hosted zone deletion failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The hosted zone deletion started.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code for the deletion state.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The hosted zone deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The hosted zone deletion failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The hosted zone deletion started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the deletion state.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The hosted zone deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The hosted zone deletion failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The hosted zone deletion started.
     *        </p>
     *        </li>
     * @see R53HostedZoneDeletionStateCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status code for the deletion state.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The hosted zone deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The hosted zone deletion failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The hosted zone deletion started.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status code for the deletion state.</p>
     *         <p>
     *         Following are the possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The hosted zone deletion is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The hosted zone deletion failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STARTED</code> - The hosted zone deletion started.
     *         </p>
     *         </li>
     * @see R53HostedZoneDeletionStateCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status code for the deletion state.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The hosted zone deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The hosted zone deletion failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The hosted zone deletion started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the deletion state.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The hosted zone deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The hosted zone deletion failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The hosted zone deletion started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see R53HostedZoneDeletionStateCode
     */

    public R53HostedZoneDeletionState withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The status code for the deletion state.
     * </p>
     * <p>
     * Following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - The hosted zone deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The hosted zone deletion failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTED</code> - The hosted zone deletion started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The status code for the deletion state.</p>
     *        <p>
     *        Following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The hosted zone was successfully deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The hosted zone deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The hosted zone deletion failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTED</code> - The hosted zone deletion started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see R53HostedZoneDeletionStateCode
     */

    public R53HostedZoneDeletionState withCode(R53HostedZoneDeletionStateCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     * 
     * @param message
     *        The message that describes the reason for the status code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     * 
     * @return The message that describes the reason for the status code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message that describes the reason for the status code.
     * </p>
     * 
     * @param message
     *        The message that describes the reason for the status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public R53HostedZoneDeletionState withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof R53HostedZoneDeletionState == false)
            return false;
        R53HostedZoneDeletionState other = (R53HostedZoneDeletionState) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public R53HostedZoneDeletionState clone() {
        try {
            return (R53HostedZoneDeletionState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.R53HostedZoneDeletionStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
