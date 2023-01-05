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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a project policy in the response from <a>ListProjectPolicies</a>.
 * </p>
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project to which the project policy is attached.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The name of the project policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The revision ID of the project policy.
     * </p>
     */
    private String policyRevisionId;
    /**
     * <p>
     * The JSON document for the project policy.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The Unix datetime for the creation of the project policy.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The Unix datetime for when the project policy was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project to which the project policy is attached.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project to which the project policy is attached.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project to which the project policy is attached.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project to which the project policy is attached.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project to which the project policy is attached.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project to which the project policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectPolicy withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The name of the project policy.
     * </p>
     * 
     * @param policyName
     *        The name of the project policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the project policy.
     * </p>
     * 
     * @return The name of the project policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the project policy.
     * </p>
     * 
     * @param policyName
     *        The name of the project policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The revision ID of the project policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID of the project policy.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the project policy.
     * </p>
     * 
     * @return The revision ID of the project policy.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the project policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID of the project policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectPolicy withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
        return this;
    }

    /**
     * <p>
     * The JSON document for the project policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document for the project policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document for the project policy.
     * </p>
     * 
     * @return The JSON document for the project policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON document for the project policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document for the project policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectPolicy withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The Unix datetime for the creation of the project policy.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix datetime for the creation of the project policy.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the creation of the project policy.
     * </p>
     * 
     * @return The Unix datetime for the creation of the project policy.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for the creation of the project policy.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix datetime for the creation of the project policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectPolicy withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The Unix datetime for when the project policy was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix datetime for when the project policy was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for when the project policy was last updated.
     * </p>
     * 
     * @return The Unix datetime for when the project policy was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix datetime for when the project policy was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix datetime for when the project policy was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectPolicy withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectPolicy == false)
            return false;
        ProjectPolicy other = (ProjectPolicy) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ProjectPolicy clone() {
        try {
            return (ProjectPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProjectPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
