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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHumanTaskUi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHumanTaskUiResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface (worker task template).
     * </p>
     */
    private String humanTaskUiArn;
    /**
     * <p>
     * The name of the human task user interface (worker task template).
     * </p>
     */
    private String humanTaskUiName;
    /**
     * <p>
     * The status of the human task user interface (worker task template). Valid values are listed below.
     * </p>
     */
    private String humanTaskUiStatus;
    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UiTemplateInfo uiTemplate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface (worker task template).
     * </p>
     * 
     * @param humanTaskUiArn
     *        The Amazon Resource Name (ARN) of the human task user interface (worker task template).
     */

    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface (worker task template).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the human task user interface (worker task template).
     */

    public String getHumanTaskUiArn() {
        return this.humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface (worker task template).
     * </p>
     * 
     * @param humanTaskUiArn
     *        The Amazon Resource Name (ARN) of the human task user interface (worker task template).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanTaskUiResult withHumanTaskUiArn(String humanTaskUiArn) {
        setHumanTaskUiArn(humanTaskUiArn);
        return this;
    }

    /**
     * <p>
     * The name of the human task user interface (worker task template).
     * </p>
     * 
     * @param humanTaskUiName
     *        The name of the human task user interface (worker task template).
     */

    public void setHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface (worker task template).
     * </p>
     * 
     * @return The name of the human task user interface (worker task template).
     */

    public String getHumanTaskUiName() {
        return this.humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface (worker task template).
     * </p>
     * 
     * @param humanTaskUiName
     *        The name of the human task user interface (worker task template).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanTaskUiResult withHumanTaskUiName(String humanTaskUiName) {
        setHumanTaskUiName(humanTaskUiName);
        return this;
    }

    /**
     * <p>
     * The status of the human task user interface (worker task template). Valid values are listed below.
     * </p>
     * 
     * @param humanTaskUiStatus
     *        The status of the human task user interface (worker task template). Valid values are listed below.
     * @see HumanTaskUiStatus
     */

    public void setHumanTaskUiStatus(String humanTaskUiStatus) {
        this.humanTaskUiStatus = humanTaskUiStatus;
    }

    /**
     * <p>
     * The status of the human task user interface (worker task template). Valid values are listed below.
     * </p>
     * 
     * @return The status of the human task user interface (worker task template). Valid values are listed below.
     * @see HumanTaskUiStatus
     */

    public String getHumanTaskUiStatus() {
        return this.humanTaskUiStatus;
    }

    /**
     * <p>
     * The status of the human task user interface (worker task template). Valid values are listed below.
     * </p>
     * 
     * @param humanTaskUiStatus
     *        The status of the human task user interface (worker task template). Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HumanTaskUiStatus
     */

    public DescribeHumanTaskUiResult withHumanTaskUiStatus(String humanTaskUiStatus) {
        setHumanTaskUiStatus(humanTaskUiStatus);
        return this;
    }

    /**
     * <p>
     * The status of the human task user interface (worker task template). Valid values are listed below.
     * </p>
     * 
     * @param humanTaskUiStatus
     *        The status of the human task user interface (worker task template). Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HumanTaskUiStatus
     */

    public DescribeHumanTaskUiResult withHumanTaskUiStatus(HumanTaskUiStatus humanTaskUiStatus) {
        this.humanTaskUiStatus = humanTaskUiStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the human task user interface was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     * 
     * @return The timestamp when the human task user interface was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the human task user interface was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanTaskUiResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param uiTemplate
     */

    public void setUiTemplate(UiTemplateInfo uiTemplate) {
        this.uiTemplate = uiTemplate;
    }

    /**
     * @return
     */

    public UiTemplateInfo getUiTemplate() {
        return this.uiTemplate;
    }

    /**
     * @param uiTemplate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanTaskUiResult withUiTemplate(UiTemplateInfo uiTemplate) {
        setUiTemplate(uiTemplate);
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
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: ").append(getHumanTaskUiArn()).append(",");
        if (getHumanTaskUiName() != null)
            sb.append("HumanTaskUiName: ").append(getHumanTaskUiName()).append(",");
        if (getHumanTaskUiStatus() != null)
            sb.append("HumanTaskUiStatus: ").append(getHumanTaskUiStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getUiTemplate() != null)
            sb.append("UiTemplate: ").append(getUiTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHumanTaskUiResult == false)
            return false;
        DescribeHumanTaskUiResult other = (DescribeHumanTaskUiResult) obj;
        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        if (other.getHumanTaskUiName() == null ^ this.getHumanTaskUiName() == null)
            return false;
        if (other.getHumanTaskUiName() != null && other.getHumanTaskUiName().equals(this.getHumanTaskUiName()) == false)
            return false;
        if (other.getHumanTaskUiStatus() == null ^ this.getHumanTaskUiStatus() == null)
            return false;
        if (other.getHumanTaskUiStatus() != null && other.getHumanTaskUiStatus().equals(this.getHumanTaskUiStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getUiTemplate() == null ^ this.getUiTemplate() == null)
            return false;
        if (other.getUiTemplate() != null && other.getUiTemplate().equals(this.getUiTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        hashCode = prime * hashCode + ((getHumanTaskUiName() == null) ? 0 : getHumanTaskUiName().hashCode());
        hashCode = prime * hashCode + ((getHumanTaskUiStatus() == null) ? 0 : getHumanTaskUiStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getUiTemplate() == null) ? 0 : getUiTemplate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHumanTaskUiResult clone() {
        try {
            return (DescribeHumanTaskUiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
