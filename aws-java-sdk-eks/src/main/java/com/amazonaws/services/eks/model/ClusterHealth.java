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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the health of your local Amazon EKS cluster on an Amazon Web Services Outpost. You can't use
 * this API with an Amazon EKS cluster on the Amazon Web Services cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ClusterHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services Outpost.
     * </p>
     */
    private java.util.List<ClusterIssue> issues;

    /**
     * <p>
     * An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services Outpost.
     * </p>
     * 
     * @return An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services
     *         Outpost.
     */

    public java.util.List<ClusterIssue> getIssues() {
        return issues;
    }

    /**
     * <p>
     * An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services Outpost.
     * </p>
     * 
     * @param issues
     *        An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services
     *        Outpost.
     */

    public void setIssues(java.util.Collection<ClusterIssue> issues) {
        if (issues == null) {
            this.issues = null;
            return;
        }

        this.issues = new java.util.ArrayList<ClusterIssue>(issues);
    }

    /**
     * <p>
     * An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services Outpost.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssues(java.util.Collection)} or {@link #withIssues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param issues
     *        An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services
     *        Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterHealth withIssues(ClusterIssue... issues) {
        if (this.issues == null) {
            setIssues(new java.util.ArrayList<ClusterIssue>(issues.length));
        }
        for (ClusterIssue ele : issues) {
            this.issues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services Outpost.
     * </p>
     * 
     * @param issues
     *        An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services
     *        Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterHealth withIssues(java.util.Collection<ClusterIssue> issues) {
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

        if (obj instanceof ClusterHealth == false)
            return false;
        ClusterHealth other = (ClusterHealth) obj;
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
    public ClusterHealth clone() {
        try {
            return (ClusterHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ClusterHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
