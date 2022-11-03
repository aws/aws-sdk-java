/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateTrustAnchor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrustAnchorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     */
    private String trustAnchorId;

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @param name
     *        The name of the trust anchor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @return The name of the trust anchor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @param name
     *        The name of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustAnchorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @param source
     *        The trust anchor type and its related certificate data.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @return The trust anchor type and its related certificate data.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @param source
     *        The trust anchor type and its related certificate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustAnchorRequest withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     */

    public void setTrustAnchorId(String trustAnchorId) {
        this.trustAnchorId = trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @return The unique identifier of the trust anchor.
     */

    public String getTrustAnchorId() {
        return this.trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustAnchorRequest withTrustAnchorId(String trustAnchorId) {
        setTrustAnchorId(trustAnchorId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTrustAnchorId() != null)
            sb.append("TrustAnchorId: ").append(getTrustAnchorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrustAnchorRequest == false)
            return false;
        UpdateTrustAnchorRequest other = (UpdateTrustAnchorRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTrustAnchorId() == null ^ this.getTrustAnchorId() == null)
            return false;
        if (other.getTrustAnchorId() != null && other.getTrustAnchorId().equals(this.getTrustAnchorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorId() == null) ? 0 : getTrustAnchorId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrustAnchorRequest clone() {
        return (UpdateTrustAnchorRequest) super.clone();
    }

}
