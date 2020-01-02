/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A short summary of a trial component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponentSimpleSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentSimpleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the trial component.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     */
    private String trialComponentArn;

    private TrialComponentSource trialComponentSource;
    /**
     * <p>
     * When the component was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @return The name of the trial component.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSimpleSummary withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The Amazon Resource Name (ARN) of the trial component.
     */

    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trial component.
     */

    public String getTrialComponentArn() {
        return this.trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The Amazon Resource Name (ARN) of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSimpleSummary withTrialComponentArn(String trialComponentArn) {
        setTrialComponentArn(trialComponentArn);
        return this;
    }

    /**
     * @param trialComponentSource
     */

    public void setTrialComponentSource(TrialComponentSource trialComponentSource) {
        this.trialComponentSource = trialComponentSource;
    }

    /**
     * @return
     */

    public TrialComponentSource getTrialComponentSource() {
        return this.trialComponentSource;
    }

    /**
     * @param trialComponentSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSimpleSummary withTrialComponentSource(TrialComponentSource trialComponentSource) {
        setTrialComponentSource(trialComponentSource);
        return this;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @return When the component was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSimpleSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSimpleSummary withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: ").append(getTrialComponentName()).append(",");
        if (getTrialComponentArn() != null)
            sb.append("TrialComponentArn: ").append(getTrialComponentArn()).append(",");
        if (getTrialComponentSource() != null)
            sb.append("TrialComponentSource: ").append(getTrialComponentSource()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentSimpleSummary == false)
            return false;
        TrialComponentSimpleSummary other = (TrialComponentSimpleSummary) obj;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getTrialComponentArn() == null ^ this.getTrialComponentArn() == null)
            return false;
        if (other.getTrialComponentArn() != null && other.getTrialComponentArn().equals(this.getTrialComponentArn()) == false)
            return false;
        if (other.getTrialComponentSource() == null ^ this.getTrialComponentSource() == null)
            return false;
        if (other.getTrialComponentSource() != null && other.getTrialComponentSource().equals(this.getTrialComponentSource()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentArn() == null) ? 0 : getTrialComponentArn().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentSource() == null) ? 0 : getTrialComponentSource().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponentSimpleSummary clone() {
        try {
            return (TrialComponentSimpleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentSimpleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
