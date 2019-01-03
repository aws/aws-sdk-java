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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHandshakesForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     * organization.
     * </p>
     */
    private java.util.List<Handshake> handshakes;
    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     * organization.
     * </p>
     * 
     * @return A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     *         organization.
     */

    public java.util.List<Handshake> getHandshakes() {
        return handshakes;
    }

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     * organization.
     * </p>
     * 
     * @param handshakes
     *        A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     *        organization.
     */

    public void setHandshakes(java.util.Collection<Handshake> handshakes) {
        if (handshakes == null) {
            this.handshakes = null;
            return;
        }

        this.handshakes = new java.util.ArrayList<Handshake>(handshakes);
    }

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     * organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHandshakes(java.util.Collection)} or {@link #withHandshakes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param handshakes
     *        A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHandshakesForOrganizationResult withHandshakes(Handshake... handshakes) {
        if (this.handshakes == null) {
            setHandshakes(new java.util.ArrayList<Handshake>(handshakes.length));
        }
        for (Handshake ele : handshakes) {
            this.handshakes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     * organization.
     * </p>
     * 
     * @param handshakes
     *        A list of <a>Handshake</a> objects with details about each of the handshakes that are associated with an
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHandshakesForOrganizationResult withHandshakes(java.util.Collection<Handshake> handshakes) {
        setHandshakes(handshakes);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @return If present, this value indicates that there is more output available than is included in the current
     *         response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *         operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *         response element comes back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHandshakesForOrganizationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getHandshakes() != null)
            sb.append("Handshakes: ").append(getHandshakes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHandshakesForOrganizationResult == false)
            return false;
        ListHandshakesForOrganizationResult other = (ListHandshakesForOrganizationResult) obj;
        if (other.getHandshakes() == null ^ this.getHandshakes() == null)
            return false;
        if (other.getHandshakes() != null && other.getHandshakes().equals(this.getHandshakes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHandshakes() == null) ? 0 : getHandshakes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHandshakesForOrganizationResult clone() {
        try {
            return (ListHandshakesForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
