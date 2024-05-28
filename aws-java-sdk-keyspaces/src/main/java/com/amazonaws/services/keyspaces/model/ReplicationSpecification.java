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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The replication specification of the keyspace includes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>regionList</code> - up to six Amazon Web Services Regions where the keyspace is replicated in.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>replicationStrategy</code> - the required value is <code>SINGLE_REGION</code> or <code>MULTI_REGION</code>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ReplicationSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     */
    private String replicationStrategy;
    /**
     * <p>
     * The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is replicated
     * in.
     * </p>
     */
    private java.util.List<String> regionList;

    /**
     * <p>
     * The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @param replicationStrategy
     *        The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     *        <code>MULTI_REGION</code>.
     * @see Rs
     */

    public void setReplicationStrategy(String replicationStrategy) {
        this.replicationStrategy = replicationStrategy;
    }

    /**
     * <p>
     * The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @return The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     *         <code>MULTI_REGION</code>.
     * @see Rs
     */

    public String getReplicationStrategy() {
        return this.replicationStrategy;
    }

    /**
     * <p>
     * The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @param replicationStrategy
     *        The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     *        <code>MULTI_REGION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Rs
     */

    public ReplicationSpecification withReplicationStrategy(String replicationStrategy) {
        setReplicationStrategy(replicationStrategy);
        return this;
    }

    /**
     * <p>
     * The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     * <code>MULTI_REGION</code>.
     * </p>
     * 
     * @param replicationStrategy
     *        The <code>replicationStrategy</code> of a keyspace, the required value is <code>SINGLE_REGION</code> or
     *        <code>MULTI_REGION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Rs
     */

    public ReplicationSpecification withReplicationStrategy(Rs replicationStrategy) {
        this.replicationStrategy = replicationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is replicated
     * in.
     * </p>
     * 
     * @return The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is
     *         replicated in.
     */

    public java.util.List<String> getRegionList() {
        return regionList;
    }

    /**
     * <p>
     * The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is replicated
     * in.
     * </p>
     * 
     * @param regionList
     *        The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is
     *        replicated in.
     */

    public void setRegionList(java.util.Collection<String> regionList) {
        if (regionList == null) {
            this.regionList = null;
            return;
        }

        this.regionList = new java.util.ArrayList<String>(regionList);
    }

    /**
     * <p>
     * The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is replicated
     * in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionList(java.util.Collection)} or {@link #withRegionList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param regionList
     *        The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is
     *        replicated in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSpecification withRegionList(String... regionList) {
        if (this.regionList == null) {
            setRegionList(new java.util.ArrayList<String>(regionList.length));
        }
        for (String ele : regionList) {
            this.regionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is replicated
     * in.
     * </p>
     * 
     * @param regionList
     *        The <code>regionList</code> can contain up to six Amazon Web Services Regions where the keyspace is
     *        replicated in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSpecification withRegionList(java.util.Collection<String> regionList) {
        setRegionList(regionList);
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
        if (getReplicationStrategy() != null)
            sb.append("ReplicationStrategy: ").append(getReplicationStrategy()).append(",");
        if (getRegionList() != null)
            sb.append("RegionList: ").append(getRegionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationSpecification == false)
            return false;
        ReplicationSpecification other = (ReplicationSpecification) obj;
        if (other.getReplicationStrategy() == null ^ this.getReplicationStrategy() == null)
            return false;
        if (other.getReplicationStrategy() != null && other.getReplicationStrategy().equals(this.getReplicationStrategy()) == false)
            return false;
        if (other.getRegionList() == null ^ this.getRegionList() == null)
            return false;
        if (other.getRegionList() != null && other.getRegionList().equals(this.getRegionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationStrategy() == null) ? 0 : getReplicationStrategy().hashCode());
        hashCode = prime * hashCode + ((getRegionList() == null) ? 0 : getRegionList().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationSpecification clone() {
        try {
            return (ReplicationSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.ReplicationSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
