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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains summary information about a workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/FlowTemplateSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowTemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the workflow.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The revision number of the workflow.
     * </p>
     */
    private Long revisionNumber;
    /**
     * <p>
     * The date when the workflow was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     * 
     * @param id
     *        The ID of the workflow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     * 
     * @return The ID of the workflow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the workflow.
     * </p>
     * 
     * @param id
     *        The ID of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowTemplateSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the workflow.
     * </p>
     * 
     * @param arn
     *        The ARN of the workflow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the workflow.
     * </p>
     * 
     * @return The ARN of the workflow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the workflow.
     * </p>
     * 
     * @param arn
     *        The ARN of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowTemplateSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The revision number of the workflow.
     * </p>
     * 
     * @param revisionNumber
     *        The revision number of the workflow.
     */

    public void setRevisionNumber(Long revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    /**
     * <p>
     * The revision number of the workflow.
     * </p>
     * 
     * @return The revision number of the workflow.
     */

    public Long getRevisionNumber() {
        return this.revisionNumber;
    }

    /**
     * <p>
     * The revision number of the workflow.
     * </p>
     * 
     * @param revisionNumber
     *        The revision number of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowTemplateSummary withRevisionNumber(Long revisionNumber) {
        setRevisionNumber(revisionNumber);
        return this;
    }

    /**
     * <p>
     * The date when the workflow was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the workflow was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the workflow was created.
     * </p>
     * 
     * @return The date when the workflow was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the workflow was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the workflow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowTemplateSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRevisionNumber() != null)
            sb.append("RevisionNumber: ").append(getRevisionNumber()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowTemplateSummary == false)
            return false;
        FlowTemplateSummary other = (FlowTemplateSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRevisionNumber() == null ^ this.getRevisionNumber() == null)
            return false;
        if (other.getRevisionNumber() != null && other.getRevisionNumber().equals(this.getRevisionNumber()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRevisionNumber() == null) ? 0 : getRevisionNumber().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public FlowTemplateSummary clone() {
        try {
            return (FlowTemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.FlowTemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
