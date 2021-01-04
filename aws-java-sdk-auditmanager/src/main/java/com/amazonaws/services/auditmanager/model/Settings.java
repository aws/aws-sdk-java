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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings object that holds all supported AWS Audit Manager settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether AWS Organizations is enabled.
     * </p>
     */
    private Boolean isAwsOrgEnabled;
    /**
     * <p>
     * The designated Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     */
    private String snsTopic;
    /**
     * <p>
     * The default storage destination for assessment reports.
     * </p>
     */
    private AssessmentReportsDestination defaultAssessmentReportsDestination;
    /**
     * <p>
     * The designated default audit owners.
     * </p>
     */
    private java.util.List<Role> defaultProcessOwners;
    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     */
    private String kmsKey;

    /**
     * <p>
     * Specifies whether AWS Organizations is enabled.
     * </p>
     * 
     * @param isAwsOrgEnabled
     *        Specifies whether AWS Organizations is enabled.
     */

    public void setIsAwsOrgEnabled(Boolean isAwsOrgEnabled) {
        this.isAwsOrgEnabled = isAwsOrgEnabled;
    }

    /**
     * <p>
     * Specifies whether AWS Organizations is enabled.
     * </p>
     * 
     * @return Specifies whether AWS Organizations is enabled.
     */

    public Boolean getIsAwsOrgEnabled() {
        return this.isAwsOrgEnabled;
    }

    /**
     * <p>
     * Specifies whether AWS Organizations is enabled.
     * </p>
     * 
     * @param isAwsOrgEnabled
     *        Specifies whether AWS Organizations is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withIsAwsOrgEnabled(Boolean isAwsOrgEnabled) {
        setIsAwsOrgEnabled(isAwsOrgEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Organizations is enabled.
     * </p>
     * 
     * @return Specifies whether AWS Organizations is enabled.
     */

    public Boolean isAwsOrgEnabled() {
        return this.isAwsOrgEnabled;
    }

    /**
     * <p>
     * The designated Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     * 
     * @param snsTopic
     *        The designated Amazon Simple Notification Service (Amazon SNS) topic.
     */

    public void setSnsTopic(String snsTopic) {
        this.snsTopic = snsTopic;
    }

    /**
     * <p>
     * The designated Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     * 
     * @return The designated Amazon Simple Notification Service (Amazon SNS) topic.
     */

    public String getSnsTopic() {
        return this.snsTopic;
    }

    /**
     * <p>
     * The designated Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     * 
     * @param snsTopic
     *        The designated Amazon Simple Notification Service (Amazon SNS) topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withSnsTopic(String snsTopic) {
        setSnsTopic(snsTopic);
        return this;
    }

    /**
     * <p>
     * The default storage destination for assessment reports.
     * </p>
     * 
     * @param defaultAssessmentReportsDestination
     *        The default storage destination for assessment reports.
     */

    public void setDefaultAssessmentReportsDestination(AssessmentReportsDestination defaultAssessmentReportsDestination) {
        this.defaultAssessmentReportsDestination = defaultAssessmentReportsDestination;
    }

    /**
     * <p>
     * The default storage destination for assessment reports.
     * </p>
     * 
     * @return The default storage destination for assessment reports.
     */

    public AssessmentReportsDestination getDefaultAssessmentReportsDestination() {
        return this.defaultAssessmentReportsDestination;
    }

    /**
     * <p>
     * The default storage destination for assessment reports.
     * </p>
     * 
     * @param defaultAssessmentReportsDestination
     *        The default storage destination for assessment reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withDefaultAssessmentReportsDestination(AssessmentReportsDestination defaultAssessmentReportsDestination) {
        setDefaultAssessmentReportsDestination(defaultAssessmentReportsDestination);
        return this;
    }

    /**
     * <p>
     * The designated default audit owners.
     * </p>
     * 
     * @return The designated default audit owners.
     */

    public java.util.List<Role> getDefaultProcessOwners() {
        return defaultProcessOwners;
    }

    /**
     * <p>
     * The designated default audit owners.
     * </p>
     * 
     * @param defaultProcessOwners
     *        The designated default audit owners.
     */

    public void setDefaultProcessOwners(java.util.Collection<Role> defaultProcessOwners) {
        if (defaultProcessOwners == null) {
            this.defaultProcessOwners = null;
            return;
        }

        this.defaultProcessOwners = new java.util.ArrayList<Role>(defaultProcessOwners);
    }

    /**
     * <p>
     * The designated default audit owners.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultProcessOwners(java.util.Collection)} or {@link #withDefaultProcessOwners(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param defaultProcessOwners
     *        The designated default audit owners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withDefaultProcessOwners(Role... defaultProcessOwners) {
        if (this.defaultProcessOwners == null) {
            setDefaultProcessOwners(new java.util.ArrayList<Role>(defaultProcessOwners.length));
        }
        for (Role ele : defaultProcessOwners) {
            this.defaultProcessOwners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The designated default audit owners.
     * </p>
     * 
     * @param defaultProcessOwners
     *        The designated default audit owners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withDefaultProcessOwners(java.util.Collection<Role> defaultProcessOwners) {
        setDefaultProcessOwners(defaultProcessOwners);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     * 
     * @param kmsKey
     *        The AWS KMS key details.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     * 
     * @return The AWS KMS key details.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     * 
     * @param kmsKey
     *        The AWS KMS key details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
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
        if (getIsAwsOrgEnabled() != null)
            sb.append("IsAwsOrgEnabled: ").append(getIsAwsOrgEnabled()).append(",");
        if (getSnsTopic() != null)
            sb.append("SnsTopic: ").append(getSnsTopic()).append(",");
        if (getDefaultAssessmentReportsDestination() != null)
            sb.append("DefaultAssessmentReportsDestination: ").append(getDefaultAssessmentReportsDestination()).append(",");
        if (getDefaultProcessOwners() != null)
            sb.append("DefaultProcessOwners: ").append(getDefaultProcessOwners()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Settings == false)
            return false;
        Settings other = (Settings) obj;
        if (other.getIsAwsOrgEnabled() == null ^ this.getIsAwsOrgEnabled() == null)
            return false;
        if (other.getIsAwsOrgEnabled() != null && other.getIsAwsOrgEnabled().equals(this.getIsAwsOrgEnabled()) == false)
            return false;
        if (other.getSnsTopic() == null ^ this.getSnsTopic() == null)
            return false;
        if (other.getSnsTopic() != null && other.getSnsTopic().equals(this.getSnsTopic()) == false)
            return false;
        if (other.getDefaultAssessmentReportsDestination() == null ^ this.getDefaultAssessmentReportsDestination() == null)
            return false;
        if (other.getDefaultAssessmentReportsDestination() != null
                && other.getDefaultAssessmentReportsDestination().equals(this.getDefaultAssessmentReportsDestination()) == false)
            return false;
        if (other.getDefaultProcessOwners() == null ^ this.getDefaultProcessOwners() == null)
            return false;
        if (other.getDefaultProcessOwners() != null && other.getDefaultProcessOwners().equals(this.getDefaultProcessOwners()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsAwsOrgEnabled() == null) ? 0 : getIsAwsOrgEnabled().hashCode());
        hashCode = prime * hashCode + ((getSnsTopic() == null) ? 0 : getSnsTopic().hashCode());
        hashCode = prime * hashCode + ((getDefaultAssessmentReportsDestination() == null) ? 0 : getDefaultAssessmentReportsDestination().hashCode());
        hashCode = prime * hashCode + ((getDefaultProcessOwners() == null) ? 0 : getDefaultProcessOwners().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        return hashCode;
    }

    @Override
    public Settings clone() {
        try {
            return (Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
