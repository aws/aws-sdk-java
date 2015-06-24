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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the recording of configuration changes of an
 * AWS resource.
 * </p>
 */
public class ConfigurationRecorder implements Serializable, Cloneable {

    /**
     * The name of the recorder. By default, AWS Config automatically assigns
     * the name "default" when creating the configuration recorder. You
     * cannot change the assigned name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS
     * resources associated with the account.
     */
    private String roleARN;

    /**
     * The recording group specifies either to record configurations for all
     * supported resources or to provide a list of resource types to record.
     * The list of resource types must be a subset of supported resource
     * types.
     */
    private RecordingGroup recordingGroup;

    /**
     * The name of the recorder. By default, AWS Config automatically assigns
     * the name "default" when creating the configuration recorder. You
     * cannot change the assigned name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the recorder. By default, AWS Config automatically assigns
     *         the name "default" when creating the configuration recorder. You
     *         cannot change the assigned name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the recorder. By default, AWS Config automatically assigns
     * the name "default" when creating the configuration recorder. You
     * cannot change the assigned name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the recorder. By default, AWS Config automatically assigns
     *         the name "default" when creating the configuration recorder. You
     *         cannot change the assigned name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the recorder. By default, AWS Config automatically assigns
     * the name "default" when creating the configuration recorder. You
     * cannot change the assigned name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the recorder. By default, AWS Config automatically assigns
     *         the name "default" when creating the configuration recorder. You
     *         cannot change the assigned name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS
     * resources associated with the account.
     *
     * @return Amazon Resource Name (ARN) of the IAM role used to describe the AWS
     *         resources associated with the account.
     */
    public String getRoleARN() {
        return roleARN;
    }
    
    /**
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS
     * resources associated with the account.
     *
     * @param roleARN Amazon Resource Name (ARN) of the IAM role used to describe the AWS
     *         resources associated with the account.
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }
    
    /**
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS
     * resources associated with the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleARN Amazon Resource Name (ARN) of the IAM role used to describe the AWS
     *         resources associated with the account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorder withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * The recording group specifies either to record configurations for all
     * supported resources or to provide a list of resource types to record.
     * The list of resource types must be a subset of supported resource
     * types.
     *
     * @return The recording group specifies either to record configurations for all
     *         supported resources or to provide a list of resource types to record.
     *         The list of resource types must be a subset of supported resource
     *         types.
     */
    public RecordingGroup getRecordingGroup() {
        return recordingGroup;
    }
    
    /**
     * The recording group specifies either to record configurations for all
     * supported resources or to provide a list of resource types to record.
     * The list of resource types must be a subset of supported resource
     * types.
     *
     * @param recordingGroup The recording group specifies either to record configurations for all
     *         supported resources or to provide a list of resource types to record.
     *         The list of resource types must be a subset of supported resource
     *         types.
     */
    public void setRecordingGroup(RecordingGroup recordingGroup) {
        this.recordingGroup = recordingGroup;
    }
    
    /**
     * The recording group specifies either to record configurations for all
     * supported resources or to provide a list of resource types to record.
     * The list of resource types must be a subset of supported resource
     * types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recordingGroup The recording group specifies either to record configurations for all
     *         supported resources or to provide a list of resource types to record.
     *         The list of resource types must be a subset of supported resource
     *         types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorder withRecordingGroup(RecordingGroup recordingGroup) {
        this.recordingGroup = recordingGroup;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getRoleARN() != null) sb.append("RoleARN: " + getRoleARN() + ",");
        if (getRecordingGroup() != null) sb.append("RecordingGroup: " + getRecordingGroup() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode()); 
        hashCode = prime * hashCode + ((getRecordingGroup() == null) ? 0 : getRecordingGroup().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigurationRecorder == false) return false;
        ConfigurationRecorder other = (ConfigurationRecorder)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getRoleARN() == null ^ this.getRoleARN() == null) return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false) return false; 
        if (other.getRecordingGroup() == null ^ this.getRecordingGroup() == null) return false;
        if (other.getRecordingGroup() != null && other.getRecordingGroup().equals(this.getRecordingGroup()) == false) return false; 
        return true;
    }
    
    @Override
    public ConfigurationRecorder clone() {
        try {
            return (ConfigurationRecorder) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    