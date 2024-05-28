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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action to archive the email by delivering the email to an Amazon SES archive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ArchiveAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified archive has been deleted.
     * </p>
     */
    private String actionFailurePolicy;
    /**
     * <p>
     * The identifier of the archive to send the email to.
     * </p>
     */
    private String targetArchive;

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified archive has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified archive has been deleted.
     * @see ActionFailurePolicy
     */

    public void setActionFailurePolicy(String actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified archive has been deleted.
     * </p>
     * 
     * @return A policy that states what to do in the case of failure. The action will fail if there are configuration
     *         errors. For example, the specified archive has been deleted.
     * @see ActionFailurePolicy
     */

    public String getActionFailurePolicy() {
        return this.actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified archive has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified archive has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public ArchiveAction withActionFailurePolicy(String actionFailurePolicy) {
        setActionFailurePolicy(actionFailurePolicy);
        return this;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified archive has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified archive has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public ArchiveAction withActionFailurePolicy(ActionFailurePolicy actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the archive to send the email to.
     * </p>
     * 
     * @param targetArchive
     *        The identifier of the archive to send the email to.
     */

    public void setTargetArchive(String targetArchive) {
        this.targetArchive = targetArchive;
    }

    /**
     * <p>
     * The identifier of the archive to send the email to.
     * </p>
     * 
     * @return The identifier of the archive to send the email to.
     */

    public String getTargetArchive() {
        return this.targetArchive;
    }

    /**
     * <p>
     * The identifier of the archive to send the email to.
     * </p>
     * 
     * @param targetArchive
     *        The identifier of the archive to send the email to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveAction withTargetArchive(String targetArchive) {
        setTargetArchive(targetArchive);
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
        if (getActionFailurePolicy() != null)
            sb.append("ActionFailurePolicy: ").append(getActionFailurePolicy()).append(",");
        if (getTargetArchive() != null)
            sb.append("TargetArchive: ").append(getTargetArchive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveAction == false)
            return false;
        ArchiveAction other = (ArchiveAction) obj;
        if (other.getActionFailurePolicy() == null ^ this.getActionFailurePolicy() == null)
            return false;
        if (other.getActionFailurePolicy() != null && other.getActionFailurePolicy().equals(this.getActionFailurePolicy()) == false)
            return false;
        if (other.getTargetArchive() == null ^ this.getTargetArchive() == null)
            return false;
        if (other.getTargetArchive() != null && other.getTargetArchive().equals(this.getTargetArchive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionFailurePolicy() == null) ? 0 : getActionFailurePolicy().hashCode());
        hashCode = prime * hashCode + ((getTargetArchive() == null) ? 0 : getTargetArchive().hashCode());
        return hashCode;
    }

    @Override
    public ArchiveAction clone() {
        try {
            return (ArchiveAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.ArchiveActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
