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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociateEntitiesToExperience"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateEntitiesToExperienceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Lists the users or groups in your IAM Identity Center identity source that failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     */
    private java.util.List<FailedEntity> failedEntityList;

    /**
     * <p>
     * Lists the users or groups in your IAM Identity Center identity source that failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     * 
     * @return Lists the users or groups in your IAM Identity Center identity source that failed to properly configure
     *         with your Amazon Kendra experience.
     */

    public java.util.List<FailedEntity> getFailedEntityList() {
        return failedEntityList;
    }

    /**
     * <p>
     * Lists the users or groups in your IAM Identity Center identity source that failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param failedEntityList
     *        Lists the users or groups in your IAM Identity Center identity source that failed to properly configure
     *        with your Amazon Kendra experience.
     */

    public void setFailedEntityList(java.util.Collection<FailedEntity> failedEntityList) {
        if (failedEntityList == null) {
            this.failedEntityList = null;
            return;
        }

        this.failedEntityList = new java.util.ArrayList<FailedEntity>(failedEntityList);
    }

    /**
     * <p>
     * Lists the users or groups in your IAM Identity Center identity source that failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedEntityList(java.util.Collection)} or {@link #withFailedEntityList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failedEntityList
     *        Lists the users or groups in your IAM Identity Center identity source that failed to properly configure
     *        with your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEntitiesToExperienceResult withFailedEntityList(FailedEntity... failedEntityList) {
        if (this.failedEntityList == null) {
            setFailedEntityList(new java.util.ArrayList<FailedEntity>(failedEntityList.length));
        }
        for (FailedEntity ele : failedEntityList) {
            this.failedEntityList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the users or groups in your IAM Identity Center identity source that failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param failedEntityList
     *        Lists the users or groups in your IAM Identity Center identity source that failed to properly configure
     *        with your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEntitiesToExperienceResult withFailedEntityList(java.util.Collection<FailedEntity> failedEntityList) {
        setFailedEntityList(failedEntityList);
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
        if (getFailedEntityList() != null)
            sb.append("FailedEntityList: ").append(getFailedEntityList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateEntitiesToExperienceResult == false)
            return false;
        AssociateEntitiesToExperienceResult other = (AssociateEntitiesToExperienceResult) obj;
        if (other.getFailedEntityList() == null ^ this.getFailedEntityList() == null)
            return false;
        if (other.getFailedEntityList() != null && other.getFailedEntityList().equals(this.getFailedEntityList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedEntityList() == null) ? 0 : getFailedEntityList().hashCode());
        return hashCode;
    }

    @Override
    public AssociateEntitiesToExperienceResult clone() {
        try {
            return (AssociateEntitiesToExperienceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
