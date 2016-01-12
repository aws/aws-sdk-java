/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains an optional comment about your hosted zone. If
 * you don't want to specify a comment, you can omit the
 * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the XML
 * document.
 * </p>
 */
public class HostedZoneConfig implements Serializable, Cloneable {

    /**
     * <p>
     * An optional comment about your hosted zone. If you don't want to specify
     * a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * </p>
     */
    private String comment;

    private Boolean privateZone;

    /**
     * <p>
     * An optional comment about your hosted zone. If you don't want to specify
     * a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * </p>
     * 
     * @param comment
     *        An optional comment about your hosted zone. If you don't want to
     *        specify a comment, you can omit the <code>HostedZoneConfig</code>
     *        and <code>Comment</code> elements from the XML document.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about your hosted zone. If you don't want to specify
     * a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * </p>
     * 
     * @return An optional comment about your hosted zone. If you don't want to
     *         specify a comment, you can omit the <code>HostedZoneConfig</code>
     *         and <code>Comment</code> elements from the XML document.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment about your hosted zone. If you don't want to specify
     * a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * </p>
     * 
     * @param comment
     *        An optional comment about your hosted zone. If you don't want to
     *        specify a comment, you can omit the <code>HostedZoneConfig</code>
     *        and <code>Comment</code> elements from the XML document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public HostedZoneConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * @param privateZone
     */
    public void setPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
    }

    /**
     * @return
     */
    public Boolean getPrivateZone() {
        return this.privateZone;
    }

    /**
     * @param privateZone
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public HostedZoneConfig withPrivateZone(Boolean privateZone) {
        setPrivateZone(privateZone);
        return this;
    }

    /**
     * @return
     */
    public Boolean isPrivateZone() {
        return this.privateZone;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getPrivateZone() != null)
            sb.append("PrivateZone: " + getPrivateZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZoneConfig == false)
            return false;
        HostedZoneConfig other = (HostedZoneConfig) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getPrivateZone() == null ^ this.getPrivateZone() == null)
            return false;
        if (other.getPrivateZone() != null
                && other.getPrivateZone().equals(this.getPrivateZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivateZone() == null) ? 0 : getPrivateZone().hashCode());
        return hashCode;
    }

    @Override
    public HostedZoneConfig clone() {
        try {
            return (HostedZoneConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}