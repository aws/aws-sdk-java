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

/**
 * <p>
 * A complex type that contains settings for a traffic policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TrafficPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of
     * <code>Version</code> is always 1.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy
     * in the <code>CreateTrafficPolicy</code> request. For more information about the JSON format, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     */
    private String document;
    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code> request, if any.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to a traffic policy when you created it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
     * </p>
     * 
     * @return The ID that Amazon Route 53 assigned to a traffic policy when you created it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to a traffic policy when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of
     * <code>Version</code> is always 1.
     * </p>
     * 
     * @param version
     *        The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value
     *        of <code>Version</code> is always 1.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of
     * <code>Version</code> is always 1.
     * </p>
     * 
     * @return The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value
     *         of <code>Version</code> is always 1.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value of
     * <code>Version</code> is always 1.
     * </p>
     * 
     * @param version
     *        The version number that Amazon Route 53 assigns to a traffic policy. For a new traffic policy, the value
     *        of <code>Version</code> is always 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicy withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     * 
     * @param name
     *        The name that you specified when you created the traffic policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     * 
     * @return The name that you specified when you created the traffic policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     * 
     * @param name
     *        The name that you specified when you created the traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @see RRType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @return The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *         create a traffic policy instance.
     * @see RRType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TrafficPolicy withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @see RRType
     */

    public void setType(RRType type) {
        withType(type);
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TrafficPolicy withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy
     * in the <code>CreateTrafficPolicy</code> request. For more information about the JSON format, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * 
     * @param document
     *        The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic
     *        policy in the <code>CreateTrafficPolicy</code> request. For more information about the JSON format, see <a
     *        href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *        >Traffic Policy Document Format</a>.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy
     * in the <code>CreateTrafficPolicy</code> request. For more information about the JSON format, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * 
     * @return The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic
     *         policy in the <code>CreateTrafficPolicy</code> request. For more information about the JSON format, see
     *         <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *         >Traffic Policy Document Format</a>.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic policy
     * in the <code>CreateTrafficPolicy</code> request. For more information about the JSON format, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * 
     * @param document
     *        The definition of a traffic policy in JSON format. You specify the JSON document to use for a new traffic
     *        policy in the <code>CreateTrafficPolicy</code> request. For more information about the JSON format, see <a
     *        href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *        >Traffic Policy Document Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicy withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code> request, if any.
     * </p>
     * 
     * @param comment
     *        The comment that you specify in the <code>CreateTrafficPolicy</code> request, if any.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code> request, if any.
     * </p>
     * 
     * @return The comment that you specify in the <code>CreateTrafficPolicy</code> request, if any.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code> request, if any.
     * </p>
     * 
     * @param comment
     *        The comment that you specify in the <code>CreateTrafficPolicy</code> request, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicy withComment(String comment) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof TrafficPolicy == false)
            return false;
        TrafficPolicy other = (TrafficPolicy) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public TrafficPolicy clone() {
        try {
            return (TrafficPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
