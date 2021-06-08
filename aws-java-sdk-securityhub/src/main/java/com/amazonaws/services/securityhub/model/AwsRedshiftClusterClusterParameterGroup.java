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
 * A cluster parameter group that is associated with an Amazon Redshift cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterClusterParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterClusterParameterGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     */
    private java.util.List<AwsRedshiftClusterClusterParameterStatus> clusterParameterStatusList;
    /**
     * <p>
     * The status of updates to the parameters.
     * </p>
     */
    private String parameterApplyStatus;
    /**
     * <p>
     * The name of the parameter group.
     * </p>
     */
    private String parameterGroupName;

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * 
     * @return The list of parameter statuses.
     */

    public java.util.List<AwsRedshiftClusterClusterParameterStatus> getClusterParameterStatusList() {
        return clusterParameterStatusList;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * 
     * @param clusterParameterStatusList
     *        The list of parameter statuses.
     */

    public void setClusterParameterStatusList(java.util.Collection<AwsRedshiftClusterClusterParameterStatus> clusterParameterStatusList) {
        if (clusterParameterStatusList == null) {
            this.clusterParameterStatusList = null;
            return;
        }

        this.clusterParameterStatusList = new java.util.ArrayList<AwsRedshiftClusterClusterParameterStatus>(clusterParameterStatusList);
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterParameterStatusList(java.util.Collection)} or
     * {@link #withClusterParameterStatusList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterParameterStatusList
     *        The list of parameter statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterParameterGroup withClusterParameterStatusList(AwsRedshiftClusterClusterParameterStatus... clusterParameterStatusList) {
        if (this.clusterParameterStatusList == null) {
            setClusterParameterStatusList(new java.util.ArrayList<AwsRedshiftClusterClusterParameterStatus>(clusterParameterStatusList.length));
        }
        for (AwsRedshiftClusterClusterParameterStatus ele : clusterParameterStatusList) {
            this.clusterParameterStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of parameter statuses.
     * </p>
     * 
     * @param clusterParameterStatusList
     *        The list of parameter statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterParameterGroup withClusterParameterStatusList(
            java.util.Collection<AwsRedshiftClusterClusterParameterStatus> clusterParameterStatusList) {
        setClusterParameterStatusList(clusterParameterStatusList);
        return this;
    }

    /**
     * <p>
     * The status of updates to the parameters.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of updates to the parameters.
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of updates to the parameters.
     * </p>
     * 
     * @return The status of updates to the parameters.
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of updates to the parameters.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of updates to the parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterParameterGroup withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @return The name of the parameter group.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterParameterGroup withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
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
        if (getClusterParameterStatusList() != null)
            sb.append("ClusterParameterStatusList: ").append(getClusterParameterStatusList()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus()).append(",");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterClusterParameterGroup == false)
            return false;
        AwsRedshiftClusterClusterParameterGroup other = (AwsRedshiftClusterClusterParameterGroup) obj;
        if (other.getClusterParameterStatusList() == null ^ this.getClusterParameterStatusList() == null)
            return false;
        if (other.getClusterParameterStatusList() != null && other.getClusterParameterStatusList().equals(this.getClusterParameterStatusList()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterParameterStatusList() == null) ? 0 : getClusterParameterStatusList().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterClusterParameterGroup clone() {
        try {
            return (AwsRedshiftClusterClusterParameterGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterClusterParameterGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
