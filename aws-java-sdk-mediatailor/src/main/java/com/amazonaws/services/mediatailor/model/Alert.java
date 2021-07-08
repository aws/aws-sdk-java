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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Alert configuration parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/Alert" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alert implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code for the alert. For example, NOT_PROCESSED.
     * </p>
     */
    private String alertCode;
    /**
     * <p>
     * If an alert is generated for a resource, an explanation of the reason for the alert.
     * </p>
     */
    private String alertMessage;
    /**
     * <p>
     * The timestamp when the alert was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) related to this alert.
     * </p>
     */
    private java.util.List<String> relatedResourceArns;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The code for the alert. For example, NOT_PROCESSED.
     * </p>
     * 
     * @param alertCode
     *        The code for the alert. For example, NOT_PROCESSED.
     */

    public void setAlertCode(String alertCode) {
        this.alertCode = alertCode;
    }

    /**
     * <p>
     * The code for the alert. For example, NOT_PROCESSED.
     * </p>
     * 
     * @return The code for the alert. For example, NOT_PROCESSED.
     */

    public String getAlertCode() {
        return this.alertCode;
    }

    /**
     * <p>
     * The code for the alert. For example, NOT_PROCESSED.
     * </p>
     * 
     * @param alertCode
     *        The code for the alert. For example, NOT_PROCESSED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alert withAlertCode(String alertCode) {
        setAlertCode(alertCode);
        return this;
    }

    /**
     * <p>
     * If an alert is generated for a resource, an explanation of the reason for the alert.
     * </p>
     * 
     * @param alertMessage
     *        If an alert is generated for a resource, an explanation of the reason for the alert.
     */

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    /**
     * <p>
     * If an alert is generated for a resource, an explanation of the reason for the alert.
     * </p>
     * 
     * @return If an alert is generated for a resource, an explanation of the reason for the alert.
     */

    public String getAlertMessage() {
        return this.alertMessage;
    }

    /**
     * <p>
     * If an alert is generated for a resource, an explanation of the reason for the alert.
     * </p>
     * 
     * @param alertMessage
     *        If an alert is generated for a resource, an explanation of the reason for the alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alert withAlertMessage(String alertMessage) {
        setAlertMessage(alertMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp when the alert was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the alert was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the alert was last modified.
     * </p>
     * 
     * @return The timestamp when the alert was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the alert was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the alert was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alert withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) related to this alert.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) related to this alert.
     */

    public java.util.List<String> getRelatedResourceArns() {
        return relatedResourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) related to this alert.
     * </p>
     * 
     * @param relatedResourceArns
     *        The Amazon Resource Names (ARNs) related to this alert.
     */

    public void setRelatedResourceArns(java.util.Collection<String> relatedResourceArns) {
        if (relatedResourceArns == null) {
            this.relatedResourceArns = null;
            return;
        }

        this.relatedResourceArns = new java.util.ArrayList<String>(relatedResourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) related to this alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedResourceArns(java.util.Collection)} or {@link #withRelatedResourceArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param relatedResourceArns
     *        The Amazon Resource Names (ARNs) related to this alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alert withRelatedResourceArns(String... relatedResourceArns) {
        if (this.relatedResourceArns == null) {
            setRelatedResourceArns(new java.util.ArrayList<String>(relatedResourceArns.length));
        }
        for (String ele : relatedResourceArns) {
            this.relatedResourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) related to this alert.
     * </p>
     * 
     * @param relatedResourceArns
     *        The Amazon Resource Names (ARNs) related to this alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alert withRelatedResourceArns(java.util.Collection<String> relatedResourceArns) {
        setRelatedResourceArns(relatedResourceArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alert withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getAlertCode() != null)
            sb.append("AlertCode: ").append(getAlertCode()).append(",");
        if (getAlertMessage() != null)
            sb.append("AlertMessage: ").append(getAlertMessage()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getRelatedResourceArns() != null)
            sb.append("RelatedResourceArns: ").append(getRelatedResourceArns()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alert == false)
            return false;
        Alert other = (Alert) obj;
        if (other.getAlertCode() == null ^ this.getAlertCode() == null)
            return false;
        if (other.getAlertCode() != null && other.getAlertCode().equals(this.getAlertCode()) == false)
            return false;
        if (other.getAlertMessage() == null ^ this.getAlertMessage() == null)
            return false;
        if (other.getAlertMessage() != null && other.getAlertMessage().equals(this.getAlertMessage()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getRelatedResourceArns() == null ^ this.getRelatedResourceArns() == null)
            return false;
        if (other.getRelatedResourceArns() != null && other.getRelatedResourceArns().equals(this.getRelatedResourceArns()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlertCode() == null) ? 0 : getAlertCode().hashCode());
        hashCode = prime * hashCode + ((getAlertMessage() == null) ? 0 : getAlertMessage().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getRelatedResourceArns() == null) ? 0 : getRelatedResourceArns().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public Alert clone() {
        try {
            return (Alert) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AlertMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
