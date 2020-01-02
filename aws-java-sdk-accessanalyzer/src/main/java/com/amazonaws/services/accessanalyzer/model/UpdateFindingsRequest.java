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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates findings with the new values provided in the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     */
    private String analyzerArn;
    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change an
     * Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     * 
     * @param analyzerArn
     *        The ARN of the analyzer that generated the findings to update.
     */

    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     * 
     * @return The ARN of the analyzer that generated the findings to update.
     */

    public String getAnalyzerArn() {
        return this.analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     * 
     * @param analyzerArn
     *        The ARN of the analyzer that generated the findings to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsRequest withAnalyzerArn(String analyzerArn) {
        setAnalyzerArn(analyzerArn);
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @return A client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     * 
     * @return The IDs of the findings to update.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     * 
     * @param ids
     *        The IDs of the findings to update.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        The IDs of the findings to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsRequest withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     * 
     * @param ids
     *        The IDs of the findings to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource identified in the finding.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     * 
     * @return The ARN of the resource identified in the finding.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource identified in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change an
     * Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * 
     * @param status
     *        The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change
     *        an Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an
     *        Active finding.
     * @see FindingStatusUpdate
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change an
     * Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * 
     * @return The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change
     *         an Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an
     *         Active finding.
     * @see FindingStatusUpdate
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change an
     * Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * 
     * @param status
     *        The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change
     *        an Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an
     *        Active finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatusUpdate
     */

    public UpdateFindingsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change an
     * Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * 
     * @param status
     *        The state represents the action to take to update the finding Status. Use <code>ARCHIVE</code> to change
     *        an Active finding to an Archived finding. Use <code>ACTIVE</code> to change an Archived finding to an
     *        Active finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatusUpdate
     */

    public UpdateFindingsRequest withStatus(FindingStatusUpdate status) {
        this.status = status.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFindingsRequest == false)
            return false;
        UpdateFindingsRequest other = (UpdateFindingsRequest) obj;
        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFindingsRequest clone() {
        return (UpdateFindingsRequest) super.clone();
    }

}
