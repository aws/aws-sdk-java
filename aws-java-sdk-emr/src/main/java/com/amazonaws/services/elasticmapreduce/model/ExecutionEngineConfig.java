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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the execution engine (cluster) to run the notebook and perform the notebook execution, for example, an EMR
 * cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ExecutionEngineConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionEngineConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster for this
     * notebook execution. For more information see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     * >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     */
    private String masterInstanceSecurityGroupId;

    /**
     * <p>
     * The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
     * </p>
     * 
     * @param id
     *        The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
     * </p>
     * 
     * @return The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
     * </p>
     * 
     * @param id
     *        The unique identifier of the execution engine. For an EMR cluster, this is the cluster ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionEngineConfig withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * </p>
     * 
     * @param type
     *        The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * @see ExecutionEngineType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * </p>
     * 
     * @return The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * @see ExecutionEngineType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * </p>
     * 
     * @param type
     *        The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionEngineType
     */

    public ExecutionEngineConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * </p>
     * 
     * @param type
     *        The type of execution engine. A value of <code>EMR</code> specifies an EMR cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionEngineType
     */

    public ExecutionEngineConfig withType(ExecutionEngineType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster for this
     * notebook execution. For more information see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     * >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @param masterInstanceSecurityGroupId
     *        An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster
     *        for this notebook execution. For more information see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     *        >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     */

    public void setMasterInstanceSecurityGroupId(String masterInstanceSecurityGroupId) {
        this.masterInstanceSecurityGroupId = masterInstanceSecurityGroupId;
    }

    /**
     * <p>
     * An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster for this
     * notebook execution. For more information see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     * >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @return An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster
     *         for this notebook execution. For more information see <a href=
     *         "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     *         >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     */

    public String getMasterInstanceSecurityGroupId() {
        return this.masterInstanceSecurityGroupId;
    }

    /**
     * <p>
     * An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster for this
     * notebook execution. For more information see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     * >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @param masterInstanceSecurityGroupId
     *        An optional unique ID of an EC2 security group to associate with the master instance of the EMR cluster
     *        for this notebook execution. For more information see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     *        >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionEngineConfig withMasterInstanceSecurityGroupId(String masterInstanceSecurityGroupId) {
        setMasterInstanceSecurityGroupId(masterInstanceSecurityGroupId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMasterInstanceSecurityGroupId() != null)
            sb.append("MasterInstanceSecurityGroupId: ").append(getMasterInstanceSecurityGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionEngineConfig == false)
            return false;
        ExecutionEngineConfig other = (ExecutionEngineConfig) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMasterInstanceSecurityGroupId() == null ^ this.getMasterInstanceSecurityGroupId() == null)
            return false;
        if (other.getMasterInstanceSecurityGroupId() != null
                && other.getMasterInstanceSecurityGroupId().equals(this.getMasterInstanceSecurityGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMasterInstanceSecurityGroupId() == null) ? 0 : getMasterInstanceSecurityGroupId().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionEngineConfig clone() {
        try {
            return (ExecutionEngineConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ExecutionEngineConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
