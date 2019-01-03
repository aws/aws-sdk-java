/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the method and snapshot to use when restarting an application using previously saved application state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationRestoreConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationRestoreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies how the application should be restored.
     * </p>
     */
    private String applicationRestoreType;
    /**
     * <p>
     * The identifier of an existing snapshot of application state to use to restart an application. The application
     * uses this value if <code>RESTORE_FROM_CUSTOM_SNAPSHOT</code> is specified for the
     * <code>ApplicationRestoreType</code>.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * Specifies how the application should be restored.
     * </p>
     * 
     * @param applicationRestoreType
     *        Specifies how the application should be restored.
     * @see ApplicationRestoreType
     */

    public void setApplicationRestoreType(String applicationRestoreType) {
        this.applicationRestoreType = applicationRestoreType;
    }

    /**
     * <p>
     * Specifies how the application should be restored.
     * </p>
     * 
     * @return Specifies how the application should be restored.
     * @see ApplicationRestoreType
     */

    public String getApplicationRestoreType() {
        return this.applicationRestoreType;
    }

    /**
     * <p>
     * Specifies how the application should be restored.
     * </p>
     * 
     * @param applicationRestoreType
     *        Specifies how the application should be restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationRestoreType
     */

    public ApplicationRestoreConfiguration withApplicationRestoreType(String applicationRestoreType) {
        setApplicationRestoreType(applicationRestoreType);
        return this;
    }

    /**
     * <p>
     * Specifies how the application should be restored.
     * </p>
     * 
     * @param applicationRestoreType
     *        Specifies how the application should be restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationRestoreType
     */

    public ApplicationRestoreConfiguration withApplicationRestoreType(ApplicationRestoreType applicationRestoreType) {
        this.applicationRestoreType = applicationRestoreType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of an existing snapshot of application state to use to restart an application. The application
     * uses this value if <code>RESTORE_FROM_CUSTOM_SNAPSHOT</code> is specified for the
     * <code>ApplicationRestoreType</code>.
     * </p>
     * 
     * @param snapshotName
     *        The identifier of an existing snapshot of application state to use to restart an application. The
     *        application uses this value if <code>RESTORE_FROM_CUSTOM_SNAPSHOT</code> is specified for the
     *        <code>ApplicationRestoreType</code>.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The identifier of an existing snapshot of application state to use to restart an application. The application
     * uses this value if <code>RESTORE_FROM_CUSTOM_SNAPSHOT</code> is specified for the
     * <code>ApplicationRestoreType</code>.
     * </p>
     * 
     * @return The identifier of an existing snapshot of application state to use to restart an application. The
     *         application uses this value if <code>RESTORE_FROM_CUSTOM_SNAPSHOT</code> is specified for the
     *         <code>ApplicationRestoreType</code>.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The identifier of an existing snapshot of application state to use to restart an application. The application
     * uses this value if <code>RESTORE_FROM_CUSTOM_SNAPSHOT</code> is specified for the
     * <code>ApplicationRestoreType</code>.
     * </p>
     * 
     * @param snapshotName
     *        The identifier of an existing snapshot of application state to use to restart an application. The
     *        application uses this value if <code>RESTORE_FROM_CUSTOM_SNAPSHOT</code> is specified for the
     *        <code>ApplicationRestoreType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationRestoreConfiguration withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
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
        if (getApplicationRestoreType() != null)
            sb.append("ApplicationRestoreType: ").append(getApplicationRestoreType()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationRestoreConfiguration == false)
            return false;
        ApplicationRestoreConfiguration other = (ApplicationRestoreConfiguration) obj;
        if (other.getApplicationRestoreType() == null ^ this.getApplicationRestoreType() == null)
            return false;
        if (other.getApplicationRestoreType() != null && other.getApplicationRestoreType().equals(this.getApplicationRestoreType()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationRestoreType() == null) ? 0 : getApplicationRestoreType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationRestoreConfiguration clone() {
        try {
            return (ApplicationRestoreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationRestoreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
