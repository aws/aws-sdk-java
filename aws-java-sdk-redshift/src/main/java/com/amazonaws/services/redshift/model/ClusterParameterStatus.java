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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of a parameter group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterParameterStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterParameterStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a
     * cluster reboot, or encountered an error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property changes. The changes are deferred until the
     * cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter change will be applied after the cluster
     * reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now. The change will be applied after the
     * cluster reboots.
     * </p>
     * </li>
     * </ul>
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

    public ClusterParameterStatus withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a
     * cluster reboot, or encountered an error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property changes. The changes are deferred until the
     * cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter change will be applied after the cluster
     * reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now. The change will be applied after the
     * cluster reboots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parameterApplyStatus
     *        The status of the parameter that indicates whether the parameter is in sync with the database, waiting for
     *        a cluster reboot, or encountered an error when being applied.</p>
     *        <p>
     *        The following are possible statuses and descriptions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>in-sync</code>: The parameter value is in sync with the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending-reboot</code>: The parameter value will be applied after the cluster reboots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>applying</code>: The parameter value is being applied to the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>invalid-parameter</code>: Cannot apply the parameter value because it has an invalid value or
     *        syntax.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>apply-deferred</code>: The parameter contains static property changes. The changes are deferred
     *        until the cluster reboots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>apply-error</code>: Cannot connect to the cluster. The parameter change will be applied after the
     *        cluster reboots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown-error</code>: Cannot apply the parameter change right now. The change will be applied after
     *        the cluster reboots.
     *        </p>
     *        </li>
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a
     * cluster reboot, or encountered an error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property changes. The changes are deferred until the
     * cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter change will be applied after the cluster
     * reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now. The change will be applied after the
     * cluster reboots.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the parameter that indicates whether the parameter is in sync with the database, waiting
     *         for a cluster reboot, or encountered an error when being applied.</p>
     *         <p>
     *         The following are possible statuses and descriptions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>in-sync</code>: The parameter value is in sync with the database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending-reboot</code>: The parameter value will be applied after the cluster reboots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>applying</code>: The parameter value is being applied to the database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>invalid-parameter</code>: Cannot apply the parameter value because it has an invalid value or
     *         syntax.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>apply-deferred</code>: The parameter contains static property changes. The changes are deferred
     *         until the cluster reboots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>apply-error</code>: Cannot connect to the cluster. The parameter change will be applied after the
     *         cluster reboots.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown-error</code>: Cannot apply the parameter change right now. The change will be applied after
     *         the cluster reboots.
     *         </p>
     *         </li>
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a
     * cluster reboot, or encountered an error when being applied.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The parameter value is in sync with the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-reboot</code>: The parameter value will be applied after the cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applying</code>: The parameter value is being applied to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>invalid-parameter</code>: Cannot apply the parameter value because it has an invalid value or syntax.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-deferred</code>: The parameter contains static property changes. The changes are deferred until the
     * cluster reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>apply-error</code>: Cannot connect to the cluster. The parameter change will be applied after the cluster
     * reboots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown-error</code>: Cannot apply the parameter change right now. The change will be applied after the
     * cluster reboots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parameterApplyStatus
     *        The status of the parameter that indicates whether the parameter is in sync with the database, waiting for
     *        a cluster reboot, or encountered an error when being applied.</p>
     *        <p>
     *        The following are possible statuses and descriptions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>in-sync</code>: The parameter value is in sync with the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending-reboot</code>: The parameter value will be applied after the cluster reboots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>applying</code>: The parameter value is being applied to the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>invalid-parameter</code>: Cannot apply the parameter value because it has an invalid value or
     *        syntax.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>apply-deferred</code>: The parameter contains static property changes. The changes are deferred
     *        until the cluster reboots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>apply-error</code>: Cannot connect to the cluster. The parameter change will be applied after the
     *        cluster reboots.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown-error</code>: Cannot apply the parameter change right now. The change will be applied after
     *        the cluster reboots.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterStatus withParameterApplyStatus(String parameterApplyStatus) {
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

    public ClusterParameterStatus withParameterApplyErrorDescription(String parameterApplyErrorDescription) {
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

        if (obj instanceof ClusterParameterStatus == false)
            return false;
        ClusterParameterStatus other = (ClusterParameterStatus) obj;
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
    public ClusterParameterStatus clone() {
        try {
            return (ClusterParameterStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
