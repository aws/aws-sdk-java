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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateComponentVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateComponentVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The version of the component.
     * </p>
     */
    private String componentVersion;
    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The status of the component version in AWS IoT Greengrass V2. This status is different from the status of the
     * component on a core device.
     * </p>
     */
    private CloudComponentStatus status;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         component version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionResult withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     */

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @return The version of the component.
     */

    public String getComponentVersion() {
        return this.componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionResult withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
        return this;
    }

    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the component was created, expressed in ISO 8601 format.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the component was created, expressed in ISO 8601 format.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The time at which the component was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the component was created, expressed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the component version in AWS IoT Greengrass V2. This status is different from the status of the
     * component on a core device.
     * </p>
     * 
     * @param status
     *        The status of the component version in AWS IoT Greengrass V2. This status is different from the status of
     *        the component on a core device.
     */

    public void setStatus(CloudComponentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the component version in AWS IoT Greengrass V2. This status is different from the status of the
     * component on a core device.
     * </p>
     * 
     * @return The status of the component version in AWS IoT Greengrass V2. This status is different from the status of
     *         the component on a core device.
     */

    public CloudComponentStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the component version in AWS IoT Greengrass V2. This status is different from the status of the
     * component on a core device.
     * </p>
     * 
     * @param status
     *        The status of the component version in AWS IoT Greengrass V2. This status is different from the status of
     *        the component on a core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentVersionResult withStatus(CloudComponentStatus status) {
        setStatus(status);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateComponentVersionResult == false)
            return false;
        CreateComponentVersionResult other = (CreateComponentVersionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateComponentVersionResult clone() {
        try {
            return (CreateComponentVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
