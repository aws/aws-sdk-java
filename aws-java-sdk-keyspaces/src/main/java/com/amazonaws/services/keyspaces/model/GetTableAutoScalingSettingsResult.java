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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetTableAutoScalingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableAutoScalingSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     */
    private String keyspaceName;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The auto scaling settings of the table.
     * </p>
     */
    private AutoScalingSpecification autoScalingSpecification;
    /**
     * <p>
     * The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all Regions
     * the table is replicated in.
     * </p>
     */
    private java.util.List<ReplicaAutoScalingSpecification> replicaSpecifications;

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     * 
     * @return The name of the keyspace.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableAutoScalingSettingsResult withKeyspaceName(String keyspaceName) {
        setKeyspaceName(keyspaceName);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableAutoScalingSettingsResult withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the table.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the table.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableAutoScalingSettingsResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The auto scaling settings of the table.
     * </p>
     * 
     * @param autoScalingSpecification
     *        The auto scaling settings of the table.
     */

    public void setAutoScalingSpecification(AutoScalingSpecification autoScalingSpecification) {
        this.autoScalingSpecification = autoScalingSpecification;
    }

    /**
     * <p>
     * The auto scaling settings of the table.
     * </p>
     * 
     * @return The auto scaling settings of the table.
     */

    public AutoScalingSpecification getAutoScalingSpecification() {
        return this.autoScalingSpecification;
    }

    /**
     * <p>
     * The auto scaling settings of the table.
     * </p>
     * 
     * @param autoScalingSpecification
     *        The auto scaling settings of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableAutoScalingSettingsResult withAutoScalingSpecification(AutoScalingSpecification autoScalingSpecification) {
        setAutoScalingSpecification(autoScalingSpecification);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all Regions
     * the table is replicated in.
     * </p>
     * 
     * @return The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all
     *         Regions the table is replicated in.
     */

    public java.util.List<ReplicaAutoScalingSpecification> getReplicaSpecifications() {
        return replicaSpecifications;
    }

    /**
     * <p>
     * The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all Regions
     * the table is replicated in.
     * </p>
     * 
     * @param replicaSpecifications
     *        The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all
     *        Regions the table is replicated in.
     */

    public void setReplicaSpecifications(java.util.Collection<ReplicaAutoScalingSpecification> replicaSpecifications) {
        if (replicaSpecifications == null) {
            this.replicaSpecifications = null;
            return;
        }

        this.replicaSpecifications = new java.util.ArrayList<ReplicaAutoScalingSpecification>(replicaSpecifications);
    }

    /**
     * <p>
     * The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all Regions
     * the table is replicated in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaSpecifications(java.util.Collection)} or
     * {@link #withReplicaSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicaSpecifications
     *        The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all
     *        Regions the table is replicated in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableAutoScalingSettingsResult withReplicaSpecifications(ReplicaAutoScalingSpecification... replicaSpecifications) {
        if (this.replicaSpecifications == null) {
            setReplicaSpecifications(new java.util.ArrayList<ReplicaAutoScalingSpecification>(replicaSpecifications.length));
        }
        for (ReplicaAutoScalingSpecification ele : replicaSpecifications) {
            this.replicaSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all Regions
     * the table is replicated in.
     * </p>
     * 
     * @param replicaSpecifications
     *        The Amazon Web Services Region specific settings of a multi-Region table. Returns the settings for all
     *        Regions the table is replicated in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableAutoScalingSettingsResult withReplicaSpecifications(java.util.Collection<ReplicaAutoScalingSpecification> replicaSpecifications) {
        setReplicaSpecifications(replicaSpecifications);
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
        if (getKeyspaceName() != null)
            sb.append("KeyspaceName: ").append(getKeyspaceName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getAutoScalingSpecification() != null)
            sb.append("AutoScalingSpecification: ").append(getAutoScalingSpecification()).append(",");
        if (getReplicaSpecifications() != null)
            sb.append("ReplicaSpecifications: ").append(getReplicaSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableAutoScalingSettingsResult == false)
            return false;
        GetTableAutoScalingSettingsResult other = (GetTableAutoScalingSettingsResult) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getAutoScalingSpecification() == null ^ this.getAutoScalingSpecification() == null)
            return false;
        if (other.getAutoScalingSpecification() != null && other.getAutoScalingSpecification().equals(this.getAutoScalingSpecification()) == false)
            return false;
        if (other.getReplicaSpecifications() == null ^ this.getReplicaSpecifications() == null)
            return false;
        if (other.getReplicaSpecifications() != null && other.getReplicaSpecifications().equals(this.getReplicaSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingSpecification() == null) ? 0 : getAutoScalingSpecification().hashCode());
        hashCode = prime * hashCode + ((getReplicaSpecifications() == null) ? 0 : getReplicaSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public GetTableAutoScalingSettingsResult clone() {
        try {
            return (GetTableAutoScalingSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
