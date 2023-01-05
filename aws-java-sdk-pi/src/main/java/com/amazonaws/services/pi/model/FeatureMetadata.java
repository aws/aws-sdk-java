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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata for a feature. For example, the metadata might indicate that a feature is turned on or off on a specific
 * DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/FeatureMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the feature on the DB instance. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - The feature is enabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The feature is disabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code> - The feature status couldn't be determined.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The status of the feature on the DB instance. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - The feature is enabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The feature is disabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code> - The feature status couldn't be determined.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the feature on the DB instance. Possible values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - The feature is enabled on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - The feature is disabled on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     *        effect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to
     *        take effect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code> - The feature status couldn't be determined.
     *        </p>
     *        </li>
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the feature on the DB instance. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - The feature is enabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The feature is disabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code> - The feature status couldn't be determined.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the feature on the DB instance. Possible values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - The feature is enabled on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - The feature is disabled on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to
     *         take effect.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to
     *         take effect.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code> - The feature status couldn't be determined.
     *         </p>
     *         </li>
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the feature on the DB instance. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - The feature is enabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The feature is disabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code> - The feature status couldn't be determined.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the feature on the DB instance. Possible values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - The feature is enabled on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - The feature is disabled on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     *        effect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to
     *        take effect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code> - The feature status couldn't be determined.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public FeatureMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the feature on the DB instance. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - The feature is enabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - The feature is disabled on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to take
     * effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code> - The feature status couldn't be determined.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the feature on the DB instance. Possible values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - The feature is enabled on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - The feature is disabled on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSUPPORTED</code> - The feature isn't supported on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_PENDING_REBOOT</code> - The feature is enabled on the instance but requires a reboot to take
     *        effect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_PENDING_REBOOT</code> - The feature is disabled on the instance but requires a reboot to
     *        take effect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code> - The feature status couldn't be determined.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public FeatureMetadata withStatus(FeatureStatus status) {
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

        if (obj instanceof FeatureMetadata == false)
            return false;
        FeatureMetadata other = (FeatureMetadata) obj;
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public FeatureMetadata clone() {
        try {
            return (FeatureMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.FeatureMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
