/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of a parameter group.
 * </p>
 */
public class ClusterParameterStatus implements Serializable, Cloneable {

    /**
     * The name of the parameter.
     */
    private String parameterName;

    /**
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered
     * an error when being applied. <p>The following are possible statuses
     * and descriptions.<ul> <li><code>in-sync</code>: The parameter value is
     * in sync with the database.</li> <li><code>pending-reboot</code>: The
     * parameter value will be applied after the cluster reboots.</li>
     * <li><code>applying</code>: The parameter value is being applied to the
     * database.</li> <li><code>invalid-parameter</code>: Cannot apply the
     * parameter value because it has an invalid value or syntax.</li>
     * <li><code>apply-deferred</code>: The parameter contains static
     * property changes. The changes are deferred until the cluster
     * reboots.</li> <li><code>apply-error</code>: Cannot connect to the
     * cluster. The parameter change will be applied after the cluster
     * reboots.</li> <li><code>unknown-error</code>: Cannot apply the
     * parameter change right now. The change will be applied after the
     * cluster reboots.</li> </ul>
     */
    private String parameterApplyStatus;

    /**
     * The error that prevented the parameter from being applied to the
     * database.
     */
    private String parameterApplyErrorDescription;

    /**
     * The name of the parameter.
     *
     * @return The name of the parameter.
     */
    public String getParameterName() {
        return parameterName;
    }
    
    /**
     * The name of the parameter.
     *
     * @param parameterName The name of the parameter.
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    
    /**
     * The name of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterName The name of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterStatus withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered
     * an error when being applied. <p>The following are possible statuses
     * and descriptions.<ul> <li><code>in-sync</code>: The parameter value is
     * in sync with the database.</li> <li><code>pending-reboot</code>: The
     * parameter value will be applied after the cluster reboots.</li>
     * <li><code>applying</code>: The parameter value is being applied to the
     * database.</li> <li><code>invalid-parameter</code>: Cannot apply the
     * parameter value because it has an invalid value or syntax.</li>
     * <li><code>apply-deferred</code>: The parameter contains static
     * property changes. The changes are deferred until the cluster
     * reboots.</li> <li><code>apply-error</code>: Cannot connect to the
     * cluster. The parameter change will be applied after the cluster
     * reboots.</li> <li><code>unknown-error</code>: Cannot apply the
     * parameter change right now. The change will be applied after the
     * cluster reboots.</li> </ul>
     *
     * @return The status of the parameter that indicates whether the parameter is in
     *         sync with the database, waiting for a cluster reboot, or encountered
     *         an error when being applied. <p>The following are possible statuses
     *         and descriptions.<ul> <li><code>in-sync</code>: The parameter value is
     *         in sync with the database.</li> <li><code>pending-reboot</code>: The
     *         parameter value will be applied after the cluster reboots.</li>
     *         <li><code>applying</code>: The parameter value is being applied to the
     *         database.</li> <li><code>invalid-parameter</code>: Cannot apply the
     *         parameter value because it has an invalid value or syntax.</li>
     *         <li><code>apply-deferred</code>: The parameter contains static
     *         property changes. The changes are deferred until the cluster
     *         reboots.</li> <li><code>apply-error</code>: Cannot connect to the
     *         cluster. The parameter change will be applied after the cluster
     *         reboots.</li> <li><code>unknown-error</code>: Cannot apply the
     *         parameter change right now. The change will be applied after the
     *         cluster reboots.</li> </ul>
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }
    
    /**
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered
     * an error when being applied. <p>The following are possible statuses
     * and descriptions.<ul> <li><code>in-sync</code>: The parameter value is
     * in sync with the database.</li> <li><code>pending-reboot</code>: The
     * parameter value will be applied after the cluster reboots.</li>
     * <li><code>applying</code>: The parameter value is being applied to the
     * database.</li> <li><code>invalid-parameter</code>: Cannot apply the
     * parameter value because it has an invalid value or syntax.</li>
     * <li><code>apply-deferred</code>: The parameter contains static
     * property changes. The changes are deferred until the cluster
     * reboots.</li> <li><code>apply-error</code>: Cannot connect to the
     * cluster. The parameter change will be applied after the cluster
     * reboots.</li> <li><code>unknown-error</code>: Cannot apply the
     * parameter change right now. The change will be applied after the
     * cluster reboots.</li> </ul>
     *
     * @param parameterApplyStatus The status of the parameter that indicates whether the parameter is in
     *         sync with the database, waiting for a cluster reboot, or encountered
     *         an error when being applied. <p>The following are possible statuses
     *         and descriptions.<ul> <li><code>in-sync</code>: The parameter value is
     *         in sync with the database.</li> <li><code>pending-reboot</code>: The
     *         parameter value will be applied after the cluster reboots.</li>
     *         <li><code>applying</code>: The parameter value is being applied to the
     *         database.</li> <li><code>invalid-parameter</code>: Cannot apply the
     *         parameter value because it has an invalid value or syntax.</li>
     *         <li><code>apply-deferred</code>: The parameter contains static
     *         property changes. The changes are deferred until the cluster
     *         reboots.</li> <li><code>apply-error</code>: Cannot connect to the
     *         cluster. The parameter change will be applied after the cluster
     *         reboots.</li> <li><code>unknown-error</code>: Cannot apply the
     *         parameter change right now. The change will be applied after the
     *         cluster reboots.</li> </ul>
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }
    
    /**
     * The status of the parameter that indicates whether the parameter is in
     * sync with the database, waiting for a cluster reboot, or encountered
     * an error when being applied. <p>The following are possible statuses
     * and descriptions.<ul> <li><code>in-sync</code>: The parameter value is
     * in sync with the database.</li> <li><code>pending-reboot</code>: The
     * parameter value will be applied after the cluster reboots.</li>
     * <li><code>applying</code>: The parameter value is being applied to the
     * database.</li> <li><code>invalid-parameter</code>: Cannot apply the
     * parameter value because it has an invalid value or syntax.</li>
     * <li><code>apply-deferred</code>: The parameter contains static
     * property changes. The changes are deferred until the cluster
     * reboots.</li> <li><code>apply-error</code>: Cannot connect to the
     * cluster. The parameter change will be applied after the cluster
     * reboots.</li> <li><code>unknown-error</code>: Cannot apply the
     * parameter change right now. The change will be applied after the
     * cluster reboots.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterApplyStatus The status of the parameter that indicates whether the parameter is in
     *         sync with the database, waiting for a cluster reboot, or encountered
     *         an error when being applied. <p>The following are possible statuses
     *         and descriptions.<ul> <li><code>in-sync</code>: The parameter value is
     *         in sync with the database.</li> <li><code>pending-reboot</code>: The
     *         parameter value will be applied after the cluster reboots.</li>
     *         <li><code>applying</code>: The parameter value is being applied to the
     *         database.</li> <li><code>invalid-parameter</code>: Cannot apply the
     *         parameter value because it has an invalid value or syntax.</li>
     *         <li><code>apply-deferred</code>: The parameter contains static
     *         property changes. The changes are deferred until the cluster
     *         reboots.</li> <li><code>apply-error</code>: Cannot connect to the
     *         cluster. The parameter change will be applied after the cluster
     *         reboots.</li> <li><code>unknown-error</code>: Cannot apply the
     *         parameter change right now. The change will be applied after the
     *         cluster reboots.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
        return this;
    }

    /**
     * The error that prevented the parameter from being applied to the
     * database.
     *
     * @return The error that prevented the parameter from being applied to the
     *         database.
     */
    public String getParameterApplyErrorDescription() {
        return parameterApplyErrorDescription;
    }
    
    /**
     * The error that prevented the parameter from being applied to the
     * database.
     *
     * @param parameterApplyErrorDescription The error that prevented the parameter from being applied to the
     *         database.
     */
    public void setParameterApplyErrorDescription(String parameterApplyErrorDescription) {
        this.parameterApplyErrorDescription = parameterApplyErrorDescription;
    }
    
    /**
     * The error that prevented the parameter from being applied to the
     * database.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterApplyErrorDescription The error that prevented the parameter from being applied to the
     *         database.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterStatus withParameterApplyErrorDescription(String parameterApplyErrorDescription) {
        this.parameterApplyErrorDescription = parameterApplyErrorDescription;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getParameterName() != null) sb.append("ParameterName: " + getParameterName() + ",");
        if (getParameterApplyStatus() != null) sb.append("ParameterApplyStatus: " + getParameterApplyStatus() + ",");
        if (getParameterApplyErrorDescription() != null) sb.append("ParameterApplyErrorDescription: " + getParameterApplyErrorDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterParameterStatus == false) return false;
        ClusterParameterStatus other = (ClusterParameterStatus)obj;
        
        if (other.getParameterName() == null ^ this.getParameterName() == null) return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false) return false; 
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null) return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false) return false; 
        if (other.getParameterApplyErrorDescription() == null ^ this.getParameterApplyErrorDescription() == null) return false;
        if (other.getParameterApplyErrorDescription() != null && other.getParameterApplyErrorDescription().equals(this.getParameterApplyErrorDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public ClusterParameterStatus clone() {
        try {
            return (ClusterParameterStatus) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    