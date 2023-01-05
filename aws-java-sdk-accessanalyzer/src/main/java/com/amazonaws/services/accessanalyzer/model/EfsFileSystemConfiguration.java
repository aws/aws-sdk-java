/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed access control configuration for an Amazon EFS file system. You can propose a configuration for a new
 * Amazon EFS file system or an existing Amazon EFS file system that you own by specifying the Amazon EFS policy. For
 * more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/using-fs.html">Using file systems in Amazon
 * EFS</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the configuration is for an existing Amazon EFS file system and you do not specify the Amazon EFS policy, then the
 * access preview uses the existing Amazon EFS policy for the file system.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the access preview is for a new resource and you do not specify the policy, then the access preview assumes an
 * Amazon EFS file system without a policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * To propose deletion of an existing Amazon EFS file system policy, you can specify an empty string for the Amazon EFS
 * policy.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/EfsFileSystemConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EfsFileSystemConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements that make
     * up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >Amazon EFS Resource-based policies</a>.
     * </p>
     */
    private String fileSystemPolicy;

    /**
     * <p>
     * The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements that make
     * up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >Amazon EFS Resource-based policies</a>.
     * </p>
     * 
     * @param fileSystemPolicy
     *        The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements
     *        that make up a file system policy, see <a href=
     *        "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *        >Amazon EFS Resource-based policies</a>.
     */

    public void setFileSystemPolicy(String fileSystemPolicy) {
        this.fileSystemPolicy = fileSystemPolicy;
    }

    /**
     * <p>
     * The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements that make
     * up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >Amazon EFS Resource-based policies</a>.
     * </p>
     * 
     * @return The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements
     *         that make up a file system policy, see <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *         >Amazon EFS Resource-based policies</a>.
     */

    public String getFileSystemPolicy() {
        return this.fileSystemPolicy;
    }

    /**
     * <p>
     * The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements that make
     * up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >Amazon EFS Resource-based policies</a>.
     * </p>
     * 
     * @param fileSystemPolicy
     *        The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements
     *        that make up a file system policy, see <a href=
     *        "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *        >Amazon EFS Resource-based policies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EfsFileSystemConfiguration withFileSystemPolicy(String fileSystemPolicy) {
        setFileSystemPolicy(fileSystemPolicy);
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
        if (getFileSystemPolicy() != null)
            sb.append("FileSystemPolicy: ").append(getFileSystemPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EfsFileSystemConfiguration == false)
            return false;
        EfsFileSystemConfiguration other = (EfsFileSystemConfiguration) obj;
        if (other.getFileSystemPolicy() == null ^ this.getFileSystemPolicy() == null)
            return false;
        if (other.getFileSystemPolicy() != null && other.getFileSystemPolicy().equals(this.getFileSystemPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemPolicy() == null) ? 0 : getFileSystemPolicy().hashCode());
        return hashCode;
    }

    @Override
    public EfsFileSystemConfiguration clone() {
        try {
            return (EfsFileSystemConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.EfsFileSystemConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
