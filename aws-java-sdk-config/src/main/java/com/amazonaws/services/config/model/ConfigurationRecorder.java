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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the recording of configuration changes of an AWS resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigurationRecorder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationRecorder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the
     * configuration recorder. You cannot change the assigned name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Specifies the types of AWS resources for which AWS Config records configuration changes.
     * </p>
     */
    private RecordingGroup recordingGroup;

    /**
     * <p>
     * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the
     * configuration recorder. You cannot change the assigned name.
     * </p>
     * 
     * @param name
     *        The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating
     *        the configuration recorder. You cannot change the assigned name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the
     * configuration recorder. You cannot change the assigned name.
     * </p>
     * 
     * @return The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating
     *         the configuration recorder. You cannot change the assigned name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the
     * configuration recorder. You cannot change the assigned name.
     * </p>
     * 
     * @param name
     *        The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating
     *        the configuration recorder. You cannot change the assigned name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorder withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
     * </p>
     * 
     * @param roleARN
     *        Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the
     *         account.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
     * </p>
     * 
     * @param roleARN
     *        Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorder withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Specifies the types of AWS resources for which AWS Config records configuration changes.
     * </p>
     * 
     * @param recordingGroup
     *        Specifies the types of AWS resources for which AWS Config records configuration changes.
     */

    public void setRecordingGroup(RecordingGroup recordingGroup) {
        this.recordingGroup = recordingGroup;
    }

    /**
     * <p>
     * Specifies the types of AWS resources for which AWS Config records configuration changes.
     * </p>
     * 
     * @return Specifies the types of AWS resources for which AWS Config records configuration changes.
     */

    public RecordingGroup getRecordingGroup() {
        return this.recordingGroup;
    }

    /**
     * <p>
     * Specifies the types of AWS resources for which AWS Config records configuration changes.
     * </p>
     * 
     * @param recordingGroup
     *        Specifies the types of AWS resources for which AWS Config records configuration changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorder withRecordingGroup(RecordingGroup recordingGroup) {
        setRecordingGroup(recordingGroup);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getRecordingGroup() != null)
            sb.append("RecordingGroup: ").append(getRecordingGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationRecorder == false)
            return false;
        ConfigurationRecorder other = (ConfigurationRecorder) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getRecordingGroup() == null ^ this.getRecordingGroup() == null)
            return false;
        if (other.getRecordingGroup() != null && other.getRecordingGroup().equals(this.getRecordingGroup()) == false)
            return false;
        return true;
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
    public ConfigurationRecorder clone() {
        try {
            return (ConfigurationRecorder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigurationRecorderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
