/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTopicPermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTopicPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic that you want to update the permissions for.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     */
    private String topicId;
    /**
     * <p>
     * The resource permissions that you want to grant to the topic.
     * </p>
     */
    private java.util.List<ResourcePermission> grantPermissions;
    /**
     * <p>
     * The resource permissions that you want to revoke from the topic.
     * </p>
     */
    private java.util.List<ResourcePermission> revokePermissions;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic that you want to update the permissions for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the topic that you want to update the permissions
     *        for.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic that you want to update the permissions for.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the topic that you want to update the permissions
     *         for.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic that you want to update the permissions for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the topic that you want to update the permissions
     *        for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTopicPermissionsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     */

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     * 
     * @return The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each
     *         Amazon Web Services account.
     */

    public String getTopicId() {
        return this.topicId;
    }

    /**
     * <p>
     * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web
     * Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTopicPermissionsRequest withTopicId(String topicId) {
        setTopicId(topicId);
        return this;
    }

    /**
     * <p>
     * The resource permissions that you want to grant to the topic.
     * </p>
     * 
     * @return The resource permissions that you want to grant to the topic.
     */

    public java.util.List<ResourcePermission> getGrantPermissions() {
        return grantPermissions;
    }

    /**
     * <p>
     * The resource permissions that you want to grant to the topic.
     * </p>
     * 
     * @param grantPermissions
     *        The resource permissions that you want to grant to the topic.
     */

    public void setGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        if (grantPermissions == null) {
            this.grantPermissions = null;
            return;
        }

        this.grantPermissions = new java.util.ArrayList<ResourcePermission>(grantPermissions);
    }

    /**
     * <p>
     * The resource permissions that you want to grant to the topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantPermissions(java.util.Collection)} or {@link #withGrantPermissions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param grantPermissions
     *        The resource permissions that you want to grant to the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTopicPermissionsRequest withGrantPermissions(ResourcePermission... grantPermissions) {
        if (this.grantPermissions == null) {
            setGrantPermissions(new java.util.ArrayList<ResourcePermission>(grantPermissions.length));
        }
        for (ResourcePermission ele : grantPermissions) {
            this.grantPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource permissions that you want to grant to the topic.
     * </p>
     * 
     * @param grantPermissions
     *        The resource permissions that you want to grant to the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTopicPermissionsRequest withGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        setGrantPermissions(grantPermissions);
        return this;
    }

    /**
     * <p>
     * The resource permissions that you want to revoke from the topic.
     * </p>
     * 
     * @return The resource permissions that you want to revoke from the topic.
     */

    public java.util.List<ResourcePermission> getRevokePermissions() {
        return revokePermissions;
    }

    /**
     * <p>
     * The resource permissions that you want to revoke from the topic.
     * </p>
     * 
     * @param revokePermissions
     *        The resource permissions that you want to revoke from the topic.
     */

    public void setRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        if (revokePermissions == null) {
            this.revokePermissions = null;
            return;
        }

        this.revokePermissions = new java.util.ArrayList<ResourcePermission>(revokePermissions);
    }

    /**
     * <p>
     * The resource permissions that you want to revoke from the topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevokePermissions(java.util.Collection)} or {@link #withRevokePermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param revokePermissions
     *        The resource permissions that you want to revoke from the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTopicPermissionsRequest withRevokePermissions(ResourcePermission... revokePermissions) {
        if (this.revokePermissions == null) {
            setRevokePermissions(new java.util.ArrayList<ResourcePermission>(revokePermissions.length));
        }
        for (ResourcePermission ele : revokePermissions) {
            this.revokePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource permissions that you want to revoke from the topic.
     * </p>
     * 
     * @param revokePermissions
     *        The resource permissions that you want to revoke from the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTopicPermissionsRequest withRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        setRevokePermissions(revokePermissions);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTopicId() != null)
            sb.append("TopicId: ").append(getTopicId()).append(",");
        if (getGrantPermissions() != null)
            sb.append("GrantPermissions: ").append(getGrantPermissions()).append(",");
        if (getRevokePermissions() != null)
            sb.append("RevokePermissions: ").append(getRevokePermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTopicPermissionsRequest == false)
            return false;
        UpdateTopicPermissionsRequest other = (UpdateTopicPermissionsRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTopicId() == null ^ this.getTopicId() == null)
            return false;
        if (other.getTopicId() != null && other.getTopicId().equals(this.getTopicId()) == false)
            return false;
        if (other.getGrantPermissions() == null ^ this.getGrantPermissions() == null)
            return false;
        if (other.getGrantPermissions() != null && other.getGrantPermissions().equals(this.getGrantPermissions()) == false)
            return false;
        if (other.getRevokePermissions() == null ^ this.getRevokePermissions() == null)
            return false;
        if (other.getRevokePermissions() != null && other.getRevokePermissions().equals(this.getRevokePermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        hashCode = prime * hashCode + ((getGrantPermissions() == null) ? 0 : getGrantPermissions().hashCode());
        hashCode = prime * hashCode + ((getRevokePermissions() == null) ? 0 : getRevokePermissions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTopicPermissionsRequest clone() {
        return (UpdateTopicPermissionsRequest) super.clone();
    }

}
