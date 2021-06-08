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
 * The health of the add-on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AddonHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the add-on's health issues.
     * </p>
     */
    private java.util.List<AddonIssue> issues;

    /**
     * <p>
     * An object that represents the add-on's health issues.
     * </p>
     * 
     * @return An object that represents the add-on's health issues.
     */

    public java.util.List<AddonIssue> getIssues() {
        return issues;
    }

    /**
     * <p>
     * An object that represents the add-on's health issues.
     * </p>
     * 
     * @param issues
     *        An object that represents the add-on's health issues.
     */

    public void setIssues(java.util.Collection<AddonIssue> issues) {
        if (issues == null) {
            this.issues = null;
            return;
        }

        this.issues = new java.util.ArrayList<AddonIssue>(issues);
    }

    /**
     * <p>
     * An object that represents the add-on's health issues.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssues(java.util.Collection)} or {@link #withIssues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param issues
     *        An object that represents the add-on's health issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonHealth withIssues(AddonIssue... issues) {
        if (this.issues == null) {
            setIssues(new java.util.ArrayList<AddonIssue>(issues.length));
        }
        for (AddonIssue ele : issues) {
            this.issues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents the add-on's health issues.
     * </p>
     * 
     * @param issues
     *        An object that represents the add-on's health issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonHealth withIssues(java.util.Collection<AddonIssue> issues) {
        setIssues(issues);
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
        if (getIssues() != null)
            sb.append("Issues: ").append(getIssues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonHealth == false)
            return false;
        AddonHealth other = (AddonHealth) obj;
        if (other.getIssues() == null ^ this.getIssues() == null)
            return false;
        if (other.getIssues() != null && other.getIssues().equals(this.getIssues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssues() == null) ? 0 : getIssues().hashCode());
        return hashCode;
    }

    @Override
    public AddonHealth clone() {
        try {
            return (AddonHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AddonHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
