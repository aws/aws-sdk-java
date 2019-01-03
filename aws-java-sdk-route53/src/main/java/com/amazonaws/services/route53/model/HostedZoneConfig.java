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
 * A complex type that contains an optional comment about your hosted zone. If you don't want to specify a comment, omit
 * both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/HostedZoneConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostedZoneConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     */
    private Boolean privateZone;

    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     * 
     * @param comment
     *        Any comments that you want to include about the hosted zone.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     * 
     * @return Any comments that you want to include about the hosted zone.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     * 
     * @param comment
     *        Any comments that you want to include about the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZoneConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     * 
     * @param privateZone
     *        A value that indicates whether this is a private hosted zone.
     */

    public void setPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     * 
     * @return A value that indicates whether this is a private hosted zone.
     */

    public Boolean getPrivateZone() {
        return this.privateZone;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     * 
     * @param privateZone
     *        A value that indicates whether this is a private hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZoneConfig withPrivateZone(Boolean privateZone) {
        setPrivateZone(privateZone);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     * 
     * @return A value that indicates whether this is a private hosted zone.
     */

    public Boolean isPrivateZone() {
        return this.privateZone;
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getPrivateZone() != null)
            sb.append("PrivateZone: ").append(getPrivateZone());
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
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getPrivateZone() == null ^ this.getPrivateZone() == null)
            return false;
        if (other.getPrivateZone() != null && other.getPrivateZone().equals(this.getPrivateZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getPrivateZone() == null) ? 0 : getPrivateZone().hashCode());
        return hashCode;
    }

    @Override
    public HostedZoneConfig clone() {
        try {
            return (HostedZoneConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
