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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authorization configuration details for the Amazon EFS file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/EFSAuthorizationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EFSAuthorizationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified in the
     * <code>EFSVolumeConfiguration</code> must either be omitted or set to <code>/</code> which will enforce the path
     * set on the EFS access point. If an access point is used, transit encryption must be enabled in the
     * <code>EFSVolumeConfiguration</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Working with Amazon EFS Access Points</a>
     * in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     */
    private String accessPointId;
    /**
     * <p>
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints">Using
     * Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String iam;

    /**
     * <p>
     * The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified in the
     * <code>EFSVolumeConfiguration</code> must either be omitted or set to <code>/</code> which will enforce the path
     * set on the EFS access point. If an access point is used, transit encryption must be enabled in the
     * <code>EFSVolumeConfiguration</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Working with Amazon EFS Access Points</a>
     * in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @param accessPointId
     *        The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified
     *        in the <code>EFSVolumeConfiguration</code> must either be omitted or set to <code>/</code> which will
     *        enforce the path set on the EFS access point. If an access point is used, transit encryption must be
     *        enabled in the <code>EFSVolumeConfiguration</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Working with Amazon EFS Access
     *        Points</a> in the <i>Amazon Elastic File System User Guide</i>.
     */

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified in the
     * <code>EFSVolumeConfiguration</code> must either be omitted or set to <code>/</code> which will enforce the path
     * set on the EFS access point. If an access point is used, transit encryption must be enabled in the
     * <code>EFSVolumeConfiguration</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Working with Amazon EFS Access Points</a>
     * in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @return The Amazon EFS access point ID to use. If an access point is specified, the root directory value
     *         specified in the <code>EFSVolumeConfiguration</code> must either be omitted or set to <code>/</code>
     *         which will enforce the path set on the EFS access point. If an access point is used, transit encryption
     *         must be enabled in the <code>EFSVolumeConfiguration</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Working with Amazon EFS Access
     *         Points</a> in the <i>Amazon Elastic File System User Guide</i>.
     */

    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * <p>
     * The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified in the
     * <code>EFSVolumeConfiguration</code> must either be omitted or set to <code>/</code> which will enforce the path
     * set on the EFS access point. If an access point is used, transit encryption must be enabled in the
     * <code>EFSVolumeConfiguration</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Working with Amazon EFS Access Points</a>
     * in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @param accessPointId
     *        The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified
     *        in the <code>EFSVolumeConfiguration</code> must either be omitted or set to <code>/</code> which will
     *        enforce the path set on the EFS access point. If an access point is used, transit encryption must be
     *        enabled in the <code>EFSVolumeConfiguration</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html">Working with Amazon EFS Access
     *        Points</a> in the <i>Amazon Elastic File System User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EFSAuthorizationConfig withAccessPointId(String accessPointId) {
        setAccessPointId(accessPointId);
        return this;
    }

    /**
     * <p>
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints">Using
     * Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param iam
     *        Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon
     *        EFS file system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>
     *        . If this parameter is omitted, the default value of <code>DISABLED</code> is used. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints"
     *        >Using Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see EFSAuthorizationConfigIAM
     */

    public void setIam(String iam) {
        this.iam = iam;
    }

    /**
     * <p>
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints">Using
     * Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon
     *         EFS file system. If enabled, transit encryption must be enabled in the
     *         <code>EFSVolumeConfiguration</code>. If this parameter is omitted, the default value of
     *         <code>DISABLED</code> is used. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints"
     *         >Using Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see EFSAuthorizationConfigIAM
     */

    public String getIam() {
        return this.iam;
    }

    /**
     * <p>
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints">Using
     * Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param iam
     *        Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon
     *        EFS file system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>
     *        . If this parameter is omitted, the default value of <code>DISABLED</code> is used. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints"
     *        >Using Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EFSAuthorizationConfigIAM
     */

    public EFSAuthorizationConfig withIam(String iam) {
        setIam(iam);
        return this;
    }

    /**
     * <p>
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file
     * system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints">Using
     * Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param iam
     *        Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon
     *        EFS file system. If enabled, transit encryption must be enabled in the <code>EFSVolumeConfiguration</code>
     *        . If this parameter is omitted, the default value of <code>DISABLED</code> is used. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints"
     *        >Using Amazon EFS Access Points</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EFSAuthorizationConfigIAM
     */

    public EFSAuthorizationConfig withIam(EFSAuthorizationConfigIAM iam) {
        this.iam = iam.toString();
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

        if (obj instanceof EFSAuthorizationConfig == false)
            return false;
        EFSAuthorizationConfig other = (EFSAuthorizationConfig) obj;
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
    public EFSAuthorizationConfig clone() {
        try {
            return (EFSAuthorizationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.EFSAuthorizationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
