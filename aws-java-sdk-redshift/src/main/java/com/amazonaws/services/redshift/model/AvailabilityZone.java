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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an availability zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AvailabilityZone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityZone implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the availability zone.
     * </p>
     */
    private String name;
    /** <p/> */
    private com.amazonaws.internal.SdkInternalList<SupportedPlatform> supportedPlatforms;

    /**
     * <p>
     * The name of the availability zone.
     * </p>
     * 
     * @param name
     *        The name of the availability zone.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the availability zone.
     * </p>
     * 
     * @return The name of the availability zone.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the availability zone.
     * </p>
     * 
     * @param name
     *        The name of the availability zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<SupportedPlatform> getSupportedPlatforms() {
        if (supportedPlatforms == null) {
            supportedPlatforms = new com.amazonaws.internal.SdkInternalList<SupportedPlatform>();
        }
        return supportedPlatforms;
    }

    /**
     * <p/>
     * 
     * @param supportedPlatforms
     */

    public void setSupportedPlatforms(java.util.Collection<SupportedPlatform> supportedPlatforms) {
        if (supportedPlatforms == null) {
            this.supportedPlatforms = null;
            return;
        }

        this.supportedPlatforms = new com.amazonaws.internal.SdkInternalList<SupportedPlatform>(supportedPlatforms);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPlatforms(java.util.Collection)} or {@link #withSupportedPlatforms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedPlatforms
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withSupportedPlatforms(SupportedPlatform... supportedPlatforms) {
        if (this.supportedPlatforms == null) {
            setSupportedPlatforms(new com.amazonaws.internal.SdkInternalList<SupportedPlatform>(supportedPlatforms.length));
        }
        for (SupportedPlatform ele : supportedPlatforms) {
            this.supportedPlatforms.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param supportedPlatforms
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withSupportedPlatforms(java.util.Collection<SupportedPlatform> supportedPlatforms) {
        setSupportedPlatforms(supportedPlatforms);
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
        if (getSupportedPlatforms() != null)
            sb.append("SupportedPlatforms: ").append(getSupportedPlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityZone == false)
            return false;
        AvailabilityZone other = (AvailabilityZone) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSupportedPlatforms() == null ^ this.getSupportedPlatforms() == null)
            return false;
        if (other.getSupportedPlatforms() != null && other.getSupportedPlatforms().equals(this.getSupportedPlatforms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSupportedPlatforms() == null) ? 0 : getSupportedPlatforms().hashCode());
        return hashCode;
    }

    @Override
    public AvailabilityZone clone() {
        try {
            return (AvailabilityZone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
