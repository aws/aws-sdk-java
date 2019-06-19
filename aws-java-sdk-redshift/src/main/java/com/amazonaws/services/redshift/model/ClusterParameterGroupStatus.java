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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterParameterGroupStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterParameterGroupStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;
    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterParameterStatus> clusterParameterStatusList;

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the cluster parameter group.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @return The name of the cluster parameter group.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroupStatus withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @return The status of parameter updates.
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
        return this;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @return The list of parameter statuses.</p>
     *         <p>
     *         For more information about parameters and parameter groups, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     *         Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     */

    public java.util.List<ClusterParameterStatus> getClusterParameterStatusList() {
        if (clusterParameterStatusList == null) {
            clusterParameterStatusList = new com.amazonaws.internal.SdkInternalList<ClusterParameterStatus>();
        }
        return clusterParameterStatusList;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param clusterParameterStatusList
     *        The list of parameter statuses.</p>
     *        <p>
     *        For more information about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     */

    public void setClusterParameterStatusList(java.util.Collection<ClusterParameterStatus> clusterParameterStatusList) {
        if (clusterParameterStatusList == null) {
            this.clusterParameterStatusList = null;
            return;
        }

        this.clusterParameterStatusList = new com.amazonaws.internal.SdkInternalList<ClusterParameterStatus>(clusterParameterStatusList);
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterParameterStatusList(java.util.Collection)} or
     * {@link #withClusterParameterStatusList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterParameterStatusList
     *        The list of parameter statuses.</p>
     *        <p>
     *        For more information about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroupStatus withClusterParameterStatusList(ClusterParameterStatus... clusterParameterStatusList) {
        if (this.clusterParameterStatusList == null) {
            setClusterParameterStatusList(new com.amazonaws.internal.SdkInternalList<ClusterParameterStatus>(clusterParameterStatusList.length));
        }
        for (ClusterParameterStatus ele : clusterParameterStatusList) {
            this.clusterParameterStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param clusterParameterStatusList
     *        The list of parameter statuses.</p>
     *        <p>
     *        For more information about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroupStatus withClusterParameterStatusList(java.util.Collection<ClusterParameterStatus> clusterParameterStatusList) {
        setClusterParameterStatusList(clusterParameterStatusList);
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus()).append(",");
        if (getClusterParameterStatusList() != null)
            sb.append("ClusterParameterStatusList: ").append(getClusterParameterStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterParameterGroupStatus == false)
            return false;
        ClusterParameterGroupStatus other = (ClusterParameterGroupStatus) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getClusterParameterStatusList() == null ^ this.getClusterParameterStatusList() == null)
            return false;
        if (other.getClusterParameterStatusList() != null && other.getClusterParameterStatusList().equals(this.getClusterParameterStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterParameterStatusList() == null) ? 0 : getClusterParameterStatusList().hashCode());
        return hashCode;
    }

    @Override
    public ClusterParameterGroupStatus clone() {
        try {
            return (ClusterParameterGroupStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
