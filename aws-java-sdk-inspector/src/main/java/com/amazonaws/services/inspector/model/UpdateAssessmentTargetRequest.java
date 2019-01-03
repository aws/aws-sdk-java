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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/UpdateAssessmentTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssessmentTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the assessment target that you want to update.
     * </p>
     */
    private String assessmentTargetArn;
    /**
     * <p>
     * The name of the assessment target that you want to update.
     * </p>
     */
    private String assessmentTargetName;
    /**
     * <p>
     * The ARN of the resource group that is used to specify the new resource group to associate with the assessment
     * target.
     * </p>
     */
    private String resourceGroupArn;

    /**
     * <p>
     * The ARN of the assessment target that you want to update.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN of the assessment target that you want to update.
     */

    public void setAssessmentTargetArn(String assessmentTargetArn) {
        this.assessmentTargetArn = assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN of the assessment target that you want to update.
     * </p>
     * 
     * @return The ARN of the assessment target that you want to update.
     */

    public String getAssessmentTargetArn() {
        return this.assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN of the assessment target that you want to update.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN of the assessment target that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentTargetRequest withAssessmentTargetArn(String assessmentTargetArn) {
        setAssessmentTargetArn(assessmentTargetArn);
        return this;
    }

    /**
     * <p>
     * The name of the assessment target that you want to update.
     * </p>
     * 
     * @param assessmentTargetName
     *        The name of the assessment target that you want to update.
     */

    public void setAssessmentTargetName(String assessmentTargetName) {
        this.assessmentTargetName = assessmentTargetName;
    }

    /**
     * <p>
     * The name of the assessment target that you want to update.
     * </p>
     * 
     * @return The name of the assessment target that you want to update.
     */

    public String getAssessmentTargetName() {
        return this.assessmentTargetName;
    }

    /**
     * <p>
     * The name of the assessment target that you want to update.
     * </p>
     * 
     * @param assessmentTargetName
     *        The name of the assessment target that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentTargetRequest withAssessmentTargetName(String assessmentTargetName) {
        setAssessmentTargetName(assessmentTargetName);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource group that is used to specify the new resource group to associate with the assessment
     * target.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN of the resource group that is used to specify the new resource group to associate with the
     *        assessment target.
     */

    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group that is used to specify the new resource group to associate with the assessment
     * target.
     * </p>
     * 
     * @return The ARN of the resource group that is used to specify the new resource group to associate with the
     *         assessment target.
     */

    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group that is used to specify the new resource group to associate with the assessment
     * target.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN of the resource group that is used to specify the new resource group to associate with the
     *        assessment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentTargetRequest withResourceGroupArn(String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
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
        if (getAssessmentTargetArn() != null)
            sb.append("AssessmentTargetArn: ").append(getAssessmentTargetArn()).append(",");
        if (getAssessmentTargetName() != null)
            sb.append("AssessmentTargetName: ").append(getAssessmentTargetName()).append(",");
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: ").append(getResourceGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentTargetRequest == false)
            return false;
        UpdateAssessmentTargetRequest other = (UpdateAssessmentTargetRequest) obj;
        if (other.getAssessmentTargetArn() == null ^ this.getAssessmentTargetArn() == null)
            return false;
        if (other.getAssessmentTargetArn() != null && other.getAssessmentTargetArn().equals(this.getAssessmentTargetArn()) == false)
            return false;
        if (other.getAssessmentTargetName() == null ^ this.getAssessmentTargetName() == null)
            return false;
        if (other.getAssessmentTargetName() != null && other.getAssessmentTargetName().equals(this.getAssessmentTargetName()) == false)
            return false;
        if (other.getResourceGroupArn() == null ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null && other.getResourceGroupArn().equals(this.getResourceGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTargetArn() == null) ? 0 : getAssessmentTargetArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentTargetName() == null) ? 0 : getAssessmentTargetName().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentTargetRequest clone() {
        return (UpdateAssessmentTargetRequest) super.clone();
    }

}
