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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists a summary of the properties of a lineage group. A lineage group provides a group of shareable lineage entity
 * resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LineageGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineageGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group resource.
     * </p>
     */
    private String lineageGroupArn;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the lineage group.
     * </p>
     */
    private String lineageGroupName;
    /**
     * <p>
     * The display name of the lineage group summary.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The creation time of the lineage group summary.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last modified time of the lineage group summary.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group resource.
     * </p>
     * 
     * @param lineageGroupArn
     *        The Amazon Resource Name (ARN) of the lineage group resource.
     */

    public void setLineageGroupArn(String lineageGroupArn) {
        this.lineageGroupArn = lineageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lineage group resource.
     */

    public String getLineageGroupArn() {
        return this.lineageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group resource.
     * </p>
     * 
     * @param lineageGroupArn
     *        The Amazon Resource Name (ARN) of the lineage group resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageGroupSummary withLineageGroupArn(String lineageGroupArn) {
        setLineageGroupArn(lineageGroupArn);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @param lineageGroupName
     *        The name or Amazon Resource Name (ARN) of the lineage group.
     */

    public void setLineageGroupName(String lineageGroupName) {
        this.lineageGroupName = lineageGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the lineage group.
     */

    public String getLineageGroupName() {
        return this.lineageGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @param lineageGroupName
     *        The name or Amazon Resource Name (ARN) of the lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageGroupSummary withLineageGroupName(String lineageGroupName) {
        setLineageGroupName(lineageGroupName);
        return this;
    }

    /**
     * <p>
     * The display name of the lineage group summary.
     * </p>
     * 
     * @param displayName
     *        The display name of the lineage group summary.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the lineage group summary.
     * </p>
     * 
     * @return The display name of the lineage group summary.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the lineage group summary.
     * </p>
     * 
     * @param displayName
     *        The display name of the lineage group summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageGroupSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The creation time of the lineage group summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the lineage group summary.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the lineage group summary.
     * </p>
     * 
     * @return The creation time of the lineage group summary.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the lineage group summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the lineage group summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageGroupSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last modified time of the lineage group summary.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time of the lineage group summary.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time of the lineage group summary.
     * </p>
     * 
     * @return The last modified time of the lineage group summary.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time of the lineage group summary.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time of the lineage group summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageGroupSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getLineageGroupArn() != null)
            sb.append("LineageGroupArn: ").append(getLineageGroupArn()).append(",");
        if (getLineageGroupName() != null)
            sb.append("LineageGroupName: ").append(getLineageGroupName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineageGroupSummary == false)
            return false;
        LineageGroupSummary other = (LineageGroupSummary) obj;
        if (other.getLineageGroupArn() == null ^ this.getLineageGroupArn() == null)
            return false;
        if (other.getLineageGroupArn() != null && other.getLineageGroupArn().equals(this.getLineageGroupArn()) == false)
            return false;
        if (other.getLineageGroupName() == null ^ this.getLineageGroupName() == null)
            return false;
        if (other.getLineageGroupName() != null && other.getLineageGroupName().equals(this.getLineageGroupName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineageGroupArn() == null) ? 0 : getLineageGroupArn().hashCode());
        hashCode = prime * hashCode + ((getLineageGroupName() == null) ? 0 : getLineageGroupName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public LineageGroupSummary clone() {
        try {
            return (LineageGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LineageGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
