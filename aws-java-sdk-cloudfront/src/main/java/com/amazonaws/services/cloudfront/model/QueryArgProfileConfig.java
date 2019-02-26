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

/**
 * <p>
 * Configuration for query argument-profile mapping for field-level encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/QueryArgProfileConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryArgProfileConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level
     * encryption query argument, fle-profile, is unknown.
     * </p>
     */
    private Boolean forwardWhenQueryArgProfileIsUnknown;
    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level encryption.
     * </p>
     */
    private QueryArgProfiles queryArgProfiles;

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level
     * encryption query argument, fle-profile, is unknown.
     * </p>
     * 
     * @param forwardWhenQueryArgProfileIsUnknown
     *        Flag to set if you want a request to be forwarded to the origin even if the profile specified by the
     *        field-level encryption query argument, fle-profile, is unknown.
     */

    public void setForwardWhenQueryArgProfileIsUnknown(Boolean forwardWhenQueryArgProfileIsUnknown) {
        this.forwardWhenQueryArgProfileIsUnknown = forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level
     * encryption query argument, fle-profile, is unknown.
     * </p>
     * 
     * @return Flag to set if you want a request to be forwarded to the origin even if the profile specified by the
     *         field-level encryption query argument, fle-profile, is unknown.
     */

    public Boolean getForwardWhenQueryArgProfileIsUnknown() {
        return this.forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level
     * encryption query argument, fle-profile, is unknown.
     * </p>
     * 
     * @param forwardWhenQueryArgProfileIsUnknown
     *        Flag to set if you want a request to be forwarded to the origin even if the profile specified by the
     *        field-level encryption query argument, fle-profile, is unknown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryArgProfileConfig withForwardWhenQueryArgProfileIsUnknown(Boolean forwardWhenQueryArgProfileIsUnknown) {
        setForwardWhenQueryArgProfileIsUnknown(forwardWhenQueryArgProfileIsUnknown);
        return this;
    }

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level
     * encryption query argument, fle-profile, is unknown.
     * </p>
     * 
     * @return Flag to set if you want a request to be forwarded to the origin even if the profile specified by the
     *         field-level encryption query argument, fle-profile, is unknown.
     */

    public Boolean isForwardWhenQueryArgProfileIsUnknown() {
        return this.forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level encryption.
     * </p>
     * 
     * @param queryArgProfiles
     *        Profiles specified for query argument-profile mapping for field-level encryption.
     */

    public void setQueryArgProfiles(QueryArgProfiles queryArgProfiles) {
        this.queryArgProfiles = queryArgProfiles;
    }

    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level encryption.
     * </p>
     * 
     * @return Profiles specified for query argument-profile mapping for field-level encryption.
     */

    public QueryArgProfiles getQueryArgProfiles() {
        return this.queryArgProfiles;
    }

    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level encryption.
     * </p>
     * 
     * @param queryArgProfiles
     *        Profiles specified for query argument-profile mapping for field-level encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryArgProfileConfig withQueryArgProfiles(QueryArgProfiles queryArgProfiles) {
        setQueryArgProfiles(queryArgProfiles);
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
        if (getForwardWhenQueryArgProfileIsUnknown() != null)
            sb.append("ForwardWhenQueryArgProfileIsUnknown: ").append(getForwardWhenQueryArgProfileIsUnknown()).append(",");
        if (getQueryArgProfiles() != null)
            sb.append("QueryArgProfiles: ").append(getQueryArgProfiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryArgProfileConfig == false)
            return false;
        QueryArgProfileConfig other = (QueryArgProfileConfig) obj;
        if (other.getForwardWhenQueryArgProfileIsUnknown() == null ^ this.getForwardWhenQueryArgProfileIsUnknown() == null)
            return false;
        if (other.getForwardWhenQueryArgProfileIsUnknown() != null
                && other.getForwardWhenQueryArgProfileIsUnknown().equals(this.getForwardWhenQueryArgProfileIsUnknown()) == false)
            return false;
        if (other.getQueryArgProfiles() == null ^ this.getQueryArgProfiles() == null)
            return false;
        if (other.getQueryArgProfiles() != null && other.getQueryArgProfiles().equals(this.getQueryArgProfiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForwardWhenQueryArgProfileIsUnknown() == null) ? 0 : getForwardWhenQueryArgProfileIsUnknown().hashCode());
        hashCode = prime * hashCode + ((getQueryArgProfiles() == null) ? 0 : getQueryArgProfiles().hashCode());
        return hashCode;
    }

    @Override
    public QueryArgProfileConfig clone() {
        try {
            return (QueryArgProfileConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
