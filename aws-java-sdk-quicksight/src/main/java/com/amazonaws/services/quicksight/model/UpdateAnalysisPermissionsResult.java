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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysisPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnalysisPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis that you updated.
     * </p>
     */
    private String analysisArn;
    /**
     * <p>
     * The ID of the analysis that you updated permissions for.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis that you updated.
     * </p>
     * 
     * @param analysisArn
     *        The Amazon Resource Name (ARN) of the analysis that you updated.
     */

    public void setAnalysisArn(String analysisArn) {
        this.analysisArn = analysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis that you updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the analysis that you updated.
     */

    public String getAnalysisArn() {
        return this.analysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis that you updated.
     * </p>
     * 
     * @param analysisArn
     *        The Amazon Resource Name (ARN) of the analysis that you updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisPermissionsResult withAnalysisArn(String analysisArn) {
        setAnalysisArn(analysisArn);
        return this;
    }

    /**
     * <p>
     * The ID of the analysis that you updated permissions for.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis that you updated permissions for.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis that you updated permissions for.
     * </p>
     * 
     * @return The ID of the analysis that you updated permissions for.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis that you updated permissions for.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis that you updated permissions for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisPermissionsResult withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis.
     * </p>
     * 
     * @return A structure that describes the principals and the resource-level permissions on an analysis.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions on an analysis.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions on an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisPermissionsResult withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions on an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisPermissionsResult withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisPermissionsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisPermissionsResult withStatus(Integer status) {
        setStatus(status);
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
        if (getAnalysisArn() != null)
            sb.append("AnalysisArn: ").append(getAnalysisArn()).append(",");
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
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

        if (obj instanceof UpdateAnalysisPermissionsResult == false)
            return false;
        UpdateAnalysisPermissionsResult other = (UpdateAnalysisPermissionsResult) obj;
        if (other.getAnalysisArn() == null ^ this.getAnalysisArn() == null)
            return false;
        if (other.getAnalysisArn() != null && other.getAnalysisArn().equals(this.getAnalysisArn()) == false)
            return false;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
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

        hashCode = prime * hashCode + ((getAnalysisArn() == null) ? 0 : getAnalysisArn().hashCode());
        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnalysisPermissionsResult clone() {
        try {
            return (UpdateAnalysisPermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
