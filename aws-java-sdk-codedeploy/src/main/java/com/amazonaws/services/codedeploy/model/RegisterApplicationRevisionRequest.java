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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a RegisterApplicationRevision operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterApplicationRevision"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterApplicationRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * A comment about the revision.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the application revision to register, including type and location.
     * </p>
     */
    private RevisionLocation revision;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @return The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRevisionRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * A comment about the revision.
     * </p>
     * 
     * @param description
     *        A comment about the revision.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A comment about the revision.
     * </p>
     * 
     * @return A comment about the revision.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A comment about the revision.
     * </p>
     * 
     * @param description
     *        A comment about the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRevisionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the application revision to register, including type and location.
     * </p>
     * 
     * @param revision
     *        Information about the application revision to register, including type and location.
     */

    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * Information about the application revision to register, including type and location.
     * </p>
     * 
     * @return Information about the application revision to register, including type and location.
     */

    public RevisionLocation getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * Information about the application revision to register, including type and location.
     * </p>
     * 
     * @param revision
     *        Information about the application revision to register, including type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterApplicationRevisionRequest withRevision(RevisionLocation revision) {
        setRevision(revision);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterApplicationRevisionRequest == false)
            return false;
        RegisterApplicationRevisionRequest other = (RegisterApplicationRevisionRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public RegisterApplicationRevisionRequest clone() {
        return (RegisterApplicationRevisionRequest) super.clone();
    }

}
