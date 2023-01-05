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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the properties for creating an Amazon Elastic Compute Cloud (Amazon EC2) launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A name for the launch template.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * An ID for the launch template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The information to include in the launch template.
     * </p>
     */
    private AwsEc2LaunchTemplateDataDetails launchTemplateData;
    /**
     * <p>
     * The default version of the launch template.
     * </p>
     */
    private Long defaultVersionNumber;
    /**
     * <p>
     * The latest version of the launch template.
     * </p>
     */
    private Long latestVersionNumber;

    /**
     * <p>
     * A name for the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        A name for the launch template.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * A name for the launch template.
     * </p>
     * 
     * @return A name for the launch template.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * A name for the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        A name for the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDetails withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * An ID for the launch template.
     * </p>
     * 
     * @param id
     *        An ID for the launch template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An ID for the launch template.
     * </p>
     * 
     * @return An ID for the launch template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An ID for the launch template.
     * </p>
     * 
     * @param id
     *        An ID for the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The information to include in the launch template.
     * </p>
     * 
     * @param launchTemplateData
     *        The information to include in the launch template.
     */

    public void setLaunchTemplateData(AwsEc2LaunchTemplateDataDetails launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    /**
     * <p>
     * The information to include in the launch template.
     * </p>
     * 
     * @return The information to include in the launch template.
     */

    public AwsEc2LaunchTemplateDataDetails getLaunchTemplateData() {
        return this.launchTemplateData;
    }

    /**
     * <p>
     * The information to include in the launch template.
     * </p>
     * 
     * @param launchTemplateData
     *        The information to include in the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDetails withLaunchTemplateData(AwsEc2LaunchTemplateDataDetails launchTemplateData) {
        setLaunchTemplateData(launchTemplateData);
        return this;
    }

    /**
     * <p>
     * The default version of the launch template.
     * </p>
     * 
     * @param defaultVersionNumber
     *        The default version of the launch template.
     */

    public void setDefaultVersionNumber(Long defaultVersionNumber) {
        this.defaultVersionNumber = defaultVersionNumber;
    }

    /**
     * <p>
     * The default version of the launch template.
     * </p>
     * 
     * @return The default version of the launch template.
     */

    public Long getDefaultVersionNumber() {
        return this.defaultVersionNumber;
    }

    /**
     * <p>
     * The default version of the launch template.
     * </p>
     * 
     * @param defaultVersionNumber
     *        The default version of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDetails withDefaultVersionNumber(Long defaultVersionNumber) {
        setDefaultVersionNumber(defaultVersionNumber);
        return this;
    }

    /**
     * <p>
     * The latest version of the launch template.
     * </p>
     * 
     * @param latestVersionNumber
     *        The latest version of the launch template.
     */

    public void setLatestVersionNumber(Long latestVersionNumber) {
        this.latestVersionNumber = latestVersionNumber;
    }

    /**
     * <p>
     * The latest version of the launch template.
     * </p>
     * 
     * @return The latest version of the launch template.
     */

    public Long getLatestVersionNumber() {
        return this.latestVersionNumber;
    }

    /**
     * <p>
     * The latest version of the launch template.
     * </p>
     * 
     * @param latestVersionNumber
     *        The latest version of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDetails withLatestVersionNumber(Long latestVersionNumber) {
        setLatestVersionNumber(latestVersionNumber);
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
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLaunchTemplateData() != null)
            sb.append("LaunchTemplateData: ").append(getLaunchTemplateData()).append(",");
        if (getDefaultVersionNumber() != null)
            sb.append("DefaultVersionNumber: ").append(getDefaultVersionNumber()).append(",");
        if (getLatestVersionNumber() != null)
            sb.append("LatestVersionNumber: ").append(getLatestVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDetails == false)
            return false;
        AwsEc2LaunchTemplateDetails other = (AwsEc2LaunchTemplateDetails) obj;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLaunchTemplateData() == null ^ this.getLaunchTemplateData() == null)
            return false;
        if (other.getLaunchTemplateData() != null && other.getLaunchTemplateData().equals(this.getLaunchTemplateData()) == false)
            return false;
        if (other.getDefaultVersionNumber() == null ^ this.getDefaultVersionNumber() == null)
            return false;
        if (other.getDefaultVersionNumber() != null && other.getDefaultVersionNumber().equals(this.getDefaultVersionNumber()) == false)
            return false;
        if (other.getLatestVersionNumber() == null ^ this.getLatestVersionNumber() == null)
            return false;
        if (other.getLatestVersionNumber() != null && other.getLatestVersionNumber().equals(this.getLatestVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateData() == null) ? 0 : getLaunchTemplateData().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionNumber() == null) ? 0 : getDefaultVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionNumber() == null) ? 0 : getLatestVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
