/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdatePlaybackRestrictionPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePlaybackRestrictionPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     */
    private java.util.List<String> allowedCountries;
    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     */
    private java.util.List<String> allowedOrigins;
    /**
     * <p>
     * ARN of the playback-restriction-policy to be updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     */
    private Boolean enableStrictOriginEnforcement;
    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * 
     * @return A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *         <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *         countries (an empty array).
     */

    public java.util.List<String> getAllowedCountries() {
        return allowedCountries;
    }

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * 
     * @param allowedCountries
     *        A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *        <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *        countries (an empty array).
     */

    public void setAllowedCountries(java.util.Collection<String> allowedCountries) {
        if (allowedCountries == null) {
            this.allowedCountries = null;
            return;
        }

        this.allowedCountries = new java.util.ArrayList<String>(allowedCountries);
    }

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedCountries(java.util.Collection)} or {@link #withAllowedCountries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param allowedCountries
     *        A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *        <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *        countries (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaybackRestrictionPolicyRequest withAllowedCountries(String... allowedCountries) {
        if (this.allowedCountries == null) {
            setAllowedCountries(new java.util.ArrayList<String>(allowedCountries.length));
        }
        for (String ele : allowedCountries) {
            this.allowedCountries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of country codes that control geoblocking restriction. Allowed values are the officially assigned <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All countries (an
     * empty array).
     * </p>
     * 
     * @param allowedCountries
     *        A list of country codes that control geoblocking restriction. Allowed values are the officially assigned
     *        <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> codes. Default: All
     *        countries (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaybackRestrictionPolicyRequest withAllowedCountries(java.util.Collection<String> allowedCountries) {
        setAllowedCountries(allowedCountries);
        return this;
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * 
     * @return A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *         Origin header defined at <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:
     *         //developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     */

    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * 
     * @param allowedOrigins
     *        A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *        Origin header defined at <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:/
     *        /developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     */

    public void setAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        if (allowedOrigins == null) {
            this.allowedOrigins = null;
            return;
        }

        this.allowedOrigins = new java.util.ArrayList<String>(allowedOrigins);
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOrigins(java.util.Collection)} or {@link #withAllowedOrigins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedOrigins
     *        A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *        Origin header defined at <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:/
     *        /developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaybackRestrictionPolicyRequest withAllowedOrigins(String... allowedOrigins) {
        if (this.allowedOrigins == null) {
            setAllowedOrigins(new java.util.ArrayList<String>(allowedOrigins.length));
        }
        for (String ele : allowedOrigins) {
            this.allowedOrigins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the Origin
     * header defined at <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https://developer.mozilla
     * .org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * </p>
     * 
     * @param allowedOrigins
     *        A list of origin sites that control CORS restriction. Allowed values are the same as valid values of the
     *        Origin header defined at <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin">https:/
     *        /developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin</a>. Default: All origins (an empty array).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaybackRestrictionPolicyRequest withAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        setAllowedOrigins(allowedOrigins);
        return this;
    }

    /**
     * <p>
     * ARN of the playback-restriction-policy to be updated.
     * </p>
     * 
     * @param arn
     *        ARN of the playback-restriction-policy to be updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the playback-restriction-policy to be updated.
     * </p>
     * 
     * @return ARN of the playback-restriction-policy to be updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the playback-restriction-policy to be updated.
     * </p>
     * 
     * @param arn
     *        ARN of the playback-restriction-policy to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaybackRestrictionPolicyRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @param enableStrictOriginEnforcement
     *        Whether channel playback is constrained by origin site. Default: <code>false</code>.
     */

    public void setEnableStrictOriginEnforcement(Boolean enableStrictOriginEnforcement) {
        this.enableStrictOriginEnforcement = enableStrictOriginEnforcement;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether channel playback is constrained by origin site. Default: <code>false</code>.
     */

    public Boolean getEnableStrictOriginEnforcement() {
        return this.enableStrictOriginEnforcement;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @param enableStrictOriginEnforcement
     *        Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaybackRestrictionPolicyRequest withEnableStrictOriginEnforcement(Boolean enableStrictOriginEnforcement) {
        setEnableStrictOriginEnforcement(enableStrictOriginEnforcement);
        return this;
    }

    /**
     * <p>
     * Whether channel playback is constrained by origin site. Default: <code>false</code>.
     * </p>
     * 
     * @return Whether channel playback is constrained by origin site. Default: <code>false</code>.
     */

    public Boolean isEnableStrictOriginEnforcement() {
        return this.enableStrictOriginEnforcement;
    }

    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Playback-restriction-policy name. The value does not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     * 
     * @return Playback-restriction-policy name. The value does not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Playback-restriction-policy name. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        Playback-restriction-policy name. The value does not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaybackRestrictionPolicyRequest withName(String name) {
        setName(name);
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
        if (getAllowedCountries() != null)
            sb.append("AllowedCountries: ").append(getAllowedCountries()).append(",");
        if (getAllowedOrigins() != null)
            sb.append("AllowedOrigins: ").append(getAllowedOrigins()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getEnableStrictOriginEnforcement() != null)
            sb.append("EnableStrictOriginEnforcement: ").append(getEnableStrictOriginEnforcement()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePlaybackRestrictionPolicyRequest == false)
            return false;
        UpdatePlaybackRestrictionPolicyRequest other = (UpdatePlaybackRestrictionPolicyRequest) obj;
        if (other.getAllowedCountries() == null ^ this.getAllowedCountries() == null)
            return false;
        if (other.getAllowedCountries() != null && other.getAllowedCountries().equals(this.getAllowedCountries()) == false)
            return false;
        if (other.getAllowedOrigins() == null ^ this.getAllowedOrigins() == null)
            return false;
        if (other.getAllowedOrigins() != null && other.getAllowedOrigins().equals(this.getAllowedOrigins()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEnableStrictOriginEnforcement() == null ^ this.getEnableStrictOriginEnforcement() == null)
            return false;
        if (other.getEnableStrictOriginEnforcement() != null
                && other.getEnableStrictOriginEnforcement().equals(this.getEnableStrictOriginEnforcement()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedCountries() == null) ? 0 : getAllowedCountries().hashCode());
        hashCode = prime * hashCode + ((getAllowedOrigins() == null) ? 0 : getAllowedOrigins().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEnableStrictOriginEnforcement() == null) ? 0 : getEnableStrictOriginEnforcement().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePlaybackRestrictionPolicyRequest clone() {
        return (UpdatePlaybackRestrictionPolicyRequest) super.clone();
    }

}
