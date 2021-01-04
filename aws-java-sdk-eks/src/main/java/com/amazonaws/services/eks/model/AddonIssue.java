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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An issue related to an add-on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AddonIssue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonIssue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A code that describes the type of issue.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message that provides details about the issue and what might cause it.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The resource IDs of the issue.
     * </p>
     */
    private java.util.List<String> resourceIds;

    /**
     * <p>
     * A code that describes the type of issue.
     * </p>
     * 
     * @param code
     *        A code that describes the type of issue.
     * @see AddonIssueCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A code that describes the type of issue.
     * </p>
     * 
     * @return A code that describes the type of issue.
     * @see AddonIssueCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * A code that describes the type of issue.
     * </p>
     * 
     * @param code
     *        A code that describes the type of issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddonIssueCode
     */

    public AddonIssue withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A code that describes the type of issue.
     * </p>
     * 
     * @param code
     *        A code that describes the type of issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddonIssueCode
     */

    public AddonIssue withCode(AddonIssueCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A message that provides details about the issue and what might cause it.
     * </p>
     * 
     * @param message
     *        A message that provides details about the issue and what might cause it.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that provides details about the issue and what might cause it.
     * </p>
     * 
     * @return A message that provides details about the issue and what might cause it.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that provides details about the issue and what might cause it.
     * </p>
     * 
     * @param message
     *        A message that provides details about the issue and what might cause it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonIssue withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The resource IDs of the issue.
     * </p>
     * 
     * @return The resource IDs of the issue.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The resource IDs of the issue.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs of the issue.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * The resource IDs of the issue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs of the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonIssue withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource IDs of the issue.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs of the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonIssue withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonIssue == false)
            return false;
        AddonIssue other = (AddonIssue) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public AddonIssue clone() {
        try {
            return (AddonIssue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AddonIssueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
