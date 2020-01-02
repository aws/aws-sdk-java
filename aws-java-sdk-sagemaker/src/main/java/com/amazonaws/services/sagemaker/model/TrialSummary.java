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
 * A summary of the properties of a trial. To get the complete set of properties, call the <a>DescribeTrial</a> API and
 * provide the <code>TrialName</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     */
    private String trialArn;
    /**
     * <p>
     * The name of the trial.
     * </p>
     */
    private String trialName;
    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     */
    private String displayName;

    private TrialSource trialSource;
    /**
     * <p>
     * When the trial was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the trial was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     */

    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trial.
     */

    public String getTrialArn() {
        return this.trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialSummary withTrialArn(String trialArn) {
        setTrialArn(trialArn);
        return this;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @param trialName
     *        The name of the trial.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @return The name of the trial.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @param trialName
     *        The name of the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialSummary withTrialName(String trialName) {
        setTrialName(trialName);
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     *        displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * 
     * @return The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code>
     *         is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     *        displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * @param trialSource
     */

    public void setTrialSource(TrialSource trialSource) {
        this.trialSource = trialSource;
    }

    /**
     * @return
     */

    public TrialSource getTrialSource() {
        return this.trialSource;
    }

    /**
     * @param trialSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialSummary withTrialSource(TrialSource trialSource) {
        setTrialSource(trialSource);
        return this;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * 
     * @param creationTime
     *        When the trial was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * 
     * @return When the trial was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * 
     * @param creationTime
     *        When the trial was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the trial was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     * 
     * @return When the trial was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the trial was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getTrialArn() != null)
            sb.append("TrialArn: ").append(getTrialArn()).append(",");
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getTrialSource() != null)
            sb.append("TrialSource: ").append(getTrialSource()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialSummary == false)
            return false;
        TrialSummary other = (TrialSummary) obj;
        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getTrialSource() == null ^ this.getTrialSource() == null)
            return false;
        if (other.getTrialSource() != null && other.getTrialSource().equals(this.getTrialSource()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getTrialSource() == null) ? 0 : getTrialSource().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public TrialSummary clone() {
        try {
            return (TrialSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
