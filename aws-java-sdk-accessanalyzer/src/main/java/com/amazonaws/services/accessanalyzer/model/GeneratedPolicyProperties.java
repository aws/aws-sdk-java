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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the generated policy details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GeneratedPolicyProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneratedPolicyProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists details about the <code>Trail</code> used to generated policy.
     * </p>
     */
    private CloudTrailProperties cloudTrailProperties;
    /**
     * <p>
     * This value is set to <code>true</code> if the generated policy contains all possible actions for a service that
     * Access Analyzer identified from the CloudTrail trail that you specified, and <code>false</code> otherwise.
     * </p>
     */
    private Boolean isComplete;
    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * Lists details about the <code>Trail</code> used to generated policy.
     * </p>
     * 
     * @param cloudTrailProperties
     *        Lists details about the <code>Trail</code> used to generated policy.
     */

    public void setCloudTrailProperties(CloudTrailProperties cloudTrailProperties) {
        this.cloudTrailProperties = cloudTrailProperties;
    }

    /**
     * <p>
     * Lists details about the <code>Trail</code> used to generated policy.
     * </p>
     * 
     * @return Lists details about the <code>Trail</code> used to generated policy.
     */

    public CloudTrailProperties getCloudTrailProperties() {
        return this.cloudTrailProperties;
    }

    /**
     * <p>
     * Lists details about the <code>Trail</code> used to generated policy.
     * </p>
     * 
     * @param cloudTrailProperties
     *        Lists details about the <code>Trail</code> used to generated policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedPolicyProperties withCloudTrailProperties(CloudTrailProperties cloudTrailProperties) {
        setCloudTrailProperties(cloudTrailProperties);
        return this;
    }

    /**
     * <p>
     * This value is set to <code>true</code> if the generated policy contains all possible actions for a service that
     * Access Analyzer identified from the CloudTrail trail that you specified, and <code>false</code> otherwise.
     * </p>
     * 
     * @param isComplete
     *        This value is set to <code>true</code> if the generated policy contains all possible actions for a service
     *        that Access Analyzer identified from the CloudTrail trail that you specified, and <code>false</code>
     *        otherwise.
     */

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    /**
     * <p>
     * This value is set to <code>true</code> if the generated policy contains all possible actions for a service that
     * Access Analyzer identified from the CloudTrail trail that you specified, and <code>false</code> otherwise.
     * </p>
     * 
     * @return This value is set to <code>true</code> if the generated policy contains all possible actions for a
     *         service that Access Analyzer identified from the CloudTrail trail that you specified, and
     *         <code>false</code> otherwise.
     */

    public Boolean getIsComplete() {
        return this.isComplete;
    }

    /**
     * <p>
     * This value is set to <code>true</code> if the generated policy contains all possible actions for a service that
     * Access Analyzer identified from the CloudTrail trail that you specified, and <code>false</code> otherwise.
     * </p>
     * 
     * @param isComplete
     *        This value is set to <code>true</code> if the generated policy contains all possible actions for a service
     *        that Access Analyzer identified from the CloudTrail trail that you specified, and <code>false</code>
     *        otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedPolicyProperties withIsComplete(Boolean isComplete) {
        setIsComplete(isComplete);
        return this;
    }

    /**
     * <p>
     * This value is set to <code>true</code> if the generated policy contains all possible actions for a service that
     * Access Analyzer identified from the CloudTrail trail that you specified, and <code>false</code> otherwise.
     * </p>
     * 
     * @return This value is set to <code>true</code> if the generated policy contains all possible actions for a
     *         service that Access Analyzer identified from the CloudTrail trail that you specified, and
     *         <code>false</code> otherwise.
     */

    public Boolean isComplete() {
        return this.isComplete;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @return The ARN of the IAM entity (user or role) for which you are generating a policy.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedPolicyProperties withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
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
        if (getCloudTrailProperties() != null)
            sb.append("CloudTrailProperties: ").append(getCloudTrailProperties()).append(",");
        if (getIsComplete() != null)
            sb.append("IsComplete: ").append(getIsComplete()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneratedPolicyProperties == false)
            return false;
        GeneratedPolicyProperties other = (GeneratedPolicyProperties) obj;
        if (other.getCloudTrailProperties() == null ^ this.getCloudTrailProperties() == null)
            return false;
        if (other.getCloudTrailProperties() != null && other.getCloudTrailProperties().equals(this.getCloudTrailProperties()) == false)
            return false;
        if (other.getIsComplete() == null ^ this.getIsComplete() == null)
            return false;
        if (other.getIsComplete() != null && other.getIsComplete().equals(this.getIsComplete()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudTrailProperties() == null) ? 0 : getCloudTrailProperties().hashCode());
        hashCode = prime * hashCode + ((getIsComplete() == null) ? 0 : getIsComplete().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public GeneratedPolicyProperties clone() {
        try {
            return (GeneratedPolicyProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.GeneratedPolicyPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
