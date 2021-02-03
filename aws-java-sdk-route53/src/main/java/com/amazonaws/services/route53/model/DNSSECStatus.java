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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A string repesenting the status of DNSSEC signing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DNSSECStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DNSSECStatus implements Serializable, Cloneable {

    /**
     * <p>
     * A string that represents the current hosted zone signing status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>NOT_SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is not enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is in the process of being removed for the hosted zone.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is a problem with signing in the hosted zone that requires you to take action to resolve. For example, the
     * customer managed customer master key (CMK) might have been deleted, or the permissions for the customer managed
     * CMK might have been changed.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including with
     * key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the hosted
     * zone.
     * </p>
     * </dd>
     * </dl>
     */
    private String serveSignature;
    /**
     * <p>
     * The status message provided for the following DNSSEC signing status: <code>INTERNAL_FAILURE</code>. The status
     * message includes information about what the problem might be and steps that you can take to correct the issue.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * A string that represents the current hosted zone signing status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>NOT_SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is not enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is in the process of being removed for the hosted zone.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is a problem with signing in the hosted zone that requires you to take action to resolve. For example, the
     * customer managed customer master key (CMK) might have been deleted, or the permissions for the customer managed
     * CMK might have been changed.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including with
     * key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the hosted
     * zone.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param serveSignature
     *        A string that represents the current hosted zone signing status.</p>
     *        <p>
     *        Status can have one of the following values:
     *        </p>
     *        <dl>
     *        <dt>SIGNING</dt>
     *        <dd>
     *        <p>
     *        DNSSEC signing is enabled for the hosted zone.
     *        </p>
     *        </dd>
     *        <dt>NOT_SIGNING</dt>
     *        <dd>
     *        <p>
     *        DNSSEC signing is not enabled for the hosted zone.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        DNSSEC signing is in the process of being removed for the hosted zone.
     *        </p>
     *        </dd>
     *        <dt>ACTION_NEEDED</dt>
     *        <dd>
     *        <p>
     *        There is a problem with signing in the hosted zone that requires you to take action to resolve. For
     *        example, the customer managed customer master key (CMK) might have been deleted, or the permissions for
     *        the customer managed CMK might have been changed.
     *        </p>
     *        </dd>
     *        <dt>INTERNAL_FAILURE</dt>
     *        <dd>
     *        <p>
     *        There was an error during a request. Before you can continue to work with DNSSEC signing, including with
     *        key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the
     *        hosted zone.
     *        </p>
     *        </dd>
     */

    public void setServeSignature(String serveSignature) {
        this.serveSignature = serveSignature;
    }

    /**
     * <p>
     * A string that represents the current hosted zone signing status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>NOT_SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is not enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is in the process of being removed for the hosted zone.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is a problem with signing in the hosted zone that requires you to take action to resolve. For example, the
     * customer managed customer master key (CMK) might have been deleted, or the permissions for the customer managed
     * CMK might have been changed.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including with
     * key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the hosted
     * zone.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return A string that represents the current hosted zone signing status.</p>
     *         <p>
     *         Status can have one of the following values:
     *         </p>
     *         <dl>
     *         <dt>SIGNING</dt>
     *         <dd>
     *         <p>
     *         DNSSEC signing is enabled for the hosted zone.
     *         </p>
     *         </dd>
     *         <dt>NOT_SIGNING</dt>
     *         <dd>
     *         <p>
     *         DNSSEC signing is not enabled for the hosted zone.
     *         </p>
     *         </dd>
     *         <dt>DELETING</dt>
     *         <dd>
     *         <p>
     *         DNSSEC signing is in the process of being removed for the hosted zone.
     *         </p>
     *         </dd>
     *         <dt>ACTION_NEEDED</dt>
     *         <dd>
     *         <p>
     *         There is a problem with signing in the hosted zone that requires you to take action to resolve. For
     *         example, the customer managed customer master key (CMK) might have been deleted, or the permissions for
     *         the customer managed CMK might have been changed.
     *         </p>
     *         </dd>
     *         <dt>INTERNAL_FAILURE</dt>
     *         <dd>
     *         <p>
     *         There was an error during a request. Before you can continue to work with DNSSEC signing, including with
     *         key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the
     *         hosted zone.
     *         </p>
     *         </dd>
     */

    public String getServeSignature() {
        return this.serveSignature;
    }

    /**
     * <p>
     * A string that represents the current hosted zone signing status.
     * </p>
     * <p>
     * Status can have one of the following values:
     * </p>
     * <dl>
     * <dt>SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>NOT_SIGNING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is not enabled for the hosted zone.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * DNSSEC signing is in the process of being removed for the hosted zone.
     * </p>
     * </dd>
     * <dt>ACTION_NEEDED</dt>
     * <dd>
     * <p>
     * There is a problem with signing in the hosted zone that requires you to take action to resolve. For example, the
     * customer managed customer master key (CMK) might have been deleted, or the permissions for the customer managed
     * CMK might have been changed.
     * </p>
     * </dd>
     * <dt>INTERNAL_FAILURE</dt>
     * <dd>
     * <p>
     * There was an error during a request. Before you can continue to work with DNSSEC signing, including with
     * key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the hosted
     * zone.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param serveSignature
     *        A string that represents the current hosted zone signing status.</p>
     *        <p>
     *        Status can have one of the following values:
     *        </p>
     *        <dl>
     *        <dt>SIGNING</dt>
     *        <dd>
     *        <p>
     *        DNSSEC signing is enabled for the hosted zone.
     *        </p>
     *        </dd>
     *        <dt>NOT_SIGNING</dt>
     *        <dd>
     *        <p>
     *        DNSSEC signing is not enabled for the hosted zone.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        DNSSEC signing is in the process of being removed for the hosted zone.
     *        </p>
     *        </dd>
     *        <dt>ACTION_NEEDED</dt>
     *        <dd>
     *        <p>
     *        There is a problem with signing in the hosted zone that requires you to take action to resolve. For
     *        example, the customer managed customer master key (CMK) might have been deleted, or the permissions for
     *        the customer managed CMK might have been changed.
     *        </p>
     *        </dd>
     *        <dt>INTERNAL_FAILURE</dt>
     *        <dd>
     *        <p>
     *        There was an error during a request. Before you can continue to work with DNSSEC signing, including with
     *        key-signing keys (KSKs), you must correct the problem by enabling or disabling DNSSEC signing for the
     *        hosted zone.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSSECStatus withServeSignature(String serveSignature) {
        setServeSignature(serveSignature);
        return this;
    }

    /**
     * <p>
     * The status message provided for the following DNSSEC signing status: <code>INTERNAL_FAILURE</code>. The status
     * message includes information about what the problem might be and steps that you can take to correct the issue.
     * </p>
     * 
     * @param statusMessage
     *        The status message provided for the following DNSSEC signing status: <code>INTERNAL_FAILURE</code>. The
     *        status message includes information about what the problem might be and steps that you can take to correct
     *        the issue.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message provided for the following DNSSEC signing status: <code>INTERNAL_FAILURE</code>. The status
     * message includes information about what the problem might be and steps that you can take to correct the issue.
     * </p>
     * 
     * @return The status message provided for the following DNSSEC signing status: <code>INTERNAL_FAILURE</code>. The
     *         status message includes information about what the problem might be and steps that you can take to
     *         correct the issue.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message provided for the following DNSSEC signing status: <code>INTERNAL_FAILURE</code>. The status
     * message includes information about what the problem might be and steps that you can take to correct the issue.
     * </p>
     * 
     * @param statusMessage
     *        The status message provided for the following DNSSEC signing status: <code>INTERNAL_FAILURE</code>. The
     *        status message includes information about what the problem might be and steps that you can take to correct
     *        the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSSECStatus withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getServeSignature() != null)
            sb.append("ServeSignature: ").append(getServeSignature()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DNSSECStatus == false)
            return false;
        DNSSECStatus other = (DNSSECStatus) obj;
        if (other.getServeSignature() == null ^ this.getServeSignature() == null)
            return false;
        if (other.getServeSignature() != null && other.getServeSignature().equals(this.getServeSignature()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServeSignature() == null) ? 0 : getServeSignature().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public DNSSECStatus clone() {
        try {
            return (DNSSECStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
