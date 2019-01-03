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
 * Represents the input of a BatchGetApplicationRevisions operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplicationRevisions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetApplicationRevisionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision information.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Information to get about the application revisions, including type and location.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RevisionLocation> revisions;

    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision information.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application about which to get revision information.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision information.
     * </p>
     * 
     * @return The name of an AWS CodeDeploy application about which to get revision information.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application about which to get revision information.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application about which to get revision information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationRevisionsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Information to get about the application revisions, including type and location.
     * </p>
     * 
     * @return Information to get about the application revisions, including type and location.
     */

    public java.util.List<RevisionLocation> getRevisions() {
        if (revisions == null) {
            revisions = new com.amazonaws.internal.SdkInternalList<RevisionLocation>();
        }
        return revisions;
    }

    /**
     * <p>
     * Information to get about the application revisions, including type and location.
     * </p>
     * 
     * @param revisions
     *        Information to get about the application revisions, including type and location.
     */

    public void setRevisions(java.util.Collection<RevisionLocation> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new com.amazonaws.internal.SdkInternalList<RevisionLocation>(revisions);
    }

    /**
     * <p>
     * Information to get about the application revisions, including type and location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisions(java.util.Collection)} or {@link #withRevisions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param revisions
     *        Information to get about the application revisions, including type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationRevisionsRequest withRevisions(RevisionLocation... revisions) {
        if (this.revisions == null) {
            setRevisions(new com.amazonaws.internal.SdkInternalList<RevisionLocation>(revisions.length));
        }
        for (RevisionLocation ele : revisions) {
            this.revisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information to get about the application revisions, including type and location.
     * </p>
     * 
     * @param revisions
     *        Information to get about the application revisions, including type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationRevisionsRequest withRevisions(java.util.Collection<RevisionLocation> revisions) {
        setRevisions(revisions);
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
        if (getRevisions() != null)
            sb.append("Revisions: ").append(getRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetApplicationRevisionsRequest == false)
            return false;
        BatchGetApplicationRevisionsRequest other = (BatchGetApplicationRevisionsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null && other.getRevisions().equals(this.getRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetApplicationRevisionsRequest clone() {
        return (BatchGetApplicationRevisionsRequest) super.clone();
    }

}
