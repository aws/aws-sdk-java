/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the traffic policy for which you want to create a new version.
 * </p>
 */
public class CreateTrafficPolicyVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the
     * <code>CreateTrafficPolicyVersion</code> request. For more information about the JSON format, see
     * <a>CreateTrafficPolicy</a>.
     * </p>
     */
    private String document;
    /**
     * <p>
     * The comment that you specified in the <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy for which you want to create a new version.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     * 
     * @return The ID of the traffic policy for which you want to create a new version.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the traffic policy for which you want to create a new version.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy for which you want to create a new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyVersionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the
     * <code>CreateTrafficPolicyVersion</code> request. For more information about the JSON format, see
     * <a>CreateTrafficPolicy</a>.
     * </p>
     * 
     * @param document
     *        The definition of this version of the traffic policy, in JSON format. You specified the JSON in the
     *        <code>CreateTrafficPolicyVersion</code> request. For more information about the JSON format, see
     *        <a>CreateTrafficPolicy</a>.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the
     * <code>CreateTrafficPolicyVersion</code> request. For more information about the JSON format, see
     * <a>CreateTrafficPolicy</a>.
     * </p>
     * 
     * @return The definition of this version of the traffic policy, in JSON format. You specified the JSON in the
     *         <code>CreateTrafficPolicyVersion</code> request. For more information about the JSON format, see
     *         <a>CreateTrafficPolicy</a>.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the
     * <code>CreateTrafficPolicyVersion</code> request. For more information about the JSON format, see
     * <a>CreateTrafficPolicy</a>.
     * </p>
     * 
     * @param document
     *        The definition of this version of the traffic policy, in JSON format. You specified the JSON in the
     *        <code>CreateTrafficPolicyVersion</code> request. For more information about the JSON format, see
     *        <a>CreateTrafficPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyVersionRequest withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The comment that you specified in the <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     * 
     * @param comment
     *        The comment that you specified in the <code>CreateTrafficPolicyVersion</code> request, if any.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment that you specified in the <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     * 
     * @return The comment that you specified in the <code>CreateTrafficPolicyVersion</code> request, if any.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The comment that you specified in the <code>CreateTrafficPolicyVersion</code> request, if any.
     * </p>
     * 
     * @param comment
     *        The comment that you specified in the <code>CreateTrafficPolicyVersion</code> request, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyVersionRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Id: " + getId() + ",");
        if (getDocument() != null)
            sb.append("Document: " + getDocument() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficPolicyVersionRequest == false)
            return false;
        CreateTrafficPolicyVersionRequest other = (CreateTrafficPolicyVersionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
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
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficPolicyVersionRequest clone() {
        return (CreateTrafficPolicyVersionRequest) super.clone();
    }
}
