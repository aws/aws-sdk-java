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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the source of a CloudFormation stack record (i.e., the export snapshot record).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloudFormationStackRecordSourceInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFormationStackRecordSourceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The name of the record.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @see CloudFormationStackRecordSourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @see CloudFormationStackRecordSourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudFormationStackRecordSourceType
     */

    public CloudFormationStackRecordSourceInfo withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudFormationStackRecordSourceType
     */

    public CloudFormationStackRecordSourceInfo withResourceType(CloudFormationStackRecordSourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the record.
     * </p>
     * 
     * @param name
     *        The name of the record.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the record.
     * </p>
     * 
     * @return The name of the record.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the record.
     * </p>
     * 
     * @param name
     *        The name of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationStackRecordSourceInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the export snapshot record.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the export snapshot record.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the export snapshot record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationStackRecordSourceInfo withArn(String arn) {
        setArn(arn);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationStackRecordSourceInfo == false)
            return false;
        CloudFormationStackRecordSourceInfo other = (CloudFormationStackRecordSourceInfo) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public CloudFormationStackRecordSourceInfo clone() {
        try {
            return (CloudFormationStackRecordSourceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.CloudFormationStackRecordSourceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
