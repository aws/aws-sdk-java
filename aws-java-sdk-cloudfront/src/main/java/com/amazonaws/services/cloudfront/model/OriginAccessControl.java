/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A CloudFront origin access control, including its unique identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginAccessControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginAccessControl implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the origin access control.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The origin access control.
     * </p>
     */
    private OriginAccessControlConfig originAccessControlConfig;

    /**
     * <p>
     * The unique identifier of the origin access control.
     * </p>
     * 
     * @param id
     *        The unique identifier of the origin access control.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the origin access control.
     * </p>
     * 
     * @return The unique identifier of the origin access control.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the origin access control.
     * </p>
     * 
     * @param id
     *        The unique identifier of the origin access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControl withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The origin access control.
     * </p>
     * 
     * @param originAccessControlConfig
     *        The origin access control.
     */

    public void setOriginAccessControlConfig(OriginAccessControlConfig originAccessControlConfig) {
        this.originAccessControlConfig = originAccessControlConfig;
    }

    /**
     * <p>
     * The origin access control.
     * </p>
     * 
     * @return The origin access control.
     */

    public OriginAccessControlConfig getOriginAccessControlConfig() {
        return this.originAccessControlConfig;
    }

    /**
     * <p>
     * The origin access control.
     * </p>
     * 
     * @param originAccessControlConfig
     *        The origin access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginAccessControl withOriginAccessControlConfig(OriginAccessControlConfig originAccessControlConfig) {
        setOriginAccessControlConfig(originAccessControlConfig);
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
        if (getOriginAccessControlConfig() != null)
            sb.append("OriginAccessControlConfig: ").append(getOriginAccessControlConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginAccessControl == false)
            return false;
        OriginAccessControl other = (OriginAccessControl) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOriginAccessControlConfig() == null ^ this.getOriginAccessControlConfig() == null)
            return false;
        if (other.getOriginAccessControlConfig() != null && other.getOriginAccessControlConfig().equals(this.getOriginAccessControlConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOriginAccessControlConfig() == null) ? 0 : getOriginAccessControlConfig().hashCode());
        return hashCode;
    }

    @Override
    public OriginAccessControl clone() {
        try {
            return (OriginAccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
