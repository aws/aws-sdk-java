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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeGlobalTableSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalTableSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the global table.
     * </p>
     */
    private String globalTableName;
    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     */
    private java.util.List<ReplicaSettingsDescription> replicaSettings;

    /**
     * <p>
     * The name of the global table.
     * </p>
     * 
     * @param globalTableName
     *        The name of the global table.
     */

    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The name of the global table.
     * </p>
     * 
     * @return The name of the global table.
     */

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    /**
     * <p>
     * The name of the global table.
     * </p>
     * 
     * @param globalTableName
     *        The name of the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalTableSettingsResult withGlobalTableName(String globalTableName) {
        setGlobalTableName(globalTableName);
        return this;
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     * 
     * @return The region specific settings for the global table.
     */

    public java.util.List<ReplicaSettingsDescription> getReplicaSettings() {
        return replicaSettings;
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     * 
     * @param replicaSettings
     *        The region specific settings for the global table.
     */

    public void setReplicaSettings(java.util.Collection<ReplicaSettingsDescription> replicaSettings) {
        if (replicaSettings == null) {
            this.replicaSettings = null;
            return;
        }

        this.replicaSettings = new java.util.ArrayList<ReplicaSettingsDescription>(replicaSettings);
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaSettings(java.util.Collection)} or {@link #withReplicaSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicaSettings
     *        The region specific settings for the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalTableSettingsResult withReplicaSettings(ReplicaSettingsDescription... replicaSettings) {
        if (this.replicaSettings == null) {
            setReplicaSettings(new java.util.ArrayList<ReplicaSettingsDescription>(replicaSettings.length));
        }
        for (ReplicaSettingsDescription ele : replicaSettings) {
            this.replicaSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The region specific settings for the global table.
     * </p>
     * 
     * @param replicaSettings
     *        The region specific settings for the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalTableSettingsResult withReplicaSettings(java.util.Collection<ReplicaSettingsDescription> replicaSettings) {
        setReplicaSettings(replicaSettings);
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
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: ").append(getGlobalTableName()).append(",");
        if (getReplicaSettings() != null)
            sb.append("ReplicaSettings: ").append(getReplicaSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalTableSettingsResult == false)
            return false;
        DescribeGlobalTableSettingsResult other = (DescribeGlobalTableSettingsResult) obj;
        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getReplicaSettings() == null ^ this.getReplicaSettings() == null)
            return false;
        if (other.getReplicaSettings() != null && other.getReplicaSettings().equals(this.getReplicaSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        hashCode = prime * hashCode + ((getReplicaSettings() == null) ? 0 : getReplicaSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalTableSettingsResult clone() {
        try {
            return (DescribeGlobalTableSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
