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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemoveLayerVersionPermission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveLayerVersionPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     */
    private String layerName;
    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The identifier that was specified when the statement was added.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     */

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the layer.
     */

    public String getLayerName() {
        return this.layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveLayerVersionPermissionRequest withLayerName(String layerName) {
        setLayerName(layerName);
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveLayerVersionPermissionRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The identifier that was specified when the statement was added.
     * </p>
     * 
     * @param statementId
     *        The identifier that was specified when the statement was added.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * The identifier that was specified when the statement was added.
     * </p>
     * 
     * @return The identifier that was specified when the statement was added.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * The identifier that was specified when the statement was added.
     * </p>
     * 
     * @param statementId
     *        The identifier that was specified when the statement was added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveLayerVersionPermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a
     *        policy that has changed since you last read it.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     * 
     * @return Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a
     *         policy that has changed since you last read it.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy
     * that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a
     *        policy that has changed since you last read it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveLayerVersionPermissionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getLayerName() != null)
            sb.append("LayerName: ").append(getLayerName()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveLayerVersionPermissionRequest == false)
            return false;
        RemoveLayerVersionPermissionRequest other = (RemoveLayerVersionPermissionRequest) obj;
        if (other.getLayerName() == null ^ this.getLayerName() == null)
            return false;
        if (other.getLayerName() != null && other.getLayerName().equals(this.getLayerName()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerName() == null) ? 0 : getLayerName().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public RemoveLayerVersionPermissionRequest clone() {
        return (RemoveLayerVersionPermissionRequest) super.clone();
    }

}
