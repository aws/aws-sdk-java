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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a origin access identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeleteCloudFrontOriginAccessIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCloudFrontOriginAccessIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The origin access identity's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value of the <code>ETag</code> header you received from a previous <code>GET</code> or <code>PUT</code>
     * request. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * Default constructor for DeleteCloudFrontOriginAccessIdentityRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize the object after creating it.
     */
    public DeleteCloudFrontOriginAccessIdentityRequest() {
    }

    /**
     * Constructs a new DeleteCloudFrontOriginAccessIdentityRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param id
     *        The origin access identity's ID.
     * @param ifMatch
     *        The value of the <code>ETag</code> header you received from a previous <code>GET</code> or
     *        <code>PUT</code> request. For example: <code>E2QWRUHAPOMQZL</code>.
     */
    public DeleteCloudFrontOriginAccessIdentityRequest(String id, String ifMatch) {
        setId(id);
        setIfMatch(ifMatch);
    }

    /**
     * <p>
     * The origin access identity's ID.
     * </p>
     * 
     * @param id
     *        The origin access identity's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The origin access identity's ID.
     * </p>
     * 
     * @return The origin access identity's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The origin access identity's ID.
     * </p>
     * 
     * @param id
     *        The origin access identity's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCloudFrontOriginAccessIdentityRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header you received from a previous <code>GET</code> or <code>PUT</code>
     * request. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header you received from a previous <code>GET</code> or
     *        <code>PUT</code> request. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header you received from a previous <code>GET</code> or <code>PUT</code>
     * request. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The value of the <code>ETag</code> header you received from a previous <code>GET</code> or
     *         <code>PUT</code> request. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header you received from a previous <code>GET</code> or <code>PUT</code>
     * request. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header you received from a previous <code>GET</code> or
     *        <code>PUT</code> request. For example: <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCloudFrontOriginAccessIdentityRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCloudFrontOriginAccessIdentityRequest == false)
            return false;
        DeleteCloudFrontOriginAccessIdentityRequest other = (DeleteCloudFrontOriginAccessIdentityRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCloudFrontOriginAccessIdentityRequest clone() {
        return (DeleteCloudFrontOriginAccessIdentityRequest) super.clone();
    }

}
