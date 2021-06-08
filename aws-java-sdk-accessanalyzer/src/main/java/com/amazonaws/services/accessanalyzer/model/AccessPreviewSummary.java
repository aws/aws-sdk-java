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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of information about an access preview.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/AccessPreviewSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPreviewSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     */
    private String analyzerArn;
    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete and previews the findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    private AccessPreviewStatusReason statusReason;

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     * 
     * @param analyzerArn
     *        The ARN of the analyzer used to generate the access preview.
     */

    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     * 
     * @return The ARN of the analyzer used to generate the access preview.
     */

    public String getAnalyzerArn() {
        return this.analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     * 
     * @param analyzerArn
     *        The ARN of the analyzer used to generate the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreviewSummary withAnalyzerArn(String analyzerArn) {
        setAnalyzerArn(analyzerArn);
        return this;
    }

    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the access preview was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     * 
     * @return The time at which the access preview was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the access preview was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreviewSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param id
     *        The unique ID for the access preview.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @return The unique ID for the access preview.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param id
     *        The unique ID for the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreviewSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete and previews the findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the access preview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - The access preview creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The access preview is complete and previews the findings for external access to
     *        the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The access preview creation has failed.
     *        </p>
     *        </li>
     * @see AccessPreviewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete and previews the findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the access preview.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Creating</code> - The access preview creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The access preview is complete and previews the findings for external access to
     *         the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The access preview creation has failed.
     *         </p>
     *         </li>
     * @see AccessPreviewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete and previews the findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the access preview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - The access preview creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The access preview is complete and previews the findings for external access to
     *        the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The access preview creation has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPreviewStatus
     */

    public AccessPreviewSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete and previews the findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the access preview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - The access preview creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The access preview is complete and previews the findings for external access to
     *        the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The access preview creation has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPreviewStatus
     */

    public AccessPreviewSummary withStatus(AccessPreviewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param statusReason
     */

    public void setStatusReason(AccessPreviewStatusReason statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * @return
     */

    public AccessPreviewStatusReason getStatusReason() {
        return this.statusReason;
    }

    /**
     * @param statusReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreviewSummary withStatusReason(AccessPreviewStatusReason statusReason) {
        setStatusReason(statusReason);
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
        if (getAnalyzerArn() != null)
            sb.append("AnalyzerArn: ").append(getAnalyzerArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPreviewSummary == false)
            return false;
        AccessPreviewSummary other = (AccessPreviewSummary) obj;
        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public AccessPreviewSummary clone() {
        try {
            return (AccessPreviewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.AccessPreviewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
