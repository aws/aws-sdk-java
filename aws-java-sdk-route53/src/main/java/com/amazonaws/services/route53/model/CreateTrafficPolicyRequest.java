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
 * A complex type that contains information about the traffic policy that you want to create.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     */
    private String document;
    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic policy.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * 
     * @param name
     *        The name of the traffic policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * 
     * @return The name of the traffic policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * 
     * @param name
     *        The name of the traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * 
     * @param document
     *        The definition of this traffic policy in JSON format. For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *        >Traffic Policy Document Format</a>.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * 
     * @return The definition of this traffic policy in JSON format. For more information, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *         >Traffic Policy Document Format</a>.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * 
     * @param document
     *        The definition of this traffic policy in JSON format. For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *        >Traffic Policy Document Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic policy.
     * </p>
     * 
     * @param comment
     *        (Optional) Any comments that you want to include about the traffic policy.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic policy.
     * </p>
     * 
     * @return (Optional) Any comments that you want to include about the traffic policy.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * (Optional) Any comments that you want to include about the traffic policy.
     * </p>
     * 
     * @param comment
     *        (Optional) Any comments that you want to include about the traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withComment(String comment) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
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

        if (obj instanceof CreateTrafficPolicyRequest == false)
            return false;
        CreateTrafficPolicyRequest other = (CreateTrafficPolicyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficPolicyRequest clone() {
        return (CreateTrafficPolicyRequest) super.clone();
    }

}
