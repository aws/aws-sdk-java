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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the traffic policy that you want to update the comment for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyComment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrafficPolicyCommentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The value of <code>Id</code> for the traffic policy that you want to update the comment for.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value of <code>Version</code> for the traffic policy that you want to update the comment for.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The new comment for the specified traffic policy and version.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The value of <code>Id</code> for the traffic policy that you want to update the comment for.
     * </p>
     * 
     * @param id
     *        The value of <code>Id</code> for the traffic policy that you want to update the comment for.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The value of <code>Id</code> for the traffic policy that you want to update the comment for.
     * </p>
     * 
     * @return The value of <code>Id</code> for the traffic policy that you want to update the comment for.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The value of <code>Id</code> for the traffic policy that you want to update the comment for.
     * </p>
     * 
     * @param id
     *        The value of <code>Id</code> for the traffic policy that you want to update the comment for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyCommentRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The value of <code>Version</code> for the traffic policy that you want to update the comment for.
     * </p>
     * 
     * @param version
     *        The value of <code>Version</code> for the traffic policy that you want to update the comment for.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The value of <code>Version</code> for the traffic policy that you want to update the comment for.
     * </p>
     * 
     * @return The value of <code>Version</code> for the traffic policy that you want to update the comment for.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The value of <code>Version</code> for the traffic policy that you want to update the comment for.
     * </p>
     * 
     * @param version
     *        The value of <code>Version</code> for the traffic policy that you want to update the comment for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyCommentRequest withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The new comment for the specified traffic policy and version.
     * </p>
     * 
     * @param comment
     *        The new comment for the specified traffic policy and version.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The new comment for the specified traffic policy and version.
     * </p>
     * 
     * @return The new comment for the specified traffic policy and version.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The new comment for the specified traffic policy and version.
     * </p>
     * 
     * @param comment
     *        The new comment for the specified traffic policy and version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyCommentRequest withComment(String comment) {
        setComment(comment);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrafficPolicyCommentRequest == false)
            return false;
        UpdateTrafficPolicyCommentRequest other = (UpdateTrafficPolicyCommentRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrafficPolicyCommentRequest clone() {
        return (UpdateTrafficPolicyCommentRequest) super.clone();
    }

}
