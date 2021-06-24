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
 * <p/>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EFS access point identifier to use.
     * </p>
     */
    private String accessPointId;
    /**
     * <p>
     * Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system.
     * </p>
     */
    private String iam;

    /**
     * <p>
     * The Amazon EFS access point identifier to use.
     * </p>
     * 
     * @param accessPointId
     *        The Amazon EFS access point identifier to use.
     */

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * The Amazon EFS access point identifier to use.
     * </p>
     * 
     * @return The Amazon EFS access point identifier to use.
     */

    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * <p>
     * The Amazon EFS access point identifier to use.
     * </p>
     * 
     * @param accessPointId
     *        The Amazon EFS access point identifier to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails withAccessPointId(String accessPointId) {
        setAccessPointId(accessPointId);
        return this;
    }

    /**
     * <p>
     * Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system.
     * </p>
     * 
     * @param iam
     *        Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     *        system.
     */

    public void setIam(String iam) {
        this.iam = iam;
    }

    /**
     * <p>
     * Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system.
     * </p>
     * 
     * @return Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS
     *         file system.
     */

    public String getIam() {
        return this.iam;
    }

    /**
     * <p>
     * Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system.
     * </p>
     * 
     * @param iam
     *        Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails withIam(String iam) {
        setIam(iam);
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
        if (getAccessPointId() != null)
            sb.append("AccessPointId: ").append(getAccessPointId()).append(",");
        if (getIam() != null)
            sb.append("Iam: ").append(getIam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails == false)
            return false;
        AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails other = (AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails) obj;
        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null && other.getAccessPointId().equals(this.getAccessPointId()) == false)
            return false;
        if (other.getIam() == null ^ this.getIam() == null)
            return false;
        if (other.getIam() != null && other.getIam().equals(this.getIam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        hashCode = prime * hashCode + ((getIam() == null) ? 0 : getIam().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails clone() {
        try {
            return (AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
