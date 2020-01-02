/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/CreateHomeRegionControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHomeRegionControlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This object is the <code>HomeRegionControl</code> object that's returned by a successful call to
     * <code>CreateHomeRegionControl</code>.
     * </p>
     */
    private HomeRegionControl homeRegionControl;

    /**
     * <p>
     * This object is the <code>HomeRegionControl</code> object that's returned by a successful call to
     * <code>CreateHomeRegionControl</code>.
     * </p>
     * 
     * @param homeRegionControl
     *        This object is the <code>HomeRegionControl</code> object that's returned by a successful call to
     *        <code>CreateHomeRegionControl</code>.
     */

    public void setHomeRegionControl(HomeRegionControl homeRegionControl) {
        this.homeRegionControl = homeRegionControl;
    }

    /**
     * <p>
     * This object is the <code>HomeRegionControl</code> object that's returned by a successful call to
     * <code>CreateHomeRegionControl</code>.
     * </p>
     * 
     * @return This object is the <code>HomeRegionControl</code> object that's returned by a successful call to
     *         <code>CreateHomeRegionControl</code>.
     */

    public HomeRegionControl getHomeRegionControl() {
        return this.homeRegionControl;
    }

    /**
     * <p>
     * This object is the <code>HomeRegionControl</code> object that's returned by a successful call to
     * <code>CreateHomeRegionControl</code>.
     * </p>
     * 
     * @param homeRegionControl
     *        This object is the <code>HomeRegionControl</code> object that's returned by a successful call to
     *        <code>CreateHomeRegionControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHomeRegionControlResult withHomeRegionControl(HomeRegionControl homeRegionControl) {
        setHomeRegionControl(homeRegionControl);
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
        if (getHomeRegionControl() != null)
            sb.append("HomeRegionControl: ").append(getHomeRegionControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHomeRegionControlResult == false)
            return false;
        CreateHomeRegionControlResult other = (CreateHomeRegionControlResult) obj;
        if (other.getHomeRegionControl() == null ^ this.getHomeRegionControl() == null)
            return false;
        if (other.getHomeRegionControl() != null && other.getHomeRegionControl().equals(this.getHomeRegionControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHomeRegionControl() == null) ? 0 : getHomeRegionControl().hashCode());
        return hashCode;
    }

    @Override
    public CreateHomeRegionControlResult clone() {
        try {
            return (CreateHomeRegionControlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
