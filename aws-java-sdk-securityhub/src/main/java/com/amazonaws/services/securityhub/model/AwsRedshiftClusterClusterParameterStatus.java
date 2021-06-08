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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of a parameter in a cluster parameter group for an Amazon Redshift cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterClusterParameterStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterClusterParameterStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a cluster
     * reboot, or encountered an error when it was applied.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>pending-reboot</code> | <code>applying</code> |
     * <code>invalid-parameter</code> | <code>apply-deferred</code> | <code>apply-error</code> |
     * <code>unknown-error</code>
     * </p>
     */
    private String parameterApplyStatus;
    /**
     * <p>
     * The error that prevented the parameter from being applied to the database.
     * </p>
     */
    private String parameterApplyErrorDescription;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterParameterStatus withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a cluster
     * reboot, or encountered an error when it was applied.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>pending-reboot</code> | <code>applying</code> |
     * <code>invalid-parameter</code> | <code>apply-deferred</code> | <code>apply-error</code> |
     * <code>unknown-error</code>
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a
     *        cluster reboot, or encountered an error when it was applied.</p>
     *        <p>
     *        Valid values: <code>in-sync</code> | <code>pending-reboot</code> | <code>applying</code> |
     *        <code>invalid-parameter</code> | <code>apply-deferred</code> | <code>apply-error</code> |
     *        <code>unknown-error</code>
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a cluster
     * reboot, or encountered an error when it was applied.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>pending-reboot</code> | <code>applying</code> |
     * <code>invalid-parameter</code> | <code>apply-deferred</code> | <code>apply-error</code> |
     * <code>unknown-error</code>
     * </p>
     * 
     * @return The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a
     *         cluster reboot, or encountered an error when it was applied.</p>
     *         <p>
     *         Valid values: <code>in-sync</code> | <code>pending-reboot</code> | <code>applying</code> |
     *         <code>invalid-parameter</code> | <code>apply-deferred</code> | <code>apply-error</code> |
     *         <code>unknown-error</code>
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a cluster
     * reboot, or encountered an error when it was applied.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>pending-reboot</code> | <code>applying</code> |
     * <code>invalid-parameter</code> | <code>apply-deferred</code> | <code>apply-error</code> |
     * <code>unknown-error</code>
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of the parameter. Indicates whether the parameter is in sync with the database, waiting for a
     *        cluster reboot, or encountered an error when it was applied.</p>
     *        <p>
     *        Valid values: <code>in-sync</code> | <code>pending-reboot</code> | <code>applying</code> |
     *        <code>invalid-parameter</code> | <code>apply-deferred</code> | <code>apply-error</code> |
     *        <code>unknown-error</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterParameterStatus withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
        return this;
    }

    /**
     * <p>
     * The error that prevented the parameter from being applied to the database.
     * </p>
     * 
     * @param parameterApplyErrorDescription
     *        The error that prevented the parameter from being applied to the database.
     */

    public void setParameterApplyErrorDescription(String parameterApplyErrorDescription) {
        this.parameterApplyErrorDescription = parameterApplyErrorDescription;
    }

    /**
     * <p>
     * The error that prevented the parameter from being applied to the database.
     * </p>
     * 
     * @return The error that prevented the parameter from being applied to the database.
     */

    public String getParameterApplyErrorDescription() {
        return this.parameterApplyErrorDescription;
    }

    /**
     * <p>
     * The error that prevented the parameter from being applied to the database.
     * </p>
     * 
     * @param parameterApplyErrorDescription
     *        The error that prevented the parameter from being applied to the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterParameterStatus withParameterApplyErrorDescription(String parameterApplyErrorDescription) {
        setParameterApplyErrorDescription(parameterApplyErrorDescription);
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus()).append(",");
        if (getParameterApplyErrorDescription() != null)
            sb.append("ParameterApplyErrorDescription: ").append(getParameterApplyErrorDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterClusterParameterStatus == false)
            return false;
        AwsRedshiftClusterClusterParameterStatus other = (AwsRedshiftClusterClusterParameterStatus) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getParameterApplyErrorDescription() == null ^ this.getParameterApplyErrorDescription() == null)
            return false;
        if (other.getParameterApplyErrorDescription() != null
                && other.getParameterApplyErrorDescription().equals(this.getParameterApplyErrorDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyErrorDescription() == null) ? 0 : getParameterApplyErrorDescription().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterClusterParameterStatus clone() {
        try {
            return (AwsRedshiftClusterClusterParameterStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterClusterParameterStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
